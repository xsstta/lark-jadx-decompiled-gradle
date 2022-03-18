package com.ss.android.lark.live.apm;

import com.ss.android.lark.live.apm.cpu.LiveCpuDataInfo;
import com.ss.android.lark.live.apm.memory.LiveMemoryDataInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/live/apm/LiveApmDataInfo;", "", "cpuDataInfo", "Lcom/ss/android/lark/live/apm/cpu/LiveCpuDataInfo;", "memoryDataInfo", "Lcom/ss/android/lark/live/apm/memory/LiveMemoryDataInfo;", "(Lcom/ss/android/lark/live/apm/cpu/LiveCpuDataInfo;Lcom/ss/android/lark/live/apm/memory/LiveMemoryDataInfo;)V", "getCpuDataInfo", "()Lcom/ss/android/lark/live/apm/cpu/LiveCpuDataInfo;", "getMemoryDataInfo", "()Lcom/ss/android/lark/live/apm/memory/LiveMemoryDataInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.live.apm.b */
public final class LiveApmDataInfo {

    /* renamed from: a */
    private final LiveCpuDataInfo f105494a;

    /* renamed from: b */
    private final LiveMemoryDataInfo f105495b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveApmDataInfo)) {
            return false;
        }
        LiveApmDataInfo bVar = (LiveApmDataInfo) obj;
        return Intrinsics.areEqual(this.f105494a, bVar.f105494a) && Intrinsics.areEqual(this.f105495b, bVar.f105495b);
    }

    public int hashCode() {
        LiveCpuDataInfo cVar = this.f105494a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        LiveMemoryDataInfo bVar = this.f105495b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "LiveApmDataInfo(cpuDataInfo=" + this.f105494a + ", memoryDataInfo=" + this.f105495b + ")";
    }

    /* renamed from: a */
    public final LiveCpuDataInfo mo149345a() {
        return this.f105494a;
    }

    /* renamed from: b */
    public final LiveMemoryDataInfo mo149346b() {
        return this.f105495b;
    }

    public LiveApmDataInfo(LiveCpuDataInfo cVar, LiveMemoryDataInfo bVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "cpuDataInfo");
        Intrinsics.checkParameterIsNotNull(bVar, "memoryDataInfo");
        this.f105494a = cVar;
        this.f105495b = bVar;
    }
}
