import java.util.Scanner;
public class BrakeCheck {
    public static void main(String[] args) {
        final double GRAVITY = 32.174;
        final double MU_NEW = 0.8;
        final double MU_OLD = 0.5;
        final double FEET_PER_SECOND = 1.46667;
        Scanner input = new Scanner(System.in);
        // make sure Scanner works in program
        System.out.println("Enter initial speed in miles per hours: ");
        double car_speed = input.nextDouble();
        // allows users to input there miles per hours
        double v = car_speed * FEET_PER_SECOND;
        double distance_new = (v * v)/(2 * MU_NEW * GRAVITY);
        // finds distance for new tires
        double distance_old = (v * v)/(2 * MU_OLD * GRAVITY);
        // finds distance for old tires
        System.out.printf("At %.0f miles per hour, with new tires, the car will stop in %.2f feet.\n", car_speed, distance_new);
        System.out.printf("With poor tires, the car will stop in %.2f feet", distance_old);


    }
}
