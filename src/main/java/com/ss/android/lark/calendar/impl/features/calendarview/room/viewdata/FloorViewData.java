package com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/FloorViewData;", "", "name", "", "isAllFloor", "", "isSelected", "(Ljava/lang/String;ZZ)V", "()Z", "setSelected", "(Z)V", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.d */
public final class FloorViewData {

    /* renamed from: a */
    private final String f78264a;

    /* renamed from: b */
    private final boolean f78265b;

    /* renamed from: c */
    private boolean f78266c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloorViewData)) {
            return false;
        }
        FloorViewData dVar = (FloorViewData) obj;
        return Intrinsics.areEqual(this.f78264a, dVar.f78264a) && this.f78265b == dVar.f78265b && this.f78266c == dVar.f78266c;
    }

    public int hashCode() {
        String str = this.f78264a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f78265b;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        boolean z2 = this.f78266c;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i5 + i;
    }

    public String toString() {
        return "FloorViewData(name=" + this.f78264a + ", isAllFloor=" + this.f78265b + ", isSelected=" + this.f78266c + ")";
    }

    /* renamed from: a */
    public final String mo112355a() {
        return this.f78264a;
    }

    /* renamed from: b */
    public final boolean mo112357b() {
        return this.f78265b;
    }

    /* renamed from: c */
    public final boolean mo112358c() {
        return this.f78266c;
    }

    /* renamed from: a */
    public final void mo112356a(boolean z) {
        this.f78266c = z;
    }

    public FloorViewData(String str, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        this.f78264a = str;
        this.f78265b = z;
        this.f78266c = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FloorViewData(String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
