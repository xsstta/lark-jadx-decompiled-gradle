package com.ss.android.lark.slideback;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.C0844e;
import androidx.fragment.app.Fragment;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.slideback.SlideFrameLayout;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001+B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\nH\u0002J\u0016\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0002J&\u0010 \u001a\u00020\u00182\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c2\u0006\u0010\"\u001a\u00020\u0006H\u0002J\u0010\u0010#\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\nJ\u000e\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\nJ\u0010\u0010)\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0015\u0010\u0016¨\u0006,"}, d2 = {"Lcom/ss/android/lark/slideback/ActivitySlideHelper;", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "mBackPreviewViewInitOffset", "", "mFinishTask", "Ljava/lang/Runnable;", "mNeedFinishActivityFlag", "", "mOnSlideFinishListener", "Lcom/ss/android/lark/slideback/OnSlideFinishListener;", "mPageManager", "Lcom/ss/android/lark/slideback/ActivitySlideHelper$IPageManager;", "mPreviousViewSlideFollow", "mSlideEdgePercent", "mSlideFrameLayout", "Lcom/ss/android/lark/slideback/SlideFrameLayout;", "value", "mSlideable", "setMSlideable", "(Z)V", "addViewToDecorView", "", "slideLayout", "checkEnableSlide", "getPreviousViewInfo", "Landroidx/core/util/Pair;", "Landroid/view/View;", "hideKeyboard", "initSlideLayout", "offsetPreviousSnapshot", "snapshot", "translateX", "setPageManager", "pageManager", "setPreviousActivitySlideFollow", "previousActivitySlideFollow", "setSlideable", "slideable", "setupEdge", "setupListener", "IPageManager", "slideback_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.slideback.a */
public final class ActivitySlideHelper {

    /* renamed from: a */
    public float f135597a;

    /* renamed from: b */
    public boolean f135598b;

    /* renamed from: c */
    public final OnSlideFinishListener f135599c;

    /* renamed from: d */
    public IPageManager f135600d;

    /* renamed from: e */
    public final Runnable f135601e;

    /* renamed from: f */
    public final AppCompatActivity f135602f;

    /* renamed from: g */
    private float f135603g = 0.25f;

    /* renamed from: h */
    private boolean f135604h = SlideBack.f135613b.mo187290a();

    /* renamed from: i */
    private boolean f135605i = true;

    /* renamed from: j */
    private SlideFrameLayout f135606j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/slideback/ActivitySlideHelper$IPageManager;", "", "lastPage", "Landroidx/fragment/app/Fragment;", "getLastPage", "()Landroidx/fragment/app/Fragment;", "topPage", "getTopPage", "handleBack", "", "slideback_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.slideback.a$a */
    public interface IPageManager {
        /* renamed from: a */
        Fragment mo157161a();

        /* renamed from: b */
        void mo157162b();
    }

    /* renamed from: c */
    private final void m212947c() {
        if (m212949d()) {
            SlideFrameLayout slideFrameLayout = new SlideFrameLayout(this.f135602f);
            this.f135606j = slideFrameLayout;
            m212948c(slideFrameLayout);
            m212945b(slideFrameLayout);
            m212944a(slideFrameLayout);
        }
    }

    /* renamed from: d */
    private final boolean m212949d() {
        if (SlideBack.f135613b.mo187290a() && this.f135604h) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final C0844e<View, AppCompatActivity> mo187273b() {
        Fragment fragment;
        IPageManager aVar = this.f135600d;
        if (aVar != null) {
            fragment = aVar.mo157161a();
        } else {
            fragment = null;
        }
        if (fragment == null || !fragment.isVisible()) {
            return null;
        }
        return C0844e.m3988a(fragment.getView(), this.f135602f);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.slideback.a$b */
    static final class RunnableC54919b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ActivitySlideHelper f135607a;

        RunnableC54919b(ActivitySlideHelper aVar) {
            this.f135607a = aVar;
        }

        public final void run() {
            this.f135607a.f135598b = false;
            if (this.f135607a.f135599c == null || !this.f135607a.f135599c.mo187282a()) {
                IPageManager aVar = this.f135607a.f135600d;
                if (aVar != null) {
                    aVar.mo157162b();
                }
                this.f135607a.f135602f.overridePendingTransition(R.anim.none, R.anim.none);
            }
        }
    }

    /* renamed from: a */
    public final void mo187269a() {
        Object systemService = this.f135602f.getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            View currentFocus = this.f135602f.getCurrentFocus();
            if (currentFocus != null && inputMethodManager.isActive()) {
                Intrinsics.checkExpressionValueIsNotNull(currentFocus, "this");
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* renamed from: a */
    public final void mo187271a(IPageManager aVar) {
        this.f135600d = aVar;
    }

    /* renamed from: a */
    public final void mo187272a(boolean z) {
        m212946b(z);
    }

    /* renamed from: b */
    private final void m212946b(boolean z) {
        this.f135604h = z;
        SlideFrameLayout slideFrameLayout = this.f135606j;
        if (slideFrameLayout != null) {
            slideFrameLayout.setSlideable(z);
        }
    }

    public ActivitySlideHelper(AppCompatActivity appCompatActivity) {
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "activity");
        this.f135602f = appCompatActivity;
        m212947c();
        this.f135601e = new RunnableC54919b(this);
    }

    /* renamed from: b */
    private final void m212945b(SlideFrameLayout slideFrameLayout) {
        Resources resources = this.f135602f.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "activity.resources");
        this.f135597a = ((float) resources.getDisplayMetrics().widthPixels) * -0.33333334f;
        slideFrameLayout.mo187225a(new C54920c(this, slideFrameLayout));
    }

    /* renamed from: c */
    private final void m212948c(SlideFrameLayout slideFrameLayout) {
        Resources resources = this.f135602f.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "activity.resources");
        slideFrameLayout.setEdgeSize((int) (((float) resources.getDisplayMetrics().widthPixels) * this.f135603g));
    }

    /* renamed from: a */
    private final void m212944a(SlideFrameLayout slideFrameLayout) {
        Window window = this.f135602f.getWindow();
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/slideback/ActivitySlideHelper$setupListener$1", "Lcom/ss/android/lark/slideback/SlideFrameLayout$SlidingListener;", "continueSettling", "", "panel", "Landroid/view/View;", "settling", "", "onPanelSlide", "slideOffset", "", "onSlideStateChanged", "state", "", "slideback_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.slideback.a$c */
    public static final class C54920c implements SlideFrameLayout.AbstractC54913h {

        /* renamed from: a */
        final /* synthetic */ ActivitySlideHelper f135608a;

        /* renamed from: b */
        final /* synthetic */ SlideFrameLayout f135609b;

        @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54913h
        /* renamed from: a */
        public void mo22170a(View view, boolean z) {
            Intrinsics.checkParameterIsNotNull(view, "panel");
        }

        C54920c(ActivitySlideHelper aVar, SlideFrameLayout slideFrameLayout) {
            this.f135608a = aVar;
            this.f135609b = slideFrameLayout;
        }

        @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54913h
        /* renamed from: a */
        public void mo22169a(View view, int i) {
            Intrinsics.checkParameterIsNotNull(view, "panel");
            if (i == 1) {
                this.f135608a.mo187269a();
                this.f135609b.clearFocus();
            }
        }

        @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54913h
        /* renamed from: a */
        public void mo22168a(View view, float f) {
            boolean z;
            ActivitySlideHelper aVar = this.f135608a;
            if (f >= 1.0f) {
                z = true;
            } else {
                z = false;
            }
            aVar.f135598b = z;
            if (f <= ((float) 0)) {
                this.f135608a.mo187270a(null, BitmapDescriptorFactory.HUE_RED);
                return;
            }
            float f2 = (float) 1;
            if (f < f2) {
                ActivitySlideHelper aVar2 = this.f135608a;
                aVar2.mo187270a(aVar2.mo187273b(), this.f135608a.f135597a * (f2 - f));
                return;
            }
            ActivitySlideHelper aVar3 = this.f135608a;
            aVar3.mo187270a(aVar3.mo187273b(), BitmapDescriptorFactory.HUE_RED);
            this.f135609b.getChildCount();
            this.f135609b.post(this.f135608a.f135601e);
        }
    }

    /* renamed from: a */
    public final void mo187270a(C0844e<View, AppCompatActivity> eVar, float f) {
        if (this.f135606j != null) {
            if (!this.f135605i) {
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
            SlideFrameLayout slideFrameLayout = this.f135606j;
            if (slideFrameLayout != null) {
                slideFrameLayout.mo187223a(f2, f, drawable);
            }
        }
    }
}
