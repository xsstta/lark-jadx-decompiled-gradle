package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSpan;", "Ljava/io/Serializable;", "startMinute", "", "endMinute", "(II)V", "getEndMinute", "()I", "setEndMinute", "(I)V", "getStartMinute", "setStartMinute", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarWorkHourSpan implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    private int endMinute;
    private int startMinute;

    public static /* synthetic */ CalendarWorkHourSpan copy$default(CalendarWorkHourSpan calendarWorkHourSpan, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = calendarWorkHourSpan.startMinute;
        }
        if ((i3 & 2) != 0) {
            i2 = calendarWorkHourSpan.endMinute;
        }
        return calendarWorkHourSpan.copy(i, i2);
    }

    public final int component1() {
        return this.startMinute;
    }

    public final int component2() {
        return this.endMinute;
    }

    public final CalendarWorkHourSpan copy(int i, int i2) {
        return new CalendarWorkHourSpan(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarWorkHourSpan)) {
            return false;
        }
        CalendarWorkHourSpan calendarWorkHourSpan = (CalendarWorkHourSpan) obj;
        return this.startMinute == calendarWorkHourSpan.startMinute && this.endMinute == calendarWorkHourSpan.endMinute;
    }

    public int hashCode() {
        return (this.startMinute * 31) + this.endMinute;
    }

    public String toString() {
        return "CalendarWorkHourSpan(startMinute=" + this.startMinute + ", endMinute=" + this.endMinute + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSpan$Companion;", "", "()V", "serialVersionUID", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSpan$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getEndMinute() {
        return this.endMinute;
    }

    public final int getStartMinute() {
        return this.startMinute;
    }

    public final void setEndMinute(int i) {
        this.endMinute = i;
    }

    public final void setStartMinute(int i) {
        this.startMinute = i;
    }

    public CalendarWorkHourSpan(int i, int i2) {
        this.startMinute = i;
        this.endMinute = i2;
    }
}
