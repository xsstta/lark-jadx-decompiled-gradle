package com.ss.android.lark.monitor;

import com.facebook.battery.metrics.core.SystemMetrics;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.monitor.j */
public class C48233j extends SystemMetrics<C48233j> {
    public int javaHeapMB;
    public int maxMemMB;
    public int nativeHeapMB;
    public int totalMemMB;

    C48233j() {
    }

    public int hashCode() {
        int i = this.totalMemMB;
        int i2 = this.maxMemMB;
        int i3 = this.javaHeapMB;
        int i4 = this.nativeHeapMB;
        return ((((((i ^ (i >>> 32)) * 31) + (i2 ^ (i2 >>> 32))) * 31) + (i3 ^ (i3 >>> 32))) * 31) + (i4 ^ (i4 >>> 32));
    }

    public String toString() {
        return "MemoryMetrics{maxMemMB=" + this.maxMemMB + "totalMemMB=" + this.totalMemMB + "javaHeapMB=" + this.javaHeapMB + "nativeHeapMB=" + this.nativeHeapMB + '}';
    }

    public C48233j set(C48233j jVar) {
        this.totalMemMB = jVar.totalMemMB;
        this.javaHeapMB = jVar.javaHeapMB;
        this.nativeHeapMB = jVar.nativeHeapMB;
        this.maxMemMB = jVar.maxMemMB;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C48233j jVar = (C48233j) obj;
        if (this.maxMemMB == jVar.maxMemMB && this.totalMemMB == jVar.totalMemMB && this.javaHeapMB == jVar.javaHeapMB && this.nativeHeapMB == jVar.nativeHeapMB) {
            return true;
        }
        return false;
    }

    public C48233j diff(C48233j jVar, C48233j jVar2) {
        if (jVar2 == null) {
            jVar2 = new C48233j();
        }
        if (jVar == null) {
            jVar2.set(this);
        } else {
            jVar2.maxMemMB = this.maxMemMB - jVar.maxMemMB;
            jVar2.totalMemMB = this.totalMemMB - jVar.totalMemMB;
            jVar2.javaHeapMB = this.javaHeapMB - jVar.javaHeapMB;
            jVar2.nativeHeapMB = this.nativeHeapMB - jVar.nativeHeapMB;
        }
        return jVar2;
    }

    public C48233j sum(C48233j jVar, C48233j jVar2) {
        if (jVar2 == null) {
            jVar2 = new C48233j();
        }
        if (jVar == null) {
            jVar2.set(this);
        } else {
            jVar2.maxMemMB = this.maxMemMB + jVar.maxMemMB;
            jVar2.totalMemMB = this.totalMemMB + jVar.totalMemMB;
            jVar2.javaHeapMB = this.javaHeapMB + jVar.javaHeapMB;
            jVar2.nativeHeapMB = this.nativeHeapMB + jVar.nativeHeapMB;
        }
        return jVar2;
    }
}
