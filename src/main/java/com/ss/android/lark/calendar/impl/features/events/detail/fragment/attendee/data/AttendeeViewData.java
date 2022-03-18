package com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.data;

import com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0012\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0016J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\f\"\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\""}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/data/AttendeeViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/data/IAttendeeViewData;", "attendeeData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeDetailData;", "isLoading", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/data/Type;", "isShowGroupMember", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeDetailData;ZLcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/data/Type;Z)V", "getAttendeeData", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeDetailData;", "()Z", "setLoading", "(Z)V", "setShowGroupMember", "getType", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/data/Type;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "getViewType", "hashCode", "", "isContentSame", "diffable", "isItemSame", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.data.b */
public final class AttendeeViewData implements IAttendeeViewData {

    /* renamed from: a */
    private final IBodyData.IAttendeeDetailData f79287a;

    /* renamed from: b */
    private boolean f79288b;

    /* renamed from: c */
    private final Type f79289c;

    /* renamed from: d */
    private boolean f79290d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttendeeViewData)) {
            return false;
        }
        AttendeeViewData bVar = (AttendeeViewData) obj;
        return Intrinsics.areEqual(this.f79287a, bVar.f79287a) && this.f79288b == bVar.f79288b && Intrinsics.areEqual(this.f79289c, bVar.f79289c) && this.f79290d == bVar.f79290d;
    }

    public int hashCode() {
        IBodyData.IAttendeeDetailData bVar = this.f79287a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        boolean z = this.f79288b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        Type type = this.f79289c;
        if (type != null) {
            i = type.hashCode();
        }
        int i7 = (i6 + i) * 31;
        boolean z2 = this.f79290d;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        return i7 + i2;
    }

    public String toString() {
        return "AttendeeViewData(attendeeData=" + this.f79287a + ", isLoading=" + this.f79288b + ", type=" + this.f79289c + ", isShowGroupMember=" + this.f79290d + ")";
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.data.IAttendeeViewData
    /* renamed from: a */
    public Type mo113786a() {
        return this.f79289c;
    }

    /* renamed from: b */
    public final IBodyData.IAttendeeDetailData mo113792b() {
        return this.f79287a;
    }

    /* renamed from: c */
    public final boolean mo113795c() {
        return this.f79288b;
    }

    /* renamed from: d */
    public final Type mo113796d() {
        return this.f79289c;
    }

    /* renamed from: e */
    public final boolean mo113797e() {
        return this.f79290d;
    }

    /* renamed from: a */
    public final void mo113790a(boolean z) {
        this.f79288b = z;
    }

    /* renamed from: b */
    public final void mo113793b(boolean z) {
        this.f79290d = z;
    }

    /* renamed from: b */
    public boolean isItemSame(IAttendeeViewData cVar) {
        if (!(cVar instanceof AttendeeViewData)) {
            return false;
        }
        AttendeeViewData bVar = (AttendeeViewData) cVar;
        if (this.f79289c != bVar.f79289c || !Intrinsics.areEqual(this.f79287a.mo113391q(), bVar.f79287a.mo113391q())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean isContentSame(IAttendeeViewData cVar) {
        if (!(cVar instanceof AttendeeViewData)) {
            return false;
        }
        AttendeeViewData bVar = (AttendeeViewData) cVar;
        if (bVar.f79287a.mo113390p() == this.f79287a.mo113390p() && bVar.f79288b == this.f79288b && bVar.f79290d == this.f79290d && Intrinsics.areEqual(bVar.f79287a.mo113375a(), this.f79287a.mo113375a()) && bVar.f79287a.mo113383i() == this.f79287a.mo113383i() && Intrinsics.areEqual(bVar.f79287a.mo113379e(), this.f79287a.mo113379e()) && bVar.f79287a.mo113384j() == this.f79287a.mo113384j() && bVar.f79287a.mo113386l() == this.f79287a.mo113386l() && bVar.f79287a.mo113388n() == this.f79287a.mo113388n() && bVar.f79287a.mo113389o() == this.f79287a.mo113389o()) {
            return true;
        }
        return false;
    }

    public AttendeeViewData(IBodyData.IAttendeeDetailData bVar, boolean z, Type type, boolean z2) {
        Intrinsics.checkParameterIsNotNull(bVar, "attendeeData");
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        this.f79287a = bVar;
        this.f79288b = z;
        this.f79289c = type;
        this.f79290d = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AttendeeViewData(IBodyData.IAttendeeDetailData bVar, boolean z, Type type, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i & 2) != 0 ? false : z, (i & 4) != 0 ? Type.INDIVIDUAL : type, (i & 8) != 0 ? false : z2);
    }
}
