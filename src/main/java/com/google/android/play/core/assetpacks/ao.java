package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.C22741m;

final class ao extends al<Void> {

    /* renamed from: c */
    final /* synthetic */ C22604n f55684c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ao(C22604n nVar, C22741m<Void> mVar) {
        super(nVar, mVar);
        this.f55684c = nVar;
    }

    @Override // com.google.android.play.core.assetpacks.al, com.google.android.play.core.internal.AbstractC22652u
    /* renamed from: a */
    public final void mo78740a(Bundle bundle, Bundle bundle2) {
        super.mo78740a(bundle, bundle2);
        if (!this.f55684c.f55961g.compareAndSet(true, false)) {
            C22604n.f55955a.mo78875d("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f55684c.mo78780a();
        }
    }
}
