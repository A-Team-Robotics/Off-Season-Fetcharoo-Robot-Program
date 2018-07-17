package org.usfirst.frc.team6544.robot.subsystems;

import org.usfirst.frc.team6544.robot.RobotMap;
import org.usfirst.frc.team6544.robot.commands.Nothing1;
import org.usfirst.frc.team6544.robot.commands.StopShootingTwo;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ShootingSystemTwo extends Subsystem {

	final private WPI_TalonSRX shooterTwo = new WPI_TalonSRX(RobotMap.shootingMotorTwo);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new StopShootingTwo());
    }
    /**
 	* Speed Control For Shooter Motor One
 	*
 	* @param a set either true for open or false for close
 	*/
	public void shoot(double speed) {
		shooterTwo.set(speed);
	}
	
	public void stop() {
		shooterTwo.stopMotor();
	}
}

