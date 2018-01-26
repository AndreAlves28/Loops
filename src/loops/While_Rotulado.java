package loops;
public class While_Rotulado {
    public static void main(String[] args) {
        int age = 10;
        outer:
            while (age <= 21) {
                age++;
                if (age == 16) {
                    System.out.println("Another year");
                    continue;
                }
            }
        }
    }
