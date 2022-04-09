package task_1;

public class Manager extends Staffs {
    private String education;
    private String experience;
    private int salary;

    public Manager(String category, String product, int cost, String fullName, int age, String sex, String education, String experience, int salary) {
        super(category, product, cost, fullName, age, sex);
        this.education = education;
        this.experience = experience;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\neducation = " + education +
                ", experience = " + experience +
                ", salary = " + salary;
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

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
