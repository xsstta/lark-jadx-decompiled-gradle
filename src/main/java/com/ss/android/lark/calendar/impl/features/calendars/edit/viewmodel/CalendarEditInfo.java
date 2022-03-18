package com.ss.android.lark.calendar.impl.features.calendars.edit.viewmodel;

import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarSaveInfo;
import com.bytedance.lark.pb.calendar.v1.CalendarTenantInfo;
import com.bytedance.lark.pb.calendar.v1.UserCalendarInfo;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarMemberInfo;
import com.ss.android.lark.calendar.impl.features.calendars.p1446a.C30237a;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarDetailService;
import com.ss.android.lark.calendar.impl.utils.C32635ai;
import com.ss.android.lark.calendar.p1430a.C30022a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0006\u0010H\u001a\u00020\u0003J\u0006\u0010I\u001a\u00020\u0003J\u0006\u0010J\u001a\u00020KJ\u0016\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\f2\u0006\u0010O\u001a\u00020\fJ\b\u0010P\u001a\u00020\fH\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0017\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\f@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\u001a\u0010)\u001a\u00020*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R\u0011\u00102\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u00104\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0011\u00105\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0011\u00106\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0011\u00107\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u00103R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u00103R\u0011\u00108\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00103R\u0011\u00109\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u00103R\u0011\u0010:\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u00103R\u0011\u0010;\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u00103R\"\u0010<\u001a\u0004\u0018\u00010\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\f@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u000eR\u0011\u0010>\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010B\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\bC\u0010,R\u0011\u0010D\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bF\u0010G¨\u0006Q"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/edit/viewmodel/CalendarEditInfo;", "", "isNewCreate", "", "calendar", "Lcom/bytedance/lark/pb/calendar/v1/Calendar;", "owner", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarMemberInfo;", "tenantInfo", "Lcom/bytedance/lark/pb/calendar/v1/CalendarTenantInfo;", "(ZLcom/bytedance/lark/pb/calendar/v1/Calendar;Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarMemberInfo;Lcom/bytedance/lark/pb/calendar/v1/CalendarTenantInfo;)V", "calServerId", "", "getCalServerId", "()Ljava/lang/String;", "getCalendar", "()Lcom/bytedance/lark/pb/calendar/v1/Calendar;", "color", "", "getColor", "()I", "coverKey", "getCoverKey", "desc", "getDesc", "editColor", "getEditColor", "setEditColor", "(I)V", "<set-?>", "editCoverKey", "getEditCoverKey", "editDesc", "", "getEditDesc", "()Ljava/lang/CharSequence;", "setEditDesc", "(Ljava/lang/CharSequence;)V", "editNote", "getEditNote", "setEditNote", "editShareOption", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;", "getEditShareOption", "()Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;", "setEditShareOption", "(Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;)V", "editSummary", "getEditSummary", "setEditSummary", "isAllStaff", "()Z", "isColorEditable", "isCoverEditable", "isDeletable", "isDescriptionEditable", "isNoteEditable", "isPrimary", "isSummaryEditable", "isVisibilityEditable", "localCoverPath", "getLocalCoverPath", "note", "getNote", "getOwner", "()Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarMemberInfo;", "shareOption", "getShareOption", "summary", "getSummary", "getTenantInfo", "()Lcom/bytedance/lark/pb/calendar/v1/CalendarTenantInfo;", "canSave", "hasChanged", "newSaveInfo", "Lcom/bytedance/lark/pb/calendar/v1/CalendarSaveInfo;", "setNewCover", "", "localPath", "key", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.edit.a.a */
public final class CalendarEditInfo {

    /* renamed from: A */
    private final CalendarTenantInfo f75739A;

    /* renamed from: a */
    private final String f75740a;

    /* renamed from: b */
    private final boolean f75741b;

    /* renamed from: c */
    private final boolean f75742c;

    /* renamed from: d */
    private final String f75743d;

    /* renamed from: e */
    private String f75744e;

    /* renamed from: f */
    private String f75745f;

    /* renamed from: g */
    private final String f75746g;

    /* renamed from: h */
    private CharSequence f75747h;

    /* renamed from: i */
    private final String f75748i;

    /* renamed from: j */
    private CharSequence f75749j;

    /* renamed from: k */
    private final String f75750k;

    /* renamed from: l */
    private CharSequence f75751l;

    /* renamed from: m */
    private final int f75752m;

    /* renamed from: n */
    private int f75753n;

    /* renamed from: o */
    private final Calendar.CalendarShareOptions f75754o;

    /* renamed from: p */
    private Calendar.CalendarShareOptions f75755p;

    /* renamed from: q */
    private final boolean f75756q;

    /* renamed from: r */
    private final boolean f75757r;

    /* renamed from: s */
    private final boolean f75758s;

    /* renamed from: t */
    private final boolean f75759t;

    /* renamed from: u */
    private final boolean f75760u;

    /* renamed from: v */
    private final boolean f75761v;

    /* renamed from: w */
    private final boolean f75762w;

    /* renamed from: x */
    private final boolean f75763x;

    /* renamed from: y */
    private final Calendar f75764y;

    /* renamed from: z */
    private final CalendarMemberInfo f75765z;

    /* renamed from: a */
    public final String mo109295a() {
        return this.f75740a;
    }

    /* renamed from: d */
    public final String mo109304d() {
        return this.f75743d;
    }

    /* renamed from: e */
    public final String mo109305e() {
        return this.f75745f;
    }

    /* renamed from: f */
    public final CharSequence mo109306f() {
        return this.f75747h;
    }

    /* renamed from: g */
    public final String mo109307g() {
        return this.f75748i;
    }

    /* renamed from: h */
    public final CharSequence mo109308h() {
        return this.f75749j;
    }

    /* renamed from: i */
    public final CharSequence mo109309i() {
        return this.f75751l;
    }

    /* renamed from: j */
    public final int mo109310j() {
        return this.f75753n;
    }

    /* renamed from: k */
    public final Calendar.CalendarShareOptions mo109311k() {
        return this.f75755p;
    }

    /* renamed from: l */
    public final boolean mo109312l() {
        return this.f75756q;
    }

    /* renamed from: m */
    public final boolean mo109313m() {
        return this.f75757r;
    }

    /* renamed from: n */
    public final boolean mo109314n() {
        return this.f75758s;
    }

    /* renamed from: o */
    public final boolean mo109315o() {
        return this.f75759t;
    }

    /* renamed from: p */
    public final boolean mo109316p() {
        return this.f75760u;
    }

    /* renamed from: q */
    public final boolean mo109317q() {
        return this.f75761v;
    }

    /* renamed from: u */
    public final boolean mo109322u() {
        return this.f75763x;
    }

    /* renamed from: v */
    public final Calendar mo109323v() {
        return this.f75764y;
    }

    /* renamed from: w */
    public final CalendarMemberInfo mo109324w() {
        return this.f75765z;
    }

    /* renamed from: x */
    public final CalendarTenantInfo mo109325x() {
        return this.f75739A;
    }

    /* renamed from: b */
    public final boolean mo109301b() {
        return this.f75741b;
    }

    /* renamed from: c */
    public final boolean mo109303c() {
        return this.f75742c;
    }

    public String toString() {
        return "CalendarDetailInfo(" + this.f75764y.server_id + ')';
    }

    /* renamed from: r */
    public final boolean mo109318r() {
        boolean z;
        int i;
        int i2;
        int i3;
        CharSequence charSequence = this.f75747h;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            CharSequence charSequence2 = this.f75747h;
            if (charSequence2 != null) {
                i = charSequence2.length();
            } else {
                i = 0;
            }
            if (i <= 100) {
                CharSequence charSequence3 = this.f75749j;
                if (charSequence3 != null) {
                    i2 = charSequence3.length();
                } else {
                    i2 = 0;
                }
                if (i2 > 100) {
                    return false;
                }
                CharSequence charSequence4 = this.f75751l;
                if (charSequence4 != null) {
                    i3 = charSequence4.length();
                } else {
                    i3 = 0;
                }
                if (i3 > 250) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public final boolean mo109319s() {
        String str;
        String str2;
        String obj;
        if ((!Intrinsics.areEqual(this.f75743d, this.f75744e)) || !C30237a.m112294a(this.f75754o, this.f75755p) || this.f75752m != this.f75753n) {
            return true;
        }
        String str3 = this.f75746g;
        CharSequence charSequence = this.f75747h;
        String str4 = "";
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = str4;
        }
        if (!Intrinsics.areEqual(str3, str)) {
            return true;
        }
        String str5 = this.f75748i;
        CharSequence charSequence2 = this.f75749j;
        if (charSequence2 == null || (str2 = charSequence2.toString()) == null) {
            str2 = str4;
        }
        if (!Intrinsics.areEqual(str5, str2)) {
            return true;
        }
        String str6 = this.f75750k;
        CharSequence charSequence3 = this.f75751l;
        if (!(charSequence3 == null || (obj = charSequence3.toString()) == null)) {
            str4 = obj;
        }
        if (!Intrinsics.areEqual(str6, str4)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final CalendarSaveInfo mo109320t() {
        boolean z;
        String str;
        String str2;
        String str3;
        String obj;
        CalendarSaveInfo.C15558a aVar = new CalendarSaveInfo.C15558a();
        boolean z2 = false;
        if (this.f75740a.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "0";
        } else {
            str = this.f75740a;
        }
        CalendarSaveInfo.C15558a a = aVar.mo56439a(str);
        String str4 = this.f75744e;
        if ((!Intrinsics.areEqual(str4, this.f75743d)) && str4 != null) {
            if (str4.length() > 0) {
                z2 = true;
            }
            if (z2) {
                a.mo56443d(str4);
            }
        }
        CharSequence charSequence = this.f75747h;
        String str5 = "";
        if (charSequence == null || (str2 = charSequence.toString()) == null) {
            str2 = str5;
        }
        if ((!Intrinsics.areEqual(str2, this.f75746g)) || this.f75763x) {
            a.mo56441b(str2);
        }
        CharSequence charSequence2 = this.f75751l;
        if (charSequence2 == null || (str3 = charSequence2.toString()) == null) {
            str3 = str5;
        }
        if ((!Intrinsics.areEqual(str3, this.f75750k)) || this.f75763x) {
            a.mo56442c(str3);
        }
        if (!C30237a.m112294a(this.f75754o, this.f75755p) || this.f75763x) {
            a.mo56436a(this.f75755p);
        }
        UserCalendarInfo.C16114a aVar2 = new UserCalendarInfo.C16114a();
        CharSequence charSequence3 = this.f75749j;
        if (!(charSequence3 == null || (obj = charSequence3.toString()) == null)) {
            str5 = obj;
        }
        if (true ^ Intrinsics.areEqual(str5, this.f75748i)) {
            aVar2.mo57880a(str5);
        }
        int i = this.f75753n;
        if (i != this.f75752m || this.f75763x) {
            aVar2.mo57879a(Integer.valueOf(i));
        }
        a.mo56438a(aVar2.build());
        CalendarSaveInfo a2 = a.build();
        Intrinsics.checkExpressionValueIsNotNull(a2, "builder.build()");
        return a2;
    }

    /* renamed from: b */
    public final void mo109300b(CharSequence charSequence) {
        this.f75749j = charSequence;
    }

    /* renamed from: c */
    public final void mo109302c(CharSequence charSequence) {
        this.f75751l = charSequence;
    }

    /* renamed from: a */
    public final void mo109296a(int i) {
        this.f75753n = i;
    }

    /* renamed from: a */
    public final void mo109297a(Calendar.CalendarShareOptions calendarShareOptions) {
        Intrinsics.checkParameterIsNotNull(calendarShareOptions, "<set-?>");
        this.f75755p = calendarShareOptions;
    }

    /* renamed from: a */
    public final void mo109298a(CharSequence charSequence) {
        this.f75747h = charSequence;
    }

    /* renamed from: a */
    public final void mo109299a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "localPath");
        Intrinsics.checkParameterIsNotNull(str2, "key");
        this.f75745f = str;
        this.f75744e = str2;
    }

    public CalendarEditInfo(boolean z, Calendar calendar, CalendarMemberInfo eVar, CalendarTenantInfo calendarTenantInfo) {
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String a;
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        this.f75763x = z;
        this.f75764y = calendar;
        this.f75765z = eVar;
        this.f75739A = calendarTenantInfo;
        String str = calendar.server_id;
        String str2 = "";
        this.f75740a = str == null ? str2 : str;
        this.f75741b = C30237a.m112295a(calendar);
        boolean z8 = true;
        this.f75742c = Intrinsics.areEqual((Object) calendar.is_all_staff, (Object) true);
        String h = C30237a.m112308h(calendar);
        this.f75743d = h;
        this.f75744e = h;
        String d = C30237a.m112304d(calendar);
        String str3 = (d == null || (str3 = C32635ai.m125200a(d, 100)) == null) ? str2 : str3;
        this.f75746g = str3;
        this.f75747h = str3;
        String str4 = calendar.note;
        String str5 = (str4 == null || (str5 = C32635ai.m125200a(str4, 100)) == null) ? str2 : str5;
        this.f75748i = str5;
        this.f75749j = str5;
        String str6 = calendar.description;
        if (!(str6 == null || (a = C32635ai.m125200a(str6, 250)) == null)) {
            str2 = a;
        }
        this.f75750k = str2;
        this.f75751l = str2;
        Integer num = calendar.background_color;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        this.f75752m = i;
        this.f75753n = i;
        Calendar.CalendarShareOptions calendarShareOptions = calendar.share_options;
        calendarShareOptions = calendarShareOptions == null ? CalendarDetailService.f83432a.mo118831a() : calendarShareOptions;
        this.f75754o = calendarShareOptions;
        this.f75755p = calendarShareOptions;
        if (z || Intrinsics.areEqual((Object) C30237a.m112309i(calendar), (Object) true)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f75756q = z2;
        if (z || Intrinsics.areEqual((Object) C30237a.m112310j(calendar), (Object) true)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f75757r = z3;
        if (C30022a.f74883b.mo112688B() || z || !Intrinsics.areEqual((Object) C30237a.m112311k(calendar), (Object) true)) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f75758s = z4;
        if (z || Intrinsics.areEqual((Object) C30237a.m112312l(calendar), (Object) true)) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f75759t = z5;
        if (z || Intrinsics.areEqual((Object) C30237a.m112313m(calendar), (Object) true)) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f75760u = z6;
        if (z || Intrinsics.areEqual((Object) C30237a.m112314n(calendar), (Object) true)) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f75761v = z7;
        if (!z && !Intrinsics.areEqual((Object) C30237a.m112316p(calendar), (Object) true)) {
            z8 = false;
        }
        this.f75762w = z8;
    }
}
