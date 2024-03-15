package guardias.recreo;

import java.io.FileWriter;

public class Guardias {

	private int fecha;
	private String idProfesor;
	private String DescripcionZona;
	private int numZona;
	
	public Guardias(Profesor profesor, Zona zona, int fecha) {
		this.fecha=fecha;
		this.idProfesor=profesor.getId();
		this.DescripcionZona=zona.getDescripcionZona();
		this.numZona=zona.getNumZona();
	}
	
	
	/*
	public void AsignacionGuardias() {
		
		 try {
	            FileWriter writer = new FileWriter(nombreArchivo);
	            for (Guardias guardia : guardiasList) {
	                writer.write(guardia.getIdProfesor() + ", ");
	                writer.write(guardia.getFecha() + ", ");
	                writer.write(guardia.getNumZona() + ", ");
	                writer.write(guardia.getDescripcionZona() +"\n");
	            }
	            writer.close();
	            System.out.println("Asignación de guardias guardada en el archivo: " + nombreArchivo);
	        } catch (IOException e) {
	            System.out.println("Error al escribir en el archivo: " + e.getMessage());
	        }
		
	}
*/

	public int getFecha() {
		return fecha;
	}


	public String getIdProfesor() {
		return idProfesor;
	}


	public String getDescripcionZona() {
		return DescripcionZona;
	}


	public int getNumZona() {
		return numZona;
	}
	
	
}


