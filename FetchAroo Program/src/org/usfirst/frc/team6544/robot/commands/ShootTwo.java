package org.usfirst.frc.team6544.robot.commands;

import org.usfirst.frc.team6544.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class ShootTwo extends InstantCommand {
	
	public ShootTwo() {
        super();
        
        // Use requires() here to declare subsystem dependencies
       requires(Robot.shooterTwo);
    }

    // Called once when the command executes
    protected void initialize() {
    	Robot.shooterTwo.shoot(Robot.shooterTwo.map(Robot.m_oi.shootingController.getThrottle()));
    }

}
