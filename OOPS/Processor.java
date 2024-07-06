class CPU {
    private double price;

    class Processor {
        int numOfCores;
        String manufacturer;

        Processor(int numOfCores, String manufacturer) {
            this.numOfCores = numOfCores;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("Processor Information:");
            System.out.println("Number of Cores: " + numOfCores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("RAM Information:");
            System.out.println("Memory: " + memory + " GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    CPU(double price) {
        this.price = price;
    }

    void display() {
        System.out.println("CPU Price: $" + price);
    }
}

public class Processor {
    public static void main(String[] args) {

        CPU computer = new CPU(899.99);

        CPU.Processor processor = computer.new Processor(8, "Intel");

        CPU.RAM ram = new CPU.RAM(16, "Corsair");

        computer.display();
        processor.display();
        ram.display();
    }
}
