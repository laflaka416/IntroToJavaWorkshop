package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {

Robot Kirito = new Robot(); 

Kirito.penDown();
Kirito.setSpeed(10);
		
for (int i = 0; i <200; i++) {
	


Kirito.setRandomPenColor();	

Kirito.move(5*i);
		
Kirito.turn(360/10);

		

Kirito.setPenWidth(i);
Kirito.hide();
}
	}
}
