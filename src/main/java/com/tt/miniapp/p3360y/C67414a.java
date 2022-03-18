package com.tt.miniapp.p3360y;

import com.tt.miniapphost.util.TimeMeter;

/* renamed from: com.tt.miniapp.y.a */
public class C67414a {

    /* renamed from: a */
    private long f170014a;

    /* renamed from: b */
    private long f170015b;

    /* renamed from: c */
    private boolean f170016c;

    /* renamed from: a */
    public void mo234093a() {
        if (!this.f170016c) {
            this.f170015b = TimeMeter.currentMillis();
            this.f170016c = true;
        }
    }

    /* renamed from: b */
    public void mo234094b() {
        if (this.f170016c) {
            this.f170014a += TimeMeter.currentMillis() - this.f170015b;
            this.f170016c = false;
        }
    }

    /* renamed from: c */
    public long mo234095c() {
        if (this.f170015b == 0) {
            return 0;
        }
        if (this.f170016c) {
            return this.f170014a + (TimeMeter.currentMillis() - this.f170015b);
        }
        return this.f170014a;
    }
}
