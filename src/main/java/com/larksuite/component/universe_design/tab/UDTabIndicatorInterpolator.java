package com.larksuite.component.universe_design.tab;

import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0004J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0004J4\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J \u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0013¨\u0006\u0016"}, d2 = {"Lcom/larksuite/component/universe_design/tab/UDTabIndicatorInterpolator;", "", "()V", "getViewLeft", "", "view", "Landroid/view/View;", "isIndicatorFullWidth", "", "getViewRight", "setIndicatorBoundsByOffset", "", "tabLayout", "Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "startView", "endView", "offset", "", "indicator", "Landroid/graphics/drawable/Drawable;", "setIndicatorBoundsOnTab", "tabView", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.tab.c */
public class UDTabIndicatorInterpolator {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo91349a(View view, boolean z) {
        if (view == null) {
            return 0;
        }
        if (z) {
            return view.getLeft();
        }
        if (view instanceof IUDTabView) {
            return ((IUDTabView) view).getContentViewLeft();
        }
        return view.getLeft();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo91352b(View view, boolean z) {
        if (view == null) {
            return 0;
        }
        if (z) {
            return view.getRight();
        }
        if (view instanceof IUDTabView) {
            return ((IUDTabView) view).getContentViewRight();
        }
        return view.getRight();
    }

    /* renamed from: a */
    public final void mo91350a(UDTabLayout uDTabLayout, View view, Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(uDTabLayout, "tabLayout");
        Intrinsics.checkParameterIsNotNull(drawable, "indicator");
        boolean isIndicatorFullWidth = uDTabLayout.isIndicatorFullWidth();
        drawable.setBounds(mo91349a(view, isIndicatorFullWidth), drawable.getBounds().top, mo91352b(view, isIndicatorFullWidth), drawable.getBounds().bottom);
    }

    /* renamed from: a */
    public final void mo91351a(UDTabLayout uDTabLayout, View view, View view2, float f, Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(uDTabLayout, "tabLayout");
        Intrinsics.checkParameterIsNotNull(drawable, "indicator");
        boolean isIndicatorFullWidth = uDTabLayout.isIndicatorFullWidth();
        int a = mo91349a(view, isIndicatorFullWidth);
        int b = mo91352b(view, isIndicatorFullWidth);
        int a2 = mo91349a(view2, isIndicatorFullWidth);
        int b2 = mo91352b(view2, isIndicatorFullWidth);
        drawable.setBounds((int) (((float) a) + (((float) (a2 - a)) * f)), drawable.getBounds().top, (int) (((float) b) + (((float) (b2 - b)) * f)), drawable.getBounds().bottom);
    }
}
