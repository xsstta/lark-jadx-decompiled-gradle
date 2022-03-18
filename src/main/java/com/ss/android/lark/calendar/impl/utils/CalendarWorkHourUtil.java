package com.ss.android.lark.calendar.impl.utils;

import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSpan;
import java.util.ArrayList;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/CalendarWorkHourUtil;", "", "()V", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.utils.i */
public final class CalendarWorkHourUtil {

    /* renamed from: a */
    public static final int f83805a = f83805a;

    /* renamed from: b */
    public static final Companion f83806b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JH\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0002J:\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/CalendarWorkHourUtil$Companion;", "", "()V", "ONE_DAY_MINUTE", "", "getONE_DAY_MINUTE", "()I", "getDifferenceTimezoneTimeRanges", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSpan;", "Lkotlin/collections/ArrayList;", "dayWeekIndex", "minuteOffset", "workHourSetting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSetting;", "timeRanges", "getWorkingHoursTimeRanges", "date", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "attendeeTimezone", "Ljava/util/TimeZone;", "viewTimeZone", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.utils.i$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo120356a() {
            return CalendarWorkHourUtil.f83805a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ArrayList<CalendarWorkHourSpan> mo120357a(CalendarDate calendarDate, CalendarWorkHourSetting calendarWorkHourSetting, TimeZone timeZone, TimeZone timeZone2) {
            Integer num;
            Intrinsics.checkParameterIsNotNull(timeZone, "attendeeTimezone");
            Intrinsics.checkParameterIsNotNull(timeZone2, "viewTimeZone");
            ArrayList<CalendarWorkHourSpan> arrayList = new ArrayList<>();
            if (calendarDate == null || calendarWorkHourSetting == null || !calendarWorkHourSetting.isEnable()) {
                return arrayList;
            }
            int weekDay = calendarDate.getWeekDay() - 1;
            CalendarSetting.DayOfWeek forNumber = CalendarSetting.DayOfWeek.forNumber(weekDay);
            int offset = (timeZone2.getOffset(calendarDate.getTimeInMilliSeconds()) / CalendarSearchResultRv.f82652c) - (timeZone.getOffset(calendarDate.getTimeInMilliSeconds()) / CalendarSearchResultRv.f82652c);
            if (offset != 0) {
                return m125330a(weekDay, offset, calendarWorkHourSetting, arrayList);
            }
            if (!calendarWorkHourSetting.getWorkHourItems().containsKey(forNumber)) {
                arrayList.add(new CalendarWorkHourSpan(0, 0));
                return arrayList;
            }
            CalendarWorkHourSpan calendarWorkHourSpan = calendarWorkHourSetting.getWorkHourItems().get(forNumber);
            if (calendarWorkHourSpan != null) {
                Intrinsics.checkExpressionValueIsNotNull(calendarWorkHourSpan, "workHourSetting.workHour…Day] ?: return timeRanges");
                Integer num2 = null;
                if (calendarWorkHourSpan != null) {
                    num = Integer.valueOf(calendarWorkHourSpan.getStartMinute());
                } else {
                    num = null;
                }
                int intValue = num.intValue();
                if (calendarWorkHourSpan != null) {
                    num2 = Integer.valueOf(calendarWorkHourSpan.getEndMinute());
                }
                arrayList.add(new CalendarWorkHourSpan(intValue, num2.intValue()));
            }
            return arrayList;
        }

        /* renamed from: a */
        private final ArrayList<CalendarWorkHourSpan> m125330a(int i, int i2, CalendarWorkHourSetting calendarWorkHourSetting, ArrayList<CalendarWorkHourSpan> arrayList) {
            int i3;
            int i4;
            int i5;
            int i6 = i - 1;
            if (i6 < 0) {
                i6 += 7;
            }
            int i7 = i + 1;
            if (i7 > 6) {
                i7 -= 7;
            }
            CalendarSetting.DayOfWeek forNumber = CalendarSetting.DayOfWeek.forNumber(i);
            CalendarSetting.DayOfWeek forNumber2 = CalendarSetting.DayOfWeek.forNumber(i6);
            CalendarSetting.DayOfWeek forNumber3 = CalendarSetting.DayOfWeek.forNumber(i7);
            CalendarWorkHourSpan calendarWorkHourSpan = calendarWorkHourSetting.getWorkHourItems().get(forNumber);
            CalendarWorkHourSpan calendarWorkHourSpan2 = calendarWorkHourSetting.getWorkHourItems().get(forNumber2);
            CalendarWorkHourSpan calendarWorkHourSpan3 = calendarWorkHourSetting.getWorkHourItems().get(forNumber3);
            int i8 = 0;
            if (calendarWorkHourSpan != null) {
                int startMinute = calendarWorkHourSpan.getStartMinute() + i2;
                int endMinute = calendarWorkHourSpan.getEndMinute() + i2;
                if (startMinute <= 0 || endMinute >= mo120356a()) {
                    if (startMinute < 0 && endMinute > 0) {
                        arrayList.add(new CalendarWorkHourSpan(0, endMinute));
                    }
                    Companion aVar = this;
                    if (startMinute < aVar.mo120356a() && endMinute > aVar.mo120356a()) {
                        arrayList.add(new CalendarWorkHourSpan(startMinute, aVar.mo120356a()));
                    }
                } else {
                    arrayList.add(new CalendarWorkHourSpan(startMinute, endMinute));
                }
            }
            if (i2 > 0) {
                if (calendarWorkHourSpan2 == null) {
                    return arrayList;
                }
                int startMinute2 = calendarWorkHourSpan2.getStartMinute() + i2;
                int endMinute2 = calendarWorkHourSpan2.getEndMinute() + i2;
                Companion aVar2 = this;
                if (startMinute2 < aVar2.mo120356a()) {
                    i5 = 0;
                } else {
                    i5 = startMinute2 - aVar2.mo120356a();
                }
                if (endMinute2 >= aVar2.mo120356a()) {
                    i8 = endMinute2 - aVar2.mo120356a();
                }
                if (i5 == 0 && i8 == 0) {
                    return arrayList;
                }
                arrayList.add(new CalendarWorkHourSpan(i5, i8));
            }
            if (i2 >= 0 || calendarWorkHourSpan3 == null) {
                return arrayList;
            }
            int startMinute3 = calendarWorkHourSpan3.getStartMinute() + i2;
            int endMinute3 = calendarWorkHourSpan3.getEndMinute() + i2;
            if (startMinute3 < 0) {
                i3 = mo120356a() + startMinute3;
            } else {
                i3 = mo120356a();
            }
            if (endMinute3 < 0) {
                i4 = mo120356a() + endMinute3;
            } else {
                i4 = mo120356a();
            }
            Companion aVar3 = this;
            if (i3 == aVar3.mo120356a() && i4 == aVar3.mo120356a()) {
                return arrayList;
            }
            arrayList.add(new CalendarWorkHourSpan(i3, i4));
            return arrayList;
        }
    }
}
