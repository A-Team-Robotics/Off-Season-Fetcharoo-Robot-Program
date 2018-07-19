/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6544.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//Motors connected to a talon
	public static final int kFronLeftCIM = 7;
	public static final int kBackRightCIM = 0;
	public static final int kFrontRightCIM = 6;
	public static final int kBackLeftCIM = 4;
	public static final int shootingMotorOne = 2;
	public static final int conveyorMotor = 1;
	public static final int shootingMotorTwo = 5;
	//Solenoids
	public static final int kGATE1[] = {0,1};
	public static final int kGATE2[] = {2,3};
	//OI
	public static final int buzzer = 0;
	public static final int rangeFinder = 1;
	
}
