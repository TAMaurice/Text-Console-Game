package io.github.TAMaurice.Main;

/*
 This is a simple Java-Exercise I made, because I was bored.
 It's a simple console-based (I'll add a GUI later) 'Idle' Game.
 */

public class Main {
	
	// Main Method - Not much more
	public static void main(String[] args) throws InterruptedException {
		initialiseGame();
		
		boolean gameFinished = false;
		// Game Loop:
		while(gameFinished == false) {
			System.out.println("");
			System.out.println("Your score is " + Variables.score);
			Thread.sleep(1000);
			System.out.println("Input command:");
			CommandHandler.getCommand();
			Variables.score = Variables.score + Variables.spr;
			
			if(Variables.score > 99) {
				System.out.println("");
				System.out.println("Congratulations! You reached " + Variables.score + " Points!");
				System.out.println("Game Over!");
				gameFinished = true;
				
			}
			
		}
	
	}
	
	
	public static void initialiseGame() throws InterruptedException {
		System.out.println("Welcome!");
		Thread.sleep(1000);
		System.out.println("Please read the Manual to learn how the Game works!");
		Thread.sleep(1000);
		
	}

}
