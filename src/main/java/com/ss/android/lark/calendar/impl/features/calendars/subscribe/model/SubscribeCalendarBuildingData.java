package com.ss.android.lark.calendar.impl.features.calendars.subscribe.model;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeCalendarBuildingData;", "", "building", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "isExpand", "", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;Z)V", "getBuilding", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "()Z", "setExpand", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.b.c */
public final class SubscribeCalendarBuildingData {

    /* renamed from: a */
    private final CalendarBuilding f76580a;

    /* renamed from: b */
    private boolean f76581b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscribeCalendarBuildingData)) {
            return false;
        }
        SubscribeCalendarBuildingData cVar = (SubscribeCalendarBuildingData) obj;
        return Intrinsics.areEqual(this.f76580a, cVar.f76580a) && this.f76581b == cVar.f76581b;
    }

    public int hashCode() {
        CalendarBuilding calendarBuilding = this.f76580a;
        int hashCode = (calendarBuilding != null ? calendarBuilding.hashCode() : 0) * 31;
        boolean z = this.f76581b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public String toString() {
        return "SubscribeCalendarBuildingData(building=" + this.f76580a + ", isExpand=" + this.f76581b + ")";
    }

    /* renamed from: a */
    public final CalendarBuilding mo110448a() {
        return this.f76580a;
    }

    /* renamed from: b */
    public final boolean mo110450b() {
        return this.f76581b;
    }

    /* renamed from: a */
    public final void mo110449a(boolean z) {
        this.f76581b = z;
    }

    public SubscribeCalendarBuildingData(CalendarBuilding calendarBuilding, boolean z) {
        Intrinsics.checkParameterIsNotNull(calendarBuilding, "building");
        this.f76580a = calendarBuilding;
        this.f76581b = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SubscribeCalendarBuildingData(CalendarBuilding calendarBuilding, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(calendarBuilding, (i & 2) != 0 ? false : z);
    }
}
