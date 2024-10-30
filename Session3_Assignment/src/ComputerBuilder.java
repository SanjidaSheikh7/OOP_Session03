public class ComputerBuilder {
    private long CPU;
    private long RAM;
    private long storage;
    private long GPU;

    public Computer computer;

    public ComputerBuilder() {
    }

    public ComputerBuilder setCPU(long CPU) {
        this.CPU = CPU;
        return this;
    }

    public ComputerBuilder setRAM(long RAM) {
        this.RAM = RAM;
        return this;
    }

    public ComputerBuilder setStorage(long storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder setGPU(long GPU) {
        this.GPU = GPU;
        return this;
    }

    public Computer build() {
        return new Computer(CPU, RAM, storage, GPU);
    }
}
