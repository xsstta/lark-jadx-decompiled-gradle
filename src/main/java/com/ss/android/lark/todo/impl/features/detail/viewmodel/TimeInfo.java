package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TimeInfo;", "", "hasDueTime", "", "timeStr", "", "hasReminder", "showDelete", "editState", "", "(ZLjava/lang/String;ZZI)V", "getEditState", "()I", "getHasDueTime", "()Z", "getHasReminder", "getShowDelete", "getTimeStr", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.aa */
public final class TimeInfo {

    /* renamed from: a */
    private final boolean f140139a;

    /* renamed from: b */
    private final String f140140b;

    /* renamed from: c */
    private final boolean f140141c;

    /* renamed from: d */
    private final boolean f140142d;

    /* renamed from: e */
    private final int f140143e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeInfo)) {
            return false;
        }
        TimeInfo aaVar = (TimeInfo) obj;
        return this.f140139a == aaVar.f140139a && Intrinsics.areEqual(this.f140140b, aaVar.f140140b) && this.f140141c == aaVar.f140141c && this.f140142d == aaVar.f140142d && this.f140143e == aaVar.f140143e;
    }

    public int hashCode() {
        boolean z = this.f140139a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.f140140b;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z2 = this.f140141c;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (hashCode + i6) * 31;
        boolean z3 = this.f140142d;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        return ((i9 + i) * 31) + this.f140143e;
    }

    public String toString() {
        return "TimeInfo(hasDueTime=" + this.f140139a + ", timeStr=" + this.f140140b + ", hasReminder=" + this.f140141c + ", showDelete=" + this.f140142d + ", editState=" + this.f140143e + ")";
    }

    /* renamed from: a */
    public final boolean mo192773a() {
        return this.f140139a;
    }

    /* renamed from: b */
    public final String mo192774b() {
        return this.f140140b;
    }

    /* renamed from: c */
    public final boolean mo192775c() {
        return this.f140141c;
    }

    /* renamed from: d */
    public final boolean mo192776d() {
        return this.f140142d;
    }

    /* renamed from: e */
    public final int mo192777e() {
        return this.f140143e;
    }

    public TimeInfo(boolean z, String str, boolean z2, boolean z3, int i) {
        Intrinsics.checkParameterIsNotNull(str, "timeStr");
        this.f140139a = z;
        this.f140140b = str;
        this.f140141c = z2;
        this.f140142d = z3;
        this.f140143e = i;
    }
}
