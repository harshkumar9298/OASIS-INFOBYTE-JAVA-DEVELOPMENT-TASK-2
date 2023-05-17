package com.GuessTheNumber.Program;

import java.util.Random;
import java.util.Scanner;

class Game_GTN{
	int random;
	int uInput;
	int noOfGuesses = 0;
	Scanner s=new Scanner(System.in);
	//constructor call
	Game_GTN(){
		Random r=new Random();
		random = r.nextInt(100)+1; 
	}
	
	//user input
	public boolean UInput() {
		
		if ( noOfGuesses < 10 ) {
			System.out.print("Guess the number : ");
			uInput = Integer.parseInt(s.nextLine());
			noOfGuesses++;
			return true;
		}
		else {
			System.out.println("Number of attempts finished...Better luck next time\n");
			return false;
		}
		
	}
	
	//guessing the number
	public boolean Guess() {
		if ( random == uInput ) {
			System.out.println("Congratulations, you guess the number " + random +
			" in " + noOfGuesses + " guesses");
			switch(noOfGuesses) {
				case 1:
				System.out.println("Your score is 100");
				break;
				case 2:
				System.out.println("Your score is 90");
				break;
				case 3:
				System.out.println("Your score is 80");
				break;
				case 4:
				System.out.println("Your score is 70");
				break;
				case 5:
				System.out.println("Your score is 60");
				break;
				case 6:
				System.out.println("Your score is 50");
				break;
				case 7:
				System.out.println("Your score is 40");
				break;
				case 8:
				System.out.println("Your score is 30");
				break;
				case 9:
				System.out.println("Your score is 20");
				break;
				case 10:
				System.out.println("Your score is 10");
				break;
			}
			System.out.println();
			return false;
		}
		else if ( noOfGuesses < 10 && uInput > random ) {
			if ( uInput - random > 10 ) {
				System.out.println("Too High");
			}
			else {
				System.out.println("Little High");
			}
		}
		else if ( noOfGuesses < 10 && uInput < random ) {
			if ( random - uInput > 10 ) {
				System.out.println("Too low");
			}
			else {
				System.out.println("Little low");
			}
		}
		return true;
	}
	
	
}
public class GuessTheNumber {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("\n1.Start The Game \n2.Exit");
		System.out.println("Enter Your Choice : ");
		int choice=Integer.parseInt(s.nextLine());
		int nextRound = 1;
		int noOfRound = 0;
		if(choice==1) {
			while(nextRound==1) {
				//Constructor Call
				Game_GTN gtn=new Game_GTN();
				boolean limit=true;
				boolean match=true;
				System.out.println("\nRound " + ++noOfRound + " starts...");
				
				// to check correct guess and limit cross
				while ( match && limit) {
					limit = gtn.UInput();
				    match = gtn.Guess();
				}
				// input for next round
				System.out.println("1. Next Round \n2. Exit");
				System.out.println("Enter your choice : ");
				nextRound = Integer.parseInt(s.nextLine());
				if ( nextRound != 1 ) {
					System.out.println("Exited...");
					System.exit(0);
				}
			}//end of While
		}//end of if
		else {
			System.out.println("Exited...");
		}//end of else
	}

}
