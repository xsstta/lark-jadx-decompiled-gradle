package com.bytedance.ee.bear.list.sort;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ee/bear/list/sort/SortType;", "", "resId", "", "rank", "asc", "", "reportSort", "", "(IIZLjava/lang/String;)V", "getAsc", "()Z", "setAsc", "(Z)V", "getRank", "()I", "setRank", "(I)V", "getReportSort", "()Ljava/lang/String;", "getResId", "setResId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.sort.r */
public final class SortType {

    /* renamed from: a */
    private int f23696a;

    /* renamed from: b */
    private int f23697b;

    /* renamed from: c */
    private boolean f23698c;

    /* renamed from: d */
    private final String f23699d;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SortType) {
                SortType rVar = (SortType) obj;
                if (this.f23696a == rVar.f23696a) {
                    if (this.f23697b == rVar.f23697b) {
                        if (!(this.f23698c == rVar.f23698c) || !Intrinsics.areEqual(this.f23699d, rVar.f23699d)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = ((this.f23696a * 31) + this.f23697b) * 31;
        boolean z = this.f23698c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (i + i2) * 31;
        String str = this.f23699d;
        return i5 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SortType(resId=" + this.f23696a + ", rank=" + this.f23697b + ", asc=" + this.f23698c + ", reportSort=" + this.f23699d + ")";
    }

    /* renamed from: a */
    public final int mo33842a() {
        return this.f23696a;
    }

    /* renamed from: b */
    public final int mo33845b() {
        return this.f23697b;
    }

    /* renamed from: c */
    public final boolean mo33846c() {
        return this.f23698c;
    }

    /* renamed from: d */
    public final String mo33847d() {
        return this.f23699d;
    }

    /* renamed from: a */
    public final void mo33843a(int i) {
        this.f23696a = i;
    }

    /* renamed from: a */
    public final void mo33844a(boolean z) {
        this.f23698c = z;
    }

    public SortType(int i, int i2, boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(str, "reportSort");
        this.f23696a = i;
        this.f23697b = i2;
        this.f23698c = z;
        this.f23699d = str;
    }
}
