package valuablekit;

import java.util.Arrays;

public class Container999 {
    private final Item999[] items = new Item999[999];

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Container999{");
        sb.append("items=").append(Arrays.toString(items));
        sb.append('}');
        return sb.toString();
    }

    public boolean add(Item999 item) {
        if (item == null) {
            throw new RuntimeException();
        }

        //add item to array
        for (var i : items) {
            if (item.isMatched(i)) {
                item = i;
                return true;
            }
        }

        //check null in array and add item to array
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public boolean remove(Item999 item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == item) {
                items[i] = null;
                return true;
            }
        }
        return false;
    }
}
