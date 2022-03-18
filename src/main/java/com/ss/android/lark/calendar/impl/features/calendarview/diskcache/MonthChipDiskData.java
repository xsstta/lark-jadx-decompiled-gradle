package com.ss.android.lark.calendar.impl.features.calendarview.diskcache;

import com.ss.android.lark.calendar.impl.features.calendarview.entity.MonthEventChipViewData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#BÃ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00128\u0010\u0006\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\u000b`\n\u00128\u0010\f\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\u000b`\n\u00128\u0010\r\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\u000b`\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J;\u0010\u0018\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\u000b`\nHÆ\u0003J;\u0010\u0019\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\u000b`\nHÆ\u0003J;\u0010\u001a\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\u000b`\nHÆ\u0003JÑ\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042:\b\u0002\u0010\u0006\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\u000b`\n2:\b\u0002\u0010\f\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\u000b`\n2:\b\u0002\u0010\r\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\u000b`\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0004HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001RC\u0010\f\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\u000b`\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012RC\u0010\u0006\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\u000b`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010RC\u0010\r\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\u000b`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006$"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/MonthChipDiskData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/ChipDiskData;", "Ljava/io/Serializable;", "startDay", "", "endDay", "weeklyChipData", "Ljava/util/HashMap;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/MonthEventChipViewData;", "Lkotlin/collections/HashMap;", "Lkotlin/collections/ArrayList;", "dailyChipData", "weeklyMaxRow", "(IILjava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)V", "getDailyChipData", "()Ljava/util/HashMap;", "getEndDay", "()I", "getStartDay", "getWeeklyChipData", "getWeeklyMaxRow", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MonthChipDiskData extends ChipDiskData implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    private final HashMap<Integer, ArrayList<MonthEventChipViewData>> dailyChipData;
    private final int endDay;
    private final int startDay;
    private final HashMap<Integer, ArrayList<MonthEventChipViewData>> weeklyChipData;
    private final HashMap<Integer, ArrayList<Integer>> weeklyMaxRow;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.lark.calendar.impl.features.calendarview.diskcache.MonthChipDiskData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MonthChipDiskData copy$default(MonthChipDiskData monthChipDiskData, int i, int i2, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = monthChipDiskData.startDay;
        }
        if ((i3 & 2) != 0) {
            i2 = monthChipDiskData.endDay;
        }
        if ((i3 & 4) != 0) {
            hashMap = monthChipDiskData.weeklyChipData;
        }
        if ((i3 & 8) != 0) {
            hashMap2 = monthChipDiskData.dailyChipData;
        }
        if ((i3 & 16) != 0) {
            hashMap3 = monthChipDiskData.weeklyMaxRow;
        }
        return monthChipDiskData.copy(i, i2, hashMap, hashMap2, hashMap3);
    }

    public final int component1() {
        return this.startDay;
    }

    public final int component2() {
        return this.endDay;
    }

    public final HashMap<Integer, ArrayList<MonthEventChipViewData>> component3() {
        return this.weeklyChipData;
    }

    public final HashMap<Integer, ArrayList<MonthEventChipViewData>> component4() {
        return this.dailyChipData;
    }

    public final HashMap<Integer, ArrayList<Integer>> component5() {
        return this.weeklyMaxRow;
    }

    public final MonthChipDiskData copy(int i, int i2, HashMap<Integer, ArrayList<MonthEventChipViewData>> hashMap, HashMap<Integer, ArrayList<MonthEventChipViewData>> hashMap2, HashMap<Integer, ArrayList<Integer>> hashMap3) {
        Intrinsics.checkParameterIsNotNull(hashMap, "weeklyChipData");
        Intrinsics.checkParameterIsNotNull(hashMap2, "dailyChipData");
        Intrinsics.checkParameterIsNotNull(hashMap3, "weeklyMaxRow");
        return new MonthChipDiskData(i, i2, hashMap, hashMap2, hashMap3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MonthChipDiskData)) {
            return false;
        }
        MonthChipDiskData monthChipDiskData = (MonthChipDiskData) obj;
        return this.startDay == monthChipDiskData.startDay && this.endDay == monthChipDiskData.endDay && Intrinsics.areEqual(this.weeklyChipData, monthChipDiskData.weeklyChipData) && Intrinsics.areEqual(this.dailyChipData, monthChipDiskData.dailyChipData) && Intrinsics.areEqual(this.weeklyMaxRow, monthChipDiskData.weeklyMaxRow);
    }

    public int hashCode() {
        int i = ((this.startDay * 31) + this.endDay) * 31;
        HashMap<Integer, ArrayList<MonthEventChipViewData>> hashMap = this.weeklyChipData;
        int i2 = 0;
        int hashCode = (i + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        HashMap<Integer, ArrayList<MonthEventChipViewData>> hashMap2 = this.dailyChipData;
        int hashCode2 = (hashCode + (hashMap2 != null ? hashMap2.hashCode() : 0)) * 31;
        HashMap<Integer, ArrayList<Integer>> hashMap3 = this.weeklyMaxRow;
        if (hashMap3 != null) {
            i2 = hashMap3.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "MonthChipDiskData(startDay=" + this.startDay + ", endDay=" + this.endDay + ", weeklyChipData=" + this.weeklyChipData + ", dailyChipData=" + this.dailyChipData + ", weeklyMaxRow=" + this.weeklyMaxRow + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/MonthChipDiskData$Companion;", "", "()V", "serialVersionUID", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.diskcache.MonthChipDiskData$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final HashMap<Integer, ArrayList<MonthEventChipViewData>> getDailyChipData() {
        return this.dailyChipData;
    }

    public final int getEndDay() {
        return this.endDay;
    }

    public final int getStartDay() {
        return this.startDay;
    }

    public final HashMap<Integer, ArrayList<MonthEventChipViewData>> getWeeklyChipData() {
        return this.weeklyChipData;
    }

    public final HashMap<Integer, ArrayList<Integer>> getWeeklyMaxRow() {
        return this.weeklyMaxRow;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MonthChipDiskData(int i, int i2, HashMap<Integer, ArrayList<MonthEventChipViewData>> hashMap, HashMap<Integer, ArrayList<MonthEventChipViewData>> hashMap2, HashMap<Integer, ArrayList<Integer>> hashMap3) {
        super(i, i2);
        Intrinsics.checkParameterIsNotNull(hashMap, "weeklyChipData");
        Intrinsics.checkParameterIsNotNull(hashMap2, "dailyChipData");
        Intrinsics.checkParameterIsNotNull(hashMap3, "weeklyMaxRow");
        this.startDay = i;
        this.endDay = i2;
        this.weeklyChipData = hashMap;
        this.dailyChipData = hashMap2;
        this.weeklyMaxRow = hashMap3;
    }
}
