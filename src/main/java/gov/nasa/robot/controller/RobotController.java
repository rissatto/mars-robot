package gov.nasa.robot.controller;

import gov.nasa.robot.behavior.RobotBehavior;
import gov.nasa.robot.entity.MarsBoundary;
import gov.nasa.robot.entity.Robot;
import gov.nasa.robot.exception.OutOfBoundsException;
import gov.nasa.robot.util.Utils;

/**
 * Classe que implementa o controlador do robo que controla a movimentacao;
 * @author elison.rissatto
 *
 */
public class RobotController implements RobotBehavior {
	
	private Robot robot;
	private MarsBoundary marsBoundary;

	public RobotController() {
		this.robot = new Robot();
		this.marsBoundary = new MarsBoundary(5, 5);
	}

	@Override
	public void goAhead() throws OutOfBoundsException {		
		robot.addX(robot.getOrientation().getXToAhead());
		robot.addY(robot.getOrientation().getYToAhead());
		
		if(!Utils.valueBetween(robot.getX(), 0, marsBoundary.getMaxAxisX()) || !Utils.valueBetween(robot.getY(), 0, marsBoundary.getMaxAxisY()))
			throw new OutOfBoundsException();
	}

	@Override
	public void RotateLeft() {
		robot.setOrientation(robot.getOrientation().getLeft());
	}

	@Override
	public void RotateRight() {
		robot.setOrientation(robot.getOrientation().getRight());		
	}
	
	@Override
	public String getPosition() {
		StringBuffer s = new StringBuffer("(");
		return s.append(this.robot.getX())
				.append(", ")
				.append(this.robot.getY())
				.append(", ")
				.append(this.robot.getOrientation().getAcronym())
				.append(")").toString();
	}

}
