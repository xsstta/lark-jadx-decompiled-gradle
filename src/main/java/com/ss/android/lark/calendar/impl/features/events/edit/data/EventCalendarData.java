package com.ss.android.lark.calendar.impl.features.events.edit.data;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003JE\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001b¨\u0006("}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventCalendarData;", "Ljava/io/Serializable;", "color", "", "calendarName", "", "calendarType", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$Type;", "accountName", "isResigned", "", "isCrossTenant", "(ILjava/lang/String;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$Type;Ljava/lang/String;ZZ)V", "getAccountName", "()Ljava/lang/String;", "setAccountName", "(Ljava/lang/String;)V", "getCalendarName", "setCalendarName", "getCalendarType", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$Type;", "setCalendarType", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$Type;)V", "getColor", "()I", "setColor", "(I)V", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EventCalendarData implements Serializable {
    private String accountName;
    private String calendarName;
    private Calendar.Type calendarType;
    private int color;
    private final boolean isCrossTenant;
    private final boolean isResigned;

    public static /* synthetic */ EventCalendarData copy$default(EventCalendarData eventCalendarData, int i, String str, Calendar.Type type, String str2, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = eventCalendarData.color;
        }
        if ((i2 & 2) != 0) {
            str = eventCalendarData.calendarName;
        }
        if ((i2 & 4) != 0) {
            type = eventCalendarData.calendarType;
        }
        if ((i2 & 8) != 0) {
            str2 = eventCalendarData.accountName;
        }
        if ((i2 & 16) != 0) {
            z = eventCalendarData.isResigned;
        }
        if ((i2 & 32) != 0) {
            z2 = eventCalendarData.isCrossTenant;
        }
        return eventCalendarData.copy(i, str, type, str2, z, z2);
    }

    public final int component1() {
        return this.color;
    }

    public final String component2() {
        return this.calendarName;
    }

    public final Calendar.Type component3() {
        return this.calendarType;
    }

    public final String component4() {
        return this.accountName;
    }

    public final boolean component5() {
        return this.isResigned;
    }

    public final boolean component6() {
        return this.isCrossTenant;
    }

    public final EventCalendarData copy(int i, String str, Calendar.Type type, String str2, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "calendarName");
        Intrinsics.checkParameterIsNotNull(type, "calendarType");
        Intrinsics.checkParameterIsNotNull(str2, "accountName");
        return new EventCalendarData(i, str, type, str2, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventCalendarData)) {
            return false;
        }
        EventCalendarData eventCalendarData = (EventCalendarData) obj;
        return this.color == eventCalendarData.color && Intrinsics.areEqual(this.calendarName, eventCalendarData.calendarName) && Intrinsics.areEqual(this.calendarType, eventCalendarData.calendarType) && Intrinsics.areEqual(this.accountName, eventCalendarData.accountName) && this.isResigned == eventCalendarData.isResigned && this.isCrossTenant == eventCalendarData.isCrossTenant;
    }

    public int hashCode() {
        int i = this.color * 31;
        String str = this.calendarName;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        Calendar.Type type = this.calendarType;
        int hashCode2 = (hashCode + (type != null ? type.hashCode() : 0)) * 31;
        String str2 = this.accountName;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z = this.isResigned;
        int i4 = 1;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = (i3 + i5) * 31;
        boolean z2 = this.isCrossTenant;
        if (!z2) {
            i4 = z2 ? 1 : 0;
        }
        return i8 + i4;
    }

    public String toString() {
        return "EventCalendarData(color=" + this.color + ", calendarName=" + this.calendarName + ", calendarType=" + this.calendarType + ", accountName=" + this.accountName + ", isResigned=" + this.isResigned + ", isCrossTenant=" + this.isCrossTenant + ")";
    }

    public final String getAccountName() {
        return this.accountName;
    }

    public final String getCalendarName() {
        return this.calendarName;
    }

    public final Calendar.Type getCalendarType() {
        return this.calendarType;
    }

    public final int getColor() {
        return this.color;
    }

    public final boolean isCrossTenant() {
        return this.isCrossTenant;
    }

    public final boolean isResigned() {
        return this.isResigned;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setAccountName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.accountName = str;
    }

    public final void setCalendarName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.calendarName = str;
    }

    public final void setCalendarType(Calendar.Type type) {
        Intrinsics.checkParameterIsNotNull(type, "<set-?>");
        this.calendarType = type;
    }

    public EventCalendarData(int i, String str, Calendar.Type type, String str2, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "calendarName");
        Intrinsics.checkParameterIsNotNull(type, "calendarType");
        Intrinsics.checkParameterIsNotNull(str2, "accountName");
        this.color = i;
        this.calendarName = str;
        this.calendarType = type;
        this.accountName = str2;
        this.isResigned = z;
        this.isCrossTenant = z2;
    }
}
