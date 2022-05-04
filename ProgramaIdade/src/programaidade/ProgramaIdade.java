
package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Em que ano você nasceu? ");
        int nascimento = teclado.nextInt();
        int idade = 2022 - nascimento;
        
        if (idade >= 18){
            System.out.println("Você tem " + idade + " anos. É MAIOR DE IDADE.");
        } else {
            System.out.println("Você tem " + idade + " anos. É MENOR DE IDADE.");
        }
    }
    
}
