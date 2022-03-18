package com.ss.android.lark.slideback;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.core.util.C0844e;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.slideback.SlideFrameLayout;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\nH\u0002J\u0016\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001dH\u0002J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u0002J\u0006\u0010 \u001a\u00020\u0013J\b\u0010!\u001a\u00020\u0019H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0002J&\u0010#\u001a\u00020\u00192\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d2\u0006\u0010%\u001a\u00020\u0006H\u0002J\u0010\u0010&\u001a\u00020\u00192\b\u0010'\u001a\u0004\u0018\u00010(J\u000e\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\nJ\u000e\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\nJ\u0010\u0010-\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0002J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0016\u0010\u0017¨\u0006/"}, d2 = {"Lcom/ss/android/lark/slideback/SlideHelper;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "mBackPreviewViewInitOffset", "", "mFinishTask", "Ljava/lang/Runnable;", "mNeedFindActivityFlag", "", "mNeedFinishActivityFlag", "mOnSlideFinishListener", "Lcom/ss/android/lark/slideback/OnSlideFinishListener;", "mPreviousActivity", "Ljava/lang/ref/WeakReference;", "mPreviousActivitySlideFollow", "mSlideEdgePercent", "mSlideFrameLayout", "Lcom/ss/android/lark/slideback/SlideFrameLayout;", "value", "mSlideable", "setMSlideable", "(Z)V", "addViewToDecorView", "", "slideLayout", "checkEnableSlide", "getPreviousActivityInfo", "Landroidx/core/util/Pair;", "Landroid/view/View;", "getPreviousPreviewActivity", "getSlideFrameLayout", "hideKeyboard", "initSlideLayout", "offsetPreviousSnapshot", "snapshot", "translateX", "setBackgroundArtist", "backgroundArtist", "Lcom/ss/android/lark/slideback/BackgroundArtist;", "setPreviousActivitySlideFollow", "previousActivitySlideFollow", "setSlideable", "slideable", "setupEdge", "setupListener", "slideback_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.slideback.j */
public final class SlideHelper {

    /* renamed from: a */
    public float f135614a;

    /* renamed from: b */
    public boolean f135615b;

    /* renamed from: c */
    public final OnSlideFinishListener f135616c;

    /* renamed from: d */
    public final Runnable f135617d;

    /* renamed from: e */
    public final Activity f135618e;

    /* renamed from: f */
    private float f135619f = 0.25f;

    /* renamed from: g */
    private boolean f135620g = SlideBack.f135613b.mo187290a();

    /* renamed from: h */
    private boolean f135621h = true;

    /* renamed from: i */
    private WeakReference<Activity> f135622i;

    /* renamed from: j */
    private boolean f135623j = true;

    /* renamed from: k */
    private SlideFrameLayout f135624k;

    /* renamed from: c */
    public final SlideFrameLayout mo187297c() {
        SlideFrameLayout slideFrameLayout = this.f135624k;
        if (slideFrameLayout == null) {
            Intrinsics.throwNpe();
        }
        return slideFrameLayout;
    }

    /* renamed from: e */
    private final void m212982e() {
        if (m212983f()) {
            SlideFrameLayout slideFrameLayout = new SlideFrameLayout(this.f135618e);
            this.f135624k = slideFrameLayout;
            m212980c(slideFrameLayout);
            m212978b(slideFrameLayout);
            m212977a(slideFrameLayout);
        }
    }

    /* renamed from: f */
    private final boolean m212983f() {
        if (SlideBack.f135613b.mo187290a() && this.f135620g) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final C0844e<View, Activity> mo187296b() {
        Activity d = m212981d();
        if (d != null) {
            return C0844e.m3988a(d.findViewById(16908290), d);
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.slideback.j$a */
    static final class RunnableC54922a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SlideHelper f135625a;

        RunnableC54922a(SlideHelper jVar) {
            this.f135625a = jVar;
        }

        public final void run() {
            this.f135625a.f135615b = false;
            if (this.f135625a.f135616c == null || !this.f135625a.f135616c.mo187282a()) {
                this.f135625a.f135618e.finish();
                this.f135625a.f135618e.overridePendingTransition(R.anim.none, R.anim.none);
            }
        }
    }

    /* renamed from: d */
    private final Activity m212981d() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f135622i;
        if (weakReference != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        if (activity != null && activity.isFinishing()) {
            activity = null;
            this.f135622i = null;
        }
        if (activity == null && this.f135623j) {
            activity = ActivityStack.f135610a.mo187275a(this.f135618e);
            this.f135622i = new WeakReference<>(activity);
            if (activity == null) {
                this.f135623j = false;
            }
        }
        return activity;
    }

    /* renamed from: a */
    public final void mo187293a() {
        Object systemService = this.f135618e.getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (inputMethodManager != null && inputMethodManager.isActive() && this.f135618e.getCurrentFocus() != null) {
                View currentFocus = this.f135618e.getCurrentFocus();
                if (currentFocus == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(currentFocus, "activity.currentFocus!!");
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* renamed from: a */
    public final void mo187295a(boolean z) {
        m212979b(z);
    }

    /* renamed from: b */
    private final void m212979b(boolean z) {
        this.f135620g = z;
        SlideFrameLayout slideFrameLayout = this.f135624k;
        if (slideFrameLayout != null) {
            slideFrameLayout.setSlideable(z);
        }
    }

    /* renamed from: c */
    private final void m212980c(SlideFrameLayout slideFrameLayout) {
        Resources resources = this.f135618e.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "activity.resources");
        slideFrameLayout.setEdgeSize((int) (((float) resources.getDisplayMetrics().widthPixels) * this.f135619f));
    }

    public SlideHelper(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f135618e = activity;
        m212982e();
        this.f135617d = new RunnableC54922a(this);
    }

    /* renamed from: b */
    private final void m212978b(SlideFrameLayout slideFrameLayout) {
        Resources resources = this.f135618e.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "activity.resources");
        this.f135614a = ((float) resources.getDisplayMetrics().widthPixels) * -0.33333334f;
        slideFrameLayout.mo187225a(new C54923b(this, slideFrameLayout));
    }

    /* renamed from: a */
    private final void m212977a(SlideFrameLayout slideFrameLayout) {
        Window window = this.f135618e.getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkExpressionValueIsNotNull(decorView, "activity.window.decorView");
        View findViewById = decorView.findViewById(16908290);
        if (findViewById != null) {
            ViewGroup viewGroup = (ViewGroup) findViewById;
            ViewParent parent = viewGroup.getParent();
            if (parent != null) {
                ViewGroup viewGroup2 = (ViewGroup) parent;
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                ViewGroup viewGroup3 = viewGroup;
                viewGroup2.removeView(viewGroup3);
                slideFrameLayout.addView(viewGroup3);
                viewGroup2.addView(slideFrameLayout, layoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/slideback/SlideHelper$setupListener$1", "Lcom/ss/android/lark/slideback/SlideFrameLayout$SlidingListener;", "continueSettling", "", "panel", "Landroid/view/View;", "settling", "", "onPanelSlide", "slideOffset", "", "onSlideStateChanged", "state", "", "slideback_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.slideback.j$b */
    public static final class C54923b implements SlideFrameLayout.AbstractC54913h {

        /* renamed from: a */
        final /* synthetic */ SlideHelper f135626a;

        /* renamed from: b */
        final /* synthetic */ SlideFrameLayout f135627b;

        @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54913h
        /* renamed from: a */
        public void mo22170a(View view, boolean z) {
            Intrinsics.checkParameterIsNotNull(view, "panel");
        }

        C54923b(SlideHelper jVar, SlideFrameLayout slideFrameLayout) {
            this.f135626a = jVar;
            this.f135627b = slideFrameLayout;
        }

        @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54913h
        /* renamed from: a */
        public void mo22169a(View view, int i) {
            Intrinsics.checkParameterIsNotNull(view, "panel");
            if (i == 1) {
                this.f135626a.mo187293a();
                this.f135627b.clearFocus();
            }
        }

        @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54913h
        /* renamed from: a */
        public void mo22168a(View view, float f) {
            boolean z;
            SlideHelper jVar = this.f135626a;
            if (f >= 1.0f) {
                z = true;
            } else {
                z = false;
            }
            jVar.f135615b = z;
            if (f <= ((float) 0)) {
                this.f135626a.mo187294a(null, BitmapDescriptorFactory.HUE_RED);
                return;
            }
            float f2 = (float) 1;
            if (f < f2) {
                SlideHelper jVar2 = this.f135626a;
                jVar2.mo187294a(jVar2.mo187296b(), this.f135626a.f135614a * (f2 - f));
                return;
            }
            SlideHelper jVar3 = this.f135626a;
            jVar3.mo187294a(jVar3.mo187296b(), BitmapDescriptorFactory.HUE_RED);
            this.f135627b.getChildCount();
            this.f135627b.post(this.f135626a.f135617d);
        }
    }

    /* renamed from: a */
    public final void mo187294a(C0844e<View, Activity> eVar, float f) {
        if (this.f135624k != null) {
            if (!this.f135621h) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            F f2 = null;
            Drawable drawable = null;
            if (eVar != null) {
                f2 = eVar.f3317a;
                S s = eVar.f3318b;
                if (f2 != null && (s instanceof OnSlideDrawListener)) {
                    s.mo187281a();
                }
                if (s != null) {
                    Window window = s.getWindow();
                    Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
                    View decorView = window.getDecorView();
                    Intrinsics.checkExpressionValueIsNotNull(decorView, "activity.window.decorView");
                    drawable = decorView.getBackground();
                }
            }
            SlideFrameLayout slideFrameLayout = this.f135624k;
            if (slideFrameLayout != null) {
                slideFrameLayout.mo187223a(f2, f, drawable);
            }
        }
    }
}
