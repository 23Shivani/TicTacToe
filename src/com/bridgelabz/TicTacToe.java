package com.bridgelabz;

public class TicTacToe {	

	static void gameBoard(char gamebox [][]) {
	

		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(gamebox[i][j]);
				if (i<2) {
			System.out.print("_");
				}
				if(i>1)
			System.out.print(" ");
	
			if (j<2) {
				System.out.print("|");
			}
}
			System.out.println();
		}
}
}