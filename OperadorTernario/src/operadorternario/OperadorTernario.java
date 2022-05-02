// Operador Ternário
package operadorternario;

public class OperadorTernario {

    public static void main(String[] args) {
        // TODO code application logic here
        int numero1;
        int numero2;
        int resultado;
        numero1 = 14;
        numero2 = 8;
        //resultado = (numero1>numero2)?0:1; // se numero1 for maior que numero2. numero1 recebe 0, se não recebe 1.
        //resultado = (numero1>numero2)?numero1:numero2; - mostra numero1 ou numero2.
        resultado = (numero1> numero2)? numero1+numero2: numero1-numero2; // aceita formula
        
        System.out.println("Resultado é: " + resultado);
    }
    
}
