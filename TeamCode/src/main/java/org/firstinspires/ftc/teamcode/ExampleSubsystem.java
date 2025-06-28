package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;

import Ori.Coval.Logging.AutoLog;
import Ori.Coval.Logging.AutoLogOutput;
import Ori.Coval.Logging.AutoLogPose2d;
import Ori.Coval.Logging.SupplierLog;

@AutoLog
public class ExampleSubsystem {


    @AutoLogOutput
    public static DoubleSupplier pose231 = ()->0.0;

    @AutoLogOutput
    public static double pose = 0.0;
//
    @AutoLogOutput
    public static double getPose(){
        return pose;
    }

    @AutoLogPose2d
    public static float[] poseArraysdf = new float[3];

    @AutoLogPose2d
    public static float[] getPose2d(){
        return poseArraysdf;
    }


    Servo servo;

    public double open = 0.0;
    public double closed = 1.0;

    public static float[] poseArray = new float[3];
//    @AutoLogOutput
//    public static DoubleSupplier positionSupplier = () -> 3;

//    @AutoLogOutput
//    public BooleanSupplier isPositionChanged = () -> positionSupplier.getAsDouble() != getChangedPosition();

    public ExampleSubsystem(HardwareMap hardwareMap) {
        servo = hardwareMap.get(Servo.class, "ser");
    }

//    @AutoLogPose2d
//    public static float[] getPoseArray() {
//        return poseArray;
//    }

    public void setPosition(double position) {
        servo.setPosition(position);
    }

//    @AutoLogOutput(postToFtcDashboard = false)
//    public double getChangedPosition() {
//        return positionSupplier.getAsDouble() == open ? closed : open;
//    }
}
