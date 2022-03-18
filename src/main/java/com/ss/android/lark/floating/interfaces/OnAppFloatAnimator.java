package com.ss.android.lark.floating.interfaces;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowManager;
import com.ss.android.lark.floating.enums.SidePattern;
import com.ss.android.lark.floating.widget.appfloat.WindowManagerLayoutParamsProxy;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J:\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/floating/interfaces/OnAppFloatAnimator;", "", "enterAnim", "Landroid/animation/ValueAnimator;", "view", "Landroid/view/View;", "params", "Lcom/ss/android/lark/floating/widget/appfloat/WindowManagerLayoutParamsProxy;", "windowManager", "Landroid/view/WindowManager;", "sidePattern", "Lcom/ss/android/lark/floating/enums/SidePattern;", "targetOffsetX", "", "targetOffsetY", "exitAnim", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.c.b */
public interface OnAppFloatAnimator {
    /* renamed from: a */
    ValueAnimator mo140161a(View view, WindowManagerLayoutParamsProxy gVar, WindowManager windowManager, SidePattern sidePattern, int i, int i2);

    /* renamed from: b */
    ValueAnimator mo140162b(View view, WindowManagerLayoutParamsProxy gVar, WindowManager windowManager, SidePattern sidePattern, int i, int i2);
}
