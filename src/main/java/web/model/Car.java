package web.model;

public class Car {
    private String model;
    private String VIN;
    private float enginePower;

    public Car() {
    }

    public Car(String model, String VIN, float enginePower) {
        this.model = model;
        this.VIN = VIN;
        this.enginePower = enginePower;
    }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getVIN() { return VIN; }
    public void setVIN(String VIN) { this.VIN = VIN; }

    public float getEnginePower() { return enginePower; }
    public void setEnginePower(float enginePower) { this.enginePower = enginePower; }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", VIN='" + VIN + '\'' +
                ", enginePower=" + enginePower +
                '}';
    }
}
