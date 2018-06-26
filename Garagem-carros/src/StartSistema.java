import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StartSistema {
	private List<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
	Scanner scanner = new Scanner(System.in);
	
	public void Start() {
		TelaInicial tela = new TelaInicial();
		 this.MapearOpcoes(tela.imprimirTela());
	}
	
	public void MapearOpcoes(int opcaoSelecionada) {
		switch(opcaoSelecionada) {
		 	case 1:
		 		CadastrarVeiculo cadastrarNovo = new CadastrarVeiculo();
		 		listaVeiculos = cadastrarNovo.Cadastrar();
		 		
		 		System.out.println("\n ================================================== \n");
		 		
		 		this.Start();
		 		break;
		 		
		 	case 2:
		 		AlterarVeiculo alterarVeiculo = new AlterarVeiculo();
		 		listaVeiculos = alterarVeiculo.Alterar(listaVeiculos);
		 		
		 		System.out.println("\n ================================================== \n");
		 		
		 		this.Start();
		 		break;
		 		
		 	case 3:
		 		Excluir excluir = new Excluir();
		 		listaVeiculos = excluir.Veiculo(listaVeiculos);
		 		
		 		System.out.println("\n ================================================== \n");
		 		
		 		this.Start();
		 		break;
		 		
		 	case 4:
		 		Pesquisar pesquisar = new Pesquisar();
		 		
		 		int totalMotos = pesquisar.TotalVeiculosPorTipo(listaVeiculos, 1);
		 		double valorTotalMotos = pesquisar.ValorTotalVeiculosPorTipo(listaVeiculos, 1);
		 		
		 		int totalCarros = pesquisar.TotalVeiculosPorTipo(listaVeiculos, 2);
		 		double valorTotalCarros = pesquisar.ValorTotalVeiculosPorTipo(listaVeiculos, 2);
		 		
		 		int totalCaminhoes = pesquisar.TotalVeiculosPorTipo(listaVeiculos, 3);
		 		double valorTotalCaminhoes = pesquisar.ValorTotalVeiculosPorTipo(listaVeiculos, 3);
		 		
		 		System.out.println("\n");
		 		System.out.println("A quantida de total de motos é: " + totalMotos);
		 		System.out.println("O valor total de todas as motos é: " + valorTotalMotos);
		 		
		 		System.out.println("\n");
		 		System.out.println("A quantidade total de carros é: " + totalCarros);
		 		System.out.println("o valor total de todos os carros é: " + valorTotalCarros);
		 		
		 		System.out.println("\n");
		 		System.out.println("A quantidade total de caminhões é: " + totalCaminhoes);
		 		System.out.println("O valor total de todos os caminhões é: " + valorTotalCaminhoes);
		 		
		 		System.out.println("\n");
		 		System.out.println("Pressione qualquer tecla para continuar.");
		 		String continuarOpcao4 = scanner.next();
		 		
		 		System.out.println("\n ================================================== \n");
		 		
		 		if (continuarOpcao4 != "") {
		 			this.Start();
		 		}
		 		
		 		break;
		 		
		 	case 5:
		 		System.out.println("Listar Motos ordenadas por cilindrada");
		 		Ordenar ordenarMotos = new Ordenar();
		 		
		 		ordenarMotos.MotosCilindradas(listaVeiculos);
		 		
		 		System.out.println("\n");
		 		System.out.println("Pressione qualquer tecla para continuar.");
		 		String continuarOpcao5 = scanner.next();
		 		
		 		System.out.println("\n ================================================== \n");
		 		
		 		if (continuarOpcao5 != "") {
		 			this.Start();
		 		}
		 		
		 		break;
		 		
		 	case 6:
		 		System.out.println("Listar Carros ordenados pelo Ano decrescente");
		 		Ordenar ordenarCarrosAno = new Ordenar();
		 		
		 		ordenarCarrosAno.VeiculosAnoDecrescente(listaVeiculos);
		 		
		 		System.out.println("\n");
		 		System.out.println("Pressione qualquer tecla para continuar.");
		 		String continuarOpcao6 = scanner.next();
		 		
		 		System.out.println("\n ================================================== \n");
		 		
		 		if (continuarOpcao6 != "") {
		 			this.Start();
		 		}
		 		
		 		break;
		 		
		 	case 7:
		 		System.out.println("Listar Caminhões ordenados pela quantidade de eixos");
		 		Ordenar ordenarCaminhoesEixo = new Ordenar();
		 		
		 		ordenarCaminhoesEixo.CaminhoesEixos(listaVeiculos);
		 		
		 		System.out.println("\n");
		 		System.out.println("Pressione qualquer tecla para continuar.");
		 		String continuarOpcao7 = scanner.next();
		 		
		 		System.out.println("\n ================================================== \n");
		 		
		 		if (continuarOpcao7 != "") {
		 			this.Start();
		 		}
		 		
		 		break;
		 		
		 	case 8:
		 		System.out.println("Listar veículos agrupados por mês de acordo com o prazo de renovação de licenciamento");
		 		MapearLicenciamento licenciamento = new MapearLicenciamento();
		 		
		 		licenciamento.Mapear(listaVeiculos);
		 		
		 		System.out.println("\n");
		 		System.out.println("Pressione qualquer tecla para continuar.");
		 		String continuarOpcao8 = scanner.next();
		 		
		 		System.out.println("\n ================================================== \n");
		 		
		 		if (continuarOpcao8 != "") {
		 			this.Start();
		 		}
		 		
		 		break;
		 		
		 	case 9:
		 		ManipularTxt salvar = new ManipularTxt();
				
		 		try {
					salvar.Gravar(listaVeiculos);
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("Houve algum erro ao salvar, por favor tente novamente em alguns instantes!");
					this.Start();
				}
		 		
		 		break;
		 }
	}
}
