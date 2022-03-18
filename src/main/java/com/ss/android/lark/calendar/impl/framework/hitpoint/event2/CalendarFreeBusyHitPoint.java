package com.ss.android.lark.calendar.impl.framework.hitpoint.event2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004J!\u0010\u0010\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/hitpoint/event2/CalendarFreeBusyHitPoint;", "", "()V", "CHANGE_LIST", "", "CHANGE_MEMBER", "CHAT_ID", "DAY_CHANGE", "FULL_CREATE_EVENT", "HAS_EVENT", "isFirstFlag", "", "chatCalendarClick", "", "click", "chatId", "chatCalendarViewShow", "hasEvent", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "clearViewShowFlag", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.c.d */
public final class CalendarFreeBusyHitPoint {

    /* renamed from: a */
    public static final CalendarFreeBusyHitPoint f83363a = new CalendarFreeBusyHitPoint();

    /* renamed from: b */
    private static volatile boolean f83364b;

    /* renamed from: a */
    public final void mo118754a() {
        f83364b = true;
    }

    private CalendarFreeBusyHitPoint() {
    }

    /* renamed from: a */
    public final void mo118755a(Boolean bool, String str) {
        if (f83364b) {
            new HitPointEvent("cal_calendar_chat_view").mo118758a("has_event", HitPointUtil.m124399a(bool)).mo118758a("chat_id", str).mo118759a();
            f83364b = false;
        }
    }

    /* renamed from: a */
    public final void mo118756a(String str, String str2) {
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "click");
        HitPointEvent kVar = new HitPointEvent("cal_calendar_chat_click");
        if (str.hashCode() == 1598878023 && str.equals("full_create_event")) {
            str3 = "cal_event_full_create_view";
        } else {
            str3 = "none";
        }
        kVar.mo118757a(str).mo118758a("chat_id", str2).mo118760b(str3).mo118759a();
    }
}
