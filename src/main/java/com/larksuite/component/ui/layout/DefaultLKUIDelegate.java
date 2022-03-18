package com.larksuite.component.ui.layout;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.DragEvent;
import android.view.MotionEvent;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 32\u00020\u0001:\u00013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\"\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0017\u0010 \u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u0012J\u0017\u0010!\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u0012J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u001fH\u0016J\u0010\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u001fH\u0016J(\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dH\u0016J\u0017\u00102\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u0012¨\u00064"}, d2 = {"Lcom/larksuite/component/ui/layout/DefaultLKUIDelegate;", "Lcom/larksuite/component/ui/layout/ILKUIDelegate;", "()V", "onDelegateAttachedToWindow", "", "onDelegateComputeScroll", "onDelegateConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onDelegateDetachedFromWindow", "onDelegateDispatchDrawEnd", "canvas", "Landroid/graphics/Canvas;", "onDelegateDispatchDrawStart", "onDelegateDispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;", "onDelegateDragEvent", "event", "Landroid/view/DragEvent;", "(Landroid/view/DragEvent;)Ljava/lang/Boolean;", "onDelegateDrawEnd", "onDelegateDrawStart", "onDelegateFinishInflate", "onDelegateFocusChanged", "gainFocus", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "", "previouslyFocusedRect", "Landroid/graphics/Rect;", "onDelegateInterceptHoverEvent", "onDelegateInterceptTouchEvent", "onDelegateLayoutEnd", "onLayoutData", "Lcom/larksuite/component/ui/layout/OnLayoutData;", "onDelegateLayoutStart", "onDelegateMeasureEnd", "onMeasureData", "Lcom/larksuite/component/ui/layout/OnMeasureData;", "onDelegateMeasureStart", "onDelegateSetPaddingEnd", "paddingData", "onDelegateSetPaddingStart", "onDelegateSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "onDelegateTouchEvent", "Companion", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.layout.a */
public final class DefaultLKUIDelegate {

    /* renamed from: a */
    public static final Companion f62717a = new Companion(null);

    /* renamed from: b */
    private static String f62718b = DefaultLKUIDelegate.class.getSimpleName();

    /* renamed from: a */
    public Boolean mo89701a(DragEvent dragEvent) {
        Intrinsics.checkParameterIsNotNull(dragEvent, "event");
        return null;
    }

    /* renamed from: a */
    public Boolean mo89702a(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        return null;
    }

    /* renamed from: a */
    public void mo89703a() {
    }

    /* renamed from: a */
    public void mo89704a(int i, int i2, int i3, int i4) {
    }

    /* renamed from: a */
    public void mo89705a(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
    }

    /* renamed from: a */
    public void mo89706a(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
    }

    /* renamed from: a */
    public void mo89707a(Rect rect) {
        Intrinsics.checkParameterIsNotNull(rect, "paddingData");
    }

    /* renamed from: a */
    public void mo89708a(OnLayoutData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onLayoutData");
    }

    /* renamed from: a */
    public void mo89709a(OnMeasureData cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "onMeasureData");
    }

    /* renamed from: a */
    public void mo89710a(boolean z, int i, Rect rect) {
    }

    /* renamed from: b */
    public Boolean mo89711b(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        return null;
    }

    /* renamed from: b */
    public void mo89712b() {
    }

    /* renamed from: b */
    public void mo89713b(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
    }

    /* renamed from: b */
    public void mo89714b(Rect rect) {
        Intrinsics.checkParameterIsNotNull(rect, "paddingData");
    }

    /* renamed from: b */
    public void mo89715b(OnLayoutData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onLayoutData");
    }

    /* renamed from: b */
    public void mo89716b(OnMeasureData cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "onMeasureData");
    }

    /* renamed from: c */
    public Boolean mo89717c(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        return null;
    }

    /* renamed from: c */
    public void mo89718c() {
    }

    /* renamed from: c */
    public void mo89719c(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
    }

    /* renamed from: d */
    public Boolean mo89720d(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        return null;
    }

    /* renamed from: d */
    public void mo89721d() {
    }

    /* renamed from: d */
    public void mo89722d(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/ui/layout/DefaultLKUIDelegate$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.layout.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
