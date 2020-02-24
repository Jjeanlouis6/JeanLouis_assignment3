package Jean_louis_problem2;

import java.math.RoundingMode;

import java.text.DecimalFormat;

import java.util.Scanner;

public class SavingsAccount {

	private double savingsBalance = 0;

	static double annualInterestRate = .04;


	public double calculateMonthlyInterest() {

		double monthlyInterest = (savingsBalance*annualInterestRate)/12;

		

		return monthlyInterest;

	}

	public static void modifyInterestRate(double newInterestRate) {

		annualInterestRate=newInterestRate;

	}

	public double getSavingsBalance() {

		return savingsBalance;

	}

	public void setSavingsBalance(double savingsBalance) {

		this.savingsBalance = savingsBalance;

	}

}


