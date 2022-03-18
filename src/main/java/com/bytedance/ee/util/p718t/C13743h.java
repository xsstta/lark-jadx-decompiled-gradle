package com.bytedance.ee.util.p718t;

import androidx.recyclerview.widget.C1374g;
import java.util.List;

/* renamed from: com.bytedance.ee.util.t.h */
public class C13743h extends C1374g.AbstractC1376a {

    /* renamed from: a */
    private List f35935a;

    /* renamed from: b */
    private List f35936b;

    /* renamed from: c */
    private AbstractC13745b f35937c;

    /* renamed from: d */
    private AbstractC13744a f35938d;

    /* renamed from: com.bytedance.ee.util.t.h$a */
    public interface AbstractC13744a<T> {
        /* renamed from: a */
        Object mo34848a(T t, T t2);
    }

    /* renamed from: com.bytedance.ee.util.t.h$b */
    public interface AbstractC13745b<T> {
        /* renamed from: a */
        boolean mo34851a(T t, T t2);

        /* renamed from: b */
        boolean mo34853b(T t, T t2);
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: a */
    public int mo7380a() {
        List list = this.f35935a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: b */
    public int mo7382b() {
        List list = this.f35936b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public void mo50704a(AbstractC13744a aVar) {
        this.f35938d = aVar;
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: a */
    public boolean mo7381a(int i, int i2) {
        return this.f35937c.mo34851a(this.f35935a.get(i), this.f35936b.get(i2));
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: b */
    public boolean mo7383b(int i, int i2) {
        return this.f35937c.mo34853b(this.f35935a.get(i), this.f35936b.get(i2));
    }

    @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
    /* renamed from: c */
    public Object mo7384c(int i, int i2) {
        AbstractC13744a aVar = this.f35938d;
        if (aVar != null) {
            return aVar.mo34848a(this.f35935a.get(i), this.f35936b.get(i2));
        }
        return super.mo7384c(i, i2);
    }

    public C13743h(List list, List list2, AbstractC13745b bVar) {
        this.f35935a = list;
        this.f35936b = list2;
        this.f35937c = bVar;
    }
}
