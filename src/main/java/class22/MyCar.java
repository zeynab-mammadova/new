package class22;

import java.util.Scanner;

public class MyCar {

    int max_speed;
    int current_speed;

    public MyCar() {
    }

    public MyCar(int maxSpeed, int current_speed) {
        this.max_speed = maxSpeed;
        this.current_speed = current_speed;
    }

    public void speedUpCar(int speed) {
        if (speed + current_speed <= max_speed) {
            current_speed += speed;
            System.out.println("After speedup the speed your current speed is " + current_speed);
        } else
            System.out.println("This speed is dangerous for you. Slow down speed ");

    }

    public void slowDownCar(int speed) {
        if (current_speed - speed >= 0) {
            current_speed -= speed;
            System.out.println("After slowdown the speed your current speed is " + current_speed);
        } else
            System.out.println("You stoped ");


    }

    public void stopCar(int current_speed) {
        if (current_speed > 200 || current_speed == 0) {
            System.out.println("You stoped");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the current speed of car: ");
        int current_speed = scanner.nextInt();
        MyCar myCar = new MyCar(200, current_speed);
        myCar.stopCar(current_speed);
        System.out.println("Enter the speed of car: ");
        int speed = scanner.nextInt();
        myCar.slowDownCar(speed);
        myCar.speedUpCar(speed);
    }
}

