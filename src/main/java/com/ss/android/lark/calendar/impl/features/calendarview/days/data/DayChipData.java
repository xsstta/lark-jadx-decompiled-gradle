package com.ss.android.lark.calendar.impl.features.calendarview.days.data;

import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DayChipData;", "", "day", "", "isDiskData", "", "isRefreshPage", "chipData", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "(IZZLjava/util/List;)V", "getChipData", "()Ljava/util/List;", "getDay", "()I", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.a.c */
public final class DayChipData {

    /* renamed from: a */
    private final int f77024a;

    /* renamed from: b */
    private final boolean f77025b;

    /* renamed from: c */
    private final boolean f77026c;

    /* renamed from: d */
    private final List<DayEventChipViewData> f77027d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DayChipData)) {
            return false;
        }
        DayChipData cVar = (DayChipData) obj;
        return this.f77024a == cVar.f77024a && this.f77025b == cVar.f77025b && this.f77026c == cVar.f77026c && Intrinsics.areEqual(this.f77027d, cVar.f77027d);
    }

    public int hashCode() {
        int i = this.f77024a * 31;
        boolean z = this.f77025b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i + i3) * 31;
        boolean z2 = this.f77026c;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        int i7 = (i6 + i2) * 31;
        List<DayEventChipViewData> list = this.f77027d;
        return i7 + (list != null ? list.hashCode() : 0);
    }

    /* renamed from: a */
    public final int mo110947a() {
        return this.f77024a;
    }

    /* renamed from: b */
    public final boolean mo110948b() {
        return this.f77025b;
    }

    /* renamed from: c */
    public final boolean mo110949c() {
        return this.f77026c;
    }

    /* renamed from: d */
    public final List<DayEventChipViewData> mo110950d() {
        return this.f77027d;
    }

    public String toString() {
        Integer num;
        StringBuilder sb = new StringBuilder();
        sb.append("day = ");
        sb.append(this.f77024a);
        sb.append(": isDiskData = ");
        sb.append(this.f77025b);
        sb.append(", chipData.size = ");
        List<DayEventChipViewData> list = this.f77027d;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        sb.append(num);
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData> */
    /* JADX WARN: Multi-variable type inference failed */
    public DayChipData(int i, boolean z, boolean z2, List<? extends DayEventChipViewData> list) {
        this.f77024a = i;
        this.f77025b = z;
        this.f77026c = z2;
        this.f77027d = list;
    }
}
