package task2;

public class Guiter implements Instrument {
    private int countString;

    public Guiter (int countString) {
        this.countString = countString;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн " + countString);
    }
}

