package com.ss.android.lark.calendar.impl.features.calendarview.list.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0006HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006'"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/list/model/DateInstanceUnit;", "", "firstLineText", "", "monthDayText", "textColor", "", "startInstancePosition", "endInstancePosition", "julianDay", "(Ljava/lang/String;Ljava/lang/String;IIII)V", "getEndInstancePosition", "()I", "setEndInstancePosition", "(I)V", "getFirstLineText", "()Ljava/lang/String;", "setFirstLineText", "(Ljava/lang/String;)V", "getJulianDay", "setJulianDay", "getMonthDayText", "setMonthDayText", "getStartInstancePosition", "setStartInstancePosition", "getTextColor", "setTextColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.a.a */
public final class DateInstanceUnit {

    /* renamed from: a */
    private String f77534a;

    /* renamed from: b */
    private String f77535b;

    /* renamed from: c */
    private int f77536c;

    /* renamed from: d */
    private int f77537d;

    /* renamed from: e */
    private int f77538e;

    /* renamed from: f */
    private int f77539f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateInstanceUnit)) {
            return false;
        }
        DateInstanceUnit aVar = (DateInstanceUnit) obj;
        return Intrinsics.areEqual(this.f77534a, aVar.f77534a) && Intrinsics.areEqual(this.f77535b, aVar.f77535b) && this.f77536c == aVar.f77536c && this.f77537d == aVar.f77537d && this.f77538e == aVar.f77538e && this.f77539f == aVar.f77539f;
    }

    public int hashCode() {
        String str = this.f77534a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f77535b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((((hashCode + i) * 31) + this.f77536c) * 31) + this.f77537d) * 31) + this.f77538e) * 31) + this.f77539f;
    }

    public String toString() {
        return "DateInstanceUnit(firstLineText=" + this.f77534a + ", monthDayText=" + this.f77535b + ", textColor=" + this.f77536c + ", startInstancePosition=" + this.f77537d + ", endInstancePosition=" + this.f77538e + ", julianDay=" + this.f77539f + ")";
    }

    /* renamed from: a */
    public final String mo111661a() {
        return this.f77534a;
    }

    /* renamed from: b */
    public final String mo111663b() {
        return this.f77535b;
    }

    /* renamed from: c */
    public final int mo111665c() {
        return this.f77536c;
    }

    /* renamed from: d */
    public final int mo111666d() {
        return this.f77537d;
    }

    /* renamed from: e */
    public final int mo111667e() {
        return this.f77538e;
    }

    /* renamed from: f */
    public final int mo111669f() {
        return this.f77539f;
    }

    /* renamed from: a */
    public final void mo111662a(int i) {
        this.f77537d = i;
    }

    /* renamed from: b */
    public final void mo111664b(int i) {
        this.f77538e = i;
    }

    public DateInstanceUnit(String str, String str2, int i, int i2, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(str, "firstLineText");
        Intrinsics.checkParameterIsNotNull(str2, "monthDayText");
        this.f77534a = str;
        this.f77535b = str2;
        this.f77536c = i;
        this.f77537d = i2;
        this.f77538e = i3;
        this.f77539f = i4;
    }
}
