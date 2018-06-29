import java.util.List;
import java.util.Scanner;

public class CadastrarVeiculo {
	Scanner scanner = new Scanner(System.in);
	private Padronizar padronizar = new Padronizar();
	
	public List<Veiculo> Cadastrar(List<Veiculo> listaVeiculos) {
		int tipo = padronizar.Tipo();
		
		if (tipo == 1) {
			listaVeiculos.add(this.moto(tipo));
		} else if (tipo == 2) {
			listaVeiculos.add(this.carro(tipo));
		} else if (tipo == 3) {
			listaVeiculos.add(this.caminhao(tipo));
		} else {
			System.out.println("Op��o invalida, selecione uma op��o de 1 a 3!");
			this.Cadastrar(listaVeiculos);
		}
		
		int opcao = padronizar.Opcao("Ve�culo cadastrado com sucesso, deseja cadastrar outro? 1- Sim | 2 - N�o");
		
		if (opcao == 1) {
			this.Cadastrar(listaVeiculos);
		}
		
		return listaVeiculos;
	}
	
	private Veiculo moto(int tipo) {
		System.out.println("Modelo: ");
		String modelo = scanner.next();
		
		int cilindradas = padronizar.Cilindradas();
		int ano = padronizar.Ano();
		String placa = padronizar.Placa();
		double valor = padronizar.Valor();
		
		Moto moto = new Moto();
		moto.modelo = modelo;
		moto.ano = ano;
		moto.placa = placa;
		moto.valor = valor;
		moto.tipo = tipo;
		moto.cilindradas = cilindradas;
		
		return moto;
	}
	
	private Veiculo carro(int tipo) {
		System.out.println("Modelo: ");
		String modelo = scanner.next();
		
		int ano = padronizar.Ano();
		String placa = padronizar.Placa();
		double valor = padronizar.Valor();
		
		Veiculo veiculo = new Veiculo();
		veiculo.modelo = modelo;
		veiculo.ano = ano;
		veiculo.placa = placa;
		veiculo.valor = valor;
		veiculo.tipo = tipo;
		
		return veiculo;
	}
	
	private Veiculo caminhao(int tipo) {
		System.out.println("Modelo: ");
		String modelo = scanner.next();
		
		int qtdeEixos= padronizar.Eixos();
		int ano = padronizar.Ano();
		String placa = padronizar.Placa();
		double valor = padronizar.Valor();
		
		Caminhao caminhao = new Caminhao();
		caminhao.modelo = modelo;
		caminhao.ano = ano;
		caminhao.placa = placa;
		caminhao.valor = valor;
		caminhao.tipo = tipo;
		caminhao.qtdeEixos = qtdeEixos;
		
		return caminhao;
	}

}
