package example;

import robocode.Robot;

public class ExampleRobot extends Robot {
    @Override
    public void run() {

        double height = getBattleFieldHeight();
        double height_lim = height /5;
        double width = getBattleFieldWidth();
        double width_lim = width / 5;

        while(true){

            double x = getX();
            double y = getY();

            if (x > height - height_lim){
                turnLeft(90);
            } else if (x < height_lim) {
                turnLeft(90);
            }
            else if (y > width - width_lim){
                turnLeft(90);
            } else if (y < width_lim) {
                turnLeft(90);
            }

            double heading = getHeading();

            ahead(100);
        }

    }


}
