package com.bytedance.p725f.p726a.p728b.p729a;

import android.os.SystemClock;
import com.bytedance.p725f.p726a.p727a.AbstractC13853c;
import com.bytedance.p725f.p726a.p727a.C13850a;
import com.bytedance.p725f.p726a.p734d.C13880b;

/* renamed from: com.bytedance.f.a.b.a.a */
public class C13857a {

    /* renamed from: a */
    private AbstractC13853c f36250a;

    /* renamed from: b */
    private boolean f36251b;

    /* renamed from: c */
    private long f36252c;

    /* renamed from: a */
    public boolean mo51112a() {
        m56193b();
        return this.f36251b;
    }

    /* renamed from: b */
    private void m56193b() {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f36252c;
        if (j == 0 || elapsedRealtime - j >= 5000) {
            this.f36252c = elapsedRealtime;
            float f = this.f36250a.mo51102f();
            int e = this.f36250a.mo51101e();
            int d = this.f36250a.mo51100d();
            boolean z2 = false;
            if (f > ((float) this.f36250a.mo51096a().mo51090b())) {
                z = false;
            } else {
                z = true;
            }
            if (e < this.f36250a.mo51096a().mo51091c()) {
                z = false;
            }
            if (d != 1) {
                z2 = z;
            }
            C13880b.m56265a("updateCpuSampleEnvironment:" + z2 + ", temp:" + f + ", level:" + e + ", powerSave:" + d);
            this.f36251b = z2;
        }
    }

    public C13857a(AbstractC13853c cVar) {
        this.f36250a = cVar;
    }

    /* renamed from: a */
    public boolean mo51113a(float f) {
        if (!mo51112a()) {
            return false;
        }
        C13850a.C13851a a = this.f36250a.mo51096a().mo51089a();
        if (a == null) {
            return true;
        }
        if (f < a.mo51094a()) {
            return false;
        }
        if (((double) a.mo51095b()) <= 0.0d || this.f36250a.mo51104h().f36242o > a.mo51095b()) {
            return true;
        }
        return false;
    }
}
