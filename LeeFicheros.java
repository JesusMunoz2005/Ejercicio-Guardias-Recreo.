package guardias.recreo;

public class LeeFicheros {
	public static void main (String [] args) {
		LeeHistorico carga = new LeeHistorico("C:\\pruebaficheros\\Libro1.csv");
		System.out.println(carga.getHistorico());
	}
}
