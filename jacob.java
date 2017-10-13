// jacobs first legit rock paper scissors program
// this level of syntax neatness is what we are aiming for

import java.util.Scanner;
import java.util.Random;
public class Rockpsls { 
	public static void main(String[] args) throws java.lang.Exception {
		@SuppressWarnings("resource")
		Scanner Jekub = new Scanner(System. in );
		Random rnd = new Random();
		int input;
		int B = 1;
		System.out.println("Rock Paper Scissors lizard Spock be jealous of me");

		System.out.println("Pick 1,2,3,4, or 5 for:");
		System.out.println("ROCK (1), PAPER(2), SCISSOR (3), lizard (4), or Spock (5)");
		while (B != 0) {
			// 1 = rock
			// 2 = paper
			// 3 = scissors
			// 4 = lizard
			// 5 = Spock
			// N= Jekub.nextInt();
			int Rock = 1, Paper = 2, Scissor = 3, lizard = 4, Spock = 5;
input = Jekub.nextInt();
	int randomNumber = rnd.nextInt(5 - 1 + 1) + 1;
	try  { if (randomNumber == Rock) {
if (input == Rock) {
					System.out.println("Rock Vs. Rock: TIE");
	



} else if (input == Paper) {
			System.out.println("Paper Vs. Rock: YOU WIN");
			} else if (input == Scissor) {
					System.out.println("Scissor Vs. Rock: YOU LOSE");
				} else if (input == lizard) {
					System.out.println("Lizard Vs. Rock: YOU LOSE");
				} else if (input == Spock) {
					System.out.println("Spock Vs. Rock: YOU WIN");
				}
			
	
	
	}  else if (randomNumber == Paper) {
		if (input == Rock) {
			System.out.println("Rock Vs. Paper: YOU LOSE");
				} else if (input == Paper) {
		System.out.println("Paper Vs. Paper: TIE");
		} else if (input == Scissor) {
			System.out.println("Scissor Vs. Paper: YOU WIN");
				} else if (input == lizard) {
					System.out.println("Lizard Vs. paper: YOU WIN");
				} else if (input == Spock) {
					System.out.println("Spock Vs. Paper: YOU LOSE"); 
				

			
			
			
			} else if (randomNumber == Scissor) {
				if (input == Rock) {
		System.out.println("Rock Vs. Scissor: YOU WIN");
		} else if (input == Paper) {
			System.out.println("Paper Vs. Scissor: YOU LOSE");
	} else if (input == Scissor)  {
		System.out.println("Scissor Vs. Scissor: TIE");
	} else if (input == lizard)  {
		System.out.println("lizard Vs. Scissor: YOU LOSE");
	} else if (input == Spock)  {
		System.out.println("Spock Vs. Scissor YOU WIN");
	
	
				
			}else if (randomNumber == lizard) {
		     if (input == Rock) {
				System.out.println("rock Vs. lizard: YOU WIN");
					} else if (input == Paper) {
			System.out.println("Paper Vs. lizard: YOU LOSE");
			} else if (input == Scissor) {
				System.out.println("Scissor Vs. lizard: YOU WIN");
					} else if (input == lizard) {
						System.out.println("Lizard Vs. lizard: TIE");
					} else if (input == Spock) {
						System.out.println("Spock Vs. lizard: YOU WIN");
					}
				} else if (randomNumber == Spock) {
					if (input == Rock) {
			System.out.println("Rock Vs. Spock: YOU LOSE");
			} else if (input == Paper) {
				System.out.println("Paper Vs. Spock: YOU WIN");
		} else if (input == Scissor) {
			System.out.println("Spock Vs. Spock: TIE");
				} else if (input == lizard){
					System.out.println("Lizard Vs. Spock: YOU WIN");
				} else if (input == Spock) {
					System.out.println("Scissors Vs. Spock: YOU LOSE"); 
				}
				}
			}
	
	
				
				
						
						
						
				
				
					
			
			

    
  
		


	

