package de.telran.lesson17;

import java.util.Objects;

public class Phone {
    String model;
    double price;

    public Phone(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(price, phone.price) == 0 && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
