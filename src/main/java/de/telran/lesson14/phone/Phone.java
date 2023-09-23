package de.telran.lesson14.phone;

public class Phone {

    private String manufacture;
   private String model;
   private String color;
    double price;

    public String getManufacture() {
        return manufacture;
    }


    public String getModel() {
        return model;
    }


    public String getColor() {
        return color;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Phone(String manufacture, String model, String color, double price) {
        this.manufacture = manufacture;
        this.model = model;
        this.color = color;
        this.price = price;
    }
}
