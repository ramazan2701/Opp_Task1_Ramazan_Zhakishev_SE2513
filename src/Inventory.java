import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Inventory {
    private final List<InventoryItem> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }


    public List<InventoryItem> getItems() {
        return new ArrayList<>(items);
    }

    public void addItem(InventoryItem item) {
        items.add(item);
    }


    public InventoryItem findByProductId(int productId) {
        for (InventoryItem item : items) {
            if (item.getProduct().getProductId() == productId) {
                return item;
            }
        }
        return null;
    }

    // Фильтрация по категории
    public List<InventoryItem> filterByCategory(String category) {
        List<InventoryItem> result = new ArrayList<>();
        for (InventoryItem item : items) {
            String itemCategory = item.getProduct().getCategory();
            if (itemCategory != null && itemCategory.equalsIgnoreCase(category)) {
                result.add(item);
            }
        }
        return result;
    }

    // Фильтрация: остаток меньше порога
    public List<InventoryItem> filterLowStock(int thresholdExclusive) {
        List<InventoryItem> result = new ArrayList<>();
        for (InventoryItem item : items) {
            if (item.getQuantity() < thresholdExclusive) {
                result.add(item);
            }
        }
        return result;
    }

    // Сортировки
    public void sortByUnitPriceAscending() {
        items.sort(Comparator.comparingDouble(i -> i.getProduct().getUnitPrice()));
    }

    public void sortByQuantityDescending() {
        items.sort((a, b) -> Integer.compare(b.getQuantity(), a.getQuantity()));
    }

    public void sortByTotalValueDescending() {
        items.sort((a, b) -> Double.compare(b.getTotalValue(), a.getTotalValue()));
    }
}
