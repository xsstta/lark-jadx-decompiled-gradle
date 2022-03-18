package com.ss.android.lark.calendar.impl.features.meetingroom.instance.viewdata;

import android.text.TextUtils;
import com.bytedance.lark.pb.calendar.v1.CalendarEvent;
import com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee;
import com.bytedance.lark.pb.calendar.v1.EventCreator;
import com.bytedance.lark.pb.calendar.v1.ResourceContactPerson;
import com.bytedance.lark.pb.calendar.v1.RoomViewInstance;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.EditDateHelper;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.CalendarWorkHourUtil;
import com.ss.android.lark.calendar.impl.utils.SchemaHelper;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u0015\u001a\u00020\nH\u0002J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/viewdata/InstanceViewDataImpl;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/viewdata/InstanceViewData;", "layerDay", "", "buildingName", "", "roomResource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "pbRoomInstances", "", "Lcom/bytedance/lark/pb/calendar/v1/RoomViewInstance;", "(ILjava/lang/String;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;Ljava/util/List;)V", "instanceData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/viewdata/OneInstanceViewData;", "getInstanceData", "()Ljava/util/List;", "setInstanceData", "(Ljava/util/List;)V", "getLayerDay", "()I", "getSummary", "roomInstance", "deltaMinute", "getTitleBackgroundColor", "Lkotlin/Pair;", "parsePbRoomInstance", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.b.b */
public final class InstanceViewDataImpl implements InstanceViewData {

    /* renamed from: b */
    private List<OneInstanceViewData> f82079b;

    /* renamed from: c */
    private final int f82080c;

    /* renamed from: d */
    private final String f82081d;

    /* renamed from: e */
    private final CalendarResource f82082e;

    /* renamed from: f */
    private final List<RoomViewInstance> f82083f;

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.instance.viewdata.InstanceViewData
    /* renamed from: a */
    public int mo117168a() {
        return this.f82080c;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.instance.viewdata.InstanceViewData
    /* renamed from: b */
    public List<OneInstanceViewData> mo117169b() {
        return this.f82079b;
    }

    /* renamed from: a */
    public void mo117170a(List<OneInstanceViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f82079b = list;
    }

    /* renamed from: a */
    private final Pair<Integer, Integer> m122120a(RoomViewInstance roomViewInstance) {
        if (CalendarEvent.Category.RESOURCE_REQUISITION == roomViewInstance.category || CalendarEvent.Category.RESOURCE_STRATEGY == roomViewInstance.category) {
            return new Pair<>(Integer.valueOf(UIHelper.getColor(R.color.ud_N600)), Integer.valueOf(UIHelper.getColor(R.color.ud_N300)));
        }
        if (roomViewInstance.current_user_accessibility == RoomViewInstance.UserAccessibility.EVENT_VISIBILE || roomViewInstance.current_user_accessibility == RoomViewInstance.UserAccessibility.JOINED) {
            return new Pair<>(Integer.valueOf(UIHelper.getColor(R.color.ud_B600)), Integer.valueOf(UIHelper.getColor(R.color.ud_B100)));
        }
        return new Pair<>(Integer.valueOf(UIHelper.getColor(R.color.ud_N600)), Integer.valueOf(UIHelper.getColor(R.color.ud_N300)));
    }

    /* renamed from: b */
    private final List<OneInstanceViewData> m122121b(List<RoomViewInstance> list) {
        boolean z;
        InstanceViewDataImpl bVar = this;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        List<RoomViewInstance> filterNotNull = CollectionsKt.filterNotNull(list);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(filterNotNull, 10));
        for (RoomViewInstance roomViewInstance : filterNotNull) {
            Pair<Integer, Integer> a = bVar.m122120a(roomViewInstance);
            int max = Math.max(roomViewInstance.start_minute.intValue() + ((roomViewInstance.start_day.intValue() - mo117168a()) * CalendarWorkHourUtil.f83805a), 0);
            int min = Math.min(roomViewInstance.end_minute.intValue() + ((roomViewInstance.end_day.intValue() - mo117168a()) * CalendarWorkHourUtil.f83805a), (int) CalendarWorkHourUtil.f83805a);
            EventMeetingRoomData a2 = EditDateHelper.f79932a.mo114615a(bVar.f82082e, bVar.f82081d);
            int i = min - max;
            if (roomViewInstance.reservation_status == CalendarEventAttendee.Status.NEEDS_ACTION) {
                z = true;
            } else {
                z = false;
            }
            String str = roomViewInstance.current_user_accessible_calendar_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "it.current_user_accessible_calendar_id");
            String str2 = roomViewInstance.event_key;
            Intrinsics.checkExpressionValueIsNotNull(str2, "it.event_key");
            Long l = roomViewInstance.original_time;
            Intrinsics.checkExpressionValueIsNotNull(l, "it.original_time");
            arrayList.add(new OneInstanceViewData(str, str2, l.longValue(), bVar.m122119a(roomViewInstance, i), a.getFirst().intValue(), max, min, a.getSecond().intValue(), z, roomViewInstance, a2, null, 2048, null));
            bVar = this;
        }
        return arrayList;
    }

    /* renamed from: a */
    private final String m122119a(RoomViewInstance roomViewInstance, int i) {
        EventCreator eventCreator;
        String str;
        EventCreator eventCreator2;
        String str2;
        String str3;
        EventCreator eventCreator3;
        String str4;
        String str5 = null;
        CalendarSchemaCollection calendarSchemaCollection = null;
        if (i < 30) {
            return null;
        }
        if (roomViewInstance.reservation_status == CalendarEventAttendee.Status.NEEDS_ACTION) {
            if (TextUtils.isEmpty(roomViewInstance.summary)) {
                str4 = C32634ae.m125182b(R.string.Calendar_Common_NoTitle);
            } else {
                str4 = roomViewInstance.summary;
            }
            SchemaHelper.Companion aVar = SchemaHelper.f83746a;
            CalendarResource calendarResource = this.f82082e;
            if (calendarResource != null) {
                calendarSchemaCollection = calendarResource.getResourceSchema();
            }
            if (aVar.mo120312a(calendarSchemaCollection)) {
                return C32634ae.m125182b(R.string.Calendar_Approval_InReview) + ' ' + str4;
            }
            return C32634ae.m125182b(R.string.Calendar_Detail_ReservingMobile) + ' ' + str4;
        } else if (CalendarEvent.Category.RESOURCE_REQUISITION == roomViewInstance.category) {
            return C32634ae.m125182b(R.string.Calendar_Edit_MeetingRoomInactiveCantReserve);
        } else {
            if (CalendarEvent.Category.RESOURCE_STRATEGY == roomViewInstance.category) {
                return C32634ae.m125182b(R.string.Calendar_MeetingView_MeetingRoomCantReservePeriod);
            }
            if (roomViewInstance.current_user_accessibility == RoomViewInstance.UserAccessibility.LIMITED) {
                ResourceContactPerson resourceContactPerson = roomViewInstance.resource_contact_person;
                if (resourceContactPerson == null || (eventCreator3 = resourceContactPerson.contact_person) == null) {
                    str3 = null;
                } else {
                    str3 = eventCreator3.name;
                }
                if (str3 != null) {
                    if (str3 != null) {
                        str5 = StringsKt.trim((CharSequence) str3).toString();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                }
                if (TextUtils.isEmpty(str5)) {
                    return C32634ae.m125182b(R.string.Calendar_Edit_MeetingRoomReserved);
                }
                return UIHelper.mustacheFormat((int) R.string.Calendar_Edit_ReservedByNane, "name", str3);
            }
            String str6 = "";
            if (TextUtils.isEmpty(roomViewInstance.summary)) {
                StringBuilder sb = new StringBuilder();
                sb.append(C32634ae.m125182b(R.string.Calendar_Common_NoTitle));
                sb.append(' ');
                ResourceContactPerson resourceContactPerson2 = roomViewInstance.resource_contact_person;
                if (!(resourceContactPerson2 == null || (eventCreator2 = resourceContactPerson2.contact_person) == null || (str2 = eventCreator2.name) == null)) {
                    str6 = str2;
                }
                sb.append(str6);
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(roomViewInstance.summary);
            sb2.append(' ');
            ResourceContactPerson resourceContactPerson3 = roomViewInstance.resource_contact_person;
            if (!(resourceContactPerson3 == null || (eventCreator = resourceContactPerson3.contact_person) == null || (str = eventCreator.name) == null)) {
                str6 = str;
            }
            sb2.append(str6);
            return sb2.toString();
        }
    }

    public InstanceViewDataImpl(int i, String str, CalendarResource calendarResource, List<RoomViewInstance> list) {
        Intrinsics.checkParameterIsNotNull(str, "buildingName");
        this.f82080c = i;
        this.f82081d = str;
        this.f82082e = calendarResource;
        this.f82083f = list;
        this.f82079b = m122121b(list);
    }
}
