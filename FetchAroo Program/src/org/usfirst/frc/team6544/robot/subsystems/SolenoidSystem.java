package org.usfirst.frc.team6544.robot.subsystems;

import org.usfirst.frc.team6544.robot.RobotMap;
import org.usfirst.frc.team6544.robot.commands.Nothing;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SolenoidSystem extends Subsystem {

	final private DoubleSolenoid gateone = new DoubleSolenoid(8,RobotMap.kGATE1[0],RobotMap.kGATE1[1]);
	final private DoubleSolenoid gatetwo = new DoubleSolenoid(8,RobotMap.kGATE2[0],RobotMap.kGATE2[1]);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Nothing());
    }
    
    /**
	 * Gate One Control open or close
	 *
	 * @param a set either true for open or false for close
	 */
    public void setGateOne(boolean a) {
    	if(a == true) {
    		gateone.set(Value.kForward);
    	}else {
    		gateone.set(Value.kReverse);
    	}
    }
    
    /**
	 * Gate Two Control open or close
	 *
	 * @param a set either true for open or false for close
	 */
    public void setGateTwo(boolean a) {
    	if(a == true) {
    		Timer.delay(0.5);
    		gatetwo.set(Value.kForward);
    	}else {
    		Timer.delay(0.5);
    		gatetwo.set(Value.kReverse);
    	}
    }
}

