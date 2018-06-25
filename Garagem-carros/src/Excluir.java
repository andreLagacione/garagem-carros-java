import java.util.List;
import java.util.Scanner;

public class Excluir {
	Scanner scanner = new Scanner(System.in);
	Padronizar padronizar = new Padronizar();
	
	public List<Veiculo> Veiculo(List<Veiculo> listaVeiculos) {
		String placa = padronizar.Placa(); 
		Pesquisar pesquisar = new Pesquisar();
		int indicePlaca = pesquisar.Placa(listaVeiculos, placa);
		
		if (indicePlaca != -1) {
			Veiculo veiculo = listaVeiculos.get(indicePlaca);
			
			int confirmar = padronizar.Opcao("Você tem certeza que deseja excluir o veículo " + veiculo.modelo + ". 1 - Sim | 2- Não.");
			
			if (confirmar == 1) {
				listaVeiculos.remove(indicePlaca);
				int remover = padronizar.Opcao("Veículo removido com sucesso. 1 - Remover outro veículo | 2 - Voltar ao menu.");
				
				if (remover == 1) {
					this.Veiculo(listaVeiculos);
				}
			}
		} else {
			int retornar = padronizar.Opcao("Placa não encontrada. 1 - Pesquisar outra placa | 2 - Voltar ao menu.");
			
			if (retornar == 1) {
				this.Veiculo(listaVeiculos);
			}
		}
		
		return listaVeiculos;
	}
}
