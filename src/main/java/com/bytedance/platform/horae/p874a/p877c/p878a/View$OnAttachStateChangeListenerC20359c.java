package com.bytedance.platform.horae.p874a.p877c.p878a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.platform.horae.common.C20371b;
import com.bytedance.platform.horae.common.Logger;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.platform.horae.a.c.a.c */
public class View$OnAttachStateChangeListenerC20359c extends AbstractC20357a implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, View.OnLayoutChangeListener, ViewTreeObserver.OnDrawListener, ViewTreeObserver.OnGlobalFocusChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener {

    /* renamed from: c */
    private Application f49693c;

    /* renamed from: d */
    private Field f49694d;

    /* renamed from: e */
    private long f49695e;

    public void onDraw() {
        m74180a("onDraw");
    }

    public void onGlobalLayout() {
        m74180a("onGlobalLayout");
    }

    public boolean onPreDraw() {
        m74180a("onPreDraw");
        return true;
    }

    public void onScrollChanged() {
        m74180a("onScrollChanged");
    }

    /* renamed from: a */
    public void mo68672a() {
        try {
            Field a = C20371b.m74215a(View.class, "mAttachInfo");
            this.f49694d = a;
            if (a != null) {
                a.setAccessible(true);
                this.f49693c.registerActivityLifecycleCallbacks(this);
            }
        } catch (Throwable unused) {
        }
    }

    public void onActivityDestroyed(Activity activity) {
        m74180a("onActivityDestroyed");
    }

    public void onActivityPaused(Activity activity) {
        m74180a("onActivityPaused");
    }

    public void onActivityResumed(Activity activity) {
        m74180a("onActivityResumed");
    }

    public void onActivityStopped(Activity activity) {
        m74180a("onActivityStopped");
    }

    public void onTouchModeChanged(boolean z) {
        m74180a("onTouchModeChanged");
    }

    public void onViewAttachedToWindow(View view) {
        m74180a("onViewAttachedToWindow");
    }

    public void onViewDetachedFromWindow(View view) {
        m74180a("onViewDetachedFromWindow");
    }

    /* renamed from: a */
    private void m74180a(String str) {
        if (this.f49692b != null && System.currentTimeMillis() - this.f49695e > 1000) {
            this.f49692b.mo68671a(this.f49691a);
            this.f49695e = System.currentTimeMillis();
            Logger.m74201a("PerformTraversalsHook", "notifyCallback form method = " + str);
        }
    }

    public void onActivityStarted(Activity activity) {
        if (this.f49694d != null) {
            try {
                View decorView = activity.getWindow().getDecorView();
                ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
                viewTreeObserver.addOnDrawListener(this);
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
                viewTreeObserver.addOnGlobalLayoutListener(this);
                viewTreeObserver.addOnPreDrawListener(this);
                viewTreeObserver.addOnScrollChangedListener(this);
                viewTreeObserver.addOnTouchModeChangeListener(this);
                decorView.addOnAttachStateChangeListener(this);
                decorView.addOnLayoutChangeListener(this);
            } catch (Throwable unused) {
            }
        }
    }

    public View$OnAttachStateChangeListenerC20359c(Application application, AbstractC20358b bVar) {
        super("PerformTraversalsHook", bVar);
        this.f49693c = application;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        m74180a("onActivityCreated");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m74180a("onActivitySaveInstanceState");
    }

    public void onGlobalFocusChanged(View view, View view2) {
        m74180a("onGlobalFocusChanged");
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m74180a("onLayoutChange");
    }
}
