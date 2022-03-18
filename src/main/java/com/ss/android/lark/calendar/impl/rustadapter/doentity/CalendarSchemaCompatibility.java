package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.ss.android.lark.calendar.impl.utils.CalendarApkUtil;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0015\u001a\u00020\u0010J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0010H\u0002R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSchemaCompatibility;", "Ljava/io/Serializable;", "minimumCompatibilityVersion", "", "incompatibleLevel", "(II)V", "getIncompatibleLevel", "()I", "setIncompatibleLevel", "(I)V", "getMinimumCompatibilityVersion", "setMinimumCompatibilityVersion", "component1", "component2", "copy", "disableEdit", "", "equals", "other", "", "hashCode", "showHint", "toString", "", "versionIncompatible", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarSchemaCompatibility implements Serializable {
    public static final Companion Companion = new Companion(null);
    private int incompatibleLevel;
    private int minimumCompatibilityVersion;

    public static /* synthetic */ CalendarSchemaCompatibility copy$default(CalendarSchemaCompatibility calendarSchemaCompatibility, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = calendarSchemaCompatibility.minimumCompatibilityVersion;
        }
        if ((i3 & 2) != 0) {
            i2 = calendarSchemaCompatibility.incompatibleLevel;
        }
        return calendarSchemaCompatibility.copy(i, i2);
    }

    public final int component1() {
        return this.minimumCompatibilityVersion;
    }

    public final int component2() {
        return this.incompatibleLevel;
    }

    public final CalendarSchemaCompatibility copy(int i, int i2) {
        return new CalendarSchemaCompatibility(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarSchemaCompatibility)) {
            return false;
        }
        CalendarSchemaCompatibility calendarSchemaCompatibility = (CalendarSchemaCompatibility) obj;
        return this.minimumCompatibilityVersion == calendarSchemaCompatibility.minimumCompatibilityVersion && this.incompatibleLevel == calendarSchemaCompatibility.incompatibleLevel;
    }

    public int hashCode() {
        return (this.minimumCompatibilityVersion * 31) + this.incompatibleLevel;
    }

    public String toString() {
        return "CalendarSchemaCompatibility(minimumCompatibilityVersion=" + this.minimumCompatibilityVersion + ", incompatibleLevel=" + this.incompatibleLevel + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSchemaCompatibility$Companion;", "", "()V", "DISABLE_EDIT_MASK", "", "SHOW_HINT_MASK", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCompatibility$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getIncompatibleLevel() {
        return this.incompatibleLevel;
    }

    public final int getMinimumCompatibilityVersion() {
        return this.minimumCompatibilityVersion;
    }

    public final boolean disableEdit() {
        if ((this.incompatibleLevel & 2) > 0) {
            return versionIncompatible();
        }
        return false;
    }

    public final boolean showHint() {
        if ((this.incompatibleLevel & 1) > 0) {
            return versionIncompatible();
        }
        return false;
    }

    private final boolean versionIncompatible() {
        int a = CalendarApkUtil.f83718a.mo120293a();
        int i = this.minimumCompatibilityVersion;
        if (1 <= a && i > a) {
            return true;
        }
        return false;
    }

    public final void setIncompatibleLevel(int i) {
        this.incompatibleLevel = i;
    }

    public final void setMinimumCompatibilityVersion(int i) {
        this.minimumCompatibilityVersion = i;
    }

    public CalendarSchemaCompatibility(int i, int i2) {
        this.minimumCompatibilityVersion = i;
        this.incompatibleLevel = i2;
    }
}
