package task_1;

public class Customers extends Eshop {
    private String fullName;
    private int age;
    private String sex;
    private int countOfOrders;

    public Customers(String category, String product, int cost, String fullName, int age, String sex, int countOfOrders) {
        super(category, product, cost);
        this.fullName = fullName;
        this.age = age;
        this.sex = sex;
        this.countOfOrders = countOfOrders;
    }

    @Override
    public String toString() {
        return "\nfullName = " + fullName +
                ", age = " + age +
                ", sex = " + sex +
                ", countOfOrders = " + countOfOrders;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getCountOfOrders() {
        return countOfOrders;
    }

    public void setCountOfOrders(int countOfOrders) {
        this.countOfOrders = countOfOrders;
    }
}
