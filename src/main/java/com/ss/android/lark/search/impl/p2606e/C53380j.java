package com.ss.android.lark.search.impl.p2606e;

import android.util.SparseArray;

/* renamed from: com.ss.android.lark.search.impl.e.j */
public class C53380j {

    /* renamed from: a */
    static final /* synthetic */ boolean f131911a = true;

    /* renamed from: b */
    private final SparseArray<AbstractC53371a> f131912b;

    public C53380j() {
        SparseArray<AbstractC53371a> sparseArray = new SparseArray<>();
        this.f131912b = sparseArray;
        sparseArray.put(1, new C53374d());
        sparseArray.put(11, new C53374d());
        sparseArray.put(2, new C53373c());
        sparseArray.put(3, new C53378h());
        sparseArray.put(6, new C53381k());
        sparseArray.put(8, new C53382l());
        sparseArray.put(10, new C53376f());
        sparseArray.put(12, new C53379i());
        sparseArray.put(13, new C53377g());
        sparseArray.put(10000001, new C53375e());
        sparseArray.put(10000004, new C53372b());
        sparseArray.put(100000010, new C53374d());
        sparseArray.put(100000011, new C53382l());
    }

    /* renamed from: a */
    public AbstractC53371a mo182071a(int i) {
        AbstractC53371a aVar = this.f131912b.get(i);
        if (f131911a || aVar != null) {
            return aVar;
        }
        throw new AssertionError();
    }
}
