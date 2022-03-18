package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model;

import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J3\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010,\u001a\u00020\u00052\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\b\u0010/\u001a\u00020\u0007H\u0016J\u0012\u00100\u001a\u00020\u00052\b\u00101\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u00102\u001a\u00020\u00052\b\u00101\u001a\u0004\u0018\u00010\u0001H\u0016J\t\u00103\u001a\u000204HÖ\u0001J\u0010\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u000207H\u0016R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00068"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomBuildingModel;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ItemModel;", "calendarBuilding", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "isExpand", "", "pageIndex", "", "itemPosition", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;ZII)V", "buildingName", "", "getBuildingName", "()Ljava/lang/CharSequence;", "getCalendarBuilding", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "setCalendarBuilding", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;)V", "()Z", "setExpand", "(Z)V", "getItemPosition", "()I", "setItemPosition", "(I)V", "getPageIndex", "setPageIndex", "selectMode", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$ResourceSelectMode;", "getSelectMode$calendar_impl_release", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$ResourceSelectMode;", "setSelectMode$calendar_impl_release", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$ResourceSelectMode;)V", "selectState", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "getSelectState$calendar_impl_release", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "setSelectState$calendar_impl_release", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "isContentSame", "diffable", "isItemSame", "toString", "", ShareHitPoint.f121869d, "typeFactory", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/type/ITypeFactory;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.b.h */
public final class MeetingRoomBuildingModel implements ItemModel {

    /* renamed from: a */
    private IBuildingContract.ResourceSelectMode f80747a;

    /* renamed from: b */
    private IBuildingContract.SelectState f80748b;

    /* renamed from: c */
    private CalendarBuilding f80749c;

    /* renamed from: d */
    private boolean f80750d;

    /* renamed from: e */
    private int f80751e;

    /* renamed from: f */
    private int f80752f;

    public String toString() {
        return "MeetingRoomBuildingModel(calendarBuilding=" + this.f80749c + ", isExpand=" + this.f80750d + ", pageIndex=" + this.f80751e + ", itemPosition=" + this.f80752f + ")";
    }

    /* renamed from: b */
    public final IBuildingContract.ResourceSelectMode mo115767b() {
        return this.f80747a;
    }

    /* renamed from: c */
    public final IBuildingContract.SelectState mo115770c() {
        return this.f80748b;
    }

    /* renamed from: d */
    public final CalendarBuilding mo115771d() {
        return this.f80749c;
    }

    /* renamed from: e */
    public final boolean mo115772e() {
        return this.f80750d;
    }

    /* renamed from: f */
    public final int mo115774f() {
        return this.f80751e;
    }

    /* renamed from: g */
    public final int mo115775g() {
        return this.f80752f;
    }

    /* renamed from: a */
    public final CharSequence mo115761a() {
        String str;
        CalendarBuilding calendarBuilding = this.f80749c;
        if (calendarBuilding == null || (str = calendarBuilding.getName()) == null) {
            str = "";
        }
        return str;
    }

    public int hashCode() {
        String str;
        CalendarBuilding calendarBuilding = this.f80749c;
        if (calendarBuilding != null) {
            str = calendarBuilding.getId();
        } else {
            str = null;
        }
        return Intrinsics.stringPlus(str, String.valueOf(this.f80751e)).hashCode();
    }

    /* renamed from: a */
    public final void mo115762a(int i) {
        this.f80751e = i;
    }

    /* renamed from: a */
    public final void mo115763a(IBuildingContract.ResourceSelectMode resourceSelectMode) {
        Intrinsics.checkParameterIsNotNull(resourceSelectMode, "<set-?>");
        this.f80747a = resourceSelectMode;
    }

    /* renamed from: b */
    public final void mo115768b(int i) {
        this.f80752f = i;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ItemModel
    /* renamed from: a */
    public int mo115745a(ITypeFactory aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "typeFactory");
        return aVar.mo115883a(this);
    }

    /* renamed from: a */
    public final void mo115764a(IBuildingContract.SelectState selectState) {
        Intrinsics.checkParameterIsNotNull(selectState, "<set-?>");
        this.f80748b = selectState;
    }

    /* renamed from: b */
    public boolean isContentSame(ItemModel dVar) {
        CalendarBuilding calendarBuilding;
        String str;
        if (!(dVar instanceof MeetingRoomBuildingModel) || (calendarBuilding = this.f80749c) == null) {
            return false;
        }
        String str2 = null;
        if (calendarBuilding != null) {
            str = calendarBuilding.getId();
        } else {
            str = null;
        }
        MeetingRoomBuildingModel hVar = (MeetingRoomBuildingModel) dVar;
        CalendarBuilding calendarBuilding2 = hVar.f80749c;
        if (calendarBuilding2 != null) {
            str2 = calendarBuilding2.getId();
        }
        if (Intrinsics.areEqual(str, str2) && this.f80751e == hVar.f80751e && this.f80750d == hVar.f80750d) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        CalendarBuilding calendarBuilding = this.f80749c;
        String str3 = null;
        if (calendarBuilding != null) {
            str = calendarBuilding.getId();
        } else {
            str = null;
        }
        if (str == null) {
            return false;
        }
        if (!(obj instanceof MeetingRoomBuildingModel)) {
            return super.equals(obj);
        }
        CalendarBuilding calendarBuilding2 = this.f80749c;
        if (calendarBuilding2 != null) {
            str2 = calendarBuilding2.getId();
        } else {
            str2 = null;
        }
        MeetingRoomBuildingModel hVar = (MeetingRoomBuildingModel) obj;
        CalendarBuilding calendarBuilding3 = hVar.f80749c;
        if (calendarBuilding3 != null) {
            str3 = calendarBuilding3.getId();
        }
        if (!Intrinsics.areEqual(str2, str3) || this.f80751e != hVar.f80751e) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo115765a(boolean z) {
        this.f80750d = z;
    }

    /* renamed from: a */
    public boolean isItemSame(ItemModel dVar) {
        return Intrinsics.areEqual(this, dVar);
    }

    public MeetingRoomBuildingModel(CalendarBuilding calendarBuilding, boolean z, int i, int i2) {
        this.f80749c = calendarBuilding;
        this.f80750d = z;
        this.f80751e = i;
        this.f80752f = i2;
        this.f80747a = IBuildingContract.ResourceSelectMode.SINGLE;
        this.f80748b = IBuildingContract.SelectState.NONE;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MeetingRoomBuildingModel(CalendarBuilding calendarBuilding, boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(calendarBuilding, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
