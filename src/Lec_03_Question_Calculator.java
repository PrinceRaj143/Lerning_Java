import java.util.*;
            // Calculator
public class Lec_03_Question_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Digit");
        int a = sc.nextInt();
        System.out.println("Enter Second Digit");
        int b = sc.nextInt();

        int sum = a + b;
        int diff = a - b;
        int mul = a * b;
        int div = a / b;
        int rem = a % b;


        System.out.println("Enter \n 1.Sum \n 2. Difference \n 3. Multiply \n 4. Division \n 5. Remainder \n 6. Even/Odd ");

        int button = sc.nextInt();

        switch(button){
            case 1:
                System.out.println(sum);
                break;

            case 2:
                System.out.println(diff);
                break;
            case 3:
                System.out.println(mul);
                break;
            case 4:
                System.out.println(div);
                break;
            case 5:
                System.out.println(rem);
                break;
            case 6:  if (rem % 2 == 0 ){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
            break;
            default:
                System.out.println("Invalid");
        }
    }
}
