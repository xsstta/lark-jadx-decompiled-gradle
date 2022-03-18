package com.ss.android.lark.calendar.api.entity;

import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003JO\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\nHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006/"}, d2 = {"Lcom/ss/android/lark/calendar/api/entity/CalendarNotice;", "Lcom/ss/android/lark/notification/export/entity/Notice;", "calendarId", "", "calendarKey", "calendarOriginTime", "", "calendarStartTime", "calendarEndTime", "minuts", "", "eventId", "(Ljava/lang/String;Ljava/lang/String;JJJILjava/lang/String;)V", "getCalendarEndTime", "()J", "setCalendarEndTime", "(J)V", "getCalendarId", "()Ljava/lang/String;", "setCalendarId", "(Ljava/lang/String;)V", "getCalendarKey", "setCalendarKey", "getCalendarOriginTime", "setCalendarOriginTime", "getCalendarStartTime", "setCalendarStartTime", "getEventId", "setEventId", "getMinuts", "()I", "setMinuts", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarNotice extends Notice {
    private long calendarEndTime;
    private String calendarId;
    private String calendarKey;
    private long calendarOriginTime;
    private long calendarStartTime;
    private String eventId;
    private int minuts;

    public CalendarNotice() {
        this(null, null, 0, 0, 0, 0, null, SmActions.ACTION_ONTHECALL_ENTRY, null);
    }

    public static /* synthetic */ CalendarNotice copy$default(CalendarNotice calendarNotice, String str, String str2, long j, long j2, long j3, int i, String str3, int i2, Object obj) {
        return calendarNotice.copy((i2 & 1) != 0 ? calendarNotice.calendarId : str, (i2 & 2) != 0 ? calendarNotice.calendarKey : str2, (i2 & 4) != 0 ? calendarNotice.calendarOriginTime : j, (i2 & 8) != 0 ? calendarNotice.calendarStartTime : j2, (i2 & 16) != 0 ? calendarNotice.calendarEndTime : j3, (i2 & 32) != 0 ? calendarNotice.minuts : i, (i2 & 64) != 0 ? calendarNotice.eventId : str3);
    }

    public final String component1() {
        return this.calendarId;
    }

    public final String component2() {
        return this.calendarKey;
    }

    public final long component3() {
        return this.calendarOriginTime;
    }

    public final long component4() {
        return this.calendarStartTime;
    }

    public final long component5() {
        return this.calendarEndTime;
    }

    public final int component6() {
        return this.minuts;
    }

    public final String component7() {
        return this.eventId;
    }

    public final CalendarNotice copy(String str, String str2, long j, long j2, long j3, int i, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(str2, "calendarKey");
        Intrinsics.checkParameterIsNotNull(str3, "eventId");
        return new CalendarNotice(str, str2, j, j2, j3, i, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarNotice)) {
            return false;
        }
        CalendarNotice calendarNotice = (CalendarNotice) obj;
        return Intrinsics.areEqual(this.calendarId, calendarNotice.calendarId) && Intrinsics.areEqual(this.calendarKey, calendarNotice.calendarKey) && this.calendarOriginTime == calendarNotice.calendarOriginTime && this.calendarStartTime == calendarNotice.calendarStartTime && this.calendarEndTime == calendarNotice.calendarEndTime && this.minuts == calendarNotice.minuts && Intrinsics.areEqual(this.eventId, calendarNotice.eventId);
    }

    public int hashCode() {
        String str = this.calendarId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.calendarKey;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.calendarOriginTime;
        long j2 = this.calendarStartTime;
        long j3 = this.calendarEndTime;
        int i2 = (((((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.minuts) * 31;
        String str3 = this.eventId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "CalendarNotice(calendarId=" + this.calendarId + ", calendarKey=" + this.calendarKey + ", calendarOriginTime=" + this.calendarOriginTime + ", calendarStartTime=" + this.calendarStartTime + ", calendarEndTime=" + this.calendarEndTime + ", minuts=" + this.minuts + ", eventId=" + this.eventId + ")";
    }

    public final long getCalendarEndTime() {
        return this.calendarEndTime;
    }

    public final String getCalendarId() {
        return this.calendarId;
    }

    public final String getCalendarKey() {
        return this.calendarKey;
    }

    public final long getCalendarOriginTime() {
        return this.calendarOriginTime;
    }

    public final long getCalendarStartTime() {
        return this.calendarStartTime;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final int getMinuts() {
        return this.minuts;
    }

    public final void setCalendarEndTime(long j) {
        this.calendarEndTime = j;
    }

    public final void setCalendarOriginTime(long j) {
        this.calendarOriginTime = j;
    }

    public final void setCalendarStartTime(long j) {
        this.calendarStartTime = j;
    }

    public final void setMinuts(int i) {
        this.minuts = i;
    }

    public final void setCalendarId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.calendarId = str;
    }

    public final void setCalendarKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.calendarKey = str;
    }

    public final void setEventId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.eventId = str;
    }

    public CalendarNotice(String str, String str2, long j, long j2, long j3, int i, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(str2, "calendarKey");
        Intrinsics.checkParameterIsNotNull(str3, "eventId");
        this.calendarId = str;
        this.calendarKey = str2;
        this.calendarOriginTime = j;
        this.calendarStartTime = j2;
        this.calendarEndTime = j3;
        this.minuts = i;
        this.eventId = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CalendarNotice(java.lang.String r12, java.lang.String r13, long r14, long r16, long r18, int r20, java.lang.String r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22 & 1
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = r12
        L_0x0009:
            r2 = r22 & 2
            if (r2 == 0) goto L_0x000f
            r2 = r1
            goto L_0x0010
        L_0x000f:
            r2 = r13
        L_0x0010:
            r3 = r22 & 4
            if (r3 == 0) goto L_0x0017
            r3 = 0
            goto L_0x0018
        L_0x0017:
            r3 = r14
        L_0x0018:
            r5 = r22 & 8
            r6 = -1
            if (r5 == 0) goto L_0x0020
            r8 = r6
            goto L_0x0022
        L_0x0020:
            r8 = r16
        L_0x0022:
            r5 = r22 & 16
            if (r5 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r6 = r18
        L_0x0029:
            r5 = r22 & 32
            if (r5 == 0) goto L_0x002f
            r5 = 0
            goto L_0x0031
        L_0x002f:
            r5 = r20
        L_0x0031:
            r10 = r22 & 64
            if (r10 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r1 = r21
        L_0x0038:
            r12 = r11
            r13 = r0
            r14 = r2
            r15 = r3
            r17 = r8
            r19 = r6
            r21 = r5
            r22 = r1
            r12.<init>(r13, r14, r15, r17, r19, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.api.entity.CalendarNotice.<init>(java.lang.String, java.lang.String, long, long, long, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
