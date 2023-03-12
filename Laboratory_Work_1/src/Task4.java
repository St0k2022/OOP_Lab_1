public class Task4 {
    public int power;
    public int capacity;
    public String model;
    public int year;
    public String color;
    public int maxSpeed;
    public int miles;

    public Task4(int power, int capacity, String model, int year, String color, int maxSpeed, int miles) {
        this.power = power;
        this.capacity = capacity;
        this.model = model;
        this.year = year;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.miles = miles;
    }

    public static void main(String[] args){
        Task4[] cars = {
            new Task4(200, 4, "Toyota Camry", 2019, "White", 180, 5000),
            new Task4(300, 5, "Ford Mustang", 2022, "Red", 220, 1000),
            new Task4(150, 3, "Honda Civic", 2015, "Black", 160, 80000),
            new Task4(250, 4, "Mercedes Benz", 2021, "Silver", 200, 3000),
            new Task4(180, 4, "Nissan Altima", 2018, "Gray", 170, 20000),
            new Task4(220, 5, "Chevrolet Camaro", 2020, "Blue", 210, 5000),
            new Task4(190, 4, "Hyundai Sonata", 2017, "White", 175, 25000),
            new Task4(270, 5, "Dodge Challenger", 2022, "Yellow", 230, 1000),
            new Task4(200, 4, "Kia Optima", 2016, "Red", 180, 35000),
            new Task4(150, 3, "Toyota Corolla", 2014, "Silver", 160, 90000),
        };
        
        int allPower = 0;
        int allCapacity = 0;

        for (Task4 car : cars) {
            allPower += car.power;
            allCapacity += car.capacity;
        }

        System.out.println("The all horsepower of ten cars: " + allPower);
        System.out.println("The all capacity of ten cars: " + allCapacity);
    }
}