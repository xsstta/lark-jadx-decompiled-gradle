package com.ss.android.lark.contact.impl.p1761f;

import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.p1735d.AbstractC35391f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.f.i */
public class C35929i implements AbstractC35391f {

    /* renamed from: a */
    private final List<Department> f92897a = new ArrayList();

    /* renamed from: com.ss.android.lark.contact.impl.f.i$a */
    private static class C35930a {

        /* renamed from: a */
        public static final AbstractC35391f f92898a = new C35929i();
    }

    /* renamed from: a */
    public static AbstractC35391f m140778a() {
        return C35930a.f92898a;
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35391f
    /* renamed from: b */
    public synchronized List<Department> mo130295b() {
        return new ArrayList(this.f92897a);
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35391f
    /* renamed from: a */
    public synchronized void mo130294a(List<Department> list) {
        this.f92897a.clear();
        if (list != null) {
            this.f92897a.addAll(list);
        }
    }
}
