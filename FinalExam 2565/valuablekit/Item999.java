package valuablekit;

import utilkit.Tool999;

public class Item999 {
    private final String name;
    private int amount;

    public Item999(String n, int a) {
        name = n;
        amount = a;
    }

    public static Item999 create(String n, int a) {
        if (Tool999.isUsable999(n)) return new Item999(n,a);
        return null;
    }

    @Override
    public String toString() {
        return String.format("%s,%d",name,amount);
    }

    public int add(Item999 item) {
        if (item == null) {
            throw new RuntimeException();
        }
        amount += item.amount;
        return amount;
    }

    public boolean isMatched(Item999 item) {
        return item.name.equals(name);
    }
}
