package com.bytedance.apm6.cpu.exception;

import com.bytedance.apm.util.C3112b;

/* renamed from: com.bytedance.apm6.cpu.exception.e */
public class C3263e {
    /* renamed from: a */
    public static double m13635a() {
        long currentTimeMillis = System.currentTimeMillis();
        long e = C3112b.m12951e();
        try {
            Thread.sleep(360);
        } catch (InterruptedException unused) {
        }
        return (((((double) C3112b.m12951e()) - ((double) e)) * 1000.0d) / ((double) (System.currentTimeMillis() - currentTimeMillis))) / ((double) C3112b.m12938a(100));
    }
}
