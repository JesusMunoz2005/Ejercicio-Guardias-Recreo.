package guardias.recreo;
import java.util.HashMap;

public class Zona {
	private HashMap<Integer, String> relacionZona = new HashMap<Integer, String>();
	private Integer numZona;
	private String descZona;
	private int numProfesores;
	
	public Zona(Integer zona) {
		this.relacionZona.put(1, "Zona: 1- Escaleras de entrada");
		this.relacionZona.put(2, "Zona: 2- Pasillo Garita 1");
		this.relacionZona.put(3, "Zona: 3- Patio de los Limones");
		this.relacionZona.put(4, "Zona: 4- Pasillo entre edif 1 y 2");
		this.relacionZona.put(5, "Zona: 5- Patio Naranjos");
		
		switch (zona) {
		case 1:
			this.numZona = zona;
			this.descZona = this.relacionZona.get(zona);
			this.setNumProfesores(1);
			break;
		case 2:
			this.numZona = zona;
			this.descZona = this.relacionZona.get(zona);
			this.setNumProfesores(1);
			break;
			
		case 3:
			this.numZona = zona;
			this.descZona = this.relacionZona.get(zona);
			this.setNumProfesores(1);
			break;
			
		case 4:
			this.numZona = zona;
			this.descZona = this.relacionZona.get(zona);
			this.setNumProfesores(1);
			break;
			
		case 5:
			this.numZona = zona;
			this.descZona = this.relacionZona.get(zona);
			this.setNumProfesores(2);
			break;

		default:
			this.setNumProfesores(-1);
			break;
		}
	}

	
	
	//GETTER Y SETTER
	public String getDescripcionZona(){
		return this.descZona;
	}
	
	public int getNumZona() {
		return this.numZona;
	}
	
	public int getNumProfesores() {
		return numProfesores;
	}

	public void setNumProfesores(int numProfesores) {
		this.numProfesores = numProfesores;
	}
}
