import java.util.List;
import java.util.Scanner;

public class AlterarVeiculo {
	Scanner scanner = new Scanner(System.in);
	Padronizar padronizar = new Padronizar();
	
	public List<Veiculo> Alterar(List<Veiculo> listaVeiculos) {
		String placaInformada = padronizar.Placa();
		
		Pesquisar pesquisar = new Pesquisar();
		int pesquisarPlaca = pesquisar.Placa(listaVeiculos, placaInformada);
		
		Boolean placaEncontrada = false;
		
		if (pesquisarPlaca != -1) {
			Veiculo veiculo = listaVeiculos.get(pesquisarPlaca);
			veiculo = this.AlterarVeiculoEncontrado(veiculo, listaVeiculos);
			placaEncontrada = true;
		}
		
		if (!placaEncontrada) {
			int opcao = padronizar.Opcao("Placa não encontrada. 1 - Buscar outra placa | 2 - Voltar ao menu.");
			
			if (opcao == 1) {
				this.Alterar(listaVeiculos);
			} else {
				return listaVeiculos;
			}
		} else {
			int opcaoSucesso = padronizar.Opcao("Veículo alterado com sucesso! 1 - Alterar outro veículo | 2 - Voltar ao menu.");
			
			if (opcaoSucesso == 1) {
				this.Alterar(listaVeiculos);
			}
		}
		
		return listaVeiculos;
	}
	
	private Veiculo AlterarVeiculoEncontrado(Veiculo veiculo, List<Veiculo> listaVeiculos) {
		String placa = "";
		int tipo = 0;
		int cilindradas = 0;
		int qtdeEixos = 0;
		String modelo = "";
		int ano = 0;
		double valor = 0;
		
		int alterarPlaca = padronizar.Opcao("Alterar a placa? 1 - Sim | 2 - Não");
		if (alterarPlaca == 1) {
			placa = this.AlterarPlaca(listaVeiculos);
			veiculo.placa = placa;
		}
		
		int alterarTipo = padronizar.Opcao("Alterar o tipo? 1 - Sim | 2 - Não");
		if (alterarTipo == 1) {
			tipo = padronizar.Tipo();
			veiculo.tipo = tipo;
		}
		
		if (tipo == 1) {
			int alterarCilindradas = padronizar.Opcao("Alterar as cilindradas? 1 - Sim | 2 - Não");
			if (alterarCilindradas == 1) {
				cilindradas = padronizar.Cilindradas();
			}
		} else if (tipo == 3) {
			int alerarQtdeEixos = padronizar.Opcao("Alterar a quantidade de eixos? 1 - Sim | 2 - Não");
			if (alerarQtdeEixos == 1) {
				qtdeEixos = padronizar.Eixos();
			}
		}
		
		int alterarModelo = padronizar.Opcao("Alterar o modelo? 1 - Sim | 2 - Não");
		if (alterarModelo == 1) {
			modelo = scanner.next();
			veiculo.modelo = modelo;
		}
		
		int alterarAno = padronizar.Opcao("Alterar o ano? 1 - Sim | 2 - Não");
		if (alterarAno == 1) {
			ano = padronizar.Ano();
			veiculo.ano = ano;
		}
		
		int alterarValor = padronizar.Opcao("Alterar o valor? 1 - Sim | 2 - Não");
		if (alterarValor == 0) {
			valor = padronizar.Valor();
			veiculo.valor = valor;
		}
		
		if (cilindradas != 0) {
			veiculo = this.AlterarMoto(veiculo, cilindradas);
		}
		
		if (qtdeEixos != 0) {
			veiculo = this.AlterarCaminhao(veiculo, qtdeEixos);
		}

		return veiculo;
	}
	
	private Veiculo AlterarMoto(Veiculo veiculo, int cilindradas) {
		Moto moto = new Moto();
		moto.modelo = veiculo.modelo;
		moto.ano = veiculo.ano;
		moto.placa = veiculo.placa;
		moto.valor = veiculo.valor;
		moto.tipo = veiculo.tipo;
		moto.cilindradas = cilindradas;
		
		return moto;
	}
	
	private Veiculo AlterarCaminhao(Veiculo veiculo, int qtdeEixos) {
		Caminhao caminhao = new Caminhao();
		caminhao.modelo = veiculo.modelo;
		caminhao.ano = veiculo.ano;
		caminhao.placa = veiculo.placa;
		caminhao.valor = veiculo.valor;
		caminhao.tipo = veiculo.tipo;
		caminhao.qtdeEixos = qtdeEixos;
		
		
		return caminhao;
	}
	
	private String AlterarPlaca(List<Veiculo> listaVeiculos) {
		String placa = padronizar.Placa();
		
		Pesquisar pesquisar = new Pesquisar();
		int pesquisarPlaca = pesquisar.Placa(listaVeiculos, placa);
		if (pesquisarPlaca != -1) {
			int opcao = padronizar.Opcao("Essa placa já está cadastrada para outro veículo! 1 - Informar outra placa | 2 - Não alterar a placa.");
			
			if (opcao != 1) {
				return "";
			} else {
				this.AlterarPlaca(listaVeiculos);
			}
		}
		
		return placa;
	}
}
