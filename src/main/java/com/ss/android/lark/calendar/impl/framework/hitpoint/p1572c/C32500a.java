package com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c;

import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.HitPointEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\f\u001a\u0006\u0010\r\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"CAL_CALENDAR_CREATE_CLICK", "", "CAL_CALENDAR_CREATE_INVITE_VIEW", "CAL_CALENDAR_CREATE_VIEW", "CLICK_EDIT_PUBLIC_SCALE", "CLICK_SAVE", "HAS_DESCRIPTION", "calCalendarCreateClick", "", "hasDesc", "", "click", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "calCalendarCreateView", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.c.a */
public final class C32500a {
    /* renamed from: a */
    public static final void m124322a() {
        new HitPointEvent("cal_calendar_create_view").mo118759a();
    }

    /* renamed from: a */
    public static final void m124325a(boolean z) {
        HitPointEvent.Companion aVar = HitPointEvent.f83368a;
        HitPointEvent kVar = new HitPointEvent("cal_calendar_create_click");
        kVar.mo118757a("save");
        kVar.mo118760b("cal_calendar_create_invite_view");
        kVar.mo118758a("has_description", String.valueOf(z));
        kVar.mo118759a();
    }

    /* renamed from: a */
    public static final void m124323a(String str, Boolean bool) {
        HitPointEvent kVar;
        String valueOf;
        Intrinsics.checkParameterIsNotNull(str, "click");
        int hashCode = str.hashCode();
        String str2 = "none";
        if (hashCode != -631601143) {
            if (hashCode == 3522941 && str.equals("save")) {
                HitPointEvent b = new HitPointEvent("cal_calendar_create_click").mo118760b(str2);
                if (!(bool == null || (valueOf = String.valueOf(bool.booleanValue())) == null)) {
                    str2 = valueOf;
                }
                kVar = b.mo118758a("has_description", str2);
            } else {
                return;
            }
        } else if (str.equals("edit_public_scale")) {
            kVar = new HitPointEvent("cal_calendar_create_click").mo118760b(str2);
        } else {
            return;
        }
        kVar.mo118757a(str).mo118759a();
    }

    /* renamed from: a */
    public static /* synthetic */ void m124324a(String str, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        m124323a(str, bool);
    }
}
