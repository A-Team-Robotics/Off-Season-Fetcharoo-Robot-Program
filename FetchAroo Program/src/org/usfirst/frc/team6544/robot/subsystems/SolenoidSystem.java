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
    public void gateOneOpen() {
    		gateone.set(Value.kForward);
    
    }
    public void gateOneClose() {
	
		gateone.set(Value.kReverse);

}
    
    /**
	 * Gate Two Control open or close
	 *
	 * @param a set either true for open or false for close
	 */
    public void gateTwoOpen() {
    	
    		gatetwo.set(Value.kReverse);
    	
    		
    	
    }
    public void gateTwoClose() {
    	gatetwo.set(Value.kForward);
    }
}

