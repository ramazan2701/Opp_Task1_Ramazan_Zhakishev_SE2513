import java.util.List;

public class Main {
    public static void main() {
        Person contactA = new SupplierContact(1, "John Smith", "john@supplier.com"); //person тут по сути е нужен его можно заменить оставь его пока не придумаешь ниччего лучше
        Person contactB = new SupplierContact(2, "Aida N.", "aida@supplier.kz");

        Supplier supplierA = new Supplier(101, "GlobalSupply", "USA", (SupplierContact) contactA);
        Supplier supplierB = new Supplier(102, "KazSupply", "Kazakhstan", (SupplierContact) contactB);

        Product p1 = new Product(1001, "SSD 1TB", "Electronics", 59.99);
        Product p2 = new Product(1002, "Keyboard", "Electronics", 19.50);
        Product p3 = new Product(1003, "Office Chair", "Furniture", 120.00);

        //system.out()

        Inventory inventory = new Inventory();
        inventory.addItem(new InventoryItem(p1, supplierA, 12));
        inventory.addItem(new InventoryItem(p2, supplierA, 3));
        inventory.addItem(new InventoryItem(p3, supplierB, 5));

        System.out.println("= ALL ITEMS =");
        for (InventoryItem item : inventory.getItems()) {
            System.out.println(item);
        }

        System.out.println("\n= FIND BY PRODUCT ID 1002 =");
        System.out.println(inventory.findByProductId(1002));

        System.out.println("\n= FILTER CATEGORY: Electronics =");
        List<InventoryItem> electronics = inventory.filterByCategory("Electronics");
        for (InventoryItem item : electronics) {
            System.out.println(item);
        }

        System.out.println("\n=LOW STOCK (< 6) =");
        List<InventoryItem> lowStock = inventory.filterLowStock(6);
        for (InventoryItem item : lowStock) {
            System.out.println(item);
        }

        System.out.println("\n= SORT BY TOTAL VALUE (DESC) =");
        inventory.sortByTotalValueDescending();
        for (InventoryItem item : inventory.getItems()) {
            System.out.println(item);
        }
        System.out.println("\n= equals/hashCode DEMO =");
        Product p1SameId = new Product(1001, "SSD 1TB NEW", "Electronics", 60.00);
        System.out.println("p1.equals(p1SameId): " + p1.equals(p1SameId));
        System.out.println("hashCode equal: " + (p1.hashCode() == p1SameId.hashCode()));
    }
}
