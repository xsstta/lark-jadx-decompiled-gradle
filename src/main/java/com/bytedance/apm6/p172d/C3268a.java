package com.bytedance.apm6.p172d;

import android.os.Process;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p172d.p173a.AbstractC3272b;
import com.bytedance.apm6.p172d.p173a.C3271a;
import com.bytedance.apm6.p183g.C3324a;
import com.bytedance.apm6.p187i.C3336c;
import com.bytedance.apm6.p187i.p191d.AbstractC3338a;
import com.bytedance.apm6.util.p195b.C3350b;
import com.bytedance.apm6.util.timetask.AbstractRunnableC3362a;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.apm6.util.timetask.C3363b;
import com.bytedance.news.common.service.manager.C20216d;
import com.bytedance.services.apm.api.IFdCheck;
import java.io.File;

/* renamed from: com.bytedance.apm6.d.a */
public class C3268a {

    /* renamed from: c */
    private static C3268a f10465c = new C3268a();

    /* renamed from: a */
    public volatile boolean f10466a;

    /* renamed from: b */
    public AbstractRunnableC3362a f10467b;

    /* renamed from: d */
    private C3271a f10468d;

    /* renamed from: e */
    private volatile boolean f10469e;

    /* renamed from: f */
    private volatile boolean f10470f;

    /* renamed from: g */
    private IFdCheck f10471g;

    /* renamed from: a */
    public static C3268a m13662a() {
        return f10465c;
    }

    /* renamed from: f */
    private IFdCheck m13664f() {
        if (this.f10471g == null) {
            this.f10471g = (IFdCheck) C20216d.m73783a(IFdCheck.class);
        }
        return this.f10471g;
    }

    /* renamed from: e */
    private int m13663e() {
        int myPid = Process.myPid();
        try {
            return new File("/proc/" + myPid + "/fd").listFiles().length;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public void mo13469b() {
        if (!this.f10469e) {
            this.f10469e = true;
            AbstractC3272b bVar = (AbstractC3272b) C3336c.m13901a(AbstractC3272b.class);
            if (bVar != null) {
                mo13468a(bVar.mo13478a());
            }
            this.f10467b = new AbstractRunnableC3362a(1200000) {
                /* class com.bytedance.apm6.p172d.C3268a.C32691 */

                public void run() {
                    C3363b.m13999a(AsyncTaskManagerType.LIGHT_WEIGHT).mo13586b(C3268a.this.f10467b);
                    C3268a.this.f10467b = null;
                    C3268a.this.f10466a = true;
                    C3268a.this.mo13470c();
                }
            };
            C3363b.m13999a(AsyncTaskManagerType.LIGHT_WEIGHT).mo13585a(this.f10467b);
        }
    }

    /* renamed from: c */
    public synchronized void mo13470c() {
        C3271a aVar;
        if (this.f10466a && (aVar = this.f10468d) != null && aVar.mo13476c()) {
            if (!this.f10470f) {
                this.f10470f = true;
                C3363b.m13999a(AsyncTaskManagerType.LIGHT_WEIGHT).mo13585a(new AbstractRunnableC3362a(0, this.f10468d.mo13475b()) {
                    /* class com.bytedance.apm6.p172d.C3268a.C32702 */

                    public void run() {
                        C3268a.this.mo13471d();
                    }
                });
            }
        }
    }

    /* renamed from: d */
    public void mo13471d() {
        if (this.f10468d != null) {
            AbstractC3338a aVar = (AbstractC3338a) C3336c.m13901a(AbstractC3338a.class);
            boolean z = false;
            if (aVar != null) {
                z = aVar.mo13548a();
            }
            int e = m13663e();
            if (e <= 0 || ((long) e) >= this.f10468d.mo13474a()) {
                IFdCheck f = m13664f();
                if (f != null) {
                    C3324a.m13872a(new C3273b(e, f.getFdList(), z));
                    return;
                }
                return;
            }
            C3324a.m13872a(new C3273b(e, null, z));
        }
    }

    /* renamed from: a */
    public synchronized void mo13468a(C3271a aVar) {
        if (aVar != null) {
            this.f10468d = aVar;
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-FD", "updateConfig:" + aVar);
            }
            mo13470c();
        }
    }
}
