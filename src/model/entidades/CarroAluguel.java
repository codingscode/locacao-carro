package model.entidades;

import java.util.Date;

public class CarroAluguel {
     private Date inicio;
     private Date fim;
     
     private Veiculo veiculo;
     private NotaPagamento notapagamento;
     
     public CarroAluguel() {
     }

	public CarroAluguel(Date inicio, Date fim, Veiculo veiculo) {
		this.inicio = inicio;
		this.fim = fim;
		this.veiculo = veiculo;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public NotaPagamento getNotapagamento() {
		return notapagamento;
	}

	public void setNotapagamento(NotaPagamento notapagamento) {
		this.notapagamento = notapagamento;
	}
     
}
