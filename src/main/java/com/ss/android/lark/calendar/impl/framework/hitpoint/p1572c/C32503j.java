package com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u001a\u0006\u0010\u000f\u001a\u00020\f\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"CALENDAR_ID", "", "CAL_CALENDAR_SUBSCRIBE_CLICK", "CAL_CALENDAR_SUBSCRIBE_VIEW", "CLICK_SUBSCRIBE_CONTACT_CAL", "CLICK_SUBSCRIBE_PUBLIC_CAL", "CLICK_SUBSCRIBE_RESOURCE_CAL", "CLICK_UNSUBSCRIBE_CONTACT_CAL", "CLICK_UNSUBSCRIBE_PUBLIC_CAL", "CLICK_UNSUBSCRIBE_RESOURCE_CAL", "NONE", "calCalendarSubscribeClick", "", "click", "calendarId", "calCalendarSubscribeView", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.c.j */
public final class C32503j {
    /* renamed from: a */
    public static final void m124386a() {
        new HitPointEvent("cal_calendar_subscribe_view").mo118759a();
    }

    /* renamed from: a */
    public static final void m124387a(String str, String str2) {
        if (str != null) {
            new HitPointEvent("cal_calendar_subscribe_click").mo118757a(str).mo118760b("none").mo118758a("calendar_id", str2).mo118759a();
        }
    }
}
