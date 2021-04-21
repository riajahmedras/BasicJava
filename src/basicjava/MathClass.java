package basicjava;

public class MathClass {
    public static void main(String[] args) {
        int x = 10;
        int y = -123;
        int z = 3;
        double cube = 200;
        double r = 5;
        
        int absolute = Math.abs(y);
        System.out.println("Absolute Number of y = "+absolute);
        
        int maximum = Math.max(x, y);
        System.out.println("maximum number is "+maximum);
        
        int minimum = Math.min(x, y);
        System.out.println("Minimum number is "+minimum);
        
        System.out.println("Cube Root "+(Math.cbrt(cube)));
        System.out.println("Cube Root "+Math.ceil(Math.cbrt(cube)));
        System.out.println("Cube Root "+Math.round(Math.cbrt(cube)));
        System.out.println("Log "+Math.log(cube));
        System.out.println("Power "+Math.pow(x, z));
        // Circle
        System.out.println("PI "+Math.PI);
        
    }
 
}
