package com.ss.android.medialib.model;

import java.util.List;

/* renamed from: com.ss.android.medialib.model.c */
public class C59404c {

    /* renamed from: a */
    long f147475a;

    /* renamed from: b */
    double f147476b;

    /* renamed from: a */
    public static long m230565a(long j, double d) {
        return (long) ((((double) j) * 1.0d) / d);
    }

    /* renamed from: a */
    public static int m230564a(List<? extends C59404c> list) {
        int i = 0;
        if (list != null && list.size() > 0) {
            for (C59404c cVar : list) {
                i = (int) (((long) i) + m230565a(cVar.f147475a, cVar.f147476b));
            }
        }
        return i;
    }

    public C59404c(long j, double d) {
        this.f147475a = j;
        this.f147476b = d;
    }
}
