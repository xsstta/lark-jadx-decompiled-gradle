package com.ss.android.lark.calendar.impl.features.calendarview.timezone.adapter;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\bJ\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bJ\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimeZoneItemData;", "", "timezoneId", "", "timezoneName", "timezoneOffset", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "cityNames", "Ljava/util/ArrayList;", "isSelected", "", "isSwiped", "()Z", "setSwiped", "(Z)V", "getTimezoneId", "()Ljava/lang/String;", "getTimezoneName", "getTimezoneOffset", "getCityNames", "setCityNames", "", "setIsSelected", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.a.a */
public final class TimeZoneItemData {

    /* renamed from: a */
    private boolean f78369a;

    /* renamed from: b */
    private boolean f78370b;

    /* renamed from: c */
    private ArrayList<String> f78371c = new ArrayList<>();

    /* renamed from: d */
    private final String f78372d;

    /* renamed from: e */
    private final String f78373e;

    /* renamed from: f */
    private final String f78374f;

    /* renamed from: c */
    public final ArrayList<String> mo112477c() {
        return this.f78371c;
    }

    /* renamed from: d */
    public final String mo112478d() {
        return this.f78372d;
    }

    /* renamed from: e */
    public final String mo112479e() {
        return this.f78373e;
    }

    /* renamed from: f */
    public final String mo112480f() {
        return this.f78374f;
    }

    /* renamed from: a */
    public final boolean mo112474a() {
        return this.f78369a;
    }

    /* renamed from: b */
    public final boolean mo112476b() {
        return this.f78370b;
    }

    /* renamed from: a */
    public final void mo112473a(boolean z) {
        this.f78369a = z;
    }

    /* renamed from: b */
    public final void mo112475b(boolean z) {
        this.f78370b = z;
    }

    /* renamed from: a */
    public final void mo112472a(ArrayList<String> arrayList) {
        if (arrayList != null) {
            this.f78371c.clear();
            this.f78371c.addAll(arrayList);
        }
    }

    public TimeZoneItemData(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "timezoneId");
        Intrinsics.checkParameterIsNotNull(str2, "timezoneName");
        Intrinsics.checkParameterIsNotNull(str3, "timezoneOffset");
        this.f78372d = str;
        this.f78373e = str2;
        this.f78374f = str3;
    }
}
