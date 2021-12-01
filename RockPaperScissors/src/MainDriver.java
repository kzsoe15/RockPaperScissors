
public class MainDriver {
	
	public static void rps(String player1, String player2) {
		
		switch(player1) {
		case "rock":
			if (player2.equals("rock"))
				System.out.println("TIE");
			else if (player2.equals("paper"))
				System.out.println("Player 2 wins");
			else if (player2.equals("scissors"))
				System.out.println("Player 1 wins");
			break;
		
		case "paper":
			if (player2.equals("rock"))
				System.out.println("Player 1 wins");
			else if (player2.equals("paper"))
				System.out.println("TIE");
			else if (player2.equals("scissors"))
				System.out.println("Player 2 wins");
			break;
			
		case "scissor":
			if (player2.equals("rock"))
				System.out.println("Player 2 wins");
			else if (player2.equals("paper"))
				System.out.println("Player 1 wins");
			else if (player2.equals("scissors"))
				System.out.println("TIE");
			break;
		}
	}
}
