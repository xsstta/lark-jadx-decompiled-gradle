package com.ss.android.lark.calendar.impl.features.calendarview.days;

import android.util.SparseArray;
import androidx.lifecycle.C1177w;
import com.larksuite.framework.utils.aj;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.IDateLogicData;
import com.ss.android.lark.calendar.impl.features.calendarview.SafeUITaskManager;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.DaysChipDataCache;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IPrepareChipData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.AllDayChipData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DayChipData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DayRange;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.MultiThreadLiveData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.SettingReadyData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.util.DayChipDataUtil;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.AllDayEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseModelCalendar;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag;
import com.ss.android.lark.log.Log;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001LB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0002H\u0016J\u0018\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0005H\u0016J\u0018\u0010.\u001a\u00020)2\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0005H\u0016J\u0010\u0010/\u001a\u00020)2\u0006\u00100\u001a\u000201H\u0002J\u0016\u00102\u001a\u00020)2\f\u00103\u001a\b\u0012\u0004\u0012\u00020104H\u0016J\b\u00105\u001a\u00020)H\u0016J\u0010\u00106\u001a\u00020)2\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020)H\u0016J\u0010\u0010:\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010;\u001a\u00020)H\u0016J\b\u0010<\u001a\u00020)H\u0016J\u0018\u0010=\u001a\u00020)2\u0006\u0010>\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u0013H\u0016J\b\u0010@\u001a\u00020)H\u0016J\b\u0010A\u001a\u00020)H\u0016J\b\u0010B\u001a\u00020)H\u0016J\u0010\u0010C\u001a\u00020)2\u0006\u0010D\u001a\u00020\u0013H\u0016J+\u0010E\u001a\b\u0012\u0004\u0012\u0002HF0\u000f\"\u0004\b\u0000\u0010F*\b\u0012\u0004\u0012\u0002HF0\u000f2\u0006\u0010G\u001a\u0002HFH\u0002¢\u0006\u0002\u0010HJ%\u0010I\u001a\u00020)\"\u0004\b\u0000\u0010F*\b\u0012\u0004\u0012\u0002HF0\u000f2\u0006\u0010J\u001a\u0002HFH\u0002¢\u0006\u0002\u0010KR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fX\u000e¢\u0006\u0002\n\u0000R!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\bX\u000e¢\u0006\u0002\n\u0000R#\u0010\u001e\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8BX\u0002¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysDiagramModel;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BaseModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramViewData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramModelApi;", "numDay", "", "(I)V", "allDayEventChipsLD", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/MultiThreadLiveData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/AllDayChipData;", "chipDataCache", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/DaysChipDataCache;", "dayEventChipsLD", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DayChipData;", "defaultEventDurationLD", "Landroidx/lifecycle/MutableLiveData;", "firstDayOfWeekLD", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "isShowLunarCalendarLD", "", "isTwelveTimeFormatLD", "()Landroidx/lifecycle/MutableLiveData;", "isTwelveTimeFormatLD$delegate", "Lkotlin/Lazy;", "logicDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDateLogicData;", "mSafeUITaskManager", "Lcom/ss/android/lark/calendar/impl/features/calendarview/SafeUITaskManager;", "settingReadyLD", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/SettingReadyData;", "timeFormatDpd", "Lcom/ss/android/lark/calendar/dependency/idependency/ITimeFormatDependency;", "kotlin.jvm.PlatformType", "getTimeFormatDpd", "()Lcom/ss/android/lark/calendar/dependency/idependency/ITimeFormatDependency;", "timeFormatDpd$delegate", "timeZoneIdLD", "", "calSetting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "destroy", "", "getViewData", "loadAllDayEventChipsData", "startDay", "endDay", "loadDayEventChipsData", "loadOnePageEventChipsData", "dayRange", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DayRange;", "loadPageEventChipsData", "pageDayRange", "", "preloadDiskData", "preloadInstance", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "resetDataCache", "setLogicDate", "setSettingReady", "updateAlternateCalendar", "updateCacheSelectDay", "selectDay", "isMoveToday", "updateDefaultEventDuration", "updateTimeFormat", "updateTimeZone", "updateWeekStartDay", "needRefreshAllPage", "default", "T", "initialValue", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "setValueInUIThread", "value", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.a */
public final class DaysDiagramModel extends BaseModelCalendar<IDaysDiagramContract.IDaysDiagramViewData> implements IDaysDiagramContract.IDaysDiagramModelApi {

    /* renamed from: j */
    public static final Companion f76980j = new Companion(null);

    /* renamed from: a */
    public DaysChipDataCache f76981a;

    /* renamed from: b */
    public IDateLogicData f76982b;

    /* renamed from: c */
    public C1177w<CalendarSetting.DayOfWeek> f76983c;

    /* renamed from: d */
    public C1177w<Boolean> f76984d;

    /* renamed from: e */
    public C1177w<String> f76985e;

    /* renamed from: f */
    public C1177w<Integer> f76986f;

    /* renamed from: g */
    public MultiThreadLiveData<SettingReadyData> f76987g;

    /* renamed from: h */
    public MultiThreadLiveData<AllDayChipData> f76988h;

    /* renamed from: i */
    public MultiThreadLiveData<DayChipData> f76989i;

    /* renamed from: k */
    private final SafeUITaskManager f76990k = new SafeUITaskManager();

    /* renamed from: l */
    private final Lazy f76991l;

    /* renamed from: m */
    private final Lazy f76992m;

    /* renamed from: n */
    private final int f76993n;

    /* renamed from: l */
    private final AbstractC30037ag m114243l() {
        return (AbstractC30037ag) this.f76991l.getValue();
    }

    /* renamed from: a */
    public final C1177w<Boolean> mo110905a() {
        return (C1177w) this.f76992m.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysDiagramModel$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\nH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\nH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\nH\u0016¨\u0006\u0015"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/DaysDiagramModel$getViewData$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramViewData;", "getAllDayChipsLD", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/MultiThreadLiveData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/AllDayChipData;", "getCurrentDay", "", "getDayChipsLD", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DayChipData;", "getDefaultEventDurationLD", "Landroidx/lifecycle/MutableLiveData;", "getFirstDayOfWeekLD", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "getSelectDay", "getSettingReadyLD", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/SettingReadyData;", "getShowLunarCalendarLD", "", "getTimeZoneIdLD", "", "getTwelveTimeFormatLD", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.a$b */
    public static final class C30697b implements IDaysDiagramContract.IDaysDiagramViewData {

        /* renamed from: a */
        final /* synthetic */ DaysDiagramModel f76994a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewData
        /* renamed from: a */
        public C1177w<CalendarSetting.DayOfWeek> mo110921a() {
            return this.f76994a.f76983c;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewData
        /* renamed from: b */
        public C1177w<Boolean> mo110922b() {
            return this.f76994a.f76984d;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewData
        /* renamed from: c */
        public C1177w<Boolean> mo110923c() {
            return this.f76994a.mo110905a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewData
        /* renamed from: d */
        public C1177w<String> mo110924d() {
            return this.f76994a.f76985e;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewData
        /* renamed from: e */
        public MultiThreadLiveData<AllDayChipData> mo110925e() {
            return this.f76994a.f76988h;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewData
        /* renamed from: f */
        public MultiThreadLiveData<DayChipData> mo110926f() {
            return this.f76994a.f76989i;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewData
        /* renamed from: g */
        public C1177w<Integer> mo110927g() {
            return this.f76994a.f76986f;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewData
        /* renamed from: h */
        public MultiThreadLiveData<SettingReadyData> mo110928h() {
            return this.f76994a.f76987g;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewData
        /* renamed from: i */
        public int mo110929i() {
            CalendarDate calendarDate;
            IDateLogicData hVar = this.f76994a.f76982b;
            if (hVar == null || (calendarDate = hVar.mo111629c()) == null) {
                calendarDate = new CalendarDate();
            }
            return calendarDate.getJulianDay();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramViewData
        /* renamed from: j */
        public int mo110930j() {
            CalendarDate calendarDate;
            IDateLogicData hVar = this.f76994a.f76982b;
            if (hVar == null || (calendarDate = hVar.mo111630d()) == null) {
                calendarDate = new CalendarDate();
            }
            return calendarDate.getJulianDay();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30697b(DaysDiagramModel aVar) {
            this.f76994a = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/lifecycle/MutableLiveData;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.a$c */
    static final class C30698c extends Lambda implements Function0<C1177w<Boolean>> {
        public static final C30698c INSTANCE = new C30698c();

        C30698c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C1177w<Boolean> invoke() {
            return new C1177w<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/dependency/idependency/ITimeFormatDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.a$g */
    static final class C30702g extends Lambda implements Function0<AbstractC30037ag> {
        public static final C30702g INSTANCE = new C30702g();

        C30702g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC30037ag invoke() {
            return C30022a.f74882a.timeFormatDependency();
        }
    }

    /* renamed from: k */
    private final CalendarSetting m114242k() {
        return C30022a.f74884c.mo108456c();
    }

    /* renamed from: j */
    public IDaysDiagramContract.IDaysDiagramViewData mo109793f() {
        return new C30697b(this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramModelApi
    /* renamed from: d */
    public void mo110915d() {
        C30022a.f74884c.mo108450a(new C30703h(this));
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseModelCalendar, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f76981a.mo110829m();
        this.f76990k.mo111646a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramModelApi
    /* renamed from: e */
    public void mo110916e() {
        C30022a.f74884c.mo108450a(new C30705j(this));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramModelApi
    /* renamed from: g */
    public void mo110917g() {
        C30022a.f74884c.mo108450a(new C30704i(this));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramModelApi
    /* renamed from: i */
    public void mo110919i() {
        Log.m165389i("DaysDiagramModel", "resetDataCache");
        this.f76981a.mo110828l();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramModelApi
    /* renamed from: b */
    public void mo110912b() {
        Log.m165389i("DaysDiagramModel", C32673y.m125378d("preloadDiskData"));
        this.f76981a.mo110819d(new CalendarDate().getJulianDay());
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramModelApi
    /* renamed from: h */
    public void mo110918h() {
        AbstractC30037ag l = m114243l();
        Intrinsics.checkExpressionValueIsNotNull(l, "timeFormatDpd");
        boolean a = l.mo108189a();
        Log.m165389i("DaysDiagramModel", C32673y.m125378d("updateTimeFormat " + mo110905a().mo5927b() + ", isTwentyFourHours"));
        if (!Intrinsics.areEqual(mo110905a().mo5927b(), Boolean.valueOf(a))) {
            mo110905a().mo5926a(Boolean.valueOf(a));
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramModelApi
    /* renamed from: c */
    public void mo110914c() {
        CalendarSetting.DayOfWeek weekStartDay = m114242k().getWeekStartDay();
        Intrinsics.checkExpressionValueIsNotNull(weekStartDay, "calSetting().weekStartDay");
        boolean isShowLunarCalendar = m114242k().isShowLunarCalendar();
        TimeZone safeMobileNormalViewTimezone = m114242k().getSafeMobileNormalViewTimezone();
        Intrinsics.checkExpressionValueIsNotNull(safeMobileNormalViewTimezone, "calSetting().safeMobileNormalViewTimezone");
        String id = safeMobileNormalViewTimezone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "calSetting().safeMobileNormalViewTimezone.id");
        AbstractC30037ag l = m114243l();
        Intrinsics.checkExpressionValueIsNotNull(l, "timeFormatDpd");
        this.f76987g.mo110983a(new SettingReadyData(weekStartDay, isShowLunarCalendar, id, l.mo108189a(), m114242k().getDefaultEventDuration()));
        if (this.f76983c.mo5927b() != m114242k().getWeekStartDay()) {
            Log.m165389i("DaysDiagramModel", C32673y.m125378d("checkCalendarSettingData " + m114242k().getWeekStartDay()));
            this.f76983c.mo5926a(m114242k().getWeekStartDay());
        }
        if (!Intrinsics.areEqual(this.f76984d.mo5927b(), Boolean.valueOf(m114242k().isShowLunarCalendar()))) {
            Log.m165389i("DaysDiagramModel", C32673y.m125378d("isShowLunarCalendar " + m114242k().isShowLunarCalendar()));
            this.f76984d.mo5926a(Boolean.valueOf(m114242k().isShowLunarCalendar()));
        }
        TimeZone safeMobileNormalViewTimezone2 = m114242k().getSafeMobileNormalViewTimezone();
        Intrinsics.checkExpressionValueIsNotNull(safeMobileNormalViewTimezone2, "calSetting().safeMobileNormalViewTimezone");
        if (aj.m95022b(this.f76985e.mo5927b(), safeMobileNormalViewTimezone2.getID())) {
            StringBuilder sb = new StringBuilder();
            sb.append("safeMobileNormalViewTimezone ");
            TimeZone safeMobileNormalViewTimezone3 = m114242k().getSafeMobileNormalViewTimezone();
            Intrinsics.checkExpressionValueIsNotNull(safeMobileNormalViewTimezone3, "calSetting().safeMobileNormalViewTimezone");
            sb.append(safeMobileNormalViewTimezone3.getID());
            Log.m165389i("DaysDiagramModel", C32673y.m125378d(sb.toString()));
            C1177w<String> wVar = this.f76985e;
            TimeZone safeMobileNormalViewTimezone4 = m114242k().getSafeMobileNormalViewTimezone();
            Intrinsics.checkExpressionValueIsNotNull(safeMobileNormalViewTimezone4, "calSetting().safeMobileNormalViewTimezone");
            wVar.mo5926a(safeMobileNormalViewTimezone4.getID());
        }
        AbstractC30037ag l2 = m114243l();
        Intrinsics.checkExpressionValueIsNotNull(l2, "timeFormatDpd");
        if (!Intrinsics.areEqual(mo110905a().mo5927b(), Boolean.valueOf(l2.mo108189a()))) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("isTwentyFourHours ");
            AbstractC30037ag l3 = m114243l();
            Intrinsics.checkExpressionValueIsNotNull(l3, "timeFormatDpd");
            sb2.append(l3.mo108189a());
            Log.m165389i("DaysDiagramModel", C32673y.m125378d(sb2.toString()));
            C1177w<Boolean> a = mo110905a();
            AbstractC30037ag l4 = m114243l();
            Intrinsics.checkExpressionValueIsNotNull(l4, "timeFormatDpd");
            a.mo5926a(Boolean.valueOf(l4.mo108189a()));
        }
        Integer b = this.f76986f.mo5927b();
        int defaultEventDuration = m114242k().getDefaultEventDuration();
        if (b == null || b.intValue() != defaultEventDuration) {
            Log.m165389i("DaysDiagramModel", C32673y.m125378d("defaultEventDuration " + this.f76986f.mo5927b() + ", " + m114242k().getDefaultEventDuration()));
            this.f76986f.mo5926a(Integer.valueOf(m114242k().getDefaultEventDuration()));
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramModelApi
    /* renamed from: a */
    public void mo110909a(IDateLogicData hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "logicDate");
        this.f76982b = hVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/DaysDiagramModel$loadAllDayEventChipsData$callBack$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IPrepareChipData;", "onError", "", ApiHandler.API_CALLBACK_ERRMSG, "", "onPrepared", "dataType", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IPrepareChipData$DataType;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.a$d */
    public static final class C30699d implements IPrepareChipData {

        /* renamed from: a */
        final /* synthetic */ DaysDiagramModel f76995a;

        /* renamed from: b */
        final /* synthetic */ int f76996b;

        /* renamed from: c */
        final /* synthetic */ int f76997c;

        /* renamed from: d */
        final /* synthetic */ String f76998d;

        /* renamed from: e */
        final /* synthetic */ String f76999e;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IPrepareChipData
        /* renamed from: a */
        public void mo110811a(String str) {
            Intrinsics.checkParameterIsNotNull(str, ApiHandler.API_CALLBACK_ERRMSG);
            Log.m165383e("DaysDiagramModel", C32673y.m125371a(this.f76998d, this.f76999e, str));
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IPrepareChipData
        /* renamed from: a */
        public void mo110810a(IPrepareChipData.DataType dataType) {
            Intrinsics.checkParameterIsNotNull(dataType, "dataType");
            SparseArray<ArrayList<AllDayEventChipViewData>> b = this.f76995a.f76981a.mo110733b(this.f76996b, this.f76997c);
            boolean z = false;
            Log.m165389i("DaysDiagramModel", C32673y.m125373a(this.f76998d, this.f76999e, "all_day_size", String.valueOf(b.size())));
            if (dataType == IPrepareChipData.DataType.DISK) {
                z = true;
            }
            int i = this.f76996b;
            int i2 = this.f76997c;
            ArrayList<AllDayEventChipViewData> arrayList = b.get(i);
            Intrinsics.checkExpressionValueIsNotNull(arrayList, "allDayChipData.get(startDay)");
            this.f76995a.f76988h.mo110983a(new AllDayChipData(i, i2, z, CollectionsKt.toList(arrayList)));
        }

        C30699d(DaysDiagramModel aVar, int i, int i2, String str, String str2) {
            this.f76995a = aVar;
            this.f76996b = i;
            this.f76997c = i2;
            this.f76998d = str;
            this.f76999e = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/DaysDiagramModel$loadDayEventChipsData$callBack$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IPrepareChipData;", "onError", "", ApiHandler.API_CALLBACK_ERRMSG, "", "onPrepared", "dataType", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IPrepareChipData$DataType;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.a$e */
    public static final class C30700e implements IPrepareChipData {

        /* renamed from: a */
        final /* synthetic */ DaysDiagramModel f77000a;

        /* renamed from: b */
        final /* synthetic */ int f77001b;

        /* renamed from: c */
        final /* synthetic */ int f77002c;

        /* renamed from: d */
        final /* synthetic */ String f77003d;

        /* renamed from: e */
        final /* synthetic */ String f77004e;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IPrepareChipData
        /* renamed from: a */
        public void mo110811a(String str) {
            Intrinsics.checkParameterIsNotNull(str, ApiHandler.API_CALLBACK_ERRMSG);
            Log.m165383e("DaysDiagramModel", C32673y.m125371a(this.f77003d, this.f77004e, str));
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IPrepareChipData
        /* renamed from: a */
        public void mo110810a(IPrepareChipData.DataType dataType) {
            Intrinsics.checkParameterIsNotNull(dataType, "dataType");
            SparseArray<ArrayList<DayEventChipViewData>> a = this.f77000a.f76981a.mo110728a(this.f77001b, this.f77002c);
            boolean z = true;
            Log.m165389i("DaysDiagramModel", C32673y.m125373a(this.f77003d, this.f77004e, "bindDayLayer size", String.valueOf(a.size())));
            if (dataType != IPrepareChipData.DataType.DISK) {
                z = false;
            }
            int size = a.size();
            for (int i = 0; i < size; i++) {
                this.f77000a.f76989i.mo110983a(new DayChipData(a.keyAt(i), z, false, a.valueAt(i)));
            }
        }

        C30700e(DaysDiagramModel aVar, int i, int i2, String str, String str2) {
            this.f77000a = aVar;
            this.f77001b = i;
            this.f77002c = i2;
            this.f77003d = str;
            this.f77004e = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/DaysDiagramModel$loadOnePageEventChipsData$callBack$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IPrepareChipData;", "onError", "", ApiHandler.API_CALLBACK_ERRMSG, "", "onPrepared", "dataType", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IPrepareChipData$DataType;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.a$f */
    public static final class C30701f implements IPrepareChipData {

        /* renamed from: a */
        final /* synthetic */ DaysDiagramModel f77005a;

        /* renamed from: b */
        final /* synthetic */ int f77006b;

        /* renamed from: c */
        final /* synthetic */ int f77007c;

        /* renamed from: d */
        final /* synthetic */ String f77008d;

        /* renamed from: e */
        final /* synthetic */ String f77009e;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IPrepareChipData
        /* renamed from: a */
        public void mo110811a(String str) {
            Intrinsics.checkParameterIsNotNull(str, ApiHandler.API_CALLBACK_ERRMSG);
            Log.m165383e("DaysDiagramModel", C32673y.m125371a(this.f77008d, this.f77009e, str));
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IPrepareChipData
        /* renamed from: a */
        public void mo110810a(IPrepareChipData.DataType dataType) {
            boolean z;
            CalendarDate calendarDate;
            Intrinsics.checkParameterIsNotNull(dataType, "dataType");
            DaysChipDataCache.DaysChipData a = this.f77005a.f76981a.mo110729a(dataType, this.f77006b, this.f77007c);
            if (a != null) {
                SparseArray<ArrayList<AllDayEventChipViewData>> a2 = a.mo110737a();
                SparseArray<ArrayList<DayEventChipViewData>> b = a.mo110738b();
                if (dataType == IPrepareChipData.DataType.DISK) {
                    z = true;
                } else {
                    z = false;
                }
                Log.m165389i("DaysDiagramModel", C32673y.m125373a(this.f77008d, this.f77009e, "all day size", String.valueOf(a2.size()), "day size", String.valueOf(b.size())));
                int i = this.f77006b;
                int i2 = this.f77007c;
                ArrayList<AllDayEventChipViewData> arrayList = a2.get(i);
                Intrinsics.checkExpressionValueIsNotNull(arrayList, "allDayChipData.get(startDay)");
                this.f77005a.f76988h.mo110983a(new AllDayChipData(i, i2, z, CollectionsKt.toList(arrayList)));
                int size = b.size();
                ArrayList<DayChipData> arrayList2 = new ArrayList<>(size);
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add(new DayChipData(b.keyAt(i3), z, true, b.valueAt(i3)));
                }
                IDateLogicData hVar = this.f77005a.f76982b;
                if (hVar == null || (calendarDate = hVar.mo111629c()) == null) {
                    calendarDate = new CalendarDate();
                }
                Iterator<T> it = DayChipDataUtil.f77184a.mo111137a(calendarDate.getJulianDay(), arrayList2).iterator();
                while (it.hasNext()) {
                    this.f77005a.f76989i.mo110983a(it.next());
                }
                return;
            }
            Log.m165383e("DaysDiagramModel", C32673y.m125378d("daysData = null"));
        }

        C30701f(DaysDiagramModel aVar, int i, int i2, String str, String str2) {
            this.f77005a = aVar;
            this.f77006b = i;
            this.f77007c = i2;
            this.f77008d = str;
            this.f77009e = str2;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramModelApi
    /* renamed from: a */
    public void mo110910a(List<DayRange> list) {
        Intrinsics.checkParameterIsNotNull(list, "pageDayRange");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            m114241a((DayRange) it.next());
        }
    }

    /* renamed from: a */
    private final void m114241a(DayRange dVar) {
        int a = dVar.mo110954a();
        int b = dVar.mo110955b();
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("DaysDiagramModel", C32673y.m125376b(valueOf, "loadOnePageEventChipsData", "query range", String.valueOf(dVar)));
        this.f76981a.mo110812a(a, b, new C30701f(this, a, b, valueOf, "loadOnePageEventChipsData"));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.a$h */
    static final class C30703h implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ DaysDiagramModel f77010a;

        C30703h(DaysDiagramModel aVar) {
            this.f77010a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateAlternateCalendar ");
            sb.append(this.f77010a.f76984d.mo5927b());
            sb.append(", ");
            Intrinsics.checkExpressionValueIsNotNull(calendarSetting, "it");
            sb.append(calendarSetting.isShowLunarCalendar());
            Log.m165389i("DaysDiagramModel", C32673y.m125378d(sb.toString()));
            if (!Intrinsics.areEqual(this.f77010a.f76984d.mo5927b(), Boolean.valueOf(calendarSetting.isShowLunarCalendar()))) {
                this.f77010a.f76984d.mo5926a(Boolean.valueOf(calendarSetting.isShowLunarCalendar()));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.a$i */
    static final class C30704i implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ DaysDiagramModel f77011a;

        C30704i(DaysDiagramModel aVar) {
            this.f77011a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateDefaultEventDuration ");
            sb.append(this.f77011a.f76986f.mo5927b());
            sb.append(", ");
            Intrinsics.checkExpressionValueIsNotNull(calendarSetting, "it");
            sb.append(calendarSetting.getDefaultEventDuration());
            Log.m165389i("DaysDiagramModel", C32673y.m125378d(sb.toString()));
            int defaultEventDuration = calendarSetting.getDefaultEventDuration();
            Integer b = this.f77011a.f76986f.mo5927b();
            if (b == null || defaultEventDuration != b.intValue()) {
                this.f77011a.f76986f.mo5926a(Integer.valueOf(calendarSetting.getDefaultEventDuration()));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.a$j */
    static final class C30705j implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ DaysDiagramModel f77012a;

        C30705j(DaysDiagramModel aVar) {
            this.f77012a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateTimeZone ");
            sb.append(this.f77012a.f76985e.mo5927b());
            sb.append(", ");
            Intrinsics.checkExpressionValueIsNotNull(calendarSetting, "it");
            TimeZone safeMobileNormalViewTimezone = calendarSetting.getSafeMobileNormalViewTimezone();
            Intrinsics.checkExpressionValueIsNotNull(safeMobileNormalViewTimezone, "it.safeMobileNormalViewTimezone");
            sb.append(safeMobileNormalViewTimezone.getID());
            Log.m165389i("DaysDiagramModel", C32673y.m125378d(sb.toString()));
            TimeZone safeMobileNormalViewTimezone2 = calendarSetting.getSafeMobileNormalViewTimezone();
            Intrinsics.checkExpressionValueIsNotNull(safeMobileNormalViewTimezone2, "it.safeMobileNormalViewTimezone");
            if (!Intrinsics.areEqual(this.f77012a.f76985e.mo5927b(), safeMobileNormalViewTimezone2.getID())) {
                C1177w<String> wVar = this.f77012a.f76985e;
                TimeZone safeMobileNormalViewTimezone3 = calendarSetting.getSafeMobileNormalViewTimezone();
                Intrinsics.checkExpressionValueIsNotNull(safeMobileNormalViewTimezone3, "it.safeMobileNormalViewTimezone");
                wVar.mo5926a(safeMobileNormalViewTimezone3.getID());
                this.f77012a.mo110919i();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.a$k */
    static final class C30706k implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ DaysDiagramModel f77013a;

        C30706k(DaysDiagramModel aVar) {
            this.f77013a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateWeekStartDay ");
            sb.append(this.f77013a.f76983c.mo5927b());
            sb.append(", ");
            Intrinsics.checkExpressionValueIsNotNull(calendarSetting, "it");
            sb.append(calendarSetting.getWeekStartDay());
            Log.m165389i("DaysDiagramModel", C32673y.m125378d(sb.toString()));
            if (this.f77013a.f76983c.mo5927b() != calendarSetting.getWeekStartDay()) {
                this.f77013a.f76983c.mo5926a(calendarSetting.getWeekStartDay());
            }
        }
    }

    public DaysDiagramModel(int i) {
        DaysChipDataCache aVar;
        this.f76993n = i;
        if (i != 1) {
            aVar = new DaysChipDataCache(3);
        } else {
            aVar = new DaysChipDataCache(1);
        }
        this.f76981a = aVar;
        this.f76991l = LazyKt.lazy(C30702g.INSTANCE);
        C1177w wVar = new C1177w();
        CalendarSetting.DayOfWeek weekStartDay = m114242k().getWeekStartDay();
        Intrinsics.checkExpressionValueIsNotNull(weekStartDay, "calSetting().weekStartDay");
        this.f76983c = m114240a(wVar, weekStartDay);
        this.f76984d = m114240a(new C1177w(), Boolean.valueOf(m114242k().isShowLunarCalendar()));
        this.f76992m = LazyKt.lazy(C30698c.INSTANCE);
        C1177w wVar2 = new C1177w();
        TimeZone safeMobileNormalViewTimezone = m114242k().getSafeMobileNormalViewTimezone();
        Intrinsics.checkExpressionValueIsNotNull(safeMobileNormalViewTimezone, "calSetting().safeMobileNormalViewTimezone");
        String id = safeMobileNormalViewTimezone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "calSetting().safeMobileNormalViewTimezone.id");
        this.f76985e = m114240a(wVar2, id);
        this.f76986f = m114240a(new C1177w(), Integer.valueOf(m114242k().getDefaultEventDuration()));
        this.f76987g = new MultiThreadLiveData<>();
        this.f76988h = new MultiThreadLiveData<>();
        this.f76989i = new MultiThreadLiveData<>();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramModelApi
    /* renamed from: a */
    public void mo110908a(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
        Log.m165389i("DaysDiagramModel", C32673y.m125378d("preloadInstance = " + calendarDate));
        mo110914c();
        this.f76981a.mo110731a(calendarDate.getJulianDay());
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramModelApi
    /* renamed from: a */
    public void mo110911a(boolean z) {
        C30022a.f74884c.mo108450a(new C30706k(this));
    }

    /* renamed from: a */
    private final <T> C1177w<T> m114240a(C1177w<T> wVar, T t) {
        wVar.mo5929b((Object) t);
        return wVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramModelApi
    /* renamed from: a */
    public void mo110906a(int i, int i2) {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("DaysDiagramModel", C32673y.m125376b(valueOf, "loadAllDayEventChipsData", "query range", '[' + i + ", " + i2 + ']'));
        this.f76981a.mo110812a(i, i2, new C30699d(this, i, i2, valueOf, "loadAllDayEventChipsData"));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramModelApi
    /* renamed from: b */
    public void mo110913b(int i, int i2) {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("DaysDiagramModel", C32673y.m125376b(valueOf, "loadDayEventChipsData", "query range", '[' + i + ", " + i2 + ']'));
        this.f76981a.mo110812a(i, i2, new C30700e(this, i, i2, valueOf, "loadDayEventChipsData"));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.IDaysDiagramContract.IDaysDiagramModelApi
    /* renamed from: a */
    public void mo110907a(int i, boolean z) {
        CalendarDate calendarDate;
        Log.m165389i("DaysDiagramModel", "updateCacheSelectDay selectDay = " + i + ", isMoveToday = " + z);
        if (z) {
            IDateLogicData hVar = this.f76982b;
            if (hVar == null || (calendarDate = hVar.mo111630d()) == null) {
                calendarDate = new CalendarDate();
            }
            this.f76981a.mo110821e(calendarDate.getJulianDay());
            return;
        }
        this.f76981a.mo110821e(i);
    }
}
