package mainComputer;

public class Main  {
    public static void main (String[] args){
        //new object
        Computer computer = new Computer("IBM", 2048, 350, 5.5);
        //fields
        computer.setName("IBM");
        computer.setRam(2048);
        computer.setHdd(350);
        computer.setWeight(5.5);
        //methods
        computer.on();
        computer.meeting();
        computer.off();
    }
}

