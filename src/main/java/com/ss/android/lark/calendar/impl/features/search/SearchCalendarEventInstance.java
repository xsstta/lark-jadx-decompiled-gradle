package com.ss.android.lark.calendar.impl.features.search;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventInstance;", "", "serverId", "", "startTime", "", "endTime", "crossDayNo", "", "crossDaySum", "crossDayStartTime", "crossDayEndTime", "(Ljava/lang/String;JJIIJJ)V", "getCrossDayEndTime", "()J", "getCrossDayNo", "()I", "getCrossDayStartTime", "getCrossDaySum", "getEndTime", "getServerId", "()Ljava/lang/String;", "getStartTime", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.e */
public final class SearchCalendarEventInstance {

    /* renamed from: a */
    private final String f82841a;

    /* renamed from: b */
    private final long f82842b;

    /* renamed from: c */
    private final long f82843c;

    /* renamed from: d */
    private final int f82844d;

    /* renamed from: e */
    private final int f82845e;

    /* renamed from: f */
    private final long f82846f;

    /* renamed from: g */
    private final long f82847g;

    /* renamed from: a */
    public final String mo118179a() {
        return this.f82841a;
    }

    /* renamed from: b */
    public final long mo118180b() {
        return this.f82842b;
    }

    /* renamed from: c */
    public final long mo118181c() {
        return this.f82843c;
    }

    /* renamed from: d */
    public final int mo118182d() {
        return this.f82844d;
    }

    /* renamed from: e */
    public final int mo118183e() {
        return this.f82845e;
    }

    /* renamed from: f */
    public final long mo118184f() {
        return this.f82846f;
    }

    /* renamed from: g */
    public final long mo118185g() {
        return this.f82847g;
    }

    public SearchCalendarEventInstance(String str, long j, long j2, int i, int i2, long j3, long j4) {
        Intrinsics.checkParameterIsNotNull(str, "serverId");
        this.f82841a = str;
        this.f82842b = j;
        this.f82843c = j2;
        this.f82844d = i;
        this.f82845e = i2;
        this.f82846f = j3;
        this.f82847g = j4;
    }
}
