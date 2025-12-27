import java.util.Objects;

public class Product {
    private final int productId;
    private String name;
    private String category;
    private double unitPrice;

    public Product(int productId, String name, String category, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.unitPrice = unitPrice;
    }

    public int getProductId() { return productId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }

    @Override
    public String toString() {
        return "Product{id=" + productId + ", name='" + name + "', category='" + category + "', unitPrice=" + unitPrice + "}";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return productId == product.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }
}