package com.ss.android.lark.calendar.api.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u00108\u001a\u00020\rHÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010;\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0017\"\u0004\b(\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0017\"\u0004\b*\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010\u0015R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\"\"\u0004\b.\u0010$¨\u0006@"}, d2 = {"Lcom/ss/android/lark/calendar/api/entity/CalendarSearchEventsResponse;", "", "calendarId", "", "originalTime", "", "key", "summary", "organizerOrOwner", "summaryHitTerms", "", "organizerHitTerms", "isGoogleEvent", "", "startTime", "endTime", "eventExactData", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZJJLjava/lang/String;)V", "getCalendarId", "()Ljava/lang/String;", "setCalendarId", "(Ljava/lang/String;)V", "getEndTime", "()J", "setEndTime", "(J)V", "getEventExactData", "setEventExactData", "()Z", "setGoogleEvent", "(Z)V", "getKey", "setKey", "getOrganizerHitTerms", "()Ljava/util/List;", "setOrganizerHitTerms", "(Ljava/util/List;)V", "getOrganizerOrOwner", "setOrganizerOrOwner", "getOriginalTime", "setOriginalTime", "getStartTime", "setStartTime", "getSummary", "setSummary", "getSummaryHitTerms", "setSummaryHitTerms", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.api.entity.b */
public final class CalendarSearchEventsResponse {

    /* renamed from: a */
    private String f74894a;

    /* renamed from: b */
    private long f74895b;

    /* renamed from: c */
    private String f74896c;

    /* renamed from: d */
    private String f74897d;

    /* renamed from: e */
    private String f74898e;

    /* renamed from: f */
    private List<String> f74899f;

    /* renamed from: g */
    private List<String> f74900g;

    /* renamed from: h */
    private boolean f74901h;

    /* renamed from: i */
    private long f74902i;

    /* renamed from: j */
    private long f74903j;

    /* renamed from: k */
    private String f74904k;

    public CalendarSearchEventsResponse() {
        this(null, 0, null, null, null, null, null, false, 0, 0, null, 2047, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarSearchEventsResponse)) {
            return false;
        }
        CalendarSearchEventsResponse bVar = (CalendarSearchEventsResponse) obj;
        return Intrinsics.areEqual(this.f74894a, bVar.f74894a) && this.f74895b == bVar.f74895b && Intrinsics.areEqual(this.f74896c, bVar.f74896c) && Intrinsics.areEqual(this.f74897d, bVar.f74897d) && Intrinsics.areEqual(this.f74898e, bVar.f74898e) && Intrinsics.areEqual(this.f74899f, bVar.f74899f) && Intrinsics.areEqual(this.f74900g, bVar.f74900g) && this.f74901h == bVar.f74901h && this.f74902i == bVar.f74902i && this.f74903j == bVar.f74903j && Intrinsics.areEqual(this.f74904k, bVar.f74904k);
    }

    public int hashCode() {
        String str = this.f74894a;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f74895b;
        int i2 = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f74896c;
        int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f74897d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f74898e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<String> list = this.f74899f;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f74900g;
        int hashCode6 = (hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
        boolean z = this.f74901h;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        long j2 = this.f74902i;
        long j3 = this.f74903j;
        int i6 = (((((hashCode6 + i3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str5 = this.f74904k;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i6 + i;
    }

    public String toString() {
        return "CalendarSearchEventsResponse(calendarId=" + this.f74894a + ", originalTime=" + this.f74895b + ", key=" + this.f74896c + ", summary=" + this.f74897d + ", organizerOrOwner=" + this.f74898e + ", summaryHitTerms=" + this.f74899f + ", organizerHitTerms=" + this.f74900g + ", isGoogleEvent=" + this.f74901h + ", startTime=" + this.f74902i + ", endTime=" + this.f74903j + ", eventExactData=" + this.f74904k + ")";
    }

    /* renamed from: a */
    public final String mo108381a() {
        return this.f74894a;
    }

    /* renamed from: b */
    public final long mo108386b() {
        return this.f74895b;
    }

    /* renamed from: c */
    public final String mo108390c() {
        return this.f74896c;
    }

    /* renamed from: d */
    public final String mo108393d() {
        return this.f74897d;
    }

    /* renamed from: e */
    public final String mo108395e() {
        return this.f74898e;
    }

    /* renamed from: f */
    public final List<String> mo108398f() {
        return this.f74899f;
    }

    /* renamed from: g */
    public final List<String> mo108399g() {
        return this.f74900g;
    }

    /* renamed from: h */
    public final boolean mo108400h() {
        return this.f74901h;
    }

    /* renamed from: i */
    public final long mo108402i() {
        return this.f74902i;
    }

    /* renamed from: j */
    public final long mo108403j() {
        return this.f74903j;
    }

    /* renamed from: k */
    public final String mo108404k() {
        return this.f74904k;
    }

    /* renamed from: a */
    public final void mo108382a(long j) {
        this.f74895b = j;
    }

    /* renamed from: b */
    public final void mo108387b(long j) {
        this.f74902i = j;
    }

    /* renamed from: c */
    public final void mo108391c(long j) {
        this.f74903j = j;
    }

    /* renamed from: d */
    public final void mo108394d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f74898e = str;
    }

    /* renamed from: e */
    public final void mo108396e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f74904k = str;
    }

    /* renamed from: a */
    public final void mo108383a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f74894a = str;
    }

    /* renamed from: b */
    public final void mo108388b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f74896c = str;
    }

    /* renamed from: c */
    public final void mo108392c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f74897d = str;
    }

    /* renamed from: a */
    public final void mo108384a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f74899f = list;
    }

    /* renamed from: b */
    public final void mo108389b(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f74900g = list;
    }

    /* renamed from: a */
    public final void mo108385a(boolean z) {
        this.f74901h = z;
    }

    public CalendarSearchEventsResponse(String str, long j, String str2, String str3, String str4, List<String> list, List<String> list2, boolean z, long j2, long j3, String str5) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(str2, "key");
        Intrinsics.checkParameterIsNotNull(str3, "summary");
        Intrinsics.checkParameterIsNotNull(str4, "organizerOrOwner");
        Intrinsics.checkParameterIsNotNull(list, "summaryHitTerms");
        Intrinsics.checkParameterIsNotNull(list2, "organizerHitTerms");
        Intrinsics.checkParameterIsNotNull(str5, "eventExactData");
        this.f74894a = str;
        this.f74895b = j;
        this.f74896c = str2;
        this.f74897d = str3;
        this.f74898e = str4;
        this.f74899f = list;
        this.f74900g = list2;
        this.f74901h = z;
        this.f74902i = j2;
        this.f74903j = j3;
        this.f74904k = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CalendarSearchEventsResponse(java.lang.String r17, long r18, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.util.List r23, java.util.List r24, boolean r25, long r26, long r28, java.lang.String r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.api.entity.CalendarSearchEventsResponse.<init>(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean, long, long, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
