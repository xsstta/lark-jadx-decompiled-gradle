package com.ss.android.lark.calendar.impl.features.calendarview.diskcache;

import com.ss.android.lark.calendar.impl.features.calendarview.entity.CalendarListViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.ListEventChipViewData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00128\u0010\u0006\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\u000b`\n\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\r0\bj\b\u0012\u0004\u0012\u00020\r`\u000b¢\u0006\u0002\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J;\u0010\u0018\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\u000b`\nHÆ\u0003J\u0019\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\r0\bj\b\u0012\u0004\u0012\u00020\r`\u000bHÆ\u0003Js\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042:\b\u0002\u0010\u0006\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\u000b`\n2\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\r0\bj\b\u0012\u0004\u0012\u00020\r`\u000bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\r0\bj\b\u0012\u0004\u0012\u00020\r`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010RC\u0010\u0006\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\u000b`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/ListChipDiskData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/ChipDiskData;", "Ljava/io/Serializable;", "startDay", "", "endDay", "dayListChipViewData", "Ljava/util/HashMap;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/ListEventChipViewData;", "Lkotlin/collections/HashMap;", "Lkotlin/collections/ArrayList;", "calendarListViewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/CalendarListViewData;", "(IILjava/util/HashMap;Ljava/util/ArrayList;)V", "getCalendarListViewData", "()Ljava/util/ArrayList;", "getDayListChipViewData", "()Ljava/util/HashMap;", "getEndDay", "()I", "getStartDay", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ListChipDiskData extends ChipDiskData implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    private final ArrayList<CalendarListViewData> calendarListViewData;
    private final HashMap<Integer, ArrayList<ListEventChipViewData>> dayListChipViewData;
    private final int endDay;
    private final int startDay;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.calendar.impl.features.calendarview.diskcache.ListChipDiskData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListChipDiskData copy$default(ListChipDiskData listChipDiskData, int i, int i2, HashMap hashMap, ArrayList arrayList, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = listChipDiskData.startDay;
        }
        if ((i3 & 2) != 0) {
            i2 = listChipDiskData.endDay;
        }
        if ((i3 & 4) != 0) {
            hashMap = listChipDiskData.dayListChipViewData;
        }
        if ((i3 & 8) != 0) {
            arrayList = listChipDiskData.calendarListViewData;
        }
        return listChipDiskData.copy(i, i2, hashMap, arrayList);
    }

    public final int component1() {
        return this.startDay;
    }

    public final int component2() {
        return this.endDay;
    }

    public final HashMap<Integer, ArrayList<ListEventChipViewData>> component3() {
        return this.dayListChipViewData;
    }

    public final ArrayList<CalendarListViewData> component4() {
        return this.calendarListViewData;
    }

    public final ListChipDiskData copy(int i, int i2, HashMap<Integer, ArrayList<ListEventChipViewData>> hashMap, ArrayList<CalendarListViewData> arrayList) {
        Intrinsics.checkParameterIsNotNull(hashMap, "dayListChipViewData");
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarListViewData");
        return new ListChipDiskData(i, i2, hashMap, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListChipDiskData)) {
            return false;
        }
        ListChipDiskData listChipDiskData = (ListChipDiskData) obj;
        return this.startDay == listChipDiskData.startDay && this.endDay == listChipDiskData.endDay && Intrinsics.areEqual(this.dayListChipViewData, listChipDiskData.dayListChipViewData) && Intrinsics.areEqual(this.calendarListViewData, listChipDiskData.calendarListViewData);
    }

    public int hashCode() {
        int i = ((this.startDay * 31) + this.endDay) * 31;
        HashMap<Integer, ArrayList<ListEventChipViewData>> hashMap = this.dayListChipViewData;
        int i2 = 0;
        int hashCode = (i + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        ArrayList<CalendarListViewData> arrayList = this.calendarListViewData;
        if (arrayList != null) {
            i2 = arrayList.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "ListChipDiskData(startDay=" + this.startDay + ", endDay=" + this.endDay + ", dayListChipViewData=" + this.dayListChipViewData + ", calendarListViewData=" + this.calendarListViewData + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/ListChipDiskData$Companion;", "", "()V", "serialVersionUID", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.diskcache.ListChipDiskData$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final ArrayList<CalendarListViewData> getCalendarListViewData() {
        return this.calendarListViewData;
    }

    public final HashMap<Integer, ArrayList<ListEventChipViewData>> getDayListChipViewData() {
        return this.dayListChipViewData;
    }

    public final int getEndDay() {
        return this.endDay;
    }

    public final int getStartDay() {
        return this.startDay;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListChipDiskData(int i, int i2, HashMap<Integer, ArrayList<ListEventChipViewData>> hashMap, ArrayList<CalendarListViewData> arrayList) {
        super(i, i2);
        Intrinsics.checkParameterIsNotNull(hashMap, "dayListChipViewData");
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarListViewData");
        this.startDay = i;
        this.endDay = i2;
        this.dayListChipViewData = hashMap;
        this.calendarListViewData = arrayList;
    }
}
