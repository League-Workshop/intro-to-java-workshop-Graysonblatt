package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String answer=JOptionPane.showInputDialog("Do you know how to write code?(answer in lowercases)");
// If they say "yes", tell them they will rule the world.
	if (answer == "yes") {
	JOptionPane.showMessageDialog(null, "you will rule the world! (maybe)");

}
		// 3. Otherwise, wish them good luck washing dishes.
else {
	JOptionPane.showMessageDialog(null, "Then you'll end up washing dishing for the rest of your life");
	
}
	}
}

