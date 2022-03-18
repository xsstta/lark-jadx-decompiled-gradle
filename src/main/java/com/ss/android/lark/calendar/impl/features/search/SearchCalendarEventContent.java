package com.ss.android.lark.calendar.impl.features.search;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001B­\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0002\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0017\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R!\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010+R\u0011\u0010\u001d\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010+R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 ¨\u00067"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventContent;", "", "calendarId", "", "key", "originalTime", "", "summary", "attendee", "organizer", "creator", "resource", "location", "description", "highlights", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/search/EventHighLight;", "Lkotlin/collections/ArrayList;", "owner", UpdateKey.STATUS, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "eventColorIndex", "", "calendarColorIndex", "isAllDay", "", "calendarType", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$Type;", "startTimeZone", "isCrossTenant", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;IIZLcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$Type;Ljava/lang/String;Z)V", "getAttendee", "()Ljava/lang/String;", "getCalendarColorIndex", "()I", "getCalendarId", "getCalendarType", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$Type;", "getCreator", "getDescription", "getEventColorIndex", "getHighlights", "()Ljava/util/ArrayList;", "()Z", "getKey", "getLocation", "getOrganizer", "getOriginalTime", "()J", "getOwner", "getResource", "getStartTimeZone", "getStatus", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "getSummary", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.d */
public final class SearchCalendarEventContent {

    /* renamed from: a */
    private final String f82822a;

    /* renamed from: b */
    private final String f82823b;

    /* renamed from: c */
    private final long f82824c;

    /* renamed from: d */
    private final String f82825d;

    /* renamed from: e */
    private final String f82826e;

    /* renamed from: f */
    private final String f82827f;

    /* renamed from: g */
    private final String f82828g;

    /* renamed from: h */
    private final String f82829h;

    /* renamed from: i */
    private final String f82830i;

    /* renamed from: j */
    private final String f82831j;

    /* renamed from: k */
    private final ArrayList<EventHighLight> f82832k;

    /* renamed from: l */
    private final String f82833l;

    /* renamed from: m */
    private final CalendarEventAttendee.Status f82834m;

    /* renamed from: n */
    private final int f82835n;

    /* renamed from: o */
    private final int f82836o;

    /* renamed from: p */
    private final boolean f82837p;

    /* renamed from: q */
    private final Calendar.Type f82838q;

    /* renamed from: r */
    private final String f82839r;

    /* renamed from: s */
    private final boolean f82840s;

    /* renamed from: a */
    public final String mo118163a() {
        return this.f82822a;
    }

    /* renamed from: b */
    public final String mo118164b() {
        return this.f82823b;
    }

    /* renamed from: c */
    public final long mo118165c() {
        return this.f82824c;
    }

    /* renamed from: d */
    public final String mo118166d() {
        return this.f82825d;
    }

    /* renamed from: e */
    public final String mo118167e() {
        return this.f82826e;
    }

    /* renamed from: f */
    public final String mo118168f() {
        return this.f82827f;
    }

    /* renamed from: g */
    public final String mo118169g() {
        return this.f82828g;
    }

    /* renamed from: h */
    public final String mo118170h() {
        return this.f82829h;
    }

    /* renamed from: i */
    public final String mo118171i() {
        return this.f82830i;
    }

    /* renamed from: j */
    public final String mo118172j() {
        return this.f82831j;
    }

    /* renamed from: k */
    public final ArrayList<EventHighLight> mo118173k() {
        return this.f82832k;
    }

    /* renamed from: l */
    public final CalendarEventAttendee.Status mo118174l() {
        return this.f82834m;
    }

    /* renamed from: m */
    public final int mo118175m() {
        return this.f82835n;
    }

    /* renamed from: n */
    public final int mo118176n() {
        return this.f82836o;
    }

    /* renamed from: o */
    public final boolean mo118177o() {
        return this.f82837p;
    }

    /* renamed from: p */
    public final Calendar.Type mo118178p() {
        return this.f82838q;
    }

    public SearchCalendarEventContent(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ArrayList<EventHighLight> arrayList, String str10, CalendarEventAttendee.Status status, int i, int i2, boolean z, Calendar.Type type, String str11, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(str2, "key");
        Intrinsics.checkParameterIsNotNull(str3, "summary");
        Intrinsics.checkParameterIsNotNull(str4, "attendee");
        Intrinsics.checkParameterIsNotNull(str5, "organizer");
        Intrinsics.checkParameterIsNotNull(str6, "creator");
        Intrinsics.checkParameterIsNotNull(str7, "resource");
        Intrinsics.checkParameterIsNotNull(str8, "location");
        Intrinsics.checkParameterIsNotNull(str9, "description");
        Intrinsics.checkParameterIsNotNull(arrayList, "highlights");
        Intrinsics.checkParameterIsNotNull(str10, "owner");
        Intrinsics.checkParameterIsNotNull(status, UpdateKey.STATUS);
        Intrinsics.checkParameterIsNotNull(type, "calendarType");
        Intrinsics.checkParameterIsNotNull(str11, "startTimeZone");
        this.f82822a = str;
        this.f82823b = str2;
        this.f82824c = j;
        this.f82825d = str3;
        this.f82826e = str4;
        this.f82827f = str5;
        this.f82828g = str6;
        this.f82829h = str7;
        this.f82830i = str8;
        this.f82831j = str9;
        this.f82832k = arrayList;
        this.f82833l = str10;
        this.f82834m = status;
        this.f82835n = i;
        this.f82836o = i2;
        this.f82837p = z;
        this.f82838q = type;
        this.f82839r = str11;
        this.f82840s = z2;
    }
}
