package com.ss.android.lark.calendar.impl.framework.busevents;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/busevents/BookRoomFinishEvent;", "Lcom/ss/android/eventbus/BaseEvent;", "optType", "", "roomCalendarId", "", "eventKey", "originalTime", "", "(ILjava/lang/String;Ljava/lang/String;J)V", "getEventKey", "()Ljava/lang/String;", "getOriginalTime", "()J", "getRoomCalendarId", "isDeleteEvent", "", "isSaveEvent", "isUpdateEvent", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.a.c */
public final class BookRoomFinishEvent extends BaseEvent {

    /* renamed from: a */
    public static final Companion f83289a = new Companion(null);

    /* renamed from: b */
    private final int f83290b;

    /* renamed from: c */
    private final String f83291c;

    /* renamed from: d */
    private final String f83292d;

    /* renamed from: e */
    private final long f83293e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ \u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/busevents/BookRoomFinishEvent$Companion;", "", "()V", "OPT_TYPE_DELETE", "", "OPT_TYPE_SAVE", "OPT_TYPE_UPDATE", "createDeleteEvent", "", "Lcom/ss/android/lark/calendar/impl/framework/busevents/BookRoomFinishEvent;", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "createEvent", "optType", "createSaveEvent", "createUpdateEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.framework.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List<BookRoomFinishEvent> mo118643a(CalendarEvent calendarEvent) {
            if (calendarEvent != null) {
                return BookRoomFinishEvent.f83289a.m124009a(calendarEvent, 1);
            }
            return null;
        }

        /* renamed from: b */
        public final List<BookRoomFinishEvent> mo118644b(CalendarEvent calendarEvent) {
            if (calendarEvent != null) {
                return BookRoomFinishEvent.f83289a.m124009a(calendarEvent, 3);
            }
            return null;
        }

        /* renamed from: c */
        public final List<BookRoomFinishEvent> mo118645c(CalendarEvent calendarEvent) {
            if (calendarEvent != null) {
                return BookRoomFinishEvent.f83289a.m124009a(calendarEvent, 2);
            }
            return null;
        }

        /* renamed from: a */
        private final List<BookRoomFinishEvent> m124009a(CalendarEvent calendarEvent, int i) {
            boolean z;
            List<CalendarEventAttendee> attendees = calendarEvent.getAttendees();
            if (attendees == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (T t : attendees) {
                T t2 = t;
                Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                if (!t2.isResource() || t2.getStatus() == CalendarEventAttendee.Status.REMOVED) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList.add(t);
                }
            }
            ArrayList<CalendarEventAttendee> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (CalendarEventAttendee calendarEventAttendee : arrayList2) {
                Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee, "it");
                String attendeeCalendarId = calendarEventAttendee.getAttendeeCalendarId();
                Intrinsics.checkExpressionValueIsNotNull(attendeeCalendarId, "it.attendeeCalendarId");
                String key = calendarEvent.getKey();
                Intrinsics.checkExpressionValueIsNotNull(key, "event.key");
                arrayList3.add(new BookRoomFinishEvent(i, attendeeCalendarId, key, calendarEvent.getOriginalTime()));
            }
            return arrayList3;
        }
    }

    /* renamed from: c */
    public final String mo118640c() {
        return this.f83291c;
    }

    /* renamed from: d */
    public final String mo118641d() {
        return this.f83292d;
    }

    /* renamed from: e */
    public final long mo118642e() {
        return this.f83293e;
    }

    /* renamed from: a */
    public final boolean mo118638a() {
        if (1 == this.f83290b) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo118639b() {
        if (2 == this.f83290b) {
            return true;
        }
        return false;
    }

    public BookRoomFinishEvent(int i, String str, String str2, long j) {
        Intrinsics.checkParameterIsNotNull(str, "roomCalendarId");
        Intrinsics.checkParameterIsNotNull(str2, "eventKey");
        this.f83290b = i;
        this.f83291c = str;
        this.f83292d = str2;
        this.f83293e = j;
    }
}
