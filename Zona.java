package guardias.recreo;
import java.util.HashMap;

public class Zona {
	private HashMap<Integer, String> relacionZona = new HashMap<Integer, String>();
	private int numProfesores;
	
	public Zona(int zona) {
		switch (zona) {
		case 1:
			this.relacionZona.put(1, "Zona: 1- Escaleras de entrada");
			this.setNumProfesores(1);
			break;
		case 2:
			this.relacionZona.put(2, "Zona: 2- Pasillo Garita 1");
			this.setNumProfesores(1);
			break;
			
		case 3:
			this.relacionZona.put(2, "Zona: 3- Pasillo de los limones");
			this.setNumProfesores(1);
			break;
			
		case 4:
			this.relacionZona.put(2, "Zona: 4- Pasillo entre edif 1 y 2");
			this.setNumProfesores(1);
			break;
			
		case 5:
			this.relacionZona.put(2, "Zona: 3- Patio Naranjos");
			this.setNumProfesores(2);
			break;

		default:
			this.setNumProfesores(-1);
			break;
		}
	}

	
	
	//GETTER Y SETTER
	public int getNumProfesores() {
		return numProfesores;
	}

	public void setNumProfesores(int numProfesores) {
		this.numProfesores = numProfesores;
	}
}
