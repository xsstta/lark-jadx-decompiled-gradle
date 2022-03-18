package com.ss.android.lark.mm.apm;

import com.ss.android.lark.mm.apm.cpu.MmCpuDataInfo;
import com.ss.android.lark.mm.apm.memory.MmMemoryDataInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mm/apm/MmApmDataInfo;", "", "cpuDataInfo", "Lcom/ss/android/lark/mm/apm/cpu/MmCpuDataInfo;", "memoryDataInfo", "Lcom/ss/android/lark/mm/apm/memory/MmMemoryDataInfo;", "(Lcom/ss/android/lark/mm/apm/cpu/MmCpuDataInfo;Lcom/ss/android/lark/mm/apm/memory/MmMemoryDataInfo;)V", "getCpuDataInfo", "()Lcom/ss/android/lark/mm/apm/cpu/MmCpuDataInfo;", "getMemoryDataInfo", "()Lcom/ss/android/lark/mm/apm/memory/MmMemoryDataInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.apm.b */
public final class MmApmDataInfo {

    /* renamed from: a */
    private final MmCpuDataInfo f115665a;

    /* renamed from: b */
    private final MmMemoryDataInfo f115666b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MmApmDataInfo)) {
            return false;
        }
        MmApmDataInfo bVar = (MmApmDataInfo) obj;
        return Intrinsics.areEqual(this.f115665a, bVar.f115665a) && Intrinsics.areEqual(this.f115666b, bVar.f115666b);
    }

    public int hashCode() {
        MmCpuDataInfo cVar = this.f115665a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        MmMemoryDataInfo bVar = this.f115666b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "MmApmDataInfo(cpuDataInfo=" + this.f115665a + ", memoryDataInfo=" + this.f115666b + ")";
    }

    /* renamed from: a */
    public final MmCpuDataInfo mo161124a() {
        return this.f115665a;
    }

    /* renamed from: b */
    public final MmMemoryDataInfo mo161125b() {
        return this.f115666b;
    }

    public MmApmDataInfo(MmCpuDataInfo cVar, MmMemoryDataInfo bVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "cpuDataInfo");
        Intrinsics.checkParameterIsNotNull(bVar, "memoryDataInfo");
        this.f115665a = cVar;
        this.f115666b = bVar;
    }
}
