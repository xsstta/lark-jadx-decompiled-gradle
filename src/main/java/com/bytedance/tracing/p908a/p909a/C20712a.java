package com.bytedance.tracing.p908a.p909a;

import java.util.Random;

/* renamed from: com.bytedance.tracing.a.a.a */
public class C20712a {

    /* renamed from: a */
    private static final ThreadLocal<Random> f50675a = new ThreadLocal<Random>() {
        /* class com.bytedance.tracing.p908a.p909a.C20712a.C207131 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    };

    /* renamed from: b */
    public static Random m75503b() {
        return f50675a.get();
    }

    /* renamed from: a */
    public static long m75502a() {
        long j = 0;
        while (j == 0) {
            j = m75503b().nextLong();
        }
        return Math.abs(j);
    }
}
