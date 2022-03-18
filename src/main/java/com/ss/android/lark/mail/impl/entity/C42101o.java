package com.ss.android.lark.mail.impl.entity;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.entity.o */
public class C42101o {

    /* renamed from: a */
    public static List<Long> f107119a = Arrays.asList(5L, 10L, 20L);

    /* renamed from: b */
    private final boolean f107120b;

    /* renamed from: c */
    private final long f107121c;

    /* renamed from: a */
    public boolean mo152005a() {
        return this.f107120b;
    }

    /* renamed from: b */
    public long mo152006b() {
        return this.f107121c;
    }

    /* renamed from: com.ss.android.lark.mail.impl.entity.o$a */
    public static class C42103a {

        /* renamed from: a */
        private boolean f107122a;

        /* renamed from: b */
        private long f107123b = 5;

        /* renamed from: a */
        public C42101o mo152009a() {
            return new C42101o(this.f107122a, this.f107123b);
        }

        /* renamed from: a */
        public C42103a mo152008a(boolean z) {
            this.f107122a = z;
            return this;
        }

        /* renamed from: a */
        public C42103a mo152007a(long j) {
            if (C42101o.f107119a.contains(Long.valueOf(j))) {
                this.f107123b = j;
            }
            return this;
        }
    }

    private C42101o(boolean z, long j) {
        this.f107120b = z;
        this.f107121c = j;
    }
}
