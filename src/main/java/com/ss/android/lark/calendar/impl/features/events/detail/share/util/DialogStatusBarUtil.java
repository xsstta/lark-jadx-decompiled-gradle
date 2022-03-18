package com.ss.android.lark.calendar.impl.features.events.detail.share.util;

import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/util/DialogStatusBarUtil;", "", "()V", "transparentStatusBar", "", "window", "Landroid/view/Window;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.b.a */
public final class DialogStatusBarUtil {

    /* renamed from: a */
    public static final DialogStatusBarUtil f79499a = new DialogStatusBarUtil();

    private DialogStatusBarUtil() {
    }

    /* renamed from: a */
    public final void mo113950a(Window window) {
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            Intrinsics.checkExpressionValueIsNotNull(decorView, "window.decorView");
            int systemUiVisibility = decorView.getSystemUiVisibility();
            View decorView2 = window.getDecorView();
            Intrinsics.checkExpressionValueIsNotNull(decorView2, "window.decorView");
            decorView2.setSystemUiVisibility(systemUiVisibility | 1280);
            window.setStatusBarColor(0);
        }
    }
}
