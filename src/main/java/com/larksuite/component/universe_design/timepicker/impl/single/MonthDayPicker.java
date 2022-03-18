package com.larksuite.component.universe_design.timepicker.impl.single;

import android.content.Context;
import com.larksuite.component.universe_design.timepicker.impl.adapter.DayWeekWheelAdapter;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerBuilder;
import com.larksuite.component.universe_design.util.CalendarDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J;\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ;\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/single/MonthDayPicker;", "", "()V", "getMonthDayAdapter", "Lcom/larksuite/component/universe_design/timepicker/impl/adapter/DayWeekWheelAdapter;", "context", "Landroid/content/Context;", "chooseCalendarYearNum", "", "chooseCalendarMonthNum", "weekArray", "", "", "showDayInfo", "", "(Landroid/content/Context;II[Ljava/lang/String;Z)Lcom/larksuite/component/universe_design/timepicker/impl/adapter/DayWeekWheelAdapter;", "getPickerBuilder", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder;", "chooseCalendarDate", "Lcom/larksuite/component/universe_design/util/CalendarDate;", "isLoop", "(Landroid/content/Context;Lcom/larksuite/component/universe_design/util/CalendarDate;[Ljava/lang/String;ZZ)Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder;", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.single.e */
public final class MonthDayPicker {

    /* renamed from: a */
    public static final MonthDayPicker f63775a = new MonthDayPicker();

    private MonthDayPicker() {
    }

    /* renamed from: a */
    public final DayWeekWheelAdapter mo91635a(Context context, int i, int i2, String[] strArr, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(strArr, "weekArray");
        return new DayWeekWheelAdapter(context, i, i2, strArr, 0, z, 0, 80, null);
    }

    /* renamed from: a */
    public final PickerBuilder mo91636a(Context context, CalendarDate calendarDate, String[] strArr, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(calendarDate, "chooseCalendarDate");
        Intrinsics.checkParameterIsNotNull(strArr, "weekArray");
        PickerBuilder pickerBuilder = new PickerBuilder(mo91635a(context, calendarDate.getYear(), calendarDate.getMonth(), strArr, z2));
        pickerBuilder.setLoop(z);
        return pickerBuilder;
    }
}
