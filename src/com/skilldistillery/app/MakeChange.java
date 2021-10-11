package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean businessHours = true;
		double tax = 0;
		
		while (businessHours) {
			printMenu();
			System.out.print("Menu selection: ");
			int userInput = scanner.nextInt();
			
			switch (userInput) {
			case 1:
				double change = subMenu(tax);
				changeDisplay(change);
				break;
			case 2:
				System.out.print("What is the tax rate :");
				tax = scanner.nextDouble();
				break;
			case 3:
				System.out.println("Program Terminating... Goodbye.");
				businessHours = false;
				
			}
			
		}
				
	}

		public static void printMenu() {
			System.out.println();
			System.out.println("========= MENU =========");
			System.out.println("|                      |");
			System.out.println("|   1. Transactions    |");
			System.out.println("|   2.    Tax          |");
			System.out.println("|   3.    Exit         |");
			System.out.println("|                      |");
			System.out.println("========================");
			System.out.println();
		}

		public static double subMenu(double tax) {
			double change = 0;
			double transactionTax = (tax / 100) + 1;
			
			System.out.print("What is the item cost: ");
			double cost = scanner.nextDouble();

			System.out.print("How much was tendered: ");
			double tender = scanner.nextDouble();

			if (cost > tender) {
				System.err.println("Not enough tendered.");
			} else if (cost == tender) {
				System.err.println("Exact change tendered!");
			} else {
				change = tender - (cost * transactionTax);
				System.err.println("Change due: " + change);
			}

			return change;

		}
		
		public static void changeDisplay(double change) {
			
			int bills = (int) change;
			
			int twnt = 0, ten = 0, five = 0, one = 0;
			
			twnt = bills / 20;
			bills %= 20;
			ten = bills / 10;
			bills %= 10;
			five = bills / 5;
			bills %= 5;
			one = bills;
			
			double coinsD = (change - (int) change) * 100;
			int coins = (int) (Math.round(coinsD));
			
			int qtr = 0, dime = 0, nckl = 0, pny = 0;
			
			qtr = coins / 25;
			coins %= 25;
			dime = coins / 10;
			coins %= 10;
			nckl = coins / 5;
			coins %= 5;
			pny = coins;
			
			if(twnt != 0) {
				System.out.print("$20: " + twnt + "\t");
			}
			if (ten != 0) {
				System.out.print("$10: " + ten + "\t");
			}
			if (five != 0) {
				System.out.print("$5: " + five + "\t");
			}
			if (one != 0) {
				System.out.println("$1: " + one);
			}
			if(qtr != 0) {
				System.out.print(".25c: " + qtr + "\t");
			}
			if (dime != 0) {
				System.out.print(".10c: " + dime + "\t");
			}
			if (nckl != 0) {
				System.out.print(".05c: " + nckl + "\t");
			}
			if (pny != 0) {
				System.out.println(".01c: " + pny);
			}
			
		}

}
