package com.h6ah4i.android.widget.advrecyclerview.p1004a;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.a.a */
public class C23227a {

    /* renamed from: a */
    private List<C23228b> f57289a;

    /* renamed from: a */
    public C23227a mo80558a() {
        this.f57289a.clear();
        return this;
    }

    /* renamed from: a */
    public C23227a mo80560a(C23228b bVar) {
        this.f57289a.add(bVar);
        return this;
    }

    /* renamed from: a */
    public C23227a mo80561a(C23233f fVar) {
        return mo80559a(fVar.f57298a, fVar.f57299b);
    }

    /* renamed from: a */
    public C23227a mo80559a(RecyclerView.Adapter adapter, Object obj) {
        return mo80560a(new C23228b(adapter, obj));
    }
}
