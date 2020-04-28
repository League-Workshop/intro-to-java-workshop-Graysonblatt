package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot dash = new Robot();
		
		dash.penDown();
		dash.setSpeed(100);
		for (int i = 0; i < 4; i++) {
			dash.move(200);
			dash.turn(90);
				
		}
		
	}
}
