package com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.data;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/data/AttendeeTipViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/data/IAttendeeViewData;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/data/Type;", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/data/Type;)V", "getType", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/data/Type;", "getViewType", "isContentSame", "", "diffable", "isItemSame", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.data.a */
public final class AttendeeTipViewData implements IAttendeeViewData {

    /* renamed from: a */
    private final Type f79286a;

    public AttendeeTipViewData() {
        this(null, 1, null);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.data.IAttendeeViewData
    /* renamed from: a */
    public Type mo113786a() {
        return this.f79286a;
    }

    /* renamed from: b */
    public final Type mo113788b() {
        return this.f79286a;
    }

    public AttendeeTipViewData(Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        this.f79286a = type;
    }

    /* renamed from: a */
    public boolean isItemSame(IAttendeeViewData cVar) {
        if ((cVar instanceof AttendeeTipViewData) && this.f79286a == cVar.mo113786a()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean isContentSame(IAttendeeViewData cVar) {
        if ((cVar instanceof AttendeeTipViewData) && this.f79286a == cVar.mo113786a()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AttendeeTipViewData(Type type, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Type.INDIVIDUAL : type);
    }
}
