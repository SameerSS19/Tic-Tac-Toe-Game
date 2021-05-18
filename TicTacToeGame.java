package com.tictactoy;
import java.util.Scanner;

public class TicTacToeGame 
{
	public static void main(String[] args) 
	{
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
		System.out.println("Computer Letter is: " + ComputerLetter + " User Letter is:" + UserLetter);
	}
	public static char chooseLetter()
	{
		char alphabet;
		Scanner UserInput = new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		alphabet=UserInput.next().toUpperCase().charAt(0);
		return alphabet;
		
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
