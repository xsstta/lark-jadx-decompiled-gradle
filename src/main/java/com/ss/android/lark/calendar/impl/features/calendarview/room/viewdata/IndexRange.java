package com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0010\u001a\u00020\rJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/IndexRange;", "", "startIndex", "", "endIndex", "(II)V", "getEndIndex", "()I", "getStartIndex", "component1", "component2", "copy", "equals", "", "other", "hashCode", "isInvalid", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.e */
public final class IndexRange {

    /* renamed from: a */
    private final int f78267a;

    /* renamed from: b */
    private final int f78268b;

    public IndexRange() {
        this(0, 0, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexRange)) {
            return false;
        }
        IndexRange eVar = (IndexRange) obj;
        return this.f78267a == eVar.f78267a && this.f78268b == eVar.f78268b;
    }

    public int hashCode() {
        return (this.f78267a * 31) + this.f78268b;
    }

    /* renamed from: b */
    public final int mo112363b() {
        return this.f78267a;
    }

    /* renamed from: c */
    public final int mo112364c() {
        return this.f78268b;
    }

    /* renamed from: a */
    public final boolean mo112362a() {
        int i;
        int i2 = this.f78267a;
        if (i2 < 0 || (i = this.f78268b) < 0 || i < i2) {
            return true;
        }
        return false;
    }

    public String toString() {
        return '[' + this.f78267a + ", " + this.f78268b + ']';
    }

    public IndexRange(int i, int i2) {
        this.f78267a = i;
        this.f78268b = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IndexRange(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2);
    }
}
