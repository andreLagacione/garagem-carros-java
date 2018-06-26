import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Padronizar {
	Scanner scanner = new Scanner(System.in);
	
	public int Tipo() {
		System.out.println("Informe um tipo:");
		System.out.println("1 - Motos");
		System.out.println("2 - Carros");
		System.out.println("3 - Caminhões");
		String valor = scanner.next();
		int tipo = this.ParseToInt(valor, 0);

		if (tipo <= 0) {
			System.out.println("O tipo informado não é valido!");
			this.Tipo();
		}
		
		return tipo;
	}
	
	public int Cilindradas() {
		System.out.println("Informe as cilindradas: ");
		String valor = scanner.next();
		int cilindradas = this.ParseToInt(valor, 0);
		
		if (cilindradas <= 0) {
			System.out.println("As cilindradas informadas não são validas!");
			this.Cilindradas();
		}
		
		return cilindradas;
	}
	
	public int Ano() {
		Calendar calendar = Calendar.getInstance();
		int anoMaximo = calendar.get(Calendar.YEAR) + 1;
		
		System.out.println("Informe o ano: ");
		String valor = scanner.next();
		int ano = this.ParseToInt(valor, 0);
		
		if (ano <= 0 || ano < 1800 || ano > anoMaximo) {
			System.out.println("O ano informado não é valido!");
			this.Ano();
		}
		
		return ano;
	}
	
	public String Placa() {
		Pattern regexp = Pattern.compile("[aA-zZ]{3}-[0-9]{4}");
		System.out.println("Informe a placa: ");
		String placa = scanner.next();
		Matcher placaValida = regexp.matcher(placa);
		
		if (!placaValida.find()) {
			System.out.println("A placa informada não é valida!");
			this.Placa();
		}
		
		return placa.toUpperCase();
	}
	
	public double Valor() {
		System.out.println("informe o valor: ");
		String valor = scanner.next();
		double valorFinal = this.ParseToDouble(valor, 0);
		
		if (valorFinal <= 0) {
			System.out.println("O valor informado não é valido!");
			this.Valor();
		}
		
		return valorFinal;
	}
	
	public int Eixos() {
		System.out.println("Informe a quantidade de eixos: ");
		String valor = scanner.next();
		int qtdeEixos = this.ParseToInt(valor, 0);
		
		if (qtdeEixos <= 0) {
			System.out.println("A quantidade de eixos informada não é valida!");
			this.Eixos();
		}
		
		return qtdeEixos;
	}
	
	public int Opcao(String mensagem) {
		System.out.println(mensagem);
		String valor = scanner.next();
		int opcao = this.ParseToInt(valor, 0);
		
		if (opcao <= 0 && opcao > 2) {
			System.out.println("A opção informada não é valida!");
			this.Opcao(mensagem);
		}
		
		return opcao;
	}
	
	public int OpcaoInicial() {
		System.out.println("Selecione uma opção: ");
		String valor = scanner.next();
		int opcao = this.ParseToInt(valor, 0);
		
		if (opcao <= 0) {
			System.out.println("A opção selecionada não é valida!");
			this.OpcaoInicial();
		}
		
		return opcao;
	}
	
	private int ParseToInt(String valor, int base) {
		try {
			return Integer.parseInt(valor);
		} catch (NumberFormatException e) {
			return base;
		}
	}
	
	private double ParseToDouble(String valor, double base) {
		try {
			return Double.parseDouble(valor);
		} catch (NumberFormatException e) {
			return base;
		}
	}
}
