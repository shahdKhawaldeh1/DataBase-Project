package Models;

public class Car{

    int car_id;
    String model;
    String  color;
    int year_of_manifactor;

    public Car(int car_id , String model , String  color,
               int year_of_manifactor)
    {
        this.car_id = car_id;
        this.model = model;
        this.color=color;
        this.year_of_manifactor= year_of_manifactor;

    }
    public Car() {

    }
    public int getYear_of_manifactor() {
        return year_of_manifactor;
    }

    public void setYear_of_manifactor(int year_of_manifactor) {
        this.year_of_manifactor = year_of_manifactor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}