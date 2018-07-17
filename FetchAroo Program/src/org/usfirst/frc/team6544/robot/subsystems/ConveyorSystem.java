package org.usfirst.frc.team6544.robot.subsystems;

import org.usfirst.frc.team6544.robot.RobotMap;
import org.usfirst.frc.team6544.robot.commands.StopFeed;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ConveyorSystem extends Subsystem {

	final private WPI_TalonSRX conveyor = new WPI_TalonSRX(RobotMap.conveyorMotor);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new StopFeed());
    }
    
    /**
 	* Speed Control For Conveyor Motor 
 	*
 	* @param a set either true for open or false for close
 	*/
	public void shoot(double speed) {
		conveyor.set(speed);
	}
	
	public void stop() {
		conveyor.stopMotor();
	}
}

