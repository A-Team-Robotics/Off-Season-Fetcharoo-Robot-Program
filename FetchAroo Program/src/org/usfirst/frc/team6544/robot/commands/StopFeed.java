package org.usfirst.frc.team6544.robot.commands;

import org.usfirst.frc.team6544.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class StopFeed extends InstantCommand {

    public StopFeed() {
        super();
        // Use requires() here to declare subsystem dependencies
        requires(Robot.conveyor);
    }

    // Called once when the command executes
    protected void initialize() {
    	Robot.conveyor.stop();
    }

}
