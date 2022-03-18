package com.ss.android.vc.entity.tab;

import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.MeetingStatus;
import com.ss.android.vc.entity.VideoChat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0010HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0010HÆ\u0003J\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00100\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016¨\u00065"}, d2 = {"Lcom/ss/android/vc/entity/tab/VCTabHistoryCommonInfo;", "", "meetingTopic", "", "meetingType", "Lcom/ss/android/vc/entity/VideoChat$Type;", "meetingSource", "Lcom/ss/android/vc/entity/VideoChat$MeetingSource;", "meetingStatus", "Lcom/ss/android/vc/entity/MeetingStatus;", "isLocked", "", "isContainsMultipleTenant", "isRecorded", "sameTenantId", "startTime", "", "endTime", "hostUser", "Lcom/ss/android/vc/entity/ByteviewUser;", "(Ljava/lang/String;Lcom/ss/android/vc/entity/VideoChat$Type;Lcom/ss/android/vc/entity/VideoChat$MeetingSource;Lcom/ss/android/vc/entity/MeetingStatus;ZZZLjava/lang/String;JJLcom/ss/android/vc/entity/ByteviewUser;)V", "getEndTime", "()J", "getHostUser", "()Lcom/ss/android/vc/entity/ByteviewUser;", "()Z", "getMeetingSource", "()Lcom/ss/android/vc/entity/VideoChat$MeetingSource;", "getMeetingStatus", "()Lcom/ss/android/vc/entity/MeetingStatus;", "getMeetingTopic", "()Ljava/lang/String;", "getMeetingType", "()Lcom/ss/android/vc/entity/VideoChat$Type;", "getSameTenantId", "getStartTime", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.tab.c */
public final class VCTabHistoryCommonInfo {

    /* renamed from: a */
    private final String f152808a;

    /* renamed from: b */
    private final VideoChat.Type f152809b;

    /* renamed from: c */
    private final VideoChat.MeetingSource f152810c;

    /* renamed from: d */
    private final MeetingStatus f152811d;

    /* renamed from: e */
    private final boolean f152812e;

    /* renamed from: f */
    private final boolean f152813f;

    /* renamed from: g */
    private final boolean f152814g;

    /* renamed from: h */
    private final String f152815h;

    /* renamed from: i */
    private final long f152816i;

    /* renamed from: j */
    private final long f152817j;

    /* renamed from: k */
    private final ByteviewUser f152818k;

    public VCTabHistoryCommonInfo() {
        this(null, null, null, null, false, false, false, null, 0, 0, null, 2047, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VCTabHistoryCommonInfo)) {
            return false;
        }
        VCTabHistoryCommonInfo cVar = (VCTabHistoryCommonInfo) obj;
        return Intrinsics.areEqual(this.f152808a, cVar.f152808a) && Intrinsics.areEqual(this.f152809b, cVar.f152809b) && Intrinsics.areEqual(this.f152810c, cVar.f152810c) && Intrinsics.areEqual(this.f152811d, cVar.f152811d) && this.f152812e == cVar.f152812e && this.f152813f == cVar.f152813f && this.f152814g == cVar.f152814g && Intrinsics.areEqual(this.f152815h, cVar.f152815h) && this.f152816i == cVar.f152816i && this.f152817j == cVar.f152817j && Intrinsics.areEqual(this.f152818k, cVar.f152818k);
    }

    public int hashCode() {
        String str = this.f152808a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        VideoChat.Type type = this.f152809b;
        int hashCode2 = (hashCode + (type != null ? type.hashCode() : 0)) * 31;
        VideoChat.MeetingSource meetingSource = this.f152810c;
        int hashCode3 = (hashCode2 + (meetingSource != null ? meetingSource.hashCode() : 0)) * 31;
        MeetingStatus meetingStatus = this.f152811d;
        int hashCode4 = (hashCode3 + (meetingStatus != null ? meetingStatus.hashCode() : 0)) * 31;
        boolean z = this.f152812e;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode4 + i3) * 31;
        boolean z2 = this.f152813f;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.f152814g;
        if (!z3) {
            i2 = z3 ? 1 : 0;
        }
        int i11 = (i10 + i2) * 31;
        String str2 = this.f152815h;
        int hashCode5 = str2 != null ? str2.hashCode() : 0;
        long j = this.f152816i;
        long j2 = this.f152817j;
        int i12 = (((((i11 + hashCode5) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        ByteviewUser byteviewUser = this.f152818k;
        if (byteviewUser != null) {
            i = byteviewUser.hashCode();
        }
        return i12 + i;
    }

    public String toString() {
        return "VCTabHistoryCommonInfo(meetingTopic=" + this.f152808a + ", meetingType=" + this.f152809b + ", meetingSource=" + this.f152810c + ", meetingStatus=" + this.f152811d + ", isLocked=" + this.f152812e + ", isContainsMultipleTenant=" + this.f152813f + ", isRecorded=" + this.f152814g + ", sameTenantId=" + this.f152815h + ", startTime=" + this.f152816i + ", endTime=" + this.f152817j + ", hostUser=" + this.f152818k + ")";
    }

    /* renamed from: a */
    public final String mo210415a() {
        return this.f152808a;
    }

    /* renamed from: b */
    public final VideoChat.Type mo210416b() {
        return this.f152809b;
    }

    /* renamed from: c */
    public final VideoChat.MeetingSource mo210417c() {
        return this.f152810c;
    }

    /* renamed from: d */
    public final MeetingStatus mo210418d() {
        return this.f152811d;
    }

    /* renamed from: e */
    public final boolean mo210419e() {
        return this.f152812e;
    }

    /* renamed from: f */
    public final boolean mo210421f() {
        return this.f152813f;
    }

    /* renamed from: g */
    public final boolean mo210422g() {
        return this.f152814g;
    }

    /* renamed from: h */
    public final String mo210423h() {
        return this.f152815h;
    }

    /* renamed from: i */
    public final long mo210425i() {
        return this.f152816i;
    }

    /* renamed from: j */
    public final long mo210426j() {
        return this.f152817j;
    }

    public VCTabHistoryCommonInfo(String str, VideoChat.Type type, VideoChat.MeetingSource meetingSource, MeetingStatus meetingStatus, boolean z, boolean z2, boolean z3, String str2, long j, long j2, ByteviewUser byteviewUser) {
        this.f152808a = str;
        this.f152809b = type;
        this.f152810c = meetingSource;
        this.f152811d = meetingStatus;
        this.f152812e = z;
        this.f152813f = z2;
        this.f152814g = z3;
        this.f152815h = str2;
        this.f152816i = j;
        this.f152817j = j2;
        this.f152818k = byteviewUser;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ VCTabHistoryCommonInfo(java.lang.String r16, com.ss.android.vc.entity.VideoChat.Type r17, com.ss.android.vc.entity.VideoChat.MeetingSource r18, com.ss.android.vc.entity.MeetingStatus r19, boolean r20, boolean r21, boolean r22, java.lang.String r23, long r24, long r26, com.ss.android.vc.entity.ByteviewUser r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.entity.tab.VCTabHistoryCommonInfo.<init>(java.lang.String, com.ss.android.vc.entity.VideoChat$Type, com.ss.android.vc.entity.VideoChat$MeetingSource, com.ss.android.vc.entity.MeetingStatus, boolean, boolean, boolean, java.lang.String, long, long, com.ss.android.vc.entity.ByteviewUser, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
