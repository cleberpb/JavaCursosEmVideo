
package vetor02;

public class Vetor02 {

    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int totalDia[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for (int contador = 0; contador < mes.length; contador++) {
            System.out.println("O mês de " + mes[contador] + " tem " + totalDia[contador] + " dias ao todo.");
        }
    }
    
}
