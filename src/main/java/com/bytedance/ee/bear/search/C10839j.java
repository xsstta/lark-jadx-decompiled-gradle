package com.bytedance.ee.bear.search;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.search.j */
public class C10839j {

    /* renamed from: a */
    private static C10839j f29047a;

    /* renamed from: b */
    private List<AbstractC10840a> f29048b = new ArrayList();

    /* renamed from: com.bytedance.ee.bear.search.j$a */
    public interface AbstractC10840a {
        /* renamed from: y */
        void mo40946y();

        /* renamed from: z */
        void mo40947z();
    }

    private C10839j() {
    }

    /* renamed from: a */
    public static C10839j m44943a() {
        if (f29047a == null) {
            f29047a = new C10839j();
        }
        return f29047a;
    }

    /* renamed from: b */
    public void mo40956b() {
        for (AbstractC10840a aVar : this.f29048b) {
            aVar.mo40946y();
        }
    }

    /* renamed from: c */
    public void mo40958c() {
        for (AbstractC10840a aVar : this.f29048b) {
            aVar.mo40947z();
        }
    }

    /* renamed from: b */
    public void mo40957b(AbstractC10840a aVar) {
        if (this.f29048b.contains(aVar)) {
            this.f29048b.remove(aVar);
        }
    }

    /* renamed from: a */
    public void mo40955a(AbstractC10840a aVar) {
        if (!this.f29048b.contains(aVar)) {
            this.f29048b.add(aVar);
        }
    }
}
