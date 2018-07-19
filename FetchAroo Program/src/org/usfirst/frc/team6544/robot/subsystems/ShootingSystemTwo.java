package org.usfirst.frc.team6544.robot.subsystems;

import org.usfirst.frc.team6544.robot.Robot;
import org.usfirst.frc.team6544.robot.RobotMap;
import org.usfirst.frc.team6544.robot.commands.Nothing1;
import org.usfirst.frc.team6544.robot.commands.StopShootingTwo;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class ShootingSystemTwo extends Subsystem {
	private double in_min = -1;
	private double in_max = 1;
	private double out_max = 100;
	private double out_min = 1;
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
		shooterTwo.set(0.0);
	}
	public double map(double x){
	    return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
	}
	public void log() {
		SmartDashboard.putNumber("Ball Speed", map(Robot.m_oi.shootingController.getThrottle()));
	}
}

