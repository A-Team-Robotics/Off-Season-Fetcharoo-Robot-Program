package org.usfirst.frc.team6544.robot.commands;

import org.usfirst.frc.team6544.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class Nothing extends InstantCommand {

    public Nothing() {
        super();
        // Use requires() here to declare subsystem dependencies
        requires(Robot.solenoids);
    }

    // Called once when the command executes
    protected void initialize() {
    }

}
