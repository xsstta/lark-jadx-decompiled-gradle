package com.ss.android.lark.floating.widget.activityfloat;

import android.app.Activity;
import android.content.ComponentName;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.ss.android.lark.floating.data.FloatConfig;
import com.ss.android.lark.floating.interfaces.FloatCallbacks;
import com.ss.android.lark.floating.interfaces.OnFloatCallbacks;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0012\u0010\u0016\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00182\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001c\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/floating/widget/activityfloat/ActivityFloatManager;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "parentFrame", "Landroid/widget/FrameLayout;", "createFloat", "", "config", "Lcom/ss/android/lark/floating/data/FloatConfig;", "dismiss", "tag", "", "(Ljava/lang/String;)Lkotlin/Unit;", "floatingView", "Lcom/ss/android/lark/floating/widget/activityfloat/FloatingView;", "getFloatContainer", "Landroid/view/View;", "getFloatView", "getTag", "isShow", "", "setDragEnable", "dragEnable", "setVisibility", "visibility", "", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.widget.activityfloat.b */
public final class ActivityFloatManager {

    /* renamed from: a */
    private FrameLayout f98522a;

    /* renamed from: b */
    private final Activity f98523b;

    /* renamed from: d */
    private final FloatingView m150981d(String str) {
        return (FloatingView) this.f98522a.findViewWithTag(m150982e(str));
    }

    /* renamed from: a */
    public final Unit mo140296a(String str) {
        FloatingView d = m150981d(str);
        if (d == null) {
            return null;
        }
        d.mo140274b();
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final boolean mo140298b(String str) {
        FloatingView d = m150981d(str);
        if (d == null || d.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private final String m150982e(String str) {
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f98523b.getComponentName();
        Intrinsics.checkExpressionValueIsNotNull(componentName, "activity.componentName");
        String className = componentName.getClassName();
        Intrinsics.checkExpressionValueIsNotNull(className, "activity.componentName.className");
        return className;
    }

    /* renamed from: c */
    public final View mo140299c(String str) {
        FloatConfig config;
        FloatingView d = m150981d(str);
        if (d == null || (config = d.getConfig()) == null) {
            return null;
        }
        return config.mo140188c();
    }

    public ActivityFloatManager(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f98523b = activity;
        Window window = activity.getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
        View findViewById = window.getDecorView().findViewById(16908290);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "activity.window.decorVie…yId(android.R.id.content)");
        this.f98522a = (FrameLayout) findViewById;
    }

    /* renamed from: a */
    public final void mo140297a(FloatConfig aVar) {
        int i;
        FloatCallbacks.Builder a;
        Function3<Boolean, String, View, Unit> a2;
        Intrinsics.checkParameterIsNotNull(aVar, "config");
        FloatingView floatingView = new FloatingView(this.f98523b, null, 2, null);
        floatingView.setTag(m150982e(aVar.mo140191d()));
        int i2 = -1;
        if (aVar.mo140209o()) {
            i = -1;
        } else {
            i = -2;
        }
        if (!aVar.mo140210p()) {
            i2 = -2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        if (Intrinsics.areEqual(aVar.mo140216u(), new Pair(0, 0))) {
            layoutParams.gravity = aVar.mo140211q();
        }
        floatingView.setLayoutParams(layoutParams);
        floatingView.setFloatConfig(aVar);
        FloatingView floatingView2 = floatingView;
        this.f98522a.addView(floatingView2);
        aVar.mo140173a(floatingView2);
        aVar.mo140186b(floatingView2);
        OnFloatCallbacks x = aVar.mo140219x();
        if (x != null) {
            x.mo140244a(true, null, floatingView2);
        }
        FloatCallbacks y = aVar.mo140220y();
        if (y != null && (a = y.mo140225a()) != null && (a2 = a.mo140227a()) != null) {
            a2.invoke(true, null, floatingView);
        }
    }
}
