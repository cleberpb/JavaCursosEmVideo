/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao02;

/**
 *
 * @author Cleber
 */
public class Operacoes {
    
    public static String contador(int inicio, int fim) {
        String s = "";
        for (int c = inicio; c <= fim; c++) {
            s += c + " ";
        }
        return s;
    }
}
