package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel;

import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiRoomNode;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiBaseNode;", "calendarResource", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "roomWeight", "", "(Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;J)V", "getCalendarResource", "()Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "getRoomWeight", "()J", "setRoomWeight", "(J)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "onAddUpdateMultiRoomNodeState", "", "onSelectUpdateMultiRoomNodeState", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.c.e */
public final class MultiRoomNode extends MultiBaseNode {

    /* renamed from: a */
    private final CalendarResource f80783a;

    /* renamed from: b */
    private long f80784b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiRoomNode)) {
            return false;
        }
        MultiRoomNode eVar = (MultiRoomNode) obj;
        return Intrinsics.areEqual(this.f80783a, eVar.f80783a) && this.f80784b == eVar.f80784b;
    }

    public int hashCode() {
        CalendarResource calendarResource = this.f80783a;
        int hashCode = calendarResource != null ? calendarResource.hashCode() : 0;
        long j = this.f80784b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "MultiRoomNode(calendarResource=" + this.f80783a + ", roomWeight=" + this.f80784b + ")";
    }

    /* renamed from: f */
    public final CalendarResource mo115847f() {
        return this.f80783a;
    }

    /* renamed from: g */
    public final long mo115848g() {
        return this.f80784b;
    }

    /* renamed from: d */
    public final void mo115844d() {
        mo115821a(IBuildingContract.SelectState.ALL);
        for (MultiLevelNode a = mo115819a(); a != null; a = a.mo115819a()) {
            MultiLevelNode.f80774a.mo115835a(a);
        }
    }

    /* renamed from: e */
    public final void mo115845e() {
        mo115821a(IBuildingContract.SelectState.NONE);
        for (MultiLevelNode a = mo115819a(); a != null; a = a.mo115819a()) {
            MultiLevelNode.f80774a.mo115835a(a);
        }
    }

    /* renamed from: b */
    public final void mo115843b(long j) {
        this.f80784b = j;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiRoomNode(CalendarResource calendarResource, long j) {
        super(null, null, 0, 7, null);
        Intrinsics.checkParameterIsNotNull(calendarResource, "calendarResource");
        this.f80783a = calendarResource;
        this.f80784b = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiRoomNode(CalendarResource calendarResource, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(calendarResource, (i & 2) != 0 ? 0 : j);
    }
}
