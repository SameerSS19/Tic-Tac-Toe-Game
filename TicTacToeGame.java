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
		char win =winnerCheck(board);
		System.out.println("Winner is " + win);
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
	public static char winnerCheck(char[] board)
	{
		for( int i = 1; i < 3; i++ )  
	    {
			for(int j = 1;j <= i; j = j+3)
			{
				if( ( board[j] == 'X') && ( board[i+j] == 'X') && ( board[i+j+1] == 'X' ) )
				{
					return 'X';
				}
				if( ( board[j] == 'O' ) && ( board[i+j] == 'O' ) && ( board[i+j+1] == 'O' ) )
				{
					return 'O';
				}
			}
	    }
	    for( int i = 1; i < 3; i++ ) 
	    {
	    	for(int j = 1;j <= i; j++)
	    	{
	    		if( ( board[j] == 'X' ) && ( board[j+i+2] == 'X' ) && ( board[j+i+5] == 'X' ) )
	    		{
	    			return 'X';
	    		}
	        
	    		if( ( board[j] == 'O' ) && ( board[j+i+2] == 'O' ) && ( board[j+i+5] == 'O' ) )
	    		{
	    			return 'O';
	    		}
	    	}
	    }
	    // For Diagonal
	    
	    if( ( board[1] == 'X' ) &&  ( board[5] == 'X' ) &&  ( board[9] == 'X' ) )
	        return 'X';
	    if( ( board[3] == 'X' ) &&  ( board[5] == 'X' ) &&  ( board[7] == 'X' ) )
	    	return 'X';
	    if( ( board[1] == 'O' ) &&  ( board[5] == 'O' ) &&  ( board[9] == 'O' ) )
	    	return 'O';
	    if( ( board[3] == 'O' ) &&  ( board[5] == 'O' ) &&  ( board[7] == 'O' ) )
	    	return 'O';
	    
	    for( int i = 1; i < board.length; i++ )
	    {
	    	int  cell=0;
	    	if(board[i]!=' ')
	    	{
	    		cell++;
	    	}
	    	if(cell==9)
	    	{
	    	System.out.println("Match is tie");
	    	}
	    }
		return 0;
	}
}

