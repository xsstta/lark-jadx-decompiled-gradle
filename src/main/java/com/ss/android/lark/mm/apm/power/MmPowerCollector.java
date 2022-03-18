package com.ss.android.lark.mm.apm.power;

import com.ss.android.lark.mm.apm.p2285a.C45849a;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mm/apm/power/MmPowerCollector;", "", "()V", "lastPowerLevel", "", "lastRecordTime", "", "getPowerInfo", "Lcom/ss/android/lark/mm/apm/power/MmPowerDataInfo;", "initPowerInfo", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.apm.c.a */
public final class MmPowerCollector {

    /* renamed from: a */
    private int f115670a;

    /* renamed from: b */
    private long f115671b;

    /* renamed from: a */
    public final void mo161136a() {
        this.f115670a = C45849a.m181622g();
        this.f115671b = System.currentTimeMillis();
    }

    /* renamed from: b */
    public final MmPowerDataInfo mo161137b() {
        int i = this.f115670a;
        this.f115670a = C45849a.m181622g();
        long currentTimeMillis = System.currentTimeMillis() - this.f115671b;
        this.f115671b = System.currentTimeMillis();
        float i2 = C45849a.m181624i();
        C45855f.m181663b("MmPowerCollector", "startPowerLevel -> " + i);
        C45855f.m181663b("MmPowerCollector", "endPowerLevel -> " + this.f115670a);
        C45855f.m181663b("MmPowerCollector", "duration -> " + currentTimeMillis);
        return new MmPowerDataInfo(i, this.f115670a, currentTimeMillis, i2);
    }
}
