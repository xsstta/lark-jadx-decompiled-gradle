package com.ss.android.lark.calendar.impl.features.meetingroom.instance.viewdata;

import android.text.TextUtils;
import com.bytedance.lark.pb.calendar.v1.RoomViewInstance;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0010HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010.\u001a\u00020\u0014HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\t\u00104\u001a\u00020\tHÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\t\u00106\u001a\u00020\u000eHÆ\u0003J\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0013\u00108\u001a\u00020\u000e2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010:\u001a\u00020\u000eJ\t\u0010;\u001a\u00020\tHÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0017¨\u0006="}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/viewdata/OneInstanceViewData;", "", "calendarId", "", "key", "originalTime", "", "title", "titleColor", "", "startDayMinutes", "endDayMinutes", "backgroundColor", "hasDottedRectangle", "", "pbInstance", "Lcom/bytedance/lark/pb/calendar/v1/RoomViewInstance;", "roomInfo", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "layout", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/InstanceLayout;", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;IIIIZLcom/bytedance/lark/pb/calendar/v1/RoomViewInstance;Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/InstanceLayout;)V", "getBackgroundColor", "()I", "getCalendarId", "()Ljava/lang/String;", "getEndDayMinutes", "getHasDottedRectangle", "()Z", "getKey", "getLayout", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/InstanceLayout;", "setLayout", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/InstanceLayout;)V", "getOriginalTime", "()J", "getPbInstance", "()Lcom/bytedance/lark/pb/calendar/v1/RoomViewInstance;", "getRoomInfo", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "getStartDayMinutes", "getTitle", "getTitleColor", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hasValidateTriples", "hashCode", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.b.c */
public final class OneInstanceViewData {

    /* renamed from: a */
    private final String f82084a;

    /* renamed from: b */
    private final String f82085b;

    /* renamed from: c */
    private final long f82086c;

    /* renamed from: d */
    private final String f82087d;

    /* renamed from: e */
    private final int f82088e;

    /* renamed from: f */
    private final int f82089f;

    /* renamed from: g */
    private final int f82090g;

    /* renamed from: h */
    private final int f82091h;

    /* renamed from: i */
    private final boolean f82092i;

    /* renamed from: j */
    private final RoomViewInstance f82093j;

    /* renamed from: k */
    private final EventMeetingRoomData f82094k;

    /* renamed from: l */
    private InstanceLayout f82095l;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OneInstanceViewData)) {
            return false;
        }
        OneInstanceViewData cVar = (OneInstanceViewData) obj;
        return Intrinsics.areEqual(this.f82084a, cVar.f82084a) && Intrinsics.areEqual(this.f82085b, cVar.f82085b) && this.f82086c == cVar.f82086c && Intrinsics.areEqual(this.f82087d, cVar.f82087d) && this.f82088e == cVar.f82088e && this.f82089f == cVar.f82089f && this.f82090g == cVar.f82090g && this.f82091h == cVar.f82091h && this.f82092i == cVar.f82092i && Intrinsics.areEqual(this.f82093j, cVar.f82093j) && Intrinsics.areEqual(this.f82094k, cVar.f82094k) && Intrinsics.areEqual(this.f82095l, cVar.f82095l);
    }

    public int hashCode() {
        String str = this.f82084a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f82085b;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.f82086c;
        int i2 = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str3 = this.f82087d;
        int hashCode3 = (((((((((i2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f82088e) * 31) + this.f82089f) * 31) + this.f82090g) * 31) + this.f82091h) * 31;
        boolean z = this.f82092i;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode3 + i3) * 31;
        RoomViewInstance roomViewInstance = this.f82093j;
        int hashCode4 = (i6 + (roomViewInstance != null ? roomViewInstance.hashCode() : 0)) * 31;
        EventMeetingRoomData eventMeetingRoomData = this.f82094k;
        int hashCode5 = (hashCode4 + (eventMeetingRoomData != null ? eventMeetingRoomData.hashCode() : 0)) * 31;
        InstanceLayout instanceLayout = this.f82095l;
        if (instanceLayout != null) {
            i = instanceLayout.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "OneInstanceViewData(calendarId=" + this.f82084a + ", key=" + this.f82085b + ", originalTime=" + this.f82086c + ", title=" + this.f82087d + ", titleColor=" + this.f82088e + ", startDayMinutes=" + this.f82089f + ", endDayMinutes=" + this.f82090g + ", backgroundColor=" + this.f82091h + ", hasDottedRectangle=" + this.f82092i + ", pbInstance=" + this.f82093j + ", roomInfo=" + this.f82094k + ", layout=" + this.f82095l + ")";
    }

    /* renamed from: b */
    public final String mo117173b() {
        return this.f82084a;
    }

    /* renamed from: c */
    public final String mo117174c() {
        return this.f82085b;
    }

    /* renamed from: d */
    public final long mo117175d() {
        return this.f82086c;
    }

    /* renamed from: e */
    public final String mo117176e() {
        return this.f82087d;
    }

    /* renamed from: f */
    public final int mo117178f() {
        return this.f82088e;
    }

    /* renamed from: g */
    public final int mo117179g() {
        return this.f82091h;
    }

    /* renamed from: h */
    public final boolean mo117180h() {
        return this.f82092i;
    }

    /* renamed from: i */
    public final RoomViewInstance mo117182i() {
        return this.f82093j;
    }

    /* renamed from: j */
    public final EventMeetingRoomData mo117183j() {
        return this.f82094k;
    }

    /* renamed from: k */
    public final InstanceLayout mo117184k() {
        return this.f82095l;
    }

    /* renamed from: a */
    public final boolean mo117172a() {
        if (TextUtils.isEmpty(this.f82084a) || TextUtils.isEmpty(this.f82085b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo117171a(InstanceLayout instanceLayout) {
        Intrinsics.checkParameterIsNotNull(instanceLayout, "<set-?>");
        this.f82095l = instanceLayout;
    }

    public OneInstanceViewData(String str, String str2, long j, String str3, int i, int i2, int i3, int i4, boolean z, RoomViewInstance roomViewInstance, EventMeetingRoomData eventMeetingRoomData, InstanceLayout instanceLayout) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(str2, "key");
        Intrinsics.checkParameterIsNotNull(roomViewInstance, "pbInstance");
        Intrinsics.checkParameterIsNotNull(instanceLayout, "layout");
        this.f82084a = str;
        this.f82085b = str2;
        this.f82086c = j;
        this.f82087d = str3;
        this.f82088e = i;
        this.f82089f = i2;
        this.f82090g = i3;
        this.f82091h = i4;
        this.f82092i = z;
        this.f82093j = roomViewInstance;
        this.f82094k = eventMeetingRoomData;
        this.f82095l = instanceLayout;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OneInstanceViewData(java.lang.String r16, java.lang.String r17, long r18, java.lang.String r20, int r21, int r22, int r23, int r24, boolean r25, com.bytedance.lark.pb.calendar.v1.RoomViewInstance r26, com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData r27, com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceLayout r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r15 = this;
            r0 = r29
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x000d
            com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceLayout r0 = new com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceLayout
            r0.<init>()
            r14 = r0
            goto L_0x000f
        L_0x000d:
            r14 = r28
        L_0x000f:
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r1.<init>(r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.meetingroom.instance.viewdata.OneInstanceViewData.<init>(java.lang.String, java.lang.String, long, java.lang.String, int, int, int, int, boolean, com.bytedance.lark.pb.calendar.v1.RoomViewInstance, com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData, com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceLayout, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
