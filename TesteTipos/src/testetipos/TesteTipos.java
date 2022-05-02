// Aula 06 - Tipos Primitivos e Manipulaçõa de dados.
// converter número inteiro para String.
package testetipos;

public class TesteTipos {

    public static void main(String[] args) {
        // TODO code application logic here
       /* int idade = 30;
        // String valor = idade; - não pode ser feito assim.
        //String valor = (String) idade; - não poede ser feito assim.
        String valor = Integer.toString(idade); // estou convertendo a idade(número inteiro) em string e colocando dentro de valor.
        System.out.println("O valor da idade é " + valor);
        */
       
       /*String valor = "30";
       //int idade = valor; - não pode ser feito assim.
       //int idade = (int) valor; - não poede ser feito assim.
       int idade = Integer.parseInt(valor);
        System.out.println("A idade é: " + idade);
        */
        
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.println("A idade é: " + idade);
    }
    
    
}
