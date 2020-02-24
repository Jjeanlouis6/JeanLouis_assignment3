package jean_louis_problem1;
import java.security.SecureRandom;
import java.util.Scanner;
import java.lang.Math;

public class CAI1 {
	public static void main(String[] args) {quiz();	}

	public static void quiz() {

		boolean isCorrect = false;

		SecureRandom rand = new SecureRandom();

		int Num1 = rand.nextInt(10);

		int Num2 = rand.nextInt(10);

		while(!isCorrect) {

        askQuestion(Num1,Num2);

        int response = readResponse();

        isCorrect = isAnswerCorrect(Num1,Num2,response);

        if(isCorrect) {

        	displayCorrectMessage();

        }

        else {

        	displayIncorrectMessage();

        }

		}

        

        

	}

	public static void askQuestion(int Num1, int Num2){

		

		System.out.printf("What is %d times %d?\n", Num1, Num2 );	

	}

	public static int readResponse(){

		Scanner input = new Scanner(System.in);

		int response = input.nextInt();

		

		return response;

	}


	public static boolean isAnswerCorrect(int Num1, int Num2, int response){

		int product = Num1*Num2;

		return (Math.abs(response - product) < .1);

		

	}


	public static void displayCorrectMessage(){

		System.out.println("Good Job!");
	}


	public static void displayIncorrectMessage(){

		System.out.println("No. Please try again.");

	}
}