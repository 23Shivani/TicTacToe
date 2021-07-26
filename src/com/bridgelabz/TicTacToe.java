package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {	
	public static void main(String[] args) {
	createBored();
	userChoice();
}
public static void createBored() {
	char [] bored = new char [9];
	for (int i= 0;i < 9;i++) {
		bored[i] = '-';
	}
}
public static void userChoice() {
	char player = ' ';
	char computer = ' ';
	
	Scanner s = new Scanner(System.in);
	System.out.println("Choose a Letter 1.X or 2.O :");
	int userInput = s.nextInt();
	switch (userInput) {
	case 1 :
		player = 'X';
		System.out.println("You have Taken Letter : " + player);
		break;
	case 2 :
		computer = 'O';
		System.out.println("You have Taken Letter : " + computer);
		break;
	}
s.close();
}
}