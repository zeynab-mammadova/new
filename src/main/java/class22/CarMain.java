package class22;
import java.util.Scanner;


public class CarMain {


    public static void main(String[] args) {

        Car car = new Car(40,70);


        Scanner sc = new Scanner(System.in);

        car.increaseSpeed(sc.nextInt());

        int increasingSpeed = car.getSpeed();

        System.out.println(increasingSpeed);


        car.stopCar();

    }
}

