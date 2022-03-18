package com.ss.android.lark.todo.impl.features.common.entity;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/entity/EndTimeTextAttribute;", "Ljava/io/Serializable;", "endTimeStr", "", "endTimeColor", "", "(Ljava/lang/String;I)V", "getEndTimeColor", "()I", "setEndTimeColor", "(I)V", "getEndTimeStr", "()Ljava/lang/String;", "setEndTimeStr", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EndTimeTextAttribute implements Serializable {
    private int endTimeColor;
    private String endTimeStr;

    public static /* synthetic */ EndTimeTextAttribute copy$default(EndTimeTextAttribute endTimeTextAttribute, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = endTimeTextAttribute.endTimeStr;
        }
        if ((i2 & 2) != 0) {
            i = endTimeTextAttribute.endTimeColor;
        }
        return endTimeTextAttribute.copy(str, i);
    }

    public final String component1() {
        return this.endTimeStr;
    }

    public final int component2() {
        return this.endTimeColor;
    }

    public final EndTimeTextAttribute copy(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "endTimeStr");
        return new EndTimeTextAttribute(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EndTimeTextAttribute)) {
            return false;
        }
        EndTimeTextAttribute endTimeTextAttribute = (EndTimeTextAttribute) obj;
        return Intrinsics.areEqual(this.endTimeStr, endTimeTextAttribute.endTimeStr) && this.endTimeColor == endTimeTextAttribute.endTimeColor;
    }

    public int hashCode() {
        String str = this.endTimeStr;
        return ((str != null ? str.hashCode() : 0) * 31) + this.endTimeColor;
    }

    public String toString() {
        return "EndTimeTextAttribute(endTimeStr=" + this.endTimeStr + ", endTimeColor=" + this.endTimeColor + ")";
    }

    public final int getEndTimeColor() {
        return this.endTimeColor;
    }

    public final String getEndTimeStr() {
        return this.endTimeStr;
    }

    public final void setEndTimeColor(int i) {
        this.endTimeColor = i;
    }

    public final void setEndTimeStr(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.endTimeStr = str;
    }

    public EndTimeTextAttribute(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "endTimeStr");
        this.endTimeStr = str;
        this.endTimeColor = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EndTimeTextAttribute(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, i);
    }
}
