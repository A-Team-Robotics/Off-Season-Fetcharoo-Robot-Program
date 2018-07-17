package org.usfirst.frc.team6544.robot.commands;

import org.usfirst.frc.team6544.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class SlowFeed extends InstantCommand {
	private double speed;
    public SlowFeed(double speed) {
        super();
        this.speed = speed;
        // Use requires() here to declare subsystem dependencies
        requires(Robot.conveyor);
    }

    // Called once when the command executes
    protected void initialize() {
    	Robot.conveyor.shoot(0.4);
    }

}
