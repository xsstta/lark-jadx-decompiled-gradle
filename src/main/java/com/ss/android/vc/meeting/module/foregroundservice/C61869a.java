package com.ss.android.vc.meeting.module.foregroundservice;

import android.os.Looper;
import android.os.MessageQueue;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.meeting.module.foregroundservice.C61869a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.ss.android.vc.meeting.module.foregroundservice.a */
public class C61869a {

    /* renamed from: a */
    public Map<Long, AbstractC61872b> f155329a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.foregroundservice.a$a */
    public static class C61871a {

        /* renamed from: a */
        static C61869a f155333a = new C61869a();
    }

    /* renamed from: com.ss.android.vc.meeting.module.foregroundservice.a$b */
    public static abstract class AbstractC61872b {

        /* renamed from: a */
        private static AtomicLong f155334a = new AtomicLong(0);

        /* renamed from: b */
        private long f155335b = 5000;

        /* renamed from: c */
        private long f155336c = f155334a.incrementAndGet();

        /* renamed from: a */
        public abstract void mo212169a(boolean z, long j);

        /* renamed from: c */
        public boolean mo214251c() {
            return true;
        }

        /* renamed from: a */
        public long mo212168a() {
            return this.f155335b;
        }

        /* renamed from: b */
        public long mo214250b() {
            return this.f155336c;
        }
    }

    /* renamed from: a */
    public static C61869a m241680a() {
        return C61871a.f155333a;
    }

    private C61869a() {
        this.f155329a = new HashMap();
    }

    /* renamed from: b */
    public void mo214247b() {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.foregroundservice.$$Lambda$a$tsJAxstQ4jF4koqaJYGvSSVth_o */

            public final void run() {
                C61869a.this.m241684c();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m241684c() {
        Iterator<Map.Entry<Long, AbstractC61872b>> it = this.f155329a.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().mo214251c()) {
                it.remove();
            }
        }
    }

    /* renamed from: b */
    public void mo214248b(AbstractC61872b bVar) {
        mo214245a(bVar.mo214250b());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m241683b(long j) {
        this.f155329a.remove(Long.valueOf(j));
    }

    /* renamed from: a */
    public void mo214245a(long j) {
        C60735ab.m236001a(new Runnable(j) {
            /* class com.ss.android.vc.meeting.module.foregroundservice.$$Lambda$a$yf6b4pm2BnQnE9U9dPO30sQhehQ */
            public final /* synthetic */ long f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C61869a.this.m241683b((C61869a) this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo214246a(AbstractC61872b bVar) {
        if (bVar != null) {
            C60735ab.m236001a(new Runnable(bVar, System.currentTimeMillis()) {
                /* class com.ss.android.vc.meeting.module.foregroundservice.$$Lambda$a$JDxddLx01BLKjqY8bMn_erYtJsE */
                public final /* synthetic */ C61869a.AbstractC61872b f$1;
                public final /* synthetic */ long f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C61869a.this.m241682a((C61869a) this.f$1, (C61869a.AbstractC61872b) this.f$2);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241681a(long j, long j2) {
        AbstractC61872b bVar = this.f155329a.get(Long.valueOf(j));
        if (bVar != null) {
            this.f155329a.remove(Long.valueOf(j));
            bVar.mo212169a(true, System.currentTimeMillis() - j2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241682a(AbstractC61872b bVar, final long j) {
        final long b = bVar.mo214250b();
        C60700b.m235843a("IdleHandlerManager", "startTaskWhenIdle", "task id = " + b);
        this.f155329a.put(Long.valueOf(b), bVar);
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() {
            /* class com.ss.android.vc.meeting.module.foregroundservice.C61869a.C618701 */

            public boolean queueIdle() {
                AbstractC61872b bVar = C61869a.this.f155329a.get(Long.valueOf(b));
                if (bVar != null) {
                    C61869a.this.f155329a.remove(Long.valueOf(b));
                    bVar.mo212169a(false, System.currentTimeMillis() - j);
                }
                return false;
            }
        });
        C60735ab.m236002a(new Runnable(b, j) {
            /* class com.ss.android.vc.meeting.module.foregroundservice.$$Lambda$a$TwW6utsGb1IPkb0elKKShq1qDk8 */
            public final /* synthetic */ long f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r4;
            }

            public final void run() {
                C61869a.this.m241681a((C61869a) this.f$1, this.f$2);
            }
        }, bVar.mo212168a());
    }
}
