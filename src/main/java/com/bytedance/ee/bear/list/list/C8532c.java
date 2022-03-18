package com.bytedance.ee.bear.list.list;

import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: com.bytedance.ee.bear.list.list.c */
public class C8532c extends GridLayoutManager.AbstractC1297b {

    /* renamed from: c */
    private AbstractC8538g f23130c;

    /* renamed from: d */
    private int f23131d = 2;

    @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1297b
    /* renamed from: a */
    public int mo6533a(int i) {
        if (this.f23130c.getItemViewType(i) == 273) {
            return this.f23131d;
        }
        return 1;
    }

    C8532c(AbstractC8538g gVar, int i) {
        this.f23130c = gVar;
        this.f23131d = i;
    }
}
