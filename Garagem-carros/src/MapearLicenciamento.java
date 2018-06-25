import java.util.ArrayList;
import java.util.List;

public class MapearLicenciamento {
	public void Mapear(List<Veiculo> listaVeiculos) {
		List<Veiculo> abril = new ArrayList<Veiculo>();
		List<Veiculo> maio = new ArrayList<Veiculo>();
		List<Veiculo> junho = new ArrayList<Veiculo>();
		List<Veiculo> julho = new ArrayList<Veiculo>();
		List<Veiculo> agosto = new ArrayList<Veiculo>();
		List<Veiculo> setembro = new ArrayList<Veiculo>();
		List<Veiculo> outubro = new ArrayList<Veiculo>();
		List<Veiculo> novembro = new ArrayList<Veiculo>();
		List<Veiculo> dezembro = new ArrayList<Veiculo>();
		
		for (int i = 0; i < listaVeiculos.size(); i++) {
			Veiculo veiculo = listaVeiculos.get(i);
			String placa = veiculo.placa;
			String finalPlaca = placa.substring(placa.length() - 1, placa.length());
			
			switch(finalPlaca) {
				case "1":
					abril.add(veiculo);
					break;
					
				case "2":
					maio.add(veiculo);
					break;
					
				case "3":
					junho.add(veiculo);
					break;
					
				case "4":
					julho.add(veiculo);
					break;
					
				case "5":
				case "6":
					agosto.add(veiculo);
					break;
					
				case "7":
					setembro.add(veiculo);
					break;
					
				case "8":
					outubro.add(veiculo);
					break;
					
				case "9":
					novembro.add(veiculo);
					break;
					
				case "0":
					dezembro.add(veiculo);
					break;
					
			}
		}
		
		this.ImprimirListaMes(abril, "Abril");
		this.ImprimirListaMes(maio, "Maio");
		this.ImprimirListaMes(junho, "Junho");
		this.ImprimirListaMes(julho, "Julho");
		this.ImprimirListaMes(agosto, "Agosto");
		this.ImprimirListaMes(setembro, "Setembro");
		this.ImprimirListaMes(outubro, "Outubro");
		this.ImprimirListaMes(novembro, "Novembro");
		this.ImprimirListaMes(dezembro, "Dezembro");
	}
	
	private void ImprimirListaMes(List<Veiculo> listaPorMes, String nomeMes) {
		if (listaPorMes.size() > 0) {
			System.out.println("Imprimindo os veículos com licenciamento para o Mês de " + nomeMes);
			
			for (int i = 0; i < listaPorMes.size(); i++) {
				System.out.println(listaPorMes.get(i).modelo);
			}
			
		} else {
			System.out.println("Não existem veículos com licenciamento para o mês de " + nomeMes);
		}
	}
}
