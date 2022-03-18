package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21655b;
import com.google.android.gms.common.api.internal.C21655b.AbstractC21656a;
import com.google.android.gms.common.api.internal.C21661c;

/* renamed from: com.google.android.gms.common.api.internal.by */
public final class C21660by<A extends C21655b.AbstractC21656a<? extends AbstractC21641i, C21611a.AbstractC21613b>> extends an {

    /* renamed from: a */
    private final A f52734a;

    public C21660by(int i, A a) {
        super(i);
        this.f52734a = a;
    }

    @Override // com.google.android.gms.common.api.internal.an
    /* renamed from: a */
    public final void mo73356a(C21661c.C21662a<?> aVar) throws DeadObjectException {
        try {
            this.f52734a.mo73387b(aVar.mo73431b());
        } catch (RuntimeException e) {
            mo73358a(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.an
    /* renamed from: a */
    public final void mo73355a(Status status) {
        this.f52734a.mo73386b(status);
    }

    @Override // com.google.android.gms.common.api.internal.an
    /* renamed from: a */
    public final void mo73358a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f52734a.mo73386b(new Status(10, sb.toString()));
    }

    @Override // com.google.android.gms.common.api.internal.an
    /* renamed from: a */
    public final void mo73357a(C21681p pVar, boolean z) {
        pVar.mo73499a(this.f52734a, z);
    }
}
