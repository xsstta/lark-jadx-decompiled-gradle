package com.larksuite.component.ui.layout;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.ui.layout.plus.BaseLKUIPlus;
import com.larksuite.component.ui.layout.plus.InnerPlusFactory;
import com.larksuite.component.ui.layout.plus.InnerPlusType;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J'\u0010\u0010\u001a\u0004\u0018\u0001H\u0011\"\b\b\u0000\u0010\u0011*\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0013H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0018H\u0016J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0016J\u0017\u0010&\u001a\u0004\u0018\u00010\u00162\u0006\u0010'\u001a\u00020(H\u0016¢\u0006\u0002\u0010)J\u0017\u0010*\u001a\u0004\u0018\u00010\u00162\u0006\u0010+\u001a\u00020,H\u0016¢\u0006\u0002\u0010-J\u0010\u0010.\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010/\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0016J\b\u00100\u001a\u00020\u0018H\u0016J\"\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0017\u00107\u001a\u0004\u0018\u00010\u00162\u0006\u0010+\u001a\u00020(H\u0016¢\u0006\u0002\u0010)J\u0017\u00108\u001a\u0004\u0018\u00010\u00162\u0006\u0010'\u001a\u00020(H\u0016¢\u0006\u0002\u0010)J\u0010\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u00020\u00182\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010=\u001a\u00020\u00182\u0006\u0010>\u001a\u00020?H\u0016J\u0010\u0010@\u001a\u00020\u00182\u0006\u0010>\u001a\u00020?H\u0016J\u0010\u0010A\u001a\u00020\u00182\u0006\u0010B\u001a\u000206H\u0016J\u0010\u0010C\u001a\u00020\u00182\u0006\u0010B\u001a\u000206H\u0016J(\u0010D\u001a\u00020\u00182\u0006\u0010E\u001a\u0002042\u0006\u0010F\u001a\u0002042\u0006\u0010G\u001a\u0002042\u0006\u0010H\u001a\u000204H\u0016J\u0017\u0010I\u001a\u0004\u0018\u00010\u00162\u0006\u0010+\u001a\u00020(H\u0016¢\u0006\u0002\u0010)J\u0010\u0010J\u001a\u00020\u00182\u0006\u0010K\u001a\u00020LH\u0002J%\u0010M\u001a\u0002H\u0011\"\b\b\u0000\u0010\u0011*\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0013H\u0016¢\u0006\u0002\u0010\u0014J \u0010N\u001a\u00020\u0018\"\b\b\u0000\u0010\u0011*\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0013H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0004¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/larksuite/component/ui/layout/LKUILayoutDispatcher;", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "()V", "mAttrs", "Landroid/util/AttributeSet;", "mContext", "Landroid/content/Context;", "mLayout", "Landroid/view/ViewGroup;", "mPlusList", "Ljava/util/ArrayList;", "Lcom/larksuite/component/ui/layout/plus/BaseLKUIPlus;", "Lkotlin/collections/ArrayList;", "getAttrs", "getLKUIContext", "getLayout", "getPlus", "T", "plusClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/larksuite/component/ui/layout/plus/BaseLKUIPlus;", "hasPlus", "", "onConstructor", "", "layout", "context", "attrs", "onDelegateAttachedToWindow", "onDelegateComputeScroll", "onDelegateConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onDelegateDetachedFromWindow", "onDelegateDispatchDrawEnd", "canvas", "Landroid/graphics/Canvas;", "onDelegateDispatchDrawStart", "onDelegateDispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;", "onDelegateDragEvent", "event", "Landroid/view/DragEvent;", "(Landroid/view/DragEvent;)Ljava/lang/Boolean;", "onDelegateDrawEnd", "onDelegateDrawStart", "onDelegateFinishInflate", "onDelegateFocusChanged", "gainFocus", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "", "previouslyFocusedRect", "Landroid/graphics/Rect;", "onDelegateInterceptHoverEvent", "onDelegateInterceptTouchEvent", "onDelegateLayoutEnd", "onLayoutData", "Lcom/larksuite/component/ui/layout/OnLayoutData;", "onDelegateLayoutStart", "onDelegateMeasureEnd", "onMeasureData", "Lcom/larksuite/component/ui/layout/OnMeasureData;", "onDelegateMeasureStart", "onDelegateSetPaddingEnd", "paddingData", "onDelegateSetPaddingStart", "onDelegateSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "onDelegateTouchEvent", "parseInnerPluses", "array", "Landroid/content/res/TypedArray;", "registerPlus", "unRegisterPlus", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LKUILayoutDispatcher implements ILKUILayout {
    private AttributeSet mAttrs;
    private Context mContext;
    private ViewGroup mLayout;
    private final ArrayList<BaseLKUIPlus> mPlusList = new ArrayList<>();

    @Override // com.larksuite.component.ui.layout.ILKUILayout
    public AttributeSet getAttrs() {
        return this.mAttrs;
    }

    @Override // com.larksuite.component.ui.layout.ILKUILayout
    public Context getLKUIContext() {
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return context;
    }

    @Override // com.larksuite.component.ui.layout.ILKUILayout
    public ViewGroup getLayout() {
        ViewGroup viewGroup = this.mLayout;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayout");
        }
        return viewGroup;
    }

    @Override // com.larksuite.component.ui.layout.ILKUILayout
    public boolean hasPlus() {
        if (this.mPlusList.size() > 0) {
            return true;
        }
        return false;
    }

    public void onDelegateAttachedToWindow() {
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            it.next().onDelegateAttachedToWindow();
        }
    }

    public void onDelegateComputeScroll() {
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            it.next().onDelegateComputeScroll();
        }
    }

    public void onDelegateDetachedFromWindow() {
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            it.next().onDelegateDetachedFromWindow();
        }
    }

    public void onDelegateFinishInflate() {
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            it.next().onDelegateFinishInflate();
        }
    }

    private final void parseInnerPluses(TypedArray typedArray) {
        this.mPlusList.addAll(InnerPlusFactory.f62727a.mo89810a(typedArray.getInt(0, InnerPlusType.UNKNOWN.getValue()), this));
    }

    public void onDelegateConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            it.next().onDelegateConfigurationChanged(configuration);
        }
    }

    public void onDelegateDispatchDrawEnd(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            it.next().onDelegateDispatchDrawEnd(canvas);
        }
    }

    public void onDelegateDispatchDrawStart(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            it.next().onDelegateDispatchDrawStart(canvas);
        }
    }

    public Boolean onDelegateDispatchTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            Boolean onDelegateDispatchTouchEvent = it.next().onDelegateDispatchTouchEvent(motionEvent);
            if (onDelegateDispatchTouchEvent != null) {
                return onDelegateDispatchTouchEvent;
            }
        }
        return null;
    }

    public Boolean onDelegateDragEvent(DragEvent dragEvent) {
        Intrinsics.checkParameterIsNotNull(dragEvent, "event");
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            Boolean onDelegateDragEvent = it.next().onDelegateDragEvent(dragEvent);
            if (onDelegateDragEvent != null) {
                return onDelegateDragEvent;
            }
        }
        return null;
    }

    public void onDelegateDrawEnd(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            it.next().onDelegateDrawEnd(canvas);
        }
    }

    public void onDelegateDrawStart(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            it.next().onDelegateDrawStart(canvas);
        }
    }

    public Boolean onDelegateInterceptHoverEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            Boolean onDelegateInterceptHoverEvent = it.next().onDelegateInterceptHoverEvent(motionEvent);
            if (onDelegateInterceptHoverEvent != null) {
                return onDelegateInterceptHoverEvent;
            }
        }
        return null;
    }

    public Boolean onDelegateInterceptTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            Boolean onDelegateInterceptTouchEvent = it.next().onDelegateInterceptTouchEvent(motionEvent);
            if (onDelegateInterceptTouchEvent != null) {
                return onDelegateInterceptTouchEvent;
            }
        }
        return null;
    }

    public void onDelegateLayoutEnd(OnLayoutData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onLayoutData");
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            it.next().onDelegateLayoutEnd(bVar);
        }
    }

    public void onDelegateLayoutStart(OnLayoutData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onLayoutData");
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            it.next().onDelegateLayoutStart(bVar);
        }
    }

    public void onDelegateMeasureEnd(OnMeasureData cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "onMeasureData");
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            it.next().onDelegateMeasureEnd(cVar);
        }
    }

    public void onDelegateMeasureStart(OnMeasureData cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "onMeasureData");
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            it.next().onDelegateMeasureStart(cVar);
        }
    }

    public void onDelegateSetPaddingEnd(Rect rect) {
        Intrinsics.checkParameterIsNotNull(rect, "paddingData");
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            it.next().onDelegateSetPaddingEnd(rect);
        }
    }

    public void onDelegateSetPaddingStart(Rect rect) {
        Intrinsics.checkParameterIsNotNull(rect, "paddingData");
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            it.next().onDelegateSetPaddingStart(rect);
        }
    }

    public Boolean onDelegateTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            Boolean onDelegateTouchEvent = it.next().onDelegateTouchEvent(motionEvent);
            if (onDelegateTouchEvent != null) {
                return onDelegateTouchEvent;
            }
        }
        return null;
    }

    @Override // com.larksuite.component.ui.layout.ILKUILayout
    public <T extends BaseLKUIPlus> T getPlus(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "plusClass");
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (Intrinsics.areEqual(t.getClass(), cls)) {
                if (t != null) {
                    return t;
                }
                throw new TypeCastException("null cannot be cast to non-null type T");
            }
        }
        return null;
    }

    @Override // com.larksuite.component.ui.layout.ILKUILayout
    public <T extends BaseLKUIPlus> T registerPlus(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "plusClass");
        T t = (T) getPlus(cls);
        if (t == null) {
            t = cls.getDeclaredConstructor(ILKUILayout.class).newInstance(this);
            this.mPlusList.add(t);
        }
        if (t == null) {
            Intrinsics.throwNpe();
        }
        return t;
    }

    @Override // com.larksuite.component.ui.layout.ILKUILayout
    public <T extends BaseLKUIPlus> void unRegisterPlus(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "plusClass");
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        Intrinsics.checkExpressionValueIsNotNull(it, "mPlusList.iterator()");
        while (it.hasNext()) {
            BaseLKUIPlus next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "iterator.next()");
            if (Intrinsics.areEqual(next.getClass(), cls)) {
                it.remove();
            }
        }
    }

    public void onDelegateFocusChanged(boolean z, int i, Rect rect) {
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            it.next().onDelegateFocusChanged(z, i, rect);
        }
    }

    @Override // com.larksuite.component.ui.layout.ILKUILayout
    public void onConstructor(ViewGroup viewGroup, Context context, AttributeSet attributeSet) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "layout");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.mLayout = viewGroup;
        this.mContext = context;
        this.mAttrs = attributeSet;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.pluses}, 0, 0);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "mContext.obtainStyledAtt…leable.LKUI_Layout, 0, 0)");
        parseInnerPluses(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public void onDelegateSizeChanged(int i, int i2, int i3, int i4) {
        Iterator<BaseLKUIPlus> it = this.mPlusList.iterator();
        while (it.hasNext()) {
            it.next().onDelegateSizeChanged(i, i2, i3, i4);
        }
    }
}
