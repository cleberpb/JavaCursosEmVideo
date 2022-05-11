
package vetor04;

import java.util.Arrays;

public class Vetor04 {

    public static void main(String[] args) {
        // TODO code application logic here
        int vetor[] = {3, 7, 6, 1, 9, 4, 2};
        for (int valor: vetor) {
            System.out.print(valor + " ");
        }
        System.out.println("");
        int posicao = Arrays.binarySearch(vetor, 8);
        System.out.println("Encontrei o valor na posição " + posicao);
    }
    
}
