// Aula 06 - Tipos Primitivos e Manipulaçõa de dados.
package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in); // foi criado (instânciado um novo objeto chamado teclado que vai receber uma intrada do teclado.
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        //System.out.println("A nota é " + nota); // sem formatação
        //System.out.printf("A nota de %s é: %.1f. %n", nome, nota); // com formatação - %.2f o .2 indica a quantidade de casas.
        System.out.format("A nota de %s é: %.1f. %n", nome, nota); // usando format
    }
    
}
