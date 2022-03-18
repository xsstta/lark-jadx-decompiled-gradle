package com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model;

import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomEquipment;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiRoomNode;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32064b;
import com.ss.android.lark.calendar.impl.features.meetingroom.helper.NeedApprovalType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0012\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0016R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cXD¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MultiLevelMeetingRoomModel;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "roomNode", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiRoomNode;", "approvalDisableType", "Lkotlin/Pair;", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/helper/NeedApprovalType;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiRoomNode;Lkotlin/Pair;)V", "getApprovalDisableType", "()Lkotlin/Pair;", "calendarResource", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "getCalendarResource", "()Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "capacity", "", "getCapacity", "()Ljava/lang/String;", "isValid", "()Z", "meetingRoomDesc", "getMeetingRoomDesc", "meetingRoomName", "getMeetingRoomName", "getRoomNode", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiRoomNode;", "viewType", "", "getViewType", "()I", "isContentSame", "diffable", "isItemSame", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.g */
public final class MultiLevelMeetingRoomModel implements BaseModel {

    /* renamed from: a */
    private final int f81845a = 7;

    /* renamed from: b */
    private final MultiRoomNode f81846b;

    /* renamed from: c */
    private final Pair<Boolean, NeedApprovalType> f81847c;

    /* renamed from: b */
    public boolean isContentSame(BaseModel baseModel) {
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel
    /* renamed from: a */
    public int mo116760a() {
        return this.f81845a;
    }

    /* renamed from: g */
    public final MultiRoomNode mo116811g() {
        return this.f81846b;
    }

    /* renamed from: c */
    public final CalendarResource mo116807c() {
        return this.f81846b.mo115847f();
    }

    /* renamed from: d */
    public final String mo116808d() {
        String str = mo116807c().name;
        if (str != null) {
            return str;
        }
        return "";
    }

    /* renamed from: f */
    public final String mo116810f() {
        return String.valueOf(mo116807c().capacity.intValue());
    }

    /* renamed from: b */
    public final boolean mo116805b() {
        if (!C32064b.m121943a(mo116807c()) || this.f81847c.getFirst().booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final String mo116809e() {
        boolean z;
        boolean z2;
        boolean z3;
        List<MeetingRoomEquipment> list = mo116807c().equipments;
        if (list == null) {
            return "";
        }
        List<MeetingRoomEquipment> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (T t : list) {
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
    public boolean isItemSame(BaseModel baseModel) {
        if (!(baseModel instanceof MultiLevelMeetingRoomModel)) {
            return false;
        }
        return Intrinsics.areEqual(this.f81846b.mo115847f().calendar_id, ((MultiLevelMeetingRoomModel) baseModel).f81846b.mo115847f().calendar_id);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.Pair<java.lang.Boolean, ? extends com.ss.android.lark.calendar.impl.features.meetingroom.helper.NeedApprovalType> */
    /* JADX WARN: Multi-variable type inference failed */
    public MultiLevelMeetingRoomModel(MultiRoomNode eVar, Pair<Boolean, ? extends NeedApprovalType> pair) {
        Intrinsics.checkParameterIsNotNull(eVar, "roomNode");
        Intrinsics.checkParameterIsNotNull(pair, "approvalDisableType");
        this.f81846b = eVar;
        this.f81847c = pair;
    }
}
