import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ManipularTxt {
	public void Gravar(List<Veiculo> listaVeiculos) throws IOException {
		File file = new File("ListaVeiculos.txt");
		
		try {
			FileWriter arquivo = new FileWriter(file, true);
			
			for (int i = 0; i < listaVeiculos.size(); i++) {
				Veiculo veiculo = listaVeiculos.get(i);
				String formatoSalvar = veiculo.modelo + ";" + veiculo.ano + ";" + veiculo.placa + ";" + veiculo.valor + ";" + veiculo.tipo;
				
				if (veiculo.tipo == 1) {
					formatoSalvar += ";" + veiculo.GetCilindradas();
				} else if (veiculo.tipo == 3) {
					formatoSalvar += ";" + veiculo.GetQtdeEixos();
				}
				
				arquivo.write(formatoSalvar);
			}
			
			arquivo.close();
			System.out.println("Lista de veículos salva com sucesso!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
