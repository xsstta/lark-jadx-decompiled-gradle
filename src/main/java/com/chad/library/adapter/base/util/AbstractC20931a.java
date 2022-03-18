package com.chad.library.adapter.base.util;

import android.util.SparseIntArray;
import java.util.List;

/* renamed from: com.chad.library.adapter.base.util.a */
public abstract class AbstractC20931a<T> {

    /* renamed from: a */
    private SparseIntArray f51257a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo70771a(T t);

    /* renamed from: a */
    public final int mo70770a(int i) {
        return this.f51257a.get(i, -404);
    }

    /* renamed from: a */
    public final int mo70772a(List<T> list, int i) {
        T t = list.get(i);
        if (t != null) {
            return mo70771a(t);
        }
        return -255;
    }
}
