import java.util.Random;
import java.util.Scanner;

public class MultiplicationTables { 

    public static void main(String args[]) {

        //variables and constants
        int firstNumber = 0;
        int secondNumber = 0;
        int result = 0;
        String userInput = "";
        Scanner in = new Scanner(System.in);
        boolean checked;
        Random rand = new Random();
        char proceed = 'y';
        String convert = "y";
        int score = 0;

        System.out.println("Multiplication Tables");
        System.out.println("---------------------");
        System.out.println("Press \"q\" to quit.");

        while(proceed != 'q' || proceed != 'Q') {


            firstNumber = rand.nextInt(12);
            secondNumber = rand.nextInt(12);
            System.out.println("What is " + firstNumber + " x " + secondNumber + "?: ");
            userInput = in.next();
            checked = Verification (firstNumber, secondNumber, userInput);
            

            if (checked == true){
                System.out.println("You are correct!");
                score = score  + 20;
            }
            else {
                System.out.println("You are incorrect.");
                score = score - 10;
            }

            System.out.println("\n Your score is " + score +"\n");
            proceed = convert.charAt(0);
            
        }

    }//End main method

    public static boolean Verification(int first, int second, String userInput){

        int truth = first * second;
        int change = Integer.parseInt(userInput);
        if (change == truth) {
            return true;
        }
        else {
            return false;
        }

    }//End Verification method

}//End MultiplicationTables class
