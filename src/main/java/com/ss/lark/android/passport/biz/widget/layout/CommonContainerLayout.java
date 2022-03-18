package com.ss.lark.android.passport.biz.widget.layout;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.ImeObserver;
import com.ss.android.lark.passport.infra.util.p2441c.C49170e;
import com.ss.android.lark.passport.infra.util.p2441c.C49173f;
import com.ss.lark.android.passport.biz.widget.layout.AbstractC65313b;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 U2\u00020\u00012\u00020\u0002:\u0001UB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010C\u001a\u00020\b2\b\u0010D\u001a\u0004\u0018\u00010*H\u0002J\b\u0010E\u001a\u00020\u0017H\u0016J \u0010F\u001a\u00020#2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\bJ\u0018\u0010G\u001a\u00020#2\u0006\u0010D\u001a\u00020*2\b\u0010H\u001a\u0004\u0018\u00010IJ\u0010\u0010G\u001a\u00020#2\b\b\u0001\u0010J\u001a\u00020\bJ\u0018\u0010K\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\bH\u0002J\b\u0010L\u001a\u00020#H\u0002J\b\u0010M\u001a\u00020#H\u0002J\b\u0010N\u001a\u00020#H\u0014J\b\u0010O\u001a\u00020#H\u0002J \u0010P\u001a\u00020#2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\bJ\u000e\u0010Q\u001a\u00020#2\u0006\u0010R\u001a\u00020,J\u0018\u0010S\u001a\u00020=2\u0006\u0010D\u001a\u00020*2\u0006\u0010T\u001a\u00020\bH\u0002R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R7\u0010\u001e\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020#\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'Ra\u0010(\u001aI\u0012\u0015\u0012\u0013\u0018\u00010*¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110,¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110\b¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020#0)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R7\u00103\u001a\u001f\u0012\u0013\u0012\u00110,¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020#\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010%\"\u0004\b5\u0010'R\u001a\u00106\u001a\u000207X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020*X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010?\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\rR\u000e\u0010A\u001a\u00020BX\u0004¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lcom/ss/lark/android/passport/biz/widget/layout/CommonContainerLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/lifecycle/LifecycleOwner;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "contentContainer", "Landroid/widget/LinearLayout;", "getContentContainer", "()Landroid/widget/LinearLayout;", "contentScrollView", "Lcom/ss/lark/android/passport/biz/widget/layout/BlockedNestedScrollView;", "getContentScrollView", "()Lcom/ss/lark/android/passport/biz/widget/layout/BlockedNestedScrollView;", "footerContainer", "getFooterContainer", "headerContainer", "getHeaderContainer", "lifecycleRegistry", "Landroidx/lifecycle/Lifecycle;", "getLifecycleRegistry", "()Landroidx/lifecycle/Lifecycle;", "lifecycleRegistry$delegate", "Lkotlin/Lazy;", "locationOnScreen", "", "onContentScrollListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "titleTopToToolBarBottom", "", "getOnContentScrollListener", "()Lkotlin/jvm/functions/Function1;", "setOnContentScrollListener", "(Lkotlin/jvm/functions/Function1;)V", "onImeChangeHandler", "Lkotlin/Function3;", "Landroid/view/View;", "focusedView", "", "imeShowing", "imeHeight", "getOnImeChangeHandler", "()Lkotlin/jvm/functions/Function3;", "setOnImeChangeHandler", "(Lkotlin/jvm/functions/Function3;)V", "onImeChangedEndListener", "getOnImeChangedEndListener", "setOnImeChangedEndListener", "onImeChangedExtraHeightProvider", "Lcom/ss/lark/android/passport/biz/widget/layout/OnImeChangedExtraHeightProvider;", "getOnImeChangedExtraHeightProvider", "()Lcom/ss/lark/android/passport/biz/widget/layout/OnImeChangedExtraHeightProvider;", "setOnImeChangedExtraHeightProvider", "(Lcom/ss/lark/android/passport/biz/widget/layout/OnImeChangedExtraHeightProvider;)V", "paddingUpdateAnimator", "Landroid/animation/ValueAnimator;", "statusBar", "titleBarContainer", "getTitleBarContainer", "tvTitle", "Landroid/widget/TextView;", "computeViewBottomInScreen", "view", "getLifecycle", "handleImeChanged", "inflatePartialLayout", "params", "Landroid/view/ViewGroup$LayoutParams;", "layoutId", "measureAvailablePaddingBottom", "observeIme", "observeScroll", "onDetachedFromWindow", "onFirstLayout", "onImeChanged", "setContentScrollable", "scrollable", "smoothUpdatePaddingBottom", "to", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CommonContainerLayout extends ConstraintLayout implements LifecycleOwner {

    /* renamed from: c */
    public static final Companion f164431c = new Companion(null);

    /* renamed from: a */
    public final TextView f164432a;

    /* renamed from: b */
    public final int[] f164433b;

    /* renamed from: d */
    private final Lazy f164434d;

    /* renamed from: e */
    private final View f164435e;

    /* renamed from: f */
    private ValueAnimator f164436f;

    /* renamed from: g */
    private final LinearLayout f164437g;

    /* renamed from: h */
    private final LinearLayout f164438h;

    /* renamed from: i */
    private final LinearLayout f164439i;

    /* renamed from: j */
    private final LinearLayout f164440j;

    /* renamed from: k */
    private final BlockedNestedScrollView f164441k;

    /* renamed from: l */
    private Function1<? super Integer, Unit> f164442l;

    /* renamed from: m */
    private Function3<? super View, ? super Boolean, ? super Integer, Unit> f164443m;

    /* renamed from: n */
    private Function1<? super Boolean, Unit> f164444n;

    /* renamed from: o */
    private AbstractC65313b f164445o;

    public CommonContainerLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommonContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final Lifecycle getLifecycleRegistry() {
        return (Lifecycle) this.f164434d.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/lark/android/passport/biz/widget/layout/CommonContainerLayout$Companion;", "", "()V", "DURATION_PADDING_UPDATE_ANIMATOR", "", "TAG", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.widget.layout.CommonContainerLayout$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/ss/lark/android/passport/biz/widget/layout/CommonContainerLayout$onImeChangedExtraHeightProvider$1", "Lcom/ss/lark/android/passport/biz/widget/layout/OnImeChangedExtraHeightProvider;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.widget.layout.CommonContainerLayout$i */
    public static final class C65311i implements AbstractC65313b {
        @Override // com.ss.lark.android.passport.biz.widget.layout.AbstractC65313b
        /* renamed from: a */
        public /* synthetic */ int mo223941a() {
            return AbstractC65313b.CC.$default$a(this);
        }

        @Override // com.ss.lark.android.passport.biz.widget.layout.AbstractC65313b
        /* renamed from: b */
        public /* synthetic */ int mo223942b() {
            return AbstractC65313b.CC.$default$b(this);
        }

        @Override // com.ss.lark.android.passport.biz.widget.layout.AbstractC65313b
        /* renamed from: c */
        public /* synthetic */ int mo223943c() {
            return AbstractC65313b.CC.$default$c(this);
        }

        C65311i() {
        }
    }

    public final LinearLayout getContentContainer() {
        return this.f164439i;
    }

    public final BlockedNestedScrollView getContentScrollView() {
        return this.f164441k;
    }

    public final LinearLayout getFooterContainer() {
        return this.f164440j;
    }

    public final LinearLayout getHeaderContainer() {
        return this.f164438h;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> */
    public final Function1<Integer, Unit> getOnContentScrollListener() {
        return this.f164442l;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.o<? super android.view.View, ? super java.lang.Boolean, ? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.o<android.view.View, java.lang.Boolean, java.lang.Integer, kotlin.Unit> */
    public final Function3<View, Boolean, Integer, Unit> getOnImeChangeHandler() {
        return this.f164443m;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> */
    public final Function1<Boolean, Unit> getOnImeChangedEndListener() {
        return this.f164444n;
    }

    public final AbstractC65313b getOnImeChangedExtraHeightProvider() {
        return this.f164445o;
    }

    public final LinearLayout getTitleBarContainer() {
        return this.f164437g;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/Lifecycle;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.widget.layout.CommonContainerLayout$e */
    static final class C65307e extends Lambda implements Function0<Lifecycle> {
        final /* synthetic */ CommonContainerLayout this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65307e(CommonContainerLayout commonContainerLayout) {
            super(0);
            this.this$0 = commonContainerLayout;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Lifecycle invoke() {
            CommonContainerLayout commonContainerLayout = this.this$0;
            return C49173f.m193887a(commonContainerLayout, commonContainerLayout);
        }
    }

    /* renamed from: b */
    private final void m256235b() {
        this.f164441k.setOnScrollChangeListener(new C65309g(this));
    }

    /* renamed from: c */
    private final void m256236c() {
        ImeObserver.f123492d.mo171702a(this).f123495c.mo5923a(this, new C65308f(this));
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f164436f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C49173f.m193889a(this, 0, 0, 0, 0, 7, null);
    }

    /* renamed from: a */
    public final void mo224659a() {
        int i = 0;
        if (C49173f.m193891c(this)) {
            m256236c();
            setFitsSystemWindows(false);
            this.f164435e.setBackgroundColor(0);
            View view = this.f164435e;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C49154ag.m193841d(getContext());
                int i2 = layoutParams.height;
                view.setLayoutParams(layoutParams);
                i = i2;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        View findViewById = findViewById(R.id.signin_sdk_widget_space_title_bar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "space");
        ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = this.f164437g.getHeight() + i;
            findViewById.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void setOnContentScrollListener(Function1<? super Integer, Unit> function1) {
        this.f164442l = function1;
    }

    public final void setOnImeChangedEndListener(Function1<? super Boolean, Unit> function1) {
        this.f164444n = function1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"com/ss/android/lark/passport/infra/util/ext/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", "view", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.widget.layout.CommonContainerLayout$a */
    public static final class View$OnLayoutChangeListenerC65304a implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ CommonContainerLayout f164446a;

        public View$OnLayoutChangeListenerC65304a(CommonContainerLayout commonContainerLayout) {
            this.f164446a = commonContainerLayout;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f164446a.mo224659a();
        }
    }

    public final void setOnImeChangeHandler(Function3<? super View, ? super Boolean, ? super Integer, Unit> oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "<set-?>");
        this.f164443m = oVar;
    }

    public final void setOnImeChangedExtraHeightProvider(AbstractC65313b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "<set-?>");
        this.f164445o = bVar;
    }

    /* renamed from: a */
    public final void mo224660a(int i) {
        View.inflate(getContext(), i, this.f164439i);
    }

    public final void setContentScrollable(boolean z) {
        if (z) {
            this.f164441k.mo114050a();
        } else {
            this.f164441k.mo114057b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/widget/layout/CommonContainerLayout$handleImeChanged$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.widget.layout.CommonContainerLayout$d */
    public static final class C65306d implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ CommonContainerLayout f164449a;

        /* renamed from: b */
        final /* synthetic */ boolean f164450b;

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onAnimationCancel(Animator animator) {
            Function1<Boolean, Unit> onImeChangedEndListener = this.f164449a.getOnImeChangedEndListener();
            if (onImeChangedEndListener != null) {
                onImeChangedEndListener.invoke(Boolean.valueOf(this.f164450b));
            }
        }

        public void onAnimationEnd(Animator animator) {
            Function1<Boolean, Unit> onImeChangedEndListener = this.f164449a.getOnImeChangedEndListener();
            if (onImeChangedEndListener != null) {
                onImeChangedEndListener.invoke(Boolean.valueOf(this.f164450b));
            }
        }

        C65306d(CommonContainerLayout commonContainerLayout, boolean z) {
            this.f164449a = commonContainerLayout;
            this.f164450b = z;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/passport/infra/util/ImeObserver$ImeInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.widget.layout.CommonContainerLayout$f */
    public static final class C65308f<T> implements AbstractC1178x<ImeObserver.ImeInfo> {

        /* renamed from: a */
        final /* synthetic */ CommonContainerLayout f164451a;

        C65308f(CommonContainerLayout commonContainerLayout) {
            this.f164451a = commonContainerLayout;
        }

        /* renamed from: a */
        public final void onChanged(ImeObserver.ImeInfo bVar) {
            this.f164451a.getOnImeChangeHandler().invoke(this.f164451a.findFocus(), Boolean.valueOf(bVar.f123499a), Integer.valueOf(bVar.f123500b));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.widget.layout.CommonContainerLayout$c */
    public static final class C65305c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ CommonContainerLayout f164447a;

        /* renamed from: b */
        final /* synthetic */ View f164448b;

        C65305c(CommonContainerLayout commonContainerLayout, View view) {
            this.f164447a = commonContainerLayout;
            this.f164448b = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f164448b != null) {
                this.f164447a.getFooterContainer().getLocationOnScreen(this.f164447a.f164433b);
                int a = this.f164447a.mo224658a(this.f164448b) - this.f164447a.f164433b[1];
                if (a > 0) {
                    this.f164447a.getContentScrollView().scrollBy(0, a);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.widget.layout.CommonContainerLayout$j */
    public static final class C65312j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f164453a;

        C65312j(View view) {
            this.f164453a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f164453a;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                C49173f.m193889a(view, 0, 0, 0, ((Integer) animatedValue).intValue(), 7, null);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: a */
    public final int mo224658a(View view) {
        boolean z;
        int i = 0;
        if (view != null) {
            if (view.getVisibility() == 8) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                view.getLocationOnScreen(this.f164433b);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    i = marginLayoutParams.bottomMargin;
                }
                return this.f164433b[1] + view.getHeight() + i;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private final ValueAnimator m256234a(View view, int i) {
        ValueAnimator valueAnimator = this.f164436f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(getPaddingBottom(), i);
        this.f164436f = ofInt;
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "animator");
        ofInt.setDuration(160L);
        ofInt.addUpdateListener(new C65312j(view));
        ofInt.start();
        return ofInt;
    }

    /* renamed from: a */
    private final int m256233a(boolean z, int i) {
        int c;
        boolean z2;
        if (!z) {
            return 0;
        }
        View view = null;
        Iterator<View> a = C49170e.m193882b(this.f164439i).mo4717a();
        while (a.hasNext()) {
            View next = a.next();
            if (next.getVisibility() == 8) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                view = next;
            }
        }
        View view2 = view;
        if (view2 == null) {
            return i;
        }
        int a2 = mo224658a(view2);
        if (a2 < (getHeight() - i) - this.f164440j.getHeight()) {
            c = this.f164445o.mo223941a();
        } else if (a2 < getHeight() - i) {
            i = (getHeight() - a2) - this.f164440j.getHeight();
            c = this.f164445o.mo223942b();
        } else {
            i -= this.f164440j.getHeight();
            c = this.f164445o.mo223943c();
        }
        return i + c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u00110\u000b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f¢\u0006\u0002\b\r"}, d2 = {"<anonymous>", "", "p1", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "focusedView", "p2", "", "imeShowing", "p3", "", "imeHeight", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.widget.layout.CommonContainerLayout$h */
    static final /* synthetic */ class C65310h extends FunctionReference implements Function3<View, Boolean, Integer, Unit> {
        C65310h(CommonContainerLayout commonContainerLayout) {
            super(3, commonContainerLayout);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "onImeChanged";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(CommonContainerLayout.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "onImeChanged(Landroid/view/View;ZI)V";
        }

        public final void invoke(View view, boolean z, int i) {
            ((CommonContainerLayout) this.receiver).mo224661a(view, z, i);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Unit invoke(View view, Boolean bool, Integer num) {
            invoke(view, bool.booleanValue(), num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final void mo224661a(View view, boolean z, int i) {
        setContentScrollable(!z);
        mo224662b(view, z, i);
    }

    /* renamed from: b */
    public final void mo224662b(View view, boolean z, int i) {
        ValueAnimator a = m256234a(this, m256233a(z, i));
        a.addUpdateListener(new C65305c(this, view));
        a.addListener(new C65306d(this, z));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f164434d = LazyKt.lazy(new C65307e(this));
        this.f164433b = new int[2];
        this.f164443m = new C65310h(this);
        this.f164445o = new C65311i();
        View.inflate(context, R.layout.signin_sdk_common_layout_root_merge, this);
        View findViewById = findViewById(R.id.signin_sdk_widget_header_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.signin…_widget_header_container)");
        this.f164438h = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.signin_sdk_widget_scrollable_content_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.signin…llable_content_container)");
        this.f164441k = (BlockedNestedScrollView) findViewById2;
        View findViewById3 = findViewById(R.id.signin_sdk_widget_content_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.signin…widget_content_container)");
        this.f164439i = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(R.id.signin_sdk_widget_footer_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.signin…_widget_footer_container)");
        this.f164440j = (LinearLayout) findViewById4;
        View findViewById5 = findViewById(R.id.signin_sdk_widget_space_status_bar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.signin…_widget_space_status_bar)");
        this.f164435e = findViewById5;
        View findViewById6 = findViewById(R.id.signin_sdk_widget_title_bar_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById(R.id.signin…dget_title_bar_container)");
        this.f164437g = (LinearLayout) findViewById6;
        View findViewById7 = findViewById(R.id.signin_sdk_widget_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "findViewById(R.id.signin_sdk_widget_title)");
        this.f164432a = (TextView) findViewById7;
        m256235b();
        addOnLayoutChangeListener(new View$OnLayoutChangeListenerC65304a(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/core/widget/NestedScrollView;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "<anonymous parameter 4>", "onScrollChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.widget.layout.CommonContainerLayout$g */
    public static final class C65309g implements NestedScrollView.AbstractC0934b {

        /* renamed from: a */
        final /* synthetic */ CommonContainerLayout f164452a;

        C65309g(CommonContainerLayout commonContainerLayout) {
            this.f164452a = commonContainerLayout;
        }

        @Override // androidx.core.widget.NestedScrollView.AbstractC0934b
        /* renamed from: a */
        public final void mo742a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            CommonContainerLayout commonContainerLayout = this.f164452a;
            int a = commonContainerLayout.mo224658a(commonContainerLayout.getTitleBarContainer());
            this.f164452a.f164432a.getLocationOnScreen(this.f164452a.f164433b);
            int i5 = this.f164452a.f164433b[1];
            Function1<Integer, Unit> onContentScrollListener = this.f164452a.getOnContentScrollListener();
            if (onContentScrollListener != null) {
                onContentScrollListener.invoke(Integer.valueOf(i5 - a));
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommonContainerLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
