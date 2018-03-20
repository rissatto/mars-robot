package gov.nasa.robot.behavior;

import gov.nasa.robot.exception.OutOfBoundsException;

/**
 * Interface para determinar os comportamentos do Robo
 * 
 * @author elison.rissatto
 */
public interface RobotBehavior {

	/**
	 * Comando para o robo movimentar conforme sua orientação (N, S, W, E)
	 * @throws OutOfBoundsException 
	 */
	public void goAhead() throws OutOfBoundsException;
	
	/**
	 * Comando para girar o robo para esquerda
	 */
	public void RotateLeft();

	/**
	 * Comando para girar o robo para direita
	 */
	public void RotateRight();
	
	/**
	 * Retorno da posição formatado conforme mascara: (X, Y, Orientação)
	 * 
	 * @return String com posição formadata
	 */
	public String getPosition();
	
}
