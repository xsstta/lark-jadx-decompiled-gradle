package com.ss.android.appcenter.common.bannerview.provider;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.p029a.C0864d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.ss.android.appcenter.common.util.C28184h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ScrollDurationManger extends LinearLayoutManager {

    /* renamed from: a */
    public final int f70530a;

    /* renamed from: b */
    private final LinearLayoutManager f70531b;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
        try {
            Method declaredMethod = this.f70531b.getClass().getDeclaredMethod("calculateExtraLayoutSpace", state.getClass(), iArr.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.f70531b, state, iArr);
        } catch (NoSuchMethodException e) {
            C28184h.m103247a("ScrollDurationManger", "exception:", e);
        } catch (IllegalAccessException e2) {
            C28184h.m103247a("ScrollDurationManger", "exception:", e2);
        } catch (InvocationTargetException e3) {
            C28184h.m103247a("ScrollDurationManger", "exception:", e3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, C0864d dVar) {
        this.f70531b.onInitializeAccessibilityNodeInfo(recycler, state, dVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        C281411 r2 = new LinearSmoothScroller(recyclerView.getContext()) {
            /* class com.ss.android.appcenter.common.bannerview.provider.ScrollDurationManger.C281411 */

            /* access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateTimeForDeceleration(int i) {
                return ScrollDurationManger.this.f70530a;
            }
        };
        r2.setTargetPosition(i);
        startSmoothScroll(r2);
    }

    public ScrollDurationManger(ViewPager2 viewPager2, int i, LinearLayoutManager linearLayoutManager) {
        super(viewPager2.getContext(), linearLayoutManager.getOrientation(), false);
        this.f70530a = i;
        this.f70531b = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean performAccessibilityAction(RecyclerView.Recycler recycler, RecyclerView.State state, int i, Bundle bundle) {
        return this.f70531b.performAccessibilityAction(recycler, state, i, bundle);
    }
}
