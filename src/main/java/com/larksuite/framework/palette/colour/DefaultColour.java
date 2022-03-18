package com.larksuite.framework.palette.colour;

import android.content.Context;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
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
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0011H\u0016J/\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00130\u0017H\u0016¢\u0006\u0002\u0010\u0018J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020%H\u0016J2\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH\u0016J\u0010\u0010,\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020-H\u0016J/\u0010.\u001a\u0004\u0018\u00010\u00132\b\u0010/\u001a\u0004\u0018\u0001002\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000100\u0012\u0004\u0012\u00020\u00130\u0017H\u0016¢\u0006\u0002\u00101J\u0010\u00102\u001a\u00020\r2\u0006\u0010\u000e\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020\r2\u0006\u0010\u000e\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020\r2\u0006\u0010\u000e\u001a\u000207H\u0016J/\u00108\u001a\u0004\u0018\u00010\u00132\b\u0010/\u001a\u0004\u0018\u00010\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00130\u0017H\u0016¢\u0006\u0002\u0010\u0018J/\u00109\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00130\u0017H\u0016¢\u0006\u0002\u0010\u0018J\u0010\u0010:\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020?H\u0016J\u0010\u0010@\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020CH\u0016JO\u0010D\u001a\u0004\u0018\u00010\u00132\b\u0010E\u001a\u0004\u0018\u00010\u000b2\b\u0010F\u001a\u0004\u0018\u00010\u000b2\u0006\u0010G\u001a\u00020\b2\"\u0010\u0016\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130HH\u0016¢\u0006\u0002\u0010IJ/\u0010J\u001a\u0004\u0018\u00010\u00132\b\u0010/\u001a\u0004\u0018\u00010\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00130\u0017H\u0016¢\u0006\u0002\u0010\u0018J\u0010\u0010K\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020LH\u0016J\u0010\u0010M\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020NH\u0016J\u0010\u0010O\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020PH\u0016J\u0010\u0010Q\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020RH\u0016J\u0010\u0010S\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020TH\u0016J\u0010\u0010U\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020VH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006W"}, d2 = {"Lcom/larksuite/framework/palette/colour/DefaultColour;", "Lcom/larksuite/framework/palette/colour/IColour;", "()V", "mAttrs", "Landroid/util/AttributeSet;", "mContext", "Landroid/content/Context;", "mDefStyleAttr", "", "mDefStyleRes", "mView", "Landroid/view/View;", "computeScroll", "", "param", "Lcom/larksuite/framework/palette/param/ComputeScrollParam;", "dispatchDraw", "Lcom/larksuite/framework/palette/param/DispatchDrawParam;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "superMethod", "Lkotlin/Function1;", "(Landroid/view/MotionEvent;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "getAttrs", "getContext", "getDefStyleAttr", "getDefStyleRes", "getView", "onAnimationEnd", "Lcom/larksuite/framework/palette/param/OnAnimationEndParam;", "onAnimationStart", "Lcom/larksuite/framework/palette/param/OnAnimationStartParam;", "onAttachedToWindow", "Lcom/larksuite/framework/palette/param/OnAttachedToWindowParam;", "onConfigurationChanged", "Lcom/larksuite/framework/palette/param/OnConfigurationChangedParam;", "onConstructor", "view", "context", "attrs", "defStyleAttr", "defStyleRes", "onDetachedFromWindow", "Lcom/larksuite/framework/palette/param/OnDetachedFromWindowParam;", "onDragEvent", "event", "Landroid/view/DragEvent;", "(Landroid/view/DragEvent;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "onDraw", "Lcom/larksuite/framework/palette/param/OnDrawParam;", "onFinishInflate", "Lcom/larksuite/framework/palette/param/OnFinishInflateParam;", "onFocusChanged", "Lcom/larksuite/framework/palette/param/OnFocusChangedParam;", "onInterceptHoverEvent", "onInterceptTouchEvent", "onLayout", "Lcom/larksuite/framework/palette/param/OnLayoutParam;", "onMeasure", "Lcom/larksuite/framework/palette/param/OnMeasureParam;", "onNestedScroll", "Lcom/larksuite/framework/palette/param/OnNestedScrollParam;", "onScrollChanged", "Lcom/larksuite/framework/palette/param/OnScrollChangedParam;", "onSizeChanged", "Lcom/larksuite/framework/palette/param/OnSizeChangedParam;", "onStartNestedScroll", "child", "target", "nestedScrollAxes", "Lkotlin/Function3;", "(Landroid/view/View;Landroid/view/View;ILkotlin/jvm/functions/Function3;)Ljava/lang/Boolean;", "onTouchEvent", "scrollBy", "Lcom/larksuite/framework/palette/param/ScrollByParam;", "scrollTo", "Lcom/larksuite/framework/palette/param/ScrollToParam;", "setGravity", "Lcom/larksuite/framework/palette/param/SetGravityParam;", "setHorizontalGravity", "Lcom/larksuite/framework/palette/param/SetHorizontalGravityParam;", "setPadding", "Lcom/larksuite/framework/palette/param/SetPaddingParam;", "setVerticalGravity", "Lcom/larksuite/framework/palette/param/SetVerticalGravityParam;", "palette_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.framework.palette.a.b */
public final class DefaultColour {

    /* renamed from: a */
    private View f64445a;

    /* renamed from: b */
    private Context f64446b;

    /* renamed from: c */
    private AttributeSet f64447c;

    /* renamed from: d */
    private int f64448d;

    /* renamed from: e */
    private int f64449e;

    /* renamed from: a */
    public Boolean mo92586a(DragEvent dragEvent, Function1<? super DragEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        return null;
    }

    /* renamed from: a */
    public Boolean mo92587a(MotionEvent motionEvent, Function1<? super MotionEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        return null;
    }

    /* renamed from: a */
    public Boolean mo92588a(View view, View view2, int i, Function3<? super View, ? super View, ? super Integer, Boolean> oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "superMethod");
        return null;
    }

    /* renamed from: a */
    public void mo92590a(ComputeScrollParam bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "param");
    }

    /* renamed from: a */
    public void mo92591a(DispatchDrawParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "param");
    }

    /* renamed from: a */
    public void mo92592a(OnAnimationEndParam dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "param");
    }

    /* renamed from: a */
    public void mo92593a(OnAnimationStartParam eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "param");
    }

    /* renamed from: a */
    public void mo92594a(OnAttachedToWindowParam fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "param");
    }

    /* renamed from: a */
    public void mo92595a(OnConfigurationChangedParam gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "param");
    }

    /* renamed from: a */
    public void mo92596a(OnDetachedFromWindowParam hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "param");
    }

    /* renamed from: a */
    public void mo92597a(OnDrawParam iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "param");
    }

    /* renamed from: a */
    public void mo92598a(OnFinishInflateParam jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "param");
    }

    /* renamed from: a */
    public void mo92599a(OnFocusChangedParam kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "param");
    }

    /* renamed from: a */
    public void mo92600a(OnLayoutParam lVar) {
        Intrinsics.checkParameterIsNotNull(lVar, "param");
    }

    /* renamed from: a */
    public void mo92601a(OnMeasureParam mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "param");
    }

    /* renamed from: a */
    public void mo92602a(OnNestedScrollParam nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "param");
    }

    /* renamed from: a */
    public void mo92603a(OnScrollChangedParam oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "param");
    }

    /* renamed from: a */
    public void mo92604a(OnSizeChangedParam pVar) {
        Intrinsics.checkParameterIsNotNull(pVar, "param");
    }

    /* renamed from: a */
    public void mo92605a(ScrollByParam qVar) {
        Intrinsics.checkParameterIsNotNull(qVar, "param");
    }

    /* renamed from: a */
    public void mo92606a(ScrollToParam rVar) {
        Intrinsics.checkParameterIsNotNull(rVar, "param");
    }

    /* renamed from: a */
    public void mo92607a(SetGravityParam sVar) {
        Intrinsics.checkParameterIsNotNull(sVar, "param");
    }

    /* renamed from: a */
    public void mo92608a(SetHorizontalGravityParam tVar) {
        Intrinsics.checkParameterIsNotNull(tVar, "param");
    }

    /* renamed from: a */
    public void mo92609a(SetPaddingParam uVar) {
        Intrinsics.checkParameterIsNotNull(uVar, "param");
    }

    /* renamed from: a */
    public void mo92610a(SetVerticalGravityParam vVar) {
        Intrinsics.checkParameterIsNotNull(vVar, "param");
    }

    /* renamed from: b */
    public Boolean mo92611b(MotionEvent motionEvent, Function1<? super MotionEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        return null;
    }

    /* renamed from: c */
    public Boolean mo92612c(MotionEvent motionEvent, Function1<? super MotionEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        return null;
    }

    /* renamed from: d */
    public Boolean mo92613d(MotionEvent motionEvent, Function1<? super MotionEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        return null;
    }

    /* renamed from: a */
    public Context mo92585a() {
        Context context = this.f64446b;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return context;
    }

    /* renamed from: a */
    public void mo92589a(View view, Context context, AttributeSet attributeSet, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f64445a = view;
        this.f64446b = context;
        this.f64447c = attributeSet;
        this.f64448d = i;
        this.f64449e = i2;
    }
}
