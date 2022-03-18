package com.ss.android.lark.calendar.impl.features.events.edit.part;

import com.bytedance.lark.pb.calendar.v1.LevelRelatedInfo;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.IEditContract;
import com.ss.android.lark.calendar.impl.features.events.edit.data.BuildingFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.MeetingRoomApprovalHelper;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.EventData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.RequestResourceData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.ResourceAppendFragmentData;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32060a;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32066d;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32068f;
import com.ss.android.lark.calendar.impl.features.meetingroom.helper.NeedApprovalType;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema;
import com.ss.android.lark.calendar.impl.utils.SchemaHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010+\u001a\u00020,2\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fJ\u000e\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u000bJ.\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020%2\u0006\u00106\u001a\u0002032\u0006\u00107\u001a\u00020\u0012J.\u00108\u001a\u0002092\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020%2\u0006\u00106\u001a\u0002032\u0006\u00107\u001a\u00020\u0012J&\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u00107\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u0012J\u0016\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fJ\u0018\u0010=\u001a\u0004\u0018\u00010>2\u0006\u00107\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u0012J\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000b0@J\u0006\u0010A\u001a\u00020\u0012J\u001e\u0010B\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010D\u0012\u0006\u0012\u0004\u0018\u0001030C2\u0006\u0010E\u001a\u000203J\u001e\u0010F\u001a\u00020\u00122\u0016\u0010G\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fJ\u001e\u0010H\u001a\u00020,2\u0016\u0010I\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fJ\u0016\u0010J\u001a\u00020,2\u0006\u0010K\u001a\u00020%2\u0006\u0010L\u001a\u00020MR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u000e¢\u0006\u0002\n\u0000R*\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R*\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\nj\b\u0012\u0004\u0012\u00020\u001c`\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R*\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020 0\nj\b\u0012\u0004\u0012\u00020 `\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R&\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006N"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditMeetingRoomPart;", "", "()V", "buildingsResultType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$RequestBuildingResultType;", "getBuildingsResultType$calendar_impl_release", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$RequestBuildingResultType;", "setBuildingsResultType$calendar_impl_release", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$RequestBuildingResultType;)V", "chosenMeetingRoomList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "Lkotlin/collections/ArrayList;", "getChosenMeetingRoomList$calendar_impl_release", "()Ljava/util/ArrayList;", "setChosenMeetingRoomList$calendar_impl_release", "(Ljava/util/ArrayList;)V", "isSaveInterceptedByForm", "", "isSaveInterceptedByForm$calendar_impl_release", "()Z", "setSaveInterceptedByForm$calendar_impl_release", "(Z)V", "mEditMeetingRooms", "mOriginApprovalMeetingRooms", "getMOriginApprovalMeetingRooms$calendar_impl_release", "setMOriginApprovalMeetingRooms$calendar_impl_release", "meetingRoomBuildings", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "getMeetingRoomBuildings$calendar_impl_release", "setMeetingRoomBuildings$calendar_impl_release", "pbMeetingRoomBuildings", "Lcom/bytedance/lark/pb/calendar/v1/CalendarBuilding;", "getPbMeetingRoomBuildings$calendar_impl_release", "setPbMeetingRoomBuildings$calendar_impl_release", "pbMultiLevelData", "", "", "Lcom/bytedance/lark/pb/calendar/v1/LevelRelatedInfo;", "getPbMultiLevelData$calendar_impl_release", "()Ljava/util/Map;", "setPbMultiLevelData$calendar_impl_release", "(Ljava/util/Map;)V", "createChosenMeetingRoomsForEdit", "", "meetingRooms", "deleteMeetingRoom", "meetingRoom", "getAppendResourceFragmentData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceAppendFragmentData;", "startTime", "", "endTime", "rRule", "originalTime", "isEditEvent", "getBuildingFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/BuildingFragmentData;", "getCheckReverseStateMeetingRoom", "editAffectReverseRoom", "getMeetingRoomContainerList", "getMeetingRoomLimitData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/MeetingRoomLimitData;", "getSubmitMeetingRoom", "", "hasChosenMeetingRoom", "ifHasMeetingRoomApproval", "Lkotlin/Pair;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/helper/NeedApprovalType;", "eventDuration", "isModifyAfterAddMeetingRoom", "meetingRoomList", "mergeChosenMeetingRoomList", "newList", "updateMtroomScheduleData", "calendarId", "mtRoomSchedule", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.part.c */
public final class EditMeetingRoomPart {

    /* renamed from: a */
    private ArrayList<CalendarEventAttendee> f81293a = new ArrayList<>();

    /* renamed from: b */
    private IEditContract.RequestBuildingResultType f81294b = IEditContract.RequestBuildingResultType.NO_RESULT;

    /* renamed from: c */
    private ArrayList<CalendarBuilding> f81295c = new ArrayList<>();

    /* renamed from: d */
    private ArrayList<com.bytedance.lark.pb.calendar.v1.CalendarBuilding> f81296d = new ArrayList<>();

    /* renamed from: e */
    private ArrayList<CalendarEventAttendee> f81297e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<CalendarEventAttendee> f81298f = new ArrayList<>();

    /* renamed from: g */
    private boolean f81299g;

    /* renamed from: h */
    private Map<String, LevelRelatedInfo> f81300h = MapsKt.emptyMap();

    /* renamed from: a */
    public final ArrayList<CalendarEventAttendee> mo116277a() {
        return this.f81293a;
    }

    /* renamed from: b */
    public final boolean mo116289b() {
        return this.f81299g;
    }

    /* renamed from: d */
    public final ArrayList<CalendarEventAttendee> mo116292d() {
        return new ArrayList<>(this.f81293a);
    }

    /* renamed from: c */
    public final List<CalendarEventAttendee> mo116290c() {
        ArrayList arrayList = new ArrayList(this.f81293a);
        if (CollectionUtils.isNotEmpty(this.f81297e)) {
            Iterator<CalendarEventAttendee> it = this.f81297e.iterator();
            while (it.hasNext()) {
                CalendarEventAttendee next = it.next();
                if (!arrayList.contains(next)) {
                    Intrinsics.checkExpressionValueIsNotNull(next, "attendee");
                    next.setStatus(CalendarEventAttendee.Status.REMOVED);
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo116280a(IEditContract.RequestBuildingResultType requestBuildingResultType) {
        Intrinsics.checkParameterIsNotNull(requestBuildingResultType, "<set-?>");
        this.f81294b = requestBuildingResultType;
    }

    /* renamed from: b */
    public final void mo116288b(ArrayList<com.bytedance.lark.pb.calendar.v1.CalendarBuilding> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.f81296d = arrayList;
    }

    /* renamed from: a */
    public final void mo116282a(ArrayList<CalendarBuilding> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.f81295c = arrayList;
    }

    /* renamed from: a */
    public final void mo116283a(Map<String, LevelRelatedInfo> map) {
        Intrinsics.checkParameterIsNotNull(map, "<set-?>");
        this.f81300h = map;
    }

    /* renamed from: c */
    public final boolean mo116291c(ArrayList<CalendarEventAttendee> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "meetingRoomList");
        boolean z = false;
        for (T t : arrayList) {
            if (!this.f81293a.contains(t)) {
                this.f81293a.add(t);
                z = true;
            } else {
                ListIterator<CalendarEventAttendee> listIterator = this.f81293a.listIterator();
                Intrinsics.checkExpressionValueIsNotNull(listIterator, "chosenMeetingRoomList.listIterator()");
                while (listIterator.hasNext()) {
                    CalendarEventAttendee next = listIterator.next();
                    Intrinsics.checkExpressionValueIsNotNull(next, "iterator.next()");
                    if (Intrinsics.areEqual(t, next)) {
                        listIterator.remove();
                        listIterator.add(t);
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: d */
    public final void mo116293d(ArrayList<CalendarEventAttendee> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "meetingRooms");
        this.f81297e = arrayList;
        this.f81293a.clear();
        Iterator<CalendarEventAttendee> it = arrayList.iterator();
        while (it.hasNext()) {
            CalendarEventAttendee next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "attendee");
            if (next.getStatus() != CalendarEventAttendee.Status.REMOVED) {
                this.f81293a.add(new CalendarEventAttendee(next));
                if (SchemaHelper.f83746a.mo120312a(next.getSchemaCollection()) && MeetingRoomApprovalHelper.f79933a.mo114618b(next.getSchemaExtraData()) && next.getStatus() != CalendarEventAttendee.Status.DECLINE) {
                    this.f81298f.add(next);
                }
            }
        }
    }

    /* renamed from: a */
    public final Pair<NeedApprovalType, Long> mo116279a(long j) {
        List<EntitySchema> uiItems;
        boolean z;
        SchemaExtraData.ApprovalTrigger a;
        Iterator<CalendarEventAttendee> it = this.f81293a.iterator();
        long j2 = Long.MAX_VALUE;
        while (it.hasNext()) {
            CalendarEventAttendee next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "meetingRoomData");
            com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData = next.getSchemaExtraData();
            Long l = (schemaExtraData == null || (a = MeetingRoomApprovalHelper.f79933a.mo114616a(schemaExtraData)) == null) ? null : a.duration_trigger;
            CalendarSchemaCollection schemaCollection = next.getSchemaCollection();
            if (!(schemaCollection == null || (uiItems = schemaCollection.getUiItems()) == null)) {
                List<EntitySchema> list = uiItems;
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!z)) {
                    uiItems = null;
                }
                if (uiItems != null) {
                    for (EntitySchema entitySchema : uiItems) {
                        if (Intrinsics.areEqual("ExternalAppApproval", entitySchema.getUniqueName())) {
                            return TuplesKt.to(NeedApprovalType.TOTAL, null);
                        }
                        if (Intrinsics.areEqual("ExternalAppConditionalApproval", entitySchema.getUniqueName()) && l != null && j >= l.longValue()) {
                            j2 = Math.min(j2, l.longValue());
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
        if (j2 != Long.MAX_VALUE) {
            return TuplesKt.to(NeedApprovalType.TIME_LIMITED, Long.valueOf(j2));
        }
        return TuplesKt.to(null, null);
    }

    /* renamed from: a */
    public final void mo116284a(boolean z) {
        this.f81299g = z;
    }

    /* renamed from: a */
    public final boolean mo116285a(CalendarEventAttendee calendarEventAttendee) {
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "meetingRoom");
        return this.f81293a.remove(calendarEventAttendee);
    }

    /* renamed from: a */
    public final ArrayList<CalendarEventAttendee> mo116278a(boolean z, boolean z2) {
        boolean z3;
        if (!z || z2) {
            return mo116292d();
        }
        ArrayList arrayList = new ArrayList();
        for (T t : mo116292d()) {
            T t2 = t;
            if (t2.getStatus() == CalendarEventAttendee.Status.NEEDS_ACTION || t2.getStatus() == CalendarEventAttendee.Status.TENTATIVE || t2.getStatus() == CalendarEventAttendee.Status.DECLINE) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                arrayList.add(t);
            }
        }
        return new ArrayList<>(arrayList);
    }

    /* renamed from: b */
    public final MeetingRoomLimitData mo116286b(boolean z, boolean z2) {
        ArrayList<CalendarEventAttendee> a = mo116278a(z, z2);
        if (a.isEmpty()) {
            return null;
        }
        int i = (int) 62985600;
        CalendarEventAttendee calendarEventAttendee = a.get(0);
        Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee, "curMtRoomList[0]");
        String a2 = C32060a.m121939a(calendarEventAttendee);
        Iterator<CalendarEventAttendee> it = a.iterator();
        while (it.hasNext()) {
            CalendarEventAttendee next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "mtRoom");
            SchemaExtraData.ResourceStrategy a3 = C32068f.m121958a(next);
            if (a3 != null && Intrinsics.compare(a3.until_max_duration.intValue(), i) < 0) {
                Integer num = a3.until_max_duration;
                Intrinsics.checkExpressionValueIsNotNull(num, "strategy.until_max_duration");
                i = num.intValue();
                a2 = C32060a.m121939a(next);
            }
        }
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setTimeInSeconds(((calendarDate.getTimeInSeconds() / 86400) * 86400) + ((long) i));
        if (a2 == null) {
            a2 = "";
        }
        return new MeetingRoomLimitData(calendarDate, a2);
    }

    /* renamed from: a */
    public final void mo116281a(String str, SchemaExtraData.ResourceCustomization resourceCustomization) {
        T t;
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(resourceCustomization, "mtRoomSchedule");
        Iterator<T> it = this.f81293a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual(t.getAttendeeCalendarId(), str)) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            C32066d.m121955a((CalendarEventAttendee) t2, resourceCustomization);
        }
    }

    /* renamed from: a */
    public final BuildingFragmentData mo116276a(long j, long j2, String str, long j3, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "rRule");
        return new BuildingFragmentData(true, new ArrayList(), true, true, j, j2, str, j3, this.f81294b, this.f81295c, z, true);
    }

    /* renamed from: b */
    public final ResourceAppendFragmentData mo116287b(long j, long j2, String str, long j3, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "rRule");
        return new ResourceAppendFragmentData(new EventData(j, j2, z, str, j3), new RequestResourceData(this.f81294b, this.f81296d, this.f81300h), null, false, false, 28, null);
    }
}
