
package basicjava;

public class ForLoop {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            System.out.println("No. " +i+ " Bangladesh");
        }
        System.out.println("Odd Numbers: "); 
        for(int i=1; i<10; i=i+2){
            System.out.println(i );
        }
        System.out.println("Even Numbers: "); 
        for(int i=10; i>=2; i=i-2){
            System.out.println(i);
        }
    }
}
