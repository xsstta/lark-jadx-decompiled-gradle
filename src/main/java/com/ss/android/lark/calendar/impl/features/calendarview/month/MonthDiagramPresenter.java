package com.ss.android.lark.calendar.impl.features.calendarview.month;

import android.app.Activity;
import android.view.View;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract;
import com.ss.android.lark.calendar.impl.features.calendarview.IDateLogicData;
import com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController;
import com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate;
import com.ss.android.lark.calendar.impl.features.calendarview.base.BaseDiagramPresenter;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract;
import com.ss.android.lark.calendar.impl.features.calendarview.month.view.MonthContainViewPager;
import com.ss.android.lark.calendar.impl.framework.busevents.SettingChangedEvent;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchPerfMonitor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 <2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0006:\u0002<=B\r\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\f\u0010\u001e\u001a\u00060\u001fR\u00020\u0000H\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J \u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020(H\u0002J\u0018\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020(H\u0002J\u0010\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020(H\u0016J\b\u0010.\u001a\u00020\u0010H\u0016J\b\u0010/\u001a\u00020\u0010H\u0016J\u0010\u00100\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u0014H\u0016J\b\u00101\u001a\u00020\u0010H\u0016J\b\u00102\u001a\u00020\u0010H\u0016J\b\u00103\u001a\u00020\u0010H\u0016J\u0010\u00104\u001a\u00020\u00102\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020\u0010H\u0016J\b\u0010;\u001a\u00020\u0010H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramPresenter;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/base/BaseDiagramPresenter;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$IMonthDiagramModelApi;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$IMonthDiagramViewApi;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$IMonthDiagramViewData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$IMonthDiagramViewAction;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDiagramController;", "model", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$IMonthDiagramModelApi;)V", "mDiagramDelegate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDiagramDelegate;", "mLoadSpareMonthData", "Ljava/lang/Runnable;", "mViewDependency", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDaysContract$ViewDependency;", "changeAccount", "", "changeAlternateCalendar", "changeCurrentDay", "date", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "changeFirstDayOfWeek", "changeTimeFormat", "clearAppendEvent", "create", "activity", "Landroid/app/Activity;", "destroy", "getDiagramView", "Landroid/view/View;", "getViewAction", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramPresenter$MonthDiagramViewAction;", "hideDiagramView", "initDiagramView", "diagramDelegate", "viewDependency", "dateLogicData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDateLogicData;", "loadPageDataOrderly", "isUseDataCache", "", "modifyAfterSelectDateChanged", "selectDate", "isRefreshTitle", "moveBackForwardPage", "isBack", "moveToToday", "preLoadDiskInstance", "preLoadInstance", "refreshAllPage", "refreshCurrentTimeLine", "refreshEventMask", "refreshOnSettingChanged", "event", "Lcom/ss/android/lark/calendar/impl/framework/busevents/SettingChangedEvent;", "refreshViewTimeZone", "timeZoneId", "", "showDiagramGuide", "showDiagramView", "Companion", "MonthDiagramViewAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.b */
public final class MonthDiagramPresenter extends BaseDiagramPresenter<IMonthDiagramContract.IMonthDiagramModelApi, IMonthDiagramContract.IMonthDiagramViewApi, IMonthDiagramContract.IMonthDiagramViewData, IMonthDiagramContract.IMonthDiagramViewAction> implements IDiagramController {

    /* renamed from: d */
    public static final Companion f77959d = new Companion(null);

    /* renamed from: a */
    public CalendarDaysContract.AbstractC30658d f77960a;

    /* renamed from: b */
    public IDiagramDelegate f77961b;

    /* renamed from: c */
    public final Runnable f77962c;

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: a */
    public void mo110994a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: e */
    public void mo110999e() {
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: i */
    public void mo111003i() {
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: j */
    public void mo111004j() {
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: l */
    public void mo111006l() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramPresenter$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: h */
    public void mo111002h() {
        mo112057a(false);
    }

    /* renamed from: p */
    public MonthDiagramViewAction mo110712o() {
        return new MonthDiagramViewAction();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramPresenter$MonthDiagramViewAction;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$IMonthDiagramViewAction;", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramPresenter;)V", "onClickAppendButton", "", "date", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "onClickEventDetail", "viewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/EventChipViewData;", "onFinishInflatePages", "onFinishScrollNonAdjacentPage", "onLeftScrollFinished", "onMoveTodayScrolling", "tabDuration", "", "onRightScrollFinished", "onSelectDateChanged", "selectDate", "isRefreshTitle", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.b$b */
    public final class MonthDiagramViewAction implements IMonthDiagramContract.IMonthDiagramViewAction {
        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramViewAction
        /* renamed from: a */
        public void mo112016a() {
            LaunchPerfMonitor.m124430d("show_grid");
            MonthDiagramPresenter.this.mo112057a(true);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramViewAction
        /* renamed from: b */
        public void mo112021b() {
            ((IMonthDiagramContract.IMonthDiagramModelApi) MonthDiagramPresenter.this.mo110711n()).mo112008a(IMonthDiagramContract.PagePosition.LEFT, IMonthDiagramContract.OperationType.SCROLL);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramViewAction
        /* renamed from: c */
        public void mo112022c() {
            ((IMonthDiagramContract.IMonthDiagramModelApi) MonthDiagramPresenter.this.mo110711n()).mo112008a(IMonthDiagramContract.PagePosition.RIGHT, IMonthDiagramContract.OperationType.SCROLL);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramViewAction
        /* renamed from: d */
        public void mo112023d() {
            UICallbackExecutor.executeDelayed(MonthDiagramPresenter.this.f77962c, 50);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public MonthDiagramViewAction() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramViewAction
        /* renamed from: a */
        public void mo112017a(int i) {
            MonthDiagramPresenter bVar = MonthDiagramPresenter.this;
            bVar.mo112056a(((IMonthDiagramContract.IMonthDiagramModelApi) bVar.mo110711n()).mo112014h(), true);
            IDiagramDelegate jVar = MonthDiagramPresenter.this.f77961b;
            if (jVar != null) {
                jVar.mo111632a(i);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramViewAction
        /* renamed from: a */
        public void mo112018a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "date");
            CalendarDaysContract.AbstractC30658d dVar = MonthDiagramPresenter.this.f77960a;
            if (dVar != null) {
                dVar.mo108516a(calendarDate, null, false);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramViewAction
        /* renamed from: a */
        public void mo112020a(EventChipViewData eventChipViewData) {
            Intrinsics.checkParameterIsNotNull(eventChipViewData, "viewData");
            CalendarDaysContract.AbstractC30658d dVar = MonthDiagramPresenter.this.f77960a;
            if (dVar != null) {
                dVar.mo108517a(eventChipViewData, true);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramViewAction
        /* renamed from: a */
        public void mo112019a(CalendarDate calendarDate, boolean z) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
            MonthDiagramPresenter.this.mo112056a(calendarDate, z);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: a */
    public void mo110989a() {
        ((IMonthDiagramContract.IMonthDiagramModelApi) mo110711n()).mo112006a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: c */
    public void mo110997c() {
        IMonthDiagramContract.IMonthDiagramViewApi cVar = (IMonthDiagramContract.IMonthDiagramViewApi) mo110710m();
        if (cVar != null) {
            cVar.mo112025a(0);
        }
        mo112057a(false);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: d */
    public void mo110998d() {
        IMonthDiagramContract.IMonthDiagramViewApi cVar = (IMonthDiagramContract.IMonthDiagramViewApi) mo110710m();
        if (cVar != null) {
            cVar.mo112025a(8);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController, com.ss.android.lark.calendar.impl.features.calendarview.base.BaseDiagramPresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        UICallbackExecutor.removeCallbacks(this.f77962c);
        super.destroy();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: f */
    public void mo111000f() {
        IMonthDiagramContract.IMonthDiagramViewApi cVar = (IMonthDiagramContract.IMonthDiagramViewApi) mo110710m();
        if (cVar != null) {
            cVar.mo112026b();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: k */
    public void mo111005k() {
        ((IMonthDiagramContract.IMonthDiagramModelApi) mo110711n()).mo112010c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.b$c */
    static final class RunnableC30948c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IMonthDiagramContract.IMonthDiagramModelApi f77964a;

        RunnableC30948c(IMonthDiagramContract.IMonthDiagramModelApi aVar) {
            this.f77964a = aVar;
        }

        public final void run() {
            this.f77964a.mo112008a(IMonthDiagramContract.PagePosition.RIGHT, IMonthDiagramContract.OperationType.INIT);
            this.f77964a.mo112008a(IMonthDiagramContract.PagePosition.LEFT, IMonthDiagramContract.OperationType.INIT);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: b */
    public View mo110995b() {
        MonthContainViewPager monthContainViewPager;
        IMonthDiagramContract.IMonthDiagramViewApi cVar = (IMonthDiagramContract.IMonthDiagramViewApi) mo110710m();
        if (cVar != null) {
            monthContainViewPager = cVar.mo112024a();
        } else {
            monthContainViewPager = null;
        }
        return monthContainViewPager;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: g */
    public void mo111001g() {
        GeneralHitPoint.m124209a("default_view", "today", "month");
        ((IMonthDiagramContract.IMonthDiagramModelApi) mo110711n()).mo112013g();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MonthDiagramPresenter(IMonthDiagramContract.IMonthDiagramModelApi aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        aVar.create();
        this.f77962c = new RunnableC30948c(aVar);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: a */
    public void mo110990a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        mo110709a(new MonthDiagramView(activity));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: a */
    public void mo110991a(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
        ((IMonthDiagramContract.IMonthDiagramModelApi) mo110711n()).mo112009b();
        ((IMonthDiagramContract.IMonthDiagramModelApi) mo110711n()).mo112012e();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: b */
    public void mo110996b(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "date");
        IMonthDiagramContract.IMonthDiagramViewApi cVar = (IMonthDiagramContract.IMonthDiagramViewApi) mo110710m();
        if (cVar != null) {
            cVar.mo112027c();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: a */
    public void mo110993a(SettingChangedEvent mVar) {
        IDiagramDelegate jVar;
        Intrinsics.checkParameterIsNotNull(mVar, "event");
        if (mVar.mo118648b()) {
            mo112057a(false);
            ((IMonthDiagramContract.IMonthDiagramModelApi) mo110711n()).mo112012e();
        } else if (mVar.mo118649c()) {
            mo112057a(true);
            ((IMonthDiagramContract.IMonthDiagramModelApi) mo110711n()).mo112012e();
        } else if (mVar.mo118647a() && (jVar = this.f77961b) != null) {
            jVar.mo111641g();
        }
    }

    /* renamed from: a */
    public final void mo112057a(boolean z) {
        if (!z) {
            ((IMonthDiagramContract.IMonthDiagramModelApi) mo110711n()).mo112010c();
        }
        ((IMonthDiagramContract.IMonthDiagramModelApi) mo110711n()).mo112008a(IMonthDiagramContract.PagePosition.CENTER, IMonthDiagramContract.OperationType.INIT);
        UICallbackExecutor.executeDelayed(this.f77962c, 50);
    }

    /* renamed from: a */
    public final void mo112056a(CalendarDate calendarDate, boolean z) {
        IDiagramDelegate jVar;
        IDiagramDelegate jVar2 = this.f77961b;
        if (jVar2 != null) {
            jVar2.mo111634a(calendarDate);
        }
        if (z && (jVar = this.f77961b) != null) {
            jVar.mo111636b(calendarDate);
        }
        IDiagramDelegate jVar3 = this.f77961b;
        if (jVar3 != null) {
            jVar3.mo111631a(((IMonthDiagramContract.IMonthDiagramModelApi) mo110711n()).mo112015i());
        }
        ((IMonthDiagramContract.IMonthDiagramModelApi) mo110711n()).mo112011d();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: a */
    public void mo110992a(IDiagramDelegate jVar, CalendarDaysContract.AbstractC30658d dVar, IDateLogicData hVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "diagramDelegate");
        Intrinsics.checkParameterIsNotNull(dVar, "viewDependency");
        Intrinsics.checkParameterIsNotNull(hVar, "dateLogicData");
        ((IMonthDiagramContract.IMonthDiagramModelApi) mo110711n()).mo112007a(hVar);
        IMonthDiagramContract.IMonthDiagramViewApi cVar = (IMonthDiagramContract.IMonthDiagramViewApi) mo110710m();
        if (cVar != null) {
            cVar.create();
        }
        this.f77960a = dVar;
        this.f77961b = jVar;
    }
}
