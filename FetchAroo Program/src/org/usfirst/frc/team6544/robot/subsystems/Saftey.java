package org.usfirst.frc.team6544.robot.subsystems;

import org.usfirst.frc.team6544.robot.commands.SafteySense;

import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Saftey extends Subsystem {
	Ultrasonic ultra = new Ultrasonic(0,1);
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new SafteySense());
    }
    
    public Saftey() {
    	ultra.setAutomaticMode(true); // turns on automatic mode
    }

    public double ultrasonicSample() {
    	return ultra.getRangeMM(); // reads the range on the ultrasonic sensor
    }
    	
    public boolean safeDistance() {
    	if((int)ultrasonicSample() > 350) {
    		return true;
    	}else {
		return false;
    	}
    }
}

