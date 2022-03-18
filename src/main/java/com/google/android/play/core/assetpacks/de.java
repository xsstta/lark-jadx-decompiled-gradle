package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.internal.bd;
import com.google.android.play.core.internal.cc;

public final class de implements cc<Object> {

    /* renamed from: a */
    private final cc<cx> f55912a;

    /* renamed from: b */
    private final cc<Context> f55913b;

    public de(cc<cx> ccVar, cc<Context> ccVar2) {
        this.f55912a = ccVar;
        this.f55913b = ccVar2;
    }

    @Override // com.google.android.play.core.internal.cc
    /* renamed from: a */
    public final /* synthetic */ Object mo78728a() {
        cx a = this.f55912a.mo78728a();
        Context b = ((dg) this.f55913b).mo78728a();
        cx cxVar = a;
        bd.m82320a(b.getPackageManager(), new ComponentName(b.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"));
        PlayCoreDialogWrapperActivity.m82220a(b);
        bd.m82322a(cxVar, "Cannot return null from a non-@Nullable @Provides method");
        return cxVar;
    }
}
