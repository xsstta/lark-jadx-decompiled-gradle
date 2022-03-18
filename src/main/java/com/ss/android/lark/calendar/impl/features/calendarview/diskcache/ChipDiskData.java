package com.ss.android.lark.calendar.impl.features.calendarview.diskcache;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0003R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/ChipDiskData;", "Ljava/io/Serializable;", "mStartDay", "", "mEndDay", "(II)V", "endDay", "hasSameDay", "", "other", "startDay", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class ChipDiskData implements Serializable {
    private final int mEndDay;
    private final int mStartDay;

    public final int endDay() {
        return this.mEndDay;
    }

    public final int startDay() {
        return this.mStartDay;
    }

    public final boolean hasSameDay(ChipDiskData chipDiskData) {
        Intrinsics.checkParameterIsNotNull(chipDiskData, "other");
        if (startDay() == chipDiskData.startDay() && chipDiskData.endDay() == endDay()) {
            return true;
        }
        return false;
    }

    public ChipDiskData(int i, int i2) {
        this.mStartDay = i;
        this.mEndDay = i2;
    }
}
