package com.facebook.jni;

import java.util.Iterator;
import java.util.Map;

public class MapIteratorHelper {
    private final Iterator<Map.Entry> mIterator;
    private Object mKey;
    private Object mValue;

    /* access modifiers changed from: package-private */
    public boolean hasNext() {
        if (this.mIterator.hasNext()) {
            Map.Entry next = this.mIterator.next();
            this.mKey = next.getKey();
            this.mValue = next.getValue();
            return true;
        }
        this.mKey = null;
        this.mValue = null;
        return false;
    }

    public MapIteratorHelper(Map map) {
        this.mIterator = map.entrySet().iterator();
    }
}
