package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.bytedance.lark.pb.calendar.v1.MeetingRoomStatus;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomUnusableReasons;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006'"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/StatusInformation;", "", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomStatus;", "information", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MeetingRoomInformation;", "subscriptionInfo", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MeetingRoomSubscriptionInfo;", "unusableReasons", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomUnusableReasons;", "(Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomStatus;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MeetingRoomInformation;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MeetingRoomSubscriptionInfo;Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomUnusableReasons;)V", "getInformation", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MeetingRoomInformation;", "setInformation", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MeetingRoomInformation;)V", "getStatus", "()Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomStatus;", "setStatus", "(Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomStatus;)V", "getSubscriptionInfo", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MeetingRoomSubscriptionInfo;", "setSubscriptionInfo", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MeetingRoomSubscriptionInfo;)V", "getUnusableReasons", "()Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomUnusableReasons;", "setUnusableReasons", "(Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomUnusableReasons;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.z */
public final class StatusInformation {

    /* renamed from: a */
    private MeetingRoomStatus f83685a;

    /* renamed from: b */
    private MeetingRoomInformation f83686b;

    /* renamed from: c */
    private MeetingRoomSubscriptionInfo f83687c;

    /* renamed from: d */
    private MeetingRoomUnusableReasons f83688d;

    public StatusInformation() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusInformation)) {
            return false;
        }
        StatusInformation zVar = (StatusInformation) obj;
        return Intrinsics.areEqual(this.f83685a, zVar.f83685a) && Intrinsics.areEqual(this.f83686b, zVar.f83686b) && Intrinsics.areEqual(this.f83687c, zVar.f83687c) && Intrinsics.areEqual(this.f83688d, zVar.f83688d);
    }

    public int hashCode() {
        MeetingRoomStatus meetingRoomStatus = this.f83685a;
        int i = 0;
        int hashCode = (meetingRoomStatus != null ? meetingRoomStatus.hashCode() : 0) * 31;
        MeetingRoomInformation pVar = this.f83686b;
        int hashCode2 = (hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31;
        MeetingRoomSubscriptionInfo qVar = this.f83687c;
        int hashCode3 = (hashCode2 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        MeetingRoomUnusableReasons meetingRoomUnusableReasons = this.f83688d;
        if (meetingRoomUnusableReasons != null) {
            i = meetingRoomUnusableReasons.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "StatusInformation(status=" + this.f83685a + ", information=" + this.f83686b + ", subscriptionInfo=" + this.f83687c + ", unusableReasons=" + this.f83688d + ")";
    }

    /* renamed from: a */
    public final MeetingRoomStatus mo120256a() {
        return this.f83685a;
    }

    /* renamed from: b */
    public final MeetingRoomInformation mo120261b() {
        return this.f83686b;
    }

    /* renamed from: c */
    public final MeetingRoomSubscriptionInfo mo120262c() {
        return this.f83687c;
    }

    /* renamed from: d */
    public final MeetingRoomUnusableReasons mo120263d() {
        return this.f83688d;
    }

    /* renamed from: a */
    public final void mo120257a(MeetingRoomStatus meetingRoomStatus) {
        this.f83685a = meetingRoomStatus;
    }

    /* renamed from: a */
    public final void mo120258a(MeetingRoomUnusableReasons meetingRoomUnusableReasons) {
        this.f83688d = meetingRoomUnusableReasons;
    }

    /* renamed from: a */
    public final void mo120259a(MeetingRoomInformation pVar) {
        this.f83686b = pVar;
    }

    /* renamed from: a */
    public final void mo120260a(MeetingRoomSubscriptionInfo qVar) {
        this.f83687c = qVar;
    }

    public StatusInformation(MeetingRoomStatus meetingRoomStatus, MeetingRoomInformation pVar, MeetingRoomSubscriptionInfo qVar, MeetingRoomUnusableReasons meetingRoomUnusableReasons) {
        this.f83685a = meetingRoomStatus;
        this.f83686b = pVar;
        this.f83687c = qVar;
        this.f83688d = meetingRoomUnusableReasons;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StatusInformation(MeetingRoomStatus meetingRoomStatus, MeetingRoomInformation pVar, MeetingRoomSubscriptionInfo qVar, MeetingRoomUnusableReasons meetingRoomUnusableReasons, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : meetingRoomStatus, (i & 2) != 0 ? null : pVar, (i & 4) != 0 ? null : qVar, (i & 8) != 0 ? null : meetingRoomUnusableReasons);
    }
}
