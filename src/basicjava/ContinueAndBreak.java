
package basicjava;

public class ContinueAndBreak {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i=i+3) {
            if (i==9) {
                continue;
            }
            if (i>16) {
                break;
            }
            System.out.println(i);
            
        }
        
    }
 
}
