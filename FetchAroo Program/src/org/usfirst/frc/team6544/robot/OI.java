/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6544.robot;

import org.usfirst.frc.team6544.robot.commands.GateOne;
import org.usfirst.frc.team6544.robot.commands.GateTwo;
import org.usfirst.frc.team6544.robot.commands.LoadBall;
import org.usfirst.frc.team6544.robot.commands.ShootOne;
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
	Joystick driveController = new Joystick(0);
	Joystick shootingController = new Joystick(1);
	 Button shootOne = new JoystickButton(shootingController, 1),
				oneShot = new JoystickButton(shootingController, 2),
				rapidFire = new JoystickButton(shootingController, 3),
				constantShoot = new JoystickButton(shootingController, 4),
				gateOne = new JoystickButton(shootingController, 5),
				gateTwo = new JoystickButton(shootingController, 6),
				loadBall = new JoystickButton(shootingController, 7),
				media2 = new JoystickButton(shootingController, 8);
	 Button speedOne = new JoystickButton(driveController, 1),
				speedTwo = new JoystickButton(driveController, 2),
				speedThree = new JoystickButton(driveController, 3);

	 public OI() {
		 speedOne.whenPressed(new SpeedControl(1));
		 speedTwo.whenPressed(new SpeedControl(1.5));
		 speedThree.whenPressed(new SpeedControl(2));
		 gateOne.whenPressed(new GateOne());
		 gateTwo.whenPressed(new GateTwo());
		 shootOne.whenPressed(new ShootOne(1.0));
	     constantShoot.whileHeld(new SlowShoot());
		 loadBall.whileHeld(new LoadBall());
	 }
}
