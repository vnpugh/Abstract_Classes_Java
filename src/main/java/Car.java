//Create a Car class. It should extend Vehicle and have the following properties and associated getters/setters:
//
//        int numDoors
//        boolean poweredWindows
//
//        It should also have the following methods:
//        void lockDoors which takes in no arguments
//        void honk which takes in no arguments.

public class Car extends Vehicle {

    private int numDoors;
    private boolean poweredWindows;

    public void drive(int miles) {
        this.setMilesTraveled( this.getMilesTraveled() + miles );
    }

    public void displayMilesTraveled() {
        System.out.println("I've driven " +  this.getMilesTraveled() + " in my automobile");
    }

    public void lockDoors() {
        System.out.println("All safe and secure!");
    }

    public void honk() {
        System.out.println("HONK HONK!!!");
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isPoweredWindows() {
        return poweredWindows;
    }

    public void setPoweredWindows(boolean poweredWindows) {
        this.poweredWindows = poweredWindows;
    }
}

