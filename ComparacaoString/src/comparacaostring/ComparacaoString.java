
package comparacaostring;

public class ComparacaoString {

    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Cleber";
        String nome2 = "Cleber";
        String nome3 = new String("Cleber");
        String resultado;
        resultado = (nome1.equals(nome3))?"igual":"diferente"; //.equals é um metodo que verifica se o conteudo de um objeto é igual ao conteúdo do outro..
        System.out.println(resultado);
    }
    
}
