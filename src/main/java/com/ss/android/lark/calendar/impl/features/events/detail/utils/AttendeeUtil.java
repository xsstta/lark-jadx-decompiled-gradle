package com.ss.android.lark.calendar.impl.features.events.detail.utils;

import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0002J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tJ\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/utils/AttendeeUtil;", "", "()V", "filterAttendees", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "attendees", "getAllSortedAttendees", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "getAttendeePriority", "", "attendee", "organizerOrCreator", "getEventMeetingRooms", "calendarEventAttendees", "getEventOrganizerName", "", "getFilteredAndSortedAttendees", "getFilteredAttendees", "getSortEventAttendees", "needSortAttendees", "isContainEmailAttendee", "", "isEventAttendeeContainsLoginUser", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.d.a */
public final class AttendeeUtil {

    /* renamed from: a */
    public static final AttendeeUtil f79151a = new AttendeeUtil();

    private AttendeeUtil() {
    }

    /* renamed from: b */
    public final List<CalendarEventAttendee> mo113569b(CalendarEvent calendarEvent) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        return mo113567a(calendarEvent, mo113566a(calendarEvent));
    }

    /* renamed from: a */
    public final List<CalendarEventAttendee> mo113566a(CalendarEvent calendarEvent) {
        List<CalendarEventAttendee> list;
        if (calendarEvent != null) {
            list = calendarEvent.getAttendees();
        } else {
            list = null;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (T t : list) {
                Intrinsics.checkExpressionValueIsNotNull(t, "attendee");
                if (!t.isResource() && t.getStatus() != CalendarEventAttendee.Status.REMOVED) {
                    arrayList.add(t);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final boolean mo113570c(CalendarEvent calendarEvent) {
        if (calendarEvent != null && !CollectionUtils.isEmpty(calendarEvent.getAttendees())) {
            for (CalendarEventAttendee calendarEventAttendee : calendarEvent.getAttendees()) {
                if (calendarEventAttendee != null) {
                    if (!calendarEventAttendee.isGroup() || !CollectionUtils.isNotEmpty(calendarEventAttendee.getGroupMembers())) {
                        if (CalendarEventAttendee.Category.THIRD_PARTY_USER == calendarEventAttendee.getCategory()) {
                            return true;
                        }
                    } else {
                        for (CalendarEventAttendee calendarEventAttendee2 : calendarEventAttendee.getGroupMembers()) {
                            Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee2, "member");
                            if (CalendarEventAttendee.Category.THIRD_PARTY_USER == calendarEventAttendee2.getCategory()) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public final String mo113571d(CalendarEvent calendarEvent) {
        String b = C32634ae.m125182b(R.string.Calendar_Detail_Organizer);
        if (calendarEvent == null) {
            Intrinsics.checkExpressionValueIsNotNull(b, "defaultName");
            return b;
        } else if (calendarEvent.getSuccessor() != null) {
            CalendarEventAttendee successor = calendarEvent.getSuccessor();
            Intrinsics.checkExpressionValueIsNotNull(successor, "event.successor");
            String localizedDisplayName = successor.getLocalizedDisplayName();
            Intrinsics.checkExpressionValueIsNotNull(localizedDisplayName, "event.successor.localizedDisplayName");
            return localizedDisplayName;
        } else if (calendarEvent.getOrganizer() != null) {
            CalendarEventAttendee organizer = calendarEvent.getOrganizer();
            Intrinsics.checkExpressionValueIsNotNull(organizer, "event.organizer");
            String localizedDisplayName2 = organizer.getLocalizedDisplayName();
            Intrinsics.checkExpressionValueIsNotNull(localizedDisplayName2, "event.organizer.localizedDisplayName");
            return localizedDisplayName2;
        } else if (calendarEvent.getCreator() != null) {
            CalendarEventAttendee creator = calendarEvent.getCreator();
            Intrinsics.checkExpressionValueIsNotNull(creator, "event.creator");
            String localizedDisplayName3 = creator.getLocalizedDisplayName();
            Intrinsics.checkExpressionValueIsNotNull(localizedDisplayName3, "event.creator.localizedDisplayName");
            return localizedDisplayName3;
        } else {
            Intrinsics.checkExpressionValueIsNotNull(b, "defaultName");
            return b;
        }
    }

    /* renamed from: a */
    public final List<CalendarEventAttendee> mo113568a(List<? extends CalendarEventAttendee> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (CalendarEventAttendee calendarEventAttendee : list) {
            if (calendarEventAttendee.isResource() && calendarEventAttendee.getStatus() != CalendarEventAttendee.Status.REMOVED) {
                arrayList.add(calendarEventAttendee);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "firstAttendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "kotlin.jvm.PlatformType", "secondAttendee", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.d.a$a */
    public static final class C31255a<T> implements Comparator<CalendarEventAttendee> {

        /* renamed from: a */
        final /* synthetic */ CalendarEventAttendee f79152a;

        C31255a(CalendarEventAttendee calendarEventAttendee) {
            this.f79152a = calendarEventAttendee;
        }

        /* renamed from: a */
        public final int compare(CalendarEventAttendee calendarEventAttendee, CalendarEventAttendee calendarEventAttendee2) {
            AttendeeUtil aVar = AttendeeUtil.f79151a;
            Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee2, "secondAttendee");
            int a = aVar.mo113565a(calendarEventAttendee2, this.f79152a);
            AttendeeUtil aVar2 = AttendeeUtil.f79151a;
            Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee, "firstAttendee");
            int a2 = a - aVar2.mo113565a(calendarEventAttendee, this.f79152a);
            if (a2 != 0) {
                return a2;
            }
            return Collator.getInstance(Locale.CHINA).compare(calendarEventAttendee.getLocalizedDisplayName(), calendarEventAttendee2.getLocalizedDisplayName());
        }
    }

    /* renamed from: a */
    public final int mo113565a(CalendarEventAttendee calendarEventAttendee, CalendarEventAttendee calendarEventAttendee2) {
        if (calendarEventAttendee2 != null && Intrinsics.areEqual(calendarEventAttendee2.getAttendeeCalendarId(), calendarEventAttendee.getAttendeeCalendarId())) {
            return 5;
        }
        if (calendarEventAttendee.isGroup()) {
            return 6;
        }
        if (calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.ACCEPT) {
            return 4;
        }
        if (calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.DECLINE) {
            return 3;
        }
        if (calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.TENTATIVE) {
            return 2;
        }
        if (calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.NEEDS_ACTION) {
            return 1;
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x003c A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee> mo113567a(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent r5, java.util.List<? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee> r6) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.detail.utils.AttendeeUtil.mo113567a(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent, java.util.List):java.util.List");
    }
}
