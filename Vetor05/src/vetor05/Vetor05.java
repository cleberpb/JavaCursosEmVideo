
package vetor05;

import java.util.Arrays;

public class Vetor05 {

    public static void main(String[] args) {
        // TODO code application logic here
        int vetor[] = new int[20];
        Arrays.fill(vetor, 0); // Arrays.fill preenche o vetor automaticamente com o mesmo valor
        for (int valor: vetor) {
            System.out.print(valor + " ");
        }
    }
    
}
