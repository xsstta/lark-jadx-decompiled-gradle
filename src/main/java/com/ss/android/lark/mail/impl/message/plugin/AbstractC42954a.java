package com.ss.android.lark.mail.impl.message.plugin;

import android.app.Activity;
import android.webkit.ValueCallback;

/* renamed from: com.ss.android.lark.mail.impl.message.plugin.a */
public abstract class AbstractC42954a {

    /* renamed from: a */
    public Activity f109389a;

    /* renamed from: b */
    public AbstractC42955a f109390b;

    /* renamed from: com.ss.android.lark.mail.impl.message.plugin.a$a */
    public interface AbstractC42955a {
        /* renamed from: a */
        void mo154070a();

        /* renamed from: a */
        void mo154071a(String str, ValueCallback<String> valueCallback);

        /* renamed from: a */
        void mo154072a(String str, String str2);

        /* renamed from: a */
        void mo154073a(String str, boolean z, boolean z2);

        /* renamed from: a */
        void mo154074a(String str, String... strArr);
    }

    public AbstractC42954a(Activity activity, AbstractC42955a aVar) {
        this.f109389a = activity;
        this.f109390b = aVar;
    }
}
