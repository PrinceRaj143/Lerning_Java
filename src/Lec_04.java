
import java.util.*;
                        //Loops
public class Lec_04 {
    public static void main(String[] args) {
        //1. for Loop

//        for(int counter = 0; counter < 10; counter = counter+1){   //(initialize; condition; updation)
//            System.out.println("Hello world");
//        }
        //Printing the numbers from 0 to 10
        //    Method 1
//        for(int counter =0; counter < 11; counter++){
//            System.out.println(counter);
//            }

              //counter is changed with ("i") and printing in same line (+" ")
           //    Method 2
//          for(int i = 0; i < 11; i++){
//              System.out.print(i+ " ");
//          }


            //2. While Loop

//        int i = 0;            //initialize
//        while (i < 11){       //condition
//            System.out.println(i);
//            i =i +1;          //updation(i++)
//        }


          //3. do while (once always execute 1st digit after that it checks)

//         int i = 0;                //initialise
//        do {
//            System.out.println(i);
//            i = i + 1;             //updation
//        } while(i < 11);            //condition

                  //Condition check for while and do while loop

        int i = 12;
              //While does not print because initialise is checked first
        while(i<12){
            System.out.println("Avengers");
        }
              // do while atleast once print after that it checked
        do {
            System.out.println("Mango");
            i = i +1;
        } while(i < 11);
        }
        }

