public class Exercise11 {
    public static class Car{
        String brand;
        String model;
        int year;

    
        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        public void displaycar(){
            System.out.println("brand : " + brand);
            System.out.println("model : " + model);
            System.out.println("year : " + year);
        }
    }
    public static void main(String[] args) {
        Car car = new Car("toyota", "camry", 2014);

        car.displaycar();
    }
}
