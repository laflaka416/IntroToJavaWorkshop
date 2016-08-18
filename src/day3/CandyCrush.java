package day3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
	
String answer = JOptionPane.showInputDialog(null, "what do you not like?");

		JOptionPane.showMessageDialog(null, "You totally have a crush on " + answer);
		
String answer2 = JOptionPane.showInputDialog(null, "what is the name of your best friend?");
		
JOptionPane.showMessageDialog(null,  "your best friend, " + answer2 + ",is as sweet as candy ");
	} 
}



