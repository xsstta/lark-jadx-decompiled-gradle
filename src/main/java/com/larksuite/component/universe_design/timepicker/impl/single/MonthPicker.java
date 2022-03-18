package com.larksuite.component.universe_design.timepicker.impl.single;

import android.content.Context;
import com.larksuite.component.universe_design.timepicker.impl.adapter.MonthWheelAdapter;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerBuilder;
import com.larksuite.component.universe_design.util.CalendarDate;
import com.larksuite.component.universe_design.util.ResUtil;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J*\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bH\u0007J2\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\bH\u0002¨\u0006\u0015"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/single/MonthPicker;", "", "()V", "getDefaultBuilder", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder;", "context", "Landroid/content/Context;", "startMonth", "", "endMonth", "isLoop", "", "getLimitMonthAdapter", "Lcom/larksuite/component/universe_design/timepicker/impl/adapter/MonthWheelAdapter;", "startCalendar", "Lcom/larksuite/component/universe_design/util/CalendarDate;", "endCalendar", "chooseYear", "getLimitMonthBuilder", "isMonthValid", "month", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.single.f */
public final class MonthPicker {

    /* renamed from: a */
    public static final MonthPicker f63776a = new MonthPicker();

    private MonthPicker() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final MonthWheelAdapter m93194a(Context context, CalendarDate calendarDate, CalendarDate calendarDate2, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(calendarDate, "startCalendar");
        Intrinsics.checkParameterIsNotNull(calendarDate2, "endCalendar");
        int year = calendarDate.getYear();
        int year2 = calendarDate2.getYear();
        if (year > i || year2 < i) {
            return null;
        }
        String[] a = ResUtil.m93302a(context, R.array.ud_timePicker_monthAbbr);
        if (i == year) {
            return new MonthWheelAdapter(calendarDate.getMonth(), 12, a);
        }
        if (i == year2) {
            return new MonthWheelAdapter(1, calendarDate2.getMonth(), a);
        }
        return new MonthWheelAdapter(1, 12, a);
    }

    @JvmStatic
    /* renamed from: a */
    public static final PickerBuilder m93195a(Context context, CalendarDate calendarDate, CalendarDate calendarDate2, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(calendarDate, "startCalendar");
        Intrinsics.checkParameterIsNotNull(calendarDate2, "endCalendar");
        MonthWheelAdapter a = m93194a(context, calendarDate, calendarDate2, i);
        if (a == null) {
            return null;
        }
        PickerBuilder pickerBuilder = new PickerBuilder(a);
        pickerBuilder.setLoop(z);
        return pickerBuilder;
    }
}
