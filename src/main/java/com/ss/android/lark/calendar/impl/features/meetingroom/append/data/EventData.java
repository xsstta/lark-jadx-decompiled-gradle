package com.ss.android.lark.calendar.impl.features.meetingroom.append.data;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/EventData;", "Ljava/io/Serializable;", "eventStartTime", "", "eventEndTime", "isEditEvent", "", "rRule", "", "originalTime", "(JJZLjava/lang/String;J)V", "getEventEndTime", "()J", "getEventStartTime", "()Z", "getOriginalTime", "getRRule", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EventData implements Serializable {
    private final long eventEndTime;
    private final long eventStartTime;
    private final boolean isEditEvent;
    private final long originalTime;
    private final String rRule;

    public EventData() {
        this(0, 0, false, null, 0, 31, null);
    }

    public static /* synthetic */ EventData copy$default(EventData eventData, long j, long j2, boolean z, String str, long j3, int i, Object obj) {
        return eventData.copy((i & 1) != 0 ? eventData.eventStartTime : j, (i & 2) != 0 ? eventData.eventEndTime : j2, (i & 4) != 0 ? eventData.isEditEvent : z, (i & 8) != 0 ? eventData.rRule : str, (i & 16) != 0 ? eventData.originalTime : j3);
    }

    public final long component1() {
        return this.eventStartTime;
    }

    public final long component2() {
        return this.eventEndTime;
    }

    public final boolean component3() {
        return this.isEditEvent;
    }

    public final String component4() {
        return this.rRule;
    }

    public final long component5() {
        return this.originalTime;
    }

    public final EventData copy(long j, long j2, boolean z, String str, long j3) {
        Intrinsics.checkParameterIsNotNull(str, "rRule");
        return new EventData(j, j2, z, str, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventData)) {
            return false;
        }
        EventData eventData = (EventData) obj;
        return this.eventStartTime == eventData.eventStartTime && this.eventEndTime == eventData.eventEndTime && this.isEditEvent == eventData.isEditEvent && Intrinsics.areEqual(this.rRule, eventData.rRule) && this.originalTime == eventData.originalTime;
    }

    public int hashCode() {
        long j = this.eventStartTime;
        long j2 = this.eventEndTime;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z = this.isEditEvent;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (i + i2) * 31;
        String str = this.rRule;
        int hashCode = str != null ? str.hashCode() : 0;
        long j3 = this.originalTime;
        return ((i5 + hashCode) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "EventData(eventStartTime=" + this.eventStartTime + ", eventEndTime=" + this.eventEndTime + ", isEditEvent=" + this.isEditEvent + ", rRule=" + this.rRule + ", originalTime=" + this.originalTime + ")";
    }

    public final long getEventEndTime() {
        return this.eventEndTime;
    }

    public final long getEventStartTime() {
        return this.eventStartTime;
    }

    public final long getOriginalTime() {
        return this.originalTime;
    }

    public final String getRRule() {
        return this.rRule;
    }

    public final boolean isEditEvent() {
        return this.isEditEvent;
    }

    public EventData(long j, long j2, boolean z, String str, long j3) {
        Intrinsics.checkParameterIsNotNull(str, "rRule");
        this.eventStartTime = j;
        this.eventEndTime = j2;
        this.isEditEvent = z;
        this.rRule = str;
        this.originalTime = j3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EventData(long r10, long r12, boolean r14, java.lang.String r15, long r16, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r10
        L_0x0009:
            r0 = r18 & 2
            if (r0 == 0) goto L_0x000f
            r5 = r1
            goto L_0x0010
        L_0x000f:
            r5 = r12
        L_0x0010:
            r0 = r18 & 4
            if (r0 == 0) goto L_0x0016
            r0 = 0
            goto L_0x0017
        L_0x0016:
            r0 = r14
        L_0x0017:
            r7 = r18 & 8
            if (r7 == 0) goto L_0x001e
            java.lang.String r7 = ""
            goto L_0x001f
        L_0x001e:
            r7 = r15
        L_0x001f:
            r8 = r18 & 16
            if (r8 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r1 = r16
        L_0x0026:
            r10 = r9
            r11 = r3
            r13 = r5
            r15 = r0
            r16 = r7
            r17 = r1
            r10.<init>(r11, r13, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.meetingroom.append.data.EventData.<init>(long, long, boolean, java.lang.String, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
