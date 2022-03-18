package com.ss.android.lark.floating.anim;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import com.ss.android.lark.floating.enums.SidePattern;
import com.ss.android.lark.floating.interfaces.OnAppFloatAnimator;
import com.ss.android.lark.floating.widget.appfloat.WindowManagerLayoutParamsProxy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J:\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J \u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/floating/anim/AppFloatDefaultAnimator;", "Lcom/ss/android/lark/floating/interfaces/OnAppFloatAnimator;", "()V", "enterAnim", "Landroid/animation/ValueAnimator;", "view", "Landroid/view/View;", "params", "Lcom/ss/android/lark/floating/widget/appfloat/WindowManagerLayoutParamsProxy;", "windowManager", "Landroid/view/WindowManager;", "sidePattern", "Lcom/ss/android/lark/floating/enums/SidePattern;", "targetOffsetX", "", "targetOffsetY", "exitAnim", "initValue", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.a.c */
public class AppFloatDefaultAnimator implements OnAppFloatAnimator {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/lark/floating/anim/AppFloatDefaultAnimator$enterAnim$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.a.c$a */
    static final class C38335a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ WindowManagerLayoutParamsProxy f98430a;

        /* renamed from: b */
        final /* synthetic */ WindowManager f98431b;

        /* renamed from: c */
        final /* synthetic */ View f98432c;

        C38335a(WindowManagerLayoutParamsProxy gVar, WindowManager windowManager, View view) {
            this.f98430a = gVar;
            this.f98431b = windowManager;
            this.f98432c = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            WindowManagerLayoutParamsProxy gVar = this.f98430a;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                gVar.mo140379g(((Integer) animatedValue).intValue());
                this.f98431b.updateViewLayout(this.f98432c, this.f98430a.mo140375d());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/lark/floating/anim/AppFloatDefaultAnimator$exitAnim$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.a.c$b */
    static final class C38336b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ WindowManagerLayoutParamsProxy f98433a;

        /* renamed from: b */
        final /* synthetic */ WindowManager f98434b;

        /* renamed from: c */
        final /* synthetic */ View f98435c;

        C38336b(WindowManagerLayoutParamsProxy gVar, WindowManager windowManager, View view) {
            this.f98433a = gVar;
            this.f98434b = windowManager;
            this.f98435c = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            WindowManagerLayoutParamsProxy gVar = this.f98433a;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                gVar.mo140379g(((Integer) animatedValue).intValue());
                this.f98434b.updateViewLayout(this.f98435c, this.f98433a.mo140375d());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: a */
    private final int m150851a(View view, WindowManagerLayoutParamsProxy gVar, WindowManager windowManager) {
        Rect rect = new Rect();
        windowManager.getDefaultDisplay().getRectSize(rect);
        int b = gVar.mo140371b();
        if (b < rect.right - (view.getRight() + b)) {
            return -view.getRight();
        }
        return rect.right;
    }

    @Override // com.ss.android.lark.floating.interfaces.OnAppFloatAnimator
    /* renamed from: b */
    public ValueAnimator mo140162b(View view, WindowManagerLayoutParamsProxy gVar, WindowManager windowManager, SidePattern sidePattern, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(gVar, "params");
        Intrinsics.checkParameterIsNotNull(windowManager, "windowManager");
        Intrinsics.checkParameterIsNotNull(sidePattern, "sidePattern");
        ValueAnimator ofInt = ValueAnimator.ofInt(gVar.mo140371b(), m150851a(view, gVar, windowManager));
        ofInt.addUpdateListener(new C38336b(gVar, windowManager, view));
        return ofInt;
    }

    @Override // com.ss.android.lark.floating.interfaces.OnAppFloatAnimator
    /* renamed from: a */
    public ValueAnimator mo140161a(View view, WindowManagerLayoutParamsProxy gVar, WindowManager windowManager, SidePattern sidePattern, int i, int i2) {
        int i3;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(gVar, "params");
        Intrinsics.checkParameterIsNotNull(windowManager, "windowManager");
        Intrinsics.checkParameterIsNotNull(sidePattern, "sidePattern");
        int a = m150851a(view, gVar, windowManager);
        int b = gVar.mo140371b();
        if (b > 0) {
            i3 = b + i;
        } else {
            i3 = b - i;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(a, i3);
        ofInt.setDuration(500L);
        ofInt.addUpdateListener(new C38335a(gVar, windowManager, view));
        return ofInt;
    }
}
