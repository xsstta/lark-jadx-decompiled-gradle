package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventUniqueField;", "", "calendarId", "", "key", "originTime", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getCalendarId", "()Ljava/lang/String;", "setCalendarId", "(Ljava/lang/String;)V", "getKey", "setKey", "getOriginTime", "()Ljava/lang/Long;", "setOriginTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventUniqueField;", "equals", "", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.b */
public final class CalendarEventUniqueField {

    /* renamed from: a */
    private String f83589a;

    /* renamed from: b */
    private String f83590b;

    /* renamed from: c */
    private Long f83591c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarEventUniqueField)) {
            return false;
        }
        CalendarEventUniqueField bVar = (CalendarEventUniqueField) obj;
        return Intrinsics.areEqual(this.f83589a, bVar.f83589a) && Intrinsics.areEqual(this.f83590b, bVar.f83590b) && Intrinsics.areEqual(this.f83591c, bVar.f83591c);
    }

    public int hashCode() {
        String str = this.f83589a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f83590b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.f83591c;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "CalendarEventUniqueField(calendarId=" + this.f83589a + ", key=" + this.f83590b + ", originTime=" + this.f83591c + ")";
    }

    /* renamed from: a */
    public final String mo120059a() {
        return this.f83589a;
    }

    /* renamed from: b */
    public final String mo120060b() {
        return this.f83590b;
    }

    /* renamed from: c */
    public final Long mo120061c() {
        return this.f83591c;
    }

    public CalendarEventUniqueField(String str, String str2, Long l) {
        this.f83589a = str;
        this.f83590b = str2;
        this.f83591c = l;
    }
}
