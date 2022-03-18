package com.ss.android.lark.mail.impl.p2162b;

import com.ss.android.lark.mail.impl.p2162b.C41822d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.lark.mail.impl.b.b */
public class C41818b implements AbstractC41817a {

    /* renamed from: a */
    public final List<AbstractC41817a> f106165a;

    /* renamed from: b */
    public final AtomicInteger f106166b;

    /* renamed from: com.ss.android.lark.mail.impl.b.b$a */
    public static final class C41820a {

        /* renamed from: a */
        private final List<AbstractC41817a> f106169a = new ArrayList();

        /* renamed from: a */
        public C41818b mo150382a() {
            return new C41818b(this.f106169a);
        }

        /* renamed from: a */
        public C41820a mo150381a(AbstractC41817a aVar) {
            this.f106169a.add(aVar);
            return this;
        }
    }

    private C41818b(List<AbstractC41817a> list) {
        this.f106166b = new AtomicInteger();
        this.f106165a = list;
    }

    @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
    public void run(final C41822d.AbstractC41826a aVar) {
        for (AbstractC41817a aVar2 : this.f106165a) {
            aVar2.run(new C41822d.AbstractC41826a() {
                /* class com.ss.android.lark.mail.impl.p2162b.C41818b.C418191 */

                @Override // com.ss.android.lark.mail.impl.p2162b.C41822d.AbstractC41826a
                /* renamed from: a */
                public void mo150379a() {
                    aVar.mo150379a();
                }

                @Override // com.ss.android.lark.mail.impl.p2162b.C41822d.AbstractC41826a
                /* renamed from: b */
                public void mo150380b() {
                    if (C41818b.this.f106166b.addAndGet(1) >= C41818b.this.f106165a.size()) {
                        aVar.mo150380b();
                    }
                }
            });
        }
    }
}
