package com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel;

import java.util.Comparator;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarDateHolderComparator;", "Ljava/util/Comparator;", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarDateHolder;", "()V", "compare", "", "c1", "c2", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.b */
public final class CalendarDateHolderComparator implements Comparator<CalendarDateHolder> {

    /* renamed from: a */
    public static final CalendarDateHolderComparator f75613a = new CalendarDateHolderComparator();

    private CalendarDateHolderComparator() {
    }

    /* renamed from: a */
    public int compare(CalendarDateHolder aVar, CalendarDateHolder aVar2) {
        int i = 0;
        if (aVar != null && aVar2 != null) {
            int julianDay = aVar.mo109174a().getJulianDay() - aVar2.mo109174a().getJulianDay();
            if (julianDay > 0) {
                return 1;
            }
            if (julianDay < 0) {
                return -1;
            }
            boolean z = aVar instanceof MonthInfo;
            if (z && !(aVar2 instanceof MonthInfo)) {
                return -1;
            }
            if (z || !(aVar2 instanceof MonthInfo)) {
                boolean z2 = aVar instanceof WeekInfo;
                if (z2 && !(aVar2 instanceof WeekInfo)) {
                    return -1;
                }
                if (z2 || !(aVar2 instanceof WeekInfo)) {
                    if ((aVar instanceof InstanceCardInfo) && (aVar2 instanceof InstanceCardInfo)) {
                        return ((InstanceCardInfo) aVar).compareTo((InstanceCardInfo) aVar2);
                    }
                    int i2 = ((aVar.mo109174a().getTimeInMilliSeconds() - aVar2.mo109174a().getTimeInMilliSeconds()) > 0 ? 1 : ((aVar.mo109174a().getTimeInMilliSeconds() - aVar2.mo109174a().getTimeInMilliSeconds()) == 0 ? 0 : -1));
                    if (i2 > 0) {
                        i = 1;
                    } else if (i2 < 0) {
                        i = -1;
                    }
                    return i;
                }
            }
            return 1;
        } else if (aVar != null) {
            return 1;
        } else {
            if (aVar2 != null) {
                return -1;
            }
            return 0;
        }
    }
}
