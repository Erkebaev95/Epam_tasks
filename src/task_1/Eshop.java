package task_1;

public abstract class Eshop {
    private String category;
    private String product;
    private int cost;

    public Eshop(String category, String product, int cost) {
        this.category = category;
        this.product = product;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "\ncategory = " + category +
                ", product = " + product +
                ", cost = " + cost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
