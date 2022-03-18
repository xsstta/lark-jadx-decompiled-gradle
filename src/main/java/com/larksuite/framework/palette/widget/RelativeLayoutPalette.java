package com.larksuite.framework.palette.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.palette.colour.BaseColour;
import com.larksuite.framework.palette.delegate.DefaultPalette;
import com.larksuite.framework.palette.param.ComputeScrollParam;
import com.larksuite.framework.palette.param.DispatchDrawParam;
import com.larksuite.framework.palette.param.OnAnimationEndParam;
import com.larksuite.framework.palette.param.OnAnimationStartParam;
import com.larksuite.framework.palette.param.OnAttachedToWindowParam;
import com.larksuite.framework.palette.param.OnConfigurationChangedParam;
import com.larksuite.framework.palette.param.OnDetachedFromWindowParam;
import com.larksuite.framework.palette.param.OnDrawParam;
import com.larksuite.framework.palette.param.OnFinishInflateParam;
import com.larksuite.framework.palette.param.OnFocusChangedParam;
import com.larksuite.framework.palette.param.OnLayoutParam;
import com.larksuite.framework.palette.param.OnMeasureParam;
import com.larksuite.framework.palette.param.OnNestedScrollParam;
import com.larksuite.framework.palette.param.OnScrollChangedParam;
import com.larksuite.framework.palette.param.OnSizeChangedParam;
import com.larksuite.framework.palette.param.ScrollByParam;
import com.larksuite.framework.palette.param.ScrollToParam;
import com.larksuite.framework.palette.param.SetGravityParam;
import com.larksuite.framework.palette.param.SetHorizontalGravityParam;
import com.larksuite.framework.palette.param.SetPaddingParam;
import com.larksuite.framework.palette.param.SetVerticalGravityParam;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0011\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0015H\u0001J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J.\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0014\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00170\u001bH\u0001¢\u0006\u0002\u0010\u001cJ(\u0010\u001d\u001a\u0004\u0018\u0001H\u001e\"\b\b\u0000\u0010\u001e*\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001e0!H\u0001¢\u0006\u0002\u0010\"J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0$H\u0001J\b\u0010%\u001a\u00020\u000fH\u0014J\u0011\u0010%\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020&H\u0001J\b\u0010'\u001a\u00020\u000fH\u0014J\u0011\u0010'\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020(H\u0001J\b\u0010)\u001a\u00020\u000fH\u0014J\u0011\u0010)\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020*H\u0001J\u0012\u0010+\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\u0011\u0010+\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020.H\u0001J7\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u0002012\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0001J\b\u00102\u001a\u00020\u000fH\u0014J\u0011\u00102\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u000203H\u0001J\u0012\u00104\u001a\u00020\u00172\b\u00105\u001a\u0004\u0018\u000106H\u0016J.\u00104\u001a\u00020\u00172\b\u00105\u001a\u0004\u0018\u0001062\u0014\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000106\u0012\u0004\u0012\u00020\u00170\u001bH\u0001¢\u0006\u0002\u00107J\u0012\u00108\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0011\u00108\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u000209H\u0001J\b\u0010:\u001a\u00020\u000fH\u0014J\u0011\u0010:\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020;H\u0001J\u0011\u0010<\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020=H\u0001J\"\u0010<\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\n2\b\u0010@\u001a\u0004\u0018\u00010AH\u0014J\u0012\u0010B\u001a\u00020\u00172\b\u00105\u001a\u0004\u0018\u00010\u0019H\u0016J.\u0010B\u001a\u00020\u00172\b\u00105\u001a\u0004\u0018\u00010\u00192\u0014\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00170\u001bH\u0001¢\u0006\u0002\u0010\u001cJ\u0012\u0010C\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J.\u0010C\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0014\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00170\u001bH\u0001¢\u0006\u0002\u0010\u001cJ\u0011\u0010D\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020EH\u0001J0\u0010D\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u00172\u0006\u0010G\u001a\u00020\n2\u0006\u0010H\u001a\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010J\u001a\u00020\nH\u0014J\u0011\u0010K\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020LH\u0001J\u0018\u0010K\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020\nH\u0014J2\u0010O\u001a\u00020\u000f2\b\u0010P\u001a\u0004\u0018\u0001012\u0006\u0010Q\u001a\u00020\n2\u0006\u0010R\u001a\u00020\n2\u0006\u0010S\u001a\u00020\n2\u0006\u0010T\u001a\u00020\nH\u0016J\u0011\u0010O\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020UH\u0001J\u0011\u0010V\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020WH\u0001J(\u0010V\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\n2\u0006\u0010H\u001a\u00020\n2\u0006\u0010X\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\nH\u0014J\u0011\u0010Z\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020[H\u0001J(\u0010Z\u001a\u00020\u000f2\u0006\u0010\\\u001a\u00020\n2\u0006\u0010]\u001a\u00020\n2\u0006\u0010^\u001a\u00020\n2\u0006\u0010_\u001a\u00020\nH\u0014J$\u0010`\u001a\u00020\u00172\b\u0010a\u001a\u0004\u0018\u0001012\b\u0010P\u001a\u0004\u0018\u0001012\u0006\u0010b\u001a\u00020\nH\u0016JN\u0010`\u001a\u00020\u00172\b\u0010a\u001a\u0004\u0018\u0001012\b\u0010P\u001a\u0004\u0018\u0001012\u0006\u0010b\u001a\u00020\n2\"\u0010\u001a\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170cH\u0001¢\u0006\u0002\u0010dJ\u0012\u0010e\u001a\u00020\u00172\b\u00105\u001a\u0004\u0018\u00010\u0019H\u0017J.\u0010e\u001a\u00020\u00172\b\u00105\u001a\u0004\u0018\u00010\u00192\u0014\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00170\u001bH\u0001¢\u0006\u0002\u0010\u001cJ&\u0010f\u001a\u0002H\u001e\"\b\b\u0000\u0010\u001e*\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001e0!H\u0001¢\u0006\u0002\u0010\"J\u0011\u0010g\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020hH\u0001J\u0018\u0010g\u001a\u00020\u000f2\u0006\u0010i\u001a\u00020\n2\u0006\u0010j\u001a\u00020\nH\u0016J\u0011\u0010k\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020lH\u0001J\u0018\u0010k\u001a\u00020\u000f2\u0006\u0010i\u001a\u00020\n2\u0006\u0010j\u001a\u00020\nH\u0016J\u0011\u0010m\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020nH\u0001J\u0011\u0010o\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020pH\u0001J\u0011\u0010q\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020rH\u0001J(\u0010q\u001a\u00020\u000f2\u0006\u0010s\u001a\u00020\n2\u0006\u0010t\u001a\u00020\n2\u0006\u0010u\u001a\u00020\n2\u0006\u0010v\u001a\u00020\nH\u0016J\u0011\u0010w\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020xH\u0001J!\u0010y\u001a\u00020\u000f\"\b\b\u0000\u0010\u001e*\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001e0!H\u0001¨\u0006z"}, d2 = {"Lcom/larksuite/framework/palette/widget/RelativeLayoutPalette;", "Landroid/widget/RelativeLayout;", "Lcom/larksuite/framework/palette/delegate/IPalette;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "computeScroll", "", "param", "Lcom/larksuite/framework/palette/param/ComputeScrollParam;", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "Lcom/larksuite/framework/palette/param/DispatchDrawParam;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "superMethod", "Lkotlin/Function1;", "(Landroid/view/MotionEvent;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "getColour", "T", "Lcom/larksuite/framework/palette/colour/BaseColour;", "colourClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/larksuite/framework/palette/colour/BaseColour;", "getColourList", "", "onAnimationEnd", "Lcom/larksuite/framework/palette/param/OnAnimationEndParam;", "onAnimationStart", "Lcom/larksuite/framework/palette/param/OnAnimationStartParam;", "onAttachedToWindow", "Lcom/larksuite/framework/palette/param/OnAttachedToWindowParam;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "Lcom/larksuite/framework/palette/param/OnConfigurationChangedParam;", "onConstructor", "view", "Landroid/view/View;", "onDetachedFromWindow", "Lcom/larksuite/framework/palette/param/OnDetachedFromWindowParam;", "onDragEvent", "event", "Landroid/view/DragEvent;", "(Landroid/view/DragEvent;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "onDraw", "Lcom/larksuite/framework/palette/param/OnDrawParam;", "onFinishInflate", "Lcom/larksuite/framework/palette/param/OnFinishInflateParam;", "onFocusChanged", "Lcom/larksuite/framework/palette/param/OnFocusChangedParam;", "gainFocus", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "previouslyFocusedRect", "Landroid/graphics/Rect;", "onInterceptHoverEvent", "onInterceptTouchEvent", "onLayout", "Lcom/larksuite/framework/palette/param/OnLayoutParam;", "changed", "l", "t", "r", C63954b.f161494a, "onMeasure", "Lcom/larksuite/framework/palette/param/OnMeasureParam;", "widthMeasureSpec", "heightMeasureSpec", "onNestedScroll", "target", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "Lcom/larksuite/framework/palette/param/OnNestedScrollParam;", "onScrollChanged", "Lcom/larksuite/framework/palette/param/OnScrollChangedParam;", "oldl", "oldt", "onSizeChanged", "Lcom/larksuite/framework/palette/param/OnSizeChangedParam;", "w", C14002h.f36692e, "oldw", "oldh", "onStartNestedScroll", "child", "nestedScrollAxes", "Lkotlin/Function3;", "(Landroid/view/View;Landroid/view/View;ILkotlin/jvm/functions/Function3;)Ljava/lang/Boolean;", "onTouchEvent", "paint", "scrollBy", "Lcom/larksuite/framework/palette/param/ScrollByParam;", "x", "y", "scrollTo", "Lcom/larksuite/framework/palette/param/ScrollToParam;", "setGravity", "Lcom/larksuite/framework/palette/param/SetGravityParam;", "setHorizontalGravity", "Lcom/larksuite/framework/palette/param/SetHorizontalGravityParam;", "setPadding", "Lcom/larksuite/framework/palette/param/SetPaddingParam;", "left", "top", "right", "bottom", "setVerticalGravity", "Lcom/larksuite/framework/palette/param/SetVerticalGravityParam;", "unPaint", "palette_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class RelativeLayoutPalette extends RelativeLayout {

    /* renamed from: a */
    private final /* synthetic */ DefaultPalette f64523a;

    /* renamed from: a */
    public Boolean mo92951a(DragEvent dragEvent, Function1<? super DragEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        return this.f64523a.mo92615a(dragEvent, function1);
    }

    /* renamed from: a */
    public Boolean mo92952a(MotionEvent motionEvent, Function1<? super MotionEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        return this.f64523a.mo92616a(motionEvent, function1);
    }

    /* renamed from: a */
    public Boolean mo92953a(View view, View view2, int i, Function3<? super View, ? super View, ? super Integer, Boolean> oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "superMethod");
        return this.f64523a.mo92617a(view, view2, i, oVar);
    }

    /* renamed from: a */
    public void mo92954a(View view, Context context, AttributeSet attributeSet, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f64523a.mo92619a(view, context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public void mo92955a(ComputeScrollParam bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "param");
        this.f64523a.mo92620a(bVar);
    }

    /* renamed from: a */
    public void mo92956a(DispatchDrawParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "param");
        this.f64523a.mo92621a(cVar);
    }

    /* renamed from: a */
    public void mo92957a(OnAnimationEndParam dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "param");
        this.f64523a.mo92622a(dVar);
    }

    /* renamed from: a */
    public void mo92958a(OnAnimationStartParam eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "param");
        this.f64523a.mo92623a(eVar);
    }

    /* renamed from: a */
    public void mo92959a(OnAttachedToWindowParam fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "param");
        this.f64523a.mo92624a(fVar);
    }

    /* renamed from: a */
    public void mo92960a(OnConfigurationChangedParam gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "param");
        this.f64523a.mo92625a(gVar);
    }

    /* renamed from: a */
    public void mo92961a(OnDetachedFromWindowParam hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "param");
        this.f64523a.mo92626a(hVar);
    }

    /* renamed from: a */
    public void mo92962a(OnDrawParam iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "param");
        this.f64523a.mo92627a(iVar);
    }

    /* renamed from: a */
    public void mo92963a(OnFinishInflateParam jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "param");
        this.f64523a.mo92628a(jVar);
    }

    /* renamed from: a */
    public void mo92964a(OnFocusChangedParam kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "param");
        this.f64523a.mo92629a(kVar);
    }

    /* renamed from: a */
    public void mo92965a(OnLayoutParam lVar) {
        Intrinsics.checkParameterIsNotNull(lVar, "param");
        this.f64523a.mo92630a(lVar);
    }

    /* renamed from: a */
    public void mo92966a(OnMeasureParam mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "param");
        this.f64523a.mo92631a(mVar);
    }

    /* renamed from: a */
    public void mo92967a(OnNestedScrollParam nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "param");
        this.f64523a.mo92632a(nVar);
    }

    /* renamed from: a */
    public void mo92968a(OnScrollChangedParam oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "param");
        this.f64523a.mo92633a(oVar);
    }

    /* renamed from: a */
    public void mo92969a(OnSizeChangedParam pVar) {
        Intrinsics.checkParameterIsNotNull(pVar, "param");
        this.f64523a.mo92634a(pVar);
    }

    /* renamed from: a */
    public void mo92970a(ScrollByParam qVar) {
        Intrinsics.checkParameterIsNotNull(qVar, "param");
        this.f64523a.mo92635a(qVar);
    }

    /* renamed from: a */
    public void mo92971a(ScrollToParam rVar) {
        Intrinsics.checkParameterIsNotNull(rVar, "param");
        this.f64523a.mo92636a(rVar);
    }

    /* renamed from: b */
    public Boolean mo92972b(MotionEvent motionEvent, Function1<? super MotionEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        return this.f64523a.mo92644d(motionEvent, function1);
    }

    /* renamed from: c */
    public Boolean mo92973c(MotionEvent motionEvent, Function1<? super MotionEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        return this.f64523a.mo92642b(motionEvent, function1);
    }

    /* renamed from: d */
    public Boolean mo92975d(MotionEvent motionEvent, Function1<? super MotionEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        return this.f64523a.mo92643c(motionEvent, function1);
    }

    public List<BaseColour> getColourList() {
        return this.f64523a.mo92618a();
    }

    public void setGravity(SetGravityParam sVar) {
        Intrinsics.checkParameterIsNotNull(sVar, "param");
        this.f64523a.mo92637a(sVar);
    }

    public void setHorizontalGravity(SetHorizontalGravityParam tVar) {
        Intrinsics.checkParameterIsNotNull(tVar, "param");
        this.f64523a.mo92638a(tVar);
    }

    public void setPadding(SetPaddingParam uVar) {
        Intrinsics.checkParameterIsNotNull(uVar, "param");
        this.f64523a.mo92639a(uVar);
    }

    public void setVerticalGravity(SetVerticalGravityParam vVar) {
        Intrinsics.checkParameterIsNotNull(vVar, "param");
        this.f64523a.mo92640a(vVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$a */
    static final class C26108a extends Lambda implements Function0<Unit> {
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26108a(RelativeLayoutPalette relativeLayoutPalette) {
            super(0);
            this.this$0 = relativeLayoutPalette;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            RelativeLayoutPalette.super.computeScroll();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$d */
    static final class C26111d extends Lambda implements Function0<Unit> {
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26111d(RelativeLayoutPalette relativeLayoutPalette) {
            super(0);
            this.this$0 = relativeLayoutPalette;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            RelativeLayoutPalette.super.onAnimationEnd();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$e */
    static final class C26112e extends Lambda implements Function0<Unit> {
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26112e(RelativeLayoutPalette relativeLayoutPalette) {
            super(0);
            this.this$0 = relativeLayoutPalette;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            RelativeLayoutPalette.super.onAnimationStart();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$f */
    static final class C26113f extends Lambda implements Function0<Unit> {
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26113f(RelativeLayoutPalette relativeLayoutPalette) {
            super(0);
            this.this$0 = relativeLayoutPalette;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            RelativeLayoutPalette.super.onAttachedToWindow();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$h */
    static final class C26115h extends Lambda implements Function0<Unit> {
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26115h(RelativeLayoutPalette relativeLayoutPalette) {
            super(0);
            this.this$0 = relativeLayoutPalette;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            RelativeLayoutPalette.super.onDetachedFromWindow();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$k */
    static final class C26118k extends Lambda implements Function0<Unit> {
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26118k(RelativeLayoutPalette relativeLayoutPalette) {
            super(0);
            this.this$0 = relativeLayoutPalette;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            RelativeLayoutPalette.super.onFinishInflate();
        }
    }

    public void computeScroll() {
        mo92955a(new ComputeScrollParam(new C26108a(this)));
    }

    /* access modifiers changed from: protected */
    public void onAnimationEnd() {
        mo92957a(new OnAnimationEndParam(new C26111d(this)));
    }

    /* access modifiers changed from: protected */
    public void onAnimationStart() {
        mo92958a(new OnAnimationStartParam(new C26112e(this)));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        mo92959a(new OnAttachedToWindowParam(new C26113f(this)));
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        mo92961a(new OnDetachedFromWindowParam(new C26115h(this)));
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        mo92963a(new OnFinishInflateParam(new C26118k(this)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Canvas;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$b */
    static final class C26109b extends Lambda implements Function1<Canvas, Unit> {
        final /* synthetic */ Canvas $canvas;
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26109b(RelativeLayoutPalette relativeLayoutPalette, Canvas canvas) {
            super(1);
            this.this$0 = relativeLayoutPalette;
            this.$canvas = canvas;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas) {
            invoke(canvas);
            return Unit.INSTANCE;
        }

        public final void invoke(Canvas canvas) {
            RelativeLayoutPalette.super.dispatchDraw(this.$canvas);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/res/Configuration;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$g */
    static final class C26114g extends Lambda implements Function1<Configuration, Unit> {
        final /* synthetic */ Configuration $newConfig;
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26114g(RelativeLayoutPalette relativeLayoutPalette, Configuration configuration) {
            super(1);
            this.this$0 = relativeLayoutPalette;
            this.$newConfig = configuration;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
            invoke(configuration);
            return Unit.INSTANCE;
        }

        public final void invoke(Configuration configuration) {
            RelativeLayoutPalette.super.onConfigurationChanged(this.$newConfig);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Canvas;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$j */
    static final class C26117j extends Lambda implements Function1<Canvas, Unit> {
        final /* synthetic */ Canvas $canvas;
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26117j(RelativeLayoutPalette relativeLayoutPalette, Canvas canvas) {
            super(1);
            this.this$0 = relativeLayoutPalette;
            this.$canvas = canvas;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas) {
            invoke(canvas);
            return Unit.INSTANCE;
        }

        public final void invoke(Canvas canvas) {
            RelativeLayoutPalette.super.onDraw(this.$canvas);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/MotionEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$c */
    static final class C26110c extends Lambda implements Function1<MotionEvent, Boolean> {
        final /* synthetic */ MotionEvent $ev;
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26110c(RelativeLayoutPalette relativeLayoutPalette, MotionEvent motionEvent) {
            super(1);
            this.this$0 = relativeLayoutPalette;
            this.$ev = motionEvent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(MotionEvent motionEvent) {
            return Boolean.valueOf(invoke(motionEvent));
        }

        public final boolean invoke(MotionEvent motionEvent) {
            return RelativeLayoutPalette.super.dispatchTouchEvent(this.$ev);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/DragEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$i */
    static final class C26116i extends Lambda implements Function1<DragEvent, Boolean> {
        final /* synthetic */ DragEvent $event;
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26116i(RelativeLayoutPalette relativeLayoutPalette, DragEvent dragEvent) {
            super(1);
            this.this$0 = relativeLayoutPalette;
            this.$event = dragEvent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(DragEvent dragEvent) {
            return Boolean.valueOf(invoke(dragEvent));
        }

        public final boolean invoke(DragEvent dragEvent) {
            return RelativeLayoutPalette.super.onDragEvent(this.$event);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/MotionEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$m */
    static final class C26120m extends Lambda implements Function1<MotionEvent, Boolean> {
        final /* synthetic */ MotionEvent $event;
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26120m(RelativeLayoutPalette relativeLayoutPalette, MotionEvent motionEvent) {
            super(1);
            this.this$0 = relativeLayoutPalette;
            this.$event = motionEvent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(MotionEvent motionEvent) {
            return Boolean.valueOf(invoke(motionEvent));
        }

        public final boolean invoke(MotionEvent motionEvent) {
            return RelativeLayoutPalette.super.onInterceptHoverEvent(this.$event);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/MotionEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$n */
    static final class C26121n extends Lambda implements Function1<MotionEvent, Boolean> {
        final /* synthetic */ MotionEvent $ev;
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26121n(RelativeLayoutPalette relativeLayoutPalette, MotionEvent motionEvent) {
            super(1);
            this.this$0 = relativeLayoutPalette;
            this.$ev = motionEvent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(MotionEvent motionEvent) {
            return Boolean.valueOf(invoke(motionEvent));
        }

        public final boolean invoke(MotionEvent motionEvent) {
            return RelativeLayoutPalette.super.onInterceptTouchEvent(this.$ev);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/MotionEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$u */
    static final class C26128u extends Lambda implements Function1<MotionEvent, Boolean> {
        final /* synthetic */ MotionEvent $event;
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26128u(RelativeLayoutPalette relativeLayoutPalette, MotionEvent motionEvent) {
            super(1);
            this.this$0 = relativeLayoutPalette;
            this.$event = motionEvent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(MotionEvent motionEvent) {
            return Boolean.valueOf(invoke(motionEvent));
        }

        public final boolean invoke(MotionEvent motionEvent) {
            return RelativeLayoutPalette.super.onTouchEvent(this.$event);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RelativeLayoutPalette(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        mo92956a(new DispatchDrawParam(canvas, new C26109b(this, canvas)));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return mo92952a(motionEvent, new C26110c(this, motionEvent)).booleanValue();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        mo92960a(new OnConfigurationChangedParam(configuration, new C26114g(this, configuration)));
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        return mo92951a(dragEvent, new C26116i(this, dragEvent)).booleanValue();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        mo92962a(new OnDrawParam(canvas, new C26117j(this, canvas)));
    }

    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        return mo92972b(motionEvent, new C26120m(this, motionEvent)).booleanValue();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return mo92973c(motionEvent, new C26121n(this, motionEvent)).booleanValue();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return mo92975d(motionEvent, new C26128u(this, motionEvent)).booleanValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$p */
    static final class C26123p extends Lambda implements Function2<Integer, Integer, Unit> {
        final /* synthetic */ int $heightMeasureSpec;
        final /* synthetic */ int $widthMeasureSpec;
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26123p(RelativeLayoutPalette relativeLayoutPalette, int i, int i2) {
            super(2);
            this.this$0 = relativeLayoutPalette;
            this.$widthMeasureSpec = i;
            this.$heightMeasureSpec = i2;
        }

        public final void invoke(int i, int i2) {
            RelativeLayoutPalette.super.onMeasure(this.$widthMeasureSpec, this.$heightMeasureSpec);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Integer num, Integer num2) {
            invoke(num.intValue(), num2.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$v */
    static final class C26129v extends Lambda implements Function2<Integer, Integer, Unit> {
        final /* synthetic */ int $x;
        final /* synthetic */ int $y;
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26129v(RelativeLayoutPalette relativeLayoutPalette, int i, int i2) {
            super(2);
            this.this$0 = relativeLayoutPalette;
            this.$x = i;
            this.$y = i2;
        }

        public final void invoke(int i, int i2) {
            RelativeLayoutPalette.super.scrollBy(this.$x, this.$y);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Integer num, Integer num2) {
            invoke(num.intValue(), num2.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$w */
    static final class C26130w extends Lambda implements Function2<Integer, Integer, Unit> {
        final /* synthetic */ int $x;
        final /* synthetic */ int $y;
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26130w(RelativeLayoutPalette relativeLayoutPalette, int i, int i2) {
            super(2);
            this.this$0 = relativeLayoutPalette;
            this.$x = i;
            this.$y = i2;
        }

        public final void invoke(int i, int i2) {
            RelativeLayoutPalette.super.scrollTo(this.$x, this.$y);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Integer num, Integer num2) {
            invoke(num.intValue(), num2.intValue());
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        mo92966a(new OnMeasureParam(i, i2, new C26123p(this, i, i2)));
    }

    public void scrollBy(int i, int i2) {
        mo92970a(new ScrollByParam(i, i2, new C26129v(this, i, i2)));
    }

    public void scrollTo(int i, int i2) {
        mo92971a(new ScrollToParam(i, i2, new C26130w(this, i, i2)));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RelativeLayoutPalette(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "Landroid/graphics/Rect;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$l */
    static final class C26119l extends Lambda implements Function3<Boolean, Integer, Rect, Unit> {
        final /* synthetic */ int $direction;
        final /* synthetic */ boolean $gainFocus;
        final /* synthetic */ Rect $previouslyFocusedRect;
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26119l(RelativeLayoutPalette relativeLayoutPalette, boolean z, int i, Rect rect) {
            super(3);
            this.this$0 = relativeLayoutPalette;
            this.$gainFocus = z;
            this.$direction = i;
            this.$previouslyFocusedRect = rect;
        }

        public final void invoke(boolean z, int i, Rect rect) {
            RelativeLayoutPalette.super.onFocusChanged(this.$gainFocus, this.$direction, this.$previouslyFocusedRect);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Unit invoke(Boolean bool, Integer num, Rect rect) {
            invoke(bool.booleanValue(), num.intValue(), rect);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$t */
    static final class C26127t extends Lambda implements Function3<View, View, Integer, Boolean> {
        final /* synthetic */ View $child;
        final /* synthetic */ int $nestedScrollAxes;
        final /* synthetic */ View $target;
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26127t(RelativeLayoutPalette relativeLayoutPalette, View view, View view2, int i) {
            super(3);
            this.this$0 = relativeLayoutPalette;
            this.$child = view;
            this.$target = view2;
            this.$nestedScrollAxes = i;
        }

        public final boolean invoke(View view, View view2, int i) {
            return RelativeLayoutPalette.super.onStartNestedScroll(this.$child, this.$target, this.$nestedScrollAxes);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Boolean invoke(View view, View view2, Integer num) {
            return Boolean.valueOf(invoke(view, view2, num.intValue()));
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        mo92964a(new OnFocusChangedParam(z, i, rect, new C26119l(this, z, i, rect)));
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo92953a(view, view2, i, new C26127t(this, view, view2, i)).booleanValue();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RelativeLayoutPalette(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$r */
    static final class C26125r extends Lambda implements Function4<Integer, Integer, Integer, Integer, Unit> {
        final /* synthetic */ int $l;
        final /* synthetic */ int $oldl;
        final /* synthetic */ int $oldt;
        final /* synthetic */ int $t;
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26125r(RelativeLayoutPalette relativeLayoutPalette, int i, int i2, int i3, int i4) {
            super(4);
            this.this$0 = relativeLayoutPalette;
            this.$l = i;
            this.$t = i2;
            this.$oldl = i3;
            this.$oldt = i4;
        }

        public final void invoke(int i, int i2, int i3, int i4) {
            RelativeLayoutPalette.super.onScrollChanged(this.$l, this.$t, this.$oldl, this.$oldt);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function4
        public /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
            invoke(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$s */
    static final class C26126s extends Lambda implements Function4<Integer, Integer, Integer, Integer, Unit> {
        final /* synthetic */ int $h;
        final /* synthetic */ int $oldh;
        final /* synthetic */ int $oldw;
        final /* synthetic */ int $w;
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26126s(RelativeLayoutPalette relativeLayoutPalette, int i, int i2, int i3, int i4) {
            super(4);
            this.this$0 = relativeLayoutPalette;
            this.$w = i;
            this.$h = i2;
            this.$oldw = i3;
            this.$oldh = i4;
        }

        public final void invoke(int i, int i2, int i3, int i4) {
            RelativeLayoutPalette.super.onSizeChanged(this.$w, this.$h, this.$oldw, this.$oldh);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function4
        public /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
            invoke(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$x */
    static final class C26131x extends Lambda implements Function4<Integer, Integer, Integer, Integer, Unit> {
        final /* synthetic */ int $bottom;
        final /* synthetic */ int $left;
        final /* synthetic */ int $right;
        final /* synthetic */ int $top;
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26131x(RelativeLayoutPalette relativeLayoutPalette, int i, int i2, int i3, int i4) {
            super(4);
            this.this$0 = relativeLayoutPalette;
            this.$left = i;
            this.$top = i2;
            this.$right = i3;
            this.$bottom = i4;
        }

        public final void invoke(int i, int i2, int i3, int i4) {
            RelativeLayoutPalette.super.setPadding(this.$left, this.$top, this.$right, this.$bottom);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function4
        public /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
            invoke(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        mo92968a(new OnScrollChangedParam(i, i2, i3, i4, new C26125r(this, i, i2, i3, i4)));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        mo92969a(new OnSizeChangedParam(i, i2, i3, i4, new C26126s(this, i, i2, i3, i4)));
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        setPadding(new SetPaddingParam(i, i2, i3, i4, new C26131x(this, i, i2, i3, i4)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RelativeLayoutPalette(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f64523a = new DefaultPalette();
        mo92954a(this, context, attributeSet, i, i2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "<anonymous parameter 4>", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$o */
    static final class C26122o extends Lambda implements Function5<Boolean, Integer, Integer, Integer, Integer, Unit> {
        final /* synthetic */ int $b;
        final /* synthetic */ boolean $changed;
        final /* synthetic */ int $l;
        final /* synthetic */ int $r;
        final /* synthetic */ int $t;
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26122o(RelativeLayoutPalette relativeLayoutPalette, boolean z, int i, int i2, int i3, int i4) {
            super(5);
            this.this$0 = relativeLayoutPalette;
            this.$changed = z;
            this.$l = i;
            this.$t = i2;
            this.$r = i3;
            this.$b = i4;
        }

        public final void invoke(boolean z, int i, int i2, int i3, int i4) {
            RelativeLayoutPalette.super.onLayout(this.$changed, this.$l, this.$t, this.$r, this.$b);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function5
        public /* synthetic */ Unit invoke(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4) {
            invoke(bool.booleanValue(), num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "<anonymous parameter 4>", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.palette.widget.RelativeLayoutPalette$q */
    static final class C26124q extends Lambda implements Function5<View, Integer, Integer, Integer, Integer, Unit> {
        final /* synthetic */ int $dxConsumed;
        final /* synthetic */ int $dxUnconsumed;
        final /* synthetic */ int $dyConsumed;
        final /* synthetic */ int $dyUnconsumed;
        final /* synthetic */ View $target;
        final /* synthetic */ RelativeLayoutPalette this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26124q(RelativeLayoutPalette relativeLayoutPalette, View view, int i, int i2, int i3, int i4) {
            super(5);
            this.this$0 = relativeLayoutPalette;
            this.$target = view;
            this.$dxConsumed = i;
            this.$dyConsumed = i2;
            this.$dxUnconsumed = i3;
            this.$dyUnconsumed = i4;
        }

        public final void invoke(View view, int i, int i2, int i3, int i4) {
            RelativeLayoutPalette.super.onNestedScroll(this.$target, this.$dxConsumed, this.$dyConsumed, this.$dxUnconsumed, this.$dyUnconsumed);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function5
        public /* synthetic */ Unit invoke(View view, Integer num, Integer num2, Integer num3, Integer num4) {
            invoke(view, num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo92965a(new OnLayoutParam(z, i, i2, i3, i4, new C26122o(this, z, i, i2, i3, i4)));
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo92967a(new OnNestedScrollParam(view, i, i2, i3, i4, new C26124q(this, view, i, i2, i3, i4)));
    }
}
