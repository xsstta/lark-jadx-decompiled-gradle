package com.ss.android.lark.calendar.impl.features.calendarview.diskcache;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/SettingDiskData;", "Ljava/io/Serializable;", "info", "Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/DiskDataInfo;", "calendarSetting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/DiskDataInfo;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;)V", "getCalendarSetting", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "getInfo", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/DiskDataInfo;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SettingDiskData implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    private final CalendarSetting calendarSetting;
    private final DiskDataInfo info;

    public static /* synthetic */ SettingDiskData copy$default(SettingDiskData settingDiskData, DiskDataInfo diskDataInfo, CalendarSetting calendarSetting2, int i, Object obj) {
        if ((i & 1) != 0) {
            diskDataInfo = settingDiskData.info;
        }
        if ((i & 2) != 0) {
            calendarSetting2 = settingDiskData.calendarSetting;
        }
        return settingDiskData.copy(diskDataInfo, calendarSetting2);
    }

    public final DiskDataInfo component1() {
        return this.info;
    }

    public final CalendarSetting component2() {
        return this.calendarSetting;
    }

    public final SettingDiskData copy(DiskDataInfo diskDataInfo, CalendarSetting calendarSetting2) {
        Intrinsics.checkParameterIsNotNull(diskDataInfo, "info");
        Intrinsics.checkParameterIsNotNull(calendarSetting2, "calendarSetting");
        return new SettingDiskData(diskDataInfo, calendarSetting2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingDiskData)) {
            return false;
        }
        SettingDiskData settingDiskData = (SettingDiskData) obj;
        return Intrinsics.areEqual(this.info, settingDiskData.info) && Intrinsics.areEqual(this.calendarSetting, settingDiskData.calendarSetting);
    }

    public int hashCode() {
        DiskDataInfo diskDataInfo = this.info;
        int i = 0;
        int hashCode = (diskDataInfo != null ? diskDataInfo.hashCode() : 0) * 31;
        CalendarSetting calendarSetting2 = this.calendarSetting;
        if (calendarSetting2 != null) {
            i = calendarSetting2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SettingDiskData(info=" + this.info + ", calendarSetting=" + this.calendarSetting + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/SettingDiskData$Companion;", "", "()V", "serialVersionUID", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.diskcache.SettingDiskData$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final CalendarSetting getCalendarSetting() {
        return this.calendarSetting;
    }

    public final DiskDataInfo getInfo() {
        return this.info;
    }

    public SettingDiskData(DiskDataInfo diskDataInfo, CalendarSetting calendarSetting2) {
        Intrinsics.checkParameterIsNotNull(diskDataInfo, "info");
        Intrinsics.checkParameterIsNotNull(calendarSetting2, "calendarSetting");
        this.info = diskDataInfo;
        this.calendarSetting = calendarSetting2;
    }
}
