package task_1;

public class Seller extends Staffs {
    private String experience;
    private int salary;

    public Seller(String category, String product, int cost, String fullName, int age, String sex, String experience, int salary) {
        super(category, product, cost, fullName, age, sex);
        this.experience = experience;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "experience='" + experience + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
