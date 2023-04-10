package task2;

public class Drum implements Instrument {
    private Double size;

    public Drum(Double size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан размером " + size);
    }
}
