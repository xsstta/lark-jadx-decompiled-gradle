package com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneBuildingFloorViewData;", "", "id", "", "name", "isSelected", "", "floor", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/FloorViewData;", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getFloor", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "()Z", "setSelected", "(Z)V", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.g */
public final class OneBuildingFloorViewData {

    /* renamed from: a */
    private final String f78271a;

    /* renamed from: b */
    private final String f78272b;

    /* renamed from: c */
    private boolean f78273c;

    /* renamed from: d */
    private final List<FloorViewData> f78274d;

    public String toString() {
        return "OneBuildingFloorViewData(id=" + this.f78271a + ", name=" + this.f78272b + ", isSelected=" + this.f78273c + ", floor=" + this.f78274d + ")";
    }

    /* renamed from: a */
    public final String mo112378a() {
        return this.f78271a;
    }

    /* renamed from: b */
    public final String mo112380b() {
        return this.f78272b;
    }

    /* renamed from: c */
    public final boolean mo112381c() {
        return this.f78273c;
    }

    /* renamed from: d */
    public final List<FloorViewData> mo112382d() {
        return this.f78274d;
    }

    public int hashCode() {
        return this.f78271a.hashCode();
    }

    /* renamed from: a */
    public final void mo112379a(boolean z) {
        this.f78273c = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof OneBuildingFloorViewData)) {
            return false;
        }
        return Intrinsics.areEqual(this.f78271a, ((OneBuildingFloorViewData) obj).f78271a);
    }

    public OneBuildingFloorViewData(String str, String str2, boolean z, List<FloorViewData> list) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(list, "floor");
        this.f78271a = str;
        this.f78272b = str2;
        this.f78273c = z;
        this.f78274d = list;
    }
}
