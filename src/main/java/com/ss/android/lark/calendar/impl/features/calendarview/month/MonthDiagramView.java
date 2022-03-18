package com.ss.android.lark.calendar.impl.features.calendarview.month;

import android.content.Context;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.MonthChipDataCache;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract;
import com.ss.android.lark.calendar.impl.features.calendarview.month.MonthDiagramModel;
import com.ss.android.lark.calendar.impl.features.calendarview.month.listener.IMonthDayViewListener;
import com.ss.android.lark.calendar.impl.features.calendarview.month.p1485a.AbstractC30947b;
import com.ss.android.lark.calendar.impl.features.calendarview.month.view.AbstractC30969a;
import com.ss.android.lark.calendar.impl.features.calendarview.month.view.C30978e;
import com.ss.android.lark.calendar.impl.features.calendarview.month.view.MonthContainViewPager;
import com.ss.android.lark.calendar.impl.features.calendarview.month.view.View$OnTouchListenerC30971c;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31109e;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31111g;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31180b;
import com.ss.ttm.player.MediaPlayer;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u001e\u0010\u001a\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0018H\u0002J\b\u0010!\u001a\u00020\u0018H\u0016J\b\u0010\"\u001a\u00020\u0018H\u0016J\b\u0010#\u001a\u00020\nH\u0016J\b\u0010$\u001a\u00020\fH\u0016J\b\u0010%\u001a\u00020\u0018H\u0002J\b\u0010&\u001a\u00020\u0018H\u0002J\b\u0010'\u001a\u00020\u0018H\u0002J\b\u0010(\u001a\u00020)H\u0002J\u0018\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020)H\u0002J\u0010\u0010-\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u001dH\u0016J\u0018\u0010-\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020)H\u0002J\u0010\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u000200H\u0002J\u0018\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u0014H\u0016J\u0010\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020\u0018H\u0016R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramView;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$IMonthDiagramViewApi;", "Landroidx/lifecycle/LifecycleOwner;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mContext", "getMContext", "()Landroid/content/Context;", "mLifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "mMonthContainViewPager", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/view/MonthContainViewPager;", "getMMonthContainViewPager", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/month/view/MonthContainViewPager;", "mMonthContainViewPager$delegate", "Lkotlin/Lazy;", "mMonthViewPagerAdapter", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/view/MonthViewPagerAdapter;", "mViewAction", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$IMonthDiagramViewAction;", "mViewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$IMonthDiagramViewData;", "asyncCheckDrawMask", "", "bindLiveData", "bindPageWithData", "pagePositionList", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$PagePosition;", "monthChipLiveData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$MonthChipLiveData;", "clickCurrentDate", "create", "destroy", "getLifecycle", "getMonthContainViewPager", "initLifeCycle", "initMonthAdapter", "initViewPagerListener", "isCurrentDateOpen", "", "movePageDateByJudgeAdjacent", "pagePosition", "isAdjacent", "moveToMonthPage", "scrollBySelectCurrentState", "state", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$SelectCurrentState;", "setDependency", "viewData", "viewAction", "setViewPagerVisibility", "visibility", "", "showCurrentDateAfterModify", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.c */
public final class MonthDiagramView implements LifecycleOwner, IMonthDiagramContract.IMonthDiagramViewApi {

    /* renamed from: a */
    public IMonthDiagramContract.IMonthDiagramViewData f77965a;

    /* renamed from: b */
    public IMonthDiagramContract.IMonthDiagramViewAction f77966b;

    /* renamed from: c */
    private final Context f77967c;

    /* renamed from: d */
    private LifecycleRegistry f77968d = new LifecycleRegistry(this);

    /* renamed from: e */
    private final Lazy f77969e = LazyKt.lazy(new C30958j(this));

    /* renamed from: f */
    private C30978e f77970f;

    /* renamed from: e */
    public final MonthContainViewPager mo112065e() {
        return (MonthContainViewPager) this.f77969e.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramView$initViewPagerListener$2", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.c$i */
    public static final class C30957i implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
        }

        C30957i() {
        }
    }

    /* renamed from: d */
    public final Context mo112064d() {
        return this.f77967c;
    }

    /* renamed from: g */
    public LifecycleRegistry getLifecycle() {
        return this.f77968d;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramViewApi
    /* renamed from: a */
    public MonthContainViewPager mo112024a() {
        return mo112065e();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f77968d.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramView$initMonthAdapter$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/month/IMonthDateFetcher;", "fetchCurrentDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "fetchSelectedDate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.c$d */
    public static final class C30952d implements AbstractC31180b {

        /* renamed from: a */
        final /* synthetic */ MonthDiagramView f77975a;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31180b
        /* renamed from: a */
        public CalendarDate mo111730a() {
            return MonthDiagramView.m115520a(this.f77975a).mo112031d();
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31180b
        /* renamed from: b */
        public CalendarDate mo111731b() {
            return MonthDiagramView.m115520a(this.f77975a).mo112032e();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30952d(MonthDiagramView cVar) {
            this.f77975a = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onFinishInflatePages"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.c$g */
    public static final class C30955g implements AbstractC31111g {

        /* renamed from: a */
        final /* synthetic */ MonthDiagramView f77978a;

        C30955g(MonthDiagramView cVar) {
            this.f77978a = cVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31111g
        /* renamed from: a */
        public final void mo108584a() {
            MonthDiagramView.m115521b(this.f77978a).mo112016a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramView$initViewPagerListener$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/listener/IOnMonthViewPageListener;", "onFetchSettingItemsData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$SettingItemsData;", "onLeftScrollFinished", "", "onRightScrollFinished", "onSelectDateChanged", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.c$h */
    public static final class C30956h implements AbstractC30947b {

        /* renamed from: a */
        final /* synthetic */ MonthDiagramView f77979a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.p1485a.AbstractC30947b
        /* renamed from: a */
        public void mo112051a() {
            MonthDiagramView.m115521b(this.f77979a).mo112021b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.p1485a.AbstractC30947b
        /* renamed from: b */
        public void mo112053b() {
            MonthDiagramView.m115521b(this.f77979a).mo112022c();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.p1485a.AbstractC30947b
        /* renamed from: c */
        public MonthDiagramModel.SettingItemsData mo112054c() {
            return MonthDiagramView.m115520a(this.f77979a).mo112033f();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30956h(MonthDiagramView cVar) {
            this.f77979a = cVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.p1485a.AbstractC30947b
        /* renamed from: a */
        public void mo112052a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
            MonthDiagramView.m115521b(this.f77979a).mo112019a(calendarDate, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/view/MonthContainViewPager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.c$j */
    static final class C30958j extends Lambda implements Function0<MonthContainViewPager> {
        final /* synthetic */ MonthDiagramView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30958j(MonthDiagramView cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MonthContainViewPager invoke() {
            return new MonthContainViewPager(this.this$0.mo112064d());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.c$l */
    public static final class RunnableC30960l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MonthDiagramView f77981a;

        /* renamed from: b */
        final /* synthetic */ IMonthDiagramContract.PagePosition f77982b;

        /* renamed from: c */
        final /* synthetic */ boolean f77983c;

        RunnableC30960l(MonthDiagramView cVar, IMonthDiagramContract.PagePosition pagePosition, boolean z) {
            this.f77981a = cVar;
            this.f77982b = pagePosition;
            this.f77983c = z;
        }

        public final void run() {
            this.f77981a.mo112060a(this.f77982b, this.f77983c);
        }
    }

    /* renamed from: h */
    private final void m115523h() {
        this.f77968d.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        this.f77968d.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onSmoothScrollFinish"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.c$k */
    public static final class C30959k implements AbstractC31109e {

        /* renamed from: a */
        final /* synthetic */ MonthDiagramView f77980a;

        C30959k(MonthDiagramView cVar) {
            this.f77980a = cVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31109e
        /* renamed from: a */
        public final void mo111736a() {
            this.f77980a.mo112065e().mo112079b(MonthDiagramView.m115520a(this.f77980a).mo112033f());
            MonthDiagramView.m115521b(this.f77980a).mo112023d();
        }
    }

    /* renamed from: j */
    private final boolean m115525j() {
        View$OnTouchListenerC30971c centerView = mo112065e().getCenterView();
        if (centerView != null) {
            return centerView.mo112119d();
        }
        return false;
    }

    /* renamed from: l */
    private final void m115527l() {
        mo112065e().setViewPagerListener(new C30956h(this));
        mo112065e().addOnPageChangeListener(new C30957i());
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramViewApi
    /* renamed from: c */
    public void mo112027c() {
        C30978e eVar = this.f77970f;
        if (eVar != null) {
            IMonthDiagramContract.IMonthDiagramViewData dVar = this.f77965a;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            eVar.mo112163a(dVar.mo112031d());
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m115526k();
        m115527l();
        mo112065e().setAdapter(this.f77970f);
        m115523h();
        m115524i();
    }

    /* renamed from: k */
    private final void m115526k() {
        C30978e eVar = new C30978e(this.f77967c, new C30952d(this), new C30953e(this));
        this.f77970f = eVar;
        if (eVar != null) {
            eVar.mo112165a(new C30954f(this));
        }
        C30978e eVar2 = this.f77970f;
        if (eVar2 != null) {
            eVar2.mo112166a(new C30955g(this));
        }
    }

    /* renamed from: f */
    public final void mo112066f() {
        if (mo112065e().getScrollState() == 0) {
            View$OnTouchListenerC30971c centerView = mo112065e().getCenterView();
            IMonthDiagramContract.IMonthDiagramViewData dVar = this.f77965a;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            centerView.mo112117b(dVar.mo112031d());
        }
    }

    /* renamed from: i */
    private final void m115524i() {
        List listOf = CollectionsKt.listOf((Object[]) new IMonthDiagramContract.PagePosition[]{IMonthDiagramContract.PagePosition.LEFT, IMonthDiagramContract.PagePosition.CENTER, IMonthDiagramContract.PagePosition.RIGHT});
        IMonthDiagramContract.IMonthDiagramViewData dVar = this.f77965a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        MonthDiagramView cVar = this;
        dVar.mo112028a().mo5923a(cVar, new C30949a(this, listOf));
        IMonthDiagramContract.IMonthDiagramViewData dVar2 = this.f77965a;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        dVar2.mo112029b().mo5923a(cVar, new C30950b(this));
        IMonthDiagramContract.IMonthDiagramViewData dVar3 = this.f77965a;
        if (dVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        dVar3.mo112030c().mo5923a(cVar, new C30951c(this));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramViewApi
    /* renamed from: b */
    public void mo112026b() {
        View$OnTouchListenerC30971c centerView = mo112065e().getCenterView();
        if (centerView != null) {
            centerView.mo112116b();
        }
        View$OnTouchListenerC30971c leftView = mo112065e().getLeftView();
        if (leftView != null) {
            leftView.mo112116b();
        }
        View$OnTouchListenerC30971c rightView = mo112065e().getRightView();
        if (rightView != null) {
            rightView.mo112116b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramView$initMonthAdapter$2", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/listener/IMonthDayViewListener;", "onClickAppendBtn", "", "selectedDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "onClickMonthChipView", "chipViewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/EventChipViewData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.c$e */
    public static final class C30953e implements IMonthDayViewListener {

        /* renamed from: a */
        final /* synthetic */ MonthDiagramView f77976a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30953e(MonthDiagramView cVar) {
            this.f77976a = cVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.listener.IMonthDayViewListener
        /* renamed from: a */
        public void mo112049a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectedDate");
            MonthDiagramView.m115521b(this.f77976a).mo112018a(calendarDate);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.listener.IMonthDayViewListener
        /* renamed from: a */
        public void mo112050a(EventChipViewData eventChipViewData) {
            Intrinsics.checkParameterIsNotNull(eventChipViewData, "chipViewData");
            MonthDiagramView.m115521b(this.f77976a).mo112020a(eventChipViewData);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "monthChipLiveData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$MonthChipLiveData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.c$a */
    public static final class C30949a<T> implements AbstractC1178x<MonthDiagramModel.MonthChipLiveData> {

        /* renamed from: a */
        final /* synthetic */ MonthDiagramView f77971a;

        /* renamed from: b */
        final /* synthetic */ List f77972b;

        C30949a(MonthDiagramView cVar, List list) {
            this.f77971a = cVar;
            this.f77972b = list;
        }

        /* renamed from: a */
        public final void onChanged(MonthDiagramModel.MonthChipLiveData bVar) {
            MonthDiagramView cVar = this.f77971a;
            List<? extends IMonthDiagramContract.PagePosition> list = this.f77972b;
            Intrinsics.checkExpressionValueIsNotNull(bVar, "monthChipLiveData");
            cVar.mo112063a(list, bVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$SettingItemsData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.c$c */
    public static final class C30951c<T> implements AbstractC1178x<MonthDiagramModel.SettingItemsData> {

        /* renamed from: a */
        final /* synthetic */ MonthDiagramView f77974a;

        C30951c(MonthDiagramView cVar) {
            this.f77974a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(MonthDiagramModel.SettingItemsData dVar) {
            this.f77974a.mo112065e().mo112078a(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "kotlin.jvm.PlatformType", "onSelectDateChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.c$f */
    public static final class C30954f implements AbstractC30969a {

        /* renamed from: a */
        final /* synthetic */ MonthDiagramView f77977a;

        C30954f(MonthDiagramView cVar) {
            this.f77977a = cVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.view.AbstractC30969a
        /* renamed from: a */
        public final void mo112071a(CalendarDate calendarDate) {
            IMonthDiagramContract.IMonthDiagramViewAction b = MonthDiagramView.m115521b(this.f77977a);
            Intrinsics.checkExpressionValueIsNotNull(calendarDate, "selectDate");
            b.mo112019a(calendarDate, false);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IMonthDiagramContract.IMonthDiagramViewData m115520a(MonthDiagramView cVar) {
        IMonthDiagramContract.IMonthDiagramViewData dVar = cVar.f77965a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        return dVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ IMonthDiagramContract.IMonthDiagramViewAction m115521b(MonthDiagramView cVar) {
        IMonthDiagramContract.IMonthDiagramViewAction bVar = cVar.f77966b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "selectCurrentState", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$SelectCurrentState;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.c$b */
    public static final class C30950b<T> implements AbstractC1178x<MonthDiagramModel.SelectCurrentState> {

        /* renamed from: a */
        final /* synthetic */ MonthDiagramView f77973a;

        C30950b(MonthDiagramView cVar) {
            this.f77973a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(MonthDiagramModel.SelectCurrentState selectCurrentState) {
            if (selectCurrentState == MonthDiagramModel.SelectCurrentState.SELECT_CURRENT_EQUAL || selectCurrentState == MonthDiagramModel.SelectCurrentState.SELECT_CURRENT_SAME_PAGE) {
                this.f77973a.mo112066f();
                return;
            }
            MonthDiagramView cVar = this.f77973a;
            Intrinsics.checkExpressionValueIsNotNull(selectCurrentState, "selectCurrentState");
            cVar.mo112062a(selectCurrentState);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramViewApi
    /* renamed from: a */
    public void mo112025a(int i) {
        mo112065e().setVisibility(i);
        if (i == 0) {
            MonthContainViewPager e = mo112065e();
            IMonthDiagramContract.IMonthDiagramViewData dVar = this.f77965a;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            e.mo112078a(dVar.mo112033f());
        }
    }

    public MonthDiagramView(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f77967c = context;
    }

    /* renamed from: a */
    public final void mo112062a(MonthDiagramModel.SelectCurrentState selectCurrentState) {
        int i;
        IMonthDiagramContract.PagePosition pagePosition;
        IMonthDiagramContract.PagePosition pagePosition2;
        IMonthDiagramContract.IMonthDiagramViewAction bVar = this.f77966b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        if (m115525j()) {
            i = 750;
        } else {
            i = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
        }
        bVar.mo112017a(i);
        if (selectCurrentState == MonthDiagramModel.SelectCurrentState.SELECT_CURRENT_LEFT_PAGE || selectCurrentState == MonthDiagramModel.SelectCurrentState.SELECT_CURRENT_RIGHT_PAGE) {
            if (selectCurrentState == MonthDiagramModel.SelectCurrentState.SELECT_CURRENT_LEFT_PAGE) {
                pagePosition = IMonthDiagramContract.PagePosition.RIGHT;
            } else {
                pagePosition = IMonthDiagramContract.PagePosition.LEFT;
            }
            m115522b(pagePosition, true);
            return;
        }
        if (selectCurrentState == MonthDiagramModel.SelectCurrentState.SELECT_CURRENT_LEFT_NOT_ADJACENT) {
            pagePosition2 = IMonthDiagramContract.PagePosition.RIGHT;
        } else {
            pagePosition2 = IMonthDiagramContract.PagePosition.LEFT;
        }
        MonthContainViewPager e = mo112065e();
        int number = pagePosition2.getNumber();
        IMonthDiagramContract.IMonthDiagramViewData dVar = this.f77965a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        e.mo112077a(number, dVar.mo112033f());
        m115522b(pagePosition2, false);
    }

    /* renamed from: b */
    private final void m115522b(IMonthDiagramContract.PagePosition pagePosition, boolean z) {
        if (!m115525j()) {
            mo112060a(pagePosition, z);
            return;
        }
        View$OnTouchListenerC30971c centerView = mo112065e().getCenterView();
        if (centerView != null) {
            centerView.mo112115a(true);
        }
        UICallbackExecutor.executeDelayed(new RunnableC30960l(this, pagePosition, z), (long) 350);
    }

    /* renamed from: a */
    public final void mo112060a(IMonthDiagramContract.PagePosition pagePosition, boolean z) {
        mo112065e().mo113203a(pagePosition.getNumber(), z);
        mo112065e().mo112076a();
        if (!z) {
            mo112065e().setOnSmoothScrollFinishListener(new C30959k(this));
        }
    }

    /* renamed from: a */
    public void mo109795a(IMonthDiagramContract.IMonthDiagramViewData dVar, IMonthDiagramContract.IMonthDiagramViewAction bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "viewData");
        Intrinsics.checkParameterIsNotNull(bVar, "viewAction");
        this.f77965a = dVar;
        this.f77966b = bVar;
    }

    /* renamed from: a */
    public final void mo112063a(List<? extends IMonthDiagramContract.PagePosition> list, MonthDiagramModel.MonthChipLiveData bVar) {
        View$OnTouchListenerC30971c cVar;
        for (IMonthDiagramContract.PagePosition pagePosition : list) {
            C30978e eVar = this.f77970f;
            if (!(eVar == null || (cVar = (View$OnTouchListenerC30971c) eVar.mo113215d(pagePosition.getNumber())) == null)) {
                CalendarDate startDate = cVar.getStartDate();
                Intrinsics.checkExpressionValueIsNotNull(startDate, "monthPageView.startDate");
                if (startDate.getJulianDay() == bVar.mo112038a()) {
                    MonthChipDataCache.MonthChipData b = bVar.mo112039b();
                    cVar.mo112113a(b.mo110804a(), b.mo110806c(), b.mo110805b());
                    return;
                }
            }
        }
    }
}
