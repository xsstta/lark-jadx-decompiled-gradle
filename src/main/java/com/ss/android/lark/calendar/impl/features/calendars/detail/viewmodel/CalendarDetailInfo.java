package com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel;

import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.p1446a.C30237a;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32635ai;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30039ah;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010+\u001a\u00020\bH\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0011\u0010\u0019\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u001a\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\u001b\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u001c\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u001d\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\nR\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0012R\u000e\u0010&\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0013\u0010'\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\nR\u0011\u0010)\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\n¨\u0006,"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarDetailInfo;", "", "calendar", "Lcom/bytedance/lark/pb/calendar/v1/Calendar;", "calendarOwner", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarMemberInfo;", "(Lcom/bytedance/lark/pb/calendar/v1/Calendar;Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarMemberInfo;)V", "calServerId", "", "getCalServerId", "()Ljava/lang/String;", "getCalendar", "()Lcom/bytedance/lark/pb/calendar/v1/Calendar;", "getCalendarOwner", "()Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarMemberInfo;", "canUnsubscribe", "", "getCanUnsubscribe", "()Z", "color", "", "getColor", "()I", "desc", "getDesc", "isDeletable", "isEditable", "isPrimary", "isSelfPrimary", "isSubscriber", "originCoverKey", "getOriginCoverKey", "selfAccessRole", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$AccessRole;", "getSelfAccessRole", "()Lcom/bytedance/lark/pb/calendar/v1/Calendar$AccessRole;", "showExternalLabel", "getShowExternalLabel", "subscribeCount", "subscribeCountString", "getSubscribeCountString", "summary", "getSummary", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.c */
public final class CalendarDetailInfo {

    /* renamed from: a */
    private final String f75614a;

    /* renamed from: b */
    private final Calendar.AccessRole f75615b;

    /* renamed from: c */
    private final boolean f75616c;

    /* renamed from: d */
    private final boolean f75617d;

    /* renamed from: e */
    private final String f75618e;

    /* renamed from: f */
    private final String f75619f;

    /* renamed from: g */
    private final String f75620g;

    /* renamed from: h */
    private final int f75621h;

    /* renamed from: i */
    private final boolean f75622i;

    /* renamed from: j */
    private final String f75623j;

    /* renamed from: k */
    private final String f75624k;

    /* renamed from: l */
    private final boolean f75625l;

    /* renamed from: m */
    private final boolean f75626m;

    /* renamed from: n */
    private final boolean f75627n;

    /* renamed from: o */
    private final boolean f75628o;

    /* renamed from: p */
    private final Calendar f75629p;

    /* renamed from: q */
    private final CalendarMemberInfo f75630q;

    /* renamed from: a */
    public final String mo109177a() {
        return this.f75614a;
    }

    /* renamed from: b */
    public final boolean mo109178b() {
        return this.f75616c;
    }

    /* renamed from: c */
    public final String mo109179c() {
        return this.f75618e;
    }

    /* renamed from: d */
    public final String mo109180d() {
        return this.f75619f;
    }

    /* renamed from: e */
    public final String mo109181e() {
        return this.f75620g;
    }

    /* renamed from: f */
    public final int mo109182f() {
        return this.f75621h;
    }

    /* renamed from: g */
    public final boolean mo109183g() {
        return this.f75622i;
    }

    /* renamed from: h */
    public final String mo109184h() {
        return this.f75624k;
    }

    /* renamed from: i */
    public final boolean mo109185i() {
        return this.f75625l;
    }

    /* renamed from: j */
    public final boolean mo109186j() {
        return this.f75626m;
    }

    /* renamed from: k */
    public final boolean mo109187k() {
        return this.f75627n;
    }

    /* renamed from: l */
    public final boolean mo109188l() {
        return this.f75628o;
    }

    /* renamed from: m */
    public final Calendar mo109189m() {
        return this.f75629p;
    }

    /* renamed from: n */
    public final CalendarMemberInfo mo109190n() {
        return this.f75630q;
    }

    public String toString() {
        return "CalendarDetailInfo{" + this.f75614a + '}';
    }

    public CalendarDetailInfo(Calendar calendar, CalendarMemberInfo eVar) {
        boolean z;
        String str;
        String str2;
        Integer num;
        String a;
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        this.f75629p = calendar;
        this.f75630q = eVar;
        String str3 = calendar.server_id;
        String str4 = "";
        this.f75614a = str3 == null ? str4 : str3;
        Calendar.AccessRole accessRole = calendar.self_access_role;
        this.f75615b = accessRole == null ? Calendar.AccessRole.UNKNOWN_ACCESS_ROLE : accessRole;
        this.f75616c = C30237a.m112295a(calendar);
        int i = 0;
        if (!C30237a.m112295a(calendar) || !Intrinsics.areEqual((Object) calendar.is_primary, (Object) true)) {
            z = false;
        } else {
            z = true;
        }
        this.f75617d = z;
        this.f75618e = C30237a.m112308h(calendar);
        String e = C30237a.m112305e(calendar);
        if (!(e == null || (a = C32635ai.m125200a(e, 100)) == null)) {
            str4 = a;
        }
        this.f75619f = str4;
        String str5 = calendar.description;
        String str6 = null;
        if (str5 != null) {
            str = C32635ai.m125200a(str5, 250);
        } else {
            str = null;
        }
        this.f75620g = str;
        Integer num2 = calendar.background_color;
        this.f75621h = num2 != null ? num2.intValue() : i;
        AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
        Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
        this.f75622i = C30237a.m112301b(calendar, loginDependency.mo108271c());
        AbstractC30039ah utilsDependency = C30022a.f74882a.utilsDependency();
        Calendar.CalendarShareInfo calendarShareInfo = calendar.share_info;
        String a2 = utilsDependency.mo108195a(R.string.Calendar_Onboarding_NumberSubscribe, "number", (calendarShareInfo == null || (num = calendarShareInfo.subscriber_num) == null || (str2 = String.valueOf(num.intValue())) == null) ? "0" : str2);
        Intrinsics.checkExpressionValueIsNotNull(a2, "CalendarDependencyHolder…?.toString() ?: \"0\"\n    )");
        this.f75623j = a2;
        if (C30237a.m112307g(calendar)) {
            AbstractC30054s loginDependency2 = C30022a.f74882a.loginDependency();
            Intrinsics.checkExpressionValueIsNotNull(loginDependency2, "CalendarDependencyHolder…endency.loginDependency()");
            if (C30237a.m112303c(calendar, loginDependency2.mo108271c())) {
                str6 = a2 + " · " + C32634ae.m125182b(R.string.Calendar_Onboarding_IncludeExternalContacts);
            } else {
                str6 = a2;
            }
        }
        this.f75624k = str6;
        Boolean bool = calendar.is_subscriber;
        Intrinsics.checkExpressionValueIsNotNull(bool, "calendar.is_subscriber");
        this.f75625l = bool.booleanValue();
        this.f75626m = Intrinsics.areEqual((Object) C30237a.m112315o(calendar), (Object) true);
        this.f75627n = C30237a.m112306f(calendar);
        this.f75628o = Intrinsics.areEqual((Object) C30237a.m112316p(calendar), (Object) true);
    }
}
