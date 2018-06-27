
public class Caminhao extends Veiculo implements Comparable<Caminhao> {
	public int qtdeEixos;
	
	public int GetQtdeEixos() {
		return this.qtdeEixos;
	}
	
	public void SetQtdeEixos(int qtdeEixos) {
		this.qtdeEixos = qtdeEixos;
	}

	@Override
	public int compareTo(Caminhao outroCaminhao) {
		if (this.qtdeEixos > outroCaminhao.qtdeEixos) {
			return -1;
		}
		
		if (this.qtdeEixos < outroCaminhao.qtdeEixos) {
			return 1;
		}
		
		return 0;
	}
}
