package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.bd;
import com.google.android.play.core.internal.cc;

public final class dg implements cc<Context> {

    /* renamed from: a */
    private final C22592db f55917a;

    public dg(C22592db dbVar) {
        this.f55917a = dbVar;
    }

    /* renamed from: a */
    public static Context m82125a(C22592db dbVar) {
        Context a = dbVar.mo78811a();
        bd.m82322a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: b */
    public final Context mo78728a() {
        return m82125a(this.f55917a);
    }
}
