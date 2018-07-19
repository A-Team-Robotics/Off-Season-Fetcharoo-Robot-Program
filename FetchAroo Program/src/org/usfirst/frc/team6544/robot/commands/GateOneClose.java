package org.usfirst.frc.team6544.robot.commands;

import org.usfirst.frc.team6544.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class GateOneClose extends InstantCommand {

    public GateOneClose() {
        super();
        // Use requires() here to declare subsystem dependencies
        requires(Robot.solenoids);
    }

    // Called once when the command executes
    protected void initialize() {
    	Robot.solenoids.gateOneClose();
    }
    @Override
    protected boolean isFinished() {
    	// TODO Auto-generated method stub
    	Timer.delay(0.1);
    	return true;
    }

}
