/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6544.robot;

import org.usfirst.frc.team6544.robot.subsystems.CameraProcessor;
import org.usfirst.frc.team6544.robot.subsystems.ConveyorSystem;
import org.usfirst.frc.team6544.robot.subsystems.DriveSystem;
import org.usfirst.frc.team6544.robot.subsystems.Saftey;
import org.usfirst.frc.team6544.robot.subsystems.ShootingSystemOne;
import org.usfirst.frc.team6544.robot.subsystems.ShootingSystemTwo;
import org.usfirst.frc.team6544.robot.subsystems.SolenoidSystem;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends TimedRobot {
	public static OI m_oi;
	public static DriveSystem drivesystem = new DriveSystem(); //creates drivesystem object\
	public static ShootingSystemOne shooterOne = new ShootingSystemOne();
	public static ShootingSystemTwo shooterTwo = new ShootingSystemTwo();
	public static SolenoidSystem solenoids = new SolenoidSystem();
	public static ConveyorSystem conveyor = new ConveyorSystem();
	public static Saftey saftey = new Saftey();
	 private CameraProcessor Cam1;
	Command m_autonomousCommand;
	SendableChooser<Double> m_chooser = new SendableChooser<>();

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		m_oi = new OI();
		Cam1 = new CameraProcessor("GripperCam",0);//set the camera name and what usb port it is connected to
		Cam1.start(); //Cam1.SendToDashboard("cam0");
		// chooser.addObject("My Auto", new MyAutoCommand());
		SmartDashboard.putData("Ball Distance", m_chooser);
		m_chooser.addDefault("Full Distance", 1.0);
		m_chooser.addObject("Half Distance",  0.5);
		m_chooser.addObject("Quater Distance", 0.35);
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * <p>You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		

		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */

		// schedule the autonomous command (example)
		if (m_autonomousCommand != null) {
			m_autonomousCommand.start();
		}
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (m_autonomousCommand != null) {
			m_autonomousCommand.cancel();
		}
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		Robot.shooterTwo.log();
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}
