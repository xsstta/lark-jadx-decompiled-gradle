package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u000bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00160\u000bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstanceUnit;", "Ljava/io/Serializable;", "()V", "mCalendarEventInstance", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "getMCalendarEventInstance", "()Ljava/util/List;", "setMCalendarEventInstance", "(Ljava/util/List;)V", "mCalendarTimezone", "", "", "getMCalendarTimezone", "()Ljava/util/Map;", "setMCalendarTimezone", "(Ljava/util/Map;)V", "mPrivateCalendarIds", "", "getMPrivateCalendarIds", "setMPrivateCalendarIds", "mWorkHourSettings", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSetting;", "getMWorkHourSettings", "setMWorkHourSettings", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarEventInstanceUnit implements Serializable {
    public List<? extends CalendarEventInstance> mCalendarEventInstance;
    public Map<String, String> mCalendarTimezone;
    public Map<String, Boolean> mPrivateCalendarIds;
    public Map<String, CalendarWorkHourSetting> mWorkHourSettings;

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance>, java.util.List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance> */
    public final List<CalendarEventInstance> getMCalendarEventInstance() {
        List list = this.mCalendarEventInstance;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCalendarEventInstance");
        }
        return list;
    }

    public final Map<String, String> getMCalendarTimezone() {
        Map<String, String> map = this.mCalendarTimezone;
        if (map == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCalendarTimezone");
        }
        return map;
    }

    public final Map<String, Boolean> getMPrivateCalendarIds() {
        Map<String, Boolean> map = this.mPrivateCalendarIds;
        if (map == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPrivateCalendarIds");
        }
        return map;
    }

    public final Map<String, CalendarWorkHourSetting> getMWorkHourSettings() {
        Map<String, CalendarWorkHourSetting> map = this.mWorkHourSettings;
        if (map == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWorkHourSettings");
        }
        return map;
    }

    public final void setMCalendarEventInstance(List<? extends CalendarEventInstance> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.mCalendarEventInstance = list;
    }

    public final void setMCalendarTimezone(Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(map, "<set-?>");
        this.mCalendarTimezone = map;
    }

    public final void setMPrivateCalendarIds(Map<String, Boolean> map) {
        Intrinsics.checkParameterIsNotNull(map, "<set-?>");
        this.mPrivateCalendarIds = map;
    }

    public final void setMWorkHourSettings(Map<String, CalendarWorkHourSetting> map) {
        Intrinsics.checkParameterIsNotNull(map, "<set-?>");
        this.mWorkHourSettings = map;
    }
}
