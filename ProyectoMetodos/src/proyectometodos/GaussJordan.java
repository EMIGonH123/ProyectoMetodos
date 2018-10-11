package proyectometodos;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class GaussJordan {
    public void muestramatriz(float matriz[][], int var) {
        for (int x = 0; x < var; x++) {
            for (int y = 0; y < (var + 1); y++) {
                System.out.print(" " + matriz[x][y] + " |");
            }
            System.out.println("");
        }

    }

    public void pivote(float matriz[][], int piv, int var) {
        float temp = 0;
        temp = matriz[piv][piv];
        for (int y = 0; y < (var + 1); y++) {

            matriz[piv][y] = matriz[piv][y] / temp;
        }
    }

    public void hacerceros(float matriz[][], int piv, int var) {
        for (int x = 0; x < var; x++) {
            if (x != piv) {
                float c = matriz[x][piv];
                for (int z = 0; z < (var + 1); z++) {
                    matriz[x][z] = ((-1 * c) * matriz[piv][z]) + matriz[x][z];
                }
            }
        }
    }

    public void gaussJordan(int numVariables , Set<Hashtable<Integer, double[]>> arreglos ) {
        int piv = 0;
        float matriz[][];
        System.out.println("\t ** Este programa nos muestra la solución de un sistema de ecuaciones \n\t\tlineales a través del método Gauss_Jordan **");
        System.out.println("\n¿Cuantas variables tiene tu sistema?");
        matriz = new float[numVariables][numVariables+1];
        for (int x = 0; x < numVariables; x++) {
            for (int y = 0; y < (numVariables + 1); y++) {
                System.out.println("Ingresa la constante de la posicion: A[" + (x + 1) + "][" + (y + 1) + "]");
                //matriz[x][y] = leer.nextFloat();
            }

        }

        for (int a = 0; a < numVariables; a++) {
            pivote(matriz, piv, numVariables);

            System.out.println("\tRenglon " + (a + 1) + " entre el pivote");
            muestramatriz(matriz, numVariables);

            System.out.println("");

            
            
            System.out.println("\tHaciendo ceros");
            hacerceros(matriz, piv, numVariables);

            muestramatriz(matriz, numVariables);
            System.out.println("");
            piv++;
        }
        for (int x = 0; x < numVariables; x++) {
            System.out.println("La variable X" + (x + 1) + " es: " + matriz[x][numVariables]);
        }

    }
}
