import java.util.Objects;

public class InventoryItem {
    private final Product product;
    private final Supplier supplier;
    private int quantity;

    public InventoryItem(Product product, Supplier supplier, int quantity) {
        this.product = product;
        this.supplier = supplier;
        this.quantity = quantity;
    }

    public Product getProduct() { return product; }
    public Supplier getSupplier() { return supplier; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getTotalValue() {
        return product.getUnitPrice() * quantity;
    }

    @Override
    public String toString() {
        return "InventoryItem{product=" + product + ", supplier=" + supplier + ", quantity=" + quantity + ", totalValue=" + getTotalValue() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InventoryItem that)) return false;
        return product.equals(that.product) && supplier.equals(that.supplier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, supplier);
    }
}
