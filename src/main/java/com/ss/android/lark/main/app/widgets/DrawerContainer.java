package com.ss.android.lark.main.app.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.ss.android.lark.biz.core.api.IMainDrawerListener;
import com.ss.android.lark.sdk.C53241h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class DrawerContainer extends FrameLayout {

    /* renamed from: a */
    private String f112699a;

    /* renamed from: b */
    private Map<String, WeakReference<View>> f112700b = new HashMap();

    /* renamed from: a */
    public void mo157749a() {
        for (IMainDrawerListener xVar : MainDrawerListenerManager.f112748a.mo157810a().mo157807a()) {
            xVar.mo105897a();
        }
    }

    /* renamed from: b */
    public void mo157753b() {
        for (IMainDrawerListener xVar : MainDrawerListenerManager.f112748a.mo157810a().mo157807a()) {
            xVar.mo105900c();
        }
    }

    /* renamed from: c */
    public void mo157755c() {
        for (IMainDrawerListener xVar : MainDrawerListenerManager.f112748a.mo157810a().mo157807a()) {
            xVar.mo105899b();
        }
    }

    /* renamed from: d */
    public void mo157757d() {
        for (IMainDrawerListener xVar : MainDrawerListenerManager.f112748a.mo157810a().mo157807a()) {
            xVar.mo105901d();
        }
    }

    public DrawerLayout.LayoutParams getContainerLayoutParams() {
        DrawerLayout.LayoutParams layoutParams = new DrawerLayout.LayoutParams(-2, -1);
        layoutParams.f3665a = 8388611;
        setMinimumWidth(100);
        return layoutParams;
    }

    public DrawerContainer(Context context) {
        super(context);
    }

    /* renamed from: a */
    public boolean mo157752a(String str) {
        return this.f112700b.containsKey("conversation");
    }

    /* renamed from: a */
    public void mo157750a(int i) {
        for (IMainDrawerListener xVar : MainDrawerListenerManager.f112748a.mo157810a().mo157807a()) {
            xVar.mo105898a(i);
            if (i == 1) {
                xVar.mo105897a();
            }
        }
    }

    /* renamed from: c */
    public void mo157756c(String str) {
        if (this.f112700b.containsKey(str)) {
            removeView(this.f112700b.get(str).get());
        }
        this.f112700b.remove(str);
    }

    /* renamed from: b */
    public void mo157754b(String str) {
        this.f112699a = "conversation";
        C53241h.m205898b("DrawerContainer", "switchDrawerContainer:type=" + str + ", current=" + this.f112699a);
        for (Map.Entry<String, WeakReference<View>> entry : this.f112700b.entrySet()) {
            String key = entry.getKey();
            View view = entry.getValue().get();
            if (view != null) {
                if (TextUtils.equals(key, this.f112699a)) {
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                }
            }
        }
    }

    public DrawerContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo157751a(String str, View view) {
        if (this.f112700b.containsKey(str)) {
            removeView(this.f112700b.get(str).get());
        }
        addView(view);
        this.f112700b.put(str, new WeakReference<>(view));
    }

    public DrawerContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
