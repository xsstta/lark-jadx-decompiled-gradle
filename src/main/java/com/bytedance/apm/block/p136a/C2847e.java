package com.bytedance.apm.block.p136a;

import android.os.SystemClock;

/* renamed from: com.bytedance.apm.block.a.e */
public class C2847e {

    /* renamed from: a */
    public long[] f9078a = new long[4];

    /* renamed from: b */
    public boolean f9079b;

    /* renamed from: a */
    public void mo12238a() {
        long[] jArr = this.f9078a;
        jArr[0] = 0;
        jArr[1] = 0;
        jArr[2] = Long.MAX_VALUE;
        jArr[3] = 0;
        this.f9079b = false;
    }

    /* renamed from: b */
    public boolean mo12240b() {
        long[] jArr = this.f9078a;
        if (jArr[0] - jArr[2] > 100) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo12239a(long j) {
        long[] jArr = this.f9078a;
        if (jArr[0] == 0) {
            jArr[0] = SystemClock.uptimeMillis();
        }
        long[] jArr2 = this.f9078a;
        jArr2[1] = jArr2[1] + 1;
        if (j < jArr2[2]) {
            jArr2[2] = j;
        }
        if (j > jArr2[3]) {
            jArr2[3] = j;
        }
        this.f9079b = true;
    }
}
