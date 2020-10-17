package br.com.maratona.dev.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path(value = "/inscricao")
public class InscricaoMaratonaResource {

	public InscricaoHelper inscricaoHelper = new InscricaoHelper();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("lista/inscritos")
	public List<Pessoa> matricula() {
		inscricaoHelper.init();
		return inscricaoHelper.getPessoas();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("find/inscrito/{id}")
	public Response MatriculaPorId(@PathParam("id") String id) {
		Pessoa objetoRetorno = inscricaoHelper.findPessoa(new Integer(id));
		
		if(objetoRetorno != null) {
			return Response.status(Status.OK).entity(objetoRetorno).build();
		}
		return Response.status(Status.NO_CONTENT).build();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("incluir/inscrito/")
	public Response incluir(Pessoa pessoa) {
		inscricaoHelper.init();
		pessoa.setMatricula(inscricaoHelper.getPessoas().size() + 1);
		inscricaoHelper.getPessoas().add(pessoa);
		return Response.status(Status.CREATED).entity("Cadastrado com sucesso!").build();
	}

	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("remover/inscrito/{id}")
	public Response removerPorId(@PathParam("id") String id) {
		inscricaoHelper.init();
		Pessoa remove = null;
		for (Pessoa indice : inscricaoHelper.getPessoas()) {
			if (indice.getMatricula().equals(new Integer(id))) {
				remove = indice;
			}

			if (inscricaoHelper.getPessoas().remove(remove)) {
				return Response.status(Status.OK).entity("REMOVIDO COM SUCESSO!").build();
			}

		}
		return Response.status(Status.NO_CONTENT).build();
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("alterar/inscrito/")
	public Response alterar(Pessoa pessoa) {
		inscricaoHelper.init();

		Pessoa pessoaEdit = null;
		for (Pessoa indice : inscricaoHelper.getPessoas()) {
			if (indice.getMatricula().equals(pessoa.getMatricula())) {
				pessoaEdit = indice;
			}
		}

		if (pessoaEdit != null) {
			pessoaEdit.setNome(pessoa.getNome());
			return Response.status(Status.OK).entity(pessoaEdit).build();
		} else {
			return Response.status(Status.NO_CONTENT).build();
		}

	}
}
