public class Exercise12 {
    public static class Vehicle {
        String direction;

        public Vehicle(String direction) {
            this.direction = direction;
        }

        void move() {
            System.out.println("Moving vehicle... " + direction);
        }
    }

    public static class Car extends Vehicle {
        public Car(String direction) {
            super(direction);
        }

        @Override
        void move() {
            System.out.println("Car is driving " + direction + " fast!");
        }

        void display() {
            move(); // This will call Car's overridden move()
        }
    }

    public static void main(String[] args) {
        Car car = new Car("forward");
        car.display();
    }
}
