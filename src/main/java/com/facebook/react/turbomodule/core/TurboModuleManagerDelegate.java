package com.facebook.react.turbomodule.core;

import com.C1711a;
import com.facebook.jni.HybridData;
import com.facebook.react.turbomodule.core.interfaces.AbstractC21268a;
import com.facebook.soloader.SoLoader;

public abstract class TurboModuleManagerDelegate {

    /* renamed from: a */
    private final HybridData f51805a = mo72146a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract HybridData mo72146a();

    /* renamed from: a */
    public abstract AbstractC21268a mo72147a(String str);

    static {
        try {
            SoLoader.loadLibrary("turbomodulejsijni");
        } catch (Throwable unused) {
            C1711a.m7628a("turbomodulejsijni");
        }
    }

    protected TurboModuleManagerDelegate() {
    }
}
