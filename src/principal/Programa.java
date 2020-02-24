package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entidades.CarroAluguel;
import model.entidades.Veiculo;
import model.servicos.ServicoAluguel;
import model.servicos.TaxaServico;

public class Programa {

	public static void main(String[] args) throws ParseException {
		/*
		Digite a data da locação:
		Modelo de carro: Civic
		Entrega (dd/MM/yyyy hh:ss) : 15/06/2018 10:30
		Retorno (dd/MM/yyyy hh:ss) : 15/06/2018 14:40
		Digite o preço por hora: 10.00
		Digite o preço por dia: 130.00
		Nota de Pagamento:
		Pagamento base: 50.00
		Tributo: 10.00
		Pagamento total: 60.00
     
     		    
		Digite a data da locação:
		Modelo de carro: Civic
		Entrega (dd/MM/yyyy hh:ss) : 25/06/2018 10:30
		Retorno (dd/MM/yyyy hh:ss) : 27/06/2018 11:40
		Digite o preço por hora: 10.00
		Digite o preço por dia: 130.00
		Nota de Pagamento:
		Pagamento base: 390.00
		Tributo: 58.50
		Pagamento total: 448.50
        */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Entre com dados de locação: ");
		System.out.println("Modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.println("Recebimento (dd/MM/yyyy hh:ss): ");
		Date inicio = sdf.parse(sc.nextLine());
		System.out.println("Devolução (dd/MM/yyyy hh:ss): ");
		Date fim = sdf.parse(sc.nextLine());
		
		CarroAluguel ca = new CarroAluguel(inicio, fim, new Veiculo(modelo));
		
		System.out.println("Digite o preço por hora: ");
		double precohora = sc.nextDouble();
		System.out.println("Digite o preço por dia: ");
		double precodia = sc.nextDouble();
		
		ServicoAluguel servicoaluguel = new ServicoAluguel(precohora, precodia, new TaxaServico());
		
		servicoaluguel.ProcessoNotapagamento(ca);
		System.out.println("Nota de Pagamento: ");
		System.out.println("Pagamento base: " + ca.getNotapagamento().getPagbasico());
		System.out.println("Imposto: " + ca.getNotapagamento().getTributo());
		System.out.println("Pagamento total: " + ca.getNotapagamento().getTotal());
		
		sc.close();
	}

}
