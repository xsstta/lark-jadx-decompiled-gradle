package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J%\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032$\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\u000e\u0010\rR6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSetting;", "Ljava/io/Serializable;", "isEnable", "", "workHourItems", "Ljava/util/HashMap;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSpan;", "Lkotlin/collections/HashMap;", "isFirstSet", "(ZLjava/util/HashMap;Z)V", "()Z", "setEnable", "(Z)V", "setFirstSet", "getWorkHourItems", "()Ljava/util/HashMap;", "setWorkHourItems", "(Ljava/util/HashMap;)V", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarWorkHourSetting implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    private boolean isEnable;
    private boolean isFirstSet;
    private HashMap<CalendarSetting.DayOfWeek, CalendarWorkHourSpan> workHourItems;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSetting */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalendarWorkHourSetting copy$default(CalendarWorkHourSetting calendarWorkHourSetting, boolean z, HashMap hashMap, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = calendarWorkHourSetting.isEnable;
        }
        if ((i & 2) != 0) {
            hashMap = calendarWorkHourSetting.workHourItems;
        }
        if ((i & 4) != 0) {
            z2 = calendarWorkHourSetting.isFirstSet;
        }
        return calendarWorkHourSetting.copy(z, hashMap, z2);
    }

    public final boolean component1() {
        return this.isEnable;
    }

    public final HashMap<CalendarSetting.DayOfWeek, CalendarWorkHourSpan> component2() {
        return this.workHourItems;
    }

    public final boolean component3() {
        return this.isFirstSet;
    }

    public final CalendarWorkHourSetting copy(boolean z, HashMap<CalendarSetting.DayOfWeek, CalendarWorkHourSpan> hashMap, boolean z2) {
        Intrinsics.checkParameterIsNotNull(hashMap, "workHourItems");
        return new CalendarWorkHourSetting(z, hashMap, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarWorkHourSetting)) {
            return false;
        }
        CalendarWorkHourSetting calendarWorkHourSetting = (CalendarWorkHourSetting) obj;
        return this.isEnable == calendarWorkHourSetting.isEnable && Intrinsics.areEqual(this.workHourItems, calendarWorkHourSetting.workHourItems) && this.isFirstSet == calendarWorkHourSetting.isFirstSet;
    }

    public int hashCode() {
        boolean z = this.isEnable;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        HashMap<CalendarSetting.DayOfWeek, CalendarWorkHourSpan> hashMap = this.workHourItems;
        int hashCode = (i5 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        boolean z2 = this.isFirstSet;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "CalendarWorkHourSetting(isEnable=" + this.isEnable + ", workHourItems=" + this.workHourItems + ", isFirstSet=" + this.isFirstSet + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSetting$Companion;", "", "()V", "serialVersionUID", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSetting$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final HashMap<CalendarSetting.DayOfWeek, CalendarWorkHourSpan> getWorkHourItems() {
        return this.workHourItems;
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    public final boolean isFirstSet() {
        return this.isFirstSet;
    }

    public final void setEnable(boolean z) {
        this.isEnable = z;
    }

    public final void setFirstSet(boolean z) {
        this.isFirstSet = z;
    }

    public final void setWorkHourItems(HashMap<CalendarSetting.DayOfWeek, CalendarWorkHourSpan> hashMap) {
        Intrinsics.checkParameterIsNotNull(hashMap, "<set-?>");
        this.workHourItems = hashMap;
    }

    public CalendarWorkHourSetting(boolean z, HashMap<CalendarSetting.DayOfWeek, CalendarWorkHourSpan> hashMap, boolean z2) {
        Intrinsics.checkParameterIsNotNull(hashMap, "workHourItems");
        this.isEnable = z;
        this.workHourItems = hashMap;
        this.isFirstSet = z2;
    }
}
