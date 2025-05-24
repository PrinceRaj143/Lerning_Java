import java.util.*;
                         //Conditional Statements

public class Lec_03 {
    public static void main(String[] args) {

        //1. if else

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }
        */

        //2. else if (Between the code)

        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b){
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
        */

        //3. break (using to stop writing of extra elseif codes)

        Scanner sc = new Scanner(System.in);
         int button = sc.nextInt();

//         if(button==1){
//             System.out.println("Hello");
//         }else if(button == 2){
//             System.out.println("Namaste");
//         } else if (button == 3) {
//             System.out.println("Bonjour");
//         }else{
//             System.out.println("Invalid");
//         }

        //4.Button (By using case option to allow user options)

        switch(button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid");
        }

        }

    }
