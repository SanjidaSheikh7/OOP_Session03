public class Computer {
    private long CPU;
    private long RAM;
    private long storage;
    private long GPU;

    public Computer(long CPU, long RAM, long storage, long GPU) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.GPU = GPU;
    }

    public void computerSpecification() {
        System.out.println("\nComputer: " +
                "CPU=" + CPU +
                ", RAM=" + RAM +
                ", storage=" + storage +
                ", GPU=" + GPU
        );
    }
}
