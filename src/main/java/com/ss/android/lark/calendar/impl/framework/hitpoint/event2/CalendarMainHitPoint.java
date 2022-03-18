package com.ss.android.lark.calendar.impl.framework.hitpoint.event2;

import com.ss.android.lark.calendar.impl.features.calendarview.p1467c.C30667a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.c.f */
public final class CalendarMainHitPoint {

    /* renamed from: a */
    public static final CalendarMainHitPoint f83365a = new CalendarMainHitPoint();

    private CalendarMainHitPoint() {
    }

    /* renamed from: a */
    public static final void m124362a() {
        new HitPointEvent("cal_calendar_main_view").mo118758a("view_type", HitPointUtil.m124398a(C30667a.m114024f())).mo118759a();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static final void m124363a(String str, String str2, Long l) {
        Intrinsics.checkParameterIsNotNull(str, "clickTarget");
        HitPointEvent a = new HitPointEvent("cal_calendar_main_click").mo118757a(str);
        switch (str.hashCode()) {
            case 13459850:
                if (str.equals("calendar_list_open")) {
                    a.mo118760b("cal_calendar_list_view");
                    break;
                }
                a.mo118760b("none");
                break;
            case 237528395:
                if (str.equals("change_event")) {
                    if (str2 != null) {
                        a.mo118761c(str2);
                    }
                    if (l != null) {
                        a.mo118762d(String.valueOf(l.longValue()));
                    }
                    a.mo118760b("none");
                    break;
                }
                a.mo118760b("none");
                break;
            case 1077597865:
                if (str.equals("quick_create_event")) {
                    a.mo118760b("cal_event_full_create_view");
                    break;
                }
                a.mo118760b("none");
                break;
            case 1942475165:
                if (str.equals("event_details")) {
                    if (str2 != null) {
                        a.mo118761c(str2);
                    }
                    if (l != null) {
                        a.mo118762d(String.valueOf(l.longValue()));
                    }
                    a.mo118760b("cal_event_detail_view");
                    break;
                }
                a.mo118760b("none");
                break;
            default:
                a.mo118760b("none");
                break;
        }
        a.mo118759a();
    }

    /* renamed from: a */
    public static /* synthetic */ void m124364a(String str, String str2, Long l, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        m124363a(str, str2, l);
    }
}
