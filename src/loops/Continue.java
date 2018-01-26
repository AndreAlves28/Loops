package loops;

public class Continue {
     public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
             System.out.println("Inside Loop");
             continue;
        }
        
        for (int i = 0; i < 10; i++) {
            if (foo.doStuff() == 5) {
                continue;
            }
        }
    }
}
