package br.com.maratona.dev;

public enum EnumStatusConta {
	
	 ATIVO(1, "ATIVO"),
	 INATIVO(2, "INATIVO");
	
	private String descricao;
	private Integer codigo;
	
	private EnumStatusConta( Integer codigo, String descricao) {
		this.descricao = descricao;
		this.codigo = codigo;
	}

	
	//GETTERS & SETTERS
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	
}