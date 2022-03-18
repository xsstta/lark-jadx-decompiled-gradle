package com.larksuite.component.ui.layout;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.ui.layout.plus.BaseLKUIPlus;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b0\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0001J\t\u0010\u001c\u001a\u00020\u0004H\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u0001J(\u0010\u001f\u001a\u0004\u0018\u0001H \"\b\b\u0000\u0010 *\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H 0#H\u0001¢\u0006\u0002\u0010$J\t\u0010%\u001a\u00020\u0018H\u0001J\b\u0010&\u001a\u00020\u0013H\u0014J\u0010\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020)H\u0014J#\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0001J\t\u0010,\u001a\u00020\u0013H\u0001J\t\u0010-\u001a\u00020\u0013H\u0001J\u0011\u0010.\u001a\u00020\u00132\u0006\u0010(\u001a\u00020)H\u0001J\t\u0010/\u001a\u00020\u0013H\u0001J\u0011\u00100\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0001J\u0011\u00101\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0001J\u0018\u00102\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\u00103J\u0018\u00104\u001a\u0004\u0018\u00010\u00182\u0006\u00105\u001a\u000206H\u0001¢\u0006\u0002\u00107J\u0011\u00108\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0001J\u0011\u00109\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0001J\t\u0010:\u001a\u00020\u0013H\u0001J#\u0010;\u001a\u00020\u00132\u0006\u0010<\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\n2\b\u0010>\u001a\u0004\u0018\u00010\u0011H\u0001J\u0018\u0010?\u001a\u0004\u0018\u00010\u00182\u0006\u00105\u001a\u00020\u001aH\u0001¢\u0006\u0002\u00103J\u0018\u0010@\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\u00103J\u0011\u0010A\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rH\u0001J\u0011\u0010B\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rH\u0001J\u0011\u0010C\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0001J\u0011\u0010D\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0001J\u0011\u0010E\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0001J\u0011\u0010F\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0001J)\u0010G\u001a\u00020\u00132\u0006\u0010H\u001a\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010J\u001a\u00020\n2\u0006\u0010K\u001a\u00020\nH\u0001J\u0018\u0010L\u001a\u0004\u0018\u00010\u00182\u0006\u00105\u001a\u00020\u001aH\u0001¢\u0006\u0002\u00103J\b\u0010M\u001a\u00020\u0013H\u0014J\u0010\u0010N\u001a\u00020\u00182\u0006\u00105\u001a\u000206H\u0016J\u0010\u0010O\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010P\u001a\u00020\u0013H\u0014J\"\u0010Q\u001a\u00020\u00132\u0006\u0010<\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\n2\b\u0010>\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010R\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u001aH\u0016J\u0010\u0010S\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J0\u0010T\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\u00182\u0006\u0010V\u001a\u00020\n2\u0006\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\nH\u0014J\u0018\u0010Z\u001a\u00020\u00132\u0006\u0010[\u001a\u00020\n2\u0006\u0010\\\u001a\u00020\nH\u0014J(\u0010]\u001a\u00020\u00132\u0006\u0010H\u001a\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010J\u001a\u00020\n2\u0006\u0010K\u001a\u00020\nH\u0014J\u0010\u0010^\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u001aH\u0016J&\u0010_\u001a\u0002H \"\b\b\u0000\u0010 *\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H 0#H\u0001¢\u0006\u0002\u0010$J(\u0010`\u001a\u00020\u00132\u0006\u0010a\u001a\u00020\n2\u0006\u0010b\u001a\u00020\n2\u0006\u0010c\u001a\u00020\n2\u0006\u0010d\u001a\u00020\nH\u0016J!\u0010e\u001a\u00020\u0013\"\b\b\u0000\u0010 *\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H 0#H\u0001R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006f"}, d2 = {"Lcom/larksuite/component/ui/layout/LKUIConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onLayoutData", "Lcom/larksuite/component/ui/layout/OnLayoutData;", "onMeasureData", "Lcom/larksuite/component/ui/layout/OnMeasureData;", "paddingData", "Landroid/graphics/Rect;", "computeScroll", "", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "getAttrs", "getLKUIContext", "getLayout", "Landroid/view/ViewGroup;", "getPlus", "T", "Lcom/larksuite/component/ui/layout/plus/BaseLKUIPlus;", "plusClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/larksuite/component/ui/layout/plus/BaseLKUIPlus;", "hasPlus", "onAttachedToWindow", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onConstructor", "layout", "onDelegateAttachedToWindow", "onDelegateComputeScroll", "onDelegateConfigurationChanged", "onDelegateDetachedFromWindow", "onDelegateDispatchDrawEnd", "onDelegateDispatchDrawStart", "onDelegateDispatchTouchEvent", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;", "onDelegateDragEvent", "event", "Landroid/view/DragEvent;", "(Landroid/view/DragEvent;)Ljava/lang/Boolean;", "onDelegateDrawEnd", "onDelegateDrawStart", "onDelegateFinishInflate", "onDelegateFocusChanged", "gainFocus", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "previouslyFocusedRect", "onDelegateInterceptHoverEvent", "onDelegateInterceptTouchEvent", "onDelegateLayoutEnd", "onDelegateLayoutStart", "onDelegateMeasureEnd", "onDelegateMeasureStart", "onDelegateSetPaddingEnd", "onDelegateSetPaddingStart", "onDelegateSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "onDelegateTouchEvent", "onDetachedFromWindow", "onDragEvent", "onDraw", "onFinishInflate", "onFocusChanged", "onInterceptHoverEvent", "onInterceptTouchEvent", "onLayout", "changed", "l", "t", "r", C63954b.f161494a, "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "onTouchEvent", "registerPlus", "setPadding", "left", "top", "right", "bottom", "unRegisterPlus", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LKUIConstraintLayout extends ConstraintLayout implements ILKUILayout {
    private final /* synthetic */ LKUILayoutDispatcher $$delegate_0;
    private HashMap _$_findViewCache;
    private final OnLayoutData onLayoutData;
    private final OnMeasureData onMeasureData;
    private final Rect paddingData;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.larksuite.component.ui.layout.ILKUILayout
    public AttributeSet getAttrs() {
        return this.$$delegate_0.getAttrs();
    }

    @Override // com.larksuite.component.ui.layout.ILKUILayout
    public Context getLKUIContext() {
        return this.$$delegate_0.getLKUIContext();
    }

    @Override // com.larksuite.component.ui.layout.ILKUILayout
    public ViewGroup getLayout() {
        return this.$$delegate_0.getLayout();
    }

    @Override // com.larksuite.component.ui.layout.ILKUILayout
    public <T extends BaseLKUIPlus> T getPlus(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "plusClass");
        return (T) this.$$delegate_0.getPlus(cls);
    }

    @Override // com.larksuite.component.ui.layout.ILKUILayout
    public boolean hasPlus() {
        return this.$$delegate_0.hasPlus();
    }

    @Override // com.larksuite.component.ui.layout.ILKUILayout
    public void onConstructor(ViewGroup viewGroup, Context context, AttributeSet attributeSet) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "layout");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.$$delegate_0.onConstructor(viewGroup, context, attributeSet);
    }

    public void onDelegateAttachedToWindow() {
        this.$$delegate_0.onDelegateAttachedToWindow();
    }

    public void onDelegateComputeScroll() {
        this.$$delegate_0.onDelegateComputeScroll();
    }

    public void onDelegateConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        this.$$delegate_0.onDelegateConfigurationChanged(configuration);
    }

    public void onDelegateDetachedFromWindow() {
        this.$$delegate_0.onDelegateDetachedFromWindow();
    }

    public void onDelegateDispatchDrawEnd(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        this.$$delegate_0.onDelegateDispatchDrawEnd(canvas);
    }

    public void onDelegateDispatchDrawStart(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        this.$$delegate_0.onDelegateDispatchDrawStart(canvas);
    }

    public Boolean onDelegateDispatchTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        return this.$$delegate_0.onDelegateDispatchTouchEvent(motionEvent);
    }

    public Boolean onDelegateDragEvent(DragEvent dragEvent) {
        Intrinsics.checkParameterIsNotNull(dragEvent, "event");
        return this.$$delegate_0.onDelegateDragEvent(dragEvent);
    }

    public void onDelegateDrawEnd(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        this.$$delegate_0.onDelegateDrawEnd(canvas);
    }

    public void onDelegateDrawStart(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        this.$$delegate_0.onDelegateDrawStart(canvas);
    }

    public void onDelegateFinishInflate() {
        this.$$delegate_0.onDelegateFinishInflate();
    }

    public void onDelegateFocusChanged(boolean z, int i, Rect rect) {
        this.$$delegate_0.onDelegateFocusChanged(z, i, rect);
    }

    public Boolean onDelegateInterceptHoverEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        return this.$$delegate_0.onDelegateInterceptHoverEvent(motionEvent);
    }

    public Boolean onDelegateInterceptTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        return this.$$delegate_0.onDelegateInterceptTouchEvent(motionEvent);
    }

    public void onDelegateLayoutEnd(OnLayoutData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onLayoutData");
        this.$$delegate_0.onDelegateLayoutEnd(bVar);
    }

    public void onDelegateLayoutStart(OnLayoutData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onLayoutData");
        this.$$delegate_0.onDelegateLayoutStart(bVar);
    }

    public void onDelegateMeasureEnd(OnMeasureData cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "onMeasureData");
        this.$$delegate_0.onDelegateMeasureEnd(cVar);
    }

    public void onDelegateMeasureStart(OnMeasureData cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "onMeasureData");
        this.$$delegate_0.onDelegateMeasureStart(cVar);
    }

    public void onDelegateSetPaddingEnd(Rect rect) {
        Intrinsics.checkParameterIsNotNull(rect, "paddingData");
        this.$$delegate_0.onDelegateSetPaddingEnd(rect);
    }

    public void onDelegateSetPaddingStart(Rect rect) {
        Intrinsics.checkParameterIsNotNull(rect, "paddingData");
        this.$$delegate_0.onDelegateSetPaddingStart(rect);
    }

    public void onDelegateSizeChanged(int i, int i2, int i3, int i4) {
        this.$$delegate_0.onDelegateSizeChanged(i, i2, i3, i4);
    }

    public Boolean onDelegateTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        return this.$$delegate_0.onDelegateTouchEvent(motionEvent);
    }

    @Override // com.larksuite.component.ui.layout.ILKUILayout
    public <T extends BaseLKUIPlus> T registerPlus(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "plusClass");
        return (T) this.$$delegate_0.registerPlus(cls);
    }

    @Override // com.larksuite.component.ui.layout.ILKUILayout
    public <T extends BaseLKUIPlus> void unRegisterPlus(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "plusClass");
        this.$$delegate_0.unRegisterPlus(cls);
    }

    public void computeScroll() {
        if (!hasPlus()) {
            super.computeScroll();
            return;
        }
        super.computeScroll();
        onDelegateComputeScroll();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        if (!hasPlus()) {
            super.onAttachedToWindow();
            return;
        }
        super.onAttachedToWindow();
        onDelegateAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (!hasPlus()) {
            super.onDetachedFromWindow();
            return;
        }
        super.onDetachedFromWindow();
        onDelegateDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        if (!hasPlus()) {
            super.onFinishInflate();
            return;
        }
        super.onFinishInflate();
        onDelegateFinishInflate();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LKUIConstraintLayout(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (!hasPlus()) {
            super.dispatchDraw(canvas);
            return;
        }
        onDelegateDispatchDrawStart(canvas);
        super.dispatchDraw(canvas);
        onDelegateDispatchDrawEnd(canvas);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        if (!hasPlus()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        Boolean onDelegateDispatchTouchEvent = onDelegateDispatchTouchEvent(motionEvent);
        if (onDelegateDispatchTouchEvent != null) {
            return onDelegateDispatchTouchEvent.booleanValue();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        if (!hasPlus()) {
            super.onConfigurationChanged(configuration);
            return;
        }
        super.onConfigurationChanged(configuration);
        onDelegateConfigurationChanged(configuration);
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        Intrinsics.checkParameterIsNotNull(dragEvent, "event");
        if (!hasPlus()) {
            return super.onDragEvent(dragEvent);
        }
        Boolean onDelegateDragEvent = onDelegateDragEvent(dragEvent);
        if (onDelegateDragEvent != null) {
            return onDelegateDragEvent.booleanValue();
        }
        return super.onDragEvent(dragEvent);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (!hasPlus()) {
            super.onDraw(canvas);
            return;
        }
        onDelegateDrawStart(canvas);
        super.onDraw(canvas);
        onDelegateDrawEnd(canvas);
    }

    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        if (!hasPlus()) {
            return super.onInterceptHoverEvent(motionEvent);
        }
        Boolean onDelegateInterceptHoverEvent = onDelegateInterceptHoverEvent(motionEvent);
        if (onDelegateInterceptHoverEvent != null) {
            return onDelegateInterceptHoverEvent.booleanValue();
        }
        return super.onInterceptHoverEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        if (!hasPlus()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        Boolean onDelegateInterceptTouchEvent = onDelegateInterceptTouchEvent(motionEvent);
        if (onDelegateInterceptTouchEvent != null) {
            return onDelegateInterceptTouchEvent.booleanValue();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        if (!hasPlus()) {
            return super.onTouchEvent(motionEvent);
        }
        Boolean onDelegateTouchEvent = onDelegateTouchEvent(motionEvent);
        if (onDelegateTouchEvent != null) {
            return onDelegateTouchEvent.booleanValue();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LKUIConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void onMeasure(int i, int i2) {
        if (!hasPlus()) {
            super.onMeasure(i, i2);
            return;
        }
        this.onMeasureData.mo89737a(i);
        this.onMeasureData.mo89739b(i2);
        onDelegateMeasureStart(this.onMeasureData);
        super.onMeasure(this.onMeasureData.mo89736a(), this.onMeasureData.mo89738b());
        onDelegateMeasureEnd(this.onMeasureData);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (!hasPlus()) {
            super.onFocusChanged(z, i, rect);
            return;
        }
        super.onFocusChanged(z, i, rect);
        onDelegateFocusChanged(z, i, rect);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LKUIConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.$$delegate_0 = new LKUILayoutDispatcher();
        this.onMeasureData = new OnMeasureData(0, 0);
        this.onLayoutData = new OnLayoutData(false, 0, 0, 0, 0);
        this.paddingData = new Rect(0, 0, 0, 0);
        onConstructor(this, context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!hasPlus()) {
            super.onSizeChanged(i, i2, i3, i4);
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        onDelegateSizeChanged(i, i2, i3, i4);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        if (!hasPlus()) {
            super.setPadding(i, i2, i3, i4);
            return;
        }
        this.paddingData.left = i;
        this.paddingData.top = i2;
        this.paddingData.right = i3;
        this.paddingData.bottom = i4;
        onDelegateSetPaddingStart(this.paddingData);
        super.setPadding(this.paddingData.left, this.paddingData.top, this.paddingData.right, this.paddingData.bottom);
        onDelegateSetPaddingEnd(this.paddingData);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LKUIConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!hasPlus()) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        this.onLayoutData.mo89724a(z);
        this.onLayoutData.mo89723a(i);
        this.onLayoutData.mo89727b(i2);
        this.onLayoutData.mo89729c(i3);
        this.onLayoutData.mo89731d(i4);
        onDelegateLayoutStart(this.onLayoutData);
        super.onLayout(this.onLayoutData.mo89725a(), this.onLayoutData.mo89726b(), this.onLayoutData.mo89728c(), this.onLayoutData.mo89730d(), this.onLayoutData.mo89732e());
        onDelegateLayoutEnd(this.onLayoutData);
    }
}
