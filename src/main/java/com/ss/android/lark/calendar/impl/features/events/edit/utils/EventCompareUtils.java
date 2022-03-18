package com.ss.android.lark.calendar.impl.features.events.edit.utils;

import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.larksuite.framework.utils.aj;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.helper.MeetingRoomFormHelper;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttachment;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventReminder;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0018\u0010\n\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\"\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0016\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000bJ\u0016\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/utils/EventCompareUtils;", "", "()V", "getEventDifItemNameWhenEdit", "", "originalEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "newEvent", "instance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "isAddMeetingRoom", "", "isAttachmentChanged", "newAttachments", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttachment;", "originalAttachments", "isAttendeeChanged", "isAttendeeChangedWithSwitchCalendar", "event", "needAddNewOrganizer", "isEventTimeChanged", "isLocationChanged", "isReminderChanged", "isResourceFormChanged", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.d.c */
public final class EventCompareUtils {

    /* renamed from: a */
    public static final EventCompareUtils f80187a = new EventCompareUtils();

    private EventCompareUtils() {
    }

    /* renamed from: a */
    public final boolean mo114865a(CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "newEvent");
        Intrinsics.checkParameterIsNotNull(calendarEventInstance, "instance");
        if (calendarEvent.getStartTime() == calendarEventInstance.getStartTime() && !aj.m95022b(calendarEvent.getStartTimeZone(), calendarEventInstance.getStartTimezone()) && calendarEvent.getEndTime() == calendarEventInstance.getEndTime() && !aj.m95022b(calendarEvent.getEndTimeZone(), calendarEventInstance.getEndTimezone()) && calendarEvent.isAllDay() == calendarEventInstance.isAllDay()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (com.larksuite.framework.utils.aj.m95022b(r8.getLocation(), r0.getLocation()) == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r9.getLocation() != null) goto L_0x001c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo114867b(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent r8, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent r9) {
        /*
            r7 = this;
            java.lang.String r0 = "originalEvent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            java.lang.String r0 = "newEvent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarLocation r8 = r8.getLocation()
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarLocation r0 = r9.getLocation()
            r1 = 0
            r2 = 1
            if (r8 != 0) goto L_0x001f
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarLocation r8 = r9.getLocation()
            if (r8 == 0) goto L_0x001d
        L_0x001c:
            r1 = 1
        L_0x001d:
            r2 = r1
            goto L_0x0057
        L_0x001f:
            if (r0 != 0) goto L_0x0022
            goto L_0x0057
        L_0x0022:
            double r3 = r8.getLatitude()
            double r5 = r0.getLatitude()
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x001c
            double r3 = r8.getLongitude()
            double r5 = r0.getLongitude()
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x001c
            java.lang.String r9 = r8.getAddress()
            java.lang.String r3 = r0.getAddress()
            boolean r9 = com.larksuite.framework.utils.aj.m95022b(r9, r3)
            if (r9 != 0) goto L_0x001c
            java.lang.String r8 = r8.getLocation()
            java.lang.String r9 = r0.getLocation()
            boolean r8 = com.larksuite.framework.utils.aj.m95022b(r8, r9)
            if (r8 == 0) goto L_0x001d
            goto L_0x001c
        L_0x0057:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.utils.EventCompareUtils.mo114867b(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent):boolean");
    }

    /* renamed from: c */
    public final boolean mo114868c(CalendarEvent calendarEvent, CalendarEvent calendarEvent2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(calendarEvent, "originalEvent");
        Intrinsics.checkParameterIsNotNull(calendarEvent2, "newEvent");
        List<CalendarEventReminder> reminders = calendarEvent2.getReminders();
        List<CalendarEventReminder> reminders2 = calendarEvent.getReminders();
        if (reminders.size() != reminders2.size()) {
            return true;
        }
        Iterator<CalendarEventReminder> it = reminders2.iterator();
        do {
            z = false;
            if (it.hasNext()) {
                CalendarEventReminder next = it.next();
                for (CalendarEventReminder calendarEventReminder : reminders) {
                    Intrinsics.checkExpressionValueIsNotNull(next, "originReminder");
                    CalendarEventReminder.Method method = next.getMethod();
                    Intrinsics.checkExpressionValueIsNotNull(method, "originReminder.method");
                    int number = method.getNumber();
                    Intrinsics.checkExpressionValueIsNotNull(calendarEventReminder, "reminder");
                    CalendarEventReminder.Method method2 = calendarEventReminder.getMethod();
                    Intrinsics.checkExpressionValueIsNotNull(method2, "reminder.method");
                    if (number == method2.getNumber() && next.getMinutes() == calendarEventReminder.getMinutes()) {
                        z = true;
                        continue;
                    }
                    if (z) {
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (z);
        return true;
    }

    /* renamed from: d */
    public final boolean mo114869d(CalendarEvent calendarEvent, CalendarEvent calendarEvent2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(calendarEvent2, "newEvent");
        if (calendarEvent == null) {
            return false;
        }
        List<CalendarEventAttendee> attendees = calendarEvent2.getAttendees();
        if (attendees != null) {
            List<CalendarEventAttendee> attendees2 = calendarEvent.getAttendees();
            if (attendees2 != null) {
                for (CalendarEventAttendee calendarEventAttendee : attendees) {
                    if (calendarEventAttendee.isResource() && calendarEventAttendee.getStatus() != CalendarEventAttendee.Status.REMOVED) {
                        Iterator<CalendarEventAttendee> it = attendees2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            CalendarEventAttendee next = it.next();
                            if (Intrinsics.areEqual(calendarEventAttendee.getAttendeeCalendarId(), next.getAttendeeCalendarId()) && next.getStatus() != CalendarEventAttendee.Status.REMOVED) {
                                z = true;
                                break;
                            }
                        }
                        if (!z) {
                            return true;
                        }
                    }
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee>");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee>");
    }

    /* renamed from: a */
    public final boolean mo114863a(CalendarEvent calendarEvent, CalendarEvent calendarEvent2) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "originalEvent");
        Intrinsics.checkParameterIsNotNull(calendarEvent2, "newEvent");
        List<CalendarEventAttendee> attendees = calendarEvent.getAttendees();
        List<CalendarEventAttendee> attendees2 = calendarEvent2.getAttendees();
        if (attendees.size() != attendees2.size()) {
            return true;
        }
        boolean z = false;
        for (CalendarEventAttendee calendarEventAttendee : attendees) {
            boolean z2 = false;
            for (CalendarEventAttendee calendarEventAttendee2 : attendees2) {
                Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee2, "attendee");
                String attendeeCalendarId = calendarEventAttendee2.getAttendeeCalendarId();
                Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee, "originAttendee");
                if (Intrinsics.areEqual(attendeeCalendarId, calendarEventAttendee.getAttendeeCalendarId())) {
                    CalendarEventAttendee.Status status = calendarEventAttendee2.getStatus();
                    Intrinsics.checkExpressionValueIsNotNull(status, "attendee.status");
                    int number = status.getNumber();
                    CalendarEventAttendee.Status status2 = calendarEventAttendee.getStatus();
                    Intrinsics.checkExpressionValueIsNotNull(status2, "originAttendee.status");
                    if (number != status2.getNumber()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = true;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            if (!z2) {
                return true;
            }
            if (z) {
                return true;
            }
        }
        return z;
    }

    /* renamed from: e */
    public final boolean mo114870e(CalendarEvent calendarEvent, CalendarEvent calendarEvent2) {
        SchemaExtraData schemaExtraData;
        Object obj;
        Intrinsics.checkParameterIsNotNull(calendarEvent2, "newEvent");
        if (calendarEvent != null) {
            List<CalendarEventAttendee> attendees = calendarEvent.getAttendees();
            Intrinsics.checkExpressionValueIsNotNull(attendees, "originalEvent.attendees");
            ArrayList arrayList = new ArrayList();
            for (T t : attendees) {
                T t2 = t;
                Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                if (t2.isResource()) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            List<CalendarEventAttendee> attendees2 = calendarEvent2.getAttendees();
            Intrinsics.checkExpressionValueIsNotNull(attendees2, "newEvent.attendees");
            ArrayList<CalendarEventAttendee> arrayList3 = new ArrayList();
            Iterator<T> it = attendees2.iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T t3 = next;
                Intrinsics.checkExpressionValueIsNotNull(t3, "it");
                if (!t3.isResource() || t3.getStatus() == CalendarEventAttendee.Status.REMOVED || MeetingRoomFormHelper.f82028a.mo117082a(t3.getSchemaExtraData()) == null) {
                    z = false;
                }
                if (z) {
                    arrayList3.add(next);
                }
            }
            for (CalendarEventAttendee calendarEventAttendee : arrayList3) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    schemaExtraData = null;
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    CalendarEventAttendee calendarEventAttendee2 = (CalendarEventAttendee) obj;
                    Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee2, "it");
                    String attendeeCalendarId = calendarEventAttendee2.getAttendeeCalendarId();
                    Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee, "newResource");
                    if (Intrinsics.areEqual(attendeeCalendarId, calendarEventAttendee.getAttendeeCalendarId())) {
                        break;
                    }
                }
                CalendarEventAttendee calendarEventAttendee3 = (CalendarEventAttendee) obj;
                MeetingRoomFormHelper aVar = MeetingRoomFormHelper.f82028a;
                if (calendarEventAttendee3 != null) {
                    schemaExtraData = calendarEventAttendee3.getSchemaExtraData();
                }
                SchemaExtraData.ResourceCustomization a = aVar.mo117082a(schemaExtraData);
                if (a != null) {
                    MeetingRoomFormHelper aVar2 = MeetingRoomFormHelper.f82028a;
                    Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee, "newResource");
                    if (!MeetingRoomFormHelper.f82028a.mo117087a(a, aVar2.mo117082a(calendarEventAttendee.getSchemaExtraData()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo114866a(List<CalendarEventAttachment> list, List<CalendarEventAttachment> list2) {
        Intrinsics.checkParameterIsNotNull(list, "newAttachments");
        Intrinsics.checkParameterIsNotNull(list2, "originalAttachments");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (!t.isDeleted()) {
                arrayList.add(t);
            }
        }
        ArrayList<CalendarEventAttachment> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (CalendarEventAttachment calendarEventAttachment : arrayList2) {
            arrayList3.add(calendarEventAttachment.getFileToken());
        }
        List sorted = CollectionsKt.sorted(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (T t2 : list2) {
            if (!t2.isDeleted()) {
                arrayList4.add(t2);
            }
        }
        ArrayList<CalendarEventAttachment> arrayList5 = arrayList4;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        for (CalendarEventAttachment calendarEventAttachment2 : arrayList5) {
            arrayList6.add(calendarEventAttachment2.getFileToken());
        }
        return !Intrinsics.areEqual(sorted, CollectionsKt.sorted(arrayList6));
    }

    /* renamed from: a */
    public final String mo114862a(CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        int i;
        boolean z;
        String str12 = "";
        if (calendarEvent == null || calendarEvent2 == null || calendarEventInstance == null) {
            return str12;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str12);
        if (aj.m95022b(calendarEvent2.getSummary(), calendarEvent.getSummary())) {
            str = " summary";
        } else {
            str = str12;
        }
        sb.append(str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        if (mo114865a(calendarEvent2, calendarEventInstance)) {
            str2 = " time";
        } else {
            str2 = str12;
        }
        sb3.append(str2);
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        if (mo114863a(calendarEvent, calendarEvent2)) {
            str3 = " meeting_room";
        } else {
            str3 = str12;
        }
        sb5.append(str3);
        String sb6 = sb5.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(sb6);
        if (aj.m95022b(calendarEvent2.getCalendarId(), calendarEvent.getCalendarId())) {
            str4 = " calendar_id";
        } else {
            str4 = str12;
        }
        sb7.append(str4);
        String sb8 = sb7.toString();
        StringBuilder sb9 = new StringBuilder();
        sb9.append(sb8);
        if (calendarEvent2.isFree() != calendarEvent.isFree()) {
            str5 = " free_busy";
        } else {
            str5 = str12;
        }
        sb9.append(str5);
        String sb10 = sb9.toString();
        StringBuilder sb11 = new StringBuilder();
        sb11.append(sb10);
        CalendarEvent.Visibility visibility = calendarEvent2.getVisibility();
        Intrinsics.checkExpressionValueIsNotNull(visibility, "newEvent.visibility");
        int number = visibility.getNumber();
        CalendarEvent.Visibility visibility2 = calendarEvent.getVisibility();
        Intrinsics.checkExpressionValueIsNotNull(visibility2, "originalEvent.visibility");
        if (number != visibility2.getNumber()) {
            str6 = " visibility";
        } else {
            str6 = str12;
        }
        sb11.append(str6);
        String sb12 = sb11.toString();
        StringBuilder sb13 = new StringBuilder();
        sb13.append(sb12);
        if (mo114867b(calendarEvent, calendarEvent2)) {
            str7 = " location";
        } else {
            str7 = str12;
        }
        sb13.append(str7);
        String sb14 = sb13.toString();
        StringBuilder sb15 = new StringBuilder();
        sb15.append(sb14);
        if (aj.m95022b(calendarEvent2.getDescription(), calendarEvent.getDescription())) {
            str8 = " description";
        } else {
            str8 = str12;
        }
        sb15.append(str8);
        String sb16 = sb15.toString();
        StringBuilder sb17 = new StringBuilder();
        sb17.append(sb16);
        List<CalendarEventAttachment> attachment = calendarEvent2.getAttachment();
        Intrinsics.checkExpressionValueIsNotNull(attachment, "newEvent.attachment");
        List<CalendarEventAttachment> attachment2 = calendarEvent.getAttachment();
        Intrinsics.checkExpressionValueIsNotNull(attachment2, "originalEvent.attachment");
        if (mo114866a(attachment, attachment2)) {
            str9 = " attachment";
        } else {
            str9 = str12;
        }
        sb17.append(str9);
        String sb18 = sb17.toString();
        StringBuilder sb19 = new StringBuilder();
        sb19.append(sb18);
        if (aj.m95022b(calendarEvent2.getRRule(), calendarEvent.getRRule())) {
            str10 = " rrule";
        } else {
            str10 = str12;
        }
        sb19.append(str10);
        String sb20 = sb19.toString();
        StringBuilder sb21 = new StringBuilder();
        sb21.append(sb20);
        if (calendarEvent2.getColor() != calendarEvent.getColor()) {
            str11 = " event_color";
        } else {
            str11 = str12;
        }
        sb21.append(str11);
        String sb22 = sb21.toString();
        StringBuilder sb23 = new StringBuilder();
        sb23.append(sb22);
        if (mo114868c(calendarEvent, calendarEvent2)) {
            str12 = " reminders";
        }
        sb23.append(str12);
        String sb24 = sb23.toString();
        int length = sb24.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (sb24.charAt(i) <= ' ') {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        return sb24.subSequence(i2, length + 1).toString();
    }

    /* renamed from: a */
    public final boolean mo114864a(CalendarEvent calendarEvent, CalendarEvent calendarEvent2, boolean z) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        Intrinsics.checkParameterIsNotNull(calendarEvent2, "originalEvent");
        if (calendarEvent2.getAttendees().size() == 0 && calendarEvent.getAttendees().size() == 0) {
            return false;
        }
        if (!z) {
            return mo114863a(calendarEvent2, calendarEvent);
        }
        List<CalendarEventAttendee> attendees = calendarEvent2.getAttendees();
        Intrinsics.checkExpressionValueIsNotNull(attendees, "originalEvent.attendees");
        for (T t : attendees) {
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            if (Intrinsics.areEqual(t.getAttendeeCalendarId(), calendarEvent.getCalendarId())) {
                return f80187a.mo114863a(calendarEvent2, calendarEvent);
            }
        }
        CalendarEventAttendee calendarEventAttendee = null;
        List<CalendarEventAttendee> attendees2 = calendarEvent.getAttendees();
        Intrinsics.checkExpressionValueIsNotNull(attendees2, "event.attendees");
        for (T t2 : attendees2) {
            Intrinsics.checkExpressionValueIsNotNull(t2, "it");
            if (Intrinsics.areEqual(t2.getAttendeeCalendarId(), calendarEvent.getCalendarId())) {
                calendarEventAttendee = t2;
            }
        }
        if (calendarEventAttendee == null) {
            return true;
        }
        calendarEvent.getAttendees().remove(calendarEventAttendee);
        boolean a = f80187a.mo114863a(calendarEvent2, calendarEvent);
        calendarEvent.getAttendees().add(calendarEventAttendee);
        return a;
    }
}
