package tareaUno;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RegistroLibros {
    private Libro[] tabla;
    private int numLibrosRegistrados;
    private int capacidadMaxima;

    public RegistroLibros(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.tabla = new Libro[capacidadMaxima];
        this.numLibrosRegistrados = 0;
    }

    public boolean añadirLibro(String titu, String Autor) throws NumException {
        if (numLibrosRegistrados < capacidadMaxima) {
			Libro lib = new Libro(titu, Autor);
        	tabla[numLibrosRegistrados] = lib;
			numLibrosRegistrados++;
			return true;
        } else {
            System.out.println("No se pudo añadir el libro, el registro está lleno.");
            return false;
        }
    }

    public boolean buscaLibro(String titulo) {
        for (int i = 0; i < numLibrosRegistrados; i++) {
            if (tabla[i].getTitulo().equals(titulo)) {
                return true;
            }
        }
        return false;
    }

    public void cargarRegistroDesdeFichero(String nombreFichero) throws NumException {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            while ((linea = br.readLine()) != null && numLibrosRegistrados < capacidadMaxima) {
                //Split permite dividir el .ToString() en 2 subcadenas, usando el : como referencia para dividir
            	String[] datos = linea.trim().split(":");
            	//Usamos el trim para escribirlo en el formato solicitado, sin espacios
                //en datos 0 ira el titulo y en datos 1 ira el autor
            	añadirLibro(datos[0], datos[1]);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    public void cargarRegistroAfichero(String nombreFichero) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero, true))) {
            for (int i = 0; i < numLibrosRegistrados; i++) {
                bw.write(tabla[i].getTitulo() + ": " + tabla[i].getAutor());
                bw.newLine();
            }
           bw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }
}