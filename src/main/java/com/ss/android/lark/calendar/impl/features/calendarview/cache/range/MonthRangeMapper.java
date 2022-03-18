package com.ss.android.lark.calendar.impl.features.calendarview.cache.range;

import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.utils.C32647d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0013\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/MonthRangeMapper;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/ICacheRangeMapper;", "()V", "mAnchorDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getNeedCacheRange", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/RangeInfo;", "getPrioritySortedPages", "", "()[Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/RangeInfo;", "setAnchorDay", "", "julianDay", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.b.c */
public final class MonthRangeMapper implements ICacheRangeMapper {

    /* renamed from: a */
    private CalendarDate f76875a = new CalendarDate();

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.range.ICacheRangeMapper
    /* renamed from: b */
    public RangeInfo mo110789b() {
        CalendarDate a = C32647d.m125275a(this.f76875a, -1);
        CalendarDate a2 = C32647d.m125276a(this.f76875a, C32647d.m125275a(this.f76875a, 1), 1);
        Intrinsics.checkExpressionValueIsNotNull(a, "lastPageStartDate");
        int julianDay = a.getJulianDay();
        Intrinsics.checkExpressionValueIsNotNull(a2, "nextPageEndDate");
        return new RangeInfo(julianDay, a2.getJulianDay());
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.range.ICacheRangeMapper
    /* renamed from: a */
    public RangeInfo[] mo110788a() {
        CalendarDate a = C32647d.m125275a(this.f76875a, 0);
        CalendarDate a2 = C32647d.m125276a(this.f76875a, a, 0);
        CalendarDate a3 = C32647d.m125275a(this.f76875a, -1);
        CalendarDate a4 = C32647d.m125276a(this.f76875a, a3, -1);
        CalendarDate a5 = C32647d.m125275a(this.f76875a, 1);
        CalendarDate a6 = C32647d.m125276a(this.f76875a, a5, 1);
        Intrinsics.checkExpressionValueIsNotNull(a3, "lastPageStartDate");
        int julianDay = a3.getJulianDay();
        Intrinsics.checkExpressionValueIsNotNull(a4, "lastPageEndDate");
        RangeInfo eVar = new RangeInfo(julianDay, a4.getJulianDay());
        Intrinsics.checkExpressionValueIsNotNull(a, "anchorStartDate");
        int julianDay2 = a.getJulianDay();
        Intrinsics.checkExpressionValueIsNotNull(a2, "anchorEndDate");
        RangeInfo eVar2 = new RangeInfo(julianDay2, a2.getJulianDay());
        Intrinsics.checkExpressionValueIsNotNull(a5, "nextPageStartDate");
        int julianDay3 = a5.getJulianDay();
        Intrinsics.checkExpressionValueIsNotNull(a6, "nextPageEndDate");
        return new RangeInfo[]{eVar2, new RangeInfo(julianDay3, a6.getJulianDay()), eVar};
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.range.ICacheRangeMapper
    /* renamed from: a */
    public void mo110787a(int i) {
        this.f76875a.setJulianDay(i);
    }
}
