package com.google.android.play.core.internal;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.internal.g */
public final class C22638g extends AbstractRunnableC22634c {

    /* renamed from: a */
    final /* synthetic */ C22622ac f56061a;

    C22638g(C22622ac acVar) {
        this.f56061a = acVar;
    }

    @Override // com.google.android.play.core.internal.AbstractRunnableC22634c
    /* renamed from: a */
    public final void mo78814a() {
        if (this.f56061a.f56016l != null) {
            this.f56061a.f56007c.mo78874c("Unbind from service.", new Object[0]);
            this.f56061a.f56006b.unbindService(this.f56061a.f56015k);
            this.f56061a.f56010f = false;
            this.f56061a.f56016l = null;
            this.f56061a.f56015k = null;
        }
    }
}
