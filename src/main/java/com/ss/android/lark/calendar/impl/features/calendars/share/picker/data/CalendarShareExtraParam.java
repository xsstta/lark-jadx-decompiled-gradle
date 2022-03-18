package com.ss.android.lark.calendar.impl.features.calendars.share.picker.data;

import com.bytedance.lark.pb.calendar.v1.Calendar;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarShareExtraParam;", "Ljava/io/Serializable;", "calendarId", "", "calendarShareOptions", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;", "calendarSelfAccessRole", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$AccessRole;", "calendarOwnerId", "calendarTenantId", "(Ljava/lang/String;Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;Lcom/bytedance/lark/pb/calendar/v1/Calendar$AccessRole;Ljava/lang/String;Ljava/lang/String;)V", "getCalendarId", "()Ljava/lang/String;", "getCalendarOwnerId", "getCalendarSelfAccessRole", "()Lcom/bytedance/lark/pb/calendar/v1/Calendar$AccessRole;", "getCalendarShareOptions", "()Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;", "getCalendarTenantId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarShareExtraParam implements Serializable {
    private final String calendarId;
    private final String calendarOwnerId;
    private final Calendar.AccessRole calendarSelfAccessRole;
    private final Calendar.CalendarShareOptions calendarShareOptions;
    private final String calendarTenantId;

    public static /* synthetic */ CalendarShareExtraParam copy$default(CalendarShareExtraParam calendarShareExtraParam, String str, Calendar.CalendarShareOptions calendarShareOptions2, Calendar.AccessRole accessRole, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = calendarShareExtraParam.calendarId;
        }
        if ((i & 2) != 0) {
            calendarShareOptions2 = calendarShareExtraParam.calendarShareOptions;
        }
        if ((i & 4) != 0) {
            accessRole = calendarShareExtraParam.calendarSelfAccessRole;
        }
        if ((i & 8) != 0) {
            str2 = calendarShareExtraParam.calendarOwnerId;
        }
        if ((i & 16) != 0) {
            str3 = calendarShareExtraParam.calendarTenantId;
        }
        return calendarShareExtraParam.copy(str, calendarShareOptions2, accessRole, str2, str3);
    }

    public final String component1() {
        return this.calendarId;
    }

    public final Calendar.CalendarShareOptions component2() {
        return this.calendarShareOptions;
    }

    public final Calendar.AccessRole component3() {
        return this.calendarSelfAccessRole;
    }

    public final String component4() {
        return this.calendarOwnerId;
    }

    public final String component5() {
        return this.calendarTenantId;
    }

    public final CalendarShareExtraParam copy(String str, Calendar.CalendarShareOptions calendarShareOptions2, Calendar.AccessRole accessRole, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        return new CalendarShareExtraParam(str, calendarShareOptions2, accessRole, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarShareExtraParam)) {
            return false;
        }
        CalendarShareExtraParam calendarShareExtraParam = (CalendarShareExtraParam) obj;
        return Intrinsics.areEqual(this.calendarId, calendarShareExtraParam.calendarId) && Intrinsics.areEqual(this.calendarShareOptions, calendarShareExtraParam.calendarShareOptions) && Intrinsics.areEqual(this.calendarSelfAccessRole, calendarShareExtraParam.calendarSelfAccessRole) && Intrinsics.areEqual(this.calendarOwnerId, calendarShareExtraParam.calendarOwnerId) && Intrinsics.areEqual(this.calendarTenantId, calendarShareExtraParam.calendarTenantId);
    }

    public int hashCode() {
        String str = this.calendarId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Calendar.CalendarShareOptions calendarShareOptions2 = this.calendarShareOptions;
        int hashCode2 = (hashCode + (calendarShareOptions2 != null ? calendarShareOptions2.hashCode() : 0)) * 31;
        Calendar.AccessRole accessRole = this.calendarSelfAccessRole;
        int hashCode3 = (hashCode2 + (accessRole != null ? accessRole.hashCode() : 0)) * 31;
        String str2 = this.calendarOwnerId;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.calendarTenantId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "CalendarShareExtraParam(calendarId=" + this.calendarId + ", calendarShareOptions=" + this.calendarShareOptions + ", calendarSelfAccessRole=" + this.calendarSelfAccessRole + ", calendarOwnerId=" + this.calendarOwnerId + ", calendarTenantId=" + this.calendarTenantId + ")";
    }

    public final String getCalendarId() {
        return this.calendarId;
    }

    public final String getCalendarOwnerId() {
        return this.calendarOwnerId;
    }

    public final Calendar.AccessRole getCalendarSelfAccessRole() {
        return this.calendarSelfAccessRole;
    }

    public final Calendar.CalendarShareOptions getCalendarShareOptions() {
        return this.calendarShareOptions;
    }

    public final String getCalendarTenantId() {
        return this.calendarTenantId;
    }

    public CalendarShareExtraParam(String str, Calendar.CalendarShareOptions calendarShareOptions2, Calendar.AccessRole accessRole, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        this.calendarId = str;
        this.calendarShareOptions = calendarShareOptions2;
        this.calendarSelfAccessRole = accessRole;
        this.calendarOwnerId = str2;
        this.calendarTenantId = str3;
    }
}
