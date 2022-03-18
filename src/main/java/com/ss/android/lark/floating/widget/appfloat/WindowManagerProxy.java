package com.ss.android.lark.floating.widget.appfloat;

import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0017J\u0011\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bH\u0001J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0019\u0010\u000e\u001a\u00020\u00052\u000e\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u00070\u0007H\u0001J\u001c\u0010\u0010\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0017R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/floating/widget/appfloat/WindowManagerProxy;", "Landroid/view/WindowManager;", "windowManager", "(Landroid/view/WindowManager;)V", "addView", "", "view", "Landroid/view/View;", "params", "Landroid/view/ViewGroup$LayoutParams;", "getDefaultDisplay", "Landroid/view/Display;", "kotlin.jvm.PlatformType", "removeView", "removeViewImmediate", "p0", "updateViewLayout", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.widget.appfloat.h */
public final class WindowManagerProxy implements WindowManager {

    /* renamed from: a */
    private final WindowManager f98601a;

    public Display getDefaultDisplay() {
        return this.f98601a.getDefaultDisplay();
    }

    public void removeViewImmediate(View view) {
        this.f98601a.removeViewImmediate(view);
    }

    public void removeView(View view) {
        this.f98601a.removeView(view);
    }

    public WindowManagerProxy(WindowManager windowManager) {
        Intrinsics.checkParameterIsNotNull(windowManager, "windowManager");
        this.f98601a = windowManager;
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        C38363i.m151053a(layoutParams);
        this.f98601a.addView(view, layoutParams);
    }

    public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        C38363i.m151053a(layoutParams);
        if (view != null && view.isAttachedToWindow()) {
            this.f98601a.updateViewLayout(view, layoutParams);
        }
    }
}
