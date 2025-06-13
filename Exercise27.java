public class Exercise27 {
    public interface Electric {
        void charge();
    }

    abstract static class Vehicle {
        String name;

        public Vehicle(String name) {
            this.name = name;
        }

        abstract void start();

        void displayinfo() {
            System.out.println("Vehicle: " + name);
        }
    }

    static class Car extends Vehicle implements Electric {
        public Car(String name) {
            super(name);
        }

        @Override
        public void charge() {
            System.out.println("Charging the " + name + "...");
        }

        @Override
        void start() {
            System.out.println(name + " starts with a keyless system.");
        }
    }

    static class Bicycle extends Vehicle {
        public Bicycle(String name) {
            super(name);
        }

        @Override
        void start() {
            System.out.println(name + " starts by pedaling.");
        }
    }

    public static void main(String[] args) {
        Car tesla = new Car("Tesla");
        Bicycle bike = new Bicycle("Mountain Bike");

        tesla.start();
        tesla.charge();
        tesla.displayinfo();

        System.out.println();

        bike.start();
        bike.displayinfo();
    }
}
