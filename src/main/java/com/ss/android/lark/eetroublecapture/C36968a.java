package com.ss.android.lark.eetroublecapture;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* renamed from: com.ss.android.lark.eetroublecapture.a */
public class C36968a implements Application.ActivityLifecycleCallbacks, AbstractC36974c {

    /* renamed from: a */
    private volatile Activity f95047a;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // com.ss.android.lark.eetroublecapture.AbstractC36974c
    /* renamed from: a */
    public synchronized Activity mo136463a() {
        return this.f95047a;
    }

    public C36968a(Context context) {
    }

    public void onActivityStarted(Activity activity) {
        this.f95047a = activity;
    }

    public void onActivityStopped(Activity activity) {
        if (this.f95047a == activity) {
            this.f95047a = null;
        }
    }
}
