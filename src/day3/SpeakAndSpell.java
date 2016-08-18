package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		
speak("e.g. spell  Ken Kaneki ");
		
String answer = JOptionPane.showInputDialog("spell it now");
	
if( answer.equalsIgnoreCase("Ken Kaneki")){
speak("correct");	
}

else
speak("wrong");
		// 5. repeat the process for other words
speak("e.g. spell Zaira Linares Lemus");		
String answer2 = JOptionPane.showInputDialog("Spell here");
if( answer2.equalsIgnoreCase("Zaira Linares Lemus")){
speak("correct");	
}
else
speak("incorrect");
	}
//speak("please spell Team Valor is great");
//String answer3 = JOptionPane.showInputDialog("please spell here");
//if( answer3.equalsIgnoreCase("Team Valor is great"))






	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


