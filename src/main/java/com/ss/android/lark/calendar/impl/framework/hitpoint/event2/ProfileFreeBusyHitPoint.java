package com.ss.android.lark.calendar.impl.framework.hitpoint.event2;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/hitpoint/event2/ProfileFreeBusyHitPoint;", "", "()V", "CLICK_CREATE_EVENT", "", "CLICK_DAY_CHANGE", "profileFreeBusyPageClick", "", "clickTarget", "profileFreeBusyPageShow", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.c.m */
public final class ProfileFreeBusyHitPoint {

    /* renamed from: a */
    public static final ProfileFreeBusyHitPoint f83372a = new ProfileFreeBusyHitPoint();

    private ProfileFreeBusyHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124402a() {
        new HitPointEvent("cal_calendar_profile_view").mo118759a();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124403a(String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "clickTarget");
        HitPointEvent a = new HitPointEvent("cal_calendar_profile_click").mo118757a(str);
        if (str.hashCode() == 1598878023 && str.equals("full_create_event")) {
            str2 = "cal_event_full_create_view";
        } else {
            str2 = "none";
        }
        a.mo118760b(str2).mo118759a();
    }
}
