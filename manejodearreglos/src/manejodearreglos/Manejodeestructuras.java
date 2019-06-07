/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodearreglos;

/**
 *
 * @author Usuario
 */
public class Manejodeestructuras {

    public static void main(String[] args) {
        //Declaración de variables
        //Arreglos de tipo cadena para representación de nombres
        String[] listaNombres = {"Marjan", "Jhon", "Rodrigo", "Miguel", "José"};
        String[] listaCiudades = {"Loja", "Catamayo", "Calvas", "Celica", "Pindal"};
        // Arreglo de tipo decimal para representacion de sueldos
        double[] listaSueldos = {900.1, 100.2, 450.3, 1500.2, 861.9};
        // Ciclo for para recorrer y presentar los datos almacenados en los arreglos
        for (int i = 0; i < listaNombres.length; i++) {
            //impresion de datos
            System.out.printf(" %s es de %s y su sueldo es de: %.1f\n", listaNombres[i], listaCiudades[i], listaSueldos[i]);

        }
    }
}
