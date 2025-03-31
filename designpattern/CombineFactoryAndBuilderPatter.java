// Computer Class (Same as before)
class Computer {
	
	// Required parameters
	private String HDD;
	private String RAM;
	
	// Optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	public String getHDD() { return HDD; }
	public String getRAM() { return RAM; }
	public boolean isGraphicsCardEnabled() { return isGraphicsCardEnabled; }
	public boolean isBluetoothEnabled() { return isBluetoothEnabled; }
	
	// Private constructor - Only accessible through Builder
	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}
	
	@Override
	public String toString() {
	    return "Computer Specification: RAM: " + getRAM() + 
	           ", HDD: " + getHDD() + 
	           ", Graphic Card: " + this.isGraphicsCardEnabled + 
	           ", Bluetooth: " + this.isBluetoothEnabled;
	}

	// Builder Class
	public static class ComputerBuilder {

		// Required parameters
		private String HDD;
		private String RAM;

		// Optional parameters
		private boolean isGraphicsCardEnabled = false;  // Default false
		private boolean isBluetoothEnabled = false;     // Default false
		
		public ComputerBuilder(String hdd, String ram) {
			this.HDD = hdd;
			this.RAM = ram;
		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}
}

// Factory Class using Builder
class ComputerFactory {

    // Factory method: Only requires HDD & RAM (Mandatory parameters)
    public static Computer getComputer(String hdd, String ram, boolean... options) {
        Computer.ComputerBuilder builder = new Computer.ComputerBuilder(hdd, ram);

        // If options are provided, apply them
        if (options.length > 0 && options[0]) {
            builder.setGraphicsCardEnabled(true);
        }
        if (options.length > 1 && options[1]) {
            builder.setBluetoothEnabled(true);
        }

        return builder.build();
    }
}

public class CombineFactoryAndBuilderPattern {
    public static void main(String[] args) {
        // Creating a Gaming PC (Graphics Card & Bluetooth enabled)
        Computer gamingPC = ComputerFactory.getComputer("1 TB", "16 GB", true, true);

        // Creating an Office PC (No optional features)
        Computer officePC = ComputerFactory.getComputer("500 GB", "8 GB");

        // Creating a Media PC (Only Bluetooth enabled)
        Computer mediaPC = ComputerFactory.getComputer("750 GB", "12 GB", false, true);

        // Displaying computer details
        System.out.println(gamingPC);
        System.out.println(officePC);
        System.out.println(mediaPC);
    }
}
