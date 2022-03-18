package com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel;

import com.bytedance.lark.pb.calendar.v1.Calendar;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarMemberInfo;", "", "id", "", "name", "avatarKey", "accessRole", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$AccessRole;", "isOwner", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/lark/pb/calendar/v1/Calendar$AccessRole;Z)V", "getAccessRole", "()Lcom/bytedance/lark/pb/calendar/v1/Calendar$AccessRole;", "getAvatarKey", "()Ljava/lang/String;", "getId", "()Z", "getName", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.e */
public final class CalendarMemberInfo {

    /* renamed from: a */
    private final String f75631a;

    /* renamed from: b */
    private final String f75632b;

    /* renamed from: c */
    private final String f75633c;

    /* renamed from: d */
    private final Calendar.AccessRole f75634d;

    /* renamed from: e */
    private final boolean f75635e;

    /* renamed from: a */
    public final String mo109205a() {
        return this.f75631a;
    }

    /* renamed from: b */
    public final String mo109206b() {
        return this.f75632b;
    }

    /* renamed from: c */
    public final String mo109207c() {
        return this.f75633c;
    }

    /* renamed from: d */
    public final Calendar.AccessRole mo109208d() {
        return this.f75634d;
    }

    /* renamed from: e */
    public final boolean mo109209e() {
        return this.f75635e;
    }

    public CalendarMemberInfo(String str, String str2, String str3, Calendar.AccessRole accessRole, boolean z) {
        this.f75631a = str;
        this.f75632b = str2;
        this.f75633c = str3;
        this.f75634d = accessRole;
        this.f75635e = z;
    }
}
