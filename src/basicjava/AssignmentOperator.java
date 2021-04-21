
package basicjava;


public class AssignmentOperator {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        
        x-=y; // x = x -y =2
        System.out.println("x = "+x); 
        
        x+=y; // x = x +y
        System.out.println("x = "+x);
        
        x*=y; // x = x * y
        System.out.println("x = "+x);
        
        x/=y; // x = x / y
        System.out.println("x = "+x);
        
        x%=y; // x = x %y
        System.out.println("x = "+x);
        
        x+=y; // x=x+y
        System.out.println("y = "+y);
    }
}
