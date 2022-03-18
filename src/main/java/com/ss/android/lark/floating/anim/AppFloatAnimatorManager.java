package com.ss.android.lark.floating.anim;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowManager;
import com.ss.android.lark.floating.data.FloatConfig;
import com.ss.android.lark.floating.interfaces.OnAppFloatAnimator;
import com.ss.android.lark.floating.widget.appfloat.WindowManagerLayoutParamsProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u0004\u0018\u00010\fR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/floating/anim/AppFloatAnimatorManager;", "", "view", "Landroid/view/View;", "params", "Lcom/ss/android/lark/floating/widget/appfloat/WindowManagerLayoutParamsProxy;", "windowManager", "Landroid/view/WindowManager;", "config", "Lcom/ss/android/lark/floating/data/FloatConfig;", "(Landroid/view/View;Lcom/ss/android/lark/floating/widget/appfloat/WindowManagerLayoutParamsProxy;Landroid/view/WindowManager;Lcom/ss/android/lark/floating/data/FloatConfig;)V", "enterAnim", "Landroid/animation/ValueAnimator;", "exitAnim", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.a.b */
public final class AppFloatAnimatorManager {

    /* renamed from: a */
    private final View f98426a;

    /* renamed from: b */
    private final WindowManagerLayoutParamsProxy f98427b;

    /* renamed from: c */
    private final WindowManager f98428c;

    /* renamed from: d */
    private final FloatConfig f98429d;

    /* renamed from: a */
    public final ValueAnimator mo140159a() {
        OnAppFloatAnimator A = this.f98429d.mo140167A();
        if (A != null) {
            return A.mo140161a(this.f98426a, this.f98427b, this.f98428c, this.f98429d.mo140203i(), this.f98429d.mo140213s(), this.f98429d.mo140214t());
        }
        return null;
    }

    /* renamed from: b */
    public final ValueAnimator mo140160b() {
        OnAppFloatAnimator A = this.f98429d.mo140167A();
        if (A != null) {
            return A.mo140162b(this.f98426a, this.f98427b, this.f98428c, this.f98429d.mo140203i(), this.f98429d.mo140213s(), this.f98429d.mo140214t());
        }
        return null;
    }

    public AppFloatAnimatorManager(View view, WindowManagerLayoutParamsProxy gVar, WindowManager windowManager, FloatConfig aVar) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(gVar, "params");
        Intrinsics.checkParameterIsNotNull(windowManager, "windowManager");
        Intrinsics.checkParameterIsNotNull(aVar, "config");
        this.f98426a = view;
        this.f98427b = gVar;
        this.f98428c = windowManager;
        this.f98429d = aVar;
    }
}
