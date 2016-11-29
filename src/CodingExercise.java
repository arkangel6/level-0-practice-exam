
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/* Level 0 Practice: Coding  Exercise #1 */
public class CodingExercise {

	public static void main(String[] args) {
		// 1. Create a random number from 0 to 4 and store it in a ‘bases’ variable
		int bases = new Random().nextInt(5);
		System.out.println(bases);
		// 2. If the number is zero display a window that says “the batter is out”
		if (bases == 0) {
			JOptionPane.showMessageDialog(null, "the batter is out");
		} else if (bases == 1) {
			JOptionPane.showMessageDialog(null, "the batter hit a single");
		} else if (bases == 2) {
			JOptionPane.showMessageDialog(null, "the batter hit a double");
		} else if (bases == 3) {
			JOptionPane.showMessageDialog(null, "the batter hit a triple");
		} else if (bases == 4) {
			JOptionPane.showMessageDialog(null, "the batter hit a home run");
		}
		// 3. Otherwise display “the batter hit a ” and “single”, “double”, “triple” or “home run”

		// 4. Make the robot draw the path of the base runner. For example, if
		// the batter hit a double, draw a line from home plate to first and another line from
		// first to second. Home plate should be at the bottom and first should be on the
		// right. You do not need to draw the bases themselves or any other features.
		Robot runner = new Robot();
		runner.penDown();
		runner.setSpeed(10);
		runner.turn(45);
		for (int i = 0; i < bases; i++) {
			runner.move(150);
			runner.turn(-90);
		}

	}

}
