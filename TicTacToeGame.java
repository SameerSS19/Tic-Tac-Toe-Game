package com.tictactoy;

public class TicTacToeGame 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Tic Tac Toe Game");
		char[] board = createBoard();
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
