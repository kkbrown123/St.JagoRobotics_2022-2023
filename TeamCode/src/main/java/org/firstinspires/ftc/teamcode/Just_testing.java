package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
@TeleOp (name = "Motor", group = "TeleOp")

public class Just_testing extends OpMode {
//what the hell
    Robot_Hardware Test = new Robot_Hardware();
    private ElapsedTime runtime = new ElapsedTime();

    public void init(){
        Test.init(hardwareMap);
        telemetry.addData("Status", "Initialized");
        telemetry.update();
    }

    public void init_loop() {
        super.init_loop();
    }

    public void start(){

    }

    public void loop() {



        Test.leftDrive.setPower(gamepad1.left_stick_y);


        telemetry.addData("Status", "Run Time: " + runtime.toString());
    }


}
