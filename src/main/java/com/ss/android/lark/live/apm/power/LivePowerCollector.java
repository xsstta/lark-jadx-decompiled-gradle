package com.ss.android.lark.live.apm.power;

import com.ss.android.lark.live.apm.p2134a.C41500a;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/live/apm/power/LivePowerCollector;", "", "()V", "lastPowerLevel", "", "lastRecordTime", "", "getPowerInfo", "Lcom/ss/android/lark/live/apm/power/LivePowerDataInfo;", "initPowerInfo", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.live.apm.d.a */
public final class LivePowerCollector {

    /* renamed from: a */
    private int f105500a;

    /* renamed from: b */
    private long f105501b;

    /* renamed from: a */
    public final void mo149357a() {
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45871b contextDepend = a.getContextDepend();
        Intrinsics.checkExpressionValueIsNotNull(contextDepend, "MmDepend.impl().contextDepend");
        this.f105500a = C41500a.m164674e(contextDepend.mo144557a());
        this.f105501b = System.currentTimeMillis();
    }

    /* renamed from: b */
    public final LivePowerDataInfo mo149358b() {
        int i = this.f105500a;
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45871b contextDepend = a.getContextDepend();
        Intrinsics.checkExpressionValueIsNotNull(contextDepend, "MmDepend.impl().contextDepend");
        this.f105500a = C41500a.m164674e(contextDepend.mo144557a());
        long currentTimeMillis = System.currentTimeMillis() - this.f105501b;
        this.f105501b = System.currentTimeMillis();
        IMmDepend a2 = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
        IMmDepend.AbstractC45871b contextDepend2 = a2.getContextDepend();
        Intrinsics.checkExpressionValueIsNotNull(contextDepend2, "MmDepend.impl().contextDepend");
        float g = C41500a.m164677g(contextDepend2.mo144557a());
        C45855f.m181663b("LivePowerCollector", "[getPowerInfo] startPowerLevel -> " + i);
        C45855f.m181663b("LivePowerCollector", "[getPowerInfo] endPowerLevel -> " + this.f105500a);
        C45855f.m181663b("LivePowerCollector", "[getPowerInfo] duration -> " + currentTimeMillis);
        return new LivePowerDataInfo(i, this.f105500a, currentTimeMillis, g);
    }
}
