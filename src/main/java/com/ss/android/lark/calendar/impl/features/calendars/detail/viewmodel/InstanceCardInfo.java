package com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel;

import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0011\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0000H\u0002J\u0013\u0010\"\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010#H\u0002J\u0006\u0010$\u001a\u00020\u0010J\b\u0010%\u001a\u0004\u0018\u00010\rJ\b\u0010&\u001a\u0004\u0018\u00010\rJ\b\u0010'\u001a\u00020\u0010H\u0016J\u0006\u0010(\u001a\u00020\u0012J\u0010\u0010)\u001a\u00020*2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\b\u0010+\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/InstanceCardInfo;", "", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarDateHolder;", "calServerId", "", "key", "originalTime", "", "startTime", "endTime", "date", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "summary", "", "desc", "color", "", "isAllDay", "", "(Ljava/lang/String;Ljava/lang/String;JJJLcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;Ljava/lang/CharSequence;Ljava/lang/CharSequence;IZ)V", "getCalServerId", "()Ljava/lang/String;", "calendar", "Lcom/bytedance/lark/pb/calendar/v1/Calendar;", "currentDate", "getDate", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getEndTime", "()J", "getKey", "getOriginalTime", "getStartTime", "compareTo", "other", "equals", "", "getColor", "getDesc", "getSummary", "hashCode", "isPasted", "setCalendar", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.h */
public final class InstanceCardInfo implements CalendarDateHolder, Comparable<InstanceCardInfo> {

    /* renamed from: a */
    private final CalendarDate f75641a = new CalendarDate();

    /* renamed from: b */
    private Calendar f75642b;

    /* renamed from: c */
    private final String f75643c;

    /* renamed from: d */
    private final String f75644d;

    /* renamed from: e */
    private final long f75645e;

    /* renamed from: f */
    private final long f75646f;

    /* renamed from: g */
    private final long f75647g;

    /* renamed from: h */
    private final CalendarDate f75648h;

    /* renamed from: i */
    private final CharSequence f75649i;

    /* renamed from: j */
    private final CharSequence f75650j;

    /* renamed from: k */
    private final int f75651k;

    /* renamed from: l */
    private final boolean f75652l;

    @Override // com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarDateHolder
    /* renamed from: a */
    public CalendarDate mo109174a() {
        return this.f75648h;
    }

    /* renamed from: c */
    public final CharSequence mo109230c() {
        return this.f75649i;
    }

    /* renamed from: d */
    public final CharSequence mo109232d() {
        return this.f75650j;
    }

    /* renamed from: f */
    public final String mo109235f() {
        return this.f75643c;
    }

    /* renamed from: g */
    public final String mo109236g() {
        return this.f75644d;
    }

    /* renamed from: h */
    public final long mo109237h() {
        return this.f75645e;
    }

    /* renamed from: i */
    public final long mo109239i() {
        return this.f75646f;
    }

    /* renamed from: b */
    public final boolean mo109229b() {
        if (this.f75641a.getJulianDay() > mo109174a().getJulianDay()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int mo109233e() {
        Integer num;
        int i = this.f75651k;
        if (i != 0 && i != -1) {
            return i;
        }
        Calendar calendar = this.f75642b;
        if (calendar == null || (num = calendar.background_color) == null) {
            return 0;
        }
        return num.intValue();
    }

    public String toString() {
        return "InstanceCardInfo: " + mo109174a();
    }

    public int hashCode() {
        return Objects.hash(this.f75643c, this.f75644d, Long.valueOf(this.f75645e), Long.valueOf(this.f75646f), Integer.valueOf(mo109174a().getJulianDay()));
    }

    /* renamed from: a */
    public final void mo109228a(Calendar calendar) {
        this.f75642b = calendar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InstanceCardInfo)) {
            return false;
        }
        InstanceCardInfo hVar = (InstanceCardInfo) obj;
        if (Intrinsics.areEqual(this.f75643c, hVar.f75643c) && Intrinsics.areEqual(this.f75644d, hVar.f75644d) && this.f75645e == hVar.f75645e && this.f75646f == hVar.f75646f && mo109174a().getJulianDay() == hVar.mo109174a().getJulianDay()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public int compareTo(InstanceCardInfo hVar) {
        int i;
        Intrinsics.checkParameterIsNotNull(hVar, "other");
        int julianDay = mo109174a().getJulianDay() - hVar.mo109174a().getJulianDay();
        if (julianDay > 0) {
            return 1;
        }
        if (julianDay < 0) {
            return -1;
        }
        boolean z = this.f75652l;
        if (!z || hVar.f75652l) {
            if ((!z && hVar.f75652l) || mo109174a().getTimeInMilliSeconds() - hVar.mo109174a().getTimeInMilliSeconds() > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            return 0;
        }
        return -1;
    }

    public InstanceCardInfo(String str, String str2, long j, long j2, long j3, CalendarDate calendarDate, CharSequence charSequence, CharSequence charSequence2, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "calServerId");
        Intrinsics.checkParameterIsNotNull(str2, "key");
        Intrinsics.checkParameterIsNotNull(calendarDate, "date");
        this.f75643c = str;
        this.f75644d = str2;
        this.f75645e = j;
        this.f75646f = j2;
        this.f75647g = j3;
        this.f75648h = calendarDate;
        this.f75649i = charSequence;
        this.f75650j = charSequence2;
        this.f75651k = i;
        this.f75652l = z;
    }
}
