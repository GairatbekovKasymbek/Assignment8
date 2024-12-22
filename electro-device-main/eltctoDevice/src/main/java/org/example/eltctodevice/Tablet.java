package org.example.eltctodevice;
public class Tablet extends Device{
    protected double Batterycapacity;
    protected boolean operatingsystem;
    public Tablet(String name, double price, double weight, double batteryLife, boolean hasStylus) {

    }
    public Tablet(Devicetype type, String name, double price, double weight) {

        super(type, name, price, weight);
    }
    public Tablet(Devicetype type, String name, double price, double weight, double Batterycapacity, boolean operatingsystem) {
        super(type, name, price, weight);
        this.Batterycapacity = Batterycapacity;
        this.operatingsystem = operatingsystem;
    }
    public double getBatterycapacity() {

        return Batterycapacity;
    }
    public void setBatterycapacity(double Batterycapacity) {

        this.Batterycapacity = Batterycapacity;
    }
    public boolean isoperatingsystem() {
        return operatingsystem;
    }
    public void setoperatingsystem(boolean operatingsystem) {
        this.operatingsystem = operatingsystem;
    }
    @Override
    public String toString() {
        return "Tablet" +
                "type=" + type +
                ", name= '" + name + '\'' +
                ", price=" + price + "$" +
                ", weight=" + weight +
                ", Batterycapacity=" + Batterycapacity +
                ", operatingsystem=" + operatingsystem
                ;
    }
}