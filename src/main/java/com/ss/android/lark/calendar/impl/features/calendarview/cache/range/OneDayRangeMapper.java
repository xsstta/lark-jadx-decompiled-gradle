package com.ss.android.lark.calendar.impl.features.calendarview.cache.range;

import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0013\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/OneDayRangeMapper;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/ICacheRangeMapper;", "()V", "mAnchorDay", "", "getNeedCacheRange", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/RangeInfo;", "getPrioritySortedPages", "", "()[Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/RangeInfo;", "setAnchorDay", "", "julianDay", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.b.d */
public final class OneDayRangeMapper implements ICacheRangeMapper {

    /* renamed from: a */
    private int f76876a = new CalendarDate().getJulianDay();

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.range.ICacheRangeMapper
    /* renamed from: b */
    public RangeInfo mo110789b() {
        int i = this.f76876a;
        return new RangeInfo(i - 1, i + 1);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.range.ICacheRangeMapper
    /* renamed from: a */
    public RangeInfo[] mo110788a() {
        int i = this.f76876a;
        RangeInfo eVar = new RangeInfo(i - 1, i - 1);
        int i2 = this.f76876a;
        RangeInfo eVar2 = new RangeInfo(i2, i2);
        int i3 = this.f76876a;
        return new RangeInfo[]{eVar2, new RangeInfo(i3 + 1, i3 + 1), eVar};
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.range.ICacheRangeMapper
    /* renamed from: a */
    public void mo110787a(int i) {
        this.f76876a = i;
    }
}
