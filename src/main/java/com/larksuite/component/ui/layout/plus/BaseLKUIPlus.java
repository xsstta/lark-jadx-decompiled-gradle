package com.larksuite.component.ui.layout.plus;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.ui.layout.DefaultLKUIDelegate;
import com.larksuite.component.ui.layout.ILKUILayout;
import com.larksuite.component.ui.layout.OnLayoutData;
import com.larksuite.component.ui.layout.OnMeasureData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\t\u0010\f\u001a\u00020\rH\u0001J\t\u0010\u000e\u001a\u00020\rH\u0001J\u0011\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001J\t\u0010\u0012\u001a\u00020\rH\u0001J\u0011\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0001J\u0011\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0001J\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0001¢\u0006\u0002\u0010\u001fJ\u0011\u0010 \u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0001J\u0011\u0010!\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0001J\t\u0010\"\u001a\u00020\rH\u0001J#\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0001J\u0018\u0010)\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u001aH\u0001¢\u0006\u0002\u0010\u001bJ\u0018\u0010*\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\u0010\u001bJ\u0011\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020-H\u0001J\u0011\u0010.\u001a\u00020\r2\u0006\u0010,\u001a\u00020-H\u0001J\u0011\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u000201H\u0001J\u0011\u00102\u001a\u00020\r2\u0006\u00100\u001a\u000201H\u0001J\u0011\u00103\u001a\u00020\r2\u0006\u00104\u001a\u00020(H\u0001J\u0011\u00105\u001a\u00020\r2\u0006\u00104\u001a\u00020(H\u0001J)\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020&2\u0006\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020&2\u0006\u0010:\u001a\u00020&H\u0001J\u0018\u0010;\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u001aH\u0001¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/larksuite/component/ui/layout/plus/BaseLKUIPlus;", "Lcom/larksuite/component/ui/layout/ILKUIDelegate;", "layout", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "(Lcom/larksuite/component/ui/layout/ILKUILayout;)V", "mLayout", "getAttrs", "Landroid/util/AttributeSet;", "getContext", "Landroid/content/Context;", "getLayout", "Landroid/view/ViewGroup;", "onDelegateAttachedToWindow", "", "onDelegateComputeScroll", "onDelegateConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onDelegateDetachedFromWindow", "onDelegateDispatchDrawEnd", "canvas", "Landroid/graphics/Canvas;", "onDelegateDispatchDrawStart", "onDelegateDispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;", "onDelegateDragEvent", "event", "Landroid/view/DragEvent;", "(Landroid/view/DragEvent;)Ljava/lang/Boolean;", "onDelegateDrawEnd", "onDelegateDrawStart", "onDelegateFinishInflate", "onDelegateFocusChanged", "gainFocus", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "", "previouslyFocusedRect", "Landroid/graphics/Rect;", "onDelegateInterceptHoverEvent", "onDelegateInterceptTouchEvent", "onDelegateLayoutEnd", "onLayoutData", "Lcom/larksuite/component/ui/layout/OnLayoutData;", "onDelegateLayoutStart", "onDelegateMeasureEnd", "onMeasureData", "Lcom/larksuite/component/ui/layout/OnMeasureData;", "onDelegateMeasureStart", "onDelegateSetPaddingEnd", "paddingData", "onDelegateSetPaddingStart", "onDelegateSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "onDelegateTouchEvent", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.layout.plus.a */
public abstract class BaseLKUIPlus {
    private final /* synthetic */ DefaultLKUIDelegate $$delegate_0 = new DefaultLKUIDelegate();
    private final ILKUILayout mLayout;

    public void onDelegateAttachedToWindow() {
        this.$$delegate_0.mo89703a();
    }

    public void onDelegateComputeScroll() {
        this.$$delegate_0.mo89721d();
    }

    public void onDelegateConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        this.$$delegate_0.mo89705a(configuration);
    }

    public void onDelegateDetachedFromWindow() {
        this.$$delegate_0.mo89712b();
    }

    public void onDelegateDispatchDrawEnd(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        this.$$delegate_0.mo89722d(canvas);
    }

    public void onDelegateDispatchDrawStart(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        this.$$delegate_0.mo89719c(canvas);
    }

    public Boolean onDelegateDispatchTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        return this.$$delegate_0.mo89702a(motionEvent);
    }

    public Boolean onDelegateDragEvent(DragEvent dragEvent) {
        Intrinsics.checkParameterIsNotNull(dragEvent, "event");
        return this.$$delegate_0.mo89701a(dragEvent);
    }

    public void onDelegateDrawEnd(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        this.$$delegate_0.mo89713b(canvas);
    }

    public void onDelegateDrawStart(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        this.$$delegate_0.mo89706a(canvas);
    }

    public void onDelegateFinishInflate() {
        this.$$delegate_0.mo89718c();
    }

    public void onDelegateFocusChanged(boolean z, int i, Rect rect) {
        this.$$delegate_0.mo89710a(z, i, rect);
    }

    public Boolean onDelegateInterceptHoverEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        return this.$$delegate_0.mo89720d(motionEvent);
    }

    public Boolean onDelegateInterceptTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        return this.$$delegate_0.mo89711b(motionEvent);
    }

    public void onDelegateLayoutEnd(OnLayoutData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onLayoutData");
        this.$$delegate_0.mo89715b(bVar);
    }

    public void onDelegateLayoutStart(OnLayoutData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onLayoutData");
        this.$$delegate_0.mo89708a(bVar);
    }

    public void onDelegateMeasureEnd(OnMeasureData cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "onMeasureData");
        this.$$delegate_0.mo89716b(cVar);
    }

    public void onDelegateMeasureStart(OnMeasureData cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "onMeasureData");
        this.$$delegate_0.mo89709a(cVar);
    }

    public void onDelegateSetPaddingEnd(Rect rect) {
        Intrinsics.checkParameterIsNotNull(rect, "paddingData");
        this.$$delegate_0.mo89714b(rect);
    }

    public void onDelegateSetPaddingStart(Rect rect) {
        Intrinsics.checkParameterIsNotNull(rect, "paddingData");
        this.$$delegate_0.mo89707a(rect);
    }

    public void onDelegateSizeChanged(int i, int i2, int i3, int i4) {
        this.$$delegate_0.mo89704a(i, i2, i3, i4);
    }

    public Boolean onDelegateTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        return this.$$delegate_0.mo89717c(motionEvent);
    }

    public final AttributeSet getAttrs() {
        return this.mLayout.getAttrs();
    }

    public final Context getContext() {
        return this.mLayout.getLKUIContext();
    }

    public final ViewGroup getLayout() {
        return this.mLayout.getLayout();
    }

    public BaseLKUIPlus(ILKUILayout iLKUILayout) {
        Intrinsics.checkParameterIsNotNull(iLKUILayout, "layout");
        this.mLayout = iLKUILayout;
    }
}
