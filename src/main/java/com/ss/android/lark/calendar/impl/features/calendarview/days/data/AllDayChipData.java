package com.ss.android.lark.calendar.impl.features.calendarview.days.data;

import com.ss.android.lark.calendar.impl.features.calendarview.entity.AllDayEventChipViewData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u001f\u0010\u0019\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/AllDayChipData;", "", "startDay", "", "endDay", "isDiskData", "", "chipData", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/AllDayEventChipViewData;", "(IIZLjava/util/List;)V", "getChipData", "()Ljava/util/List;", "getEndDay", "()I", "()Z", "getStartDay", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "isMatchDay", "(Ljava/lang/Integer;Ljava/lang/Integer;)Z", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.a.a */
public final class AllDayChipData {

    /* renamed from: a */
    private final int f77014a;

    /* renamed from: b */
    private final int f77015b;

    /* renamed from: c */
    private final boolean f77016c;

    /* renamed from: d */
    private final List<AllDayEventChipViewData> f77017d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllDayChipData)) {
            return false;
        }
        AllDayChipData aVar = (AllDayChipData) obj;
        return this.f77014a == aVar.f77014a && this.f77015b == aVar.f77015b && this.f77016c == aVar.f77016c && Intrinsics.areEqual(this.f77017d, aVar.f77017d);
    }

    public int hashCode() {
        int i = ((this.f77014a * 31) + this.f77015b) * 31;
        boolean z = this.f77016c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (i + i2) * 31;
        List<AllDayEventChipViewData> list = this.f77017d;
        return i5 + (list != null ? list.hashCode() : 0);
    }

    /* renamed from: a */
    public final boolean mo110931a() {
        return this.f77016c;
    }

    /* renamed from: b */
    public final List<AllDayEventChipViewData> mo110933b() {
        return this.f77017d;
    }

    public String toString() {
        Integer num;
        StringBuilder sb = new StringBuilder();
        sb.append("startDay = ");
        sb.append(this.f77014a);
        sb.append(", endDay = ");
        sb.append(this.f77015b);
        sb.append(", isDiskData = ");
        sb.append(this.f77016c);
        sb.append(", chipData.size = ");
        List<AllDayEventChipViewData> list = this.f77017d;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        sb.append(num);
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo110932a(Integer num, Integer num2) {
        int i = this.f77014a;
        if (num != null && i == num.intValue()) {
            int i2 = this.f77015b;
            if (num2 != null && i2 == num2.intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.lark.calendar.impl.features.calendarview.entity.AllDayEventChipViewData> */
    /* JADX WARN: Multi-variable type inference failed */
    public AllDayChipData(int i, int i2, boolean z, List<? extends AllDayEventChipViewData> list) {
        this.f77014a = i;
        this.f77015b = i2;
        this.f77016c = z;
        this.f77017d = list;
    }
}
