public class Task3 {

    private int id;
    private int age;
    private String name;
    private String surname;
    private double weight;
    private double height;

    public Task3(int id, int age, String name, String surname, double weight, double height) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public static void main(String[] args) {
        Task3[] users = {
                new Task3(1, 20, "John", "Doe", 70.5, 175.0),
                new Task3(2, 25, "Jane", "Doe", 65.0, 165.0),
                new Task3(3, 30, "Bob", "Smith", 80.0, 180.0),
                new Task3(4, 35, "Alice", "Smith", 55.5, 160.0),
                new Task3(5, 40, "Tom", "Johnson", 90.0, 185.0),
                new Task3(6, 45, "Mary", "Johnson", 75.0, 170.0),
                new Task3(7, 50, "David", "Williams", 68.0, 175.0),
                new Task3(8, 55, "Samantha", "Williams", 60.0, 160.0),
                new Task3(9, 60, "George", "Brown", 95.0, 190.0),
                new Task3(10, 65, "Elizabeth", "Brown", 85.0, 175.0)

        };

        int age = 0;
        double weight = 0;
        double height = 0;

        for (Task3 user : users) {
            age += user.age;
            weight += user.weight;
            height += user.height;
        }

        System.out.println("The age of ten users is: " + age);
        System.out.println("The age of weight users is: " + weight);
        System.out.println("The age of height users is: " + height);
    }

}
