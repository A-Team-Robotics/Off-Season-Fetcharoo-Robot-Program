package org.usfirst.frc.team6544.robot.commands;

import org.usfirst.frc.team6544.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class GateOne extends InstantCommand {

    public GateOne() {
    	super();
        // Use requires() here to declare subsystem dependencies
        requires(Robot.solenoids);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.solenoids.gateOneOpen();
    }
    
}
