package com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c;

import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.HitPointEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\b\u001a\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001\u001a\u0006\u0010\u0018\u001a\u00020\u0016\u001a\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001\u001a\u0006\u0010\u001a\u001a\u00020\u0016\u001a\u001a\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0001\u001a\u0006\u0010\u001d\u001a\u00020\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"CAL_CALENDAR_ACTION_LIST_CLICK", "", "CAL_CALENDAR_ACTION_LIST_VIEW", "CAL_CALENDAR_ADD_ACTION_LIST_CLICK", "CAL_CALENDAR_ADD_ACTION_LIST_VIEW", "CAL_CALENDAR_CREATE_VIEW", "CAL_CALENDAR_DETAIL_VIEW", "CAL_CALENDAR_LIST_VIEW", "CAL_CALENDAR_SUBSCRIBE_VIEW", "CAL_TRIPARTITE_ADD_VIEW", "CLICK_ADD_CAL", "CLICK_CALENDAR_DETAIL", "CLICK_CALENDAR_MAIN_SETTING", "CLICK_DAY_VIEW", "CLICK_LIST_ADD_CAL", "CLICK_LIST_SUB_CAL", "CLICK_LIST_VIEW", "CLICK_MONTH_VIEW", "CLICK_SUBSCRIBE_CAL", "CLICK_THREE_DAY_VIEW", "CLICK_TRIPARTITE_ADD", "calCalendarActionListClick", "", "click", "calCalendarActionListView", "calCalendarAddActionListClick", "calCalendarAddActionListView", "calCalendarListClick", "calendarServerId", "calCalendarListView", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.c.e */
public final class C32501e {
    /* renamed from: a */
    public static final void m124355a() {
        new HitPointEvent("cal_calendar_list_view").mo118759a();
    }

    /* renamed from: b */
    public static final void m124359b() {
        HitPointEvent.Companion aVar = HitPointEvent.f83368a;
        new HitPointEvent("cal_calendar_add_action_list_view").mo118759a();
    }

    /* renamed from: c */
    public static final void m124361c() {
        new HitPointEvent("cal_calendar_action_list_view").mo118759a();
    }

    /* renamed from: a */
    public static final void m124356a(String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "click");
        HitPointEvent.Companion aVar = HitPointEvent.f83368a;
        HitPointEvent kVar = new HitPointEvent("cal_calendar_add_action_list_click");
        kVar.mo118757a(str);
        int hashCode = str.hashCode();
        if (hashCode != -1148260560) {
            if (hashCode == 20270494 && str.equals("tripartite_add")) {
                str2 = "cal_tripartite_add_view";
                kVar.mo118760b(str2);
                kVar.mo118759a();
            }
        } else if (str.equals("add_cal")) {
            str2 = "cal_calendar_create_view";
            kVar.mo118760b(str2);
            kVar.mo118759a();
        }
        str2 = "none";
        kVar.mo118760b(str2);
        kVar.mo118759a();
    }

    /* renamed from: b */
    public static final void m124360b(String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "click");
        int hashCode = str.hashCode();
        if (hashCode != -1148260560) {
            if (hashCode != 20270494) {
                if (hashCode == 1572394841 && str.equals("subscribe_cal")) {
                    str2 = "cal_calendar_subscribe_view";
                } else {
                    return;
                }
            } else if (str.equals("tripartite_add")) {
                str2 = "cal_tripartite_add_view";
            } else {
                return;
            }
        } else if (str.equals("add_cal")) {
            str2 = "cal_calendar_create_view";
        } else {
            return;
        }
        new HitPointEvent("cal_calendar_action_list_click").mo118757a(str).mo118760b(str2).mo118759a();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r4.equals("list_view") != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r4.equals("month_view") != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        r1 = "cal_calendar_main_view";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        if (r4.equals("day_view") != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        if (r4.equals("three_day_view") != false) goto L_0x005f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m124357a(java.lang.String r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32501e.m124357a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static /* synthetic */ void m124358a(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        m124357a(str, str2);
    }
}
