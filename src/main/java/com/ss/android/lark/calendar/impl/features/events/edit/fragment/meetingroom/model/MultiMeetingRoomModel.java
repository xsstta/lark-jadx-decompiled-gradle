package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model;

import com.bytedance.lark.pb.calendar.v1.MeetingRoomEquipment;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiRoomNode;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010&\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010(\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+H\u0016R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000eR\u0011\u0010\u001c\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006,"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MultiMeetingRoomModel;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ItemModel;", "roomNode", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiRoomNode;", "itemPosition", "", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiRoomNode;I)V", "calendarResource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "getCalendarResource", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "capacity", "", "getCapacity", "()Ljava/lang/String;", "isDisableApprovalMeetingRoom", "", "isDisableApprovalMeetingRoom$calendar_impl_release", "()Z", "setDisableApprovalMeetingRoom$calendar_impl_release", "(Z)V", "isFree", "getItemPosition", "()I", "setItemPosition", "(I)V", "meetingRoomDesc", "getMeetingRoomDesc", "meetingRoomName", "getMeetingRoomName", "getRoomNode", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiRoomNode;", "selectMode", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$ResourceSelectMode;", "getSelectMode$calendar_impl_release", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$ResourceSelectMode;", "setSelectMode$calendar_impl_release", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$ResourceSelectMode;)V", "isContentSame", "p0", "isItemSame", ShareHitPoint.f121869d, "typeFactory", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/type/ITypeFactory;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.b.k */
public final class MultiMeetingRoomModel implements ItemModel {

    /* renamed from: a */
    private IBuildingContract.ResourceSelectMode f80764a;

    /* renamed from: b */
    private boolean f80765b;

    /* renamed from: c */
    private final MultiRoomNode f80766c;

    /* renamed from: d */
    private int f80767d;

    /* renamed from: c */
    public final boolean mo115808c() {
        return this.f80765b;
    }

    /* renamed from: g */
    public final MultiRoomNode mo115812g() {
        return this.f80766c;
    }

    /* renamed from: b */
    public final boolean mo115806b() {
        if (mo115802a().getStatus() == CalendarResource.Status.FREE) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String mo115811f() {
        return String.valueOf(mo115802a().getCapacity());
    }

    /* renamed from: a */
    public final CalendarResource mo115802a() {
        CalendarResource a = C32514b.m124521a(this.f80766c.mo115847f());
        Intrinsics.checkExpressionValueIsNotNull(a, "ModelParserCalendar.getC…oomNode.calendarResource)");
        return a;
    }

    /* renamed from: d */
    public final String mo115809d() {
        String name = mo115802a().getName();
        if (name != null) {
            return name;
        }
        return "";
    }

    /* renamed from: e */
    public final String mo115810e() {
        boolean z;
        boolean z2;
        boolean z3;
        List<MeetingRoomEquipment> equipments = mo115802a().getEquipments();
        if (equipments == null) {
            return "";
        }
        List<MeetingRoomEquipment> list = equipments;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (T t : equipments) {
            String str = t.i18n_name;
            if (str == null || str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (sb.length() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    sb.append(" · ");
                }
                sb.append(t.i18n_name);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "equipmentStringBuilder.toString()");
        return sb2;
    }

    /* renamed from: a */
    public final void mo115803a(int i) {
        this.f80767d = i;
    }

    /* renamed from: a */
    public final void mo115804a(IBuildingContract.ResourceSelectMode resourceSelectMode) {
        Intrinsics.checkParameterIsNotNull(resourceSelectMode, "<set-?>");
        this.f80764a = resourceSelectMode;
    }

    /* renamed from: b */
    public boolean isContentSame(ItemModel dVar) {
        if (dVar instanceof MultiMeetingRoomModel) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ItemModel
    /* renamed from: a */
    public int mo115745a(ITypeFactory aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "typeFactory");
        return aVar.mo115886a(this);
    }

    /* renamed from: a */
    public boolean isItemSame(ItemModel dVar) {
        return Intrinsics.areEqual(dVar, this);
    }

    public MultiMeetingRoomModel(MultiRoomNode eVar, int i) {
        Intrinsics.checkParameterIsNotNull(eVar, "roomNode");
        this.f80766c = eVar;
        this.f80767d = i;
        this.f80764a = IBuildingContract.ResourceSelectMode.SINGLE;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiMeetingRoomModel(MultiRoomNode eVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i2 & 2) != 0 ? 0 : i);
    }
}
