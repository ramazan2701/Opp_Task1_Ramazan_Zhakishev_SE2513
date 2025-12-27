public class SearchResult {
    private final InventoryItem[] items;
    private final int size;

    public SearchResult(InventoryItem[] items, int size) {
        this.items = items;
        this.size = size;
    }

    public InventoryItem[] getItems() { return items; }
    public int getSize() { return size; }
}
