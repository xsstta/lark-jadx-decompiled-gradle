package com.ss.android.lark.calendar.impl.features.calendarview.diskcache;

import com.ss.android.lark.calendar.impl.features.calendarview.entity.AllDayEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!Bå\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012f\u0010\u0006\u001ab\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0007j@\u0012\u0004\u0012\u00020\u0004\u00126\u00124\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\u000b`\n`\n\u0012f\u0010\f\u001ab\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00070\u0007j@\u0012\u0004\u0012\u00020\u0004\u00126\u00124\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\bj\b\u0012\u0004\u0012\u00020\r`\u000b`\n`\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003Ji\u0010\u0017\u001ab\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0007j@\u0012\u0004\u0012\u00020\u0004\u00126\u00124\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\u000b`\n`\nHÆ\u0003Ji\u0010\u0018\u001ab\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00070\u0007j@\u0012\u0004\u0012\u00020\u0004\u00126\u00124\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\bj\b\u0012\u0004\u0012\u00020\r`\u000b`\n`\nHÆ\u0003Jñ\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042h\b\u0002\u0010\u0006\u001ab\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0007j@\u0012\u0004\u0012\u00020\u0004\u00126\u00124\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\u000b`\n`\n2h\b\u0002\u0010\f\u001ab\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00070\u0007j@\u0012\u0004\u0012\u00020\u0004\u00126\u00124\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\bj\b\u0012\u0004\u0012\u00020\r`\u000b`\n`\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001Rq\u0010\f\u001ab\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00070\u0007j@\u0012\u0004\u0012\u00020\u0004\u00126\u00124\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\bj\b\u0012\u0004\u0012\u00020\r`\u000b`\n`\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012Rq\u0010\u0006\u001ab\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0007j@\u0012\u0004\u0012\u00020\u0004\u00126\u00124\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\u000b`\n`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006\""}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/DaysChipDiskData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/ChipDiskData;", "Ljava/io/Serializable;", "startDay", "", "endDay", "normalChipData", "Ljava/util/HashMap;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "Lkotlin/collections/HashMap;", "Lkotlin/collections/ArrayList;", "allDayChipData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/AllDayEventChipViewData;", "(IILjava/util/HashMap;Ljava/util/HashMap;)V", "getAllDayChipData", "()Ljava/util/HashMap;", "getEndDay", "()I", "getNormalChipData", "getStartDay", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DaysChipDiskData extends ChipDiskData implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    private final HashMap<Integer, HashMap<Integer, ArrayList<AllDayEventChipViewData>>> allDayChipData;
    private final int endDay;
    private final HashMap<Integer, HashMap<Integer, ArrayList<DayEventChipViewData>>> normalChipData;
    private final int startDay;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.calendar.impl.features.calendarview.diskcache.DaysChipDiskData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DaysChipDiskData copy$default(DaysChipDiskData daysChipDiskData, int i, int i2, HashMap hashMap, HashMap hashMap2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = daysChipDiskData.startDay;
        }
        if ((i3 & 2) != 0) {
            i2 = daysChipDiskData.endDay;
        }
        if ((i3 & 4) != 0) {
            hashMap = daysChipDiskData.normalChipData;
        }
        if ((i3 & 8) != 0) {
            hashMap2 = daysChipDiskData.allDayChipData;
        }
        return daysChipDiskData.copy(i, i2, hashMap, hashMap2);
    }

    public final int component1() {
        return this.startDay;
    }

    public final int component2() {
        return this.endDay;
    }

    public final HashMap<Integer, HashMap<Integer, ArrayList<DayEventChipViewData>>> component3() {
        return this.normalChipData;
    }

    public final HashMap<Integer, HashMap<Integer, ArrayList<AllDayEventChipViewData>>> component4() {
        return this.allDayChipData;
    }

    public final DaysChipDiskData copy(int i, int i2, HashMap<Integer, HashMap<Integer, ArrayList<DayEventChipViewData>>> hashMap, HashMap<Integer, HashMap<Integer, ArrayList<AllDayEventChipViewData>>> hashMap2) {
        Intrinsics.checkParameterIsNotNull(hashMap, "normalChipData");
        Intrinsics.checkParameterIsNotNull(hashMap2, "allDayChipData");
        return new DaysChipDiskData(i, i2, hashMap, hashMap2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DaysChipDiskData)) {
            return false;
        }
        DaysChipDiskData daysChipDiskData = (DaysChipDiskData) obj;
        return this.startDay == daysChipDiskData.startDay && this.endDay == daysChipDiskData.endDay && Intrinsics.areEqual(this.normalChipData, daysChipDiskData.normalChipData) && Intrinsics.areEqual(this.allDayChipData, daysChipDiskData.allDayChipData);
    }

    public int hashCode() {
        int i = ((this.startDay * 31) + this.endDay) * 31;
        HashMap<Integer, HashMap<Integer, ArrayList<DayEventChipViewData>>> hashMap = this.normalChipData;
        int i2 = 0;
        int hashCode = (i + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        HashMap<Integer, HashMap<Integer, ArrayList<AllDayEventChipViewData>>> hashMap2 = this.allDayChipData;
        if (hashMap2 != null) {
            i2 = hashMap2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "DaysChipDiskData(startDay=" + this.startDay + ", endDay=" + this.endDay + ", normalChipData=" + this.normalChipData + ", allDayChipData=" + this.allDayChipData + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/DaysChipDiskData$Companion;", "", "()V", "serialVersionUID", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.diskcache.DaysChipDiskData$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final HashMap<Integer, HashMap<Integer, ArrayList<AllDayEventChipViewData>>> getAllDayChipData() {
        return this.allDayChipData;
    }

    public final int getEndDay() {
        return this.endDay;
    }

    public final HashMap<Integer, HashMap<Integer, ArrayList<DayEventChipViewData>>> getNormalChipData() {
        return this.normalChipData;
    }

    public final int getStartDay() {
        return this.startDay;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DaysChipDiskData(int i, int i2, HashMap<Integer, HashMap<Integer, ArrayList<DayEventChipViewData>>> hashMap, HashMap<Integer, HashMap<Integer, ArrayList<AllDayEventChipViewData>>> hashMap2) {
        super(i, i2);
        Intrinsics.checkParameterIsNotNull(hashMap, "normalChipData");
        Intrinsics.checkParameterIsNotNull(hashMap2, "allDayChipData");
        this.startDay = i;
        this.endDay = i2;
        this.normalChipData = hashMap;
        this.allDayChipData = hashMap2;
    }
}
