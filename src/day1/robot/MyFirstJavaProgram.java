package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE

		Robot bob = new Robot();
		bob.penDown();
		bob.setPenWidth(1000);
		bob.setPenColor(Color.green);
		bob.setSpeed(20);
		bob.turn(90);
		bob.move(200);
		bob.turn(90);
		bob.move(200);
		bob.turn(90);
		bob.move(200);
		bob.turn(90);
		bob.move(200);

	}
}
