package com.bumptech.glide.load.p085b;

import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bumptech.glide.util.C2567j;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.b.n */
public interface AbstractC2233n<Model, Data> {
    /* renamed from: a */
    C2234a<Data> mo10534a(Model model, int i, int i2, C2390f fVar);

    /* renamed from: a */
    boolean mo10536a(Model model);

    /* renamed from: com.bumptech.glide.load.b.n$a */
    public static class C2234a<Data> {

        /* renamed from: a */
        public final AbstractC2265c f7556a;

        /* renamed from: b */
        public final List<AbstractC2265c> f7557b;

        /* renamed from: c */
        public final AbstractC2147d<Data> f7558c;

        public C2234a(AbstractC2265c cVar, AbstractC2147d<Data> dVar) {
            this(cVar, Collections.emptyList(), dVar);
        }

        public C2234a(AbstractC2265c cVar, List<AbstractC2265c> list, AbstractC2147d<Data> dVar) {
            this.f7556a = (AbstractC2265c) C2567j.m10894a(cVar);
            this.f7557b = (List) C2567j.m10894a((Object) list);
            this.f7558c = (AbstractC2147d) C2567j.m10894a(dVar);
        }
    }
}
