package treamcode;

import java.util.ArrayList;

import static treamcode.RobotMovement.followCurve;


public class MyOpMode extends OpMode {

    @Override
    public void init() {


    }

    @Override
    public void loop() {
        ArrayList<CurvePoint> allPoints = new ArrayList<>();
        allPoints.add(new CurvePoint(180, 180, 0.5, 0.5, 50.0, Math.toRadians(90), 1.0));
        allPoints.add(new CurvePoint(0, 0, 0.5, 0.5, 10.0, Math.toRadians(90), 1.0));
        
        followCurve(allPoints, Math.toRadians(90));
        
    }
    
    

}
