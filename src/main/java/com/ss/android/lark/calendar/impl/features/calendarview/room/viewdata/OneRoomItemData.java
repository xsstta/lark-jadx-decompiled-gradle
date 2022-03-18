package com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b!\b\b\u0018\u0000 72\u00020\u0001:\u00017B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0002\u0010\u0010J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Jk\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u00103\u001a\u00020\u00062\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\bHÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\f\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010!R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\"R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0012R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00068"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneRoomItemData;", "", "calendarId", "", "name", "isShowApproval", "", "capacity", "", "buildingName", "equipments", "itemType", "instanceDay", "roomInstance", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneInstance;", "(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;IILjava/util/List;)V", "getBuildingName", "()Ljava/lang/String;", "getCalendarId", "getCapacity", "()I", "doEntityResource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "doEntityResource$annotations", "()V", "getDoEntityResource", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "setDoEntityResource", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;)V", "getEquipments", "getInstanceDay", "setInstanceDay", "(I)V", "()Z", "getItemType", "getName", "getRoomInstance", "()Ljava/util/List;", "setRoomInstance", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.k */
public final class OneRoomItemData {

    /* renamed from: a */
    public static final Companion f78285a = new Companion(null);

    /* renamed from: b */
    private CalendarResource f78286b;

    /* renamed from: c */
    private final String f78287c;

    /* renamed from: d */
    private final String f78288d;

    /* renamed from: e */
    private final boolean f78289e;

    /* renamed from: f */
    private final int f78290f;

    /* renamed from: g */
    private final String f78291g;

    /* renamed from: h */
    private final String f78292h;

    /* renamed from: i */
    private final int f78293i;

    /* renamed from: j */
    private int f78294j;

    /* renamed from: k */
    private List<OneInstance> f78295k;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OneRoomItemData)) {
            return false;
        }
        OneRoomItemData kVar = (OneRoomItemData) obj;
        return Intrinsics.areEqual(this.f78287c, kVar.f78287c) && Intrinsics.areEqual(this.f78288d, kVar.f78288d) && this.f78289e == kVar.f78289e && this.f78290f == kVar.f78290f && Intrinsics.areEqual(this.f78291g, kVar.f78291g) && Intrinsics.areEqual(this.f78292h, kVar.f78292h) && this.f78293i == kVar.f78293i && this.f78294j == kVar.f78294j && Intrinsics.areEqual(this.f78295k, kVar.f78295k);
    }

    public int hashCode() {
        String str = this.f78287c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f78288d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.f78289e;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (((hashCode2 + i2) * 31) + this.f78290f) * 31;
        String str3 = this.f78291g;
        int hashCode3 = (i5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f78292h;
        int hashCode4 = (((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f78293i) * 31) + this.f78294j) * 31;
        List<OneInstance> list = this.f78295k;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "OneRoomItemData(calendarId=" + this.f78287c + ", name=" + this.f78288d + ", isShowApproval=" + this.f78289e + ", capacity=" + this.f78290f + ", buildingName=" + this.f78291g + ", equipments=" + this.f78292h + ", itemType=" + this.f78293i + ", instanceDay=" + this.f78294j + ", roomInstance=" + this.f78295k + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneRoomItemData$Companion;", "", "()V", "TYPE_MEETING_ROOM", "", "TYPE_PLACEHOLDER", "createEmpty", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneRoomItemData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.k$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final OneRoomItemData mo112418a() {
            return new OneRoomItemData("", "", false, 0, "", "", 0, 0, null, 384, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final CalendarResource mo112402a() {
        return this.f78286b;
    }

    /* renamed from: b */
    public final String mo112406b() {
        return this.f78287c;
    }

    /* renamed from: c */
    public final String mo112407c() {
        return this.f78288d;
    }

    /* renamed from: d */
    public final boolean mo112408d() {
        return this.f78289e;
    }

    /* renamed from: e */
    public final int mo112409e() {
        return this.f78290f;
    }

    /* renamed from: f */
    public final String mo112411f() {
        return this.f78291g;
    }

    /* renamed from: g */
    public final String mo112412g() {
        return this.f78292h;
    }

    /* renamed from: h */
    public final int mo112413h() {
        return this.f78293i;
    }

    /* renamed from: i */
    public final int mo112415i() {
        return this.f78294j;
    }

    /* renamed from: j */
    public final List<OneInstance> mo112416j() {
        return this.f78295k;
    }

    /* renamed from: a */
    public final void mo112403a(int i) {
        this.f78294j = i;
    }

    /* renamed from: a */
    public final void mo112404a(CalendarResource calendarResource) {
        this.f78286b = calendarResource;
    }

    /* renamed from: a */
    public final void mo112405a(List<OneInstance> list) {
        this.f78295k = list;
    }

    public OneRoomItemData(String str, String str2, boolean z, int i, String str3, String str4, int i2, int i3, List<OneInstance> list) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "buildingName");
        Intrinsics.checkParameterIsNotNull(str4, "equipments");
        this.f78287c = str;
        this.f78288d = str2;
        this.f78289e = z;
        this.f78290f = i;
        this.f78291g = str3;
        this.f78292h = str4;
        this.f78293i = i2;
        this.f78294j = i3;
        this.f78295k = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OneRoomItemData(java.lang.String r13, java.lang.String r14, boolean r15, int r16, java.lang.String r17, java.lang.String r18, int r19, int r20, java.util.List r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0009
            r1 = 1
            r9 = 1
            goto L_0x000b
        L_0x0009:
            r9 = r19
        L_0x000b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0012
            r1 = 0
            r10 = 0
            goto L_0x0014
        L_0x0012:
            r10 = r20
        L_0x0014:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x001d
            r0 = 0
            java.util.List r0 = (java.util.List) r0
            r11 = r0
            goto L_0x001f
        L_0x001d:
            r11 = r21
        L_0x001f:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.OneRoomItemData.<init>(java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.String, int, int, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
