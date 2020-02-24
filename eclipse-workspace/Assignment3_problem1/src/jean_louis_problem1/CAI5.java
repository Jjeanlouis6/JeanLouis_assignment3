package jean_louis_problem1;

import java.security.SecureRandom;
import java.util.Scanner;
import java.lang.Math;

public class CAI5 {


		public static void main(String[] args) {quiz();}

		public static void quiz() {

			boolean play = true;

			while (play) {

				int difficulty = readDifficulty();

				int pType = readProblemType();

				boolean isCorrect = false;

				int correctQ = 0;

				for (int questionNbr = 0; questionNbr < 10; questionNbr++) {

					int questionType = pType;

					if (questionType==5) {

						SecureRandom rand= new SecureRandom();

						questionType= rand.nextInt(4)+1;}

					int Num1 = generateQuestionArgument(difficulty, 1);

					int Num2 = generateQuestionArgument(difficulty, questionType);

					askQuestion(Num1, Num2, questionType);

					double response = readResponse();

					isCorrect = isAnswerCorrect(Num1, Num2, response, questionType);

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
				}}}
		public static int readDifficulty(){

			  System.out.println("Enter difficulty(1,2,3, or 4): ");

			  int difficulty = (int) readResponse();

			  return difficulty;
			}
		public static int readProblemType(){

			  System.out.println("Enter problem type(1 for addition problemes, 2 for multiplication problems, 3 for subtraction problems, or 4 for division problems and 5 for a mixture of all types of arithmatic): ");

			  int pType = (int) readResponse();

			  return pType;

			}
			public static int generateQuestionArgument(int difficulty, int questionType){

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

			  if (questionType==4) {

				  return rand.nextInt(maxVal-1)+1;

			  }

			return rand.nextInt(maxVal);

			}
		public static void askQuestion(int Num1, int Num2, int questionType) {

			switch(questionType) {

			case 1: System.out.printf("What is %d plus %d?\n", Num1, Num2);break;

			case 2: System.out.printf("What is %d times %d?\n", Num1, Num2);break;

			case 3: System.out.printf("What is %d minus %d?\n", Num1, Num2);break;

			case 4: System.out.printf("What is %d divided by %d?\n", Num1, Num2);break;
			}}
		public static double readResponse() {

			Scanner input = new Scanner(System.in);

			double response = input.nextDouble();
			return response;

		}
		public static boolean isAnswerCorrect(int Num1, int Num2, double response, int questionType) {

			double product=0;

			switch(questionType) {

				case 1:{ 

					product = Num1+Num2;break;

				}

				case 2:{

					product = Num1*Num2;break;

				}

				case 3:{ 

					product = Num1-Num2;break;

				}

				case 4:{ 

					product = (double)Num1/(double)Num2;break;

				}

				}

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
