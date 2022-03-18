package com.ss.android.lark.calendar.impl.features.events.detail.utils;

import android.text.TextUtils;
import com.ss.android.lark.calendar.impl.features.calendarview.C30810k;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/utils/AuthorityUtil;", "", "()V", "TAG", "", "canRsvpEvent", "", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "calendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "isCanSeeAttendeeList", "loginerIsJoinShareEvent", "shareEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.d.b */
public final class AuthorityUtil {

    /* renamed from: a */
    public static final AuthorityUtil f79153a = new AuthorityUtil();

    private AuthorityUtil() {
    }

    /* renamed from: a */
    public final boolean mo113574a(CalendarEvent calendarEvent) {
        String str;
        C30810k a = C30810k.m114955a();
        Intrinsics.checkExpressionValueIsNotNull(a, "LoginInfoManager.getInstance()");
        String c = a.mo111644c();
        if (calendarEvent != null) {
            str = calendarEvent.getCalendarId();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(c) || !Intrinsics.areEqual(c, str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo113575a(CalendarEvent calendarEvent, Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        if ((calendar.getSelfAccessRole() == Calendar.AccessRole.WRITER || calendar.getSelfAccessRole() == Calendar.AccessRole.OWNER) && calendarEvent.getOrganizerCalendarId() != null && (!Intrinsics.areEqual(calendarEvent.getOrganizerCalendarId(), calendarEvent.getCalendarId()) || (calendarEvent.getAttendees().size() != 0 && calendarEvent.organizerIsAttend()))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7, r0) == false) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo113576b(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent r6, com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar r7) {
        /*
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L_0x0008
            com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar$AccessRole r1 = r7.getSelfAccessRole()
            goto L_0x0009
        L_0x0008:
            r1 = r0
        L_0x0009:
            com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar$AccessRole r2 = com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar.AccessRole.OWNER
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L_0x001e
            if (r7 == 0) goto L_0x0016
            com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar$AccessRole r7 = r7.getSelfAccessRole()
            goto L_0x0017
        L_0x0016:
            r7 = r0
        L_0x0017:
            com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar$AccessRole r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar.AccessRole.WRITER
            if (r7 != r1) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r7 = 0
            goto L_0x001f
        L_0x001e:
            r7 = 1
        L_0x001f:
            if (r7 == 0) goto L_0x0045
            if (r6 == 0) goto L_0x0028
            java.lang.String r7 = r6.getOrganizerCalendarId()
            goto L_0x0029
        L_0x0028:
            r7 = r0
        L_0x0029:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x0045
            if (r6 == 0) goto L_0x0038
            java.lang.String r7 = r6.getOrganizerCalendarId()
            goto L_0x0039
        L_0x0038:
            r7 = r0
        L_0x0039:
            if (r6 == 0) goto L_0x003f
            java.lang.String r0 = r6.getCalendarId()
        L_0x003f:
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            if (r7 != 0) goto L_0x004d
        L_0x0045:
            if (r6 == 0) goto L_0x004e
            boolean r6 = r6.isGuestsCanSeeOtherGuests()
            if (r6 != r4) goto L_0x004e
        L_0x004d:
            r3 = 1
        L_0x004e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.detail.utils.AuthorityUtil.mo113576b(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent, com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar):boolean");
    }
}
