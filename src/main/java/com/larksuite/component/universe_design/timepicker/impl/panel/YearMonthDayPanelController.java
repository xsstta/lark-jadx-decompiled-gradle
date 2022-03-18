package com.larksuite.component.universe_design.timepicker.impl.panel;

import android.content.Context;
import com.larksuite.component.universe_design.timepicker.impl.adapter.CustomNumericWheelAdapter;
import com.larksuite.component.universe_design.timepicker.impl.adapter.DayWeekWheelAdapter;
import com.larksuite.component.universe_design.timepicker.impl.adapter.MonthWheelAdapter;
import com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter;
import com.larksuite.component.universe_design.timepicker.impl.base.OnItemSelectedListener;
import com.larksuite.component.universe_design.timepicker.impl.base.WheelView;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerBuilder;
import com.larksuite.component.universe_design.timepicker.impl.helper.TimePickerHelper;
import com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController;
import com.larksuite.component.universe_design.timepicker.impl.single.MonthDayPicker;
import com.larksuite.component.universe_design.timepicker.impl.single.MonthPicker;
import com.larksuite.component.universe_design.timepicker.impl.single.YearPicker;
import com.larksuite.component.universe_design.util.CalendarDate;
import com.larksuite.component.universe_design.util.ResUtil;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 22\u00020\u0001:\u00012B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\u001e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001bH\u0016J\b\u0010\u001f\u001a\u00020\fH\u0002J\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0017H\u0002J\b\u0010#\u001a\u00020\u0017H\u0002J\b\u0010$\u001a\u00020\u0017H\u0002J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\fH\u0002J\u0018\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\fH\u0002J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u00020\fH\u0016J\b\u00101\u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/panel/YearMonthDayPanelController;", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController;", "context", "Landroid/content/Context;", "pickerPanelDependency", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController$PickerPanelDependency;", "beginCalendar", "Lcom/larksuite/component/universe_design/util/CalendarDate;", "endCalendar", "(Landroid/content/Context;Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController$PickerPanelDependency;Lcom/larksuite/component/universe_design/util/CalendarDate;Lcom/larksuite/component/universe_design/util/CalendarDate;)V", "chooseCalendar", "currentMonthBegin", "", "currentMonthDayBegin", "monthDayWheelView", "Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView;", "monthWheelView", "weekStringArray", "", "", "[Ljava/lang/String;", "yearWheelView", "adjustSelectCalendarDate", "", "selectedDate", "create", "builderList", "", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder;", "getPickerBuilderList", "getPickerViewList", "getSelectMonth", "getWeekStr", "()[Ljava/lang/String;", "initItemSelectedListener", "initView", "refreshCurrentTime", "resetMonth", "selectYear", "resetMonthDay", "yearNum", "monthNum", "setCurrentDate", "Ljava/util/Calendar;", "setItemDividerVisibility", "isShow", "", "setItemVisibleNum", "visibleItemNum", "updateCurrentMonthBegin", "Companion", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.panel.d */
public final class YearMonthDayPanelController extends BaseTimePickerController {

    /* renamed from: f */
    public static final Companion f63758f = new Companion(null);

    /* renamed from: a */
    public CalendarDate f63759a;

    /* renamed from: b */
    public WheelView f63760b;

    /* renamed from: c */
    public WheelView f63761c;

    /* renamed from: d */
    public int f63762d;

    /* renamed from: e */
    public CalendarDate f63763e;

    /* renamed from: g */
    private WheelView f63764g;

    /* renamed from: h */
    private String[] f63765h;

    /* renamed from: i */
    private int f63766i;

    /* renamed from: j */
    private CalendarDate f63767j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nJ\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002¨\u0006\u000e"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/panel/YearMonthDayPanelController$Companion;", "", "()V", "createYearMonthDayPanelController", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/YearMonthDayPanelController;", "context", "Landroid/content/Context;", "pickerPanelDependency", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController$PickerPanelDependency;", "beginCalendar", "Lcom/larksuite/component/universe_design/util/CalendarDate;", "endCalendar", "getDefaultBeginCalendar", "getDefaultEndCalendar", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.panel.d$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        private final CalendarDate m93185a() {
            return new CalendarDate(1990, 1, 1, 0, 0, 0);
        }

        /* renamed from: b */
        private final CalendarDate m93186b() {
            return new CalendarDate(2100, 12, 31, 0, 0, 0);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final YearMonthDayPanelController mo91629a(Context context, BaseTimePickerController.PickerPanelDependency pickerPanelDependency, CalendarDate calendarDate, CalendarDate calendarDate2) {
            CalendarDate calendarDate3;
            CalendarDate calendarDate4;
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(pickerPanelDependency, "pickerPanelDependency");
            Intrinsics.checkParameterIsNotNull(calendarDate, "beginCalendar");
            Intrinsics.checkParameterIsNotNull(calendarDate2, "endCalendar");
            if (calendarDate2.getJulianDay() < calendarDate.getJulianDay()) {
                Companion aVar = this;
                CalendarDate a = aVar.m93185a();
                calendarDate3 = aVar.m93186b();
                calendarDate4 = a;
            } else {
                calendarDate4 = calendarDate;
                calendarDate3 = calendarDate2;
            }
            return new YearMonthDayPanelController(context, pickerPanelDependency, calendarDate4, calendarDate3, null);
        }

        /* renamed from: a */
        public static /* synthetic */ YearMonthDayPanelController m93184a(Companion aVar, Context context, BaseTimePickerController.PickerPanelDependency pickerPanelDependency, CalendarDate calendarDate, CalendarDate calendarDate2, int i, Object obj) {
            if ((i & 4) != 0) {
                calendarDate = aVar.m93185a();
            }
            if ((i & 8) != 0) {
                calendarDate2 = aVar.m93186b();
            }
            return aVar.mo91629a(context, pickerPanelDependency, calendarDate, calendarDate2);
        }
    }

    /* renamed from: d */
    private final String[] m93179d() {
        String[] strArr = this.f63765h;
        if (strArr != null) {
            return strArr;
        }
        String[] a = ResUtil.m93302a(getContext(), R.array.ud_timePicker_weeks);
        this.f63765h = a;
        return a;
    }

    /* renamed from: e */
    private final void m93180e() {
        BaseWheelAdapter<? extends Object> aVar;
        WheelView wheelView = this.f63761c;
        CustomNumericWheelAdapter bVar = null;
        if (wheelView != null) {
            aVar = wheelView.getAdapter();
        } else {
            aVar = null;
        }
        if (aVar instanceof CustomNumericWheelAdapter) {
            bVar = aVar;
        }
        CustomNumericWheelAdapter bVar2 = bVar;
        if (bVar2 != null) {
            this.f63762d = bVar2.mo91455b();
        }
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public List<WheelView> getPickerViewList() {
        ArrayList arrayList = new ArrayList();
        WheelView wheelView = this.f63760b;
        if (wheelView != null) {
            arrayList.add(wheelView);
        }
        WheelView wheelView2 = this.f63761c;
        if (wheelView2 != null) {
            arrayList.add(wheelView2);
        }
        WheelView wheelView3 = this.f63764g;
        if (wheelView3 != null) {
            arrayList.add(wheelView3);
        }
        return arrayList;
    }

    /* renamed from: b */
    private final void m93177b() {
        WheelView wheelView = this.f63760b;
        if (wheelView != null) {
            wheelView.setLabel(ResUtil.m93300a(getContext(), R.string.Calendar_StandardTime_YearOnlyString, "year", ""));
        }
        setItemVisibleNum(getPickerPanelDependency().getPanelStyleData().getVisibleItemNum());
        setItemDividerVisibility(getPickerPanelDependency().getPanelStyleData().getItemDividerVisibility());
        m93178c();
    }

    /* renamed from: c */
    private final void m93178c() {
        C25800d dVar = new C25800d(this);
        C25799c cVar = new C25799c(this);
        C25798b bVar = new C25798b(this);
        WheelView wheelView = this.f63760b;
        if (wheelView != null) {
            wheelView.setOnItemSelectedListener(dVar);
        }
        WheelView wheelView2 = this.f63761c;
        if (wheelView2 != null) {
            wheelView2.setOnItemSelectedListener(cVar);
        }
        WheelView wheelView3 = this.f63764g;
        if (wheelView3 != null) {
            wheelView3.setOnItemSelectedListener(bVar);
        }
    }

    /* renamed from: a */
    public final void mo91626a() {
        WheelView wheelView = this.f63760b;
        if (wheelView != null) {
            this.f63759a.setYear(this.f63763e.getYear() + wheelView.getCurrentItem());
        }
        WheelView wheelView2 = this.f63761c;
        if (wheelView2 != null) {
            this.f63759a.setMonth(this.f63762d + wheelView2.getCurrentItem());
        }
        WheelView wheelView3 = this.f63764g;
        if (wheelView3 != null) {
            this.f63759a.setMonthDay(this.f63766i + wheelView3.getCurrentItem());
        }
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public List<PickerBuilder> getPickerBuilderList() {
        ArrayList arrayList = new ArrayList();
        PickerBuilder pickerBuilder = YearPicker.INSTANCE.getPickerBuilder(this.f63763e.getYear(), this.f63767j.getYear(), true);
        if (pickerBuilder != null) {
            arrayList.add(pickerBuilder);
        }
        PickerBuilder a = MonthPicker.m93195a(getContext(), this.f63763e, this.f63767j, this.f63759a.getYear(), true);
        if (a != null) {
            arrayList.add(a);
        }
        arrayList.add(MonthDayPicker.f63775a.mo91636a(getContext(), this.f63759a, m93179d(), true, getPickerPanelDependency().getPanelStyleData().getShowDayInfo()));
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/larksuite/component/universe_design/timepicker/impl/panel/YearMonthDayPanelController$initItemSelectedListener$monthDayPickerListener$1", "Lcom/larksuite/component/universe_design/timepicker/impl/base/OnItemSelectedListener;", "onItemSelected", "", "index", "", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.panel.d$b */
    public static final class C25798b implements OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ YearMonthDayPanelController f63768a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25798b(YearMonthDayPanelController dVar) {
            this.f63768a = dVar;
        }

        @Override // com.larksuite.component.universe_design.timepicker.impl.base.OnItemSelectedListener
        public void onItemSelected(int i) {
            this.f63768a.mo91626a();
            BaseTimePickerController.PickerPanelDependency pickerPanelDependency = this.f63768a.getPickerPanelDependency();
            Calendar calendar = this.f63768a.f63759a.getCalendar();
            Intrinsics.checkExpressionValueIsNotNull(calendar, "chooseCalendar.calendar");
            pickerPanelDependency.onSelected(calendar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/larksuite/component/universe_design/timepicker/impl/panel/YearMonthDayPanelController$initItemSelectedListener$monthPickerListener$1", "Lcom/larksuite/component/universe_design/timepicker/impl/base/OnItemSelectedListener;", "onItemSelected", "", "index", "", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.panel.d$c */
    public static final class C25799c implements OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ YearMonthDayPanelController f63769a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25799c(YearMonthDayPanelController dVar) {
            this.f63769a = dVar;
        }

        @Override // com.larksuite.component.universe_design.timepicker.impl.base.OnItemSelectedListener
        public void onItemSelected(int i) {
            int i2;
            int year = this.f63769a.f63763e.getYear();
            WheelView wheelView = this.f63769a.f63760b;
            int i3 = 0;
            if (wheelView != null) {
                i2 = wheelView.getCurrentItem();
            } else {
                i2 = 0;
            }
            int i4 = year + i2;
            int i5 = this.f63769a.f63762d;
            WheelView wheelView2 = this.f63769a.f63761c;
            if (wheelView2 != null) {
                i3 = wheelView2.getCurrentItem();
            }
            this.f63769a.mo91628a(i4, i5 + i3);
            this.f63769a.mo91626a();
            BaseTimePickerController.PickerPanelDependency pickerPanelDependency = this.f63769a.getPickerPanelDependency();
            Calendar calendar = this.f63769a.f63759a.getCalendar();
            Intrinsics.checkExpressionValueIsNotNull(calendar, "chooseCalendar.calendar");
            pickerPanelDependency.onSelected(calendar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/larksuite/component/universe_design/timepicker/impl/panel/YearMonthDayPanelController$initItemSelectedListener$yearPickerListener$1", "Lcom/larksuite/component/universe_design/timepicker/impl/base/OnItemSelectedListener;", "onItemSelected", "", "index", "", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.panel.d$d */
    public static final class C25800d implements OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ YearMonthDayPanelController f63770a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25800d(YearMonthDayPanelController dVar) {
            this.f63770a = dVar;
        }

        @Override // com.larksuite.component.universe_design.timepicker.impl.base.OnItemSelectedListener
        public void onItemSelected(int i) {
            int i2;
            int year = this.f63770a.f63763e.getYear();
            WheelView wheelView = this.f63770a.f63760b;
            int i3 = 0;
            if (wheelView != null) {
                i2 = wheelView.getCurrentItem();
            } else {
                i2 = 0;
            }
            int i4 = year + i2;
            this.f63770a.mo91627a(i4);
            int i5 = this.f63770a.f63762d;
            WheelView wheelView2 = this.f63770a.f63761c;
            if (wheelView2 != null) {
                i3 = wheelView2.getCurrentItem();
            }
            this.f63770a.mo91628a(i4, i5 + i3);
            this.f63770a.mo91626a();
            BaseTimePickerController.PickerPanelDependency pickerPanelDependency = this.f63770a.getPickerPanelDependency();
            Calendar calendar = this.f63770a.f63759a.getCalendar();
            Intrinsics.checkExpressionValueIsNotNull(calendar, "chooseCalendar.calendar");
            pickerPanelDependency.onSelected(calendar);
        }
    }

    /* renamed from: a */
    private final void m93176a(CalendarDate calendarDate) {
        int julianDay = calendarDate.getJulianDay();
        int julianDay2 = this.f63763e.getJulianDay();
        int julianDay3 = this.f63767j.getJulianDay();
        if (julianDay < julianDay2) {
            calendarDate.setJulianDay(julianDay2);
        } else if (julianDay > julianDay3) {
            calendarDate.setJulianDay(julianDay3);
        }
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void setItemDividerVisibility(boolean z) {
        WheelView.DividerType dividerType;
        if (z) {
            dividerType = WheelView.DividerType.FILL;
        } else {
            dividerType = WheelView.DividerType.NONE;
        }
        WheelView wheelView = this.f63760b;
        if (wheelView != null) {
            wheelView.setDividerType(dividerType);
        }
        WheelView wheelView2 = this.f63761c;
        if (wheelView2 != null) {
            wheelView2.setDividerType(dividerType);
        }
        WheelView wheelView3 = this.f63764g;
        if (wheelView3 != null) {
            wheelView3.setDividerType(dividerType);
        }
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void setItemVisibleNum(int i) {
        WheelView wheelView = this.f63760b;
        if (wheelView != null) {
            wheelView.setItemVisible(i + 2);
        }
        WheelView wheelView2 = this.f63761c;
        if (wheelView2 != null) {
            wheelView2.setItemVisible(i + 2);
        }
        WheelView wheelView3 = this.f63764g;
        if (wheelView3 != null) {
            wheelView3.setItemVisible(i + 2);
        }
    }

    /* renamed from: a */
    public final void mo91627a(int i) {
        WheelView wheelView = this.f63761c;
        if (wheelView != null) {
            int currentItem = this.f63762d + wheelView.getCurrentItem();
            MonthWheelAdapter a = MonthPicker.m93194a(getContext(), this.f63763e, this.f63767j, i);
            if (a != null) {
                this.f63762d = a.mo91469b();
                wheelView.setAdapter(a);
                int i2 = this.f63762d;
                if (currentItem > (a.mo91448a() - 1) + i2) {
                    currentItem = a.mo91448a() - 1;
                } else if (currentItem < i2) {
                    currentItem = i2;
                }
                wheelView.setCurrentItem(currentItem - this.f63762d);
            }
        }
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void setCurrentDate(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "selectedDate");
        CalendarDate calendarDate = new CalendarDate(calendar);
        m93176a(calendarDate);
        this.f63759a = calendarDate;
        int year = calendarDate.getYear();
        int month = calendarDate.getMonth();
        int monthDay = calendarDate.getMonthDay();
        WheelView wheelView = this.f63760b;
        if (wheelView != null) {
            wheelView.setCurrentItem(year - this.f63763e.getYear());
        }
        mo91627a(year);
        WheelView wheelView2 = this.f63761c;
        if (wheelView2 != null) {
            wheelView2.setCurrentItem(month - this.f63762d);
        }
        mo91628a(year, month);
        WheelView wheelView3 = this.f63764g;
        if (wheelView3 != null) {
            wheelView3.setCurrentItem(monthDay - this.f63766i);
        }
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void create(Context context, List<PickerBuilder> list) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(list, "builderList");
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            if (i == 0) {
                this.f63760b = TimePickerHelper.INSTANCE.createWheelView(context, t2);
            } else if (i == 1) {
                this.f63761c = TimePickerHelper.INSTANCE.createWheelView(context, t2);
                m93180e();
            } else if (i == 2) {
                this.f63764g = TimePickerHelper.INSTANCE.createWheelView(context, t2);
            }
            i = i2;
        }
        m93177b();
    }

    /* renamed from: a */
    public final void mo91628a(int i, int i2) {
        WheelView wheelView = this.f63764g;
        if (wheelView != null) {
            int currentItem = wheelView.getCurrentItem();
            DayWeekWheelAdapter a = MonthDayPicker.f63775a.mo91635a(getContext(), i, i2, m93179d(), getPickerPanelDependency().getPanelStyleData().getShowDayInfo());
            wheelView.setAdapter(a);
            if (currentItem > a.mo91448a() - 1) {
                currentItem = a.mo91448a() - 1;
            }
            wheelView.setCurrentItem(currentItem);
        }
    }

    private YearMonthDayPanelController(Context context, BaseTimePickerController.PickerPanelDependency pickerPanelDependency, CalendarDate calendarDate, CalendarDate calendarDate2) {
        super(context, pickerPanelDependency);
        this.f63763e = calendarDate;
        this.f63767j = calendarDate2;
        CalendarDate calendarDate3 = new CalendarDate(pickerPanelDependency.getSelectedDate());
        this.f63759a = calendarDate3;
        this.f63762d = 1;
        this.f63766i = 1;
        m93176a(calendarDate3);
    }

    public /* synthetic */ YearMonthDayPanelController(Context context, BaseTimePickerController.PickerPanelDependency pickerPanelDependency, CalendarDate calendarDate, CalendarDate calendarDate2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, pickerPanelDependency, calendarDate, calendarDate2);
    }
}
