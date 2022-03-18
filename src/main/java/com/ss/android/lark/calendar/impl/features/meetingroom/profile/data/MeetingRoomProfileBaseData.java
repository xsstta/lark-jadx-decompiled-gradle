package com.ss.android.lark.calendar.impl.features.meetingroom.profile.data;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 .2\u00020\u0001:\u0001.BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006/"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/data/MeetingRoomProfileBaseData;", "", "calendarId", "", "startTimeSecond", "", "endTimeSecond", "needSubscriberInfo", "", "eventRule", "timeZoneId", "(Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;)V", "getCalendarId", "()Ljava/lang/String;", "setCalendarId", "(Ljava/lang/String;)V", "getEndTimeSecond", "()J", "setEndTimeSecond", "(J)V", "getEventRule", "setEventRule", "getNeedSubscriberInfo", "()Z", "setNeedSubscriberInfo", "(Z)V", "getStartTimeSecond", "setStartTimeSecond", "getTimeZoneId", "setTimeZoneId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "saveToBundle", "", "extras", "Landroid/os/Bundle;", "toString", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.b.a */
public final class MeetingRoomProfileBaseData {

    /* renamed from: a */
    public static final Companion f82165a = new Companion(null);

    /* renamed from: b */
    private String f82166b;

    /* renamed from: c */
    private long f82167c;

    /* renamed from: d */
    private long f82168d;

    /* renamed from: e */
    private boolean f82169e;

    /* renamed from: f */
    private String f82170f;

    /* renamed from: g */
    private String f82171g;

    public MeetingRoomProfileBaseData() {
        this(null, 0, 0, false, null, null, 63, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeetingRoomProfileBaseData)) {
            return false;
        }
        MeetingRoomProfileBaseData aVar = (MeetingRoomProfileBaseData) obj;
        return Intrinsics.areEqual(this.f82166b, aVar.f82166b) && this.f82167c == aVar.f82167c && this.f82168d == aVar.f82168d && this.f82169e == aVar.f82169e && Intrinsics.areEqual(this.f82170f, aVar.f82170f) && Intrinsics.areEqual(this.f82171g, aVar.f82171g);
    }

    public int hashCode() {
        String str = this.f82166b;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f82167c;
        long j2 = this.f82168d;
        int i2 = ((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z = this.f82169e;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i2 + i3) * 31;
        String str2 = this.f82170f;
        int hashCode2 = (i6 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f82171g;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "MeetingRoomProfileBaseData(calendarId=" + this.f82166b + ", startTimeSecond=" + this.f82167c + ", endTimeSecond=" + this.f82168d + ", needSubscriberInfo=" + this.f82169e + ", eventRule=" + this.f82170f + ", timeZoneId=" + this.f82171g + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/data/MeetingRoomProfileBaseData$Companion;", "", "()V", "initFromBundle", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/data/MeetingRoomProfileBaseData;", "extras", "Landroid/os/Bundle;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MeetingRoomProfileBaseData mo117305a(Bundle bundle) {
            MeetingRoomProfileBaseData aVar = new MeetingRoomProfileBaseData(null, 0, 0, false, null, null, 63, null);
            if (bundle != null) {
                String string = bundle.getString("meeting_room_calendar_id", "");
                Intrinsics.checkExpressionValueIsNotNull(string, "extras.getString(Meeting…ING_ROOM_CALENDAR_ID, \"\")");
                aVar.mo117292a(string);
                aVar.mo117290a(bundle.getLong("meeting_event_start_time", 0));
                aVar.mo117295b(bundle.getLong("meeting_event_end_time", 0));
                aVar.mo117293a(bundle.getBoolean("need_subscriber_info", false));
                String string2 = bundle.getString("event_rule", "");
                Intrinsics.checkExpressionValueIsNotNull(string2, "extras.getString(Meeting…mConstant.EVENT_RULE, \"\")");
                aVar.mo117296b(string2);
                String string3 = bundle.getString("time_zone_id");
                if (string3 != null) {
                    Intrinsics.checkExpressionValueIsNotNull(string3, "it");
                    aVar.mo117298c(string3);
                }
            }
            return aVar;
        }
    }

    /* renamed from: a */
    public final String mo117289a() {
        return this.f82166b;
    }

    /* renamed from: b */
    public final long mo117294b() {
        return this.f82167c;
    }

    /* renamed from: c */
    public final long mo117297c() {
        return this.f82168d;
    }

    /* renamed from: d */
    public final boolean mo117299d() {
        return this.f82169e;
    }

    /* renamed from: e */
    public final String mo117300e() {
        return this.f82170f;
    }

    /* renamed from: f */
    public final String mo117302f() {
        return this.f82171g;
    }

    /* renamed from: a */
    public final void mo117290a(long j) {
        this.f82167c = j;
    }

    /* renamed from: b */
    public final void mo117295b(long j) {
        this.f82168d = j;
    }

    /* renamed from: c */
    public final void mo117298c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f82171g = str;
    }

    /* renamed from: a */
    public final void mo117292a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f82166b = str;
    }

    /* renamed from: b */
    public final void mo117296b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f82170f = str;
    }

    /* renamed from: a */
    public final void mo117293a(boolean z) {
        this.f82169e = z;
    }

    /* renamed from: a */
    public final void mo117291a(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "extras");
        bundle.putString("meeting_room_calendar_id", this.f82166b);
        bundle.putLong("meeting_event_start_time", this.f82167c);
        bundle.putLong("meeting_event_end_time", this.f82168d);
        bundle.putBoolean("need_subscriber_info", this.f82169e);
        bundle.putString("event_rule", this.f82170f);
        bundle.putString("time_zone_id", this.f82171g);
    }

    public MeetingRoomProfileBaseData(String str, long j, long j2, boolean z, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(str2, "eventRule");
        Intrinsics.checkParameterIsNotNull(str3, "timeZoneId");
        this.f82166b = str;
        this.f82167c = j;
        this.f82168d = j2;
        this.f82169e = z;
        this.f82170f = str2;
        this.f82171g = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MeetingRoomProfileBaseData(java.lang.String r10, long r11, long r13, boolean r15, java.lang.String r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18 & 1
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = r10
        L_0x0009:
            r2 = r18 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0011
            r5 = r3
            goto L_0x0012
        L_0x0011:
            r5 = r11
        L_0x0012:
            r2 = r18 & 4
            if (r2 == 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r3 = r13
        L_0x0018:
            r2 = r18 & 8
            if (r2 == 0) goto L_0x001e
            r2 = 0
            goto L_0x001f
        L_0x001e:
            r2 = r15
        L_0x001f:
            r7 = r18 & 16
            if (r7 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r1 = r16
        L_0x0026:
            r7 = r18 & 32
            if (r7 == 0) goto L_0x003d
            java.util.TimeZone r7 = java.util.TimeZone.getDefault()
            java.lang.String r8 = "TimeZone.getDefault()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r8)
            java.lang.String r7 = r7.getID()
            java.lang.String r8 = "TimeZone.getDefault().id"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r8)
            goto L_0x003f
        L_0x003d:
            r7 = r17
        L_0x003f:
            r10 = r9
            r11 = r0
            r12 = r5
            r14 = r3
            r16 = r2
            r17 = r1
            r18 = r7
            r10.<init>(r11, r12, r14, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.meetingroom.profile.data.MeetingRoomProfileBaseData.<init>(java.lang.String, long, long, boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
