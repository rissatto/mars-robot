package gov.nasa.robot.controller;

import gov.nasa.robot.exception.InvalidCommandException;
import gov.nasa.robot.exception.RobotException;

public class InputController {

	public String process(String steps) throws RobotException {
		
		if(!steps.matches("^[MLR]+$"))
			throw new InvalidCommandException();
		
		RobotController robot = new RobotController();
		
		for (char command : steps.toCharArray()) {
			switch (command) {
			case 'L':
				robot.RotateLeft();
				break;
			case 'R':
				robot.RotateRight();
				break;
			case 'M':
				robot.goAhead();
				break;
			}
		}
		
		return robot.getPosition();
	}
}
