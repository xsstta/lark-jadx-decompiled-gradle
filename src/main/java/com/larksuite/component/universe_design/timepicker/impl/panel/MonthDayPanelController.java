package com.larksuite.component.universe_design.timepicker.impl.panel;

import android.content.Context;
import com.larksuite.component.universe_design.timepicker.impl.base.OnItemSelectedListener;
import com.larksuite.component.universe_design.timepicker.impl.base.WheelView;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerBuilder;
import com.larksuite.component.universe_design.timepicker.impl.helper.TimePickerHelper;
import com.larksuite.component.universe_design.timepicker.impl.helper.UtcDates;
import com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController;
import com.larksuite.component.universe_design.timepicker.impl.single.DatePicker;
import com.larksuite.component.universe_design.util.CalendarDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 !2\u00020\u0001:\u0001!B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/panel/MonthDayPanelController;", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController;", "mContext", "Landroid/content/Context;", "pickerPanelDependency", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController$PickerPanelDependency;", "beginCalendarDate", "Lcom/larksuite/component/universe_design/util/CalendarDate;", "endCalendarDate", "(Landroid/content/Context;Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController$PickerPanelDependency;Lcom/larksuite/component/universe_design/util/CalendarDate;Lcom/larksuite/component/universe_design/util/CalendarDate;)V", "chooseCalendar", "dateWheelView", "Lcom/larksuite/component/universe_design/timepicker/impl/base/WheelView;", "create", "", "context", "builderList", "", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder;", "getPickerBuilderList", "getPickerViewList", "initItemSelectedListener", "initView", "refreshCurrentTime", "setCurrentDate", "selectedDate", "Ljava/util/Calendar;", "setItemDividerVisibility", "isShow", "", "setItemVisibleNum", "visibleItemNum", "", "Companion", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.panel.c */
public final class MonthDayPanelController extends BaseTimePickerController {

    /* renamed from: b */
    public static final Companion f63752b = new Companion(null);

    /* renamed from: a */
    public CalendarDate f63753a;

    /* renamed from: c */
    private WheelView f63754c;

    /* renamed from: d */
    private CalendarDate f63755d;

    /* renamed from: e */
    private CalendarDate f63756e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nJ\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002¨\u0006\u000e"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/panel/MonthDayPanelController$Companion;", "", "()V", "createMonthDayPanelController", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/MonthDayPanelController;", "context", "Landroid/content/Context;", "pickerPanelDependency", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController$PickerPanelDependency;", "beginCalendar", "Lcom/larksuite/component/universe_design/util/CalendarDate;", "endCalendar", "getDefaultEndCalendar", "getDefaultStartCalendar", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.panel.c$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: b */
        private final CalendarDate m93174b() {
            return new CalendarDate(UtcDates.INSTANCE.getCalendar(2100, 1, 1, 0, 0, 0));
        }

        /* renamed from: a */
        private final CalendarDate m93173a() {
            return new CalendarDate(UtcDates.INSTANCE.getCalendar(2010, 1, 1, 0, 0, 0));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MonthDayPanelController mo91625a(Context context, BaseTimePickerController.PickerPanelDependency pickerPanelDependency, CalendarDate calendarDate, CalendarDate calendarDate2) {
            CalendarDate calendarDate3;
            CalendarDate calendarDate4;
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(pickerPanelDependency, "pickerPanelDependency");
            Intrinsics.checkParameterIsNotNull(calendarDate, "beginCalendar");
            Intrinsics.checkParameterIsNotNull(calendarDate2, "endCalendar");
            if (calendarDate2.getJulianDay() < calendarDate.getJulianDay()) {
                Companion aVar = this;
                CalendarDate a = aVar.m93173a();
                calendarDate3 = aVar.m93174b();
                calendarDate4 = a;
            } else {
                calendarDate4 = calendarDate;
                calendarDate3 = calendarDate2;
            }
            return new MonthDayPanelController(context, pickerPanelDependency, calendarDate4, calendarDate3, null);
        }

        /* renamed from: a */
        public static /* synthetic */ MonthDayPanelController m93172a(Companion aVar, Context context, BaseTimePickerController.PickerPanelDependency pickerPanelDependency, CalendarDate calendarDate, CalendarDate calendarDate2, int i, Object obj) {
            if ((i & 4) != 0) {
                calendarDate = aVar.m93173a();
            }
            if ((i & 8) != 0) {
                calendarDate2 = aVar.m93174b();
            }
            return aVar.mo91625a(context, pickerPanelDependency, calendarDate, calendarDate2);
        }
    }

    /* renamed from: c */
    private final void m93170c() {
        C25797b bVar = new C25797b(this);
        WheelView wheelView = this.f63754c;
        if (wheelView != null) {
            wheelView.setOnItemSelectedListener(bVar);
        }
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public List<WheelView> getPickerViewList() {
        ArrayList arrayList = new ArrayList();
        WheelView wheelView = this.f63754c;
        if (wheelView != null) {
            arrayList.add(wheelView);
        }
        return arrayList;
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public List<PickerBuilder> getPickerBuilderList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DatePicker.f63772a.mo91632a(getContext(), this.f63755d, this.f63756e));
        return arrayList;
    }

    /* renamed from: b */
    private final void m93169b() {
        setItemVisibleNum(getPickerPanelDependency().getPanelStyleData().getVisibleItemNum());
        setItemDividerVisibility(getPickerPanelDependency().getPanelStyleData().getItemDividerVisibility());
        m93170c();
    }

    /* renamed from: a */
    public final void mo91624a() {
        WheelView wheelView = this.f63754c;
        if (wheelView != null) {
            CalendarDate calendarDate = new CalendarDate(this.f63755d);
            calendarDate.setMonthDay(calendarDate.getMonthDay() + wheelView.getCurrentItem());
            this.f63753a.setYear(calendarDate.getYear());
            this.f63753a.setMonth(calendarDate.getMonth());
            this.f63753a.setMonthDay(calendarDate.getMonthDay());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/larksuite/component/universe_design/timepicker/impl/panel/MonthDayPanelController$initItemSelectedListener$pickerListener$1", "Lcom/larksuite/component/universe_design/timepicker/impl/base/OnItemSelectedListener;", "onItemSelected", "", "index", "", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.panel.c$b */
    public static final class C25797b implements OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ MonthDayPanelController f63757a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25797b(MonthDayPanelController cVar) {
            this.f63757a = cVar;
        }

        @Override // com.larksuite.component.universe_design.timepicker.impl.base.OnItemSelectedListener
        public void onItemSelected(int i) {
            this.f63757a.mo91624a();
            BaseTimePickerController.PickerPanelDependency pickerPanelDependency = this.f63757a.getPickerPanelDependency();
            Calendar calendar = this.f63757a.f63753a.getCalendar();
            Intrinsics.checkExpressionValueIsNotNull(calendar, "chooseCalendar.calendar");
            pickerPanelDependency.onSelected(calendar);
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
        WheelView wheelView = this.f63754c;
        if (wheelView != null) {
            wheelView.setDividerType(dividerType);
        }
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void setCurrentDate(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "selectedDate");
        CalendarDate calendarDate = new CalendarDate(calendar);
        this.f63753a = calendarDate;
        WheelView wheelView = this.f63754c;
        if (wheelView != null) {
            wheelView.setCurrentItem(calendarDate.getJulianDay() - this.f63755d.getJulianDay());
        }
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void setItemVisibleNum(int i) {
        WheelView wheelView = this.f63754c;
        if (wheelView != null) {
            wheelView.setItemVisible(i + 2);
        }
        WheelView wheelView2 = this.f63754c;
        if (wheelView2 != null) {
            wheelView2.invalidate();
        }
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController
    public void create(Context context, List<PickerBuilder> list) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(list, "builderList");
        if (!list.isEmpty()) {
            this.f63754c = TimePickerHelper.INSTANCE.createWheelView(context, list.get(0));
            m93169b();
        }
    }

    private MonthDayPanelController(Context context, BaseTimePickerController.PickerPanelDependency pickerPanelDependency, CalendarDate calendarDate, CalendarDate calendarDate2) {
        super(context, pickerPanelDependency);
        this.f63755d = calendarDate;
        this.f63756e = calendarDate2;
        this.f63753a = new CalendarDate(pickerPanelDependency.getSelectedDate());
    }

    public /* synthetic */ MonthDayPanelController(Context context, BaseTimePickerController.PickerPanelDependency pickerPanelDependency, CalendarDate calendarDate, CalendarDate calendarDate2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, pickerPanelDependency, calendarDate, calendarDate2);
    }
}
