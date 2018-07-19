package org.usfirst.frc.team6544.robot.subsystems;

import org.usfirst.frc.team6544.robot.Robot;
import org.usfirst.frc.team6544.robot.RobotMap;
import org.usfirst.frc.team6544.robot.commands.StopShootingOne;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ShootingSystemOne extends Subsystem {

	final private WPI_TalonSRX shooterOne = new WPI_TalonSRX(RobotMap.shootingMotorOne);

	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new StopShootingOne());
    }
    
	/**
 	* Speed Control For Shooter Motor One
 	*
 	* @param a set either true for open or false for close
 	*/
	public void shoot(double speed) {
		shooterOne.set(speed);
	}
	
	public void stop() {
		shooterOne.stopMotor();
	}
}

