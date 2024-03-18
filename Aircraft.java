// aircraft class
// includes make, model, type, fuelsize, fuelburn, airspeed
public class Aircraft {

    public String make;
    public String model;
    public String type;
    public double fuelBurn;
    public int fuelSize;
    public int speed;
    

    public Aircraft() {
        make = "Boeing";
        model = "737 MAX";
        type = "Commercial";
        fuelSize = 6875;
        fuelBurn = 2.28;
        speed = 521;

    }
    public Aircraft(String make, String model, String type, int fuelSize, double fuelBurn, int speed) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.fuelSize = fuelSize;
        this.fuelBurn = fuelBurn;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getType() {
        return type;
    }
    public double getFuelBurn() {
        return fuelBurn;
    }
    public int getFuelSize() {
        return fuelSize;
    }
    public int getSpeed() {
        return speed;
    }
    


}