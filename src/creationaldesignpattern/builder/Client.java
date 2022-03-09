package creationaldesignpattern.builder;

public class Client {
	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder().setComputerCase("Tower").setCPU("Intel i5")
				.setMotherboard("MSI B360M-MORTAR").setGPU("nVidia Geforce GTX 750ti").setHDD("Toshiba 1TB")
				.setOperatingSystem("Windows 10").setPowerSupply(500).setAmountOfRAM(8).build();
		
		System.out.println(computer);
	}
}
