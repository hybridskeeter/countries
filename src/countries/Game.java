package countries;

import java.io.Console;

public class Game {

	private static final String CAPITAL = "Canberra";

	public static void main(String[] args) {
		System.out.println("Welcome to the capitals game");
		
		Console console = System.console();
		
		String ans = console.readLine("What is the capital of Australia?", null);
		
		if(ans.equalsIgnoreCase(CAPITAL)){
			System.out.println("Correcto!");
		}else{
			System.out.println("No, the answer is " + CAPITAL);
		}
	}

}
