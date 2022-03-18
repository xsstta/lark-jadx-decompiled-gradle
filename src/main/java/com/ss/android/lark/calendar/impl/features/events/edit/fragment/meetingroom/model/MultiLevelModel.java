package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model;

import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelNode;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\u0018\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MultiLevelModel;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ItemModel;", "levelNode", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "itemPosition", "", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;I)V", "getItemPosition", "()I", "setItemPosition", "(I)V", "getLevelNode", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "setLevelNode", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;)V", "selectMode", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$ResourceSelectMode;", "getSelectMode$calendar_impl_release", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$ResourceSelectMode;", "setSelectMode$calendar_impl_release", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$ResourceSelectMode;)V", "isContentSame", "", "p0", "isItemSame", ShareHitPoint.f121869d, "typeFactory", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/type/ITypeFactory;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.b.j */
public final class MultiLevelModel implements ItemModel {

    /* renamed from: a */
    private IBuildingContract.ResourceSelectMode f80761a;

    /* renamed from: b */
    private MultiLevelNode f80762b;

    /* renamed from: c */
    private int f80763c;

    /* renamed from: a */
    public final MultiLevelNode mo115797a() {
        return this.f80762b;
    }

    /* renamed from: a */
    public final void mo115798a(int i) {
        this.f80763c = i;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ItemModel
    /* renamed from: a */
    public int mo115745a(ITypeFactory aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "typeFactory");
        return aVar.mo115885a(this);
    }

    /* renamed from: a */
    public final void mo115799a(IBuildingContract.ResourceSelectMode resourceSelectMode) {
        Intrinsics.checkParameterIsNotNull(resourceSelectMode, "<set-?>");
        this.f80761a = resourceSelectMode;
    }

    /* renamed from: b */
    public boolean isContentSame(ItemModel dVar) {
        if (dVar instanceof MultiLevelModel) {
            return Intrinsics.areEqual(((MultiLevelModel) dVar).f80762b, this.f80762b);
        }
        return false;
    }

    /* renamed from: a */
    public boolean isItemSame(ItemModel dVar) {
        return Intrinsics.areEqual(dVar, this);
    }

    public MultiLevelModel(MultiLevelNode bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "levelNode");
        this.f80762b = bVar;
        this.f80763c = i;
        this.f80761a = IBuildingContract.ResourceSelectMode.SINGLE;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiLevelModel(MultiLevelNode bVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i2 & 2) != 0 ? 0 : i);
    }
}
