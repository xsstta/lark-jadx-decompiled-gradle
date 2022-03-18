package com.ss.android.lark.live.apm.memory;

import com.ss.android.lark.live.apm.p2134a.C41500a;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/live/apm/memory/LiveMemoryCollector;", "", "()V", "getMemoryDataInfo", "Lcom/ss/android/lark/live/apm/memory/LiveMemoryDataInfo;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.live.apm.b.a */
public final class LiveMemoryCollector {
    /* renamed from: a */
    public final LiveMemoryDataInfo mo149350a() {
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45871b contextDepend = a.getContextDepend();
        Intrinsics.checkExpressionValueIsNotNull(contextDepend, "MmDepend.impl().contextDepend");
        long a2 = C41500a.m164664a(contextDepend.mo144557a());
        StringBuilder sb = new StringBuilder();
        sb.append("[getMemoryDataInfo] appMemoryUsageSize -> ");
        long j = (long) 1024;
        sb.append(a2 / j);
        sb.append(" KB");
        C45855f.m181663b("LiveMemoryCollector", sb.toString());
        IMmDepend a3 = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "MmDepend.impl()");
        IMmDepend.AbstractC45871b contextDepend2 = a3.getContextDepend();
        Intrinsics.checkExpressionValueIsNotNull(contextDepend2, "MmDepend.impl().contextDepend");
        long c = C41500a.m164671c(contextDepend2.mo144557a());
        IMmDepend a4 = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a4, "MmDepend.impl()");
        IMmDepend.AbstractC45871b contextDepend3 = a4.getContextDepend();
        Intrinsics.checkExpressionValueIsNotNull(contextDepend3, "MmDepend.impl().contextDepend");
        long b = C41500a.m164669b(contextDepend3.mo144557a());
        long j2 = c - b;
        C45855f.m181663b("LiveMemoryCollector", "[getMemoryDataInfo] sysTotalMemorySize ->" + (c / j) + " KB");
        C45855f.m181663b("LiveMemoryCollector", "[getMemoryDataInfo] sysAvailMemorySize ->" + (b / j) + " KB");
        C45855f.m181663b("LiveMemoryCollector", "[getMemoryDataInfo] sysMemoryUsageSize ->" + (j2 / j) + " KB");
        return new LiveMemoryDataInfo(a2, j2, c);
    }
}
