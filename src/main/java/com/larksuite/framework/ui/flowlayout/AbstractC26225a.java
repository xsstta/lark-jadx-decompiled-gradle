package com.larksuite.framework.ui.flowlayout;

import android.view.View;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.larksuite.framework.ui.flowlayout.a */
public abstract class AbstractC26225a<T> {

    /* renamed from: a */
    private List<T> f64771a;

    /* renamed from: b */
    private AbstractC26226a f64772b;

    /* renamed from: c */
    private HashSet<Integer> f64773c = new HashSet<>();

    /* renamed from: com.larksuite.framework.ui.flowlayout.a$a */
    interface AbstractC26226a {
        /* renamed from: a */
        void mo93277a();
    }

    /* renamed from: a */
    public abstract View mo93290a(FlowLayout flowLayout, int i, T t);

    /* renamed from: a */
    public boolean mo93294a(int i, T t) {
        return false;
    }

    /* renamed from: c */
    public void mo93296c() {
        AbstractC26226a aVar = this.f64772b;
        if (aVar != null) {
            aVar.mo93277a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public HashSet<Integer> mo93292a() {
        return this.f64773c;
    }

    /* renamed from: b */
    public int mo93295b() {
        List<T> list = this.f64771a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public T mo93291a(int i) {
        return this.f64771a.get(i);
    }

    public AbstractC26225a(List<T> list) {
        this.f64771a = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo93293a(AbstractC26226a aVar) {
        this.f64772b = aVar;
    }
}
