package io.github.TAMaurice.Main;

import java.util.Scanner;

public class CommandHandler {
	
	public static void getCommand() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		switch(input) {
		
			case "work":
				Variables.score = Variables.score + Variables.addedValue;
				System.out.println("Worked successfully for +" + Variables.addedValue);
				System.out.println("Your worker*s added: " + Variables.spr);
				break;
				
				
			case "buy":
				System.out.println("You have to define you want to buy.");
				break;
				
				
			case "buy tools":
				
				if (Variables.score > 0) {
				System.out.println("You bought yourself a nice set of tools, hope that helps at work!");
				System.out.println("Added 1 to gain per work");
				Variables.addedValue++;
				Variables.score--;
				
				} else { System.out.println("You cannot afford that."); }
				
				break;
				
				
			case "buy workers":
				
				if (Variables.score > 5 && Variables.addedValue > 0) {
				System.out.println("You hired a worker, hope he helps you efficiently at work!");
				System.out.println("Added 1 Score per Round, removed 1 tool");
				Variables.spr++;
				Variables.addedValue--;
				Variables.score = Variables.score - 5;
				
				} else if (Variables.addedValue < 0) { System.out.println("You do not have the tools for the worker");
				} else if (Variables.score < 5) { System.out.println("You do not have enough money to afford a worker"); 
				} else { System.out.println("You do not have enough money and tools to afford a worker"); }
				
				break;
				
				
			case "skip":
				break;
				
				
			default:
				System.out.println("Unknown command " + input);
				break;
				
		}
	
	}

}
