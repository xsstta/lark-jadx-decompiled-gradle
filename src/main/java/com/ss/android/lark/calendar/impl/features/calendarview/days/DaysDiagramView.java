package com.ss.android.lark.calendar.impl.features.calendarview.days;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.AllDayChipData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DayChipData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DayRange;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.SettingReadyData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.C30745a;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.AllDayChipsLayer;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.DayChipsLayer;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layoutmanager.AllDayLayoutManager;
import com.ss.android.lark.calendar.impl.features.calendarview.days.widget.DateWeekView;
import com.ss.android.lark.calendar.impl.features.calendarview.days.widget.dayheader.DayWeekIndicator;
import com.ss.android.lark.calendar.impl.features.common.widget.guide.CalendarGuideManager;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchPerfMonitor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u000eH\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\b\u0010 \u001a\u00020\u0016H\u0002J\b\u0010!\u001a\u00020\u0016H\u0016J\b\u0010\"\u001a\u00020\u0016H\u0016J\b\u0010#\u001a\u00020\u0016H\u0016J\b\u0010$\u001a\u00020\u0016H\u0016J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\tH\u0016J\u0018\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u0010H\u0016J\b\u0010*\u001a\u00020\u0016H\u0016J\u0014\u0010+\u001a\u00020\u00162\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0006H\u0016J\b\u0010.\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysDiagramView;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramViewApi;", "Landroidx/lifecycle/LifecycleOwner;", "activity", "Landroid/app/Activity;", "mNumDays", "", "(Landroid/app/Activity;I)V", "isSettingReady", "", "isViewReady", "launchTmpTimeZoneId", "", "mLifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "mViewAction", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramViewAction;", "mViewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramViewData;", "mViewProvider", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysViewProvider;", "bindLiveData", "", "checkViewAndSettingReady", "clearAppendEvent", "clearEvent", "create", "destroy", "getDaysDiagramView", "Landroid/view/View;", "getLifecycle", "initLifeCycle", "initViewListener", "moveToSelectDay", "refreshAllPage", "refreshChipsMask", "refreshCurrentDay", "setDaysViewVisibility", "isVisible", "setDependency", "vi", "vo", "showViewTimeZoneGuide", "smoothToOffsetY", "smoothToSelectDay", "selectDay", "smoothToToday", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c */
public final class DaysDiagramView implements LifecycleOwner, IDaysDiagramContract.IDaysDiagramViewApi {

    /* renamed from: f */
    public static final Companion f77058f = new Companion(null);

    /* renamed from: a */
    public volatile boolean f77059a;

    /* renamed from: b */
    public volatile boolean f77060b;

    /* renamed from: c */
    public volatile String f77061c;

    /* renamed from: d */
    public final DaysViewProvider f77062d;

    /* renamed from: e */
    public IDaysDiagramContract.IDaysDiagramViewData f77063e;

    /* renamed from: g */
    private LifecycleRegistry f77064g = new LifecycleRegistry(this);

    /* renamed from: h */
    private IDaysDiagramContract.IDaysDiagramViewAction f77065h;

    /* renamed from: i */
    private final Activity f77066i;

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewApi
    /* renamed from: h */
    public void mo111035h() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysDiagramView$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public LifecycleRegistry getLifecycle() {
        return this.f77064g;
    }

    /* renamed from: l */
    private final void m114360l() {
        this.f77064g.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        this.f77064g.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewApi
    /* renamed from: c */
    public View mo111030c() {
        return this.f77062d.mo111094a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewApi
    /* renamed from: j */
    public void mo111037j() {
        this.f77062d.mo111106l().mo111147a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/DaysDiagramView$initViewListener$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/AllDayLayoutManager$IAllDayLayoutListener;", "onLayoutFinish", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c$k */
    public static final class C30719k implements AllDayLayoutManager.IAllDayLayoutListener {

        /* renamed from: a */
        final /* synthetic */ DaysDiagramView f77079a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.layoutmanager.AllDayLayoutManager.IAllDayLayoutListener
        /* renamed from: a */
        public void mo111050a() {
            Log.m165389i("DaysDiagramView", C32673y.m125378d("onLayoutFinish"));
            LaunchPerfMonitor.m124430d("show_grid");
            this.f77079a.f77059a = true;
            this.f77079a.mo111029b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30719k(DaysDiagramView cVar) {
            this.f77079a = cVar;
        }
    }

    /* renamed from: n */
    private final void m114362n() {
        this.f77062d.mo111102h().mo111058a(new C30719k(this));
    }

    /* renamed from: b */
    public final void mo111029b() {
        if (this.f77060b && this.f77059a) {
            UICallbackExecutor.execute(new RunnableC30718j(this));
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        LaunchPerfMonitor.m124423a("additional_type", "refactor_days");
        Log.m165389i("DaysDiagramView", C32673y.m125378d("create"));
        m114360l();
        m114361m();
        m114362n();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        Log.m165389i("DaysDiagramView", C32673y.m125378d("view destroy"));
        this.f77064g.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this.f77062d.mo111107m();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c$j */
    public static final class RunnableC30718j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DaysDiagramView f77078a;

        RunnableC30718j(DaysDiagramView cVar) {
            this.f77078a = cVar;
        }

        public final void run() {
            DaysDiagramView cVar = this.f77078a;
            cVar.mo111027a(cVar.f77061c);
            for (DayChipsLayer dayChipsLayer : this.f77078a.f77062d.mo111103i()) {
                dayChipsLayer.setCurrentDay(DaysDiagramView.m114358a(this.f77078a).mo110930j());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c$l */
    static final class C30720l extends Lambda implements Function0<Unit> {
        final /* synthetic */ DaysDiagramView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30720l(DaysDiagramView cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            DaysDiagramView.m114359a(this.this$0, null, 1, null);
            DayWeekIndicator f = this.this$0.f77062d.mo111100f();
            if (f != null) {
                f.setCurrentDay(DaysDiagramView.m114358a(this.this$0).mo110930j());
                f.setSelectedDay(DaysDiagramView.m114358a(this.this$0).mo110930j());
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewApi
    /* renamed from: f */
    public void mo111033f() {
        Log.m165389i("DaysDiagramView", C32673y.m125378d("smoothToToday"));
        this.f77062d.mo111106l().mo111147a();
        this.f77062d.mo111096b().mo113248a(new C30720l(this));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewApi
    /* renamed from: i */
    public void mo111036i() {
        if (UIUtils.isVisible(this.f77062d.mo111098d().getTimeZoneTextView())) {
            Log.m165389i("DaysDiagramView", C32673y.m125378d("view showViewTimeZoneGuide"));
            CalendarGuideManager.f78922a.mo113187a(this.f77066i, this.f77062d.mo111098d().getTimeZoneTextView());
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewApi
    /* renamed from: k */
    public void mo111038k() {
        for (AllDayChipsLayer allDayChipsLayer : this.f77062d.mo111101g()) {
            allDayChipsLayer.mo111280a();
        }
        for (DayChipsLayer dayChipsLayer : this.f77062d.mo111103i()) {
            dayChipsLayer.mo111311d();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewApi
    /* renamed from: d */
    public void mo111031d() {
        AllDayChipsLayer[] g = this.f77062d.mo111101g();
        ArrayList arrayList = new ArrayList(g.length);
        IDaysDiagramContract.IDaysDiagramViewData dVar = this.f77063e;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        int i = dVar.mo110929i();
        for (AllDayChipsLayer allDayChipsLayer : g) {
            if (i < allDayChipsLayer.getLayerStartDay() || i > allDayChipsLayer.getLayerEndDay()) {
                arrayList.add(new DayRange(allDayChipsLayer.getLayerStartDay(), allDayChipsLayer.getLayerEndDay()));
            } else {
                arrayList.add(0, new DayRange(allDayChipsLayer.getLayerStartDay(), allDayChipsLayer.getLayerEndDay()));
            }
        }
        IDaysDiagramContract.IDaysDiagramViewAction bVar = this.f77065h;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        bVar.mo111021a(CollectionsKt.toList(arrayList));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewApi
    /* renamed from: e */
    public void mo111032e() {
        DayWeekIndicator f = this.f77062d.mo111100f();
        if (f != null) {
            IDaysDiagramContract.IDaysDiagramViewData dVar = this.f77063e;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            f.setCurrentDay(dVar.mo110930j());
            IDaysDiagramContract.IDaysDiagramViewData dVar2 = this.f77063e;
            if (dVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            f.setSelectedDay(dVar2.mo110929i());
        }
        IDaysDiagramContract.IDaysDiagramViewData dVar3 = this.f77063e;
        if (dVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        int i = dVar3.mo110929i();
        IDaysDiagramContract.IDaysDiagramViewData dVar4 = this.f77063e;
        if (dVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        this.f77062d.mo111096b().mo113253d(i - dVar4.mo110930j());
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewApi
    /* renamed from: g */
    public void mo111034g() {
        DateWeekView[] e = this.f77062d.mo111099e();
        if (e != null) {
            for (DateWeekView dateWeekView : e) {
                IDaysDiagramContract.IDaysDiagramViewData dVar = this.f77063e;
                if (dVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewData");
                }
                dateWeekView.setToday(dVar.mo110930j());
            }
        }
        DayChipsLayer[] i = this.f77062d.mo111103i();
        for (DayChipsLayer dayChipsLayer : i) {
            IDaysDiagramContract.IDaysDiagramViewData dVar2 = this.f77063e;
            if (dVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            dayChipsLayer.setCurrentDay(dVar2.mo110930j());
        }
        mo111032e();
    }

    /* renamed from: m */
    private final void m114361m() {
        IDaysDiagramContract.IDaysDiagramViewData dVar = this.f77063e;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        DaysDiagramView cVar = this;
        dVar.mo110928h().mo110982a(cVar, new C30708b(this));
        IDaysDiagramContract.IDaysDiagramViewData dVar2 = this.f77063e;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        dVar2.mo110925e().mo110982a(cVar, new C30709c(this));
        IDaysDiagramContract.IDaysDiagramViewData dVar3 = this.f77063e;
        if (dVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        dVar3.mo110926f().mo110982a(cVar, new C30710d(this));
        IDaysDiagramContract.IDaysDiagramViewData dVar4 = this.f77063e;
        if (dVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        dVar4.mo110921a().mo5923a(cVar, new C30713e(this));
        IDaysDiagramContract.IDaysDiagramViewData dVar5 = this.f77063e;
        if (dVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        dVar5.mo110922b().mo5923a(cVar, new C30714f(this));
        IDaysDiagramContract.IDaysDiagramViewData dVar6 = this.f77063e;
        if (dVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        dVar6.mo110923c().mo5923a(cVar, new C30715g(this));
        IDaysDiagramContract.IDaysDiagramViewData dVar7 = this.f77063e;
        if (dVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        dVar7.mo110924d().mo5923a(cVar, new C30716h(this));
        IDaysDiagramContract.IDaysDiagramViewData dVar8 = this.f77063e;
        if (dVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        dVar8.mo110927g().mo5923a(cVar, new C30717i(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ IDaysDiagramContract.IDaysDiagramViewData m114358a(DaysDiagramView cVar) {
        IDaysDiagramContract.IDaysDiagramViewData dVar = cVar.f77063e;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "settingData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/SettingReadyData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c$b */
    public static final class C30708b<T> implements AbstractC1178x<SettingReadyData> {

        /* renamed from: a */
        final /* synthetic */ DaysDiagramView f77067a;

        C30708b(DaysDiagramView cVar) {
            this.f77067a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(SettingReadyData gVar) {
            Log.m165389i("DaysDiagramView", C32673y.m125378d("View Observer settingData = " + gVar));
            AllDayLayoutManager h = this.f77067a.f77062d.mo111102h();
            Intrinsics.checkExpressionValueIsNotNull(gVar, "settingData");
            h.mo111056a(gVar);
            this.f77067a.f77060b = true;
            this.f77067a.f77061c = gVar.mo110985b();
            this.f77067a.mo111029b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "dayOfWeek", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c$e */
    public static final class C30713e<T> implements AbstractC1178x<CalendarSetting.DayOfWeek> {

        /* renamed from: a */
        final /* synthetic */ DaysDiagramView f77073a;

        C30713e(DaysDiagramView cVar) {
            this.f77073a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(CalendarSetting.DayOfWeek dayOfWeek) {
            Log.m165389i("DaysDiagramView", C32673y.m125378d("View Observer dayOfWeek = " + dayOfWeek));
            if (dayOfWeek != null) {
                this.f77073a.f77062d.mo111102h().mo111060a(dayOfWeek);
                DayWeekIndicator f = this.f77073a.f77062d.mo111100f();
                if (f != null) {
                    f.setFirstDayOfWeek(dayOfWeek);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c$g */
    public static final class C30715g<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DaysDiagramView f77075a;

        C30715g(DaysDiagramView cVar) {
            this.f77075a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Log.m165389i("DaysDiagramView", C32673y.m125378d("View Observer twelveTimeFormat = " + bool));
            this.f77075a.f77062d.mo111105k().mo111333a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c$i */
    public static final class C30717i<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ DaysDiagramView f77077a;

        C30717i(DaysDiagramView cVar) {
            this.f77077a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            Log.m165389i("DaysDiagramView", C32673y.m125378d("View defaultEventDuration = " + num));
            C30745a l = this.f77077a.f77062d.mo111106l();
            Intrinsics.checkExpressionValueIsNotNull(num, "it");
            l.setDefaultEventDuration(num.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "allDayData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/AllDayChipData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c$c */
    public static final class C30709c<T> implements AbstractC1178x<AllDayChipData> {

        /* renamed from: a */
        final /* synthetic */ DaysDiagramView f77068a;

        C30709c(DaysDiagramView cVar) {
            this.f77068a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(AllDayChipData aVar) {
            Log.m165389i("DaysDiagramView", C32673y.m125378d("View  Observer allDayData = " + aVar));
            if (aVar != null) {
                AllDayChipsLayer[] g = this.f77068a.f77062d.mo111101g();
                for (AllDayChipsLayer allDayChipsLayer : g) {
                    if (aVar.mo110932a(Integer.valueOf(allDayChipsLayer.getLayerStartDay()), Integer.valueOf(allDayChipsLayer.getLayerEndDay()))) {
                        allDayChipsLayer.mo111283a(aVar);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "dayData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DayChipData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c$d */
    public static final class C30710d<T> implements AbstractC1178x<DayChipData> {

        /* renamed from: a */
        final /* synthetic */ DaysDiagramView f77069a;

        C30710d(DaysDiagramView cVar) {
            this.f77069a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(final DayChipData cVar) {
            Log.m165389i("DaysDiagramView", C32673y.m125378d("View Observer dayData = " + cVar));
            if (cVar != null) {
                DayChipsLayer[] i = this.f77069a.f77062d.mo111103i();
                for (final DayChipsLayer dayChipsLayer : i) {
                    if (dayChipsLayer.getLayerDay() == cVar.mo110947a()) {
                        if (!cVar.mo110949c() || dayChipsLayer.mo111307a()) {
                            dayChipsLayer.mo111305a(cVar);
                        } else {
                            UICallbackExecutor.executeDelayed(new Runnable() {
                                /* class com.ss.android.lark.calendar.impl.features.calendarview.days.DaysDiagramView.C30710d.RunnableC307111 */

                                public final void run() {
                                    CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                                    Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                                    coreThreadPool.getCachedThreadPool().submit(new Runnable(this) {
                                        /* class com.ss.android.lark.calendar.impl.features.calendarview.days.DaysDiagramView.C30710d.RunnableC307111.RunnableC307121 */

                                        /* renamed from: a */
                                        final /* synthetic */ RunnableC307111 f77072a;

                                        {
                                            this.f77072a = r1;
                                        }

                                        public final void run() {
                                            dayChipsLayer.mo111305a(cVar);
                                        }
                                    });
                                }
                            }, 150);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isShowLunarDay", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c$f */
    public static final class C30714f<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DaysDiagramView f77074a;

        C30714f(DaysDiagramView cVar) {
            this.f77074a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Log.m165389i("DaysDiagramView", C32673y.m125378d("View Observer isShowLunarDay = " + bool));
            if (bool != null) {
                bool.booleanValue();
                this.f77074a.f77062d.mo111097c().mo110873a(bool.booleanValue());
                DateWeekView[] e = this.f77074a.f77062d.mo111099e();
                if (e != null) {
                    for (DateWeekView dateWeekView : e) {
                        dateWeekView.mo111369a(bool.booleanValue());
                    }
                }
                DayWeekIndicator f = this.f77074a.f77062d.mo111100f();
                if (f != null) {
                    f.setShowLunarDay(bool.booleanValue());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo111027a(String str) {
        TimeZone timeZone;
        if (TextUtils.isEmpty(str)) {
            IDaysDiagramContract.IDaysDiagramViewData dVar = this.f77063e;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            str = dVar.mo110924d().mo5927b();
        }
        if (str == null || (timeZone = TimeZone.getTimeZone(str)) == null) {
            timeZone = TimeZone.getDefault();
        }
        this.f77062d.mo111096b().mo113251b((int) (((-this.f77062d.mo111097c().mo110877d()) * ((float) new CalendarDate(timeZone).getDayMinutes())) + ((float) (this.f77062d.mo111097c().mo110874b() / 4))));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "timeZoneId", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c$h */
    public static final class C30716h<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ DaysDiagramView f77076a;

        C30716h(DaysDiagramView cVar) {
            this.f77076a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            Log.m165389i("DaysDiagramView", C32673y.m125378d("View timeZoneId = " + str));
            this.f77076a.f77062d.mo111098d().mo112460a(str);
            DateWeekView[] e = this.f77076a.f77062d.mo111099e();
            if (e != null) {
                for (DateWeekView dateWeekView : e) {
                    dateWeekView.mo111368a(str);
                }
            }
            DayChipsLayer[] i = this.f77076a.f77062d.mo111103i();
            for (DayChipsLayer dayChipsLayer : i) {
                dayChipsLayer.setRedLineTimeZone(str);
                dayChipsLayer.setCurrentDay(DaysDiagramView.m114358a(this.f77076a).mo110930j());
            }
            this.f77076a.f77062d.mo111102h().mo111061a(str);
            this.f77076a.f77062d.mo111104j().mo111082a(str);
            DayWeekIndicator f = this.f77076a.f77062d.mo111100f();
            if (f != null) {
                f.setCurrentDay(DaysDiagramView.m114358a(this.f77076a).mo110930j());
                f.setSelectedDay(DaysDiagramView.m114358a(this.f77076a).mo110929i());
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewApi
    /* renamed from: a */
    public void mo111028a(boolean z) {
        int i;
        Log.m165389i("DaysDiagramView", C32673y.m125378d("setDaysViewVisibility = " + z));
        SnapScrollView a = this.f77062d.mo111094a();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        a.setVisibility(i);
        if (!z) {
            for (AllDayChipsLayer allDayChipsLayer : this.f77062d.mo111101g()) {
                allDayChipsLayer.mo111280a();
            }
            for (DayChipsLayer dayChipsLayer : this.f77062d.mo111103i()) {
                dayChipsLayer.mo111311d();
            }
        }
    }

    public DaysDiagramView(Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f77066i = activity;
        this.f77062d = new DaysViewProvider(activity, i);
    }

    /* renamed from: a */
    public void mo109795a(IDaysDiagramContract.IDaysDiagramViewData dVar, IDaysDiagramContract.IDaysDiagramViewAction bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "vi");
        Intrinsics.checkParameterIsNotNull(bVar, "vo");
        this.f77063e = dVar;
        this.f77065h = bVar;
        this.f77062d.mo111095a(dVar, bVar);
    }

    /* renamed from: a */
    static /* synthetic */ void m114359a(DaysDiagramView cVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        cVar.mo111027a(str);
    }
}
