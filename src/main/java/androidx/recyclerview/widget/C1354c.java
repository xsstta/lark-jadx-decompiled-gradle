package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1374g;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: androidx.recyclerview.widget.c */
public final class C1354c<T> {

    /* renamed from: a */
    private final Executor f4790a;

    /* renamed from: b */
    private final Executor f4791b;

    /* renamed from: c */
    private final C1374g.AbstractC1378c<T> f4792c;

    /* renamed from: a */
    public Executor mo7369a() {
        return this.f4790a;
    }

    /* renamed from: b */
    public Executor mo7370b() {
        return this.f4791b;
    }

    /* renamed from: c */
    public C1374g.AbstractC1378c<T> mo7371c() {
        return this.f4792c;
    }

    /* renamed from: androidx.recyclerview.widget.c$a */
    public static final class C1355a<T> {

        /* renamed from: d */
        private static final Object f4793d = new Object();

        /* renamed from: e */
        private static Executor f4794e;

        /* renamed from: a */
        private Executor f4795a;

        /* renamed from: b */
        private Executor f4796b;

        /* renamed from: c */
        private final C1374g.AbstractC1378c<T> f4797c;

        /* renamed from: a */
        public C1354c<T> mo7373a() {
            if (this.f4796b == null) {
                synchronized (f4793d) {
                    if (f4794e == null) {
                        f4794e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f4796b = f4794e;
            }
            return new C1354c<>(this.f4795a, this.f4796b, this.f4797c);
        }

        /* renamed from: a */
        public C1355a<T> mo7372a(Executor executor) {
            this.f4796b = executor;
            return this;
        }

        public C1355a(C1374g.AbstractC1378c<T> cVar) {
            this.f4797c = cVar;
        }
    }

    C1354c(Executor executor, Executor executor2, C1374g.AbstractC1378c<T> cVar) {
        this.f4790a = executor;
        this.f4791b = executor2;
        this.f4792c = cVar;
    }
}
