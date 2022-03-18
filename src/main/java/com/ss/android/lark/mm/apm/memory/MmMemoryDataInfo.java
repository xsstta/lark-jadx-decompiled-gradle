package com.ss.android.lark.mm.apm.memory;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/mm/apm/memory/MmMemoryDataInfo;", "", "appMemoryUsage", "", "sysMemoryUsage", "totalMem", "(JJJ)V", "getAppMemoryUsage", "()J", "getSysMemoryUsage", "getTotalMem", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.apm.b.b */
public final class MmMemoryDataInfo {

    /* renamed from: a */
    private final long f115667a;

    /* renamed from: b */
    private final long f115668b;

    /* renamed from: c */
    private final long f115669c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MmMemoryDataInfo)) {
            return false;
        }
        MmMemoryDataInfo bVar = (MmMemoryDataInfo) obj;
        return this.f115667a == bVar.f115667a && this.f115668b == bVar.f115668b && this.f115669c == bVar.f115669c;
    }

    public int hashCode() {
        long j = this.f115667a;
        long j2 = this.f115668b;
        long j3 = this.f115669c;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "MmMemoryDataInfo(appMemoryUsage=" + this.f115667a + ", sysMemoryUsage=" + this.f115668b + ", totalMem=" + this.f115669c + ")";
    }

    /* renamed from: a */
    public final long mo161130a() {
        return this.f115667a;
    }

    /* renamed from: b */
    public final long mo161131b() {
        return this.f115668b;
    }

    /* renamed from: c */
    public final long mo161132c() {
        return this.f115669c;
    }

    public MmMemoryDataInfo(long j, long j2, long j3) {
        this.f115667a = j;
        this.f115668b = j2;
        this.f115669c = j3;
    }
}
