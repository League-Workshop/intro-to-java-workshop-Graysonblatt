package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("Who is the yeet god?");
		// 3.  Use an if statement to check if their answer is correct
		if (answer.equals ("Lazarbeam")); {
		JOptionPane.showMessageDialog(null, "Good job. Yeet. You got 2 points");
		score ++;
		score ++;
		}
	//	else {
			JOptionPane.showMessageDialog(null, "Wrong. It's Lazarbeam. Sorry if you didn't capitalize.");
		score--;
		}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String answer1 = JOptionPane.showInputDialog("What is your favorite color?");
		// 3.  Use an if statement to check if their answer is correct
		if (answer1.equals ("yellow")); {
		JOptionPane.showMessageDialog(null, "WRONG. It is orange. sorry if you capatilized.");
		score --;	
		
	//	} else {
			JOptionPane.showMessageDialog(null, "YOU ARE SO WRONG. it's yellow.");
		score --;
		}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "Your score is:" +score);
	}
}
