//Create a Motorcycle class. It should extend Vehicle and have the following properties and associated getters/stters:
//        int cubicCentimeters
//        It should also have the following methods:
//        isRunning which returns a boolean
//        void repair which takes in no arguments

public class Motorcycle extends Vehicle {
    private int cubicCentimeters;

    public void drive(int miles) {
        if( isRunning() ){
            this.setMilesTraveled( this.getMilesTraveled() + miles );
        }
    }

    public void displayMilesTraveled() {
        System.out.println(this.getMilesTraveled() + " miles have been cruised on this hog");
    }

    public boolean isRunning() {
        return false;
    }

    public void repair() {
        System.out.println("Repairing....again...");
    }

    public int getCubicCentimeters() {
        return cubicCentimeters;
    }

    public void setCubicCentimeters(int cubicCentimeters) {
        this.cubicCentimeters = cubicCentimeters;
    }
}
