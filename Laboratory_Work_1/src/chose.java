public class chose {
    public chose(String arg) {
        run(arg);
    }

    public static void run(String task) {
        switch (task) {
            case "Task1":
                OperationOnNums obj = new OperationOnNums();
                obj.PrintResults();
                break;
            case "Task2":
                Sentence ob = new Sentence();
                ob.CreateAndPrint();
                break;
            case "Task3":
                User user = new User();
                user.Init();
                user.PrintInfo();
                break;
            case "Task4":
                Car car = new Car();
                car.Init();
                car.PrintInfo();
                break;
            case "Task5":
                ReverseNumber a = new ReverseNumber();
                a.Reverse();
                break;
            default:
                System.out.println("The current task doesnt exist!");
        }
    

    }

}
