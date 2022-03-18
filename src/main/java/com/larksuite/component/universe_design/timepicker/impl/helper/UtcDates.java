package com.larksuite.component.universe_design.timepicker.impl.helper;

import com.larksuite.component.universe_design.util.CalendarDate;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ6\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fJ\u0006\u0010\u0011\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/helper/UtcDates;", "", "()V", "UTC", "", "getCalendar", "Ljava/util/Calendar;", "hour", "", "minute", "year", "month", "monthDay", "second", "getTimeZone", "Ljava/util/TimeZone;", "kotlin.jvm.PlatformType", "getTodayCalendar", "getUTCCalendarOf", "calendar", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UtcDates {
    public static final UtcDates INSTANCE = new UtcDates();

    private UtcDates() {
    }

    public final TimeZone getTimeZone() {
        return TimeZone.getTimeZone("UTC");
    }

    public final Calendar getTodayCalendar() {
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "Calendar.getInstance()");
        return getUTCCalendarOf(instance);
    }

    public final Calendar getUTCCalendarOf(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        Calendar calendar2 = new CalendarDate(new CalendarDate(calendar), TimeZone.getTimeZone("UTC")).getCalendar();
        Intrinsics.checkExpressionValueIsNotNull(calendar2, "forkCalendar.calendar");
        return calendar2;
    }

    public final Calendar getCalendar(int i, int i2) {
        Calendar instance = Calendar.getInstance(getTimeZone());
        instance.set(11, i);
        instance.set(12, i2);
        Intrinsics.checkExpressionValueIsNotNull(instance, "calendar");
        return instance;
    }

    public final Calendar getCalendar(int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance(getTimeZone());
        instance.set(1, i);
        instance.set(2, i2 - 1);
        instance.set(5, i3);
        Intrinsics.checkExpressionValueIsNotNull(instance, "calendar");
        return instance;
    }

    public final Calendar getCalendar(int i, int i2, int i3, int i4, int i5, int i6) {
        Calendar instance = Calendar.getInstance(getTimeZone());
        instance.set(1, i);
        instance.set(2, i2 - 1);
        instance.set(5, i3);
        instance.set(11, i4);
        instance.set(12, i5);
        instance.set(13, i6);
        Intrinsics.checkExpressionValueIsNotNull(instance, "calendar");
        return instance;
    }
}
