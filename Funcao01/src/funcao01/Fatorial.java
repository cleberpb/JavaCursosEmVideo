/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao01;

/**
 *
 * @author Cleber
 */
public class Fatorial {
    
    private int numemo = 0;
    private int fatorial = 1;
    private  String formula = "";
    
    public void setValor (int n) {
        numemo = n;
        int f = 1;
        String s = "";
        for(int c = n;  c > 1; c--) {
            f *= c;
            s += c + " x ";
        }
        s += " 1 =";
        fatorial = f;
        formula = s;
    }
    
    public int getFatorial() {
        return fatorial;
    }
    
    public String getFormula() {
        return formula;
    }
}
