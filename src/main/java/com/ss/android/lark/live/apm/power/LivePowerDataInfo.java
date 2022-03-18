package com.ss.android.lark.live.apm.power;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/live/apm/power/LivePowerDataInfo;", "", "startLevel", "", "endLevel", "duration", "", "temperature", "", "(IIJF)V", "getDuration", "()J", "getEndLevel", "()I", "getStartLevel", "getTemperature", "()F", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.live.apm.d.b */
public final class LivePowerDataInfo {

    /* renamed from: a */
    private final int f105502a;

    /* renamed from: b */
    private final int f105503b;

    /* renamed from: c */
    private final long f105504c;

    /* renamed from: d */
    private final float f105505d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivePowerDataInfo)) {
            return false;
        }
        LivePowerDataInfo bVar = (LivePowerDataInfo) obj;
        return this.f105502a == bVar.f105502a && this.f105503b == bVar.f105503b && this.f105504c == bVar.f105504c && Float.compare(this.f105505d, bVar.f105505d) == 0;
    }

    public int hashCode() {
        long j = this.f105504c;
        return (((((this.f105502a * 31) + this.f105503b) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.f105505d);
    }

    public String toString() {
        return "LivePowerDataInfo(startLevel=" + this.f105502a + ", endLevel=" + this.f105503b + ", duration=" + this.f105504c + ", temperature=" + this.f105505d + ")";
    }

    /* renamed from: a */
    public final int mo149359a() {
        return this.f105502a;
    }

    /* renamed from: b */
    public final int mo149360b() {
        return this.f105503b;
    }

    /* renamed from: c */
    public final long mo149361c() {
        return this.f105504c;
    }

    /* renamed from: d */
    public final float mo149362d() {
        return this.f105505d;
    }

    public LivePowerDataInfo(int i, int i2, long j, float f) {
        this.f105502a = i;
        this.f105503b = i2;
        this.f105504c = j;
        this.f105505d = f;
    }
}
