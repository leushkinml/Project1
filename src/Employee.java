import java.util.Objects;

public class Employee {
    private final String surname;
    private final String name;
    private final String secondName;
    String companyBranch;
    double salary;
    static int idOfEmployee;

    public Employee(String surname, String name, String secondName, String companyBranch, double salary) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.companyBranch = companyBranch;
        this.salary = salary;
        idOfEmployee++;
    }

    public String getSurname() {
        return surname;
    }

      public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getCompanyBranch() {
        return companyBranch;
    }

    public void setCompanyBranch(String companyBranch) {
        this.companyBranch = companyBranch;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getNumberOfEmployee() {
        return idOfEmployee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.getSalary(), getSalary()) == 0 && getSurname().equals(employee.getSurname()) && getName().equals(employee.getName()) && getSecondName().equals(employee.getSecondName()) && getCompanyBranch().equals(employee.getCompanyBranch());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSurname(), getName(), getSecondName(), getCompanyBranch(), getSalary());
    }

    @Override
    public String toString() {
        return "ID:" + idOfEmployee  +
                " Сотрудник: " +
                "Фамилия: " + surname  +
                "; Имя: " + name +
                "; Отчество: " + secondName +
                "; Отдел: " + companyBranch +
                "; Зарплата " + salary +
                ".";
    }
}
