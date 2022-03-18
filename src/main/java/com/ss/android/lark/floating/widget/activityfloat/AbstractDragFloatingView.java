package com.ss.android.lark.floating.widget.activityfloat;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.floating.anim.AnimatorManager;
import com.ss.android.lark.floating.data.FloatConfig;
import com.ss.android.lark.floating.interfaces.FloatCallbacks;
import com.ss.android.lark.floating.interfaces.OnFloatCallbacks;
import com.ss.android.lark.floating.p1896c.AbstractC38339g;
import com.ss.android.lark.log.Log;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010 \u001a\u00020!H\u0002J\r\u0010\"\u001a\u00020!H\u0000¢\u0006\u0002\b#J\u000f\u0010$\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020!H\u0002J\b\u0010'\u001a\u00020!H\u0002J\u0010\u0010(\u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u0003H\u0004J\b\u0010)\u001a\u00020!H\u0014J\u0012\u0010*\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J0\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0015J\u0012\u00103\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u00104\u001a\u00020!2\u0006\u00105\u001a\u000206H&J\b\u00107\u001a\u00020!H\u0002J$\u00108\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:092\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:H\u0002J\b\u0010=\u001a\u00020!H\u0002J\u0010\u0010>\u001a\u00020!2\u0006\u0010+\u001a\u00020,H\u0002R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/ss/android/lark/floating/widget/activityfloat/AbstractDragFloatingView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bottomDistance", "config", "Lcom/ss/android/lark/floating/data/FloatConfig;", "getConfig", "()Lcom/ss/android/lark/floating/data/FloatConfig;", "setConfig", "(Lcom/ss/android/lark/floating/data/FloatConfig;)V", "floatRect", "Landroid/graphics/Rect;", "isCreated", "", "lastX", "lastY", "leftDistance", "minX", "minY", "parentHeight", "parentRect", "parentView", "Landroid/view/ViewGroup;", "parentWidth", "rightDistance", "topDistance", "enterAnim", "", "exitAnim", "exitAnim$float_release", "getLayoutId", "()Ljava/lang/Integer;", "initDistanceValue", "initParent", "initView", "onDetachedFromWindow", "onInterceptTouchEvent", "event", "Landroid/view/MotionEvent;", "onLayout", "changed", "l", "t", "r", C63954b.f161494a, "onTouchEvent", "renderView", "view", "Landroid/view/View;", "sideAnim", "sideForLatest", "Lkotlin/Pair;", "", "x", "y", "touchOver", "updateView", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
public abstract class AbstractDragFloatingView extends FrameLayout {

    /* renamed from: a */
    private FloatConfig f98499a;

    /* renamed from: b */
    private int f98500b;

    /* renamed from: c */
    private int f98501c;

    /* renamed from: d */
    private int f98502d;

    /* renamed from: e */
    private int f98503e;

    /* renamed from: f */
    private int f98504f;

    /* renamed from: g */
    private int f98505g;

    /* renamed from: h */
    private int f98506h;

    /* renamed from: i */
    private int f98507i;

    /* renamed from: j */
    private int f98508j;

    /* renamed from: k */
    private int f98509k;

    /* renamed from: l */
    private Rect f98510l = new Rect();

    /* renamed from: m */
    private Rect f98511m = new Rect();

    /* renamed from: n */
    private ViewGroup f98512n;

    /* renamed from: o */
    private boolean f98513o;

    /* renamed from: a */
    public abstract void mo140273a(View view);

    public abstract Integer getLayoutId();

    public final FloatConfig getConfig() {
        return this.f98499a;
    }

    /* renamed from: c */
    private final void m150972c() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.f98512n = viewGroup;
            this.f98500b = viewGroup.getHeight();
            this.f98501c = viewGroup.getWidth();
            viewGroup.getGlobalVisibleRect(this.f98510l);
            Log.m165382e("parentRect: " + this.f98510l);
        }
    }

    /* renamed from: f */
    private final void m150975f() {
        ViewGroup viewGroup = this.f98512n;
        if (viewGroup != null) {
            Animator a = new AnimatorManager(this.f98499a.mo140221z(), this, viewGroup, this.f98499a.mo140203i()).mo140157a();
            if (a != null) {
                a.addListener(new C38343a(this));
            }
            if (a != null) {
                a.start();
            }
        }
    }

    /* renamed from: b */
    public final void mo140274b() {
        ViewGroup viewGroup;
        if (!this.f98499a.mo140183a() && (viewGroup = this.f98512n) != null) {
            AbstractDragFloatingView abstractDragFloatingView = this;
            Animator b = new AnimatorManager(this.f98499a.mo140221z(), abstractDragFloatingView, viewGroup, this.f98499a.mo140203i()).mo140158b();
            if (b == null) {
                viewGroup.removeView(abstractDragFloatingView);
                return;
            }
            b.addListener(new C38344b(viewGroup, this));
            b.start();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        FloatCallbacks.Builder a;
        Function0<Unit> d;
        super.onDetachedFromWindow();
        OnFloatCallbacks x = this.f98499a.mo140219x();
        if (x != null) {
            x.mo140241a();
        }
        FloatCallbacks y = this.f98499a.mo140220y();
        if (y != null && (a = y.mo140225a()) != null && (d = a.mo140236d()) != null) {
            d.invoke();
        }
    }

    /* renamed from: e */
    private final void m150974e() {
        getGlobalVisibleRect(this.f98511m);
        this.f98504f = this.f98511m.left - this.f98510l.left;
        this.f98505g = this.f98510l.right - this.f98511m.right;
        this.f98506h = this.f98511m.top - this.f98510l.top;
        this.f98507i = this.f98510l.bottom - this.f98511m.bottom;
        this.f98508j = Math.min(this.f98504f, this.f98505g);
        this.f98509k = Math.min(this.f98506h, this.f98507i);
        Log.m165388i(this.f98504f + "   " + this.f98505g + "   " + this.f98506h + "   " + this.f98507i);
    }

    /* renamed from: a */
    public final void mo140271a() {
        FloatCallbacks.Builder a;
        Function1<View, Unit> g;
        this.f98499a.mo140182a(false);
        this.f98499a.mo140190c(false);
        OnFloatCallbacks x = this.f98499a.mo140219x();
        if (x != null) {
            x.mo140247c(this);
        }
        FloatCallbacks y = this.f98499a.mo140220y();
        if (y != null && (a = y.mo140225a()) != null && (g = a.mo140239g()) != null) {
            g.invoke(this);
        }
    }

    /* renamed from: d */
    private final void m150973d() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        m150974e();
        int i = C38346a.f98521c[this.f98499a.mo140203i().ordinal()];
        float f8 = BitmapDescriptorFactory.HUE_RED;
        String str = "translationY";
        switch (i) {
            case 1:
                f2 = getTranslationX();
                f5 = (float) (-this.f98504f);
                f4 = getTranslationX();
                f3 = f5 + f4;
                str = "translationX";
                f8 = f3;
                f = f2;
                break;
            case 2:
                f2 = getTranslationX();
                f5 = (float) this.f98505g;
                f4 = getTranslationX();
                f3 = f5 + f4;
                str = "translationX";
                f8 = f3;
                f = f2;
                break;
            case 3:
                f2 = getTranslationX();
                int i2 = this.f98504f;
                int i3 = this.f98505g;
                if (i2 < i3) {
                    f5 = (float) (-i2);
                } else {
                    f5 = (float) i3;
                }
                f4 = getTranslationX();
                f3 = f5 + f4;
                str = "translationX";
                f8 = f3;
                f = f2;
                break;
            case 4:
                f2 = getTranslationY();
                f7 = (float) (-this.f98506h);
                f6 = getTranslationY();
                f3 = f7 + f6;
                f8 = f3;
                f = f2;
                break;
            case 5:
                f2 = getTranslationY();
                f7 = (float) this.f98507i;
                f6 = getTranslationY();
                f3 = f7 + f6;
                f8 = f3;
                f = f2;
                break;
            case 6:
                f2 = getTranslationY();
                int i4 = this.f98506h;
                int i5 = this.f98507i;
                if (i4 < i5) {
                    f7 = (float) (-i4);
                } else {
                    f7 = (float) i5;
                }
                f6 = getTranslationY();
                f3 = f7 + f6;
                f8 = f3;
                f = f2;
                break;
            case 7:
                if (this.f98508j < this.f98509k) {
                    f2 = getTranslationX();
                    int i6 = this.f98504f;
                    int i7 = this.f98505g;
                    if (i6 < i7) {
                        f5 = (float) (-i6);
                    } else {
                        f5 = (float) i7;
                    }
                    f4 = getTranslationX();
                    f3 = f5 + f4;
                    str = "translationX";
                    f8 = f3;
                    f = f2;
                    break;
                } else {
                    f2 = getTranslationY();
                    int i8 = this.f98506h;
                    int i9 = this.f98507i;
                    if (i8 < i9) {
                        f7 = (float) (-i8);
                    } else {
                        f7 = (float) i9;
                    }
                    f6 = getTranslationY();
                    f3 = f7 + f6;
                    f8 = f3;
                    f = f2;
                }
            default:
                str = "translationX";
                f = BitmapDescriptorFactory.HUE_RED;
                break;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, str, f, f8);
        ofFloat.addListener(new C38345c(this));
        ofFloat.start();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/floating/widget/activityfloat/AbstractDragFloatingView$enterAnim$1$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.widget.activityfloat.AbstractDragFloatingView$a */
    public static final class C38343a implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ AbstractDragFloatingView f98515a;

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        C38343a(AbstractDragFloatingView abstractDragFloatingView) {
            this.f98515a = abstractDragFloatingView;
        }

        public void onAnimationEnd(Animator animator) {
            this.f98515a.getConfig().mo140182a(false);
        }

        public void onAnimationStart(Animator animator) {
            this.f98515a.getConfig().mo140182a(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/floating/widget/activityfloat/AbstractDragFloatingView$sideAnim$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.widget.activityfloat.AbstractDragFloatingView$c */
    public static final class C38345c implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ AbstractDragFloatingView f98518a;

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38345c(AbstractDragFloatingView abstractDragFloatingView) {
            this.f98518a = abstractDragFloatingView;
        }

        public void onAnimationEnd(Animator animator) {
            this.f98518a.mo140271a();
        }

        public void onAnimationStart(Animator animator) {
            this.f98518a.getConfig().mo140182a(true);
        }
    }

    public final void setConfig(FloatConfig aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        this.f98499a = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/floating/widget/activityfloat/AbstractDragFloatingView$exitAnim$1$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.widget.activityfloat.AbstractDragFloatingView$b */
    public static final class C38344b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f98516a;

        /* renamed from: b */
        final /* synthetic */ AbstractDragFloatingView f98517b;

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            this.f98517b.getConfig().mo140182a(true);
        }

        public void onAnimationEnd(Animator animator) {
            this.f98517b.getConfig().mo140182a(false);
            this.f98516a.removeView(this.f98517b);
        }

        C38344b(ViewGroup viewGroup, AbstractDragFloatingView abstractDragFloatingView) {
            this.f98516a = viewGroup;
            this.f98517b = abstractDragFloatingView;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            m150971a(motionEvent);
        }
        if (this.f98499a.mo140197f() || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            m150971a(motionEvent);
        }
        if (this.f98499a.mo140197f() || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo140272a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Integer layoutId = getLayoutId();
        if (layoutId != null) {
            View inflate = LayoutInflater.from(context).inflate(layoutId.intValue(), this);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(context).inflate(it, this)");
            mo140273a(inflate);
            AbstractC38339g w = this.f98499a.mo140218w();
            if (w != null) {
                w.mo140249a(this);
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private final void m150971a(MotionEvent motionEvent) {
        FloatCallbacks.Builder a;
        Function2<View, MotionEvent, Unit> f;
        FloatCallbacks.Builder a2;
        Function2<View, MotionEvent, Unit> e;
        OnFloatCallbacks x = this.f98499a.mo140219x();
        if (x != null) {
            x.mo140243a(this, motionEvent);
        }
        FloatCallbacks y = this.f98499a.mo140220y();
        if (!(y == null || (a2 = y.mo140225a()) == null || (e = a2.mo140237e()) == null)) {
            e.invoke(this, motionEvent);
        }
        if (!this.f98499a.mo140194e() || this.f98499a.mo140183a()) {
            this.f98499a.mo140190c(false);
            setPressed(true);
            return;
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f98499a.mo140190c(false);
            setPressed(true);
            this.f98502d = rawX;
            this.f98503e = rawY;
            getParent().requestDisallowInterceptTouchEvent(true);
            m150972c();
        } else if (action == 1) {
            setPressed(!this.f98499a.mo140197f());
            if (this.f98499a.mo140197f()) {
                switch (C38346a.f98520b[this.f98499a.mo140203i().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        m150973d();
                        return;
                    default:
                        mo140271a();
                        return;
                }
            }
        } else if (action == 2 && this.f98500b > 0 && this.f98501c > 0) {
            int i = rawX - this.f98502d;
            int i2 = rawY - this.f98503e;
            if (this.f98499a.mo140197f() || (i * i) + (i2 * i2) >= 81) {
                this.f98499a.mo140190c(true);
                float x2 = getX() + ((float) i);
                float y2 = getY() + ((float) i2);
                float f2 = (float) 0;
                float f3 = BitmapDescriptorFactory.HUE_RED;
                if (x2 < f2) {
                    x2 = BitmapDescriptorFactory.HUE_RED;
                } else if (x2 > ((float) (this.f98501c - getWidth()))) {
                    x2 = ((float) this.f98501c) - ((float) getWidth());
                }
                if (y2 < f2) {
                    y2 = BitmapDescriptorFactory.HUE_RED;
                } else if (y2 > ((float) (this.f98500b - getHeight()))) {
                    y2 = ((float) this.f98500b) - ((float) getHeight());
                }
                switch (C38346a.f98519a[this.f98499a.mo140203i().ordinal()]) {
                    case 1:
                        break;
                    case 2:
                        f3 = ((float) this.f98510l.right) - ((float) getWidth());
                        break;
                    case 3:
                        f3 = x2;
                        y2 = BitmapDescriptorFactory.HUE_RED;
                        break;
                    case 4:
                        f3 = ((float) this.f98510l.bottom) - ((float) getHeight());
                        y2 = f3;
                        f3 = x2;
                        break;
                    case 5:
                        if ((rawX * 2) - this.f98510l.left > this.f98510l.right) {
                            f3 = ((float) this.f98510l.right) - ((float) getWidth());
                            break;
                        }
                        break;
                    case 6:
                        if (rawY - this.f98510l.top > this.f98510l.bottom - rawY) {
                            f3 = ((float) this.f98510l.bottom) - ((float) getHeight());
                        }
                        y2 = f3;
                        f3 = x2;
                        break;
                    case 7:
                        this.f98504f = rawX - this.f98510l.left;
                        this.f98505g = this.f98510l.right - rawX;
                        this.f98506h = rawY - this.f98510l.top;
                        this.f98507i = this.f98510l.bottom - rawY;
                        this.f98508j = Math.min(this.f98504f, this.f98505g);
                        this.f98509k = Math.min(this.f98506h, this.f98507i);
                        Pair<Float, Float> a3 = m150970a(x2, y2);
                        f3 = a3.getFirst().floatValue();
                        y2 = a3.getSecond().floatValue();
                        break;
                    default:
                        f3 = x2;
                        break;
                }
                setX(f3);
                setY(y2);
                this.f98502d = rawX;
                this.f98503e = rawY;
                OnFloatCallbacks x3 = this.f98499a.mo140219x();
                if (x3 != null) {
                    x3.mo140246b(this, motionEvent);
                }
                FloatCallbacks y3 = this.f98499a.mo140220y();
                if (y3 != null && (a = y3.mo140225a()) != null && (f = a.mo140238f()) != null) {
                    f.invoke(this, motionEvent);
                }
            }
        }
    }

    /* renamed from: a */
    private final Pair<Float, Float> m150970a(float f, float f2) {
        int i = this.f98508j;
        int i2 = this.f98509k;
        if (i < i2) {
            if (this.f98504f == i) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = ((float) this.f98501c) - ((float) getWidth());
            }
        } else if (this.f98506h == i2) {
            f2 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f2 = ((float) this.f98500b) - ((float) getHeight());
        }
        return new Pair<>(Float.valueOf(f), Float.valueOf(f2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractDragFloatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        new FrameLayout(context, attributeSet, i);
        this.f98499a = new FloatConfig(null, null, null, null, false, false, false, false, false, null, null, false, false, false, BitmapDescriptorFactory.HUE_RED, false, false, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, -1, null);
        mo140272a(context);
        setOnClickListener(View$OnClickListenerC383421.f98514a);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f98513o) {
            this.f98513o = true;
            if (true ^ Intrinsics.areEqual(this.f98499a.mo140216u(), new Pair(0, 0))) {
                setX((float) this.f98499a.mo140216u().getFirst().intValue());
                setY((float) this.f98499a.mo140216u().getSecond().intValue());
            } else {
                setX(getX() + this.f98499a.mo140212r().getFirst().floatValue());
                setY(getY() + this.f98499a.mo140212r().getSecond().floatValue());
            }
            m150972c();
            m150974e();
            m150975f();
        }
    }
}
