package com.ss.android.lark.mm.apm.power;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/mm/apm/power/MmPowerDataInfo;", "", "startLevel", "", "endLevel", "duration", "", "temperature", "", "(IIJF)V", "getDuration", "()J", "getEndLevel", "()I", "getStartLevel", "getTemperature", "()F", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.apm.c.b */
public final class MmPowerDataInfo {

    /* renamed from: a */
    private final int f115672a;

    /* renamed from: b */
    private final int f115673b;

    /* renamed from: c */
    private final long f115674c;

    /* renamed from: d */
    private final float f115675d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MmPowerDataInfo)) {
            return false;
        }
        MmPowerDataInfo bVar = (MmPowerDataInfo) obj;
        return this.f115672a == bVar.f115672a && this.f115673b == bVar.f115673b && this.f115674c == bVar.f115674c && Float.compare(this.f115675d, bVar.f115675d) == 0;
    }

    public int hashCode() {
        long j = this.f115674c;
        return (((((this.f115672a * 31) + this.f115673b) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.f115675d);
    }

    public String toString() {
        return "MmPowerDataInfo(startLevel=" + this.f115672a + ", endLevel=" + this.f115673b + ", duration=" + this.f115674c + ", temperature=" + this.f115675d + ")";
    }

    /* renamed from: a */
    public final int mo161138a() {
        return this.f115672a;
    }

    /* renamed from: b */
    public final int mo161139b() {
        return this.f115673b;
    }

    /* renamed from: c */
    public final long mo161140c() {
        return this.f115674c;
    }

    /* renamed from: d */
    public final float mo161141d() {
        return this.f115675d;
    }

    public MmPowerDataInfo(int i, int i2, long j, float f) {
        this.f115672a = i;
        this.f115673b = i2;
        this.f115674c = j;
        this.f115675d = f;
    }
}
