import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.*;

public class Lec_02 {
    public static void main(String[] args) {
        //output
       /*
        System.out.println("Hello Prince\n");
        // \n is used to provide extra line or space between two line
        System.out.print("Hello Prince \n");
        System.out.println("Hello Prince");
        System.out.print("Prince Raj \n  From  \n     Rungta College");
                // printing the pattern problem
        
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
        */

           //  Variables  //

          /*
        String name ="Tony Stark";
        int age = 45;


        int a = 40;
        int b = 50;
        int sum = a + b;
        int diff = b - a;
        int mul = a * b;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
           //  calculate : a*b/a-b
        int ans = (a*b)/(a-b);
           /*(40*50)/(40-50)
            2000/-10
            -200

        System.out.println(ans);
         */

          // Taking " INPUT "

         /*
        Scanner sc = new Scanner(System.in);
         String username = sc.next(); //next - Only one word
         String username1 = sc.nextLine();// nextLine - Total word
        System.out.println(username);
        System.out.println(username1);
        */

        // Taking two input values from user and print their sum.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First No.");
        int a = sc.nextInt();
        System.out.println("Enter Second No.");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);

    }
}
