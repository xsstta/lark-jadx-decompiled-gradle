package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.HandlerC21909h;

/* renamed from: com.google.android.gms.common.api.internal.f */
public final class C21668f<L> {

    /* renamed from: a */
    private final HandlerC21671c f52857a;

    /* renamed from: b */
    private volatile L f52858b;

    /* renamed from: c */
    private final C21669a<L> f52859c;

    /* renamed from: com.google.android.gms.common.api.internal.f$b */
    public interface AbstractC21670b<L> {
        /* renamed from: a */
        void mo73485a();

        /* renamed from: a */
        void mo73486a(L l);
    }

    C21668f(Looper looper, L l, String str) {
        this.f52857a = new HandlerC21671c(looper);
        this.f52858b = (L) Preconditions.checkNotNull(l, "Listener must not be null");
        this.f52859c = new C21669a<>(l, Preconditions.checkNotEmpty(str));
    }

    /* renamed from: com.google.android.gms.common.api.internal.f$c */
    private final class HandlerC21671c extends HandlerC21909h {
        public HandlerC21671c(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            Preconditions.checkArgument(z);
            C21668f.this.mo73482b((AbstractC21670b) message.obj);
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.f$a */
    public static final class C21669a<L> {

        /* renamed from: a */
        private final L f52860a;

        /* renamed from: b */
        private final String f52861b;

        C21669a(L l, String str) {
            this.f52860a = l;
            this.f52861b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21669a)) {
                return false;
            }
            C21669a aVar = (C21669a) obj;
            return this.f52860a == aVar.f52860a && this.f52861b.equals(aVar.f52861b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f52860a) * 31) + this.f52861b.hashCode();
        }
    }

    /* renamed from: a */
    public final void mo73480a(AbstractC21670b<? super L> bVar) {
        Preconditions.checkNotNull(bVar, "Notifier must not be null");
        this.f52857a.sendMessage(this.f52857a.obtainMessage(1, bVar));
    }

    /* renamed from: a */
    public final void mo73479a() {
        this.f52858b = null;
    }

    /* renamed from: b */
    public final C21669a<L> mo73481b() {
        return this.f52859c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo73482b(AbstractC21670b<? super L> bVar) {
        L l = this.f52858b;
        if (l == null) {
            bVar.mo73485a();
            return;
        }
        try {
            bVar.mo73486a(l);
        } catch (RuntimeException e) {
            bVar.mo73485a();
            throw e;
        }
    }
}
