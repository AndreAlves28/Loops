
package loops;

public class While {

    public static void main(String[] args) {
        int x = 2;
        while (x == 2) {
            System.out.println(x);
            ++x;
        }
        int z = 8;
        while (z > 8) {
            System.out.println("Int the loop");
            z = 10;
        }
        System.out.println("past the loop");
    }
    
}
