public class SupplierContact extends Person {
    private String email;

    public SupplierContact(int id, String name, String email) {
        super(id, name);
        this.email = email;
    }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    @Override
    public String getRole() {
        return "SupplierContact";
    }
    @Override
    public String toString() {
        return super.toString().replace("}", "") + ", email='" + email + "'}";
    }
}
