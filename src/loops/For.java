package loops;

public class For {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            //System.out.println(i);
        }
        
        for(int x = 1; x < 2; x++) {
            System.out.println(x);
        }
       // System.out.println(x); inválido! x agora está fora de escopo.
       
       System.out.println("===Ausencia de declaração");
       
       int i = 0;
       for (;i<10;) {
           i++;
           System.out.println("Sequências de loop: " + i);
       }
       
       for (int t = 0, j = 0; (t < 10) && (j < 10); t++, j++) {
           System.out.println("t is " + t + " j is " + j );
       }
       System.out.println("Instruções independentes\n");
       
       int b = 3;
       for (int a = 1; b != 1; System.out.println("Iterate")) {
           b = b - a;
       }
    }
    
}
