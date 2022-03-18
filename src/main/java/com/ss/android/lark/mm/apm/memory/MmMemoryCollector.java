package com.ss.android.lark.mm.apm.memory;

import com.ss.android.lark.mm.apm.p2285a.C45849a;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/apm/memory/MmMemoryCollector;", "", "()V", "getMemoryDataInfo", "Lcom/ss/android/lark/mm/apm/memory/MmMemoryDataInfo;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.apm.b.a */
public final class MmMemoryCollector {
    /* renamed from: a */
    public final MmMemoryDataInfo mo161129a() {
        long a = C45849a.m181610a(C45851c.m181646a());
        StringBuilder sb = new StringBuilder();
        sb.append("appMemoryUsageSize -> ");
        long j = (long) 1024;
        sb.append(a / j);
        sb.append(" KB");
        C45855f.m181663b("MmMemoryCollector", sb.toString());
        long c = C45849a.m181618c(C45851c.m181646a());
        long b = C45849a.m181616b(C45851c.m181646a());
        long j2 = c - b;
        C45855f.m181663b("MmMemoryCollector", "sysTotalMemorySize ->" + (c / j) + " KB");
        C45855f.m181663b("MmMemoryCollector", "sysAvailMemorySize ->" + (b / j) + " KB");
        C45855f.m181663b("MmMemoryCollector", "sysMemoryUsageSize ->" + (j2 / j) + " KB");
        return new MmMemoryDataInfo(a, j2, c);
    }
}
