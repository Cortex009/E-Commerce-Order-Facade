package com.ecommerce.order.SubSystems;

public class InventoryService {
    public boolean checkStock(String item) {
        System.out.println("[Inventory] Checking stock for: " + item);
        return true; 
    }

    public void reduceStock(String item, int quantity) {
        System.out.println("[Inventory] Reduced stock of " + item + " by " + quantity);
    }

    public void restoreStock(String item, int quantity) {
        System.out.println("[Inventory] Restored stock of " + item + " by " + quantity);
    }
}
