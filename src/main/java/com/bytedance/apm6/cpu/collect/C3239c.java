package com.bytedance.apm6.cpu.collect;

import android.os.Process;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.p139e.C2921a;
import com.bytedance.apm.util.C3112b;
import com.bytedance.apm.util.C3130n;
import com.bytedance.apm6.cpu.C3223a;
import com.bytedance.apm6.cpu.collect.CpuCacheItem;
import com.bytedance.apm6.cpu.exception.C3266h;
import com.bytedance.apm6.cpu.exception.C3267i;
import com.bytedance.apm6.cpu.p169a.C3227a;
import com.bytedance.apm6.cpu.p170b.C3230a;
import com.bytedance.apm6.p183g.C3324a;
import com.bytedance.apm6.p184h.p185a.C3331c;
import com.bytedance.apm6.p187i.p191d.C3339b;
import com.bytedance.apm6.p187i.p192e.AbstractC3341a;
import com.bytedance.apm6.util.p195b.C3350b;
import com.bytedance.apm6.util.timetask.AbstractRunnableC3362a;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.apm6.util.timetask.C3363b;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.p725f.p726a.p727a.AbstractC13853c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.apm6.cpu.collect.c */
public class C3239c extends C3339b {

    /* renamed from: a */
    public long f10380a;

    /* renamed from: b */
    public long f10381b;

    /* renamed from: c */
    public boolean f10382c = true;

    /* renamed from: d */
    private C3237b f10383d;

    /* renamed from: e */
    private AtomicBoolean f10384e = new AtomicBoolean(false);

    /* renamed from: f */
    private AbstractRunnableC3362a f10385f;

    /* renamed from: g */
    private C3227a f10386g;

    /* renamed from: h */
    private AbstractC13853c f10387h;

    /* renamed from: d */
    private void m13553d() {
        this.f10385f = new AbstractRunnableC3362a(30000, 30000) {
            /* class com.bytedance.apm6.cpu.collect.C3239c.C32401 */

            public void run() {
                if (C2785b.m11769j()) {
                    C3350b.m13932a("APM-CPU", "run: " + C3239c.this.f10380a);
                }
                C3239c.this.mo13410a(C3233a.m13533a().mo13390c());
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - C3239c.this.f10381b > C3239c.this.f10380a) {
                    C3239c.this.f10381b = currentTimeMillis;
                    if (!C3239c.this.f10382c) {
                        C3239c.this.mo13412c();
                    }
                    C3239c.this.f10382c = false;
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13408a() {
        if (this.f10384e.compareAndSet(true, false) && this.f10385f != null) {
            C3363b.m13999a(AsyncTaskManagerType.LIGHT_WEIGHT).mo13586b(this.f10385f);
            try {
                this.f10387h.mo51099c();
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo13411b() {
        if (this.f10384e.compareAndSet(false, true)) {
            m13553d();
            if (this.f10385f != null) {
                C3363b.m13999a(AsyncTaskManagerType.LIGHT_WEIGHT).mo13585a(this.f10385f);
            }
            try {
                this.f10387h.mo51098b();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    public void mo13412c() {
        long currentTimeMillis = System.currentTimeMillis();
        long e = C3112b.m12951e();
        long c = C3112b.m12949c();
        HashMap hashMap = new HashMap();
        C3266h.m13645a(Process.myPid(), hashMap);
        try {
            Thread.sleep(360);
        } catch (InterruptedException unused) {
        }
        HashMap hashMap2 = new HashMap();
        C3266h.m13645a(Process.myPid(), hashMap2);
        double d = -1.0d;
        long e2 = C3112b.m12951e();
        long c2 = C3112b.m12949c() - c;
        if (c2 > 0) {
            d = (double) ((((float) e2) - ((float) e)) / ((float) c2));
            C2921a.m12361d("MonitorCpu", "appCpuRate -> " + d);
        }
        double d2 = (((double) e2) - ((double) e)) * 1000.0d;
        double currentTimeMillis2 = (d2 / ((double) (System.currentTimeMillis() - currentTimeMillis))) / ((double) C3112b.m12938a(100));
        if (C2785b.m11769j()) {
            C3350b.m13932a("APM-CPU", String.valueOf(d2) + " " + (System.currentTimeMillis() - currentTimeMillis) + " " + C3112b.m12938a(100));
        }
        C2921a.m12361d("MonitorCpu", "appCpuSpeed -> " + currentTimeMillis2);
        if (C2785b.m11769j()) {
            C3350b.m13932a("APM-CPU", "collect cpu data, rate: " + d + " speed: " + currentTimeMillis2);
        }
        try {
            this.f10387h.mo51103g();
        } catch (Throwable unused2) {
        }
        AbstractC13853c.C13854a aVar = null;
        try {
            aVar = this.f10387h.mo51106j();
        } catch (Throwable unused3) {
        }
        if (this.f10383d.mo13407c()) {
            this.f10383d.mo13403a(d, currentTimeMillis2);
            this.f10383d.mo13405a(aVar);
        }
        C3230a.m13514a().mo13369a(d, currentTimeMillis2);
        m13552a(((float) e2) - ((float) e), hashMap, hashMap2, aVar);
        C3223a.AbstractC3224a d3 = C3233a.m13533a().mo13391d();
        if (d3 != null) {
            d3.mo13340a(currentTimeMillis2, d, C3331c.m13887a().mo13566b(), aVar, NetworkUtils.getNetworkTypeFast(C2785b.m11735a()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13409a(C3227a aVar) {
        if (this.f10384e.compareAndSet(false, true)) {
            this.f10386g = aVar;
            m13553d();
            if (this.f10385f != null) {
                C3363b.m13999a(AsyncTaskManagerType.LIGHT_WEIGHT).mo13585a(this.f10385f);
            }
            try {
                this.f10387h.mo51098b();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo13410a(boolean z) {
        long j;
        if (z) {
            j = this.f10386g.mo13343a();
        } else {
            j = this.f10386g.mo13346b();
        }
        if (j != this.f10380a) {
            this.f10380a = j;
        }
    }

    C3239c(C3237b bVar, AbstractC13853c cVar) {
        this.f10383d = bVar;
        this.f10387h = cVar;
    }

    /* renamed from: a */
    private void m13552a(float f, Map<Integer, C3267i> map, Map<Integer, C3267i> map2, AbstractC13853c.C13854a aVar) {
        CpuCacheItem.CpuDataType cpuDataType;
        C3267i iVar;
        if (!(map.isEmpty() || map2.isEmpty() || f <= BitmapDescriptorFactory.HUE_RED)) {
            LinkedList linkedList = new LinkedList();
            LinkedList<AbstractC3341a.C3342a> linkedList2 = new LinkedList<>();
            for (Map.Entry<Integer, C3267i> entry : map.entrySet()) {
                C3267i value = entry.getValue();
                if (!(value == null || (iVar = map2.get(entry.getKey())) == null || !iVar.mo13464g().equals(value.mo13464g()))) {
                    double h = (((double) iVar.mo13465h()) - ((double) value.mo13465h())) / ((double) f);
                    linkedList.add(new C3130n(iVar.mo13464g(), Double.valueOf(String.format("%.2f", Double.valueOf(h)))));
                    linkedList2.add(new AbstractC3341a.C3342a(iVar.mo13464g(), Double.valueOf(String.format("%.2f", Double.valueOf(h))).doubleValue(), iVar.mo13463f()));
                }
            }
            if (!linkedList.isEmpty()) {
                Collections.sort(linkedList2, new Comparator<AbstractC3341a.C3342a>() {
                    /* class com.bytedance.apm6.cpu.collect.C3239c.C32412 */

                    /* renamed from: a */
                    public int compare(AbstractC3341a.C3342a aVar, AbstractC3341a.C3342a aVar2) {
                        return (int) ((aVar2.mo13572a() * 100.0d) - (aVar.mo13572a() * 100.0d));
                    }
                });
                C3230a.m13514a().mo13370a(linkedList2);
                if (this.f10386g.mo13350d()) {
                    if (C3233a.m13533a().mo13390c()) {
                        cpuDataType = CpuCacheItem.CpuDataType.FRONT;
                    } else {
                        cpuDataType = CpuCacheItem.CpuDataType.BACK;
                    }
                    C3242d dVar = new C3242d(cpuDataType, C3331c.m13887a().mo13566b(), linkedList, aVar);
                    try {
                        dVar.mo13416a(this.f10387h.mo51105i());
                    } catch (Throwable unused) {
                    }
                    C3324a.m13872a(dVar);
                }
            }
        }
    }
}
