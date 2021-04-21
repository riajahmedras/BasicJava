
package basicjava;

public class PrintF {
    public static void main(String[] args){
        // Dynamic initialization of variable
        boolean t = true;
        char c = 'B';
        short s = 22336;
        int i = 5200;
        float f = 52.212f;
        double d = 52.212;
        
        
        System.out.printf("Boolean t = %b\n", t);
        System.out.printf("Boolean c = %c\n", c);
        System.out.printf("Boolean s = %d\n", s);
        System.out.printf("Boolean i = %d\n", i);
        System.out.printf("Boolean f = %f\n", f);
        System.out.printf("Boolean f = %.2f\n", f);
        System.out.printf("Boolean d = %f\n", d);
        System.out.printf("Boolean d = %.3f\n", d);
    }
}
