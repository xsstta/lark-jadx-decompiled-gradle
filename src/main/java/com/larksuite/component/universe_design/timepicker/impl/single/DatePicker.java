package com.larksuite.component.universe_design.timepicker.impl.single;

import android.content.Context;
import com.larksuite.component.universe_design.timepicker.impl.adapter.DateWheelAdapter;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerBuilder;
import com.larksuite.component.universe_design.util.CalendarDate;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/single/DatePicker;", "", "()V", "DEFAULT_DATE_WHEEL_MAX_INTERNAL", "", "getPickerBuilder", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder;", "context", "Landroid/content/Context;", "beginCalendar", "Lcom/larksuite/component/universe_design/util/CalendarDate;", "endCalendar", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.single.b */
public final class DatePicker {

    /* renamed from: a */
    public static final DatePicker f63772a = new DatePicker();

    private DatePicker() {
    }

    /* renamed from: a */
    public final PickerBuilder mo91632a(Context context, CalendarDate calendarDate, CalendarDate calendarDate2) {
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(calendarDate, "beginCalendar");
        if (calendarDate2 != null) {
            i = calendarDate2.getJulianDay();
        } else {
            i = 0;
        }
        int julianDay = calendarDate.getJulianDay();
        if (i > julianDay) {
            i2 = i - julianDay;
        } else {
            i2 = 22000;
        }
        String[] stringArray = context.getResources().getStringArray(R.array.ud_timePicker_weeks);
        Intrinsics.checkExpressionValueIsNotNull(stringArray, "context.resources.getStr…rray.ud_timePicker_weeks)");
        PickerBuilder pickerBuilder = new PickerBuilder(new DateWheelAdapter(context, calendarDate, 0, i2, stringArray));
        pickerBuilder.setShowTwoFigure(true);
        return pickerBuilder;
    }
}
