package com.ss.android.lark.floating.widget.appfloat;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.ss.android.lark.floating.data.FloatConfig;
import com.ss.android.lark.floating.interfaces.FloatCallbacks;
import com.ss.android.lark.floating.interfaces.OnFloatCallbacks;
import com.ss.android.lark.floating.interfaces.OnFloatTouchListener;
import com.ss.android.lark.floating.utils.InputMethodUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001*B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u0019\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u001dH\u0014J\u0012\u0010!\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\"H\u0016J0\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0014J\u0012\u0010)\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\"H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006+"}, d2 = {"Lcom/ss/android/lark/floating/widget/appfloat/ParentFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "config", "Lcom/ss/android/lark/floating/data/FloatConfig;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Lcom/ss/android/lark/floating/data/FloatConfig;Landroid/util/AttributeSet;I)V", "isCreated", "", "layoutListener", "Lcom/ss/android/lark/floating/widget/appfloat/ParentFrameLayout$OnLayoutListener;", "getLayoutListener", "()Lcom/ss/android/lark/floating/widget/appfloat/ParentFrameLayout$OnLayoutListener;", "setLayoutListener", "(Lcom/ss/android/lark/floating/widget/appfloat/ParentFrameLayout$OnLayoutListener;)V", "touchListener", "Lcom/ss/android/lark/floating/interfaces/OnFloatTouchListener;", "getTouchListener", "()Lcom/ss/android/lark/floating/interfaces/OnFloatTouchListener;", "setTouchListener", "(Lcom/ss/android/lark/floating/interfaces/OnFloatTouchListener;)V", "dispatchKeyEventPreIme", "event", "Landroid/view/KeyEvent;", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "onDetachedFromWindow", "onInterceptTouchEvent", "Landroid/view/MotionEvent;", "onLayout", "changed", "left", "top", "right", "bottom", "onTouchEvent", "OnLayoutListener", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.widget.appfloat.d */
public final class ParentFrameLayout extends FrameLayout {

    /* renamed from: a */
    private OnFloatTouchListener f98559a;

    /* renamed from: b */
    private OnLayoutListener f98560b;

    /* renamed from: c */
    private boolean f98561c;

    /* renamed from: d */
    private final FloatConfig f98562d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/floating/widget/appfloat/ParentFrameLayout$OnLayoutListener;", "", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "onLayout", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.widget.appfloat.d$a */
    public interface OnLayoutListener {
        /* renamed from: a */
        void mo140316a();

        /* renamed from: a */
        void mo140317a(Configuration configuration);
    }

    public final OnLayoutListener getLayoutListener() {
        return this.f98560b;
    }

    public final OnFloatTouchListener getTouchListener() {
        return this.f98559a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        FloatCallbacks.Builder a;
        Function0<Unit> d;
        super.onDetachedFromWindow();
        OnFloatCallbacks x = this.f98562d.mo140219x();
        if (x != null) {
            x.mo140241a();
        }
        FloatCallbacks y = this.f98562d.mo140220y();
        if (y != null && (a = y.mo140225a()) != null && (d = a.mo140236d()) != null) {
            d.invoke();
        }
    }

    public final void setLayoutListener(OnLayoutListener aVar) {
        this.f98560b = aVar;
    }

    public final void setTouchListener(OnFloatTouchListener fVar) {
        this.f98559a = fVar;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        OnLayoutListener aVar = this.f98560b;
        if (aVar != null) {
            aVar.mo140317a(configuration);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        OnFloatTouchListener fVar;
        if (!(motionEvent == null || (fVar = this.f98559a) == null)) {
            fVar.mo140248a(motionEvent);
        }
        if (this.f98562d.mo140197f() || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        OnFloatTouchListener fVar;
        if (!(motionEvent == null || (fVar = this.f98559a) == null)) {
            fVar.mo140248a(motionEvent);
        }
        if (this.f98562d.mo140197f() || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (this.f98562d.mo140201h() && keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 4) {
            InputMethodUtils.m150969a(FloatManager.f98554a.mo140334d(this.f98562d.mo140191d()));
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParentFrameLayout(Context context, FloatConfig aVar, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "config");
        this.f98562d = aVar;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f98561c) {
            this.f98561c = true;
            OnLayoutListener aVar = this.f98560b;
            if (aVar != null) {
                aVar.mo140316a();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ParentFrameLayout(Context context, FloatConfig aVar, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, aVar, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }
}
