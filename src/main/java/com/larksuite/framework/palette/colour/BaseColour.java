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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001J\u0011\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0001J0\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\n0\u000eH\u0001¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u0001J\t\u0010\u0016\u001a\u00020\u0015H\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u0001J\u0011\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001aH\u0001J\u0011\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001cH\u0001J\u0011\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001eH\u0001J\u0011\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020 H\u0001J7\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010%\u001a\u00020\u00152\b\b\u0002\u0010&\u001a\u00020\u0015H\u0001J\u0011\u0010'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020(H\u0001J0\u0010)\u001a\u0004\u0018\u00010\n2\b\u0010*\u001a\u0004\u0018\u00010+2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020\n0\u000eH\u0001¢\u0006\u0002\u0010,J\u0011\u0010-\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020.H\u0001J\u0011\u0010/\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000200H\u0001J\u0011\u00101\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000202H\u0001J0\u00103\u001a\u0004\u0018\u00010\n2\b\u0010*\u001a\u0004\u0018\u00010\f2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\n0\u000eH\u0001¢\u0006\u0002\u0010\u000fJ0\u00104\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\n0\u000eH\u0001¢\u0006\u0002\u0010\u000fJ\u0011\u00105\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000206H\u0001J\u0011\u00107\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000208H\u0001J\u0011\u00109\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020:H\u0001J\u0011\u0010;\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020<H\u0001J\u0011\u0010=\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020>H\u0001JP\u0010?\u001a\u0004\u0018\u00010\n2\b\u0010@\u001a\u0004\u0018\u00010\u00182\b\u0010A\u001a\u0004\u0018\u00010\u00182\u0006\u0010B\u001a\u00020\u00152\"\u0010\r\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0CH\u0001¢\u0006\u0002\u0010DJ0\u0010E\u001a\u0004\u0018\u00010\n2\b\u0010*\u001a\u0004\u0018\u00010\f2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\n0\u000eH\u0001¢\u0006\u0002\u0010\u000fJ\u0011\u0010F\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020GH\u0001J\u0011\u0010H\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020IH\u0001J\u0011\u0010J\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020KH\u0001J\u0011\u0010L\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020MH\u0001J\u0011\u0010N\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020OH\u0001J\u0011\u0010P\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020QH\u0001¨\u0006R"}, d2 = {"Lcom/larksuite/framework/palette/colour/BaseColour;", "Lcom/larksuite/framework/palette/colour/IColour;", "()V", "computeScroll", "", "param", "Lcom/larksuite/framework/palette/param/ComputeScrollParam;", "dispatchDraw", "Lcom/larksuite/framework/palette/param/DispatchDrawParam;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "superMethod", "Lkotlin/Function1;", "(Landroid/view/MotionEvent;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "getAttrs", "Landroid/util/AttributeSet;", "getContext", "Landroid/content/Context;", "getDefStyleAttr", "", "getDefStyleRes", "getView", "Landroid/view/View;", "onAnimationEnd", "Lcom/larksuite/framework/palette/param/OnAnimationEndParam;", "onAnimationStart", "Lcom/larksuite/framework/palette/param/OnAnimationStartParam;", "onAttachedToWindow", "Lcom/larksuite/framework/palette/param/OnAttachedToWindowParam;", "onConfigurationChanged", "Lcom/larksuite/framework/palette/param/OnConfigurationChangedParam;", "onConstructor", "view", "context", "attrs", "defStyleAttr", "defStyleRes", "onDetachedFromWindow", "Lcom/larksuite/framework/palette/param/OnDetachedFromWindowParam;", "onDragEvent", "event", "Landroid/view/DragEvent;", "(Landroid/view/DragEvent;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "onDraw", "Lcom/larksuite/framework/palette/param/OnDrawParam;", "onFinishInflate", "Lcom/larksuite/framework/palette/param/OnFinishInflateParam;", "onFocusChanged", "Lcom/larksuite/framework/palette/param/OnFocusChangedParam;", "onInterceptHoverEvent", "onInterceptTouchEvent", "onLayout", "Lcom/larksuite/framework/palette/param/OnLayoutParam;", "onMeasure", "Lcom/larksuite/framework/palette/param/OnMeasureParam;", "onNestedScroll", "Lcom/larksuite/framework/palette/param/OnNestedScrollParam;", "onScrollChanged", "Lcom/larksuite/framework/palette/param/OnScrollChangedParam;", "onSizeChanged", "Lcom/larksuite/framework/palette/param/OnSizeChangedParam;", "onStartNestedScroll", "child", "target", "nestedScrollAxes", "Lkotlin/Function3;", "(Landroid/view/View;Landroid/view/View;ILkotlin/jvm/functions/Function3;)Ljava/lang/Boolean;", "onTouchEvent", "scrollBy", "Lcom/larksuite/framework/palette/param/ScrollByParam;", "scrollTo", "Lcom/larksuite/framework/palette/param/ScrollToParam;", "setGravity", "Lcom/larksuite/framework/palette/param/SetGravityParam;", "setHorizontalGravity", "Lcom/larksuite/framework/palette/param/SetHorizontalGravityParam;", "setPadding", "Lcom/larksuite/framework/palette/param/SetPaddingParam;", "setVerticalGravity", "Lcom/larksuite/framework/palette/param/SetVerticalGravityParam;", "palette_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.framework.palette.a.a */
public abstract class BaseColour {

    /* renamed from: a */
    private final /* synthetic */ DefaultColour f64444a = new DefaultColour();

    /* renamed from: a */
    public Context mo92556a() {
        return this.f64444a.mo92585a();
    }

    /* renamed from: a */
    public Boolean mo92557a(DragEvent dragEvent, Function1<? super DragEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        return this.f64444a.mo92586a(dragEvent, function1);
    }

    /* renamed from: a */
    public Boolean mo92558a(MotionEvent motionEvent, Function1<? super MotionEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        return this.f64444a.mo92587a(motionEvent, function1);
    }

    /* renamed from: a */
    public Boolean mo92559a(View view, View view2, int i, Function3<? super View, ? super View, ? super Integer, Boolean> oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "superMethod");
        return this.f64444a.mo92588a(view, view2, i, oVar);
    }

    /* renamed from: a */
    public void mo92560a(View view, Context context, AttributeSet attributeSet, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f64444a.mo92589a(view, context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public void mo92561a(ComputeScrollParam bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "param");
        this.f64444a.mo92590a(bVar);
    }

    /* renamed from: a */
    public void mo92562a(DispatchDrawParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "param");
        this.f64444a.mo92591a(cVar);
    }

    /* renamed from: a */
    public void mo92563a(OnAnimationEndParam dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "param");
        this.f64444a.mo92592a(dVar);
    }

    /* renamed from: a */
    public void mo92564a(OnAnimationStartParam eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "param");
        this.f64444a.mo92593a(eVar);
    }

    /* renamed from: a */
    public void mo92565a(OnAttachedToWindowParam fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "param");
        this.f64444a.mo92594a(fVar);
    }

    /* renamed from: a */
    public void mo92566a(OnConfigurationChangedParam gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "param");
        this.f64444a.mo92595a(gVar);
    }

    /* renamed from: a */
    public void mo92567a(OnDetachedFromWindowParam hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "param");
        this.f64444a.mo92596a(hVar);
    }

    /* renamed from: a */
    public void mo92568a(OnDrawParam iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "param");
        this.f64444a.mo92597a(iVar);
    }

    /* renamed from: a */
    public void mo92569a(OnFinishInflateParam jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "param");
        this.f64444a.mo92598a(jVar);
    }

    /* renamed from: a */
    public void mo92570a(OnFocusChangedParam kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "param");
        this.f64444a.mo92599a(kVar);
    }

    /* renamed from: a */
    public void mo92571a(OnLayoutParam lVar) {
        Intrinsics.checkParameterIsNotNull(lVar, "param");
        this.f64444a.mo92600a(lVar);
    }

    /* renamed from: a */
    public void mo92572a(OnMeasureParam mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "param");
        this.f64444a.mo92601a(mVar);
    }

    /* renamed from: a */
    public void mo92573a(OnNestedScrollParam nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "param");
        this.f64444a.mo92602a(nVar);
    }

    /* renamed from: a */
    public void mo92574a(OnScrollChangedParam oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "param");
        this.f64444a.mo92603a(oVar);
    }

    /* renamed from: a */
    public void mo92575a(OnSizeChangedParam pVar) {
        Intrinsics.checkParameterIsNotNull(pVar, "param");
        this.f64444a.mo92604a(pVar);
    }

    /* renamed from: a */
    public void mo92576a(ScrollByParam qVar) {
        Intrinsics.checkParameterIsNotNull(qVar, "param");
        this.f64444a.mo92605a(qVar);
    }

    /* renamed from: a */
    public void mo92577a(ScrollToParam rVar) {
        Intrinsics.checkParameterIsNotNull(rVar, "param");
        this.f64444a.mo92606a(rVar);
    }

    /* renamed from: a */
    public void mo92578a(SetGravityParam sVar) {
        Intrinsics.checkParameterIsNotNull(sVar, "param");
        this.f64444a.mo92607a(sVar);
    }

    /* renamed from: a */
    public void mo92579a(SetHorizontalGravityParam tVar) {
        Intrinsics.checkParameterIsNotNull(tVar, "param");
        this.f64444a.mo92608a(tVar);
    }

    /* renamed from: a */
    public void mo92580a(SetPaddingParam uVar) {
        Intrinsics.checkParameterIsNotNull(uVar, "param");
        this.f64444a.mo92609a(uVar);
    }

    /* renamed from: a */
    public void mo92581a(SetVerticalGravityParam vVar) {
        Intrinsics.checkParameterIsNotNull(vVar, "param");
        this.f64444a.mo92610a(vVar);
    }

    /* renamed from: b */
    public Boolean mo92582b(MotionEvent motionEvent, Function1<? super MotionEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        return this.f64444a.mo92613d(motionEvent, function1);
    }

    /* renamed from: c */
    public Boolean mo92583c(MotionEvent motionEvent, Function1<? super MotionEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        return this.f64444a.mo92611b(motionEvent, function1);
    }

    /* renamed from: d */
    public Boolean mo92584d(MotionEvent motionEvent, Function1<? super MotionEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        return this.f64444a.mo92612c(motionEvent, function1);
    }
}
