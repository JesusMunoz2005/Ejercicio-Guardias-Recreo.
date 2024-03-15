package guardias.recreo;

import java.util.HashMap;
import java.util.Map;

public class Zona {
    private static final Map<Integer, String> relacionZona = new HashMap<>();
    private static final Map<Integer, Integer> profesoresPorZona = new HashMap<>();
    private final int numZona;
    private final String descZona;
    private static boolean zonasCreadas = false;

    public static void generarZonas() {
    	zonasCreadas = true;
    
        relacionZona.put(1, "Zona: 1- Escaleras de entrada");
        relacionZona.put(2, "Zona: 2- Pasillo Garita 1");
        relacionZona.put(3, "Zona: 3- Patio de los Limones");
        relacionZona.put(4, "Zona: 4- Pasillo entre edif 1 y 2");
        relacionZona.put(5, "Zona: 5- Patio Naranjos");

        profesoresPorZona.put(1, 1);
        profesoresPorZona.put(2, 1);
        profesoresPorZona.put(3, 1);
        profesoresPorZona.put(4, 1);
        profesoresPorZona.put(5, 2);
    }

    public Zona(int zona) {
    	
    	if(!zonasCreadas) //CREA LOS MAPAS AL CREAR LA PRIMERA INSTANCIA
    		Zona.generarZonas();
    	
        if (relacionZona.containsKey(zona)) {
            this.numZona = zona;
            this.descZona = relacionZona.get(zona);
        } else {
            this.numZona = -1;
            this.descZona = "Zona no válida";
        }
    }

    // GETTER
    public String getDescripcionZona() {
        return this.descZona;
    }

    public int getNumZona() {
        return this.numZona;
    }

    public int getNumProfesores() {
        return profesoresPorZona.getOrDefault(numZona, -1);
    }
}
