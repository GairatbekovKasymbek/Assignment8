package org.example.eltctodevice;
public class Device {
    protected Devicetype type;
    protected String name;
    protected double price;
    protected double weight;

    public Device(){}

    public Device(Devicetype type, String name, double price, double weight) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public Devicetype getType() {
        return type;
    }

    public void setType(Devicetype type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}