package task2;

public class Tuba implements Instrument {
    private int diameter;

    public Tuba(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба диаметром " + diameter);
    }

}
