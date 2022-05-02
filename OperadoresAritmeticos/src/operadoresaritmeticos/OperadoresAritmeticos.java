package operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int numero1 = 3;
        int numero2 = 5;
        float media = (numero1 + numero2)/2;
        System.out.printf("A média do aluno é: %.1f %n ",media);
        */
        /*
        pós incremento numero++. Depois de tudo soma numero  + 1
        pré incremento ++numero. primeiro soma 1 + numero
        */
        /*
        int numero = 10;
        int valor = 4 + numero--;
        System.out.println(valor);
        System.out.println(numero);
        */
        
        //Operadores de Atribuição
        
        /*
        int x = 4;
        x += 2; // x = x + 2
        System.out.println(x);
        */
        
        // Arredondamento
        /*float valor = 8.5f;
        // int arredondamento = (int) Math.floor(valor); - Math.floor arredondar para baixo.
         // int arredondamento = (int) Math.ceil(valor); - Math.ceil arredonda para cima.
         int arredondamento = (int) Math.round(valor); // Math.round faz oarredondamento aritimetico, para cima ou para baixo.
        System.out.println(arredondamento);
        */
        
        // Números aleatorios (random)
        
        // double aleatorio = Math.random(); -  random gera um número de 0 a 1.
        double aleatorio = Math.random();
        int numero = (int)(1 + aleatorio * (10 - 1));
        System.out.println(numero);
    }
    
}
