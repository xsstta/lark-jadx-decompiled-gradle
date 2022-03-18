package com.ss.android.lark.calendar.impl.framework.hitpoint.event2;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\fJ!\u0010\r\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/hitpoint/event2/CalendarNotificationHitPoint;", "", "()V", "CLOSE", "", "DETAIL", "calendarNotificationClick", "", "eventId", "startTime", "", "click", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "calendarNotificationShow", "(Ljava/lang/String;Ljava/lang/Long;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.c.g */
public final class CalendarNotificationHitPoint {

    /* renamed from: a */
    public static final CalendarNotificationHitPoint f83366a = new CalendarNotificationHitPoint();

    private CalendarNotificationHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124365a(String str, Long l) {
        String str2;
        HitPointEvent c = new HitPointEvent("cal_event_notification_view").mo118761c(HitPointUtil.m124400a(str));
        if (l != null) {
            str2 = String.valueOf(l.longValue());
        } else {
            str2 = null;
        }
        c.mo118762d(str2).mo118759a();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124366a(String str, Long l, String str2) {
        String str3;
        String str4;
        Intrinsics.checkParameterIsNotNull(str2, "click");
        HitPointEvent kVar = new HitPointEvent("cal_event_notification_click");
        if (str2.hashCode() == -765765692 && str2.equals("check_more_detail")) {
            str3 = "cal_event_detail_view";
        } else {
            str3 = "none";
        }
        HitPointEvent c = kVar.mo118757a(str2).mo118761c(str);
        if (l != null) {
            str4 = String.valueOf(l.longValue());
        } else {
            str4 = null;
        }
        c.mo118762d(str4).mo118760b(str3).mo118759a();
    }
}
