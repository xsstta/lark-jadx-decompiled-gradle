package com.ss.android.lark.calendar.impl.framework.hitpoint.event;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u001d\u001a\u00020$2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001a\u0010!\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006("}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/hitpoint/event/ParamStoreData;", "", "()V", "deleteFrom", "", "getDeleteFrom", "()Ljava/lang/String;", "setDeleteFrom", "(Ljava/lang/String;)V", "eventType", "getEventType", "setEventType", "groupCount", "", "getGroupCount", "()I", "setGroupCount", "(I)V", "meetinRoomCount", "getMeetinRoomCount", "setMeetinRoomCount", "themeType", "getThemeType", "setThemeType", "thirdPartyAttendeeCount", "getThirdPartyAttendeeCount", "setThirdPartyAttendeeCount", "timeConflict", "getTimeConflict", "setTimeConflict", "userCount", "getUserCount", "setUserCount", "viewType", "getViewType", "setViewType", "", "busyListSize", "outWorkHourListSize", "bothConflictListSize", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.b.g */
public final class ParamStoreData {

    /* renamed from: a */
    public static final ParamStoreData f83351a = new ParamStoreData();

    /* renamed from: b */
    private static String f83352b = "";

    /* renamed from: c */
    private static String f83353c = "";

    /* renamed from: d */
    private static String f83354d = "";

    /* renamed from: e */
    private static int f83355e = -1;

    /* renamed from: f */
    private static int f83356f = -1;

    /* renamed from: g */
    private static int f83357g = -1;

    /* renamed from: h */
    private static int f83358h = -1;

    /* renamed from: i */
    private static String f83359i = "";

    /* renamed from: j */
    private static String f83360j = "";

    private ParamStoreData() {
    }

    /* renamed from: a */
    public final String mo118741a() {
        return f83352b;
    }

    /* renamed from: b */
    public final String mo118744b() {
        return f83360j;
    }

    /* renamed from: a */
    public final void mo118743a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        f83352b = str;
    }

    /* renamed from: a */
    public final void mo118742a(int i, int i2, int i3) {
        if (i == 0 && i2 == 0 && i3 == 0) {
            f83360j = "no_conflict";
        } else if (i3 != 0 || (i2 != 0 && i != 0)) {
            f83360j = "work_time_and_event_conflict";
        } else if (i2 != 0) {
            f83360j = "work_time";
        } else if (i != 0) {
            f83360j = "event_conflict";
        }
    }
}
