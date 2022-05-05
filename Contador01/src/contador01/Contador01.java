
package contador01;

public class Contador01 {

    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0; // cc - contador de cambalhotas
        while (cc < 10) {
            cc++;
            if (cc == 2 || cc == 3 || cc == 4) {
                continue;
            }
            if (cc == 7) {
                break;
            }
            System.out.println("Cambalhota " + cc);
        }
    }
    
}
