import java.util.Objects;

public class Supplier {
    private final int supplierId;
    private String supplierName;
    private String country;
    private SupplierContact contact;

    public Supplier(int supplierId, String supplierName, String country, SupplierContact contact) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.country = country;
        this.contact = contact;
    }

    public int getSupplierId() { return supplierId; }

    public String getSupplierName() { return supplierName; }
    public void setSupplierName(String supplierName) { this.supplierName = supplierName; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public SupplierContact getContact() { return contact; }
    public void setContact(SupplierContact contact) { this.contact = contact; }

    @Override
    public String toString() {
        return "Supplier{id=" + supplierId + ", name='" + supplierName + "', country='" + country + "', contact=" + contact + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Supplier)) return false;
        Supplier supplier = (Supplier) o;
        return supplierId == supplier.supplierId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplierId);
    }
}
