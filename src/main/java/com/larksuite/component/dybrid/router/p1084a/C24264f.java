package com.larksuite.component.dybrid.router.p1084a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.larksuite.component.dybrid.router.a.f */
public class C24264f<T> {

    /* renamed from: a */
    List<C24266a<T>> f59923a = new ArrayList();

    /* renamed from: a */
    public int mo86899a() {
        List<C24266a<T>> list = this.f59923a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public T mo86900a(int i) {
        if (this.f59923a == null) {
            this.f59923a = new ArrayList();
        }
        if (i < 0 || i > this.f59923a.size() - 1) {
            return null;
        }
        return this.f59923a.get(i).f59924a;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.dybrid.router.a.f$a */
    public static class C24266a<T> {

        /* renamed from: a */
        public T f59924a;

        /* renamed from: b */
        public int f59925b;

        private C24266a(T t, int i) {
            this.f59924a = t;
            this.f59925b = i;
        }
    }

    /* renamed from: a */
    public void mo86901a(T t, int i) {
        if (this.f59923a == null) {
            this.f59923a = new ArrayList();
        }
        for (int i2 = 0; i2 < this.f59923a.size(); i2++) {
            C24266a<T> aVar = this.f59923a.get(i2);
            if (aVar != null && i < aVar.f59925b) {
                this.f59923a.add(i2, new C24266a<>(t, i));
                return;
            }
        }
        this.f59923a.add(new C24266a<>(t, i));
    }
}
