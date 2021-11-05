// Write a Java program to check if a positive number is a palindrome or not.
//https://www.w3resource.com/java-exercises/basic/index.php #115
import java.util.ArrayList;
import java.util.Scanner;

public class palindrome {


    public static void main(String[] args){
        splitInput();
    }

    public static void splitInput(){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        ArrayList<Integer> listReversed = new ArrayList<Integer>();
        int counter1 = 0;
        while (input>0){
            listReversed.add(input %10);
            input/=10;
            counter1++;
        }

        /*
        for (int y = 0; y<counter1; y++){
            System.out.print(listReversed.get(y) + "  ");
             // prints the elements of ArrayList 'listReversed'
        }
         */
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int r = counter1-1; r>=0; r--){
            list.add(listReversed.get(r));
        }


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
            }
        }
        if (o == list.size()){
            System.out.println("Your number is a palindrome!!!");
        } else {
            System.out.println("Your number is not a palindrome!");
        }
    }
}


