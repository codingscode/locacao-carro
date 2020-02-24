package model.servicos;

public class TaxaServico implements Taxa {
     public double imposto(double quantidade) {
    	 if(quantidade <= 100.0) {
    		return quantidade*0.2;
    	 }
    	 else {
    		return quantidade*0.15;
    	 }
     }
}
