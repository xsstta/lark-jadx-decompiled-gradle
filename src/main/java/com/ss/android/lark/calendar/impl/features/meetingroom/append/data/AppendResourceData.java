package com.ss.android.lark.calendar.impl.features.meetingroom.append.data;

import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/AppendResourceData;", "", "calendarResource", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "calendarBuildingName", "", "(Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;Ljava/lang/String;)V", "getCalendarBuildingName", "()Ljava/lang/String;", "getCalendarResource", "()Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "displayText", "getDisplayText", "interText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.data.a */
public final class AppendResourceData {

    /* renamed from: a */
    private String f81854a;

    /* renamed from: b */
    private final CalendarResource f81855b;

    /* renamed from: c */
    private final String f81856c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendResourceData)) {
            return false;
        }
        AppendResourceData aVar = (AppendResourceData) obj;
        return Intrinsics.areEqual(this.f81855b, aVar.f81855b) && Intrinsics.areEqual(this.f81856c, aVar.f81856c);
    }

    public int hashCode() {
        CalendarResource calendarResource = this.f81855b;
        int i = 0;
        int hashCode = (calendarResource != null ? calendarResource.hashCode() : 0) * 31;
        String str = this.f81856c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "AppendResourceData(calendarResource=" + this.f81855b + ", calendarBuildingName=" + this.f81856c + ")";
    }

    /* renamed from: b */
    public final CalendarResource mo116888b() {
        return this.f81855b;
    }

    /* renamed from: c */
    public final String mo116889c() {
        return this.f81856c;
    }

    /* renamed from: a */
    public final String mo116887a() {
        String str = this.f81854a;
        if (str != null) {
            return str;
        }
        String a = C32004b.m121831a(this);
        this.f81854a = a;
        return a;
    }

    public AppendResourceData(CalendarResource calendarResource, String str) {
        Intrinsics.checkParameterIsNotNull(calendarResource, "calendarResource");
        Intrinsics.checkParameterIsNotNull(str, "calendarBuildingName");
        this.f81855b = calendarResource;
        this.f81856c = str;
    }
}
