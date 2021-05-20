package com.tictactoy;
import java.util.Arrays;
import java.util.Scanner;


public class TicTacToeGame 
{
	public static void main(String[] args) {

		System.out.println("Welcome to Tic Tac Toe Game");
		char[] board = createBoard();
		char UserLetter = chooseLetter();
		char ComputerLetter ;
		if(UserLetter == 'X')
		{
			ComputerLetter = '0';
		}
		else
		{
			ComputerLetter = 'X';
		}
		System.out.println("Computer Letter is: " + ComputerLetter + " User Letter is :" + UserLetter);
		showBoard(board);
		getUserMove(board,UserLetter);
		showBoard(board);
		toss();
	}
	public static void toss()
    {

        int toss = (int)Math.floor(Math.random() * 10) % 2+1;
        switch(toss) 
		{
			case 1:
				System.out.println("Player 1 win the toss so player 1 play the first");
			break;
			case 2:
				System.out.println("Computer win the toss so the computer play the first");
		}

    }
	 
	public static void getUserMove(char[] board,char alphabet)
	{
		Scanner scan = new Scanner(System.in);
		Integer[] validCells = {1,2,3,4,5,6,7,8,9};
		
		Boolean occupied = false;
		while (occupied == false)
		{
			System.out.println("Next move ? (1-9)");
			int index = scan.nextInt();
			if (Arrays.asList(validCells).contains(index) && isSpaceFree(board, index))
			{
			System.out.println("Entered cell is valid cell and space is free");
			board[index] = alphabet;
			occupied = true;
		}
				System.out.println("Enter valid cell is between 1-9");
			}
	}
	public static boolean isSpaceFree(char[] board , int index)
	{
		return board[index] == ' ';
	}
	public static char chooseLetter()
	{
		char alphabet;
		Scanner UserInput = new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		alphabet=UserInput.next().toUpperCase().charAt(0);
		return alphabet;
		
	}
	public static void showBoard(char[] board)
	{
		System.out.println("\n" + board [1] + "|" + board[2] + " | " + board[3]);
		System.out.println("--------");
		System.out.println(board [4] + "|" + board[5] + " | " + board[6]);
		System.out.println("--------");
		System.out.println(board [7] + "|" + board[8] + " | " + board[9]);
		System.out.println("--------");
		
	}
	public static char[] createBoard()
	{
		char[] board = new char[10];
		for(int index =0; index < board.length; index++)
		{
			board[index] = ' ';
		}
		return board;
	}
}

