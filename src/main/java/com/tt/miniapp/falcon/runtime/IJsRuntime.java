package com.tt.miniapp.falcon.runtime;

import com.tt.frontendapiinterface.IJsBridge;
import com.tt.miniapp.AbstractC66328m;

public interface IJsRuntime {
    IJsBridge getJsBridge();

    int getJsSdkLoadState();

    long getRuntimePointer();

    void loadMainJs(AbstractC66328m mVar);

    void loadSubPackageMainJs(AbstractC66328m mVar, String str);

    void postRunnable(Runnable runnable);

    void postRunnable(Runnable runnable, boolean z);

    void release();
}
