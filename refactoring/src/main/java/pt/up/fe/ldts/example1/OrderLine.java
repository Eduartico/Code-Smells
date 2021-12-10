package pt.up.fe.ldts.example1;

public class OrderLine {
    private Product product;
    private int quantity;
    @Override
    public String toString() {
        return getProduct().getName() + "(x" + getQuantity() + "): " + (getTotal());
    }

    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    void setProduct(Product product){
        this.product = product;
    }
    void setQuantity(int quantity){
        this.quantity = quantity;
    }
    Product getProduct() {
        return this.product;
    }
    int getQuantity() {
        return this.quantity;
    }
    public double getTotal() {

        return getProduct().getPrice() * getQuantity();
    }
}
