package mainComputer;

public class Computer {
    private String name;
    private int ram;
    private int hdd;
    private double weight;
    // constructor
    public Computer (String name, int ram, int hdd, double weight){
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
    }
    // GET & SET
    public String getName() {
        return name;
    }
    public void setName(String newName){
        name = newName;
    }

    public int getRam() {
        return ram;
    }
    public void setRam(int newRam) {
        ram = newRam;
    }

    public int getHdd() {
        return hdd;
    }
    public void setHdd(int newHdd){
        hdd = newHdd;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    // methods
    public void on() {
        print("I'm on");
    }
    public void meeting() {
        print("Hello, my name is " + name);
    }
    public void off() {
        print("I'm off");
    }
    //encapsulation
    private void print(String str){
        System.out.println(str);
    }
}
