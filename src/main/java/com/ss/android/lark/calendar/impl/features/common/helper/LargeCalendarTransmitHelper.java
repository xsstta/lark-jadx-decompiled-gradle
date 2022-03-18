package com.ss.android.lark.calendar.impl.features.common.helper;

import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0014\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007J\u001a\u0010\u0015\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u0004H\u0003J\u001a\u0010\u0017\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\u0004H\u0003J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007J\u001a\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007J\u001a\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/helper/LargeCalendarTransmitHelper;", "", "()V", "LEGAL_ATTENDEE_LEN", "", "LEGAL_DESC_LEN", "transmittedCalendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "transmittedEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "getTransmittedCalendar", "bundle", "Landroid/os/Bundle;", "getTransmittedEvent", "intent", "Landroid/content/Intent;", "isLegalCalendar", "", "calendar", "isLegalEvent", "event", "isLegalEventAttendee", "maxNum", "isLegalEventDescription", "maxLen", "putTransmittedCalendar", "", "appRouterBuilder", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/IAppRouterBuilder;", "putTransmittedEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.c.e */
public final class LargeCalendarTransmitHelper {

    /* renamed from: a */
    public static final LargeCalendarTransmitHelper f78613a = new LargeCalendarTransmitHelper();

    /* renamed from: b */
    private static final int f78614b = f78614b;

    /* renamed from: c */
    private static final int f78615c = 1000;

    /* renamed from: d */
    private static CalendarEvent f78616d;

    /* renamed from: e */
    private static Calendar f78617e;

    private LargeCalendarTransmitHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    private static final boolean m116187a(CalendarEvent calendarEvent, int i) {
        if (calendarEvent == null) {
            return true;
        }
        String description = calendarEvent.getDescription();
        int length = description != null ? description.length() : 0;
        String docsDescription = calendarEvent.getDocsDescription();
        return length + (docsDescription != null ? docsDescription.length() : 0) < i;
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m116186a(CalendarEvent calendarEvent) {
        return m116187a(calendarEvent, f78614b) && m116189b(calendarEvent, f78615c);
    }

    @JvmStatic
    /* renamed from: a */
    public static final CalendarEvent m116178a(Intent intent) {
        CalendarEvent calendarEvent = null;
        if (intent == null) {
            return null;
        }
        if (intent.getBooleanExtra("largeCalendarEvent", false)) {
            return f78616d;
        }
        Serializable serializableExtra = intent.getSerializableExtra("calendarEvent");
        if (serializableExtra instanceof CalendarEvent) {
            calendarEvent = serializableExtra;
        }
        return calendarEvent;
    }

    @JvmStatic
    /* renamed from: b */
    public static final Calendar m116188b(Bundle bundle) {
        Calendar calendar = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.getBoolean("large_calendar_data", false)) {
            return f78617e;
        }
        Serializable serializable = bundle.getSerializable("calendar_data");
        if (serializable instanceof Calendar) {
            calendar = serializable;
        }
        return calendar;
    }

    @JvmStatic
    /* renamed from: a */
    public static final CalendarEvent m116179a(Bundle bundle) {
        CalendarEvent calendarEvent = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.getBoolean("largeCalendarEvent", false)) {
            return f78616d;
        }
        Serializable serializable = bundle.getSerializable("calendarEvent");
        if (serializable instanceof CalendarEvent) {
            calendarEvent = serializable;
        }
        return calendarEvent;
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m116185a(Calendar calendar) {
        int i;
        if (calendar == null) {
            return true;
        }
        String description = calendar.getDescription();
        if (description != null) {
            i = description.length();
        } else {
            i = 0;
        }
        if (i < f78614b) {
            return true;
        }
        return false;
    }

    @JvmStatic
    /* renamed from: b */
    private static final boolean m116189b(CalendarEvent calendarEvent, int i) {
        int i2;
        if (calendarEvent == null) {
            return true;
        }
        List<CalendarEventAttendee> attendees = calendarEvent.getAttendees();
        if (attendees != null) {
            i2 = attendees.size();
        } else {
            i2 = 0;
        }
        if (i2 < i) {
            return true;
        }
        return false;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m116180a(Intent intent, Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        if (calendar == null) {
            return;
        }
        if (m116185a(calendar)) {
            intent.putExtra("calendar_data", calendar);
            return;
        }
        f78617e = calendar;
        intent.putExtra("large_calendar_data", true);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m116181a(Intent intent, CalendarEvent calendarEvent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        if (calendarEvent == null) {
            return;
        }
        if (m116186a(calendarEvent)) {
            intent.putExtra("calendarEvent", calendarEvent);
            return;
        }
        f78616d = calendarEvent;
        intent.putExtra("largeCalendarEvent", true);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m116182a(Bundle bundle, CalendarEvent calendarEvent) {
        Intrinsics.checkParameterIsNotNull(bundle, "bundle");
        if (calendarEvent == null) {
            return;
        }
        if (m116186a(calendarEvent)) {
            bundle.putSerializable("calendarEvent", calendarEvent);
            return;
        }
        f78616d = calendarEvent;
        bundle.putBoolean("largeCalendarEvent", true);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m116183a(AbstractC30023a aVar, Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(aVar, "appRouterBuilder");
        if (calendar == null) {
            return;
        }
        if (m116185a(calendar)) {
            aVar.mo108152a("calendar_data", calendar);
            return;
        }
        f78617e = calendar;
        aVar.mo108154a("large_calendar_data", true);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m116184a(AbstractC30023a aVar, CalendarEvent calendarEvent) {
        Intrinsics.checkParameterIsNotNull(aVar, "appRouterBuilder");
        if (calendarEvent == null) {
            return;
        }
        if (m116186a(calendarEvent)) {
            aVar.mo108152a("calendarEvent", calendarEvent);
            return;
        }
        f78616d = calendarEvent;
        aVar.mo108154a("largeCalendarEvent", true);
    }
}
