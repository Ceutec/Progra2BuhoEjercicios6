/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios6;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Evaluar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pelicula> peliculas1 = new ArrayList<>();
        peliculas1.add(new Pelicula("Titanic", "Un barco se hunde", 120));
        peliculas1.add(new Pelicula("Rapido y furioso", "Carreras de carros", 90));
        peliculas1.add(new Pelicula("El rey leon", "Un clasico", 100));
        
        ArrayList<Pelicula> peliculas2 = new ArrayList<>();
        peliculas2.add(new Pelicula("P1", "D1", 80));
        peliculas2.add(new Pelicula("P2", "D2", 90));
        
        Ejercicios.guardar("archivo1.txt", peliculas1);
        Ejercicios.guardar("archivo2.txt", peliculas2);
        
        ArrayList<Pelicula> peliculas_lectura1 = Ejercicios.abrir("archivo1.txt");
        ArrayList<Pelicula> peliculas_lectura2 = Ejercicios.abrir("archivo2.txt");
        
        System.out.print("guardar y abrir: ");
        if(peliculas_lectura1 != null
                && peliculas_lectura2 != null
                && peliculas_lectura1.size() == 3
                && peliculas_lectura2.size() == 2
                && peliculas_lectura1.get(0).nombre.equals("Titanic")
                && peliculas_lectura1.get(0).descripcion.equals("Un barco se hunde")
                && peliculas_lectura1.get(0).duracion == 120
                && peliculas_lectura1.get(1).nombre.equals("Rapido y furioso")
                && peliculas_lectura1.get(1).descripcion.equals("Carreras de carros")
                && peliculas_lectura1.get(1).duracion == 90
                && peliculas_lectura1.get(2).nombre.equals("El rey leon")
                && peliculas_lectura1.get(2).descripcion.equals("Un clasico")
                && peliculas_lectura1.get(2).duracion == 100
                && peliculas_lectura2.get(0).nombre.equals("P1")
                && peliculas_lectura2.get(0).descripcion.equals("D1")
                && peliculas_lectura2.get(0).duracion == 80
                && peliculas_lectura2.get(1).nombre.equals("P2")
                && peliculas_lectura2.get(1).descripcion.equals("D2")
                && peliculas_lectura2.get(1).duracion == 90
                )
        {
            System.out.println("correcto");
        }else
        {
            System.out.println("incorrecto");
        }
    }
    
}
