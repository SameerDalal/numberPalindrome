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
        ArrayList<Integer> arrayReversed = new ArrayList<Integer>();
        int counter1 = 0;
        while (input>0){
            arrayReversed.add(input %10);
            input/=10;
            counter1++;
        }

        /*
        for (int y = 0; y<counter1; y++){
            System.out.print(arrayReversed.get(y) + "  ");
        }
         */
        ArrayList<Integer> arrayNotReversed = new ArrayList<Integer>();
        for (int r = counter1-1; r>=0; r--){
            arrayNotReversed.add(arrayReversed.get(r));
        }

        /*
        for (int u = 0; u<counter1; u++) {
            System.out.print(arrayNotReversed.get(u));
        }
         */


        if (1==1){
            int counter2 = 0;
            while (arrayReversed.get((arrayReversed.size()-counter2)-1) == arrayNotReversed.get(counter2)){
                counter2++;
                if (counter2 >= arrayNotReversed.size()){
                    break;
                } else {
                    System.out.println("True");
                }
            }
        }
    }
}


