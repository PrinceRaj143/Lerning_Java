import java.util.*;

public class Lec_04_Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // used tto take inputs

         int sum = 0;         // variable initialise to add the numbers

        for(int i =0; i <=n; i++){
          sum = sum+i;
        }
        System.out.println( sum );
    }
}
