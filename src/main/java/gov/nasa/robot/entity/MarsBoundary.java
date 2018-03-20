package gov.nasa.robot.entity;

public class MarsBoundary {
	
	private int maxAxisX;
	private int maxAxisY;
	
	public MarsBoundary(int xPositions, int yPositions) {
		this.maxAxisX = xPositions - 1;
		this.maxAxisY = yPositions - 1;
	}
	
	public int getMaxAxisX() {
		return maxAxisX;
	}
	
	public void setMaxAxisX(int maxAxisX) {
		this.maxAxisX = maxAxisX;
	}
	
	public int getMaxAxisY() {
		return maxAxisY;
	}
	
	public void setMaxAxisY(int maxAxisY) {
		this.maxAxisY = maxAxisY;
	}
	
}
