package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventDisplayExtraData;", "Ljava/io/Serializable;", "hasEventCreatorResigned", "", "(Z)V", "getHasEventCreatorResigned", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarEventDisplayExtraData implements Serializable {
    private final boolean hasEventCreatorResigned;

    public static /* synthetic */ CalendarEventDisplayExtraData copy$default(CalendarEventDisplayExtraData calendarEventDisplayExtraData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = calendarEventDisplayExtraData.hasEventCreatorResigned;
        }
        return calendarEventDisplayExtraData.copy(z);
    }

    public final boolean component1() {
        return this.hasEventCreatorResigned;
    }

    public final CalendarEventDisplayExtraData copy(boolean z) {
        return new CalendarEventDisplayExtraData(z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CalendarEventDisplayExtraData) && this.hasEventCreatorResigned == ((CalendarEventDisplayExtraData) obj).hasEventCreatorResigned;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.hasEventCreatorResigned;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "CalendarEventDisplayExtraData(hasEventCreatorResigned=" + this.hasEventCreatorResigned + ")";
    }

    public final boolean getHasEventCreatorResigned() {
        return this.hasEventCreatorResigned;
    }

    public CalendarEventDisplayExtraData(boolean z) {
        this.hasEventCreatorResigned = z;
    }
}
