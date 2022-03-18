package com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.a.a */
public class C43995a {

    /* renamed from: a */
    private List<C43996b> f111664a;

    /* renamed from: a */
    public C43995a mo156559a() {
        this.f111664a.clear();
        return this;
    }

    /* renamed from: a */
    public C43995a mo156561a(C43996b bVar) {
        this.f111664a.add(bVar);
        return this;
    }

    /* renamed from: a */
    public C43995a mo156562a(C44001f fVar) {
        return mo156560a(fVar.f111673a, fVar.f111674b);
    }

    /* renamed from: a */
    public C43995a mo156560a(RecyclerView.Adapter adapter, Object obj) {
        return mo156561a(new C43996b(adapter, obj));
    }
}
