package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.C22741m;
import java.util.List;

final class ar extends al<AbstractC22591d> {

    /* renamed from: c */
    private final List<String> f55691c;

    /* renamed from: d */
    private final bb f55692d;

    ar(C22604n nVar, C22741m<AbstractC22591d> mVar, bb bbVar, List<String> list) {
        super(nVar, mVar);
        this.f55692d = bbVar;
        this.f55691c = list;
    }

    @Override // com.google.android.play.core.assetpacks.al, com.google.android.play.core.internal.AbstractC22652u
    /* renamed from: a */
    public final void mo78738a(int i, Bundle bundle) {
        super.mo78738a(i, bundle);
        this.f55681a.mo79092b(AbstractC22591d.m82114a(bundle, this.f55692d, this.f55691c));
    }
}
