
package programamedia;

import java.util.Scanner;// foi importado

public class ProgramaMedia {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);// foi criado o objeto teclado que vai (System.in) monitorar a entrada do teclado.
        
        System.out.print("Primeira nota: ");
        float nota1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        float nota2 = teclado.nextFloat();
        float media = (nota1 + nota2) / 2;
        System.out.println("A sua média é: " + media);
        
        if (media > 6) {
            System.out.println("Parabéns! Você passou.");
        }
    }
    
}
