package web.model;

public class Car {
    private String model;
    private Integer serialnumber;
    private String typeCar;


    public Car(String model, Integer serialnumber, String typeCar) {
        this.model = model;
        this.serialnumber = serialnumber;
        this.typeCar = typeCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(Integer serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }
}
