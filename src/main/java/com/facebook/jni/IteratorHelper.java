package com.facebook.jni;

import java.util.Iterator;

public class IteratorHelper {

    /* renamed from: a */
    private final Iterator f51448a;
    private Object mElement;

    /* access modifiers changed from: package-private */
    public boolean hasNext() {
        if (this.f51448a.hasNext()) {
            this.mElement = this.f51448a.next();
            return true;
        }
        this.mElement = null;
        return false;
    }

    public IteratorHelper(Iterator it) {
        this.f51448a = it;
    }

    public IteratorHelper(Iterable iterable) {
        this.f51448a = iterable.iterator();
    }
}
