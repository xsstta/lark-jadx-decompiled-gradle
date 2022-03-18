package com.bytedance.ee.bear.list.share;

import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.ee.bear.list.list.AbstractC8538g;

/* renamed from: com.bytedance.ee.bear.list.share.ag */
public class C8714ag extends GridLayoutManager.AbstractC1297b {

    /* renamed from: c */
    private final AbstractC8538g f23561c;

    /* renamed from: d */
    private int f23562d = 2;

    @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1297b
    /* renamed from: a */
    public int mo6533a(int i) {
        if (this.f23561c.getItemViewType(i) == 273 || this.f23561c.getItemViewType(i) == 22) {
            return this.f23562d;
        }
        return 1;
    }

    C8714ag(AbstractC8538g gVar, int i) {
        this.f23561c = gVar;
        this.f23562d = i;
    }
}
