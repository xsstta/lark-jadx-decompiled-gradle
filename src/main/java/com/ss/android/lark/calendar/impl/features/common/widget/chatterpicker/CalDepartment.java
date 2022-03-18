package com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalDepartment;", "Ljava/io/Serializable;", "departmentId", "", "departmentName", "(Ljava/lang/String;Ljava/lang/String;)V", "getDepartmentId", "()Ljava/lang/String;", "setDepartmentId", "(Ljava/lang/String;)V", "getDepartmentName", "setDepartmentName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalDepartment implements Serializable {
    private String departmentId;
    private String departmentName;

    public CalDepartment() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ CalDepartment copy$default(CalDepartment calDepartment, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = calDepartment.departmentId;
        }
        if ((i & 2) != 0) {
            str2 = calDepartment.departmentName;
        }
        return calDepartment.copy(str, str2);
    }

    public final String component1() {
        return this.departmentId;
    }

    public final String component2() {
        return this.departmentName;
    }

    public final CalDepartment copy(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "departmentId");
        Intrinsics.checkParameterIsNotNull(str2, "departmentName");
        return new CalDepartment(str, str2);
    }

    public String toString() {
        return "CalDepartment(departmentId=" + this.departmentId + ", departmentName=" + this.departmentName + ")";
    }

    public final String getDepartmentId() {
        return this.departmentId;
    }

    public final String getDepartmentName() {
        return this.departmentName;
    }

    public int hashCode() {
        return this.departmentId.hashCode();
    }

    public final void setDepartmentId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.departmentId = str;
    }

    public final void setDepartmentName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.departmentName = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CalDepartment)) {
            return false;
        }
        return Intrinsics.areEqual(this.departmentId, ((CalDepartment) obj).departmentId);
    }

    public CalDepartment(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "departmentId");
        Intrinsics.checkParameterIsNotNull(str2, "departmentName");
        this.departmentId = str;
        this.departmentName = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CalDepartment(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
