package com.bytedance.ee.bear.debug;

import android.app.Activity;
import android.preference.PreferenceScreen;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ee.bear.debug.a */
public abstract class AbstractC5250a {

    /* renamed from: a */
    protected PreferenceScreen f15012a;

    /* renamed from: b */
    protected WeakReference<Activity> f15013b;

    public AbstractC5250a(PreferenceScreen preferenceScreen, Activity activity) {
        this.f15012a = preferenceScreen;
        this.f15013b = new WeakReference<>(activity);
    }
}
