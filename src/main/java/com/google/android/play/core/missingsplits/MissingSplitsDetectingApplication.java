package com.google.android.play.core.missingsplits;

import android.app.Application;

public class MissingSplitsDetectingApplication extends Application {

    /* renamed from: a */
    private boolean f56066a;

    /* renamed from: a */
    public void mo78963a() {
    }

    public final void onCreate() {
        if (!this.f56066a) {
            this.f56066a = true;
            if (!C22659b.m82479a(this).mo78969a()) {
                super.onCreate();
                mo78963a();
                return;
            }
            return;
        }
        throw new IllegalStateException("The onCreate method must be invoked at most once.");
    }
}
