package metinsercion;

import java.util.Random;
import java.util.Scanner;
//AUTOR: VASQUEZ ROJAS ALEXANDRO
//CURSO: ESTR. DATOS
//METODO INSERCION CON NUMEROS ALEATORIOS < 1000000
public class Metinsercion {

    public static void main(String[] args) {
         Random miAleatorio = new Random();
        Algoritmoclaseordenado ordenar = new Algoritmoclaseordenado();
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de su Arreglo");
        int tam = valor.nextInt();
        int num;
        int vector[] = new int[tam];

        for (int i = 0; i < vector.length; i++) {
            num = (int) (miAleatorio.nextDouble() * 1000000);
            vector[i] = num;
        }
        
        
        
        System.out.println("Arreglo Principal");
        ordenar.mostrarArreglo(vector);
        System.out.println("Arreglo Ordenado con Metodo Inserccion");
        ordenar.inserccion(vector,tam);
    }
}



