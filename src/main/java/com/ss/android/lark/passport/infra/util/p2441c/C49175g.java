package com.ss.android.lark.passport.infra.util.p2441c;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¨\u0006\b"}, d2 = {"inTransparentStatusBarMode", "", "Landroid/view/Window;", "updateAttrs", "", "action", "Lkotlin/Function1;", "Landroid/view/WindowManager$LayoutParams;", "passport-infra_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.util.c.g */
public final class C49175g {
    /* renamed from: a */
    public static final boolean m193894a(Window window) {
        Intrinsics.checkParameterIsNotNull(window, "$this$inTransparentStatusBarMode");
        View decorView = window.getDecorView();
        Intrinsics.checkExpressionValueIsNotNull(decorView, "window.decorView");
        if (((decorView.getSystemUiVisibility() & 1024) | (window.getAttributes().flags & 67108864)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m193893a(Window window, Function1<? super WindowManager.LayoutParams, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(window, "$this$updateAttrs");
        Intrinsics.checkParameterIsNotNull(function1, "action");
        WindowManager.LayoutParams attributes = window.getAttributes();
        Intrinsics.checkExpressionValueIsNotNull(attributes, "attr");
        function1.invoke(attributes);
        window.setAttributes(attributes);
    }
}
