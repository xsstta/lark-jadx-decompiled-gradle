package com.bytedance.ee.bear.facade.common.extension;

import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.ee.bear.facade.common.C7661a;

/* renamed from: com.bytedance.ee.bear.facade.common.extension.c */
public class C7702c extends C7661a {

    /* renamed from: a */
    public String f20818a;

    public C7702c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        this.f20818a = appCompatActivity.getClass().getSimpleName() + "#" + Integer.toHexString(appCompatActivity.hashCode());
        appCompatActivity.getLifecycle().addObserver(new ActivityLifeCycleLog$1(this));
    }
}
