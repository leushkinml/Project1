public class Main {
    public static void main(String[] args) {


        Employee ivanovIvan = new Employee("Иванов","Иван", "Иванович", "1", 50_000);
        Employee petrovPetr = new Employee("Петров", "Пётр", "Петрович", "5", 100_000);

        System.out.println("Результат: " + Employee.idOfEmployee);

        System.out.println(ivanovIvan);

    }
}