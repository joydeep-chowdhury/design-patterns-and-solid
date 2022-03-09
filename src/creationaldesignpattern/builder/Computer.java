package creationaldesignpattern.builder;

public class Computer {
	private String computerCase;
	private String CPU;
	private String motherboard;
	private String GPU;
	private String HDD;
	private String operatingSystem;
	private int powerSupply;
	private int amountOfRAM;

	public Computer(ComputerBuilder computerBuilder) {
		this.computerCase = computerBuilder.computerCase;
		this.CPU = computerBuilder.CPU;
		this.motherboard = computerBuilder.motherboard;
		this.GPU = computerBuilder.GPU;
		this.HDD = computerBuilder.HDD;
		this.operatingSystem = computerBuilder.operatingSystem;
		this.powerSupply = computerBuilder.powerSupply;
		this.amountOfRAM = computerBuilder.amountOfRAM;
	}

	public static class ComputerBuilder {
		private String computerCase;
		private String CPU;
		private String motherboard;
		private String GPU;
		private String HDD;
		private String operatingSystem;
		private int powerSupply;
		private int amountOfRAM;

		public ComputerBuilder setComputerCase(String computerCase) {
			this.computerCase = computerCase;
			return this;
		}

		public ComputerBuilder setCPU(String cPU) {
			CPU = cPU;
			return this;
		}

		public ComputerBuilder setMotherboard(String motherboard) {
			this.motherboard = motherboard;
			return this;
		}

		public ComputerBuilder setGPU(String gPU) {
			GPU = gPU;
			return this;
		}

		public ComputerBuilder setHDD(String hDD) {
			HDD = hDD;
			return this;
		}

		public ComputerBuilder setOperatingSystem(String operatingSystem) {
			this.operatingSystem = operatingSystem;
			return this;
		}

		public ComputerBuilder setPowerSupply(int powerSupply) {
			this.powerSupply = powerSupply;
			return this;
		}

		public ComputerBuilder setAmountOfRAM(int amountOfRAM) {
			this.amountOfRAM = amountOfRAM;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}

	@Override
	public String toString() {
		return "Computer [computerCase=" + computerCase + ", CPU=" + CPU + ", motherboard=" + motherboard + ", GPU="
				+ GPU + ", HDD=" + HDD + ", operatingSystem=" + operatingSystem + ", powerSupply=" + powerSupply
				+ ", amountOfRAM=" + amountOfRAM + "]";
	}

}
