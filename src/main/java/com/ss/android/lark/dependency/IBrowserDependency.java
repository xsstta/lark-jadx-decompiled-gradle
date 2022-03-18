package com.ss.android.lark.dependency;

import android.content.Context;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IBrowserDependency {

    @Retention(RetentionPolicy.SOURCE)
    public @interface LKPLaunchType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SourceType {
    }

    /* renamed from: a */
    void mo134330a(Context context, String str);

    /* renamed from: a */
    void mo134331a(Context context, String str, int i);

    /* renamed from: b */
    void mo134332b(Context context, String str);

    /* renamed from: b */
    void mo134333b(Context context, String str, int i);

    /* renamed from: c */
    void mo134334c(Context context, String str);
}
