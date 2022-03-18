package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/PullEventIndividualAttendeesResponse;", "", "nextPageToken", "", "hasMore", "", "attendees", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "(Ljava/lang/String;ZLjava/util/List;)V", "getAttendees", "()Ljava/util/List;", "getHasMore", "()Z", "getNextPageToken", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.w */
public final class PullEventIndividualAttendeesResponse {

    /* renamed from: a */
    private final String f83677a;

    /* renamed from: b */
    private final boolean f83678b;

    /* renamed from: c */
    private final List<CalendarEventAttendee> f83679c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullEventIndividualAttendeesResponse)) {
            return false;
        }
        PullEventIndividualAttendeesResponse wVar = (PullEventIndividualAttendeesResponse) obj;
        return Intrinsics.areEqual(this.f83677a, wVar.f83677a) && this.f83678b == wVar.f83678b && Intrinsics.areEqual(this.f83679c, wVar.f83679c);
    }

    public int hashCode() {
        String str = this.f83677a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f83678b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        List<CalendarEventAttendee> list = this.f83679c;
        if (list != null) {
            i = list.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        return "PullEventIndividualAttendeesResponse(nextPageToken=" + this.f83677a + ", hasMore=" + this.f83678b + ", attendees=" + this.f83679c + ")";
    }

    /* renamed from: a */
    public final String mo120238a() {
        return this.f83677a;
    }

    /* renamed from: b */
    public final boolean mo120239b() {
        return this.f83678b;
    }

    /* renamed from: c */
    public final List<CalendarEventAttendee> mo120240c() {
        return this.f83679c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee> */
    /* JADX WARN: Multi-variable type inference failed */
    public PullEventIndividualAttendeesResponse(String str, boolean z, List<? extends CalendarEventAttendee> list) {
        this.f83677a = str;
        this.f83678b = z;
        this.f83679c = list;
    }
}
