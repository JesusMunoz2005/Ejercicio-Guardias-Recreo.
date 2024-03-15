package guardias.recreo;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ficheros {
	
	public void escribirFichero(HashMap<String, HashSet<Guardias>> mapa, String RutaFichero) {
		try{
			BufferedWriter out = new BufferedWriter(new FileWriter(RutaFichero));
			
			for(Map.Entry<String, HashSet<Guardias>> entrada : mapa.entrySet()) {
				String idProf = entrada.getKey();
				out.write(idProf+",");
				HashSet<Guardias> lista = entrada.getValue();
				
				for(Guardias g : lista) {
					out.write(g.getFecha()+",");
					out.write(g.getNumZona()+",");
				}
				out.write("\n");
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		}
	}

}
