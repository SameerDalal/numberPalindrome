// Write a Java program to check if a positive number is a palindrome or not.
//https://www.w3resource.com/java-exercises/basic/index.php #115
import java.util.ArrayList;
import java.util.Scanner;

public class palindrome {


    public static void main(String[] args){
        runPalindrome();
    }

    public static void runPalindrome(){
        Scanner scan = new Scanner(System.in);
        long input = scan.nextLong();
        ArrayList<Long> listReversed = new ArrayList<Long>();
        int counter1 = 0;
        while (input>0) {
            listReversed.add(input % 10);
            input /= 10;
            counter1++;
        }
       /* This code takes an input from the user and then splits each element of the number and stores it
       in the ArrayList called 'listReversed'
        */

       /*the elements of 'listReversed' is reversed by default because to split the elements of the number we
       divide by 10 and take the remainder. The remainder will give us the individual parts of the number
       that is inputted but in reverse
        */

       /*
       for (int y = 0; y<counter1; y++){
           System.out.print(listReversed.get(y) + "  ");
            // prints the elements of ArrayList 'listReversed'
       }
        */
        ArrayList<Long> list = new ArrayList<Long>();
        for (int r = counter1-1; r>=0; r--){
            list.add(listReversed.get(r));
        }
        /*this code takes the elements of 'listReversed' and reverses all the values so that the value initially
        inputted is in the same order as it is in this ArrayList
        */


       /*
       for (int u = 0; u<counter1; u++) {
           System.out.print(list.get(u));
           // prints the elements of ArrayList 'list'
       }
        */


        int o = 0;
        for (int y = 0; y<list.size(); y++){
            if(listReversed.get(y) == list.get(y)){
                o++;
// checks if the elements of both the arrays are the same.
            }
        }
        if (o == list.size()){
            System.out.println("Your number is a palindrome!!!");
        } else {
            System.out.println("Your number is not a palindrome!");
        }
        /*if the number of times each element of both arrays was the same is the same number as the number
        of elements in an array then the number is a palindrome.
         */
    }
}




