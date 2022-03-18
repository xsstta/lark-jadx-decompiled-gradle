package com.ss.android.lark.live.apm.memory;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/live/apm/memory/LiveMemoryDataInfo;", "", "appMemoryUsage", "", "sysMemoryUsage", "totalMem", "(JJJ)V", "getAppMemoryUsage", "()J", "getSysMemoryUsage", "getTotalMem", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.live.apm.b.b */
public final class LiveMemoryDataInfo {

    /* renamed from: a */
    private final long f105496a;

    /* renamed from: b */
    private final long f105497b;

    /* renamed from: c */
    private final long f105498c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveMemoryDataInfo)) {
            return false;
        }
        LiveMemoryDataInfo bVar = (LiveMemoryDataInfo) obj;
        return this.f105496a == bVar.f105496a && this.f105497b == bVar.f105497b && this.f105498c == bVar.f105498c;
    }

    public int hashCode() {
        long j = this.f105496a;
        long j2 = this.f105497b;
        long j3 = this.f105498c;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "LiveMemoryDataInfo(appMemoryUsage=" + this.f105496a + ", sysMemoryUsage=" + this.f105497b + ", totalMem=" + this.f105498c + ")";
    }

    /* renamed from: a */
    public final long mo149351a() {
        return this.f105496a;
    }

    /* renamed from: b */
    public final long mo149352b() {
        return this.f105497b;
    }

    /* renamed from: c */
    public final long mo149353c() {
        return this.f105498c;
    }

    public LiveMemoryDataInfo(long j, long j2, long j3) {
        this.f105496a = j;
        this.f105497b = j2;
        this.f105498c = j3;
    }
}
