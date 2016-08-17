package day3;

import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {


	public static void main(String[] args) {
		
for (int i = 0; i <10; i++) {
	
String answer = JOptionPane.showInputDialog(null, "give me a sentence to speak");
	// 3. call the speak method below and send it the sentence
speak(answer); 
	// 4. repeat steps 2 and 3 a lot of times
}
	}

	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
