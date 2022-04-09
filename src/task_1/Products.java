package task_1;

public abstract class Products extends Eshop {
    private String brand;
    private int count;

    public Products(String category, String product, int cost, String brand, int count) {
        super(category, product, cost);
        this.brand = brand;
        this.count = count;
    }

    @Override
    public String toString() {
        return "\nbrand = " + brand +
                ", count = " + count;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
