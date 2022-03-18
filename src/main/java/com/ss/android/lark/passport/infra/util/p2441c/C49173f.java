package com.ss.android.lark.passport.infra.util.p2441c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a2\u0010\u001b\u001a\u00020\u001c*\u00020\u00052#\b\u0004\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u001c0\u001eH\b\u001a\f\u0010\"\u001a\u0004\u0018\u00010#*\u00020\u0005\u001a\f\u0010$\u001a\u0004\u0018\u00010%*\u00020\u0005\u001a\u0012\u0010&\u001a\u00020\u000e*\u00020\u00052\u0006\u0010'\u001a\u00020\u0003\u001a\n\u0010(\u001a\u00020\u000e*\u00020\u0005\u001a\n\u0010)\u001a\u00020\u0003*\u00020\u0005\u001a\u0012\u0010*\u001a\u00020+*\u00020\u00052\u0006\u0010,\u001a\u00020-\u001a\u0014\u0010.\u001a\u00020\u001c*\u00020\u00052\b\b\u0001\u0010/\u001a\u00020\u000e\u001a7\u00100\u001a\u00020\u001c\"\n\b\u0000\u00101\u0018\u0001*\u000202*\u00020\u00052\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u0002H1\u0012\u0004\u0012\u00020\u001c0\u001e¢\u0006\u0002\b4H\b¢\u0006\u0002\b5\u001a&\u00100\u001a\u00020\u001c*\u00020\u00052\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001c0\u001e¢\u0006\u0002\b4H\b\u001a2\u00106\u001a\u00020\u001c*\u00020\u00052\b\b\u0003\u00107\u001a\u00020\u000e2\b\b\u0003\u00108\u001a\u00020\u000e2\b\b\u0003\u00109\u001a\u00020\u000e2\b\b\u0003\u0010:\u001a\u00020\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"*\u0010\u0004\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\b\"*\u0010\t\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\b\"*\u0010\u000b\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b\"\u0016\u0010\r\u001a\u00020\u000e*\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0016\u0010\u0011\u001a\u00020\u000e*\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\"\u0016\u0010\u0013\u001a\u00020\u000e*\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010\"\u0016\u0010\u0015\u001a\u00020\u000e*\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010\"\u0016\u0010\u0017\u001a\u00020\u000e*\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010\"\u0016\u0010\u0019\u001a\u00020\u000e*\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010¨\u0006;"}, d2 = {"location", "", "value", "", "isGone", "Landroid/view/View;", "(Landroid/view/View;)Z", "setGone", "(Landroid/view/View;Z)V", "isInvisible", "setInvisible", "isVisible", "setVisible", "marginBottom", "", "getMarginBottom", "(Landroid/view/View;)I", "marginEnd", "getMarginEnd", "marginLeft", "getMarginLeft", "marginRight", "getMarginRight", "marginStart", "getMarginStart", "marginTop", "getMarginTop", "doOnNextLayout", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "view", "findActivity", "Landroid/app/Activity;", "findAttachedWindow", "Landroid/view/Window;", "getBottomOnScreen", "withMarginBottom", "getHeightWithMargin", "inTransparentStatusBarMode", "newLifecycle", "Landroidx/lifecycle/Lifecycle;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "setPadding", "size", "updateLayoutParams", "T", "Landroid/view/ViewGroup$LayoutParams;", "block", "Lkotlin/ExtensionFunctionType;", "updateLayoutParamsTyped", "updatePadding", "left", "top", "right", "bottom", "passport-infra_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.util.c.f */
public final class C49173f {

    /* renamed from: a */
    private static final int[] f123458a = new int[2];

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/passport/infra/util/ext/ViewKt$newLifecycle$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.util.c.f$a */
    public static final class View$OnAttachStateChangeListenerC49174a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ LifecycleRegistry f123459a;

        View$OnAttachStateChangeListenerC49174a(LifecycleRegistry lifecycleRegistry) {
            this.f123459a = lifecycleRegistry;
        }

        public void onViewAttachedToWindow(View view) {
            this.f123459a.setCurrentState(Lifecycle.State.RESUMED);
        }

        public void onViewDetachedFromWindow(View view) {
            this.f123459a.setCurrentState(Lifecycle.State.CREATED);
        }
    }

    /* renamed from: a */
    public static final Activity m193886a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "$this$findActivity");
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m193891c(View view) {
        Intrinsics.checkParameterIsNotNull(view, "$this$inTransparentStatusBarMode");
        Window b = m193890b(view);
        if (b != null) {
            return C49175g.m193894a(b);
        }
        return false;
    }

    /* renamed from: d */
    public static final int m193892d(View view) {
        int i;
        Intrinsics.checkParameterIsNotNull(view, "$this$getHeightWithMargin");
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        } else {
            i = 0;
        }
        return height + i;
    }

    /* renamed from: b */
    public static final Window m193890b(View view) {
        Intrinsics.checkParameterIsNotNull(view, "$this$findAttachedWindow");
        if (!view.isAttachedToWindow()) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final int m193885a(View view, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "$this$getBottomOnScreen");
        int i = 0;
        if (!view.isAttachedToWindow()) {
            return 0;
        }
        int[] iArr = f123458a;
        view.getLocationOnScreen(iArr);
        int height = iArr[1] + view.getHeight();
        if (!z) {
            return height;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.bottomMargin;
        }
        return height + i;
    }

    /* renamed from: a */
    public static final Lifecycle m193887a(View view, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(view, "$this$newLifecycle");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(lifecycleOwner);
        if (view.isAttachedToWindow()) {
            lifecycleRegistry.setCurrentState(Lifecycle.State.RESUMED);
        }
        view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC49174a(lifecycleRegistry));
        return lifecycleRegistry;
    }

    /* renamed from: a */
    public static final void m193888a(View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(view, "$this$updatePadding");
        view.setPadding(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static /* synthetic */ void m193889a(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        m193888a(view, i, i2, i3, i4);
    }
}
