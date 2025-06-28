package org.firstinspires.ftc.teamcode;

import java.util.function.DoubleSupplier;

import Ori.Coval.Logging.AutoLogOutput;
import Ori.Coval.Logging.AutoLogPose2d;

//TODO: test with both AutoLogOutput and AutoLogPose2d
public class testPose {

    @AutoLogOutput
    public static DoubleSupplier pose231 = ()->0.0;

    @AutoLogOutput
    public static double pose = 0.0;

    @AutoLogOutput
    public static double getPose(){
        return pose;
    }

    @AutoLogPose2d
    public static float[] poseArray = new float[3];

    @AutoLogPose2d
    public static float[] getPose2d(){
        return poseArray;
    }


}
