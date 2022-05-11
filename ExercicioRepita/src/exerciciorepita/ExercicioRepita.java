
package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {
        // TODO code application logic here
        int numero, soma = 0;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            soma += numero;
        } while (numero != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" + "<br>Somatório vale " + soma + "</html>");
        
    }
    
}
