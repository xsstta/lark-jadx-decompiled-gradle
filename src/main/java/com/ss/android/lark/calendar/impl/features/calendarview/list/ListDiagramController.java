package com.ss.android.lark.calendar.impl.features.calendarview.list;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.article.common.monitor.stack.C3474b;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.C30804f;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract;
import com.ss.android.lark.calendar.impl.features.calendarview.IDateLogicData;
import com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController;
import com.ss.android.lark.calendar.impl.features.calendarview.IDiagramDelegate;
import com.ss.android.lark.calendar.impl.features.calendarview.list.model.ListViewCacheDataBinder;
import com.ss.android.lark.calendar.impl.features.calendarview.list.view.AbstractC30861b;
import com.ss.android.lark.calendar.impl.features.calendarview.list.view.C30850a;
import com.ss.android.lark.calendar.impl.features.calendarview.list.view.ListCalendarView;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31109e;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.AbstractC31169a;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.CalendarWeekIndicator;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31179a;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31180b;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.C31181c;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.CalendarAttr;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.week.C31189a;
import com.ss.android.lark.calendar.impl.framework.busevents.SettingChangedEvent;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchPerfMonitor;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32647d;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.ttm.player.MediaPlayer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 X2\u00020\u0001:\u0001XB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\u0010\u0010\"\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010#\u001a\u00020 H\u0016J\b\u0010$\u001a\u00020 H\u0016J\b\u0010%\u001a\u00020 H\u0016J\u0010\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020\u0004H\u0016J\b\u0010(\u001a\u00020 H\u0016J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020 H\u0016J \u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020 2\u0006\u00103\u001a\u000204H\u0002J\u0010\u00105\u001a\u00020 2\u0006\u00103\u001a\u000204H\u0002J\b\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u000207H\u0002J\u0018\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u000207H\u0002J \u0010<\u001a\u00020 2\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u0002072\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u00020 2\u0006\u0010:\u001a\u00020\u001eH\u0002J\u0018\u0010@\u001a\u00020 2\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010A\u001a\u00020 H\u0002J\u0010\u0010B\u001a\u00020 2\u0006\u0010C\u001a\u000207H\u0016J\b\u0010D\u001a\u00020 H\u0016J\u0010\u0010E\u001a\u00020 2\u0006\u0010F\u001a\u00020\u001eH\u0002J\u0010\u0010G\u001a\u00020 2\u0006\u0010F\u001a\u00020\u001eH\u0002J\b\u0010H\u001a\u00020 H\u0016J\u0010\u0010I\u001a\u00020 2\u0006\u0010F\u001a\u00020\u001eH\u0016J\b\u0010J\u001a\u00020 H\u0016J\b\u0010K\u001a\u00020 H\u0016J\b\u0010L\u001a\u00020 H\u0016J\b\u0010M\u001a\u00020 H\u0002J\u0010\u0010N\u001a\u00020 2\u0006\u0010O\u001a\u00020PH\u0016J\u0010\u0010Q\u001a\u00020 2\u0006\u0010F\u001a\u00020\u001eH\u0002J\u0010\u0010R\u001a\u00020 2\u0006\u0010S\u001a\u00020TH\u0016J\b\u0010U\u001a\u00020 H\u0002J\b\u0010V\u001a\u00020 H\u0016J\b\u0010W\u001a\u00020 H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/list/ListDiagramController;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDiagramController;", "()V", "mActivity", "Landroid/app/Activity;", "mDiagramDelegate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDiagramDelegate;", "mListCalendarLayout", "Landroid/widget/LinearLayout;", "mListCalendarView", "Lcom/ss/android/lark/calendar/impl/features/calendarview/list/view/ListCalendarView;", "mListViewCacheDataBinder", "Lcom/ss/android/lark/calendar/impl/features/calendarview/list/model/ListViewCacheDataBinder;", "mLoadSpareEventColors", "Ljava/lang/Runnable;", "mMonthViewAdapter", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/month/MonthAdapter;", "mProgress", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarTabScrollProgress;", "getMProgress", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarTabScrollProgress;", "mProgress$delegate", "Lkotlin/Lazy;", "mWeekIndicatorContainer", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/base/CalendarWeekIndicator;", "mWeekViewAdapter", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/week/WeekAdapter;", "calculateDateDiff", "", "date", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "changeAccount", "", "changeAlternateCalendar", "changeCurrentDay", "changeFirstDayOfWeek", "changeTimeFormat", "clearAppendEvent", "create", "activity", "destroy", "getDiagramView", "Landroid/view/View;", "hideDiagramView", "initDiagramView", "diagramDelegate", "viewDependency", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDaysContract$ViewDependency;", "dateLogicData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDateLogicData;", "initListCalendarView", "context", "Landroid/content/Context;", "initListCalendarViewPager", "isSelectedDateOutMonthCalendarRange", "", "isSelectedDateOutWeekCalendarRange", "loadListMonthCalendarColorData", "requiredDate", "forceUpdate", "loadListMonthCalendarColorDataActual", "dayOfWeek", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "loadListWeekCalendarColorData", "loadListWeekCalendarColorDataActual", "loadSpareListMonthCalendarColors", "moveBackForwardPage", "isBack", "moveToToday", "onMonthViewChangeSelectDate", "selectDate", "onWeekViewChangeSelectDate", "preLoadDiskInstance", "preLoadInstance", "refreshAllPage", "refreshCurrentTimeLine", "refreshEventMask", "refreshListRecyclerViewDate", "refreshOnSettingChanged", "settingChangedEvent", "Lcom/ss/android/lark/calendar/impl/framework/busevents/SettingChangedEvent;", "refreshSelectDate", "refreshViewTimeZone", "timeZoneId", "", "refreshWeekDayStatus", "showDiagramGuide", "showDiagramView", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.d */
public final class ListDiagramController implements IDiagramController {

    /* renamed from: d */
    public static final Companion f77606d = new Companion(null);

    /* renamed from: a */
    public ListViewCacheDataBinder f77607a = new ListViewCacheDataBinder();

    /* renamed from: b */
    public ListCalendarView f77608b;

    /* renamed from: c */
    public IDiagramDelegate f77609c;

    /* renamed from: e */
    private Activity f77610e;

    /* renamed from: f */
    private final Lazy f77611f = LazyKt.lazy(C30840m.INSTANCE);

    /* renamed from: g */
    private CalendarWeekIndicator f77612g;

    /* renamed from: h */
    private LinearLayout f77613h;

    /* renamed from: i */
    private C31181c f77614i;

    /* renamed from: j */
    private C31189a f77615j;

    /* renamed from: k */
    private final Runnable f77616k = new RunnableC30839l(this);

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

    /* renamed from: m */
    public final C30804f mo111719m() {
        return (C30804f) this.f77611f.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/list/ListDiagramController$Companion;", "", "()V", "TAB_ANIMATION_DURATION", "", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarTabScrollProgress;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.d$m */
    static final class C30840m extends Lambda implements Function0<C30804f> {
        public static final C30840m INSTANCE = new C30840m();

        C30840m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C30804f invoke() {
            return new C30804f();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: a */
    public void mo110989a() {
        ListViewCacheDataBinder cVar = this.f77607a;
        if (cVar != null) {
            cVar.mo111685a();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: b */
    public View mo110995b() {
        return this.f77613h;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: f */
    public void mo111000f() {
        ListCalendarView listCalendarView = this.f77608b;
        if (listCalendarView != null) {
            listCalendarView.mo111757h();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: k */
    public void mo111005k() {
        ListViewCacheDataBinder cVar = this.f77607a;
        if (cVar != null) {
            cVar.mo111690c();
        }
    }

    /* renamed from: n */
    public final void mo111720n() {
        UICallbackExecutor.executeDelayed(this.f77616k, 50);
    }

    /* renamed from: o */
    public void mo111721o() {
        ListCalendarView listCalendarView = this.f77608b;
        if (listCalendarView != null) {
            listCalendarView.mo111746e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/list/ListDiagramController$initListCalendarViewPager$3", "Lcom/ss/android/lark/calendar/impl/features/calendarview/list/view/IOnRecyclerViewListener;", "onAppendAnimation", "", "onRecyclerViewScrollingToEdge", "startDay", "", "endDay", "isSrollingDown", "", "onSelectDateChanged", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.d$d */
    public static final class C30831d implements AbstractC30861b {

        /* renamed from: a */
        final /* synthetic */ ListDiagramController f77619a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.list.view.AbstractC30861b
        /* renamed from: a */
        public void mo111727a() {
            IDiagramDelegate jVar = this.f77619a.f77609c;
            if (jVar != null) {
                jVar.mo111640f();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30831d(ListDiagramController dVar) {
            this.f77619a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.list.view.AbstractC30861b
        /* renamed from: a */
        public void mo111729a(CalendarDate calendarDate) {
            CalendarDate c;
            CalendarDate calendarDate2;
            CalendarDate calendarDate3;
            int i;
            IDiagramDelegate jVar;
            CalendarDate c2;
            CalendarDate c3;
            IDiagramDelegate jVar2;
            CalendarDate c4;
            CalendarDate c5;
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
            IDiagramDelegate jVar3 = this.f77619a.f77609c;
            if (jVar3 != null) {
                jVar3.mo111636b(calendarDate);
            }
            IDiagramDelegate jVar4 = this.f77619a.f77609c;
            if (jVar4 != null && (c = jVar4.mo111637c()) != null && !c.sameDay(calendarDate)) {
                IDiagramDelegate jVar5 = this.f77619a.f77609c;
                if (jVar5 != null) {
                    jVar5.mo111634a(calendarDate);
                }
                this.f77619a.mo111723q();
                ListCalendarView listCalendarView = this.f77619a.f77608b;
                CalendarAttr.CalendarType calendarType = null;
                if (listCalendarView != null) {
                    calendarDate2 = listCalendarView.getCenterCalendarStartDate();
                } else {
                    calendarDate2 = null;
                }
                CalendarDate calendarDate4 = new CalendarDate(calendarDate2);
                ListCalendarView listCalendarView2 = this.f77619a.f77608b;
                if (listCalendarView2 != null) {
                    calendarDate3 = listCalendarView2.getCenterCalendarEndDate();
                } else {
                    calendarDate3 = null;
                }
                CalendarDate calendarDate5 = new CalendarDate(calendarDate3);
                ListCalendarView listCalendarView3 = this.f77619a.f77608b;
                if (listCalendarView3 != null) {
                    i = listCalendarView3.getMonthHeight();
                } else {
                    i = 0;
                }
                ListCalendarView listCalendarView4 = this.f77619a.f77608b;
                if (listCalendarView4 != null) {
                    listCalendarView4.mo111761l();
                }
                ListCalendarView listCalendarView5 = this.f77619a.f77608b;
                if (listCalendarView5 != null) {
                    listCalendarView5.mo111743b(i);
                }
                ListCalendarView listCalendarView6 = this.f77619a.f77608b;
                if (listCalendarView6 != null) {
                    calendarType = listCalendarView6.getCalendarType();
                }
                if (calendarType == CalendarAttr.CalendarType.MONTH) {
                    if (calendarDate4.getJulianDay() > calendarDate.getJulianDay()) {
                        IDiagramDelegate jVar6 = this.f77619a.f77609c;
                        if (jVar6 != null && (c5 = jVar6.mo111637c()) != null) {
                            ListDiagramController dVar = this.f77619a;
                            CalendarDate addMonth = c5.addMonth(0);
                            Intrinsics.checkExpressionValueIsNotNull(addMonth, "selectedDate.addMonth(0)");
                            dVar.mo111714a(addMonth, false);
                            ListDiagramController dVar2 = this.f77619a;
                            CalendarDate addMonth2 = c5.addMonth(-1);
                            Intrinsics.checkExpressionValueIsNotNull(addMonth2, "selectedDate.addMonth(-1)");
                            dVar2.mo111714a(addMonth2, false);
                            ListDiagramController dVar3 = this.f77619a;
                            CalendarDate addMonth3 = c5.addMonth(1);
                            Intrinsics.checkExpressionValueIsNotNull(addMonth3, "selectedDate.addMonth(1)");
                            dVar3.mo111714a(addMonth3, false);
                        }
                    } else if (calendarDate5.getJulianDay() < calendarDate.getJulianDay() && (jVar2 = this.f77619a.f77609c) != null && (c4 = jVar2.mo111637c()) != null) {
                        ListDiagramController dVar4 = this.f77619a;
                        CalendarDate addMonth4 = c4.addMonth(0);
                        Intrinsics.checkExpressionValueIsNotNull(addMonth4, "selectedDate.addMonth(0)");
                        dVar4.mo111714a(addMonth4, false);
                        ListDiagramController dVar5 = this.f77619a;
                        CalendarDate addMonth5 = c4.addMonth(1);
                        Intrinsics.checkExpressionValueIsNotNull(addMonth5, "selectedDate.addMonth(1)");
                        dVar5.mo111714a(addMonth5, false);
                        ListDiagramController dVar6 = this.f77619a;
                        CalendarDate addMonth6 = c4.addMonth(-1);
                        Intrinsics.checkExpressionValueIsNotNull(addMonth6, "selectedDate.addMonth(-1)");
                        dVar6.mo111714a(addMonth6, false);
                    }
                } else if (calendarDate4.getJulianDay() > calendarDate.getJulianDay()) {
                    IDiagramDelegate jVar7 = this.f77619a.f77609c;
                    if (jVar7 != null && (c3 = jVar7.mo111637c()) != null) {
                        ListDiagramController dVar7 = this.f77619a;
                        CalendarDate modifyWeek = c3.modifyWeek(0);
                        Intrinsics.checkExpressionValueIsNotNull(modifyWeek, "selectedDate.modifyWeek(0)");
                        dVar7.mo111718e(modifyWeek);
                        ListDiagramController dVar8 = this.f77619a;
                        CalendarDate modifyWeek2 = c3.modifyWeek(-1);
                        Intrinsics.checkExpressionValueIsNotNull(modifyWeek2, "selectedDate.modifyWeek(-1)");
                        dVar8.mo111718e(modifyWeek2);
                        ListDiagramController dVar9 = this.f77619a;
                        CalendarDate modifyWeek3 = c3.modifyWeek(1);
                        Intrinsics.checkExpressionValueIsNotNull(modifyWeek3, "selectedDate.modifyWeek(1)");
                        dVar9.mo111718e(modifyWeek3);
                    }
                } else if (calendarDate5.getJulianDay() < calendarDate.getJulianDay() && (jVar = this.f77619a.f77609c) != null && (c2 = jVar.mo111637c()) != null) {
                    ListDiagramController dVar10 = this.f77619a;
                    CalendarDate modifyWeek4 = c2.modifyWeek(0);
                    Intrinsics.checkExpressionValueIsNotNull(modifyWeek4, "selectedDate.modifyWeek(0)");
                    dVar10.mo111718e(modifyWeek4);
                    ListDiagramController dVar11 = this.f77619a;
                    CalendarDate modifyWeek5 = c2.modifyWeek(1);
                    Intrinsics.checkExpressionValueIsNotNull(modifyWeek5, "selectedDate.modifyWeek(1)");
                    dVar11.mo111718e(modifyWeek5);
                    ListDiagramController dVar12 = this.f77619a;
                    CalendarDate modifyWeek6 = c2.modifyWeek(-1);
                    Intrinsics.checkExpressionValueIsNotNull(modifyWeek6, "selectedDate.modifyWeek(-1)");
                    dVar12.mo111718e(modifyWeek6);
                }
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.list.view.AbstractC30861b
        /* renamed from: a */
        public void mo111728a(int i, int i2, boolean z) {
            CalendarDate c;
            ListViewCacheDataBinder cVar;
            IDiagramDelegate jVar = this.f77619a.f77609c;
            if (jVar != null && (c = jVar.mo111637c()) != null && (cVar = this.f77619a.f77607a) != null) {
                cVar.mo111687a(this.f77619a.f77608b, i, i2, c.getJulianDay(), z);
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: d */
    public void mo110998d() {
        LinearLayout linearLayout = this.f77613h;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/list/ListDiagramController$initListCalendarViewPager$2", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/IOnViewPageListener;", "onLeftScrollFinished", "", "onRightScrollFinished", "onSelectDateChanged", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.d$c */
    public static final class C30830c implements AbstractC31169a {

        /* renamed from: a */
        final /* synthetic */ ListDiagramController f77618a;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.AbstractC31169a
        /* renamed from: a */
        public void mo111724a() {
            CalendarDate c;
            IDiagramDelegate jVar = this.f77618a.f77609c;
            if (jVar != null && (c = jVar.mo111637c()) != null) {
                ListDiagramController dVar = this.f77618a;
                CalendarDate modifyWeek = c.modifyWeek(-1);
                Intrinsics.checkExpressionValueIsNotNull(modifyWeek, "selectedDate.modifyWeek(-1)");
                dVar.mo111718e(modifyWeek);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.AbstractC31169a
        /* renamed from: b */
        public void mo111726b() {
            CalendarDate c;
            IDiagramDelegate jVar = this.f77618a.f77609c;
            if (jVar != null && (c = jVar.mo111637c()) != null) {
                ListDiagramController dVar = this.f77618a;
                CalendarDate modifyWeek = c.modifyWeek(1);
                Intrinsics.checkExpressionValueIsNotNull(modifyWeek, "selectedDate.modifyWeek(1)");
                dVar.mo111718e(modifyWeek);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30830c(ListDiagramController dVar) {
            this.f77618a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.AbstractC31169a
        /* renamed from: a */
        public void mo111725a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
            this.f77618a.mo111716c(calendarDate);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/list/ListDiagramController$initListCalendarViewPager$4", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/month/IMonthDateFetcher;", "fetchCurrentDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "fetchSelectedDate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.d$e */
    public static final class C30832e implements AbstractC31180b {

        /* renamed from: a */
        final /* synthetic */ ListDiagramController f77620a;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31180b
        /* renamed from: a */
        public CalendarDate mo111730a() {
            CalendarDate d;
            IDiagramDelegate jVar = this.f77620a.f77609c;
            if (jVar == null || (d = jVar.mo111638d()) == null) {
                return new CalendarDate();
            }
            return d;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31180b
        /* renamed from: b */
        public CalendarDate mo111731b() {
            CalendarDate c;
            IDiagramDelegate jVar = this.f77620a.f77609c;
            if (jVar == null || (c = jVar.mo111637c()) == null) {
                return new CalendarDate();
            }
            return c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30832e(ListDiagramController dVar) {
            this.f77620a = dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/list/ListDiagramController$initListCalendarViewPager$6", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/month/IMonthDateFetcher;", "fetchCurrentDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "fetchSelectedDate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.d$g */
    public static final class C30834g implements AbstractC31180b {

        /* renamed from: a */
        final /* synthetic */ ListDiagramController f77622a;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31180b
        /* renamed from: a */
        public CalendarDate mo111730a() {
            CalendarDate d;
            IDiagramDelegate jVar = this.f77622a.f77609c;
            if (jVar == null || (d = jVar.mo111638d()) == null) {
                return new CalendarDate();
            }
            return d;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31180b
        /* renamed from: b */
        public CalendarDate mo111731b() {
            CalendarDate c;
            IDiagramDelegate jVar = this.f77622a.f77609c;
            if (jVar == null || (c = jVar.mo111637c()) == null) {
                return new CalendarDate();
            }
            return c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30834g(ListDiagramController dVar) {
            this.f77622a = dVar;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    public void destroy() {
        ListViewCacheDataBinder cVar = this.f77607a;
        if (cVar != null) {
            cVar.mo111689b();
        }
        ListCalendarView listCalendarView = this.f77608b;
        if (listCalendarView != null) {
            listCalendarView.mo111737a();
        }
        UICallbackExecutor.removeCallbacks(this.f77616k);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: h */
    public void mo111002h() {
        CalendarDate c;
        ListViewCacheDataBinder cVar = this.f77607a;
        if (cVar != null) {
            cVar.mo111690c();
        }
        IDiagramDelegate jVar = this.f77609c;
        if (jVar != null && (c = jVar.mo111637c()) != null) {
            mo111714a(c, true);
            mo111720n();
        }
    }

    /* renamed from: p */
    public void mo111722p() {
        int i;
        ListCalendarView listCalendarView = this.f77608b;
        if (listCalendarView != null) {
            i = listCalendarView.getMonthHeight();
        } else {
            i = 0;
        }
        ListCalendarView listCalendarView2 = this.f77608b;
        if (listCalendarView2 != null) {
            listCalendarView2.mo111761l();
        }
        ListCalendarView listCalendarView3 = this.f77608b;
        if (listCalendarView3 != null) {
            listCalendarView3.mo111743b(i);
        }
        mo111723q();
        mo111002h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/list/ListDiagramController$initListCalendarViewPager$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/IOnViewPageListener;", "onLeftScrollFinished", "", "onRightScrollFinished", "onSelectDateChanged", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.d$b */
    public static final class C30829b implements AbstractC31169a {

        /* renamed from: a */
        final /* synthetic */ ListDiagramController f77617a;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.AbstractC31169a
        /* renamed from: a */
        public void mo111724a() {
            CalendarDate c;
            ListCalendarView listCalendarView = this.f77617a.f77608b;
            if (listCalendarView != null) {
                listCalendarView.mo111759j();
            }
            IDiagramDelegate jVar = this.f77617a.f77609c;
            if (jVar != null && (c = jVar.mo111637c()) != null) {
                ListDiagramController dVar = this.f77617a;
                CalendarDate addMonth = c.addMonth(-1);
                Intrinsics.checkExpressionValueIsNotNull(addMonth, "selectedDate.addMonth(-1)");
                dVar.mo111714a(addMonth, false);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.AbstractC31169a
        /* renamed from: b */
        public void mo111726b() {
            CalendarDate c;
            ListCalendarView listCalendarView = this.f77617a.f77608b;
            if (listCalendarView != null) {
                listCalendarView.mo111760k();
            }
            IDiagramDelegate jVar = this.f77617a.f77609c;
            if (jVar != null && (c = jVar.mo111637c()) != null) {
                ListDiagramController dVar = this.f77617a;
                CalendarDate addMonth = c.addMonth(1);
                Intrinsics.checkExpressionValueIsNotNull(addMonth, "selectedDate.addMonth(1)");
                dVar.mo111714a(addMonth, false);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30829b(ListDiagramController dVar) {
            this.f77617a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.AbstractC31169a
        /* renamed from: a */
        public void mo111725a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
            this.f77617a.mo111717d(calendarDate);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.d$l */
    static final class RunnableC30839l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ListDiagramController f77630a;

        RunnableC30839l(ListDiagramController dVar) {
            this.f77630a = dVar;
        }

        public final void run() {
            CalendarDate c;
            IDiagramDelegate jVar = this.f77630a.f77609c;
            if (jVar != null && (c = jVar.mo111637c()) != null) {
                ListDiagramController dVar = this.f77630a;
                CalendarDate addMonth = c.addMonth(1);
                Intrinsics.checkExpressionValueIsNotNull(addMonth, "it.addMonth(1)");
                dVar.mo111714a(addMonth, false);
                ListDiagramController dVar2 = this.f77630a;
                CalendarDate addMonth2 = c.addMonth(-1);
                Intrinsics.checkExpressionValueIsNotNull(addMonth2, "it.addMonth(-1)");
                dVar2.mo111714a(addMonth2, false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onSmoothScrollFinish"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.d$n */
    static final class C30841n implements AbstractC31109e {

        /* renamed from: a */
        final /* synthetic */ ListDiagramController f77631a;

        /* renamed from: b */
        final /* synthetic */ int f77632b;

        /* renamed from: c */
        final /* synthetic */ CalendarDate f77633c;

        C30841n(ListDiagramController dVar, int i, CalendarDate calendarDate) {
            this.f77631a = dVar;
            this.f77632b = i;
            this.f77633c = calendarDate;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31109e
        /* renamed from: a */
        public final void mo111736a() {
            this.f77631a.mo111723q();
            ListCalendarView listCalendarView = this.f77631a.f77608b;
            if (listCalendarView != null) {
                listCalendarView.mo111761l();
            }
            ListCalendarView listCalendarView2 = this.f77631a.f77608b;
            if (listCalendarView2 != null) {
                listCalendarView2.mo111743b(this.f77632b);
            }
            this.f77631a.mo111714a(this.f77633c, false);
            this.f77631a.mo111720n();
        }
    }

    /* renamed from: t */
    private final void m115035t() {
        CalendarDate c;
        ListCalendarView listCalendarView;
        C30850a aVar;
        try {
            IDiagramDelegate jVar = this.f77609c;
            if (jVar != null && (c = jVar.mo111637c()) != null && (listCalendarView = this.f77608b) != null && (aVar = listCalendarView.getmCalendarRecyclerView()) != null) {
                aVar.mo111780a(c.getJulianDay(), true);
            }
        } catch (Exception e) {
            C3474b.m14692a(e);
        }
    }

    /* renamed from: r */
    private final boolean m115033r() {
        CalendarAttr.CalendarType calendarType;
        ListCalendarView listCalendarView;
        CalendarDate centerMonthStartDate;
        CalendarDate c;
        ListCalendarView listCalendarView2 = this.f77608b;
        if (listCalendarView2 != null) {
            calendarType = listCalendarView2.getCalendarType();
        } else {
            calendarType = null;
        }
        if (!(calendarType != CalendarAttr.CalendarType.MONTH || (listCalendarView = this.f77608b) == null || (centerMonthStartDate = listCalendarView.getCenterMonthStartDate()) == null)) {
            CalendarDate addDay = centerMonthStartDate.addDay(C26279i.m95146a(centerMonthStartDate.getYear(), centerMonthStartDate.getMonth()) - 1);
            IDiagramDelegate jVar = this.f77609c;
            if (!(jVar == null || (c = jVar.mo111637c()) == null)) {
                if (centerMonthStartDate.getJulianDay() > c.getJulianDay()) {
                    return true;
                }
                Intrinsics.checkExpressionValueIsNotNull(addDay, "endDate");
                if (addDay.getJulianDay() < c.getJulianDay()) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: s */
    private final boolean m115034s() {
        CalendarAttr.CalendarType calendarType;
        ListCalendarView listCalendarView;
        CalendarDate centerWeekStartDate;
        ListCalendarView listCalendarView2;
        CalendarDate centerWeekEndDate;
        IDiagramDelegate jVar;
        CalendarDate c;
        ListCalendarView listCalendarView3 = this.f77608b;
        if (listCalendarView3 != null) {
            calendarType = listCalendarView3.getCalendarType();
        } else {
            calendarType = null;
        }
        if (calendarType != CalendarAttr.CalendarType.WEEK || (listCalendarView = this.f77608b) == null || (centerWeekStartDate = listCalendarView.getCenterWeekStartDate()) == null || (listCalendarView2 = this.f77608b) == null || (centerWeekEndDate = listCalendarView2.getCenterWeekEndDate()) == null || (jVar = this.f77609c) == null || (c = jVar.mo111637c()) == null) {
            return false;
        }
        if (centerWeekStartDate.getJulianDay() > c.getJulianDay() || centerWeekEndDate.getJulianDay() < c.getJulianDay()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: c */
    public void mo110997c() {
        CalendarDate d;
        LinearLayout linearLayout = this.f77613h;
        int i = 0;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        ListCalendarView listCalendarView = this.f77608b;
        if (listCalendarView != null) {
            i = listCalendarView.getMonthHeight();
        }
        boolean isShowLunarCalendar = C30022a.f74884c.mo108456c().isShowLunarCalendar();
        ListCalendarView listCalendarView2 = this.f77608b;
        if (listCalendarView2 != null) {
            listCalendarView2.mo111741a(isShowLunarCalendar);
        }
        ListCalendarView listCalendarView3 = this.f77608b;
        if (listCalendarView3 != null) {
            listCalendarView3.mo111745d();
        }
        C30022a.f74884c.mo108450a(new C30842o(this, isShowLunarCalendar));
        ListCalendarView listCalendarView4 = this.f77608b;
        if (listCalendarView4 != null) {
            listCalendarView4.mo111761l();
        }
        ListCalendarView listCalendarView5 = this.f77608b;
        if (listCalendarView5 != null) {
            listCalendarView5.mo111743b(i);
        }
        mo111002h();
        m115035t();
        mo111723q();
        IDiagramDelegate jVar = this.f77609c;
        if (jVar != null && (d = jVar.mo111638d()) != null) {
            C31189a aVar = this.f77615j;
            if (aVar != null) {
                aVar.mo113007a(d);
            }
            C31181c cVar = this.f77614i;
            if (cVar != null) {
                cVar.mo112959a(d);
            }
        }
    }

    /* renamed from: q */
    public final void mo111723q() {
        CalendarDate d;
        CalendarDate c;
        CalendarAttr.CalendarType calendarType;
        boolean z;
        IDiagramDelegate jVar = this.f77609c;
        if (jVar != null && (d = jVar.mo111638d()) != null) {
            int weeklyDayIndex = d.getWeeklyDayIndex();
            IDiagramDelegate jVar2 = this.f77609c;
            if (jVar2 != null && (c = jVar2.mo111637c()) != null) {
                ListCalendarView listCalendarView = this.f77608b;
                if (listCalendarView != null) {
                    calendarType = listCalendarView.getCalendarType();
                } else {
                    calendarType = null;
                }
                if (calendarType != CalendarAttr.CalendarType.MONTH) {
                    z = c.getFirstDayOfTheWeek().sameDay(d.getFirstDayOfTheWeek());
                } else if (c.getYear() == d.getYear() && c.getMonth() == d.getMonth()) {
                    z = true;
                } else {
                    z = false;
                }
                CalendarWeekIndicator calendarWeekIndicator = this.f77612g;
                if (calendarWeekIndicator != null) {
                    calendarWeekIndicator.mo112908a(weeklyDayIndex, z);
                }
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: g */
    public void mo111001g() {
        CalendarDate d;
        IDiagramDelegate jVar;
        CalendarDate c;
        int i;
        CalendarDate c2;
        int i2;
        IDiagramDelegate jVar2 = this.f77609c;
        if (jVar2 != null && (d = jVar2.mo111638d()) != null && (jVar = this.f77609c) != null && (c = jVar.mo111637c()) != null) {
            if (!d.sameDay(c)) {
                if (m115031f(c) < 0) {
                    i = 2;
                } else {
                    i = 0;
                }
                IDiagramDelegate jVar3 = this.f77609c;
                if (jVar3 != null) {
                    jVar3.mo111639e();
                }
                IDiagramDelegate jVar4 = this.f77609c;
                if (jVar4 != null && (c2 = jVar4.mo111637c()) != null) {
                    IDiagramDelegate jVar5 = this.f77609c;
                    if (jVar5 != null) {
                        jVar5.mo111636b(jVar5.mo111638d());
                    }
                    m115035t();
                    if (m115033r()) {
                        ListCalendarView listCalendarView = this.f77608b;
                        if (listCalendarView != null) {
                            i2 = listCalendarView.getMonthHeight();
                        } else {
                            i2 = 0;
                        }
                        ListCalendarView listCalendarView2 = this.f77608b;
                        if (listCalendarView2 != null) {
                            listCalendarView2.mo111739a(i, false);
                        }
                        ListCalendarView listCalendarView3 = this.f77608b;
                        if (listCalendarView3 != null) {
                            listCalendarView3.setSmoothScrollFinishListener(new C30841n(this, i2, c2));
                        }
                    } else if (m115034s()) {
                        mo111723q();
                        ListCalendarView listCalendarView4 = this.f77608b;
                        if (listCalendarView4 != null) {
                            listCalendarView4.mo111761l();
                        }
                        mo111714a(c2, false);
                        mo111720n();
                    } else {
                        ListCalendarView listCalendarView5 = this.f77608b;
                        if (listCalendarView5 != null) {
                            listCalendarView5.mo111761l();
                        }
                    }
                    GeneralHitPoint.m124209a("default_view", "today", "list");
                } else {
                    return;
                }
            } else {
                m115035t();
            }
            IDiagramDelegate jVar6 = this.f77609c;
            if (jVar6 != null) {
                jVar6.mo111632a(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/list/ListDiagramController$initListCalendarViewPager$5", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/month/IDateSelectListener;", "onSelectDateChange", "", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "onSelectOtherMonth", "offset", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.d$f */
    public static final class C30833f implements AbstractC31179a {

        /* renamed from: a */
        final /* synthetic */ ListDiagramController f77621a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30833f(ListDiagramController dVar) {
            this.f77621a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31179a
        /* renamed from: a */
        public void mo111732a(int i) {
            ListCalendarView listCalendarView = this.f77621a.f77608b;
            if (listCalendarView != null) {
                listCalendarView.mo111738a(i);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31179a
        /* renamed from: a */
        public void mo111733a(CalendarDate calendarDate) {
            CalendarDate calendarDate2;
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
            IDiagramDelegate jVar = this.f77621a.f77609c;
            if (jVar == null || (calendarDate2 = jVar.mo111638d()) == null) {
                calendarDate2 = new CalendarDate();
            }
            this.f77621a.mo111719m().mo111608b((float) calendarDate.dayDiff(calendarDate2));
            this.f77621a.mo111717d(calendarDate);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/list/ListDiagramController$initListCalendarViewPager$7", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/month/IDateSelectListener;", "onSelectDateChange", "", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "onSelectOtherMonth", "offset", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.d$h */
    public static final class C30835h implements AbstractC31179a {

        /* renamed from: a */
        final /* synthetic */ ListDiagramController f77623a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30835h(ListDiagramController dVar) {
            this.f77623a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31179a
        /* renamed from: a */
        public void mo111732a(int i) {
            ListCalendarView listCalendarView = this.f77623a.f77608b;
            if (listCalendarView != null) {
                listCalendarView.requestLayout();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.AbstractC31179a
        /* renamed from: a */
        public void mo111733a(CalendarDate calendarDate) {
            CalendarDate calendarDate2;
            Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
            IDiagramDelegate jVar = this.f77623a.f77609c;
            if (jVar == null || (calendarDate2 = jVar.mo111638d()) == null) {
                calendarDate2 = new CalendarDate();
            }
            this.f77623a.mo111719m().mo111608b((float) calendarDate.dayDiff(calendarDate2));
            this.f77623a.mo111716c(calendarDate);
        }
    }

    /* renamed from: a */
    private final void m115029a(Context context) {
        mo111723q();
        m115030b(context);
        m115035t();
    }

    /* renamed from: c */
    public final void mo111716c(CalendarDate calendarDate) {
        m115032g(calendarDate);
        C31181c cVar = this.f77614i;
        if (cVar != null && cVar != null) {
            cVar.mo112966f();
        }
    }

    /* renamed from: e */
    public final void mo111718e(CalendarDate calendarDate) {
        C30022a.f74884c.mo108450a(new C30838k(this, calendarDate));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "setting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.d$j */
    public static final class C30837j implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ ListDiagramController f77625a;

        /* renamed from: b */
        final /* synthetic */ CalendarDate f77626b;

        /* renamed from: c */
        final /* synthetic */ boolean f77627c;

        C30837j(ListDiagramController dVar, CalendarDate calendarDate, boolean z) {
            this.f77625a = dVar;
            this.f77626b = calendarDate;
            this.f77627c = z;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            ListDiagramController dVar = this.f77625a;
            CalendarDate calendarDate = this.f77626b;
            boolean z = this.f77627c;
            Intrinsics.checkExpressionValueIsNotNull(calendarSetting, "setting");
            CalendarSetting.DayOfWeek weekStartDay = calendarSetting.getWeekStartDay();
            Intrinsics.checkExpressionValueIsNotNull(weekStartDay, "setting.weekStartDay");
            dVar.mo111715a(calendarDate, z, weekStartDay);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "setting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.d$k */
    public static final class C30838k implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ ListDiagramController f77628a;

        /* renamed from: b */
        final /* synthetic */ CalendarDate f77629b;

        C30838k(ListDiagramController dVar, CalendarDate calendarDate) {
            this.f77628a = dVar;
            this.f77629b = calendarDate;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            ListDiagramController dVar = this.f77628a;
            CalendarDate calendarDate = this.f77629b;
            Intrinsics.checkExpressionValueIsNotNull(calendarSetting, "setting");
            CalendarSetting.DayOfWeek weekStartDay = calendarSetting.getWeekStartDay();
            Intrinsics.checkExpressionValueIsNotNull(weekStartDay, "setting.weekStartDay");
            dVar.mo111713a(calendarDate, weekStartDay);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "setting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.d$o */
    static final class C30842o implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ ListDiagramController f77634a;

        /* renamed from: b */
        final /* synthetic */ boolean f77635b;

        C30842o(ListDiagramController dVar, boolean z) {
            this.f77634a = dVar;
            this.f77635b = z;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            Intrinsics.checkParameterIsNotNull(calendarSetting, "setting");
            boolean isShowLunarCalendar = calendarSetting.isShowLunarCalendar();
            if (isShowLunarCalendar != this.f77635b) {
                ListCalendarView listCalendarView = this.f77634a.f77608b;
                if (listCalendarView != null) {
                    listCalendarView.mo111741a(isShowLunarCalendar);
                }
                ListCalendarView listCalendarView2 = this.f77634a.f77608b;
                if (listCalendarView2 != null) {
                    listCalendarView2.mo111745d();
                }
            }
        }
    }

    /* renamed from: f */
    private final int m115031f(CalendarDate calendarDate) {
        CalendarDate d;
        IDiagramDelegate jVar = this.f77609c;
        if (jVar == null || (d = jVar.mo111638d()) == null) {
            return 0;
        }
        return calendarDate.dayDiff(d);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: a */
    public void mo110991a(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
        ListViewCacheDataBinder cVar = this.f77607a;
        if (cVar != null) {
            cVar.mo111686a(calendarDate);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: b */
    public void mo110996b(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "date");
        C31189a aVar = this.f77615j;
        if (aVar != null) {
            aVar.mo113007a(calendarDate);
        }
        C31181c cVar = this.f77614i;
        if (cVar != null) {
            cVar.mo112959a(calendarDate);
        }
    }

    /* renamed from: d */
    public final void mo111717d(CalendarDate calendarDate) {
        m115032g(calendarDate);
        C31189a aVar = this.f77615j;
        if (aVar != null && aVar != null) {
            aVar.mo113014g();
        }
    }

    /* renamed from: g */
    private final void m115032g(CalendarDate calendarDate) {
        C30850a aVar;
        IDiagramDelegate jVar = this.f77609c;
        if (jVar != null) {
            jVar.mo111634a(calendarDate);
        }
        IDiagramDelegate jVar2 = this.f77609c;
        if (jVar2 != null) {
            jVar2.mo111636b(calendarDate);
        }
        mo111723q();
        ListCalendarView listCalendarView = this.f77608b;
        if (listCalendarView != null && (aVar = listCalendarView.getmCalendarRecyclerView()) != null) {
            aVar.mo111780a(calendarDate.getJulianDay(), false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "calendarType", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/viewdata/CalendarAttr$CalendarType;", "kotlin.jvm.PlatformType", "onCalendarTypeChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.d$i */
    public static final class C30836i implements ListCalendarView.AbstractC30849a {

        /* renamed from: a */
        final /* synthetic */ ListDiagramController f77624a;

        C30836i(ListDiagramController dVar) {
            this.f77624a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.list.view.ListCalendarView.AbstractC30849a
        /* renamed from: a */
        public final void mo111734a(CalendarAttr.CalendarType calendarType) {
            IDiagramDelegate jVar;
            CalendarDate c;
            CalendarDate c2;
            this.f77624a.mo111723q();
            if (calendarType == CalendarAttr.CalendarType.MONTH) {
                IDiagramDelegate jVar2 = this.f77624a.f77609c;
                if (jVar2 != null && (c2 = jVar2.mo111637c()) != null) {
                    this.f77624a.mo111714a(c2, false);
                    this.f77624a.mo111720n();
                }
            } else if (calendarType == CalendarAttr.CalendarType.WEEK && (jVar = this.f77624a.f77609c) != null && (c = jVar.mo111637c()) != null) {
                this.f77624a.mo111718e(c);
                ListDiagramController dVar = this.f77624a;
                CalendarDate modifyWeek = c.modifyWeek(1);
                Intrinsics.checkExpressionValueIsNotNull(modifyWeek, "selectedDate.modifyWeek(1)");
                dVar.mo111718e(modifyWeek);
                ListDiagramController dVar2 = this.f77624a;
                CalendarDate modifyWeek2 = c.modifyWeek(-1);
                Intrinsics.checkExpressionValueIsNotNull(modifyWeek2, "selectedDate.modifyWeek(-1)");
                dVar2.mo111718e(modifyWeek2);
            }
        }
    }

    /* renamed from: b */
    private final void m115030b(Context context) {
        ListCalendarView listCalendarView = this.f77608b;
        if (listCalendarView != null) {
            listCalendarView.setMonthViewPageListener(new C30829b(this));
        }
        ListCalendarView listCalendarView2 = this.f77608b;
        if (listCalendarView2 != null) {
            listCalendarView2.setWeekViewPageListener(new C30830c(this));
        }
        ListCalendarView listCalendarView3 = this.f77608b;
        if (listCalendarView3 != null) {
            listCalendarView3.setRecyclerViewListener(new C30831d(this));
        }
        C31181c cVar = new C31181c(context, new C30832e(this));
        this.f77614i = cVar;
        if (cVar != null) {
            cVar.mo112960a(new C30833f(this));
        }
        ListCalendarView listCalendarView4 = this.f77608b;
        if (listCalendarView4 != null) {
            listCalendarView4.setMonthAdapter(this.f77614i);
        }
        C31189a aVar = new C31189a(context, new C30834g(this));
        this.f77615j = aVar;
        if (aVar != null) {
            aVar.mo113008a(new C30835h(this));
        }
        ListCalendarView listCalendarView5 = this.f77608b;
        if (listCalendarView5 != null) {
            listCalendarView5.setWeekAdapter(this.f77615j);
        }
        ListCalendarView listCalendarView6 = this.f77608b;
        if (listCalendarView6 != null) {
            listCalendarView6.setCalendarTypeChangedListener(new C30836i(this));
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: a */
    public void mo110990a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f77610e = activity;
        if (this.f77613h == null) {
            LinearLayout linearLayout = new LinearLayout(this.f77610e);
            this.f77613h = linearLayout;
            if (linearLayout != null) {
                linearLayout.setOrientation(1);
            }
            CalendarWeekIndicator calendarWeekIndicator = new CalendarWeekIndicator(this.f77610e, null);
            this.f77612g = calendarWeekIndicator;
            if (calendarWeekIndicator != null) {
                calendarWeekIndicator.setGravity(0);
            }
            CalendarWeekIndicator calendarWeekIndicator2 = this.f77612g;
            if (calendarWeekIndicator2 != null) {
                calendarWeekIndicator2.setBackgroundColor(C32634ae.m125178a(R.color.bg_body));
            }
            Activity activity2 = activity;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, UIUtils.dp2px(activity2, 16.5f));
            CalendarWeekIndicator calendarWeekIndicator3 = this.f77612g;
            if (calendarWeekIndicator3 != null) {
                calendarWeekIndicator3.setPadding(0, UIUtils.dp2px(activity2, 3.0f), 0, 0);
            }
            LinearLayout linearLayout2 = this.f77613h;
            if (linearLayout2 != null) {
                linearLayout2.addView(this.f77612g, layoutParams);
            }
            ListCalendarView listCalendarView = new ListCalendarView(activity2, null);
            this.f77608b = listCalendarView;
            LinearLayout linearLayout3 = this.f77613h;
            if (linearLayout3 != null) {
                linearLayout3.addView(listCalendarView, new ViewGroup.LayoutParams(-1, -1));
            }
            ListCalendarView listCalendarView2 = this.f77608b;
            if (listCalendarView2 != null) {
                listCalendarView2.mo111744c();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: a */
    public void mo110993a(SettingChangedEvent mVar) {
        IDiagramDelegate jVar;
        Intrinsics.checkParameterIsNotNull(mVar, "settingChangedEvent");
        if (mVar.mo118649c()) {
            mo111721o();
        }
        if (mVar.mo118648b()) {
            mo111722p();
        } else if (mVar.mo118647a() && (jVar = this.f77609c) != null) {
            jVar.mo111641g();
        }
    }

    /* renamed from: a */
    public final void mo111713a(CalendarDate calendarDate, CalendarSetting.DayOfWeek dayOfWeek) {
        CalendarDate addDay;
        IDiagramDelegate jVar;
        CalendarDate c;
        ListViewCacheDataBinder cVar;
        CalendarDate a = C32647d.m125277a(calendarDate, dayOfWeek);
        if (a != null && (addDay = a.addDay(-6)) != null && (jVar = this.f77609c) != null && (c = jVar.mo111637c()) != null && (cVar = this.f77607a) != null) {
            cVar.mo111688a(this.f77615j, this.f77614i, this.f77608b, addDay.getJulianDay(), a.getJulianDay(), c.getJulianDay(), true, false);
        }
    }

    /* renamed from: a */
    public final void mo111714a(CalendarDate calendarDate, boolean z) {
        C30022a.f74884c.mo108450a(new C30837j(this, calendarDate, z));
    }

    /* renamed from: a */
    public final void mo111715a(CalendarDate calendarDate, boolean z, CalendarSetting.DayOfWeek dayOfWeek) {
        CalendarDate c;
        ListViewCacheDataBinder cVar;
        CalendarDate b = C32647d.m125280b(calendarDate, dayOfWeek);
        CalendarDate c2 = C32647d.m125282c(calendarDate, dayOfWeek);
        IDiagramDelegate jVar = this.f77609c;
        if (jVar != null && (c = jVar.mo111637c()) != null && (cVar = this.f77607a) != null) {
            C31189a aVar = this.f77615j;
            C31181c cVar2 = this.f77614i;
            ListCalendarView listCalendarView = this.f77608b;
            Intrinsics.checkExpressionValueIsNotNull(b, "startDate");
            int julianDay = b.getJulianDay();
            Intrinsics.checkExpressionValueIsNotNull(c2, "endDate");
            cVar.mo111688a(aVar, cVar2, listCalendarView, julianDay, c2.getJulianDay(), c.getJulianDay(), false, z);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.IDiagramController
    /* renamed from: a */
    public void mo110992a(IDiagramDelegate jVar, CalendarDaysContract.AbstractC30658d dVar, IDateLogicData hVar) {
        CalendarDate c;
        Intrinsics.checkParameterIsNotNull(jVar, "diagramDelegate");
        Intrinsics.checkParameterIsNotNull(dVar, "viewDependency");
        Intrinsics.checkParameterIsNotNull(hVar, "dateLogicData");
        this.f77609c = jVar;
        Activity activity = this.f77610e;
        if (activity != null) {
            m115029a((Context) activity);
        }
        IDiagramDelegate jVar2 = this.f77609c;
        if (jVar2 != null && (c = jVar2.mo111637c()) != null) {
            mo111714a(c, false);
            mo111720n();
            LaunchPerfMonitor.m124430d("show_grid");
        }
    }
}
