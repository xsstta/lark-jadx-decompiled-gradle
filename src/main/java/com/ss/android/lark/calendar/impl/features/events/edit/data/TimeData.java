package com.ss.android.lark.calendar.impl.features.events.edit.data;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.UserAttendeeBaseInfo;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\fj\b\u0012\u0004\u0012\u00020\u0011`\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\tHÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\u0019\u00106\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eHÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\u0019\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u00110\fj\b\u0012\u0004\u0012\u00020\u0011`\u000eHÆ\u0003J\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\fj\b\u0012\u0004\u0012\u00020\u0011`\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u0010:\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\tHÖ\u0001R*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\fj\b\u0012\u0004\u0012\u00020\u0011`\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u000f\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010%\"\u0004\b(\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR\u001a\u0010\n\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"¨\u0006@"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/data/TimeData;", "Ljava/io/Serializable;", "startTime", "", "endTime", "isAllDay", "", "eventOriginalTime", "eventRRule", "", "timeZoneId", "filterDisplayAttendeeList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/UserAttendeeBaseInfo;", "Lkotlin/collections/ArrayList;", "isGuestInDifferentLocalTime", "chosenMeetingRoomList", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "originalEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "(JJZJLjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ZLjava/util/ArrayList;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;)V", "getChosenMeetingRoomList", "()Ljava/util/ArrayList;", "setChosenMeetingRoomList", "(Ljava/util/ArrayList;)V", "getEndTime", "()J", "setEndTime", "(J)V", "getEventOriginalTime", "setEventOriginalTime", "getEventRRule", "()Ljava/lang/String;", "setEventRRule", "(Ljava/lang/String;)V", "getFilterDisplayAttendeeList", "setFilterDisplayAttendeeList", "()Z", "setAllDay", "(Z)V", "setGuestInDifferentLocalTime", "getOriginalEvent", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "getStartTime", "setStartTime", "getTimeZoneId", "setTimeZoneId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TimeData implements Serializable {
    private ArrayList<CalendarEventAttendee> chosenMeetingRoomList;
    private long endTime;
    private long eventOriginalTime;
    private String eventRRule;
    private ArrayList<UserAttendeeBaseInfo> filterDisplayAttendeeList;
    private boolean isAllDay;
    private boolean isGuestInDifferentLocalTime;
    private final CalendarEvent originalEvent;
    private long startTime;
    private String timeZoneId;

    public static /* synthetic */ TimeData copy$default(TimeData timeData, long j, long j2, boolean z, long j3, String str, String str2, ArrayList arrayList, boolean z2, ArrayList arrayList2, CalendarEvent calendarEvent, int i, Object obj) {
        return timeData.copy((i & 1) != 0 ? timeData.startTime : j, (i & 2) != 0 ? timeData.endTime : j2, (i & 4) != 0 ? timeData.isAllDay : z, (i & 8) != 0 ? timeData.eventOriginalTime : j3, (i & 16) != 0 ? timeData.eventRRule : str, (i & 32) != 0 ? timeData.timeZoneId : str2, (i & 64) != 0 ? timeData.filterDisplayAttendeeList : arrayList, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? timeData.isGuestInDifferentLocalTime : z2, (i & DynamicModule.f58006b) != 0 ? timeData.chosenMeetingRoomList : arrayList2, (i & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? timeData.originalEvent : calendarEvent);
    }

    public final long component1() {
        return this.startTime;
    }

    public final CalendarEvent component10() {
        return this.originalEvent;
    }

    public final long component2() {
        return this.endTime;
    }

    public final boolean component3() {
        return this.isAllDay;
    }

    public final long component4() {
        return this.eventOriginalTime;
    }

    public final String component5() {
        return this.eventRRule;
    }

    public final String component6() {
        return this.timeZoneId;
    }

    public final ArrayList<UserAttendeeBaseInfo> component7() {
        return this.filterDisplayAttendeeList;
    }

    public final boolean component8() {
        return this.isGuestInDifferentLocalTime;
    }

    public final ArrayList<CalendarEventAttendee> component9() {
        return this.chosenMeetingRoomList;
    }

    public final TimeData copy(long j, long j2, boolean z, long j3, String str, String str2, ArrayList<UserAttendeeBaseInfo> arrayList, boolean z2, ArrayList<CalendarEventAttendee> arrayList2, CalendarEvent calendarEvent) {
        Intrinsics.checkParameterIsNotNull(str, "eventRRule");
        Intrinsics.checkParameterIsNotNull(str2, "timeZoneId");
        Intrinsics.checkParameterIsNotNull(arrayList, "filterDisplayAttendeeList");
        Intrinsics.checkParameterIsNotNull(arrayList2, "chosenMeetingRoomList");
        return new TimeData(j, j2, z, j3, str, str2, arrayList, z2, arrayList2, calendarEvent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeData)) {
            return false;
        }
        TimeData timeData = (TimeData) obj;
        return this.startTime == timeData.startTime && this.endTime == timeData.endTime && this.isAllDay == timeData.isAllDay && this.eventOriginalTime == timeData.eventOriginalTime && Intrinsics.areEqual(this.eventRRule, timeData.eventRRule) && Intrinsics.areEqual(this.timeZoneId, timeData.timeZoneId) && Intrinsics.areEqual(this.filterDisplayAttendeeList, timeData.filterDisplayAttendeeList) && this.isGuestInDifferentLocalTime == timeData.isGuestInDifferentLocalTime && Intrinsics.areEqual(this.chosenMeetingRoomList, timeData.chosenMeetingRoomList) && Intrinsics.areEqual(this.originalEvent, timeData.originalEvent);
    }

    public int hashCode() {
        long j = this.startTime;
        long j2 = this.endTime;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z = this.isAllDay;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        long j3 = this.eventOriginalTime;
        int i6 = (((i + i3) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str = this.eventRRule;
        int i7 = 0;
        int hashCode = (i6 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.timeZoneId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ArrayList<UserAttendeeBaseInfo> arrayList = this.filterDisplayAttendeeList;
        int hashCode3 = (hashCode2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        boolean z2 = this.isGuestInDifferentLocalTime;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        int i8 = (hashCode3 + i2) * 31;
        ArrayList<CalendarEventAttendee> arrayList2 = this.chosenMeetingRoomList;
        int hashCode4 = (i8 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        CalendarEvent calendarEvent = this.originalEvent;
        if (calendarEvent != null) {
            i7 = calendarEvent.hashCode();
        }
        return hashCode4 + i7;
    }

    public String toString() {
        return "TimeData(startTime=" + this.startTime + ", endTime=" + this.endTime + ", isAllDay=" + this.isAllDay + ", eventOriginalTime=" + this.eventOriginalTime + ", eventRRule=" + this.eventRRule + ", timeZoneId=" + this.timeZoneId + ", filterDisplayAttendeeList=" + this.filterDisplayAttendeeList + ", isGuestInDifferentLocalTime=" + this.isGuestInDifferentLocalTime + ", chosenMeetingRoomList=" + this.chosenMeetingRoomList + ", originalEvent=" + this.originalEvent + ")";
    }

    public final ArrayList<CalendarEventAttendee> getChosenMeetingRoomList() {
        return this.chosenMeetingRoomList;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getEventOriginalTime() {
        return this.eventOriginalTime;
    }

    public final String getEventRRule() {
        return this.eventRRule;
    }

    public final ArrayList<UserAttendeeBaseInfo> getFilterDisplayAttendeeList() {
        return this.filterDisplayAttendeeList;
    }

    public final CalendarEvent getOriginalEvent() {
        return this.originalEvent;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getTimeZoneId() {
        return this.timeZoneId;
    }

    public final boolean isAllDay() {
        return this.isAllDay;
    }

    public final boolean isGuestInDifferentLocalTime() {
        return this.isGuestInDifferentLocalTime;
    }

    public final void setAllDay(boolean z) {
        this.isAllDay = z;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setEventOriginalTime(long j) {
        this.eventOriginalTime = j;
    }

    public final void setGuestInDifferentLocalTime(boolean z) {
        this.isGuestInDifferentLocalTime = z;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setChosenMeetingRoomList(ArrayList<CalendarEventAttendee> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.chosenMeetingRoomList = arrayList;
    }

    public final void setEventRRule(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.eventRRule = str;
    }

    public final void setFilterDisplayAttendeeList(ArrayList<UserAttendeeBaseInfo> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.filterDisplayAttendeeList = arrayList;
    }

    public final void setTimeZoneId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.timeZoneId = str;
    }

    public TimeData(long j, long j2, boolean z, long j3, String str, String str2, ArrayList<UserAttendeeBaseInfo> arrayList, boolean z2, ArrayList<CalendarEventAttendee> arrayList2, CalendarEvent calendarEvent) {
        Intrinsics.checkParameterIsNotNull(str, "eventRRule");
        Intrinsics.checkParameterIsNotNull(str2, "timeZoneId");
        Intrinsics.checkParameterIsNotNull(arrayList, "filterDisplayAttendeeList");
        Intrinsics.checkParameterIsNotNull(arrayList2, "chosenMeetingRoomList");
        this.startTime = j;
        this.endTime = j2;
        this.isAllDay = z;
        this.eventOriginalTime = j3;
        this.eventRRule = str;
        this.timeZoneId = str2;
        this.filterDisplayAttendeeList = arrayList;
        this.isGuestInDifferentLocalTime = z2;
        this.chosenMeetingRoomList = arrayList2;
        this.originalEvent = calendarEvent;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TimeData(long r18, long r20, boolean r22, long r23, java.lang.String r25, java.lang.String r26, java.util.ArrayList r27, boolean r28, java.util.ArrayList r29, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r8 = 0
            goto L_0x000b
        L_0x0009:
            r8 = r22
        L_0x000b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0013
            java.lang.String r1 = ""
            r12 = r1
            goto L_0x0015
        L_0x0013:
            r12 = r26
        L_0x0015:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0020
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r13 = r1
            goto L_0x0022
        L_0x0020:
            r13 = r27
        L_0x0022:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0028
            r14 = 0
            goto L_0x002a
        L_0x0028:
            r14 = r28
        L_0x002a:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0035
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r15 = r0
            goto L_0x0037
        L_0x0035:
            r15 = r29
        L_0x0037:
            r3 = r17
            r4 = r18
            r6 = r20
            r9 = r23
            r11 = r25
            r16 = r30
            r3.<init>(r4, r6, r8, r9, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.data.TimeData.<init>(long, long, boolean, long, java.lang.String, java.lang.String, java.util.ArrayList, boolean, java.util.ArrayList, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
