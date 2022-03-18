package com.ss.android.lark.calendar.impl.features.events.edit.data;

import com.bytedance.lark.pb.calendar.v1.GetUnusableMeetingRoomsResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BU\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0019\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003Jc\u0010*\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\bHÖ\u0001R\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\r\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00060"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/data/ResourceExpandFragmentData;", "", "resourceList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "Lkotlin/collections/ArrayList;", "unusableMeetingRoom", "", "", "Lcom/bytedance/lark/pb/calendar/v1/GetUnusableMeetingRoomsResponse$UnusableReasons;", "needShowDisableFrom", "", "mIsEditable", "isExternalEvent", "instanceEndTime", "", "(Ljava/util/ArrayList;Ljava/util/Map;ZZZJ)V", "getInstanceEndTime", "()J", "setInstanceEndTime", "(J)V", "()Z", "setExternalEvent", "(Z)V", "getMIsEditable", "setMIsEditable", "getNeedShowDisableFrom", "setNeedShowDisableFrom", "getResourceList", "()Ljava/util/ArrayList;", "setResourceList", "(Ljava/util/ArrayList;)V", "getUnusableMeetingRoom", "()Ljava/util/Map;", "setUnusableMeetingRoom", "(Ljava/util/Map;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.data.h */
public final class ResourceExpandFragmentData {

    /* renamed from: a */
    private ArrayList<CalendarEventAttendee> f80217a;

    /* renamed from: b */
    private Map<String, GetUnusableMeetingRoomsResponse.UnusableReasons> f80218b;

    /* renamed from: c */
    private boolean f80219c;

    /* renamed from: d */
    private boolean f80220d;

    /* renamed from: e */
    private boolean f80221e;

    /* renamed from: f */
    private long f80222f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceExpandFragmentData)) {
            return false;
        }
        ResourceExpandFragmentData hVar = (ResourceExpandFragmentData) obj;
        return Intrinsics.areEqual(this.f80217a, hVar.f80217a) && Intrinsics.areEqual(this.f80218b, hVar.f80218b) && this.f80219c == hVar.f80219c && this.f80220d == hVar.f80220d && this.f80221e == hVar.f80221e && this.f80222f == hVar.f80222f;
    }

    public int hashCode() {
        ArrayList<CalendarEventAttendee> arrayList = this.f80217a;
        int i = 0;
        int hashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        Map<String, GetUnusableMeetingRoomsResponse.UnusableReasons> map = this.f80218b;
        if (map != null) {
            i = map.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f80219c;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.f80220d;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.f80221e;
        if (!z3) {
            i3 = z3 ? 1 : 0;
        }
        long j = this.f80222f;
        return ((i11 + i3) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "ResourceExpandFragmentData(resourceList=" + this.f80217a + ", unusableMeetingRoom=" + this.f80218b + ", needShowDisableFrom=" + this.f80219c + ", mIsEditable=" + this.f80220d + ", isExternalEvent=" + this.f80221e + ", instanceEndTime=" + this.f80222f + ")";
    }

    /* renamed from: a */
    public final ArrayList<CalendarEventAttendee> mo115119a() {
        return this.f80217a;
    }

    /* renamed from: b */
    public final Map<String, GetUnusableMeetingRoomsResponse.UnusableReasons> mo115120b() {
        return this.f80218b;
    }

    /* renamed from: c */
    public final boolean mo115121c() {
        return this.f80219c;
    }

    /* renamed from: d */
    public final boolean mo115122d() {
        return this.f80220d;
    }

    /* renamed from: e */
    public final boolean mo115123e() {
        return this.f80221e;
    }

    /* renamed from: f */
    public final long mo115125f() {
        return this.f80222f;
    }

    public ResourceExpandFragmentData(ArrayList<CalendarEventAttendee> arrayList, Map<String, GetUnusableMeetingRoomsResponse.UnusableReasons> map, boolean z, boolean z2, boolean z3, long j) {
        Intrinsics.checkParameterIsNotNull(arrayList, "resourceList");
        this.f80217a = arrayList;
        this.f80218b = map;
        this.f80219c = z;
        this.f80220d = z2;
        this.f80221e = z3;
        this.f80222f = j;
    }
}
