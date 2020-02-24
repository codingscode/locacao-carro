package model.entidades;

public class NotaPagamento {
    private Double pagbasico;
    private Double tributo;
	
    public NotaPagamento() {
    }

	public NotaPagamento(Double pagbasico, Double tributo) {
		this.pagbasico = pagbasico;
		this.tributo = tributo;
	}

	public Double getPagbasico() {
		return pagbasico;
	}

	public void setPagbasico(Double pagbasico) {
		this.pagbasico = pagbasico;
	}

	public Double getTributo() {
		return tributo;
	}

	public void setTributo(Double tributo) {
		this.tributo = tributo;
	}
	
    public Double getTotal() {
    	return getPagbasico() + getTributo();
    }
}
