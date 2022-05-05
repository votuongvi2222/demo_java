package tdtu.dp.mid.refactoring.composingmethod.after;

import java.util.HashSet;
import java.util.Set;

public class ShoppingCart {
    private Set<Item> items = new HashSet<>();

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
        calculateTotal();
    }

    public int calculateTotal(){
        int sum = 0;
        for (Item item: items){
            sum += item.calculateItemTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "items=" + items +
                '}';
    }
}
