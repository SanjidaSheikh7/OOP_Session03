public class ComputerBuilderAdapter implements ThirdPartyComputerAPI{
    private ComputerBuilder computerBuilder;

    public ComputerBuilderAdapter(){
        computerBuilder = new ComputerBuilder();
    }

    @Override
    public Computer buildComputer(String CPU, String RAM, String storage, String GPU) {
        computerBuilder.setCPU(Long.parseLong(CPU));
        computerBuilder.setRAM(Long.parseLong(RAM));
        computerBuilder.setStorage(Long.parseLong(storage));
        computerBuilder.setGPU(Long.parseLong(GPU));

        return computerBuilder.build();
    }
}
