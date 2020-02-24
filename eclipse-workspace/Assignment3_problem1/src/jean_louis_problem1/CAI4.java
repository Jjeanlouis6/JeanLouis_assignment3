package jean_louis_problem1;
	import java.security.SecureRandom;
	import java.util.Scanner;
	import java.lang.Math;

public class CAI4 {

		public static void main(String[] args) {quiz();	}
public static void quiz() {

			boolean play = true;

			while (play) {

				int difficulty = readDifficulty();

				boolean isCorrect = false;

				int correctQ = 0;

				for (int questionNbr = 0; questionNbr < 10; questionNbr++) {

					int Num1 = generateQuestionArgument(difficulty);

					int Num2 = generateQuestionArgument(difficulty);

					askQuestion(Num1, Num2);

					double response = readResponse();

					isCorrect = isAnswerCorrect(Num1, Num2, response);

					if (isCorrect) {

						displayCorrectMessage();

						correctQ++;

					} else {

						displayIncorrectMessage();

					}

				}

				displayCompletionMessage(correctQ);

				System.out.println("Would you like to solve a new problem set?(Enter y or n)\n");

				Scanner input = new Scanner(System.in);

				char playChoice = input.next().charAt(0);

				if (playChoice == 'y') {

					play = true;

				} else {

					play = false;

					System.out.println("Thanks for playing!");

				}

			}

		}
		public static int readDifficulty(){

			  System.out.println("Enter difficulty(1,2,3, or 4): ");

			  int difficulty = (int) readResponse();

			  return difficulty;

			}

			public static int generateQuestionArgument(int difficulty){

			  int maxVal = 10;

			  switch(difficulty){

			    case 1:

			       maxVal = 10;

			       break;

			    case 2:

			       maxVal = 100;

			       break;

			    case 3:

			       maxVal = 1000;

			       break;

			    case 4:

			       maxVal = 10000;

			       break;

			}

			  SecureRandom rand = new SecureRandom();

			return rand.nextInt(maxVal);

			}

		public static void askQuestion(int Num1, int Num2) {



			System.out.printf("What is %d times %d?\n", Num1, Num2);



		}

		public static double readResponse() {

			Scanner input = new Scanner(System.in);

			double response = input.nextDouble();



			return response;

		}

		public static boolean isAnswerCorrect(int Num1, int Num2, double response) {

			int product = Num1 * Num2;

			return (Math.abs(response - product) < .1);



		}

		public static void displayCorrectMessage() {

			SecureRandom rand = new SecureRandom();

			int correctMessage = rand.nextInt(4);

			switch (correctMessage) {

			case 0:

				System.out.println("Very good!");

				break;

			case 1:

				System.out.println("Excellent!");

				break;

			case 2:

				System.out.println("Nice work!");

				break;

			case 3:

				System.out.println("Keep up the good work!");

				break;
			}}
		public static void displayIncorrectMessage() {

			SecureRandom rand = new SecureRandom();

			int incorrectMessage = rand.nextInt(4);

			switch (incorrectMessage) {

			case 0:

				System.out.println("No. Please try again.");

				break;

			case 1:

				System.out.println("Wrong. Please try once more.");

				break;

			case 2:

				System.out.println("Don't give up!");

				break;

			case 3:

				System.out.println("No. Keep trying.");

				break;
			}}
		public static void displayCompletionMessage(int correctQ) {

			switch (correctQ) {

			case 10:

				System.out.println("You got 100%. Congratulations, you are ready to go to the next level!");

				break;

			case 9:

				System.out.println("You got 90%. Congratulations, you are ready to go to the next level!");

				break;

			case 8:

				System.out.println("You got 80%. Congratulations, you are ready to go to the next level!");

				break;

			case 7:

				System.out.println("You got 70%. Please ask your teacher for extra help.");

				break;

			case 6:

				System.out.println("You got 60%. Please ask your teacher for extra help.");

				break;

			case 5:

				System.out.println("You got 50%. Please ask your teacher for extra help.");

				break;

			case 4:

				System.out.println("You got 40%. Please ask your teacher for extra help.");

				break;

			case 3:

				System.out.println("You got 30%. Please ask your teacher for extra help.");

				break;

				
			case 2:

				System.out.println("You got 20%. Please ask your teacher for extra help.");

				break;

			case 1:

				System.out.println("You got 10%. Please ask your teacher for extra help.");

				break;

			case 0:

				System.out.println("You got 0%. Please ask your teacher for extra help.");

				break;
			}}}
