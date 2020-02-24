package Jean_Louis_problem2;
	import java.math.RoundingMode;

	import java.text.DecimalFormat;

	import java.util.Scanner;


	public class SavingsAccountTest {

		public static void main(String[] args) {

			SavingsAccount Saver1=new SavingsAccount();

			SavingsAccount Saver2=new SavingsAccount();

			Saver1.setSavingsBalance(2000);

			Saver2.setSavingsBalance(3000);

			SavingsAccount.modifyInterestRate(.04);

			DecimalFormat df2 = new DecimalFormat("#.##");


			for (int month = 1; month < 13; month++) {

				double monthlyInterest1 = Saver1.calculateMonthlyInterest();

				double monthlyInterest2 = Saver2.calculateMonthlyInterest();

				double newBalance1 = monthlyInterest1 + Saver1.getSavingsBalance();

				double newBalance2 = monthlyInterest2 + Saver2.getSavingsBalance();

				Saver1.setSavingsBalance(newBalance1);

				Saver2.setSavingsBalance(newBalance2);

				System.out.printf("%-10s\t$%.2f\t\t$%.2f\n", getMonth(month), newBalance1,newBalance2);

			}

			double monthlyInterest1 = Saver1.calculateMonthlyInterest();

			double monthlyInterest2 = Saver2.calculateMonthlyInterest();

			double newBalance1 = monthlyInterest1 + Saver1.getSavingsBalance();

			double newBalance2 = monthlyInterest2 + Saver2.getSavingsBalance();

			Saver1.setSavingsBalance(newBalance1);

			Saver2.setSavingsBalance(newBalance2);

			SavingsAccount.modifyInterestRate(.05);

			System.out.printf("\n%-10s\t$%.2f\t\t$%.2f\n", getMonth(13), newBalance1,newBalance2);

		}


		public static String getMonth(int month) {

			String monthName;

			switch (month) {

			case 1:

				monthName = "January (1)";

				return monthName;

			

			case 2:

				monthName = "February (2)";

				return monthName;

			case 3:

				monthName = "March (3)";

				return monthName;

			case 4:

				monthName = "April (4)";

				return monthName;

			case 5:

				monthName = "May (5)";

				return monthName;

			case 6:

				monthName = "June (6)";

				return monthName;
			case 7:

				monthName = "July (7)";

				return monthName;

			case 8:

				monthName = "August (8)";

				return monthName;

			case 9:

				monthName = "September(9)";

				return monthName;

				

			case 10:

				monthName = "October(10)";

				return monthName;

			

			case 11:

				monthName = "November(11)";

				return monthName;

			

			case 12:

				monthName = "December (12)";

				return monthName;

				

			default:

				monthName = "January (1)";

				return monthName;
}}}
