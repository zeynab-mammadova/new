package class22;

public class Car {



    private int currentSpeed;

    private int maxSpeed;



    public Car(int currentSpeed, int maxSpeed)
    {
        this.currentSpeed = currentSpeed;

        this.maxSpeed = maxSpeed;
    }



    public int getSpeed() {

        if(currentSpeed> maxSpeed){

            currentSpeed= maxSpeed;
        }

        return currentSpeed;
    }



    public void setSpeed(int currentSpeed) {

        this.currentSpeed = currentSpeed;
    }



    public int getMaxSpeed() {

        return maxSpeed;
    }



    public void setMaxSpeed(int maxSpeed) {

        this.maxSpeed = maxSpeed;
    }



    public int increaseSpeed(int value){

        currentSpeed = currentSpeed + value;

        return currentSpeed;
    }



    public void stopCar(){

        if(currentSpeed > maxSpeed){

            System.out.println("Car has stopped and your speed ?s ");

        }

        else{

            System.out.println("It is ok and your speed is "+currentSpeed);

        }


    }



}
