//Operadores Lógicos

/*                               (uma ou 
                                  exclusivamente)
   (e)  &&         (ou)  ||                ^        (não) !
-----------    -------------      -------------     --------
V | V | V |    | V | V | V |      | V | V | F |     | V | F |
-----------    -------------      -------------     ---------
V | F | F |    | V | F | V |      | V | F | V |
-----------    -------------      -------------
F | V | F |    | F | V | V |      | F | V | V |
-----------    -------------      -------------
F | F | F |    | F | F | F |      | F | F | F |
-----------    -------------      -------------
*/

package operadoreslogicos;

public class OperadoresLogicos {

    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean resultado;
        resultado = (x < y ^ y < z)?true:false;
        System.out.println(resultado);
    }
    
}
