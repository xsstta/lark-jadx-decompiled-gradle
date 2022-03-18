package com.bytedance.platform.godzilla.plugin;

import android.app.Application;

/* renamed from: com.bytedance.platform.godzilla.plugin.a */
public abstract class AbstractC20329a {

    /* renamed from: a */
    private PluginState f49609a;

    /* renamed from: b */
    public abstract String mo68532b();

    /* renamed from: d */
    public StartType mo68641d() {
        return StartType.IMMEDIATE;
    }

    /* renamed from: a */
    public void mo68530a() {
        this.f49609a = PluginState.STARTED;
    }

    /* renamed from: a */
    public void mo68531a(Application application) {
        this.f49609a = PluginState.INITIALIZED;
    }
}
