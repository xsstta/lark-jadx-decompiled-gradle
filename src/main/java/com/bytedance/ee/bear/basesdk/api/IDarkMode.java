package com.bytedance.ee.bear.basesdk.api;

import android.content.Context;
import android.content.res.Configuration;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IDarkMode {

    @Retention(RetentionPolicy.SOURCE)
    public @interface DarkModeType {
    }

    /* renamed from: a */
    void mo17015a(Context context, int i);

    /* renamed from: a */
    void mo17016a(Context context, Configuration configuration);
}
