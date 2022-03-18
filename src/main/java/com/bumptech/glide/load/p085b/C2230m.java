package com.bumptech.glide.load.p085b;

import com.bumptech.glide.util.C2564g;
import com.bumptech.glide.util.C2568k;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.b.m */
public class C2230m<A, B> {

    /* renamed from: a */
    private final C2564g<C2232a<A>, B> f7550a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.b.m$a */
    public static final class C2232a<A> {

        /* renamed from: a */
        private static final Queue<C2232a<?>> f7552a = C2568k.m10909a(0);

        /* renamed from: b */
        private int f7553b;

        /* renamed from: c */
        private int f7554c;

        /* renamed from: d */
        private A f7555d;

        private C2232a() {
        }

        /* renamed from: a */
        public void mo10599a() {
            Queue<C2232a<?>> queue = f7552a;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public int hashCode() {
            return (((this.f7553b * 31) + this.f7554c) * 31) + this.f7555d.hashCode();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2232a)) {
                return false;
            }
            C2232a aVar = (C2232a) obj;
            if (this.f7554c == aVar.f7554c && this.f7553b == aVar.f7553b && this.f7555d.equals(aVar.f7555d)) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private void m9607b(A a, int i, int i2) {
            this.f7555d = a;
            this.f7554c = i;
            this.f7553b = i2;
        }

        /* renamed from: a */
        static <A> C2232a<A> m9606a(A a, int i, int i2) {
            C2232a<A> aVar;
            Queue<C2232a<?>> queue = f7552a;
            synchronized (queue) {
                aVar = (C2232a<A>) queue.poll();
            }
            if (aVar == null) {
                aVar = new C2232a<>();
            }
            aVar.m9607b(a, i, i2);
            return aVar;
        }
    }

    public C2230m() {
        this(250);
    }

    public C2230m(long j) {
        this.f7550a = new C2564g<C2232a<A>, B>(j) {
            /* class com.bumptech.glide.load.p085b.C2230m.C22311 */

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo10597a(C2232a<A> aVar, B b) {
                aVar.mo10599a();
            }

            /* access modifiers changed from: protected */
            @Override // com.bumptech.glide.util.C2564g
            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo10598a(Object obj, Object obj2) {
                mo10597a((C2232a) ((C2232a) obj), obj2);
            }
        };
    }

    /* renamed from: a */
    public B mo10595a(A a, int i, int i2) {
        C2232a<A> a2 = C2232a.m9606a(a, i, i2);
        B c = this.f7550a.mo11252c(a2);
        a2.mo10599a();
        return c;
    }

    /* renamed from: a */
    public void mo10596a(A a, int i, int i2, B b) {
        this.f7550a.mo11250b(C2232a.m9606a(a, i, i2), b);
    }
}
