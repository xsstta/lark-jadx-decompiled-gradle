package com.ss.android.lark.profile.func.medal.utils;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.huawei.hms.feature.dynamic.DynamicModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/utils/StatusBarUtil;", "", "()V", "initTransparentStatusBar", "", "activity", "Landroid/app/Activity;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.medal.b.c */
public final class StatusBarUtil {

    /* renamed from: a */
    public static final StatusBarUtil f129800a = new StatusBarUtil();

    private StatusBarUtil() {
    }

    /* renamed from: a */
    public final void mo179261a(Activity activity) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            View decorView = window.getDecorView();
            Intrinsics.checkExpressionValueIsNotNull(decorView, "it.decorView");
            int systemUiVisibility = decorView.getSystemUiVisibility();
            View decorView2 = window.getDecorView();
            Intrinsics.checkExpressionValueIsNotNull(decorView2, "it.decorView");
            decorView2.setSystemUiVisibility(systemUiVisibility | DynamicModule.f58006b | 1024);
            window.setStatusBarColor(0);
        }
    }
}
