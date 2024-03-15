package guardias.recreo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Guardias {
	private int fecha;
	private String idProfesor;
	private String DescripcionZona;
	private int numZona;
	
	
	
	
	public Guardias(int fecha, String rutaArch) {
		try {
            BufferedReader bfr = new BufferedReader(new FileReader(rutaArch));
            String valores;
            while ((valores = bfr.readLine()) != null) {       
                   List<String> valoresArray = new ArrayList<>();
                    valoresArray.addAll(Arrays.asList(valores.trim().split(",")));// ESTA MAL
            }
            bfr.close(); // Es buena práctica cerrar el BufferedReader
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		this.fecha=fecha;
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


	public void setFecha(int fecha) {
		this.fecha = fecha;
	}


	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}


	public void setDescripcionZona(String descripcionZona) {
		DescripcionZona = descripcionZona;
	}


	public void setNumZona(int numZona) {
		this.numZona = numZona;
	}
	
	
}
