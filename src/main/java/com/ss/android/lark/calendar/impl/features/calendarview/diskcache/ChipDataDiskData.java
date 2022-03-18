package com.ss.android.lark.calendar.impl.features.calendarview.diskcache;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/ChipDataDiskData;", "Ljava/io/Serializable;", "info", "Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/DiskDataInfo;", "chipData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/ChipDiskData;", "Lkotlin/collections/ArrayList;", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/DiskDataInfo;Ljava/util/ArrayList;)V", "getChipData", "()Ljava/util/ArrayList;", "getInfo", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/DiskDataInfo;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChipDataDiskData implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    private final ArrayList<ChipDiskData> chipData;
    private final DiskDataInfo info;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.calendar.impl.features.calendarview.diskcache.ChipDataDiskData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChipDataDiskData copy$default(ChipDataDiskData chipDataDiskData, DiskDataInfo diskDataInfo, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            diskDataInfo = chipDataDiskData.info;
        }
        if ((i & 2) != 0) {
            arrayList = chipDataDiskData.chipData;
        }
        return chipDataDiskData.copy(diskDataInfo, arrayList);
    }

    public final DiskDataInfo component1() {
        return this.info;
    }

    public final ArrayList<ChipDiskData> component2() {
        return this.chipData;
    }

    public final ChipDataDiskData copy(DiskDataInfo diskDataInfo, ArrayList<ChipDiskData> arrayList) {
        Intrinsics.checkParameterIsNotNull(diskDataInfo, "info");
        Intrinsics.checkParameterIsNotNull(arrayList, "chipData");
        return new ChipDataDiskData(diskDataInfo, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChipDataDiskData)) {
            return false;
        }
        ChipDataDiskData chipDataDiskData = (ChipDataDiskData) obj;
        return Intrinsics.areEqual(this.info, chipDataDiskData.info) && Intrinsics.areEqual(this.chipData, chipDataDiskData.chipData);
    }

    public int hashCode() {
        DiskDataInfo diskDataInfo = this.info;
        int i = 0;
        int hashCode = (diskDataInfo != null ? diskDataInfo.hashCode() : 0) * 31;
        ArrayList<ChipDiskData> arrayList = this.chipData;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ChipDataDiskData(info=" + this.info + ", chipData=" + this.chipData + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/ChipDataDiskData$Companion;", "", "()V", "serialVersionUID", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.diskcache.ChipDataDiskData$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final ArrayList<ChipDiskData> getChipData() {
        return this.chipData;
    }

    public final DiskDataInfo getInfo() {
        return this.info;
    }

    public ChipDataDiskData(DiskDataInfo diskDataInfo, ArrayList<ChipDiskData> arrayList) {
        Intrinsics.checkParameterIsNotNull(diskDataInfo, "info");
        Intrinsics.checkParameterIsNotNull(arrayList, "chipData");
        this.info = diskDataInfo;
        this.chipData = arrayList;
    }
}
