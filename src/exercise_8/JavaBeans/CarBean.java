package exercise_8.JavaBeans;

import java.io.Serializable;

public class CarBean implements Serializable {
    private String model;
    private String make;

    public CarBean() {

    }
    public String getMake() {
        return make;
    }
    public void setMake(String value) {
        make = value;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String value) {
        model = value;
    }
}
