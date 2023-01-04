package org.firstinspires.ftc.teamcode;



import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.CRServo;

import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.TouchSensor;

public class Robot_Hardware {
    //Initializing Devices
    public DcMotor rightDrive = null;
    public DcMotor leftDrive = null;
    public DcMotor lift_mot1 = null;
    public CRServo int_servo = null;
    public CRServo int_servo2 = null;
    public CRServo lift_servo = null;
    public TouchSensor lift_touch = null;
    public DcMotor carcel = null;

    HardwareMap hardwareMap = null;

    public void setSweepPower(double value){
        int_servo.setPower(value);
        int_servo2.setPower(value);
    }
    public void init(HardwareMap hardwareMap){
        // Defining Motors
        rightDrive = hardwareMap.get(DcMotor.class, "r_motor");
        leftDrive = hardwareMap.get(DcMotor.class, "l_motor");
        lift_mot1 = hardwareMap.get(DcMotor.class, "lift_mot1");
        carcel = hardwareMap.get(DcMotor.class, "lift_mot2");


        //Defining Servos
        int_servo = hardwareMap.get(CRServo.class,"Servo1");
        int_servo2 = hardwareMap.get(CRServo.class,"Servo2");
        lift_servo = hardwareMap.get(CRServo.class,"liftServo");

        lift_touch = hardwareMap.get(TouchSensor.class,"Touch");

        lift_touch.isPressed();


        rightDrive.setDirection(DcMotor.Direction.FORWARD);
        leftDrive.setDirection(DcMotor.Direction.REVERSE);
        lift_mot1.setDirection(DcMotor.Direction.REVERSE);
        carcel.setDirection(DcMotor.Direction.FORWARD);


//        rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        lift_mot1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//        rightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        leftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        lift_mot1.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        carcel.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);


        rightDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        lift_mot1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        carcel.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        int_servo.setPower(0);
        int_servo2.setPower(0);
        lift_servo.setPower(0);
    }
}
