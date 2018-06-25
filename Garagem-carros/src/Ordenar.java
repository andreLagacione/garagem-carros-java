import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenar {
	public void MotosCilindradas(List<Veiculo> listaVeiculos) {
		List<Moto> listaMotos = this.FiltrarMotos(listaVeiculos, 1);
		
		Collections.sort(listaMotos);
		
		for (int i = 0; i < listaMotos.size(); i++) {
			Moto moto = listaMotos.get(i);
			
			System.out.println("A moto " + moto.modelo + " tem " + moto.cilindradas + " cilindradas.");
		}
	}
	
	private List<Moto> FiltrarMotos(List<Veiculo> listaVeiculos, int tipo) {
		List<Moto> listaMotos = new ArrayList<Moto>();
		
		for (int i = 0; i < listaVeiculos.size(); i++) {
			Veiculo veiculo = listaVeiculos.get(i);
			
			if (veiculo.tipo == tipo) {
				Moto moto = new Moto();
				moto.modelo = veiculo.modelo;
				moto.ano = veiculo.ano;
				moto.placa = veiculo.placa;
				moto.valor = veiculo.valor;
				moto.tipo = veiculo.tipo;
				moto.cilindradas = veiculo.GetCilindradas();
				listaMotos.add(moto);
			}
		}
		
		return listaMotos;
	}
	
	public void VeiculosAnoDecrescente(List<Veiculo> listaVeiculos) {
		List<FiltroVeiculoAno> listaVeiculosAno = this.FiltrarVeiculos(listaVeiculos, 2);
		
		Collections.sort(listaVeiculosAno);
		
		for (int i = 0; i < listaVeiculosAno.size(); i++) {
			FiltroVeiculoAno veiculo = listaVeiculosAno.get(i);
			
			System.out.println("O carro " + veiculo.modelo + " é do ano de " + veiculo.ano + ".");
		}
	}
	
	private List<FiltroVeiculoAno> FiltrarVeiculos(List<Veiculo> listaVeiculos, int tipo) {
		List<FiltroVeiculoAno> listaVeiculosAno = new ArrayList<FiltroVeiculoAno>();
		
		for (int i = 0; i < listaVeiculos.size(); i++) {
			Veiculo veiculo = listaVeiculos.get(i);
			
			if (veiculo.tipo == tipo) {
				FiltroVeiculoAno veiculoAno = new FiltroVeiculoAno();
				veiculoAno.modelo = veiculo.modelo;
				veiculoAno.ano = veiculo.ano;
				veiculoAno.placa = veiculo.placa;
				veiculoAno.valor = veiculo.valor;
				veiculoAno.tipo = veiculo.tipo;
				listaVeiculosAno.add(veiculoAno);
			}
		}
		
		return listaVeiculosAno;
	}
	
	public void CaminhoesEixos(List<Veiculo> listaVeiculos) {
		List<Caminhao> listaCaminhoes = this.FiltrarCaminhoes(listaVeiculos, 3);
		
		Collections.sort(listaCaminhoes);
		
		for (int i = 0; i < listaCaminhoes.size(); i++) {
			Caminhao caminhao = listaCaminhoes.get(i);
			
			System.out.println("O caminhão " + caminhao.modelo + " tem " + caminhao.qtdeEixos + " eixos.");
		}
	}
	
	private List<Caminhao> FiltrarCaminhoes(List<Veiculo> listaVeiculos, int tipo) {
		List<Caminhao> listaCaminhoes = new ArrayList<Caminhao>();
		
		for (int i = 0; i < listaVeiculos.size(); i++) {
			Veiculo veiculo = listaVeiculos.get(i);
			
			if (veiculo.tipo == tipo) {
				Caminhao caminhao = new Caminhao();
				caminhao.modelo = veiculo.modelo;
				caminhao.ano = veiculo.ano;
				caminhao.placa = veiculo.placa;
				caminhao.valor = veiculo.valor;
				caminhao.tipo = veiculo.tipo;
				caminhao.qtdeEixos = veiculo.GetQtdeEixos();
				listaCaminhoes.add(caminhao);
			}
		}
		
		return listaCaminhoes;
	}
}
