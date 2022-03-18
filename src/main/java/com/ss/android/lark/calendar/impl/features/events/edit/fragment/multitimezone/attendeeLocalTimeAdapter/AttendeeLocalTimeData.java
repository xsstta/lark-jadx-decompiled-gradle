package com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.attendeeLocalTimeAdapter;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.UserAttendeeBaseInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006¢\u0006\u0002\u0010\rJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003JK\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\u0013\u0010'\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u000bHÖ\u0001R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0012\"\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006,"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeLocalTimeAdapter/AttendeeLocalTimeData;", "", "mStartTime", "", "mEndTime", "isDeviceLocalTime", "", "filteredAttendees", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/UserAttendeeBaseInfo;", "timeZoneId", "", "isCrossDay", "(JJZLjava/util/List;Ljava/lang/String;Z)V", "getFilteredAttendees", "()Ljava/util/List;", "setFilteredAttendees", "(Ljava/util/List;)V", "()Z", "setCrossDay", "(Z)V", "setDeviceLocalTime", "getMEndTime", "()J", "setMEndTime", "(J)V", "getMStartTime", "setMStartTime", "getTimeZoneId", "()Ljava/lang/String;", "setTimeZoneId", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.b.a */
public final class AttendeeLocalTimeData {

    /* renamed from: a */
    private long f80528a;

    /* renamed from: b */
    private long f80529b;

    /* renamed from: c */
    private boolean f80530c;

    /* renamed from: d */
    private List<UserAttendeeBaseInfo> f80531d;

    /* renamed from: e */
    private String f80532e;

    /* renamed from: f */
    private boolean f80533f;

    public AttendeeLocalTimeData() {
        this(0, 0, false, null, null, false, 63, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttendeeLocalTimeData)) {
            return false;
        }
        AttendeeLocalTimeData aVar = (AttendeeLocalTimeData) obj;
        return this.f80528a == aVar.f80528a && this.f80529b == aVar.f80529b && this.f80530c == aVar.f80530c && Intrinsics.areEqual(this.f80531d, aVar.f80531d) && Intrinsics.areEqual(this.f80532e, aVar.f80532e) && this.f80533f == aVar.f80533f;
    }

    public int hashCode() {
        long j = this.f80528a;
        long j2 = this.f80529b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z = this.f80530c;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i + i3) * 31;
        List<UserAttendeeBaseInfo> list = this.f80531d;
        int i7 = 0;
        int hashCode = (i6 + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.f80532e;
        if (str != null) {
            i7 = str.hashCode();
        }
        int i8 = (hashCode + i7) * 31;
        boolean z2 = this.f80533f;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        return i8 + i2;
    }

    public String toString() {
        return "AttendeeLocalTimeData(mStartTime=" + this.f80528a + ", mEndTime=" + this.f80529b + ", isDeviceLocalTime=" + this.f80530c + ", filteredAttendees=" + this.f80531d + ", timeZoneId=" + this.f80532e + ", isCrossDay=" + this.f80533f + ")";
    }

    /* renamed from: a */
    public final long mo115445a() {
        return this.f80528a;
    }

    /* renamed from: b */
    public final long mo115448b() {
        return this.f80529b;
    }

    /* renamed from: c */
    public final boolean mo115449c() {
        return this.f80530c;
    }

    /* renamed from: d */
    public final List<UserAttendeeBaseInfo> mo115450d() {
        return this.f80531d;
    }

    /* renamed from: e */
    public final String mo115451e() {
        return this.f80532e;
    }

    /* renamed from: f */
    public final boolean mo115453f() {
        return this.f80533f;
    }

    /* renamed from: a */
    public final void mo115446a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f80532e = str;
    }

    /* renamed from: a */
    public final void mo115447a(boolean z) {
        this.f80533f = z;
    }

    public AttendeeLocalTimeData(long j, long j2, boolean z, List<UserAttendeeBaseInfo> list, String str, boolean z2) {
        Intrinsics.checkParameterIsNotNull(list, "filteredAttendees");
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        this.f80528a = j;
        this.f80529b = j2;
        this.f80530c = z;
        this.f80531d = list;
        this.f80532e = str;
        this.f80533f = z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AttendeeLocalTimeData(long r10, long r12, boolean r14, java.util.List r15, java.lang.String r16, boolean r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
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
            if (r0 == 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r1 = r12
        L_0x000f:
            r0 = r18 & 4
            r5 = 0
            if (r0 == 0) goto L_0x0016
            r0 = 0
            goto L_0x0017
        L_0x0016:
            r0 = r14
        L_0x0017:
            r6 = r18 & 8
            if (r6 == 0) goto L_0x0023
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r6 = (java.util.List) r6
            goto L_0x0024
        L_0x0023:
            r6 = r15
        L_0x0024:
            r7 = r18 & 16
            if (r7 == 0) goto L_0x002b
            java.lang.String r7 = ""
            goto L_0x002d
        L_0x002b:
            r7 = r16
        L_0x002d:
            r8 = r18 & 32
            if (r8 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r5 = r17
        L_0x0034:
            r10 = r9
            r11 = r3
            r13 = r1
            r15 = r0
            r16 = r6
            r17 = r7
            r18 = r5
            r10.<init>(r11, r13, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.attendeeLocalTimeAdapter.AttendeeLocalTimeData.<init>(long, long, boolean, java.util.List, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
