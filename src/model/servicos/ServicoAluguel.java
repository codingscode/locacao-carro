package model.servicos;

import model.entidades.CarroAluguel;
import model.entidades.NotaPagamento;

public class ServicoAluguel {
     private Double precodia;
     private Double precohora;
     
     private Taxa taxaservico;

	public ServicoAluguel(Double precohora, Double precodia, Taxa taxaservico) {
		this.precohora = precohora;
		this.precodia = precodia;
		this.taxaservico = taxaservico;
	}
     
    public void ProcessoNotapagamento(CarroAluguel carroaluguel) {
    	long t1 = carroaluguel.getInicio().getTime();
    	long t2 = carroaluguel.getFim().getTime();
    	double horas = (double)(t2 - t1)/1000/60/60;
    	
    	double pagbasico;
    	if(horas <= 12.0) {
    		pagbasico = Math.ceil(horas)*precohora;
    	}
    	else {
    		pagbasico = Math.ceil(horas/24)*precodia;
    	}
    	
    	double imposto = taxaservico.imposto(pagbasico);
    	carroaluguel.setNotapagamento(new NotaPagamento(pagbasico, imposto));
    }
}
