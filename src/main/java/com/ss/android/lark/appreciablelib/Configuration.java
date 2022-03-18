package com.ss.android.lark.appreciablelib;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/appreciablelib/Configuration;", "", "startupTimestamp", "", "needReportToTea", "", "(JZ)V", "getNeedReportToTea", "()Z", "setNeedReportToTea", "(Z)V", "getStartupTimestamp", "()J", "setStartupTimestamp", "(J)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "appreciablelib_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.appreciablelib.b */
public final class Configuration {

    /* renamed from: a */
    private long f73109a;

    /* renamed from: b */
    private boolean f73110b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Configuration) {
                Configuration bVar = (Configuration) obj;
                if (this.f73109a == bVar.f73109a) {
                    if (this.f73110b == bVar.f73110b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f73109a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        boolean z = this.f73110b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return i + i2;
    }

    public String toString() {
        return "Configuration(startupTimestamp=" + this.f73109a + ", needReportToTea=" + this.f73110b + ")";
    }

    /* renamed from: a */
    public final long mo103529a() {
        return this.f73109a;
    }

    /* renamed from: b */
    public final boolean mo103530b() {
        return this.f73110b;
    }

    public Configuration(long j, boolean z) {
        this.f73109a = j;
        this.f73110b = z;
    }
}
