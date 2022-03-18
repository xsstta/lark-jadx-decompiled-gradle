package com.ss.android.lark.calendar.impl.features.events.edit.utils;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SimpleMember;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.UserAttendeeBaseInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\fJ$\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000ej\b\u0012\u0004\u0012\u00020\u0007`\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011J\u001c\u0010\u0014\u001a\u00020\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\u0016\u001a\u00020\u0007J\u001c\u0010\u0017\u001a\u00020\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\u0016\u001a\u00020\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J2\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00112\u0006\u0010\u001b\u001a\u00020\u00072\u001a\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0011\u0018\u00010\u001dJ\u000e\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0007¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/utils/EventAttendeeUtils;", "", "()V", "breakUpGroupToTimeZoneAttendeeMap", "", "attendeeList", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "attendeeResult", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/UserAttendeeBaseInfo;", "Lkotlin/collections/HashMap;", "getAttendeeListAfterFilter", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "attendees", "", "getNotRemovedAttendeesNumber", "", "isAttendeeStatusRemovedInList", "", "attendee", "isGoogleAttendeeStatusRemovedInList", "parseToSimpleMember", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SimpleMember;", "parseToSimpleMemberList", "groupAttendee", "simpleAttendeeMap", "", "parseToUserAttendeeBaseInfo", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.d.a */
public final class EventAttendeeUtils {

    /* renamed from: a */
    public static final EventAttendeeUtils f80183a = new EventAttendeeUtils();

    private EventAttendeeUtils() {
    }

    /* renamed from: b */
    private final SimpleMember m119183b(CalendarEventAttendee calendarEventAttendee) {
        String attendeeCalendarId = calendarEventAttendee.getAttendeeCalendarId();
        if (attendeeCalendarId == null) {
            attendeeCalendarId = "";
        }
        CalendarEventAttendee.Status status = calendarEventAttendee.getStatus();
        if (status == null) {
            status = CalendarEventAttendee.Status.NEEDS_ACTION;
        }
        return new SimpleMember(attendeeCalendarId, status);
    }

    /* renamed from: a */
    public final UserAttendeeBaseInfo mo114849a(CalendarEventAttendee calendarEventAttendee) {
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "attendee");
        String attendeeCalendarId = calendarEventAttendee.getAttendeeCalendarId();
        if (attendeeCalendarId == null) {
            attendeeCalendarId = "";
        }
        return new UserAttendeeBaseInfo(attendeeCalendarId, calendarEventAttendee.getLocalizedDisplayName(), calendarEventAttendee.getAvatarKey(), null, calendarEventAttendee.getTimeZoneId(), calendarEventAttendee.getUserId(), calendarEventAttendee.getTenantId(), 8, null);
    }

    /* renamed from: b */
    public final int mo114854b(List<? extends CalendarEventAttendee> list) {
        Intrinsics.checkParameterIsNotNull(list, "attendees");
        int i = 0;
        for (CalendarEventAttendee calendarEventAttendee : list) {
            if (calendarEventAttendee.getStatus() != CalendarEventAttendee.Status.REMOVED) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public final ArrayList<CalendarEventAttendee> mo114850a(List<? extends CalendarEventAttendee> list) {
        Intrinsics.checkParameterIsNotNull(list, "attendees");
        ArrayList<CalendarEventAttendee> arrayList = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            CalendarEventAttendee calendarEventAttendee = (CalendarEventAttendee) list.get(i);
            if (calendarEventAttendee.getStatus() != CalendarEventAttendee.Status.REMOVED) {
                arrayList.add(calendarEventAttendee);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final boolean mo114855b(List<? extends CalendarEventAttendee> list, CalendarEventAttendee calendarEventAttendee) {
        Intrinsics.checkParameterIsNotNull(list, "attendeeList");
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "attendee");
        if (list.contains(calendarEventAttendee) && ((CalendarEventAttendee) list.get(list.indexOf(calendarEventAttendee))).getStatus() == CalendarEventAttendee.Status.REMOVED) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final List<SimpleMember> mo114851a(CalendarEventAttendee calendarEventAttendee, Map<String, ? extends List<SimpleMember>> map) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "groupAttendee");
        List<SimpleMember> list = map != null ? (List) map.get(calendarEventAttendee.getGroupId()) : null;
        List<SimpleMember> list2 = list;
        boolean z2 = false;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return list;
        }
        List<CalendarEventAttendee> groupMembers = calendarEventAttendee.getGroupMembers();
        if (groupMembers == null || groupMembers.isEmpty()) {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<CalendarEventAttendee> groupMembers2 = calendarEventAttendee.getGroupMembers();
        if (groupMembers2 != null) {
            for (T t : groupMembers2) {
                if (t != null) {
                    arrayList.add(f80183a.m119183b((CalendarEventAttendee) t));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo114852a(List<CalendarEventAttendee> list, HashMap<String, UserAttendeeBaseInfo> hashMap) {
        Intrinsics.checkParameterIsNotNull(list, "attendeeList");
        Intrinsics.checkParameterIsNotNull(hashMap, "attendeeResult");
        if (!CollectionUtils.isEmpty(list)) {
            for (CalendarEventAttendee calendarEventAttendee : list) {
                if (!TextUtils.isEmpty(calendarEventAttendee.getTimeZoneId()) && !hashMap.containsKey(calendarEventAttendee.getAttendeeCalendarId())) {
                    String attendeeCalendarId = calendarEventAttendee.getAttendeeCalendarId();
                    Intrinsics.checkExpressionValueIsNotNull(attendeeCalendarId, "attendee.attendeeCalendarId");
                    hashMap.put(attendeeCalendarId, mo114849a(calendarEventAttendee));
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo114853a(List<? extends CalendarEventAttendee> list, CalendarEventAttendee calendarEventAttendee) {
        int i;
        boolean z;
        Intrinsics.checkParameterIsNotNull(list, "attendeeList");
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "attendee");
        Iterator<? extends CalendarEventAttendee> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                z = false;
                break;
            }
            CalendarEventAttendee calendarEventAttendee2 = (CalendarEventAttendee) it.next();
            if (Intrinsics.areEqual(calendarEventAttendee2.getEmail(), calendarEventAttendee.getEmail())) {
                i = list.indexOf(calendarEventAttendee2);
                z = true;
                break;
            }
        }
        if (z && ((CalendarEventAttendee) list.get(i)).getStatus() == CalendarEventAttendee.Status.REMOVED) {
            return true;
        }
        return false;
    }
}
