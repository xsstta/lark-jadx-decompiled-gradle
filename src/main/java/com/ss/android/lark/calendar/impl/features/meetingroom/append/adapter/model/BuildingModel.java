package com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model;

import com.bytedance.lark.pb.calendar.v1.CalendarBuilding;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J;\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010*\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\u0012\u0010.\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u00100\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u0016J\t\u00101\u001a\u00020\rHÖ\u0001R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u0005XD¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019¨\u00062"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BuildingModel;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "calendarBuilding", "Lcom/bytedance/lark/pb/calendar/v1/CalendarBuilding;", "selectModel", "", "pageIndex", "isExpanded", "", "selectState", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "(Lcom/bytedance/lark/pb/calendar/v1/CalendarBuilding;IIZLcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;)V", "buildingId", "", "getBuildingId", "()Ljava/lang/String;", "getCalendarBuilding", "()Lcom/bytedance/lark/pb/calendar/v1/CalendarBuilding;", "()Z", "setExpanded", "(Z)V", "isMultiSelectMode", "name", "getName", "getPageIndex", "()I", "setPageIndex", "(I)V", "getSelectModel", "setSelectModel", "getSelectState", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "setSelectState", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;)V", "viewType", "getViewType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "isContentSame", "diffable", "isItemSame", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.a */
public final class BuildingModel implements BaseModel {

    /* renamed from: a */
    private final int f81832a;

    /* renamed from: b */
    private final CalendarBuilding f81833b;

    /* renamed from: c */
    private int f81834c;

    /* renamed from: d */
    private int f81835d;

    /* renamed from: e */
    private boolean f81836e;

    /* renamed from: f */
    private IBuildingContract.SelectState f81837f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuildingModel)) {
            return false;
        }
        BuildingModel aVar = (BuildingModel) obj;
        return Intrinsics.areEqual(this.f81833b, aVar.f81833b) && this.f81834c == aVar.f81834c && this.f81835d == aVar.f81835d && this.f81836e == aVar.f81836e && Intrinsics.areEqual(this.f81837f, aVar.f81837f);
    }

    public int hashCode() {
        CalendarBuilding calendarBuilding = this.f81833b;
        int i = 0;
        int hashCode = (((((calendarBuilding != null ? calendarBuilding.hashCode() : 0) * 31) + this.f81834c) * 31) + this.f81835d) * 31;
        boolean z = this.f81836e;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        IBuildingContract.SelectState selectState = this.f81837f;
        if (selectState != null) {
            i = selectState.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        return "BuildingModel(calendarBuilding=" + this.f81833b + ", selectModel=" + this.f81834c + ", pageIndex=" + this.f81835d + ", isExpanded=" + this.f81836e + ", selectState=" + this.f81837f + ")";
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel
    /* renamed from: a */
    public int mo116760a() {
        return this.f81832a;
    }

    /* renamed from: e */
    public final CalendarBuilding mo116782e() {
        return this.f81833b;
    }

    /* renamed from: f */
    public final int mo116784f() {
        return this.f81835d;
    }

    /* renamed from: g */
    public final boolean mo116785g() {
        return this.f81836e;
    }

    /* renamed from: h */
    public final IBuildingContract.SelectState mo116786h() {
        return this.f81837f;
    }

    /* renamed from: d */
    public final boolean mo116781d() {
        if (this.f81834c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final String mo116778b() {
        String str = this.f81833b.name;
        if (str != null) {
            return str;
        }
        return "";
    }

    /* renamed from: c */
    public final String mo116780c() {
        String str = this.f81833b.id;
        if (str != null) {
            return str;
        }
        return "";
    }

    /* renamed from: a */
    public final void mo116776a(IBuildingContract.SelectState selectState) {
        Intrinsics.checkParameterIsNotNull(selectState, "<set-?>");
        this.f81837f = selectState;
    }

    /* renamed from: a */
    public boolean isItemSame(BaseModel baseModel) {
        if (!(baseModel instanceof BuildingModel)) {
            return false;
        }
        return Intrinsics.areEqual(this.f81833b.id, ((BuildingModel) baseModel).f81833b.id);
    }

    /* renamed from: b */
    public boolean isContentSame(BaseModel baseModel) {
        if ((baseModel instanceof BuildingModel) && Intrinsics.areEqual(this.f81833b.toString(), ((BuildingModel) baseModel).f81833b.toString()) && Intrinsics.areEqual(this, baseModel)) {
            return true;
        }
        return false;
    }

    public BuildingModel(CalendarBuilding calendarBuilding, int i, int i2, boolean z, IBuildingContract.SelectState selectState) {
        Intrinsics.checkParameterIsNotNull(calendarBuilding, "calendarBuilding");
        Intrinsics.checkParameterIsNotNull(selectState, "selectState");
        this.f81833b = calendarBuilding;
        this.f81834c = i;
        this.f81835d = i2;
        this.f81836e = z;
        this.f81837f = selectState;
        this.f81832a = 1;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BuildingModel(com.bytedance.lark.pb.calendar.v1.CalendarBuilding r8, int r9, int r10, boolean r11, com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.SelectState r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r7 = this;
            r14 = r13 & 4
            r0 = 0
            if (r14 == 0) goto L_0x0007
            r4 = 0
            goto L_0x0008
        L_0x0007:
            r4 = r10
        L_0x0008:
            r10 = r13 & 8
            if (r10 == 0) goto L_0x000e
            r5 = 0
            goto L_0x000f
        L_0x000e:
            r5 = r11
        L_0x000f:
            r10 = r13 & 16
            if (r10 == 0) goto L_0x0015
            com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract$SelectState r12 = com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.SelectState.NONE
        L_0x0015:
            r6 = r12
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BuildingModel.<init>(com.bytedance.lark.pb.calendar.v1.CalendarBuilding, int, int, boolean, com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract$SelectState, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
