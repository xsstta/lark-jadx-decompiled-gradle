package com.ss.android.lark.calendar.impl.framework.hitpoint.event2;

import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.HitPointEvent;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u001a\u0010\r\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\u0012\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/hitpoint/event2/CalendarSettingHitPoint;", "", "()V", "CAL_CALENDAR_DELETE_CONFIRM_VIEW", "", "CAL_CALENDAR_DETAIL_VIEW", "CAL_TRIPARTITE_MANAGE_VIEW", "HAS_ALIAS", "NONE", "calCalendarSettingClick", "", "calendarId", "clickValue", "calCalendarSettingClickSave", "aliasChanged", "", "calCalendarSettingView", "settingCalendarClick", "settingCalendarView", "SettingClickValue", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.c.h */
public final class CalendarSettingHitPoint {

    /* renamed from: a */
    public static final CalendarSettingHitPoint f83367a = new CalendarSettingHitPoint();

    private CalendarSettingHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124367a() {
        new HitPointEvent("setting_calendar_view").mo118759a();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124368a(String str) {
        new HitPointEvent("cal_calendar_setting_view").mo118764f(str).mo118759a();
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m124371b(String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "clickValue");
        HitPointEvent a = new HitPointEvent("setting_calendar_click").mo118757a(str);
        if (str.hashCode() == 392567943 && str.equals("calendar_tripartite_manage")) {
            str2 = "cal_tripartite_manage_view";
        } else {
            str2 = "none";
        }
        a.mo118760b(str2).mo118759a();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124369a(String str, String str2) {
        String str3;
        Intrinsics.checkParameterIsNotNull(str2, "clickValue");
        HitPointEvent a = new HitPointEvent("cal_calendar_setting_click").mo118764f(str).mo118757a(str2);
        if (str2.hashCode() == -1309550766 && str2.equals("delete_calendar")) {
            str3 = "cal_calendar_delete_confirm_view";
        } else {
            str3 = "none";
        }
        a.mo118760b(str3).mo118759a();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124370a(String str, boolean z) {
        HitPointEvent.Companion aVar = HitPointEvent.f83368a;
        HitPointEvent kVar = new HitPointEvent("cal_calendar_setting_click");
        kVar.mo118764f(str);
        kVar.mo118757a("save");
        kVar.mo118760b("cal_calendar_detail_view");
        kVar.mo118758a("has_alias", String.valueOf(z));
        kVar.mo118759a();
    }
}
