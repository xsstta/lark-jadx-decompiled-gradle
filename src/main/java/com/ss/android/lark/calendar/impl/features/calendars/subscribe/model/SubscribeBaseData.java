package com.ss.android.lark.calendar.impl.features.calendars.subscribe.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0016\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0006\u0010#\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001a\u0010\u001e\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\u000f¨\u0006$"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeBaseData;", "", "calendarId", "", "title", "subTitle", "isPrivate", "", "isMember", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getCalendarId", "()Ljava/lang/String;", "calendarTenantId", "getCalendarTenantId", "setCalendarTenantId", "(Ljava/lang/String;)V", "isCrossTenant", "()Z", "setCrossTenant", "(Z)V", "isHasMore", "setHasMore", "isLoading", "setLoading", "isOwner", "setOwner", "isPrimary", "setPrimary", "isResigned", "setResigned", "isSubscribed", "setSubscribed", "getSubTitle", "getTitle", "setTitle", "privateForCurrentUser", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.b.b */
public class SubscribeBaseData {

    /* renamed from: a */
    private boolean f76568a;

    /* renamed from: b */
    private boolean f76569b;

    /* renamed from: c */
    private boolean f76570c;

    /* renamed from: d */
    private boolean f76571d = true;

    /* renamed from: e */
    private boolean f76572e;

    /* renamed from: f */
    private boolean f76573f;

    /* renamed from: g */
    private String f76574g;

    /* renamed from: h */
    private final String f76575h;

    /* renamed from: i */
    private String f76576i;

    /* renamed from: j */
    private final String f76577j;

    /* renamed from: k */
    private final boolean f76578k;

    /* renamed from: l */
    private final boolean f76579l;

    /* renamed from: g */
    public final String mo110443g() {
        return this.f76574g;
    }

    /* renamed from: i */
    public final String mo110445i() {
        return this.f76575h;
    }

    /* renamed from: j */
    public final String mo110446j() {
        return this.f76576i;
    }

    /* renamed from: k */
    public final String mo110447k() {
        return this.f76577j;
    }

    /* renamed from: b */
    public final boolean mo110434b() {
        return this.f76569b;
    }

    /* renamed from: c */
    public final boolean mo110436c() {
        return this.f76570c;
    }

    /* renamed from: d */
    public final boolean mo110438d() {
        return this.f76571d;
    }

    /* renamed from: e */
    public final boolean mo110440e() {
        return this.f76572e;
    }

    /* renamed from: f */
    public final boolean mo110442f() {
        return this.f76573f;
    }

    /* renamed from: a */
    public final boolean mo110432a() {
        return this.f76568a;
    }

    /* renamed from: h */
    public final boolean mo110444h() {
        if (!this.f76578k || this.f76579l) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo110430a(String str) {
        this.f76574g = str;
    }

    /* renamed from: b */
    public final void mo110433b(boolean z) {
        this.f76569b = z;
    }

    /* renamed from: c */
    public final void mo110435c(boolean z) {
        this.f76570c = z;
    }

    /* renamed from: d */
    public final void mo110437d(boolean z) {
        this.f76571d = z;
    }

    /* renamed from: e */
    public final void mo110439e(boolean z) {
        this.f76572e = z;
    }

    /* renamed from: f */
    public final void mo110441f(boolean z) {
        this.f76573f = z;
    }

    /* renamed from: a */
    public final void mo110431a(boolean z) {
        this.f76568a = z;
    }

    public SubscribeBaseData(String str, String str2, String str3, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        this.f76575h = str;
        this.f76576i = str2;
        this.f76577j = str3;
        this.f76578k = z;
        this.f76579l = z2;
    }
}
