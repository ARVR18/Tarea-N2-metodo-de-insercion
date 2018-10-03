

package metinsercion;

/**
 *
 * @author Alex
 */
public class Algoritmoclaseordenado {
  
  int i, j;

    public Algoritmoclaseordenado() {
        this.i = 0;
        this.j = 0;
        
    }

    public void inserccion(int[] arreglo, int num) {
        int i, j, auxiliar;
        for (i = 1; i < num; i++) {
            auxiliar = arreglo[i];
            j = i - 1;
            while (j >= 0 && arreglo[j] > auxiliar) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = auxiliar;

        }

        mostrarArreglo(arreglo);
    }

    public void mostrarArreglo(int[] arreglo) {
        int b;
        for (b = 0; b < arreglo.length; b++) {
          
            //impresion del arreglo
            System.out.print("[" + arreglo[b] + "]");

        }
        System.out.println();
    }   
}


