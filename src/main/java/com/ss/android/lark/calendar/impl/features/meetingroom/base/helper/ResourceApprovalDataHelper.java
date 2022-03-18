package com.ss.android.lark.calendar.impl.features.meetingroom.base.helper;

import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.MeetingRoomApprovalHelper;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.SchemaHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JL\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000bJ:\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000bH\u0002JD\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\rJ@\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fJD\u0010 \u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\rJ\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010!\u001a\u00020\u000bH\u0002JN\u0010\"\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\r2\u0006\u0010#\u001a\u00020\u000bH\u0002J \u0010$\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f¨\u0006&"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/helper/ResourceApprovalDataHelper;", "", "()V", "getApprovalTipDialogData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/helper/ApprovalTipDialogData;", "startTime", "", "endTime", "rRule", "", "isExceptionEvent", "", "originalEventData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/helper/OriginalEventData;", "selectedResourceIds", "", "showReApprovalDialog", "getNeedToAddMeetingRoomApprovalList", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "originAttendeeList", "newAttendeeList", "eventDuration", "isRepeatOrExceptionEvent", "interceptDragSaveEvent", "eventMeetingRooms", "editStartTime", "editEndTime", "eventRRule", "originalTime", "originalEvent", "interceptEditTime", "selectedMeetingRoom", "interceptSaveEvent", "isException", "isShowEditApproval", "isFromView", "isTimeNotChangeOrPast", "mapToNotRemoveResource", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.c */
public final class ResourceApprovalDataHelper {

    /* renamed from: a */
    public static final ResourceApprovalDataHelper f81975a = new ResourceApprovalDataHelper();

    private ResourceApprovalDataHelper() {
    }

    /* renamed from: a */
    public final List<CalendarEventAttendee> mo117029a(List<? extends CalendarEventAttendee> list) {
        boolean z;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (!t2.isResource() || t2.getStatus() == CalendarEventAttendee.Status.REMOVED) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final boolean m121972a(String str, boolean z) {
        boolean z2;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || z) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m121971a(OriginalEventData bVar, long j, long j2) {
        boolean z;
        long j3 = (long) 1000;
        if (bVar.mo117020b() * j3 > new CalendarDate().getTimeInMilliSeconds() || j3 * j2 > new CalendarDate().getTimeInMilliSeconds()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        if (bVar.mo117019a() == j && bVar.mo117020b() == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final List<CalendarEventAttendee> m121970a(List<? extends CalendarEventAttendee> list, List<? extends CalendarEventAttendee> list2, long j, boolean z) {
        SchemaExtraData.ApprovalTrigger approvalTrigger;
        ArrayList arrayList = new ArrayList();
        List<? extends CalendarEventAttendee> list3 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        for (T t : list3) {
            arrayList2.add(TuplesKt.to(t.getAttendeeCalendarId(), t));
        }
        Map map = MapsKt.toMap(arrayList2);
        for (CalendarEventAttendee calendarEventAttendee : list2) {
            if (calendarEventAttendee.isResource()) {
                SchemaHelper.Companion aVar = SchemaHelper.f83746a;
                CalendarSchemaCollection schemaCollection = calendarEventAttendee.getSchemaCollection();
                com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData = calendarEventAttendee.getSchemaExtraData();
                if (schemaExtraData != null) {
                    approvalTrigger = MeetingRoomApprovalHelper.f79933a.mo114616a(schemaExtraData);
                } else {
                    approvalTrigger = null;
                }
                if (aVar.mo120310a(schemaCollection, approvalTrigger, Long.valueOf(j), z).getFirst().booleanValue()) {
                    CalendarEventAttendee calendarEventAttendee2 = (CalendarEventAttendee) map.get(calendarEventAttendee.getAttendeeCalendarId());
                    if (calendarEventAttendee2 == null) {
                        arrayList.add(calendarEventAttendee);
                    } else if (calendarEventAttendee2.getStatus() == CalendarEventAttendee.Status.DECLINE && (calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.NEEDS_ACTION || calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.ACCEPT || calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.TENTATIVE)) {
                        arrayList.add(calendarEventAttendee);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final ApprovalTipDialogData mo117028a(List<? extends CalendarEventAttendee> list, long j, long j2, String str, long j3, OriginalEventData bVar) {
        return m121969a(list, j, j2, str, j3, bVar, false);
    }

    /* renamed from: b */
    public final ApprovalTipDialogData mo117030b(List<? extends CalendarEventAttendee> list, long j, long j2, String str, long j3, OriginalEventData bVar) {
        boolean z;
        ApprovalTipDialogData a = m121969a(list, j, j2, str, j3, bVar, true);
        if (a != null) {
            return a;
        }
        if (j3 != 0) {
            z = true;
        } else {
            z = false;
        }
        List<CalendarEventAttendee> a2 = mo117029a(list);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a2, 10));
        Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            String attendeeCalendarId = it.next().getAttendeeCalendarId();
            if (attendeeCalendarId == null) {
                attendeeCalendarId = "";
            }
            arrayList.add(attendeeCalendarId);
        }
        return mo117027a(j, j2, "", z, bVar, (List<String>) arrayList, false);
    }

    /* renamed from: a */
    public final ApprovalTipDialogData mo117026a(long j, long j2, String str, boolean z, OriginalEventData bVar, List<? extends CalendarEventAttendee> list) {
        Intrinsics.checkParameterIsNotNull(str, "rRule");
        Intrinsics.checkParameterIsNotNull(list, "selectedMeetingRoom");
        List<? extends CalendarEventAttendee> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            String attendeeCalendarId = it.next().getAttendeeCalendarId();
            if (attendeeCalendarId == null) {
                attendeeCalendarId = "";
            }
            arrayList.add(attendeeCalendarId);
        }
        return m121968a(this, j, j2, str, z, bVar, arrayList, false, 64, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.ApprovalTipDialogData m121969a(java.util.List<? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee> r13, long r14, long r16, java.lang.String r18, long r19, com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.OriginalEventData r21, boolean r22) {
        /*
        // Method dump skipped, instructions count: 245
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.ResourceApprovalDataHelper.m121969a(java.util.List, long, long, java.lang.String, long, com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.b, boolean):com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.a");
    }

    /* renamed from: a */
    public final ApprovalTipDialogData mo117027a(long j, long j2, String str, boolean z, OriginalEventData bVar, List<String> list, boolean z2) {
        boolean z3;
        ArrayList<CalendarEventAttendee> arrayList;
        String str2;
        boolean z4;
        boolean z5;
        Intrinsics.checkParameterIsNotNull(list, "selectedResourceIds");
        Object obj = null;
        if (bVar != null) {
            String str3 = str;
            boolean z6 = true;
            if (str3 == null || str3.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && !m121971a(bVar, j, j2)) {
                List<CalendarEventAttendee> c = bVar.mo117021c();
                if (c != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (T t : c) {
                        T t2 = t;
                        if (!t2.isResource() || !list.contains(t2.getAttendeeCalendarId()) || !SchemaHelper.f83746a.mo120312a(t2.getSchemaCollection())) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (z5) {
                            arrayList2.add(t);
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (arrayList != null) {
                    for (CalendarEventAttendee calendarEventAttendee : arrayList) {
                        SchemaHelper.Companion aVar = SchemaHelper.f83746a;
                        CalendarSchemaCollection schemaCollection = calendarEventAttendee.getSchemaCollection();
                        com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData = calendarEventAttendee.getSchemaExtraData();
                        boolean booleanValue = aVar.mo120310a(schemaCollection, schemaExtraData != null ? MeetingRoomApprovalHelper.f79933a.mo114616a(schemaExtraData) : null, Long.valueOf(j2 - j), f81975a.m121972a(str, z)).getFirst().booleanValue();
                        if ((calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.TENTATIVE || calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.NEEDS_ACTION) && MeetingRoomApprovalHelper.f79933a.mo114618b(calendarEventAttendee.getSchemaExtraData())) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4 && !booleanValue) {
                            arrayList3.add(calendarEventAttendee);
                        } else if (booleanValue) {
                            arrayList4.add(TuplesKt.to(Boolean.valueOf(z4), calendarEventAttendee));
                        }
                    }
                }
                if (z2 && (!arrayList4.isEmpty())) {
                    ArrayList<Pair> arrayList5 = arrayList4;
                    Iterator it = arrayList5.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((Boolean) ((Pair) next).getFirst()).booleanValue()) {
                            obj = next;
                            break;
                        }
                    }
                    if (obj != null) {
                        z6 = false;
                    }
                    if (z6) {
                        str2 = C32634ae.m125182b(R.string.Calendar_Rooms_ReservedChangeTime);
                    } else {
                        str2 = C32634ae.m125180a(R.plurals.Calendar_Rooms_ReservedCanceledDialog, arrayList4.size());
                    }
                    Intrinsics.checkExpressionValueIsNotNull(str2, "titleStr");
                    ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                    for (Pair pair : arrayList5) {
                        arrayList6.add((CalendarEventAttendee) pair.getSecond());
                    }
                    return new ApprovalTipDialogData(0, str2, arrayList6);
                } else if (!arrayList3.isEmpty()) {
                    String b = C32634ae.m125182b(R.string.Calendar_Rooms_ChangeTimeDesc);
                    Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(string…dar_Rooms_ChangeTimeDesc)");
                    return new ApprovalTipDialogData(1, b, arrayList3);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static /* synthetic */ ApprovalTipDialogData m121968a(ResourceApprovalDataHelper cVar, long j, long j2, String str, boolean z, OriginalEventData bVar, List list, boolean z2, int i, Object obj) {
        boolean z3;
        if ((i & 64) != 0) {
            z3 = true;
        } else {
            z3 = z2;
        }
        return cVar.mo117027a(j, j2, str, z, bVar, list, z3);
    }
}
