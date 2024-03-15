package guardias.recreo;

import java.io.*;
import java.util.*;

public class LeeHistorico {
    private List<String> historico;
    private Map<String, List<String>> profGuard;
    public LeeHistorico(String ruta) {
    	this.profGuard = new HashMap<>();
        this.historico = new LinkedList<>();
        File rutaArch = new File(ruta);
        try {
            BufferedReader bfr = new BufferedReader(new FileReader(rutaArch));
            String valores;
            while ((valores = bfr.readLine()) != null) {
                if (!contieneLetrasDespuesComa(valores.trim().split(","))) {
                    this.historico.add(quitaPuntoComayComa(valores).trim()+'\n');
                }
            }
            bfr.close(); // Es buena práctica cerrar el BufferedReader
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String quitaPuntoComayComa(String valores) {
        String sinComas = valores.replaceAll(",", "");
        return sinComas.replaceAll(";", ",");
    }
    public String dameIdProf(String[] valores) {
    	StringBuilder rt = new StringBuilder();
    	for(String val:valores) {
    		for(int i = 0;i<val.length();i++) {
    			char valo = val.charAt(i);
    			if(Character.isLetter(valo)) {
    				if(valo!=',') {
    					rt.append(val);	
    				}
    			}
    		}
    	}
    	return rt.toString();
    }
    public static boolean contieneLetrasDespuesComa(String[] valores) {
        for (String valor : valores) {
            boolean comaEncontrada = false;
            for (int i = 0; i < valor.length(); i++) {
                char caracter = valor.charAt(i);
                if (caracter == ',') {
                    comaEncontrada = true;
                } else if (comaEncontrada && Character.isLetter(caracter)) {
                    return true;
                }
            }
        }
        return false;
    }
	List<String> getHistorico() {
		return historico;
	}
    
}