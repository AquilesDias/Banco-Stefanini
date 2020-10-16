package br.com.maratona.dev;

public class Conta {

	private Integer conta;
	private Integer agencia;
	private Double saldo;
	private EnumStatusConta status;
	private Long codigoPix;
	
	//Constructor
	public Conta() {}
	
	 
	//Methods
	public void sacar(Double valorSaque) { 
		this.saldo -= valorSaque;
	}
	
	public void depositar(Double valorDeposito) {
		this.saldo -= valorDeposito;
	}
	
	

	//GETTERS & SETTERS
	public Integer getConta() {
		return conta;
	}
	public void setConta(Integer conta) {
		this.conta = conta;
	}
	
    public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

		
	public EnumStatusConta getStatus() {
		return status;
	}
	public void setStatus(EnumStatusConta status) {
		this.status = status;
	}

	public Long getCodigoPix() {
		return codigoPix;
	}
	public void setCodigoPix(Long codigoPix) {
		this.codigoPix = codigoPix;
	}

	
}
