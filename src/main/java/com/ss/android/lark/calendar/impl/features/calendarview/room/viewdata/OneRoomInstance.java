package com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tHÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneRoomInstance;", "", "calendarId", "", "instanceDay", "", "instances", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneInstance;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;ILjava/util/ArrayList;)V", "getCalendarId", "()Ljava/lang/String;", "getInstanceDay", "()I", "getInstances", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.j */
public final class OneRoomInstance {

    /* renamed from: a */
    private final String f78282a;

    /* renamed from: b */
    private final int f78283b;

    /* renamed from: c */
    private final ArrayList<OneInstance> f78284c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OneRoomInstance)) {
            return false;
        }
        OneRoomInstance jVar = (OneRoomInstance) obj;
        return Intrinsics.areEqual(this.f78282a, jVar.f78282a) && this.f78283b == jVar.f78283b && Intrinsics.areEqual(this.f78284c, jVar.f78284c);
    }

    public int hashCode() {
        String str = this.f78282a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f78283b) * 31;
        ArrayList<OneInstance> arrayList = this.f78284c;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "OneRoomInstance(calendarId=" + this.f78282a + ", instanceDay=" + this.f78283b + ", instances=" + this.f78284c + ")";
    }

    /* renamed from: a */
    public final String mo112396a() {
        return this.f78282a;
    }

    /* renamed from: b */
    public final int mo112397b() {
        return this.f78283b;
    }

    /* renamed from: c */
    public final ArrayList<OneInstance> mo112398c() {
        return this.f78284c;
    }

    public OneRoomInstance(String str, int i, ArrayList<OneInstance> arrayList) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(arrayList, "instances");
        this.f78282a = str;
        this.f78283b = i;
        this.f78284c = arrayList;
    }
}
