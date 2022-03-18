package com.ss.android.lark.calendar.impl.features.calendarview;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.e */
public class C30798e {

    /* renamed from: a */
    public Handler f77449a;

    /* renamed from: b */
    public Runnable f77450b;

    /* renamed from: c */
    boolean f77451c;

    /* renamed from: d */
    long f77452d;

    /* renamed from: e */
    public Runnable f77453e = new Runnable() {
        /* class com.ss.android.lark.calendar.impl.features.calendarview.C30798e.RunnableC307991 */

        public void run() {
            if (C30798e.this.f77451c && C30798e.this.f77450b != null) {
                C30798e.this.f77451c = false;
                C30798e.this.f77450b.run();
            }
        }
    };

    /* renamed from: f */
    private final int f77454f = 3000;

    /* renamed from: b */
    public void mo111490b() {
        m114886a(false);
    }

    /* renamed from: c */
    public void mo111491c() {
        m114886a(true);
    }

    /* renamed from: a */
    public void mo111489a() {
        this.f77449a.removeCallbacks(this.f77453e);
        this.f77449a.removeCallbacks(this.f77450b);
    }

    /* renamed from: a */
    private void m114886a(final boolean z) {
        this.f77449a.post(new Runnable() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.C30798e.RunnableC308002 */

            public void run() {
                if (!C30798e.this.f77451c || z) {
                    long j = 0;
                    if (System.currentTimeMillis() - C30798e.this.f77452d < 3000 && !z) {
                        j = 3000;
                    }
                    C30798e.this.f77452d = System.currentTimeMillis();
                    C30798e.this.f77451c = true;
                    C30798e.this.f77449a.postDelayed(C30798e.this.f77453e, j);
                }
            }
        });
    }

    public C30798e(Runnable runnable) {
        this.f77450b = runnable;
        this.f77449a = new Handler(Looper.getMainLooper());
    }
}
