package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

final /* synthetic */ class cz implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f55908a = new cz();

    private cz() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}
