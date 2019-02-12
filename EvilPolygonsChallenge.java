package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
		//2. Set the speed to 100
		rob.setSpeed(100);
		rob.miniaturize();
		int colorChoice=JOptionPane.showOptionDialog(null, "Choose color", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Blue", "Green"}, 0);
		System.out.println(colorChoice);
		if(colorChoice == 0) {
			rob.setPenColor(Color.red);
		}
		if(colorChoice == 1) {
			rob.setPenColor(Color.blue);
		}
		if(colorChoice == 2) {
			rob.setPenColor(Color.green);
		}
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		
		//4. Ask the use how many polygons they want to be drawn.
		String polygons = JOptionPane.showInputDialog("HOw many polygons do you want?");
		int polygons2 = Integer.parseInt(polygons);
		//5. Use the robot to draw the number of polygons the user requested.
		for(int i=1; i<= polygons2;i++) {
		rob.penDown();
		rob.move(10);
		rob.turn(90);
		rob.move(10);
		rob.turn(90);
		rob.move(10);
		rob.turn(90);
		rob.move(10);
		rob.turn(90);
		rob.move(10);
		rob.penUp();
		rob.move(20);
	
	}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

