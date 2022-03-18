package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

final /* synthetic */ class da implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f55909a = new da();

    private da() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "UpdateListenerExecutor");
    }
}
