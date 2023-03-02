package HWclass30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BestBuy {
    public static void main(String[] args) {
        // Create a map of Best Buy store. Place
        // item id and item name into it.
        // Example (7664847 = Printer, 7879885= TV etc )
        // Retrieve all keys and values from
        // a Best Buy map using EntrySet.

        /*HashMap<String,Double> item=new HashMap<>();
        item.put("Printer",119.99);
        item.put("Samsung TV",179.99);
        item.put("Asus 32 inch",129.99);
        item.put("Sony VC",299.99);
        item.put("MacBook Pro",1999.00);*/

        // Create a Map of Best Buy store
        Map<Integer, String> bestBuyMap = new HashMap<>();
        bestBuyMap.put(7664847, "Printer");
        bestBuyMap.put(7879885, "TV");
        bestBuyMap.put(8723423, "Laptop");
        bestBuyMap.put(9234523, "Smartphone");

        Set<Map.Entry<Integer, String>> entrySet = bestBuyMap.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            int itemId = entry.getKey();
            String itemName = entry.getValue();
            System.out.println("Item ID: " + itemId + ", Item Name: " + itemName);
        }

    }
}
