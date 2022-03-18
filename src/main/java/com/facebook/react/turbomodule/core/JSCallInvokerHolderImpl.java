package com.facebook.react.turbomodule.core;

import com.C1711a;
import com.facebook.react.turbomodule.core.interfaces.JSCallInvokerHolder;
import com.facebook.soloader.SoLoader;

public class JSCallInvokerHolderImpl implements JSCallInvokerHolder {
    static {
        try {
            SoLoader.loadLibrary("turbomodulejsijni");
        } catch (Throwable unused) {
            C1711a.m7628a("turbomodulejsijni");
        }
    }
}
