package org.usfirst.frc.team6544.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class SlowShoot extends CommandGroup {

    public SlowShoot() {
        addParallel(new ShootTwo());
        addParallel(new SlowFeed(0.4));
    }
}
