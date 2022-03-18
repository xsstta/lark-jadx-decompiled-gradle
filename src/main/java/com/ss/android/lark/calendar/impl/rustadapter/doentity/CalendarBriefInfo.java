package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import android.text.TextUtils;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0006\u0010\u001d\u001a\u00020\u0018J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBriefInfo;", "Ljava/io/Serializable;", "id", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$Type;", "successorChatterId", "calendarSummary", "creatorChatterId", "(Ljava/lang/String;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCalendarSummary", "()Ljava/lang/String;", "getCreatorChatterId", "getId", "getSuccessorChatterId", "getType", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$Type;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "isResigned", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarBriefInfo implements Serializable {
    private final String calendarSummary;
    private final String creatorChatterId;
    private final String id;
    private final String successorChatterId;
    private final Calendar.Type type;

    public static /* synthetic */ CalendarBriefInfo copy$default(CalendarBriefInfo calendarBriefInfo, String str, Calendar.Type type2, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = calendarBriefInfo.id;
        }
        if ((i & 2) != 0) {
            type2 = calendarBriefInfo.type;
        }
        if ((i & 4) != 0) {
            str2 = calendarBriefInfo.successorChatterId;
        }
        if ((i & 8) != 0) {
            str3 = calendarBriefInfo.calendarSummary;
        }
        if ((i & 16) != 0) {
            str4 = calendarBriefInfo.creatorChatterId;
        }
        return calendarBriefInfo.copy(str, type2, str2, str3, str4);
    }

    public final String component1() {
        return this.id;
    }

    public final Calendar.Type component2() {
        return this.type;
    }

    public final String component3() {
        return this.successorChatterId;
    }

    public final String component4() {
        return this.calendarSummary;
    }

    public final String component5() {
        return this.creatorChatterId;
    }

    public final CalendarBriefInfo copy(String str, Calendar.Type type2, String str2, String str3, String str4) {
        return new CalendarBriefInfo(str, type2, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarBriefInfo)) {
            return false;
        }
        CalendarBriefInfo calendarBriefInfo = (CalendarBriefInfo) obj;
        return Intrinsics.areEqual(this.id, calendarBriefInfo.id) && Intrinsics.areEqual(this.type, calendarBriefInfo.type) && Intrinsics.areEqual(this.successorChatterId, calendarBriefInfo.successorChatterId) && Intrinsics.areEqual(this.calendarSummary, calendarBriefInfo.calendarSummary) && Intrinsics.areEqual(this.creatorChatterId, calendarBriefInfo.creatorChatterId);
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Calendar.Type type2 = this.type;
        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 31;
        String str2 = this.successorChatterId;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.calendarSummary;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.creatorChatterId;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "CalendarBriefInfo(id=" + this.id + ", type=" + this.type + ", successorChatterId=" + this.successorChatterId + ", calendarSummary=" + this.calendarSummary + ", creatorChatterId=" + this.creatorChatterId + ")";
    }

    public final String getCalendarSummary() {
        return this.calendarSummary;
    }

    public final String getCreatorChatterId() {
        return this.creatorChatterId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSuccessorChatterId() {
        return this.successorChatterId;
    }

    public final Calendar.Type getType() {
        return this.type;
    }

    public final boolean isResigned() {
        if (TextUtils.isEmpty(this.successorChatterId) || !(!Intrinsics.areEqual(this.successorChatterId, "0")) || this.type != Calendar.Type.OTHER) {
            return false;
        }
        return true;
    }

    public CalendarBriefInfo(String str, Calendar.Type type2, String str2, String str3, String str4) {
        this.id = str;
        this.type = type2;
        this.successorChatterId = str2;
        this.calendarSummary = str3;
        this.creatorChatterId = str4;
    }
}
