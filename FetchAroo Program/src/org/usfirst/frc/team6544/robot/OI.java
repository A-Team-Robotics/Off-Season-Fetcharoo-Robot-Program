/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6544.robot;

import org.usfirst.frc.team6544.robot.commands.GateOne;
import org.usfirst.frc.team6544.robot.commands.GateOneClose;
import org.usfirst.frc.team6544.robot.commands.GateTwo;
import org.usfirst.frc.team6544.robot.commands.GateTwoClose;
import org.usfirst.frc.team6544.robot.commands.LoadBall;
import org.usfirst.frc.team6544.robot.commands.ShootOne;
import org.usfirst.frc.team6544.robot.commands.ShootTwo;
import org.usfirst.frc.team6544.robot.commands.SlowFeed;
import org.usfirst.frc.team6544.robot.commands.SlowShoot;
import org.usfirst.frc.team6544.robot.commands.SpeedControl;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	public static Joystick driveController = new Joystick(0);
	Joystick shootingController = new Joystick(1);
	 Button shootOne = new JoystickButton(shootingController, 1);
	 Button slowFeed = new JoystickButton(shootingController, 2);
	 Button shoot2 = new JoystickButton(shootingController, 3);
	 Button gateOne = new JoystickButton(shootingController, 9);
	 Button	gateTwo = new JoystickButton(shootingController, 10);
	 Button conveyorAndShoot = new JoystickButton(shootingController,7);
     Button	rapidFire = new JoystickButton(shootingController, 8);
     Button loadBall = new JoystickButton(shootingController, 5);
	 Button conveyor = new JoystickButton(shootingController,6);
	 Button speedOne = new JoystickButton(driveController, 7);
	 Button speedTwo = new JoystickButton(driveController, 8);
	 Button speedThree = new JoystickButton(driveController, 3);

	 public OI() {
		 conveyorAndShoot.whileHeld(new SlowShoot());
		 shoot2.whileHeld(new ShootTwo());
		 speedOne.whenPressed(new SpeedControl(1));
		 speedTwo.whenPressed(new SpeedControl(1.5));
		 speedThree.whenPressed(new SpeedControl(2));
		 gateOne.whenPressed(new GateOne());
		 gateOne.whenReleased(new GateOneClose());
		 gateTwo.whenPressed(new GateTwo());
		 gateTwo.whenReleased(new GateTwoClose());
		 shootOne.whileHeld(new ShootOne(1.0));
		 slowFeed.whileHeld(new SlowFeed(0.4));
	     //constantShoot.whileHeld(new SlowShoot());
		 //loadBall.whileHeld(new LoadBall());
	 }
}
