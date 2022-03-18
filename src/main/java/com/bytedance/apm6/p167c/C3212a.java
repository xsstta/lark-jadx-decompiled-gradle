package com.bytedance.apm6.p167c;

import android.content.SharedPreferences;
import com.bytedance.apm.p138d.AbstractC2918e;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p167c.p168a.AbstractC3215b;
import com.bytedance.apm6.p167c.p168a.C3214a;
import com.bytedance.apm6.p183g.C3324a;
import com.bytedance.apm6.p187i.C3336c;
import com.bytedance.apm6.p187i.p191d.AbstractC3338a;
import com.bytedance.apm6.util.p195b.C3350b;
import com.bytedance.apm6.util.timetask.AbstractRunnableC3362a;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.apm6.util.timetask.C3363b;

/* renamed from: com.bytedance.apm6.c.a */
public class C3212a {

    /* renamed from: c */
    private static C3212a f10266c = new C3212a();

    /* renamed from: a */
    public C3214a f10267a;

    /* renamed from: b */
    public AbstractRunnableC3362a f10268b;

    /* renamed from: d */
    private volatile boolean f10269d;

    /* renamed from: e */
    private volatile boolean f10270e;

    /* renamed from: a */
    public static C3212a m13412a() {
        return f10266c;
    }

    /* renamed from: b */
    public void mo13296b() {
        if (!this.f10269d) {
            this.f10269d = true;
            AbstractC3215b bVar = (AbstractC3215b) C3336c.m13901a(AbstractC3215b.class);
            if (bVar != null) {
                mo13295a(bVar.mo13322a());
            }
        }
    }

    /* renamed from: c */
    private synchronized void m13413c() {
        if (!this.f10270e) {
            C3214a aVar = this.f10267a;
            if (aVar != null && aVar.mo13302a() && this.f10267a.mo13307b()) {
                if (C3318a.m13827e()) {
                    this.f10270e = true;
                    this.f10268b = new AbstractRunnableC3362a() {
                        /* class com.bytedance.apm6.p167c.C3212a.C32131 */

                        public void run() {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (C3318a.m13915u()) {
                                C3350b.m13932a("APM-Disk", "startCollect:");
                            }
                            SharedPreferences sharedPreferences = C3318a.m13917w().getSharedPreferences("monitor_config", 0);
                            long j = 0;
                            if (sharedPreferences != null) {
                                j = sharedPreferences.getLong("check_disk_last_time", 0);
                            }
                            long currentTimeMillis2 = System.currentTimeMillis() - j;
                            if (C3318a.m13915u()) {
                                C3350b.m13932a("APM-Disk", "durationMs:" + currentTimeMillis2);
                            }
                            if (currentTimeMillis2 >= 86400000) {
                                C3216b a = C3217c.m13449a().mo13328a(C3212a.this.f10267a);
                                if (C3318a.m13915u()) {
                                    C3350b.m13932a("APM-Disk", "durationMs:" + a.mo13107i());
                                }
                                C3324a.m13872a(a);
                                sharedPreferences.edit().putLong("check_disk_last_time", System.currentTimeMillis()).commit();
                            }
                            C3363b.m13999a(AsyncTaskManagerType.LIGHT_WEIGHT).mo13586b(C3212a.this.f10268b);
                            if (C3318a.m13915u()) {
                                C3350b.m13932a("APM-Disk", "collect end and cost time:" + (System.currentTimeMillis() - currentTimeMillis));
                            }
                        }
                    };
                    C3363b.m13999a(AsyncTaskManagerType.LIGHT_WEIGHT).mo13585a(this.f10268b);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo13294a(AbstractC2918e eVar) {
        C3217c.m13449a().mo13330a(eVar);
    }

    /* renamed from: a */
    public synchronized void mo13295a(C3214a aVar) {
        if (aVar != null) {
            this.f10267a = aVar;
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-Disk", "updateConfig:" + aVar);
            }
            if (this.f10269d) {
                AbstractC3338a aVar2 = (AbstractC3338a) C3336c.m13901a(AbstractC3338a.class);
                if (aVar2 != null && !aVar2.mo13548a()) {
                    m13413c();
                }
            }
        }
    }
}
