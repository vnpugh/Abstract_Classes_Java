//Create an abstract class called Vehicle. It should define the following properties:
//        int milesTraveled
//
//        String make
//
//        String model
//
//        String year
//
//        It should also have the following methods:
//        void drive which takes in an integer argument representing miles
//        void displayMilesTraveled which takes in no arguments.

public abstract class Vehicle {

    private int milesTraveled;
    private String make;
    private String model;
    private String year;

    public abstract void drive(int miles);
    public abstract void displayMilesTraveled();

    public int getMilesTraveled() {
        return milesTraveled;
    }

    public void setMilesTraveled(int milesTraveled) {
        this.milesTraveled = milesTraveled;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
























