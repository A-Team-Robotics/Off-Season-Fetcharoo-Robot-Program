package org.usfirst.frc.team6544.robot.commands;

import org.usfirst.frc.team6544.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GateOne extends Command {

    public GateOne() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.solenoids);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.solenoids.setGateTwo(true);
    }
    
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	Timer.delay(0.45);
        return true;
    }
   
    protected void end() {
    	Robot.solenoids.setGateTwo(false);
    }
    
}
