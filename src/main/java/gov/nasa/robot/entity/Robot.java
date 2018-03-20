package gov.nasa.robot.entity;

import gov.nasa.robot.enumeration.Orientation;

public class Robot {
	
	private Integer x;
	private Integer y;
	private Orientation orientation;
	
	public Robot() {
		this.x = 0;
		this.y = 0;
		this.orientation = Orientation.NORTH;
	}
	
	public Integer getX() {
		return x;
	}
	
	public void addX(Integer x) {
		this.x += x;
	}
	
	public Integer getY() {
		return y;
	}
	
	public void addY(Integer y) {
		this.y += y;
	}
	
	public Orientation getOrientation() {
		return orientation;
	}
	
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

}
