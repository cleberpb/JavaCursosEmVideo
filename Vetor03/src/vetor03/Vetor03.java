
package vetor03;

import java.util.Arrays;

public class Vetor03 {

    public static void main(String[] args) {
        // TODO code application logic here
        double valor[] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(valor);
        for (double numeros: valor) {
            System.out.print(numeros + " ");
        }
    }
    
}
