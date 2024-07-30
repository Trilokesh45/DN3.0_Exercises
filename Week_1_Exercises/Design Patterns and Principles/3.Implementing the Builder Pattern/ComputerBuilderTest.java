public class ComputerBuilderTest {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("2TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .setOS("Windows 11")
                .setBluetoothEnabled(true)
                .setWifiEnabled(true)
                .build();
        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("16GB")
                .setStorage("1TB HDD")
                .setOS("Windows 10")
                .setBluetoothEnabled(false)
                .setWifiEnabled(true)
                .build();
        System.out.println("Gaming Computer: " + gamingComputer);
        System.out.println("Office Computer: " + officeComputer);
    }
}

