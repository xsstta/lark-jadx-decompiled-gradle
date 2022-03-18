package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.AbstractC21635e;
import com.google.android.gms.common.api.AbstractC21639g;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.AbstractC21692j;
import com.google.android.gms.common.api.AbstractC21693k;
import com.google.android.gms.common.api.AbstractC21694l;
import com.google.android.gms.common.api.AbstractC21695m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

public final class bq<R extends AbstractC21641i> extends AbstractC21695m<R> implements AbstractC21692j<R> {

    /* renamed from: a */
    private AbstractC21694l<? super R, ? extends AbstractC21641i> f52712a;

    /* renamed from: b */
    private bq<? extends AbstractC21641i> f52713b;

    /* renamed from: c */
    private volatile AbstractC21693k<? super R> f52714c;

    /* renamed from: d */
    private AbstractC21635e<R> f52715d;

    /* renamed from: e */
    private final Object f52716e;

    /* renamed from: f */
    private Status f52717f;

    /* renamed from: g */
    private final WeakReference<AbstractC21631d> f52718g;

    /* renamed from: h */
    private final bs f52719h;

    /* renamed from: i */
    private boolean f52720i;

    @Override // com.google.android.gms.common.api.AbstractC21692j
    /* renamed from: a */
    public final void mo73359a(R r) {
        synchronized (this.f52716e) {
            if (!r.getStatus().isSuccess()) {
                m78484a(r.getStatus());
                m78490b(r);
            } else if (this.f52712a != null) {
                bk.m78473a().submit(new br(this, r));
            } else if (m78492c()) {
                this.f52714c.mo73525b(r);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.android.gms.common.api.e<?> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo73402a(AbstractC21635e<?> eVar) {
        synchronized (this.f52716e) {
            this.f52715d = eVar;
            m78488b();
        }
    }

    /* renamed from: b */
    private final void m78488b() {
        if (this.f52712a != null || this.f52714c != null) {
            AbstractC21631d dVar = this.f52718g.get();
            if (!(this.f52720i || this.f52712a == null || dVar == null)) {
                dVar.mo73264a(this);
                this.f52720i = true;
            }
            Status status = this.f52717f;
            if (status != null) {
                m78489b(status);
                return;
            }
            AbstractC21635e<R> eVar = this.f52715d;
            if (eVar != null) {
                eVar.mo73292a(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m78484a(Status status) {
        synchronized (this.f52716e) {
            this.f52717f = status;
            m78489b(status);
        }
    }

    /* renamed from: b */
    private final void m78489b(Status status) {
        synchronized (this.f52716e) {
            AbstractC21694l<? super R, ? extends AbstractC21641i> lVar = this.f52712a;
            if (lVar != null) {
                Status a = lVar.mo73526a(status);
                Preconditions.checkNotNull(a, "onFailure must not return null");
                this.f52713b.m78484a(a);
            } else if (m78492c()) {
                this.f52714c.mo73524a(status);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo73401a() {
        this.f52714c = null;
    }

    /* renamed from: c */
    private final boolean m78492c() {
        return (this.f52714c == null || this.f52718g.get() == null) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m78490b(AbstractC21641i iVar) {
        if (iVar instanceof AbstractC21639g) {
            try {
                ((AbstractC21639g) iVar).mo73296a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(iVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("TransformedResultImpl", sb.toString(), e);
            }
        }
    }
}
