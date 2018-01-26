package loops;

public class Declaracoes_for {
    public static void main(String[] args) {
        int x;
        long x2;
        long [] la = {7l, 8l, 9l};
        int [][] twoDee = {{1,2,3}, {4,5,6}, {7,8,9}};
        String [] sNums = {"one", "two", "three"};
       // Animal [] animals = {new Dog(), new Cat()};
       
       System.out.println("Declarações 'for' válidas");
       for(long y : la);                  //Loop em um array de longs
       for(int[] n : twoDee);             //Loop em um array de array
       for(int n2 : twoDee[2]);           //Loop do terceiro sub-array
       for(String s: sNums);              //Loop em uma array de String
       

    }
    
}
