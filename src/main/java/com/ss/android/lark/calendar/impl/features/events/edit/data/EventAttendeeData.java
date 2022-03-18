package com.ss.android.lark.calendar.impl.features.events.edit.data;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\n\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0014\"\u0004\b\u0017\u0010\u0016¨\u0006\""}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventAttendeeData;", "", "attendeeSumFromInfo", "", "attendeeList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "Lkotlin/collections/ArrayList;", "isExternalEvent", "", "isEditEvent", "(ILjava/util/ArrayList;ZZ)V", "getAttendeeList", "()Ljava/util/ArrayList;", "setAttendeeList", "(Ljava/util/ArrayList;)V", "getAttendeeSumFromInfo", "()I", "setAttendeeSumFromInfo", "(I)V", "()Z", "setEditEvent", "(Z)V", "setExternalEvent", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.data.d */
public final class EventAttendeeData {

    /* renamed from: a */
    private int f80199a;

    /* renamed from: b */
    private ArrayList<CalendarEventAttendee> f80200b;

    /* renamed from: c */
    private boolean f80201c;

    /* renamed from: d */
    private boolean f80202d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventAttendeeData)) {
            return false;
        }
        EventAttendeeData dVar = (EventAttendeeData) obj;
        return this.f80199a == dVar.f80199a && Intrinsics.areEqual(this.f80200b, dVar.f80200b) && this.f80201c == dVar.f80201c && this.f80202d == dVar.f80202d;
    }

    public int hashCode() {
        int i = this.f80199a * 31;
        ArrayList<CalendarEventAttendee> arrayList = this.f80200b;
        int hashCode = (i + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        boolean z = this.f80201c;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        boolean z2 = this.f80202d;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        return i6 + i2;
    }

    public String toString() {
        return "EventAttendeeData(attendeeSumFromInfo=" + this.f80199a + ", attendeeList=" + this.f80200b + ", isExternalEvent=" + this.f80201c + ", isEditEvent=" + this.f80202d + ")";
    }

    /* renamed from: a */
    public final int mo115086a() {
        return this.f80199a;
    }

    /* renamed from: b */
    public final ArrayList<CalendarEventAttendee> mo115087b() {
        return this.f80200b;
    }

    /* renamed from: c */
    public final boolean mo115088c() {
        return this.f80201c;
    }

    /* renamed from: d */
    public final boolean mo115089d() {
        return this.f80202d;
    }

    public EventAttendeeData(int i, ArrayList<CalendarEventAttendee> arrayList, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(arrayList, "attendeeList");
        this.f80199a = i;
        this.f80200b = arrayList;
        this.f80201c = z;
        this.f80202d = z2;
    }
}
