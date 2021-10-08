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
				change();
				break;
			case 2:
				System.out.println("Program Terminating... Goodbye.");
				businessHours = false;
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
	

}