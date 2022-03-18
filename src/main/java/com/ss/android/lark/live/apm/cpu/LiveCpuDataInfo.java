package com.ss.android.lark.live.apm.cpu;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/live/apm/cpu/LiveCpuDataInfo;", "", "appCpuUsage", "", "(I)V", "getAppCpuUsage", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.live.apm.a.c */
public final class LiveCpuDataInfo {

    /* renamed from: a */
    private final int f105493a;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LiveCpuDataInfo) && this.f105493a == ((LiveCpuDataInfo) obj).f105493a;
        }
        return true;
    }

    public int hashCode() {
        return this.f105493a;
    }

    public String toString() {
        return "LiveCpuDataInfo(appCpuUsage=" + this.f105493a + ")";
    }

    /* renamed from: a */
    public final int mo149341a() {
        return this.f105493a;
    }

    public LiveCpuDataInfo(int i) {
        this.f105493a = i;
    }
}
