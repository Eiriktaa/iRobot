package TrefferBareVeggen;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class TrefferBareVeggen extends Robot {
    @Override
    public void run() {

        double height = getBattleFieldHeight();
        double height_lim = height / 5;
        double width = getBattleFieldWidth();
        double width_lim = width / 5;

        while (true) {
            System.out.println(getBattleFieldHeight());
            System.out.println(getBattleFieldWidth());

            turnRadarRight(360);

            double x = getX();
            double y = getY();
            /*
             * if (x > height*0.85) {
             * turnLeft(180);
             * System.out,println("Hoyde mer enn 0.85");
             * }
             * else if (x < height*0.15) {
             * turnLeft(180);
             * System.out,println("Hoyde mindre enn 0.85");
             * }
             * if (y > width*0.85) {
             * turnLeft(180);
             * System.out,println("Bredde mer enn 0.85");
             * }
             * else if (y < width*0.15) {
             * turnLeft(90);
             * System.out,println("Hoyde mindre enn 0.85");
             * }
             * if (x >= height - height_lim){
             * turnLeft(180);
             * System.out,println("1");
             * } else if (x <= height_lim) {
             * turnLeft(180);
             * System.out,println("2");
             * }
             * else if (y >= width - width_lim){
             * turnLeft(180);
             * System.out,println("3");
             * } else if (y <= width_lim) {
             * turnLeft(180);
             * System.out,println("4");
             * }
             */
            double heading = getHeading();

            ahead(100);
        }

    }

    public void onScannedRobot(ScannedRobotEvent event) {
        double bearing = event.getBearing();
        double distance = event.getDistance();
        turnGunRight(bearing);
        if (bearing < 0) {
            // turnLeft(bearing);
            fire(1);
        } else if (bearing > 0) {
            // turnRight(bearing);
            fire(1);
        } else {
            fire(1);
        }
    }

}
