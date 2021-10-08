package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean businessHours = true;
		
		while (businessHours) {
			printMenu();
			int userInput = scanner.nextInt();
			
			switch (userInput) {
			case 1:
				subMenu();
				break;
			case 2:
				System.out.println("Program Terminating... Goodbye.");
				businessHours = false;
			}
			
		}
		
		double change = subMenu();

		int bills = (int) change;

		int twnt = 0, ten = 0, five = 0, one = 0;

		if (bills % 20 != 0) {
			ten = (bills % 20);
			twnt = (bills / 20);
			if (ten % 10 != 0) {
				five = ten % 10;
				ten /= 10;
				if (five % 5 != 0) {
					one = five % 5;
					five /= 5;
				}
			}
		}

		double coinsD = (change - (int) change) * 100;
		int coins = (int) coinsD;
		int qrtr = 0, dime = 0, nckl = 0, pny = 0;

		if (coins % 25 != 0) {
			dime = coins % 25;
			qrtr = coins / 25;
			if (dime % 10 != 0) {
				nckl = dime % 10;
				dime /= 10;
				if (nckl % 5 != 0) {
					pny = nckl % 5;
					nckl /= 5;
				}
			}
		}
		
	}

		public static void printMenu() {
			System.out.println();
			System.out.println("========= MENU =========");
			System.out.println("|                      |");
			System.out.println("|   1. Customer Trans. |");
			System.out.println("|   3. Exit            |");
			System.out.println("|                      |");
			System.out.println("========================");
			System.out.println();
		}

		public static double subMenu() {
			double change = 0;

			System.out.print("What is the item cost: ");
			double cost = scanner.nextDouble();

			System.out.print("How much was tendered: ");
			double tender = scanner.nextDouble();

			if (cost > tender) {
				System.err.println("Not enough tendered.");
			} else if (cost == tender) {
				System.out.println("Exact change tendered!");
			} else {
				change = -(cost - tender);
				System.err.println("Change due: " + change);
			}

			return change;

		}
	

}