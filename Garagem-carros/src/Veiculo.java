
public class Veiculo {
	public String modelo;
	public int ano;
	public String placa;
	public double valor;
	public int tipo;
	
	public int GetCilindradas() {
		Moto moto = new Moto();
		return moto.GetCilindradas();
	}
	
	public int GetQtdeEixos() {
		Caminhao caminhao = new Caminhao();
		return caminhao.GetQtdeEixos();
	}
}
