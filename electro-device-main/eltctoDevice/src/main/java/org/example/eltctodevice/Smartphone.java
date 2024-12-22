package org.example.eltctodevice;
public class Smartphone extends Device {
    protected int size;
    protected int hz;
    public Smartphone(Devicetype type, String name, double price, double weight, int size, int hz) {
        super(type, name, price, weight);
        this.size = size;
        this.hz = hz;
    }
    public Smartphone(Devicetype type, String name, double price, double weight) {
        super(type, name, price, weight);
    }
    public Smartphone(String name, double price, double weight, double screenSize, double cameraResolution) {
        super(Devicetype.SMARTPHONE, name, price, weight);
    }
    public int getSize() {

        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getHz() {
        return hz;
    }
    public void setHz(int hz) {
        this.hz = hz;
    }
    @Override
    public String toString() {
        return "Smartphone" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", size=" + size +
                ", hz=" + hz
                ;
    }
}
