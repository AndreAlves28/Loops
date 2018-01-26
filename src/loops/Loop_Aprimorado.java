
package loops;

public class Loop_Aprimorado {

    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        for (int x = 0; x < a.length; x++) {
            System.out.println(a[x]);
        }
        System.out.print("\n");
        for (int n: a)
            System.out.println(n);
    }
}
