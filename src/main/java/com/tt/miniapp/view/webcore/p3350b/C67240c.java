package com.tt.miniapp.view.webcore.p3350b;

import com.tt.miniapp.view.webcore.p3350b.AbstractC67242e;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.tt.miniapp.view.webcore.b.c */
public class C67240c<T, K> implements AbstractC67242e.AbstractC67243a<T, K> {

    /* renamed from: a */
    private List<AbstractC67242e<T, K>> f169730a;

    /* renamed from: b */
    private C67247g<T> f169731b;

    /* renamed from: c */
    private int f169732c;

    @Override // com.tt.miniapp.view.webcore.p3350b.AbstractC67242e.AbstractC67243a
    /* renamed from: a */
    public C67247g<T> mo233844a() {
        return this.f169731b;
    }

    @Override // com.tt.miniapp.view.webcore.p3350b.AbstractC67242e.AbstractC67243a
    /* renamed from: a */
    public C67248h<K> mo233845a(C67247g<T> gVar) {
        return this.f169730a.get(this.f169732c).mo233843a(new C67240c(this.f169731b, this.f169730a, this.f169732c + 1));
    }

    public C67240c(C67247g<T> gVar, List<AbstractC67242e<T, K>> list, int i) {
        this.f169730a = list;
        this.f169732c = i;
        this.f169731b = gVar;
    }
}
