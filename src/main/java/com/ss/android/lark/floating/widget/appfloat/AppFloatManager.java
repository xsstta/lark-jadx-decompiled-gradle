package com.ss.android.lark.floating.widget.appfloat;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import com.ss.android.lark.floating.anim.AppFloatAnimatorManager;
import com.ss.android.lark.floating.data.FloatConfig;
import com.ss.android.lark.floating.enums.ShowPattern;
import com.ss.android.lark.floating.interfaces.FloatCallbacks;
import com.ss.android.lark.floating.interfaces.OnFloatCallbacks;
import com.ss.android.lark.floating.interfaces.OnFloatTouchListener;
import com.ss.android.lark.floating.p1896c.AbstractC38339g;
import com.ss.android.lark.floating.utils.AppStateHandler;
import com.ss.android.lark.floating.utils.DisplayUtils;
import com.ss.android.lark.floating.widget.appfloat.ParentFrameLayout;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u000e\b\u0000\u0018\u0000 W2\u00020\u0001:\u0002WXB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u00100\u001a\u000201H\u0002J\r\u00102\u001a\u0004\u0018\u000101¢\u0006\u0002\u00103J\u0016\u00104\u001a\u00020%2\f\u00105\u001a\b\u0012\u0004\u0012\u00020%06H\u0002J\u001a\u00107\u001a\u0002012\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H\u0002J\u0014\u0010<\u001a\u0002012\f\u00105\u001a\b\u0012\u0004\u0012\u00020%06J\u0006\u0010=\u001a\u000201J\b\u0010>\u001a\u000201H\u0002J\b\u0010?\u001a\u000201H\u0002J\u0016\u0010@\u001a\u0002012\u0006\u0010A\u001a\u00020\u00172\u0006\u0010B\u001a\u00020\u0017J\u0006\u0010C\u001a\u000201J\u0006\u0010D\u001a\u000201J\u0012\u0010E\u001a\u0002012\b\u0010F\u001a\u0004\u0018\u000109H\u0003J\u0006\u0010G\u001a\u000201J\u0018\u0010H\u001a\u0002012\u0006\u0010I\u001a\u00020\u00172\b\b\u0002\u0010J\u001a\u00020KJ\b\u0010L\u001a\u000201H\u0002J\u000e\u0010M\u001a\u0002012\u0006\u0010N\u001a\u00020KJ\u0016\u0010O\u001a\u0002012\u0006\u0010P\u001a\u00020\u00172\u0006\u0010Q\u001a\u00020\u0017J\u0015\u0010R\u001a\u000201*\u00020\u00192\u0006\u0010S\u001a\u00020\u0017H\bJ\u0015\u0010T\u001a\u000201*\u00020\u00192\u0006\u0010S\u001a\u00020\u0017H\bJ\u001d\u0010U\u001a\u000201*\u00020\u00192\u0006\u0010S\u001a\u00020\u00172\u0006\u0010V\u001a\u00020\u0017H\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X.¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020+X.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006Y"}, d2 = {"Lcom/ss/android/lark/floating/widget/appfloat/AppFloatManager;", "", "context", "Landroid/content/Context;", "config", "Lcom/ss/android/lark/floating/data/FloatConfig;", "(Landroid/content/Context;Lcom/ss/android/lark/floating/data/FloatConfig;)V", "getConfig", "()Lcom/ss/android/lark/floating/data/FloatConfig;", "setConfig", "(Lcom/ss/android/lark/floating/data/FloatConfig;)V", "getContext", "()Landroid/content/Context;", "evictDetector", "com/ss/android/lark/floating/widget/appfloat/AppFloatManager$evictDetector$1", "Lcom/ss/android/lark/floating/widget/appfloat/AppFloatManager$evictDetector$1;", "frameLayout", "Lcom/ss/android/lark/floating/widget/appfloat/ParentFrameLayout;", "getFrameLayout", "()Lcom/ss/android/lark/floating/widget/appfloat/ParentFrameLayout;", "setFrameLayout", "(Lcom/ss/android/lark/floating/widget/appfloat/ParentFrameLayout;)V", "mOtherFlags", "", "params", "Lcom/ss/android/lark/floating/widget/appfloat/WindowManagerLayoutParamsProxy;", "getParams", "()Lcom/ss/android/lark/floating/widget/appfloat/WindowManagerLayoutParamsProxy;", "setParams", "(Lcom/ss/android/lark/floating/widget/appfloat/WindowManagerLayoutParamsProxy;)V", "runningAnimator", "Landroid/animation/Animator;", "getRunningAnimator", "()Landroid/animation/Animator;", "setRunningAnimator", "(Landroid/animation/Animator;)V", "tmpRect", "Landroid/graphics/Rect;", "tmpScreenLocation", "", "touchUtils", "Lcom/ss/android/lark/floating/widget/appfloat/TouchUtils;", "windowManager", "Landroid/view/WindowManager;", "getWindowManager", "()Landroid/view/WindowManager;", "setWindowManager", "(Landroid/view/WindowManager;)V", "addView", "", "createFloat", "()Lkotlin/Unit;", "createUnionRect", "rects", "", "enterAnim", "floatingView", "Landroid/view/View;", "evict", "Lcom/ss/android/lark/floating/widget/appfloat/AppFloatManager$IEvictDetector;", "evictRect", "exitAnim", "floatOver", "initParams", "refreshOffsets", "x", "y", "relocate", "restoreWrapContent", "setGravity", "view", "setMatchParent", "setVisible", "visible", "needShow", "", "settle", "updateKeepScreenOn", C63954b.f161494a, "updateLocation", "oldWidth", "oldHeight", "addFlags", "flags", "clearFlags", "setFlags", "mask", "Companion", "IEvictDetector", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.widget.appfloat.a */
public final class AppFloatManager {

    /* renamed from: d */
    public static final Companion f98524d = new Companion(null);

    /* renamed from: a */
    public WindowManager f98525a;

    /* renamed from: b */
    public WindowManagerLayoutParamsProxy f98526b;

    /* renamed from: c */
    public TouchUtils f98527c;

    /* renamed from: e */
    private ParentFrameLayout f98528e;

    /* renamed from: f */
    private int f98529f;

    /* renamed from: g */
    private final int[] f98530g = new int[2];

    /* renamed from: h */
    private final Rect f98531h = new Rect();

    /* renamed from: i */
    private final C38352f f98532i = new C38352f(this);

    /* renamed from: j */
    private Animator f98533j;

    /* renamed from: k */
    private final Context f98534k;

    /* renamed from: l */
    private FloatConfig f98535l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/floating/widget/appfloat/AppFloatManager$IEvictDetector;", "", "doEvictAction", "", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.widget.appfloat.a$b */
    public interface IEvictDetector {
        /* renamed from: a */
        void mo140315a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/floating/widget/appfloat/AppFloatManager$Companion;", "", "()V", "MARGIN_EVICT", "", "TAG", "", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.widget.appfloat.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final ParentFrameLayout mo140309c() {
        return this.f98528e;
    }

    /* renamed from: h */
    public final FloatConfig mo140314h() {
        return this.f98535l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo140305a(java.util.List<android.graphics.Rect> r18) {
        /*
        // Method dump skipped, instructions count: 444
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.floating.widget.appfloat.AppFloatManager.mo140305a(java.util.List):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/floating/widget/appfloat/AppFloatManager$evictDetector$1", "Lcom/ss/android/lark/floating/widget/appfloat/AppFloatManager$IEvictDetector;", "doEvictAction", "", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.widget.appfloat.a$f */
    public static final class C38352f implements IEvictDetector {

        /* renamed from: a */
        final /* synthetic */ AppFloatManager f98546a;

        @Override // com.ss.android.lark.floating.widget.appfloat.AppFloatManager.IEvictDetector
        /* renamed from: a */
        public void mo140315a() {
            AppFloatManager aVar = this.f98546a;
            aVar.mo140305a(aVar.mo140314h().mo140217v());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38352f(AppFloatManager aVar) {
            this.f98546a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/floating/widget/appfloat/AppFloatManager$setVisible$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.widget.appfloat.a$h */
    public static final class RunnableC38354h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AppFloatManager f98548a;

        /* renamed from: b */
        final /* synthetic */ int f98549b;

        /* renamed from: c */
        final /* synthetic */ boolean f98550c;

        RunnableC38354h(AppFloatManager aVar, int i, boolean z) {
            this.f98548a = aVar;
            this.f98549b = i;
            this.f98550c = z;
        }

        public final void run() {
            this.f98548a.mo140302a(this.f98549b, this.f98550c);
        }
    }

    /* renamed from: b */
    public final WindowManagerLayoutParamsProxy mo140307b() {
        WindowManagerLayoutParamsProxy gVar = this.f98526b;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        return gVar;
    }

    /* renamed from: a */
    public final WindowManager mo140300a() {
        WindowManager windowManager = this.f98525a;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
        }
        return windowManager;
    }

    /* renamed from: f */
    public final void mo140312f() {
        try {
            this.f98535l.mo140182a(false);
            WindowManager windowManager = this.f98525a;
            if (windowManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            }
            windowManager.removeView(this.f98528e);
        } catch (Exception e) {
            Log.m165383e("AppFloatManager", "float dismiss occurs error：" + e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/ss/android/lark/floating/widget/appfloat/AppFloatManager$addView$1$3", "Lcom/ss/android/lark/floating/widget/appfloat/ParentFrameLayout$OnLayoutListener;", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "onLayout", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.widget.appfloat.a$d */
    public static final class C38349d implements ParentFrameLayout.OnLayoutListener {

        /* renamed from: a */
        final /* synthetic */ ParentFrameLayout f98539a;

        /* renamed from: b */
        final /* synthetic */ View f98540b;

        /* renamed from: c */
        final /* synthetic */ AppFloatManager f98541c;

        @Override // com.ss.android.lark.floating.widget.appfloat.ParentFrameLayout.OnLayoutListener
        /* renamed from: a */
        public void mo140316a() {
            FloatCallbacks.Builder a;
            Function3<Boolean, String, View, Unit> a2;
            this.f98541c.mo140303a(this.f98539a);
            FloatConfig h = this.f98541c.mo140314h();
            if (h.mo140170D() || ((h.mo140204j() == ShowPattern.BACKGROUND && AppStateHandler.f98493a.mo140255c()) || (h.mo140204j() == ShowPattern.FOREGROUND && !AppStateHandler.f98493a.mo140255c()))) {
                AppFloatManager.m150988a(this.f98541c, 4, false, 2, null);
            } else {
                AppFloatManager aVar = this.f98541c;
                View view = this.f98540b;
                Intrinsics.checkExpressionValueIsNotNull(view, "floatingView");
                aVar.mo140304a(view, new IEvictDetector(this) {
                    /* class com.ss.android.lark.floating.widget.appfloat.AppFloatManager.C38349d.C383501 */

                    /* renamed from: a */
                    final /* synthetic */ C38349d f98542a;

                    @Override // com.ss.android.lark.floating.widget.appfloat.AppFloatManager.IEvictDetector
                    /* renamed from: a */
                    public void mo140315a() {
                        this.f98542a.f98541c.mo140305a(this.f98542a.f98541c.mo140314h().mo140217v());
                    }

                    {
                        this.f98542a = r1;
                    }
                });
            }
            OnFloatCallbacks x = h.mo140219x();
            if (x != null) {
                x.mo140244a(true, null, this.f98540b);
            }
            FloatCallbacks y = h.mo140220y();
            if (y != null && (a = y.mo140225a()) != null && (a2 = a.mo140227a()) != null) {
                a2.invoke(true, null, this.f98540b);
            }
        }

        @Override // com.ss.android.lark.floating.widget.appfloat.ParentFrameLayout.OnLayoutListener
        /* renamed from: a */
        public void mo140317a(Configuration configuration) {
            Log.m165389i("AppFloatManager", "onConfigurationChanged newConfig: " + configuration);
            AppFloatManager.m150987a(this.f98541c).mo140351a();
            this.f98541c.mo140313g();
        }

        C38349d(ParentFrameLayout dVar, View view, AppFloatManager aVar) {
            this.f98539a = dVar;
            this.f98540b = view;
            this.f98541c = aVar;
        }
    }

    /* renamed from: d */
    public final Unit mo140310d() {
        FloatCallbacks.Builder a;
        Function3<Boolean, String, View, Unit> a2;
        try {
            this.f98527c = new TouchUtils(this.f98534k, this.f98535l);
            m150990i();
            m150991j();
            this.f98535l.mo140192d(true);
            return Unit.INSTANCE;
        } catch (Exception e) {
            OnFloatCallbacks x = this.f98535l.mo140219x();
            if (x != null) {
                x.mo140244a(false, String.valueOf(e), null);
            }
            FloatCallbacks y = this.f98535l.mo140220y();
            if (y == null || (a = y.mo140225a()) == null || (a2 = a.mo140227a()) == null) {
                return null;
            }
            return a2.invoke(false, String.valueOf(e), null);
        }
    }

    /* renamed from: e */
    public final void mo140311e() {
        Animator animator = this.f98533j;
        if (animator != null) {
            animator.cancel();
        }
        this.f98533j = null;
        ParentFrameLayout dVar = this.f98528e;
        if (dVar != null) {
            ParentFrameLayout dVar2 = dVar;
            WindowManagerLayoutParamsProxy gVar = this.f98526b;
            if (gVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            WindowManager windowManager = this.f98525a;
            if (windowManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            }
            ValueAnimator b = new AppFloatAnimatorManager(dVar2, gVar, windowManager, this.f98535l).mo140160b();
            if (b == null) {
                mo140312f();
                return;
            }
            FloatManager.f98554a.mo140333c(this.f98535l.mo140191d());
            WindowManagerLayoutParamsProxy gVar2 = this.f98526b;
            if (gVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            gVar2.mo140376d((gVar2.mo140368a() & -41) | 40);
            WindowManagerLayoutParamsProxy gVar3 = this.f98526b;
            if (gVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            int i = this.f98529f;
            gVar3.mo140376d((i & i) | (gVar3.mo140368a() & (~i)));
            b.addListener(new C38353g(this));
            b.start();
            this.f98533j = b;
        }
    }

    /* renamed from: g */
    public final void mo140313g() {
        ParentFrameLayout dVar = this.f98528e;
        if (dVar != null) {
            Animator animator = this.f98533j;
            if (animator != null) {
                animator.cancel();
            }
            this.f98533j = null;
            if (dVar.isLaidOut()) {
                TouchUtils eVar = this.f98527c;
                if (eVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("touchUtils");
                }
                WindowManagerLayoutParamsProxy gVar = this.f98526b;
                if (gVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("params");
                }
                TouchUtils eVar2 = this.f98527c;
                if (eVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("touchUtils");
                }
                ParentFrameLayout dVar2 = dVar;
                WindowManagerLayoutParamsProxy gVar2 = this.f98526b;
                if (gVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("params");
                }
                int a = eVar2.mo140348a(dVar2, gVar2, this.f98535l.mo140213s());
                int t = this.f98535l.mo140214t();
                WindowManager windowManager = this.f98525a;
                if (windowManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("windowManager");
                }
                eVar.mo140349a(gVar, a, t, windowManager, dVar2, this.f98532i);
            }
        }
    }

    /* renamed from: i */
    private final void m150990i() {
        int i;
        int i2;
        Object systemService = this.f98534k.getSystemService("window");
        if (systemService != null) {
            this.f98525a = new WindowManagerProxy((WindowManager) systemService);
            WindowManagerLayoutParamsProxy gVar = new WindowManagerLayoutParamsProxy();
            if (Build.VERSION.SDK_INT >= 26) {
                i = 2038;
            } else {
                i = 2002;
            }
            gVar.mo140370a(i);
            gVar.mo140372b(1);
            gVar.mo140374c(8388659);
            gVar.mo140376d(552);
            if (this.f98535l.mo140205k()) {
                this.f98529f |= SmActions.ACTION_ONTHECALL_EXIT;
            }
            if (this.f98535l.mo140206l()) {
                this.f98529f |= 16777216;
            }
            if (this.f98535l.mo140208n() != -1.0f) {
                this.f98529f |= 2;
                gVar.mo140369a(this.f98535l.mo140208n());
            }
            gVar.mo140376d(gVar.mo140368a() | this.f98529f);
            int i3 = -1;
            if (this.f98535l.mo140209o()) {
                i2 = -1;
            } else {
                i2 = -2;
            }
            gVar.mo140377e(i2);
            if (!this.f98535l.mo140210p()) {
                i3 = -2;
            }
            gVar.mo140378f(i3);
            gVar.mo140380h(this.f98535l.mo140214t());
            this.f98526b = gVar;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* renamed from: j */
    private final void m150991j() {
        ParentFrameLayout dVar = new ParentFrameLayout(this.f98534k, this.f98535l, null, 0, 12, null);
        dVar.setTag(this.f98535l.mo140191d());
        LayoutInflater from = LayoutInflater.from(this.f98534k);
        Integer b = this.f98535l.mo140184b();
        if (b == null) {
            Intrinsics.throwNpe();
        }
        View inflate = from.inflate(b.intValue(), (ViewGroup) dVar, true);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "floatingView");
        inflate.setVisibility(4);
        WindowManager windowManager = this.f98525a;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
        }
        ParentFrameLayout dVar2 = dVar;
        WindowManagerLayoutParamsProxy gVar = this.f98526b;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        windowManager.addView(dVar2, gVar.mo140375d());
        FloatConfig aVar = this.f98535l;
        aVar.mo140173a(inflate);
        aVar.mo140186b(dVar2);
        AbstractC38339g w = aVar.mo140218w();
        if (w != null) {
            w.mo140249a(inflate);
        }
        dVar.setTouchListener(new C38347c(dVar, this));
        dVar.setLayoutListener(new C38349d(dVar, inflate, this));
        this.f98528e = dVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/floating/widget/appfloat/AppFloatManager$exitAnim$1$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.widget.appfloat.a$g */
    public static final class C38353g implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ AppFloatManager f98547a;

        public void onAnimationRepeat(Animator animator) {
        }

        C38353g(AppFloatManager aVar) {
            this.f98547a = aVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f98547a.mo140312f();
        }

        public void onAnimationEnd(Animator animator) {
            this.f98547a.mo140312f();
        }

        public void onAnimationStart(Animator animator) {
            this.f98547a.mo140314h().mo140182a(true);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TouchUtils m150987a(AppFloatManager aVar) {
        TouchUtils eVar = aVar.f98527c;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("touchUtils");
        }
        return eVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/floating/widget/appfloat/AppFloatManager$enterAnim$1$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.widget.appfloat.a$e */
    public static final class C38351e implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ AppFloatManager f98543a;

        /* renamed from: b */
        final /* synthetic */ IEvictDetector f98544b;

        /* renamed from: c */
        final /* synthetic */ View f98545c;

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f98543a.mo140314h().mo140182a(false);
            IEvictDetector bVar = this.f98544b;
            if (bVar != null) {
                bVar.mo140315a();
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f98545c.setVisibility(0);
            this.f98543a.mo140314h().mo140182a(true);
        }

        C38351e(AppFloatManager aVar, IEvictDetector bVar, View view) {
            this.f98543a = aVar;
            this.f98544b = bVar;
            this.f98545c = view;
        }
    }

    /* renamed from: b */
    private final Rect m150989b(List<Rect> list) {
        Rect rect = new Rect();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            rect.union(it.next());
        }
        return rect;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/floating/widget/appfloat/AppFloatManager$addView$1$2", "Lcom/ss/android/lark/floating/interfaces/OnFloatTouchListener;", "onTouch", "", "event", "Landroid/view/MotionEvent;", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.widget.appfloat.a$c */
    public static final class C38347c implements OnFloatTouchListener {

        /* renamed from: a */
        final /* synthetic */ ParentFrameLayout f98536a;

        /* renamed from: b */
        final /* synthetic */ AppFloatManager f98537b;

        @Override // com.ss.android.lark.floating.interfaces.OnFloatTouchListener
        /* renamed from: a */
        public void mo140248a(MotionEvent motionEvent) {
            Intrinsics.checkParameterIsNotNull(motionEvent, "event");
            AppFloatManager.m150987a(this.f98537b).mo140353a(this.f98536a, motionEvent, this.f98537b.mo140300a(), this.f98537b.mo140307b(), this.f98537b.mo140314h().mo140213s(), this.f98537b.mo140314h().mo140214t(), new IEvictDetector(this) {
                /* class com.ss.android.lark.floating.widget.appfloat.AppFloatManager.C38347c.C383481 */

                /* renamed from: a */
                final /* synthetic */ C38347c f98538a;

                @Override // com.ss.android.lark.floating.widget.appfloat.AppFloatManager.IEvictDetector
                /* renamed from: a */
                public void mo140315a() {
                    this.f98538a.f98537b.mo140305a(this.f98538a.f98537b.mo140314h().mo140217v());
                }

                {
                    this.f98538a = r1;
                }
            });
        }

        C38347c(ParentFrameLayout dVar, AppFloatManager aVar) {
            this.f98536a = dVar;
            this.f98537b = aVar;
        }
    }

    /* renamed from: a */
    public final void mo140306a(boolean z) {
        if (z) {
            WindowManagerLayoutParamsProxy gVar = this.f98526b;
            if (gVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            gVar.mo140376d((gVar.mo140368a() & -129) | SmActions.ACTION_ONTHECALL_EXIT);
        } else {
            WindowManagerLayoutParamsProxy gVar2 = this.f98526b;
            if (gVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            gVar2.mo140376d((gVar2.mo140368a() & -129) | 0);
        }
        WindowManager windowManager = this.f98525a;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
        }
        ParentFrameLayout dVar = this.f98528e;
        WindowManagerLayoutParamsProxy gVar3 = this.f98526b;
        if (gVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        windowManager.updateViewLayout(dVar, gVar3.mo140375d());
    }

    /* renamed from: a */
    public final void mo140303a(View view) {
        if (!(!Intrinsics.areEqual(this.f98535l.mo140216u(), new Pair(0, 0))) && view != null) {
            Rect rect = new Rect();
            WindowManager windowManager = this.f98525a;
            if (windowManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            }
            windowManager.getDefaultDisplay().getRectSize(rect);
            int a = rect.bottom - DisplayUtils.f98497a.mo140264a(view);
            switch (this.f98535l.mo140211q()) {
                case 1:
                case 49:
                    WindowManagerLayoutParamsProxy gVar = this.f98526b;
                    if (gVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("params");
                    }
                    gVar.mo140379g((rect.right - view.getWidth()) >> 1);
                    break;
                case 5:
                case 53:
                case 8388613:
                case 8388661:
                    WindowManagerLayoutParamsProxy gVar2 = this.f98526b;
                    if (gVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("params");
                    }
                    gVar2.mo140379g(rect.right - view.getWidth());
                    break;
                case 16:
                case 19:
                case 8388627:
                    WindowManagerLayoutParamsProxy gVar3 = this.f98526b;
                    if (gVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("params");
                    }
                    gVar3.mo140380h((a - view.getHeight()) >> 1);
                    break;
                case 17:
                    WindowManagerLayoutParamsProxy gVar4 = this.f98526b;
                    if (gVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("params");
                    }
                    gVar4.mo140379g((rect.right - view.getWidth()) >> 1);
                    WindowManagerLayoutParamsProxy gVar5 = this.f98526b;
                    if (gVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("params");
                    }
                    gVar5.mo140380h((a - view.getHeight()) >> 1);
                    break;
                case 21:
                case 8388629:
                    WindowManagerLayoutParamsProxy gVar6 = this.f98526b;
                    if (gVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("params");
                    }
                    gVar6.mo140379g(rect.right - view.getWidth());
                    WindowManagerLayoutParamsProxy gVar7 = this.f98526b;
                    if (gVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("params");
                    }
                    gVar7.mo140380h((a - view.getHeight()) >> 1);
                    break;
                case CalendarSearchResultRv.f82651b:
                case 83:
                case 8388691:
                    WindowManagerLayoutParamsProxy gVar8 = this.f98526b;
                    if (gVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("params");
                    }
                    gVar8.mo140380h(a - view.getHeight());
                    break;
                case 81:
                    WindowManagerLayoutParamsProxy gVar9 = this.f98526b;
                    if (gVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("params");
                    }
                    gVar9.mo140379g((rect.right - view.getWidth()) >> 1);
                    WindowManagerLayoutParamsProxy gVar10 = this.f98526b;
                    if (gVar10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("params");
                    }
                    gVar10.mo140380h(a - view.getHeight());
                    break;
                case 85:
                case 8388693:
                    WindowManagerLayoutParamsProxy gVar11 = this.f98526b;
                    if (gVar11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("params");
                    }
                    gVar11.mo140379g(rect.right - view.getWidth());
                    WindowManagerLayoutParamsProxy gVar12 = this.f98526b;
                    if (gVar12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("params");
                    }
                    gVar12.mo140380h(a - view.getHeight());
                    break;
            }
            WindowManagerLayoutParamsProxy gVar13 = this.f98526b;
            if (gVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            gVar13.mo140379g(gVar13.mo140371b() + this.f98535l.mo140212r().getFirst().intValue());
            WindowManagerLayoutParamsProxy gVar14 = this.f98526b;
            if (gVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            gVar14.mo140380h(gVar14.mo140373c() + this.f98535l.mo140212r().getSecond().intValue());
            WindowManager windowManager2 = this.f98525a;
            if (windowManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            }
            WindowManagerLayoutParamsProxy gVar15 = this.f98526b;
            if (gVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            windowManager2.updateViewLayout(view, gVar15.mo140375d());
        }
    }

    public AppFloatManager(Context context, FloatConfig aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "config");
        this.f98534k = context;
        this.f98535l = aVar;
    }

    /* renamed from: b */
    public final void mo140308b(int i, int i2) {
        this.f98535l.mo140185b(i);
        this.f98535l.mo140189c(i2);
        mo140313g();
    }

    /* renamed from: a */
    public final void mo140301a(int i, int i2) {
        ParentFrameLayout dVar = this.f98528e;
        if (dVar != null) {
            Rect rect = new Rect();
            WindowManager windowManager = this.f98525a;
            if (windowManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            }
            windowManager.getDefaultDisplay().getRectSize(rect);
            int i3 = rect.bottom;
            DisplayUtils cVar = DisplayUtils.f98497a;
            if (dVar != null) {
                ParentFrameLayout dVar2 = dVar;
                int a = i3 - cVar.mo140264a(dVar2);
                boolean z = true;
                int i4 = 0;
                switch (C38355b.f98552b[this.f98535l.mo140203i().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        WindowManagerLayoutParamsProxy gVar = this.f98526b;
                        if (gVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("params");
                        }
                        if (gVar.mo140371b() + (i / 2) <= rect.right / 2) {
                            z = false;
                        }
                        if (z) {
                            i4 = rect.right - dVar.getWidth();
                        }
                        WindowManagerLayoutParamsProxy gVar2 = this.f98526b;
                        if (gVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("params");
                        }
                        TouchUtils eVar = this.f98527c;
                        if (eVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("touchUtils");
                        }
                        gVar2.mo140379g(eVar.mo140347a(i4));
                        break;
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case HwBuildEx.VersionCodes.EMUI_5_1:
                        WindowManagerLayoutParamsProxy gVar3 = this.f98526b;
                        if (gVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("params");
                        }
                        if (gVar3.mo140373c() + (i2 / 2) > a / 2) {
                            z = false;
                        }
                        if (!z) {
                            i4 = a - dVar.getHeight();
                        }
                        WindowManagerLayoutParamsProxy gVar4 = this.f98526b;
                        if (gVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("params");
                        }
                        TouchUtils eVar2 = this.f98527c;
                        if (eVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("touchUtils");
                        }
                        gVar4.mo140380h(eVar2.mo140347a(i4));
                        break;
                    default:
                        mo140303a(this.f98528e);
                        return;
                }
                WindowManager windowManager2 = this.f98525a;
                if (windowManager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("windowManager");
                }
                WindowManagerLayoutParamsProxy gVar5 = this.f98526b;
                if (gVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("params");
                }
                windowManager2.updateViewLayout(dVar2, gVar5.mo140375d());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
    }

    /* renamed from: a */
    public final void mo140302a(int i, boolean z) {
        FloatCallbacks.Builder a;
        Function1<View, Unit> c;
        FloatCallbacks.Builder a2;
        Function1<View, Unit> b;
        ParentFrameLayout dVar = this.f98528e;
        if (dVar != null && dVar.getChildCount() >= 1) {
            if (dVar.isLaidOut() || i != 0) {
                this.f98535l.mo140200h(z);
                dVar.setVisibility(i);
                View childAt = dVar.getChildAt(0);
                if (i == 0) {
                    this.f98535l.mo140192d(true);
                    OnFloatCallbacks x = this.f98535l.mo140219x();
                    if (x != null) {
                        Intrinsics.checkExpressionValueIsNotNull(childAt, "view");
                        x.mo140242a(childAt);
                    }
                    FloatCallbacks y = this.f98535l.mo140220y();
                    if (y != null && (a2 = y.mo140225a()) != null && (b = a2.mo140232b()) != null) {
                        Intrinsics.checkExpressionValueIsNotNull(childAt, "view");
                        b.invoke(childAt);
                        return;
                    }
                    return;
                }
                this.f98535l.mo140192d(false);
                OnFloatCallbacks x2 = this.f98535l.mo140219x();
                if (x2 != null) {
                    Intrinsics.checkExpressionValueIsNotNull(childAt, "view");
                    x2.mo140245b(childAt);
                }
                FloatCallbacks y2 = this.f98535l.mo140220y();
                if (y2 != null && (a = y2.mo140225a()) != null && (c = a.mo140234c()) != null) {
                    Intrinsics.checkExpressionValueIsNotNull(childAt, "view");
                    c.invoke(childAt);
                    return;
                }
                return;
            }
            dVar.post(new RunnableC38354h(this, i, z));
        }
    }

    /* renamed from: a */
    public final void mo140304a(View view, IEvictDetector bVar) {
        Animator animator = this.f98533j;
        if (animator != null) {
            animator.cancel();
        }
        this.f98533j = null;
        ParentFrameLayout dVar = this.f98528e;
        if (dVar != null && !this.f98535l.mo140183a()) {
            ParentFrameLayout dVar2 = dVar;
            WindowManagerLayoutParamsProxy gVar = this.f98526b;
            if (gVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            WindowManager windowManager = this.f98525a;
            if (windowManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            }
            ValueAnimator a = new AppFloatAnimatorManager(dVar2, gVar, windowManager, this.f98535l).mo140159a();
            if (a != null) {
                WindowManagerLayoutParamsProxy gVar2 = this.f98526b;
                if (gVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("params");
                }
                gVar2.mo140376d((gVar2.mo140368a() & -41) | 40);
                WindowManagerLayoutParamsProxy gVar3 = this.f98526b;
                if (gVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("params");
                }
                int i = this.f98529f;
                gVar3.mo140376d((i & i) | (gVar3.mo140368a() & (~i)));
                a.addListener(new C38351e(this, bVar, view));
                a.start();
                this.f98533j = a;
                return;
            }
            view.setVisibility(0);
            WindowManager windowManager2 = this.f98525a;
            if (windowManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            }
            WindowManagerLayoutParamsProxy gVar4 = this.f98526b;
            if (gVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            windowManager2.updateViewLayout(view, gVar4.mo140375d());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m150988a(AppFloatManager aVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        aVar.mo140302a(i, z);
    }
}
