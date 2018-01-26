package loops;
public class Break {
    public static void main(String[] args) {
        boolean isTrue = true;
        outer:
          for(int i = 0; i < 5; i++) {
              while(isTrue) {
                  System.out.println("Hello");
                  break outer;
                    // Fim do loop interno
              }
              System.out.println("Outer loop"); //Não será exibido
          }        // Fim do loop externo
        System.out.println("Good-Bye");
    }
    
}
