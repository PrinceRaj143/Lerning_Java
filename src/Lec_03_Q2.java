import java.util.Scanner;
                   //Comparing two numbers

public class Lec_03_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("Numbers are Equal");
        }else{
            if(a>b){
                System.out.println("First Number is Greater");
            }else{
                System.out.println("Second Number is Greater");
            }
        }

    }
}