package cn.edu.whut.sept.zuul;

import java.util.HashMap;

public  class  Items {
    private HashMap<String, Item> items;

    public Items() {
        items=new HashMap<String, Item>();

        Item item = new Item("1",1);
        items.put(item.getDescription(),item);

        item = new Item("2",2);
        items.put(item.getDescription(),item);

        item = new Item("3",3);
        items.put(item.getDescription(),item);

        item = new Item("4",4);
        items.put(item.getDescription(),item);

    }
}
