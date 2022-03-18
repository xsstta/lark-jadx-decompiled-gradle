package me.drakeet.multitype;

import java.util.ArrayList;
import java.util.Collection;

public class Items extends ArrayList<Object> {
    public Items() {
    }

    public Items(int i) {
        super(i);
    }

    public Items(Collection<?> collection) {
        super(collection);
    }
}
