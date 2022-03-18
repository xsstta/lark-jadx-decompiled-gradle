package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21655b;
import com.google.android.gms.common.internal.C21756m;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.common.api.internal.v */
public final class C21687v implements ar {

    /* renamed from: a */
    private final as f52883a;

    /* renamed from: b */
    private boolean f52884b;

    public C21687v(as asVar) {
        this.f52883a = asVar;
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: a */
    public final void mo73340a() {
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: a */
    public final void mo73342a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: a */
    public final void mo73343a(ConnectionResult connectionResult, C21611a<?> aVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: a */
    public final <A extends C21611a.AbstractC21613b, R extends AbstractC21641i, T extends C21655b.AbstractC21656a<R, A>> T mo73339a(T t) {
        return (T) mo73344b(t);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T extends com.google.android.gms.common.api.internal.b$a<? extends com.google.android.gms.common.api.i, A> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: b */
    public final <A extends C21611a.AbstractC21613b, T extends C21655b.AbstractC21656a<? extends AbstractC21641i, A>> T mo73344b(T t) {
        try {
            this.f52883a.f52675d.f52639e.mo73406a(t);
            aj ajVar = this.f52883a.f52675d;
            C21611a.AbstractC21622f fVar = ajVar.f52636b.get(t.mo73388d());
            Preconditions.checkNotNull(fVar, "Appropriate Api was not requested.");
            if (fVar.isConnected() || !this.f52883a.f52673b.containsKey(t.mo73388d())) {
                boolean z = fVar instanceof C21756m;
                C21611a.AbstractC21613b bVar = fVar;
                if (z) {
                    bVar = ((C21756m) fVar).mo73729a();
                }
                t.mo73387b(bVar == 1 ? 1 : 0);
                return t;
            }
            t.mo73386b(new Status(17));
            return t;
        } catch (DeadObjectException unused) {
            this.f52883a.mo73366a(new C21688w(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: b */
    public final boolean mo73345b() {
        if (this.f52884b) {
            return false;
        }
        if (this.f52883a.f52675d.mo73351m()) {
            this.f52884b = true;
            for (bq bqVar : this.f52883a.f52675d.f52638d) {
                bqVar.mo73401a();
            }
            return false;
        }
        this.f52883a.mo73364a((ConnectionResult) null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: c */
    public final void mo73346c() {
        if (this.f52884b) {
            this.f52884b = false;
            this.f52883a.mo73366a(new C21689x(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: a */
    public final void mo73341a(int i) {
        this.f52883a.mo73364a((ConnectionResult) null);
        this.f52883a.f52676e.mo73347a(i, this.f52884b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo73507d() {
        if (this.f52884b) {
            this.f52884b = false;
            this.f52883a.f52675d.f52639e.mo73405a();
            mo73345b();
        }
    }
}
