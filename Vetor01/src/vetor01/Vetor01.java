
package vetor01;

public class Vetor01 {

    public static void main(String[] args) {
        // TODO code application logic here
        int numero[] = {3,2,8,7,5,4};
        
        for (int contador = 0; contador <= numero.length - 1; contador++) {
            System.out.println("Na posição " + contador + " temos o valor " + numero[contador]);
        }
    }
    
}
