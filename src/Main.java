public class Main {
    public static void main(String[] args) {

        Employee[] Employer = new Employee[10];

        Employee ivanovIvan = new Employee("Иванов","Иван", "Иванович", "1", 50_000);
        Employer[0] = ivanovIvan;
        Employee petrovPetr = new Employee("Петров", "Пётр", "Петрович", "5", 100_000);
        Employer[1] = petrovPetr;

        System.out.println("Результат: " + Employee.idOfEmployee);

        System.out.println(ivanovIvan);
        System.out.println(petrovPetr);
        System.out.println("Employer[0] = " + Employer[0]);
        System.out.println("Employer[1] = " + Employer[1]);

    }
}