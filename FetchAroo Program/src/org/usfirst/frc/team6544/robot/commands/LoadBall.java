package org.usfirst.frc.team6544.robot.commands;

import org.usfirst.frc.team6544.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class LoadBall extends Command {

    public LoadBall() {
    	super();
    	requires(Robot.solenoids);
    }
    
    protected void initialize() {
    	// TODO Auto-generated method stub
    	Robot.solenoids.gateOneOpen();
    	Timer.delay(0.2);
    	Robot.solenoids.gateOneClose();
    	Timer.delay(0.2);
    	Robot.solenoids.gateTwoOpen();
    	Timer.delay(0.2);
    	Robot.solenoids.gateTwoClose();
    }

	@Override
	protected boolean isFinished() {
		Timer.delay(1);
		return true;
	}
}
