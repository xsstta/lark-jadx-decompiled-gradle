package com.ss.android.lark.guide.landing.general.view;

import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/guide/landing/general/view/ViewPagerAutoScrollController;", "", "()V", "autoScrollRunnable", "Ljava/lang/Runnable;", "getAutoScrollRunnable", "()Ljava/lang/Runnable;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "onPageChangeListener", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "getOnPageChangeListener", "()Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "setupViewPager", "", "startAutoScroll", "stopAutoScroll", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.landing.general.view.a */
public final class ViewPagerAutoScrollController {

    /* renamed from: b */
    public static final Companion f99346b = new Companion(null);

    /* renamed from: a */
    public ViewPager f99347a;

    /* renamed from: c */
    private Lifecycle f99348c;

    /* renamed from: d */
    private final Runnable f99349d = new RunnableC38648b(this);

    /* renamed from: e */
    private final ViewPager.C1581f f99350e = new C38649c(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/guide/landing/general/view/ViewPagerAutoScrollController$Companion;", "", "()V", "INTERVAL", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.landing.general.view.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final Runnable mo141562a() {
        return this.f99349d;
    }

    /* renamed from: b */
    public final ViewPager.C1581f mo141565b() {
        return this.f99350e;
    }

    /* renamed from: c */
    public final void mo141566c() {
        ViewPager viewPager = this.f99347a;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        mo141564a(viewPager, this.f99349d);
    }

    /* renamed from: d */
    public final void mo141567d() {
        ViewPager viewPager = this.f99347a;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        viewPager.removeCallbacks(this.f99349d);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.landing.general.view.a$b */
    static final class RunnableC38648b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ViewPagerAutoScrollController f99351a;

        RunnableC38648b(ViewPagerAutoScrollController aVar) {
            this.f99351a = aVar;
        }

        public final void run() {
            ViewPagerAutoScrollController.m152505a(this.f99351a).setCurrentItem(ViewPagerAutoScrollController.m152505a(this.f99351a).getCurrentItem() + 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/guide/landing/general/view/ViewPagerAutoScrollController$onPageChangeListener$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", "position", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.landing.general.view.a$c */
    public static final class C38649c extends ViewPager.C1581f {

        /* renamed from: a */
        final /* synthetic */ ViewPagerAutoScrollController f99352a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38649c(ViewPagerAutoScrollController aVar) {
            this.f99352a = aVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener, androidx.viewpager.widget.ViewPager.C1581f
        public void onPageSelected(int i) {
            ViewPagerAutoScrollController aVar = this.f99352a;
            aVar.mo141564a(ViewPagerAutoScrollController.m152505a(aVar), this.f99352a.mo141562a());
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ViewPager m152505a(ViewPagerAutoScrollController aVar) {
        ViewPager viewPager = aVar.f99347a;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        return viewPager;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.landing.general.view.a$d */
    static final class View$OnTouchListenerC38650d implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ ViewPagerAutoScrollController f99353a;

        View$OnTouchListenerC38650d(ViewPagerAutoScrollController aVar) {
            this.f99353a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f99353a.mo141567d();
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                return false;
            }
            this.f99353a.mo141566c();
            return false;
        }
    }

    /* renamed from: a */
    public final void mo141564a(ViewPager viewPager, Runnable runnable) {
        mo141567d();
        viewPager.postDelayed(runnable, 3000);
    }

    /* renamed from: a */
    public final void mo141563a(ViewPager viewPager, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(viewPager, "viewPager");
        Intrinsics.checkParameterIsNotNull(lifecycle, "lifecycle");
        this.f99347a = viewPager;
        this.f99348c = lifecycle;
        viewPager.setOnTouchListener(new View$OnTouchListenerC38650d(this));
        lifecycle.addObserver(new ViewPagerAutoScrollController$setupViewPager$2(this, viewPager));
    }
}
