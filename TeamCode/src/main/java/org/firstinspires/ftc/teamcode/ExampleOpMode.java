package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

import java.io.IOException;

import Ori.Coval.Logging.AutoLogManager;
import Ori.Coval.Logging.Logger.KoalaLog;

@TeleOp
public class ExampleOpMode extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        ElapsedTime elapsedTime = new ElapsedTime();
        ExampleSubsystemAutoLogged exampleSubsystem = new ExampleSubsystemAutoLogged(hardwareMap);

        KoalaLog.setup(hardwareMap);

        waitForStart();

        elapsedTime.reset();

        while (opModeIsActive()) {
            AutoLogManager.periodic();

            if (elapsedTime.time() > 3) {
//                exampleSubsystem.setPosition(exampleSubsystem.getChangedPosition());
                elapsedTime.reset();
            }

            testPose.pose++;

            // Pose2D: x = 1.0, y = 2.0, rotation = 90 degrees

            KoalaLog.logPose2d("Robot", 3.0, 5.0, Math.toRadians(45), false);
            KoalaLog.logTranslation2d("translation2d", 1.0, 0.5, false);
            KoalaLog.logRotation2d("rotation2d", Math.toRadians(90), false);

        }

    }

}