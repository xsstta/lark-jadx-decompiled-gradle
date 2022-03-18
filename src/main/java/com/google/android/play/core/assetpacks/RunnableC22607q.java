package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.q */
public final /* synthetic */ class RunnableC22607q implements Runnable {

    /* renamed from: a */
    private final C22609s f55966a;

    /* renamed from: b */
    private final Bundle f55967b;

    /* renamed from: c */
    private final AssetPackState f55968c;

    RunnableC22607q(C22609s sVar, Bundle bundle, AssetPackState assetPackState) {
        this.f55966a = sVar;
        this.f55967b = bundle;
        this.f55968c = assetPackState;
    }

    public final void run() {
        this.f55966a.mo78820a(this.f55967b, this.f55968c);
    }
}
