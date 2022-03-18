package com.ss.android.lark.calendar.impl.features.calendarview.cache.range;

import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0013\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/WeekRangeMapper;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/ICacheRangeMapper;", "()V", "mAnchorDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getNeedCacheRange", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/RangeInfo;", "getPrioritySortedPages", "", "()[Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/RangeInfo;", "setAnchorDay", "", "julianDay", "", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.b.f */
public final class WeekRangeMapper implements ICacheRangeMapper {

    /* renamed from: a */
    public static final Companion f76880a = new Companion(null);

    /* renamed from: b */
    private CalendarDate f76881b = new CalendarDate();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/WeekRangeMapper$Companion;", "", "()V", "DAYS_OF_WEEK", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.b.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.range.ICacheRangeMapper
    /* renamed from: b */
    public RangeInfo mo110789b() {
        CalendarDate firstDayOfTheWeek = this.f76881b.getFirstDayOfTheWeek();
        Intrinsics.checkExpressionValueIsNotNull(firstDayOfTheWeek, "mAnchorDate.firstDayOfTheWeek");
        int julianDay = firstDayOfTheWeek.getJulianDay();
        return new RangeInfo(julianDay - 7, (julianDay + 14) - 1);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.range.ICacheRangeMapper
    /* renamed from: a */
    public RangeInfo[] mo110788a() {
        CalendarDate firstDayOfTheWeek = this.f76881b.getFirstDayOfTheWeek();
        Intrinsics.checkExpressionValueIsNotNull(firstDayOfTheWeek, "mAnchorDate.firstDayOfTheWeek");
        int julianDay = firstDayOfTheWeek.getJulianDay();
        RangeInfo eVar = new RangeInfo(julianDay - 7, julianDay - 1);
        int i = julianDay + 7;
        return new RangeInfo[]{new RangeInfo(julianDay, i - 1), new RangeInfo(i, (julianDay + 14) - 1), eVar};
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.range.ICacheRangeMapper
    /* renamed from: a */
    public void mo110787a(int i) {
        this.f76881b.setJulianDay(i);
    }
}
