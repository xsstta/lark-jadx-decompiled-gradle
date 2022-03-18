package com.ss.android.lark.floating.widget.appfloat;

import android.animation.Animator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.ss.android.lark.floating.data.FloatConfig;
import com.ss.android.lark.floating.interfaces.FloatCallbacks;
import com.ss.android.lark.floating.interfaces.OnFloatCallbacks;
import com.ss.android.lark.floating.utils.DisplayUtils;
import com.ss.android.lark.floating.widget.appfloat.AppFloatManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bJ\u001e\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\bJ\u0018\u0010(\u001a\u00020\b2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\bH\u0002J:\u0010)\u001a\u0004\u0018\u00010\u001e2\u0006\u0010%\u001a\u00020&2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020-2\u0006\u0010#\u001a\u00020$2\b\u0010.\u001a\u0004\u0018\u00010/J8\u0010)\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020&2\u0006\u00101\u001a\u00020\b2\u0006\u0010,\u001a\u00020-2\u0006\u0010#\u001a\u00020$2\b\u0010.\u001a\u0004\u0018\u00010/J\u0010\u00102\u001a\u0002032\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u00104\u001a\u0002032\u0006\u0010%\u001a\u00020&2\u0006\u0010#\u001a\u00020$H\u0002J\u0006\u00105\u001a\u000203J=\u00106\u001a\u0002032\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\b2\u0006\u00107\u001a\u00020\b2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0000¢\u0006\u0002\b8J\u0010\u00109\u001a\u00020\b2\u0006\u0010#\u001a\u00020$H\u0002J>\u0010:\u001a\u0002032\u0006\u0010#\u001a\u00020$2\u0006\u0010;\u001a\u00020<2\u0006\u0010,\u001a\u00020-2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\b2\u0006\u00107\u001a\u00020\b2\u0006\u0010.\u001a\u00020/R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/ss/android/lark/floating/widget/appfloat/TouchUtils;", "", "context", "Landroid/content/Context;", "config", "Lcom/ss/android/lark/floating/data/FloatConfig;", "(Landroid/content/Context;Lcom/ss/android/lark/floating/data/FloatConfig;)V", "bottomDistance", "", "getConfig", "()Lcom/ss/android/lark/floating/data/FloatConfig;", "getContext", "()Landroid/content/Context;", "emptyHeight", "hasStatusBar", "", "lastX", "", "lastY", "leftDistance", "location", "", "minX", "minY", "parentHeight", "parentRect", "Landroid/graphics/Rect;", "parentWidth", "rightDistance", "runningAnimator", "Landroid/animation/Animator;", "topDistance", "addOffsetToTargetPosition", "oriPosition", "calculateEndX", "view", "Landroid/view/View;", "params", "Lcom/ss/android/lark/floating/widget/appfloat/WindowManagerLayoutParamsProxy;", "targetXOffset", "calculateEndXInternal", "doTransAnim", "endX", "endY", "windowManager", "Landroid/view/WindowManager;", "action", "Lcom/ss/android/lark/floating/widget/appfloat/AppFloatManager$IEvictDetector;", "isX", "end", "dragEnd", "", "initDistanceValue", "resetParentWidthAndHeight", "sideAnim", "targetYOffset", "sideAnim$float_release", "statusBarHeight", "updateFloat", "event", "Landroid/view/MotionEvent;", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.widget.appfloat.e */
public final class TouchUtils {

    /* renamed from: a */
    private Rect f98563a = new Rect();

    /* renamed from: b */
    private int f98564b;

    /* renamed from: c */
    private int f98565c;

    /* renamed from: d */
    private float f98566d;

    /* renamed from: e */
    private float f98567e;

    /* renamed from: f */
    private int f98568f;

    /* renamed from: g */
    private int f98569g;

    /* renamed from: h */
    private int f98570h;

    /* renamed from: i */
    private int f98571i;

    /* renamed from: j */
    private int f98572j;

    /* renamed from: k */
    private int f98573k;

    /* renamed from: l */
    private final int[] f98574l = new int[2];

    /* renamed from: m */
    private int f98575m;

    /* renamed from: n */
    private boolean f98576n = true;

    /* renamed from: o */
    private Animator f98577o;

    /* renamed from: p */
    private final Context f98578p;

    /* renamed from: q */
    private final FloatConfig f98579q;

    /* renamed from: b */
    public final FloatConfig mo140355b() {
        return this.f98579q;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo140353a(View view, MotionEvent motionEvent, WindowManager windowManager, WindowManagerLayoutParamsProxy gVar, int i, int i2, AppFloatManager.IEvictDetector bVar) {
        FloatCallbacks.Builder a;
        Function1<View, Unit> g;
        FloatCallbacks.Builder a2;
        Function2<View, MotionEvent, Unit> f;
        int i3;
        int width;
        int i4;
        int height;
        FloatCallbacks.Builder a3;
        Function2<View, MotionEvent, Unit> e;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        Intrinsics.checkParameterIsNotNull(windowManager, "windowManager");
        Intrinsics.checkParameterIsNotNull(gVar, "params");
        Intrinsics.checkParameterIsNotNull(bVar, "action");
        OnFloatCallbacks x = this.f98579q.mo140219x();
        if (x != null) {
            x.mo140243a(view, motionEvent);
        }
        FloatCallbacks y = this.f98579q.mo140220y();
        if (!(y == null || (a3 = y.mo140225a()) == null || (e = a3.mo140237e()) == null)) {
            e.invoke(view, motionEvent);
        }
        if (this.f98565c == 0) {
            this.f98565c = UIHelper.getWindowWidth(this.f98578p);
        }
        if (this.f98564b == 0) {
            this.f98564b = this.f98579q.mo140168B().mo140240a(this.f98578p);
        }
        view.getLocationOnScreen(this.f98574l);
        int i5 = 0;
        this.f98576n = this.f98574l[1] > gVar.mo140373c();
        this.f98575m = this.f98564b - view.getHeight();
        if (!this.f98579q.mo140194e() || this.f98579q.mo140183a()) {
            this.f98579q.mo140190c(false);
            this.f98566d = motionEvent.getRawX();
            this.f98567e = motionEvent.getRawY();
            return;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f98579q.mo140190c(false);
            this.f98566d = motionEvent.getRawX();
            this.f98567e = motionEvent.getRawY();
        } else if (action != 1) {
            if (action == 2) {
                float rawX = motionEvent.getRawX() - this.f98566d;
                float rawY = motionEvent.getRawY() - this.f98567e;
                if (this.f98579q.mo140197f() || (rawX * rawX) + (rawY * rawY) >= ((float) 81)) {
                    this.f98579q.mo140190c(true);
                    int b = gVar.mo140371b() + ((int) rawX);
                    int c = gVar.mo140373c() + ((int) rawY);
                    if (b < 0) {
                        b = 0;
                    } else if (b > this.f98565c - view.getWidth()) {
                        b = this.f98565c - view.getWidth();
                    }
                    if (c < 0) {
                        c = 0;
                    } else if (c > this.f98575m - m151029b(view)) {
                        if (this.f98576n) {
                            c = this.f98575m - m151029b(view);
                        } else {
                            int i6 = this.f98575m;
                            if (c > i6) {
                                c = i6;
                            }
                        }
                    }
                    switch (C38362f.f98596a[this.f98579q.mo140203i().ordinal()]) {
                        case 1:
                            break;
                        case 2:
                            i5 = this.f98565c - view.getWidth();
                            break;
                        case 3:
                            i5 = b;
                            c = 0;
                            break;
                        case 4:
                            i5 = this.f98564b - view.getHeight();
                            c = i5;
                            i5 = b;
                            break;
                        case 5:
                            float rawX2 = motionEvent.getRawX() * ((float) 2);
                            i3 = this.f98565c;
                            if (rawX2 > ((float) i3)) {
                                width = view.getWidth();
                                i5 = i3 - width;
                                break;
                            }
                            break;
                        case 6:
                            float rawY2 = (motionEvent.getRawY() - ((float) this.f98563a.top)) * ((float) 2);
                            i4 = this.f98564b;
                            if (rawY2 > ((float) i4)) {
                                height = view.getHeight();
                                i5 = i4 - height;
                            }
                            c = i5;
                            i5 = b;
                            break;
                        case 7:
                            this.f98568f = (int) motionEvent.getRawX();
                            this.f98569g = this.f98565c - ((int) motionEvent.getRawX());
                            this.f98570h = ((int) motionEvent.getRawY()) - this.f98563a.top;
                            this.f98571i = (this.f98564b + this.f98563a.top) - ((int) motionEvent.getRawY());
                            this.f98572j = Math.min(this.f98568f, this.f98569g);
                            int min = Math.min(this.f98570h, this.f98571i);
                            this.f98573k = min;
                            int i7 = this.f98572j;
                            if (i7 < min) {
                                if (this.f98568f != i7) {
                                    i3 = this.f98565c;
                                    width = view.getWidth();
                                    i5 = i3 - width;
                                    break;
                                }
                            } else {
                                if (this.f98570h != min) {
                                    i4 = this.f98564b;
                                    height = view.getHeight();
                                    i5 = i4 - height;
                                }
                                c = i5;
                                i5 = b;
                                break;
                            }
                            break;
                        default:
                            i5 = b;
                            break;
                    }
                    gVar.mo140379g(i5);
                    gVar.mo140380h(c);
                    windowManager.updateViewLayout(view, gVar.mo140375d());
                    OnFloatCallbacks x2 = this.f98579q.mo140219x();
                    if (x2 != null) {
                        x2.mo140246b(view, motionEvent);
                    }
                    FloatCallbacks y2 = this.f98579q.mo140220y();
                    if (!(y2 == null || (a2 = y2.mo140225a()) == null || (f = a2.mo140238f()) == null)) {
                        f.invoke(view, motionEvent);
                    }
                    this.f98566d = motionEvent.getRawX();
                    this.f98567e = motionEvent.getRawY();
                }
            }
        } else if (this.f98579q.mo140197f()) {
            switch (C38362f.f98597b[this.f98579q.mo140203i().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    mo140354a(view, gVar, i, i2, windowManager, bVar);
                    return;
                default:
                    OnFloatCallbacks x3 = this.f98579q.mo140219x();
                    if (x3 != null) {
                        x3.mo140247c(view);
                    }
                    FloatCallbacks y3 = this.f98579q.mo140220y();
                    if (y3 != null && (a = y3.mo140225a()) != null && (g = a.mo140239g()) != null) {
                        g.invoke(view);
                        return;
                    }
                    return;
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo140354a(View view, WindowManagerLayoutParamsProxy gVar, int i, int i2, WindowManager windowManager, AppFloatManager.IEvictDetector bVar) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(gVar, "params");
        Intrinsics.checkParameterIsNotNull(windowManager, "windowManager");
        Intrinsics.checkParameterIsNotNull(bVar, "action");
        m151028a(gVar, view);
        int i8 = 0;
        switch (C38362f.f98598c[this.f98579q.mo140203i().ordinal()]) {
            case 1:
                z = true;
                break;
            case 2:
                i4 = gVar.mo140371b();
                i3 = this.f98569g;
                i8 = i4 + i3;
                z = true;
                break;
            case 3:
                i8 = m151027a(gVar, i);
                z = true;
                break;
            case 4:
                z = false;
                break;
            case 5:
                if (this.f98576n) {
                    i7 = this.f98575m;
                    i6 = m151029b(view);
                    i5 = i7 - i6;
                    i8 = i5;
                    z = false;
                    break;
                } else {
                    i5 = this.f98575m;
                    i8 = i5;
                    z = false;
                }
            case 6:
                if (this.f98570h >= this.f98571i) {
                    if (this.f98576n) {
                        i7 = this.f98575m;
                        i6 = m151029b(view);
                        i5 = i7 - i6;
                        i8 = i5;
                    } else {
                        i5 = this.f98575m;
                        i8 = i5;
                    }
                }
                z = false;
                break;
            case 7:
                if (this.f98572j >= this.f98573k) {
                    if (this.f98570h < this.f98571i) {
                        i5 = 0;
                    } else if (this.f98576n) {
                        i7 = this.f98575m;
                        i6 = m151029b(view);
                        i5 = i7 - i6;
                    } else {
                        i5 = this.f98575m;
                    }
                    i8 = i5;
                    z = false;
                    break;
                } else {
                    if (this.f98568f >= this.f98569g) {
                        i4 = gVar.mo140371b();
                        i3 = this.f98569g;
                        i8 = i4 + i3;
                    }
                    z = true;
                    break;
                }
            default:
                return;
        }
        mo140350a(z, gVar, mo140347a(i8), windowManager, view, bVar);
    }

    /* renamed from: a */
    public final void mo140352a(View view) {
        FloatCallbacks.Builder a;
        Function1<View, Unit> g;
        this.f98579q.mo140182a(false);
        OnFloatCallbacks x = this.f98579q.mo140219x();
        if (x != null) {
            x.mo140247c(view);
        }
        FloatCallbacks y = this.f98579q.mo140220y();
        if (y != null && (a = y.mo140225a()) != null && (g = a.mo140239g()) != null) {
            g.invoke(view);
        }
    }

    /* renamed from: a */
    public final void mo140351a() {
        this.f98565c = UIHelper.getWindowWidth(this.f98578p);
        this.f98564b = this.f98579q.mo140168B().mo140240a(this.f98578p);
    }

    /* renamed from: b */
    private final int m151029b(View view) {
        return DisplayUtils.f98497a.mo140264a(view);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/floating/widget/appfloat/TouchUtils$doTransAnim$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.widget.appfloat.e$b */
    public static final class C38358b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ TouchUtils f98585a;

        /* renamed from: b */
        final /* synthetic */ View f98586b;

        /* renamed from: c */
        final /* synthetic */ AppFloatManager.IEvictDetector f98587c;

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationCancel(Animator animator) {
            this.f98585a.mo140352a(this.f98586b);
            AppFloatManager.IEvictDetector bVar = this.f98587c;
            if (bVar != null) {
                bVar.mo140315a();
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f98585a.mo140352a(this.f98586b);
            AppFloatManager.IEvictDetector bVar = this.f98587c;
            if (bVar != null) {
                bVar.mo140315a();
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f98585a.mo140355b().mo140182a(true);
        }

        C38358b(TouchUtils eVar, View view, AppFloatManager.IEvictDetector bVar) {
            this.f98585a = eVar;
            this.f98586b = view;
            this.f98587c = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/floating/widget/appfloat/TouchUtils$doTransAnim$4", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.widget.appfloat.e$d */
    public static final class C38360d implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ TouchUtils f98592a;

        /* renamed from: b */
        final /* synthetic */ View f98593b;

        /* renamed from: c */
        final /* synthetic */ AppFloatManager.IEvictDetector f98594c;

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationCancel(Animator animator) {
            this.f98592a.mo140352a(this.f98593b);
            AppFloatManager.IEvictDetector bVar = this.f98594c;
            if (bVar != null) {
                bVar.mo140315a();
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f98592a.mo140352a(this.f98593b);
            AppFloatManager.IEvictDetector bVar = this.f98594c;
            if (bVar != null) {
                bVar.mo140315a();
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f98592a.mo140355b().mo140182a(true);
        }

        C38360d(TouchUtils eVar, View view, AppFloatManager.IEvictDetector bVar) {
            this.f98592a = eVar;
            this.f98593b = view;
            this.f98594c = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.widget.appfloat.e$c */
    public static final class C38359c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ WindowManagerLayoutParamsProxy f98588a;

        /* renamed from: b */
        final /* synthetic */ WindowManager f98589b;

        /* renamed from: c */
        final /* synthetic */ View f98590c;

        /* renamed from: d */
        final /* synthetic */ ValueAnimator f98591d;

        C38359c(WindowManagerLayoutParamsProxy gVar, WindowManager windowManager, View view, ValueAnimator valueAnimator) {
            this.f98588a = gVar;
            this.f98589b = windowManager;
            this.f98590c = view;
            this.f98591d = valueAnimator;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            try {
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    Point point = (Point) animatedValue;
                    this.f98588a.mo140379g(point.x);
                    this.f98588a.mo140380h(point.y);
                    this.f98589b.updateViewLayout(this.f98590c, this.f98588a.mo140375d());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.graphics.Point");
            } catch (Exception unused) {
                this.f98591d.cancel();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.widget.appfloat.e$a */
    public static final class C38357a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ boolean f98580a;

        /* renamed from: b */
        final /* synthetic */ WindowManagerLayoutParamsProxy f98581b;

        /* renamed from: c */
        final /* synthetic */ WindowManager f98582c;

        /* renamed from: d */
        final /* synthetic */ View f98583d;

        /* renamed from: e */
        final /* synthetic */ ValueAnimator f98584e;

        C38357a(boolean z, WindowManagerLayoutParamsProxy gVar, WindowManager windowManager, View view, ValueAnimator valueAnimator) {
            this.f98580a = z;
            this.f98581b = gVar;
            this.f98582c = windowManager;
            this.f98583d = view;
            this.f98584e = valueAnimator;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            try {
                if (this.f98580a) {
                    WindowManagerLayoutParamsProxy gVar = this.f98581b;
                    Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        gVar.mo140379g(((Integer) animatedValue).intValue());
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                    }
                } else {
                    WindowManagerLayoutParamsProxy gVar2 = this.f98581b;
                    Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    if (animatedValue2 != null) {
                        gVar2.mo140380h(((Integer) animatedValue2).intValue());
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                    }
                }
                this.f98582c.updateViewLayout(this.f98583d, this.f98581b.mo140375d());
            } catch (Exception unused) {
                this.f98584e.cancel();
            }
        }
    }

    /* renamed from: a */
    public final int mo140347a(int i) {
        int i2;
        int i3;
        if (this.f98579q.mo140211q() != 8388613) {
            return i;
        }
        switch (C38362f.f98599d[this.f98579q.mo140203i().ordinal()]) {
            case 1:
                return i - this.f98579q.mo140212r().getFirst().intValue();
            case 2:
                return i + this.f98579q.mo140212r().getFirst().intValue();
            case 3:
                if (this.f98568f < this.f98569g) {
                    return i - this.f98579q.mo140212r().getFirst().intValue();
                }
                return i + this.f98579q.mo140212r().getFirst().intValue();
            case 4:
                return i - this.f98579q.mo140212r().getSecond().intValue();
            case 5:
                return i + this.f98579q.mo140212r().getSecond().intValue();
            case 6:
                if (this.f98570h < this.f98571i) {
                    return i - this.f98579q.mo140212r().getSecond().intValue();
                }
                return i + this.f98579q.mo140212r().getSecond().intValue();
            case 7:
                if (this.f98572j < this.f98573k) {
                    if (this.f98568f < this.f98569g) {
                        i3 = this.f98579q.mo140212r().getFirst().intValue();
                    } else {
                        i2 = this.f98579q.mo140212r().getFirst().intValue();
                        return i + i2;
                    }
                } else if (this.f98570h < this.f98571i) {
                    i3 = this.f98579q.mo140212r().getSecond().intValue();
                } else {
                    i2 = this.f98579q.mo140212r().getSecond().intValue();
                    return i + i2;
                }
                return i - i3;
            default:
                return i;
        }
    }

    /* renamed from: a */
    private final int m151027a(WindowManagerLayoutParamsProxy gVar, int i) {
        if (this.f98568f < this.f98569g) {
            return 0 - i;
        }
        return gVar.mo140371b() + this.f98569g + i;
    }

    public TouchUtils(Context context, FloatConfig aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "config");
        this.f98578p = context;
        this.f98579q = aVar;
        if (this.f98565c == 0) {
            this.f98565c = UIHelper.getWindowWidth(context);
        }
        if (this.f98564b == 0) {
            this.f98564b = aVar.mo140168B().mo140240a(context);
        }
    }

    /* renamed from: a */
    private final void m151028a(WindowManagerLayoutParamsProxy gVar, View view) {
        int i;
        int b = gVar.mo140371b();
        this.f98568f = b;
        this.f98569g = this.f98565c - (b + view.getRight());
        int c = gVar.mo140373c();
        this.f98570h = c;
        if (this.f98576n) {
            i = ((this.f98564b - m151029b(view)) - this.f98570h) - view.getHeight();
        } else {
            i = (this.f98564b - c) - view.getHeight();
        }
        this.f98571i = i;
        this.f98572j = Math.min(this.f98568f, this.f98569g);
        this.f98573k = Math.min(this.f98570h, this.f98571i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Landroid/graphics/Point;", "fraction", "", "startValue", "kotlin.jvm.PlatformType", "endValue", "evaluate"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.widget.appfloat.e$e */
    public static final class C38361e<T> implements TypeEvaluator<Point> {

        /* renamed from: a */
        final /* synthetic */ Point f98595a;

        C38361e(Point point) {
            this.f98595a = point;
        }

        /* renamed from: a */
        public final Point evaluate(float f, Point point, Point point2) {
            this.f98595a.x = (int) (((float) point.x) + (((float) (point2.x - point.x)) * f));
            this.f98595a.y = (int) (((float) point.y) + (((float) (point2.y - point.y)) * f));
            return this.f98595a;
        }
    }

    /* renamed from: a */
    public final int mo140348a(View view, WindowManagerLayoutParamsProxy gVar, int i) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(gVar, "params");
        m151028a(gVar, view);
        return m151027a(gVar, i);
    }

    /* renamed from: a */
    public final Animator mo140349a(WindowManagerLayoutParamsProxy gVar, int i, int i2, WindowManager windowManager, View view, AppFloatManager.IEvictDetector bVar) {
        int i3;
        int i4;
        Intrinsics.checkParameterIsNotNull(gVar, "params");
        Intrinsics.checkParameterIsNotNull(windowManager, "windowManager");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Animator animator = this.f98577o;
        if (animator != null) {
            animator.cancel();
        }
        this.f98577o = null;
        Point point = new Point(gVar.mo140371b(), gVar.mo140373c());
        int i5 = this.f98565c;
        if (i5 > this.f98564b) {
            i3 = (i5 - view.getWidth()) - i;
        } else {
            i3 = i;
        }
        if (i2 == 0) {
            i4 = gVar.mo140373c();
        } else {
            i4 = i2;
        }
        if (i4 >= this.f98564b - view.getHeight()) {
            i4 = this.f98564b - view.getHeight();
        }
        Point point2 = new Point(i3, i4);
        Log.m165389i("AppFloatManager", point + ' ' + point2 + " , " + i + ' ' + i2 + " , " + this.f98565c + ' ' + this.f98564b);
        ValueAnimator ofObject = ValueAnimator.ofObject(new C38361e(new Point()), point, point2);
        ofObject.addUpdateListener(new C38359c(gVar, windowManager, view, ofObject));
        ofObject.addListener(new C38360d(this, view, bVar));
        ofObject.start();
        ValueAnimator valueAnimator = ofObject;
        this.f98577o = valueAnimator;
        return valueAnimator;
    }

    /* renamed from: a */
    public final Animator mo140350a(boolean z, WindowManagerLayoutParamsProxy gVar, int i, WindowManager windowManager, View view, AppFloatManager.IEvictDetector bVar) {
        int i2;
        Intrinsics.checkParameterIsNotNull(gVar, "params");
        Intrinsics.checkParameterIsNotNull(windowManager, "windowManager");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Animator animator = this.f98577o;
        if (animator != null) {
            animator.cancel();
        }
        this.f98577o = null;
        int[] iArr = new int[2];
        if (z) {
            i2 = gVar.mo140371b();
        } else {
            i2 = gVar.mo140373c();
        }
        iArr[0] = i2;
        iArr[1] = i;
        ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
        ofInt.addUpdateListener(new C38357a(z, gVar, windowManager, view, ofInt));
        ofInt.addListener(new C38358b(this, view, bVar));
        ofInt.start();
        ValueAnimator valueAnimator = ofInt;
        this.f98577o = valueAnimator;
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "animator");
        return valueAnimator;
    }
}
