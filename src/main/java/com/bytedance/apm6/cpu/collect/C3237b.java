package com.bytedance.apm6.cpu.collect;

import com.bytedance.apm6.cpu.collect.CpuCacheItem;
import com.bytedance.apm6.cpu.p169a.C3227a;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p183g.C3324a;
import com.bytedance.apm6.p184h.p185a.C3331c;
import com.bytedance.apm6.p187i.p191d.C3339b;
import com.bytedance.apm6.util.p195b.C3350b;
import com.bytedance.p725f.p726a.p727a.AbstractC13853c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.apm6.cpu.collect.b */
public class C3237b extends C3339b {

    /* renamed from: a */
    private AtomicBoolean f10373a = new AtomicBoolean(false);

    /* renamed from: b */
    private C3227a f10374b;

    /* renamed from: c */
    private AbstractC13853c f10375c;

    /* renamed from: d */
    private HashMap<String, CpuCacheItem> f10376d;

    /* renamed from: e */
    private HashMap<String, CpuCacheItem> f10377e;

    /* renamed from: f */
    private HashMap<String, CpuCacheItem> f10378f;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13404a(C3227a aVar) {
        if (this.f10373a.compareAndSet(false, true)) {
            this.f10376d = new HashMap<>();
            this.f10377e = new HashMap<>();
            this.f10378f = new HashMap<>();
            this.f10374b = aVar;
        }
    }

    /* renamed from: a */
    public void mo13405a(AbstractC13853c.C13854a aVar) {
        if (this.f10373a.get()) {
            synchronized (C3237b.class) {
                m13543a(CpuCacheItem.CpuDataType.FRONT, aVar);
                m13543a(CpuCacheItem.CpuDataType.BACK, aVar);
                m13543a(CpuCacheItem.CpuDataType.MIX, aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo13407c() {
        return this.f10373a.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.apm6.cpu.collect.b$1 */
    public static /* synthetic */ class C32381 {

        /* renamed from: a */
        static final /* synthetic */ int[] f10379a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.apm6.cpu.collect.CpuCacheItem$CpuDataType[] r0 = com.bytedance.apm6.cpu.collect.CpuCacheItem.CpuDataType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.apm6.cpu.collect.C3237b.C32381.f10379a = r0
                com.bytedance.apm6.cpu.collect.CpuCacheItem$CpuDataType r1 = com.bytedance.apm6.cpu.collect.CpuCacheItem.CpuDataType.MIX     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.apm6.cpu.collect.C3237b.C32381.f10379a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.apm6.cpu.collect.CpuCacheItem$CpuDataType r1 = com.bytedance.apm6.cpu.collect.CpuCacheItem.CpuDataType.BACK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.apm6.cpu.collect.C3237b.C32381.f10379a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.apm6.cpu.collect.CpuCacheItem$CpuDataType r1 = com.bytedance.apm6.cpu.collect.CpuCacheItem.CpuDataType.FRONT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm6.cpu.collect.C3237b.C32381.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo13406b() {
        if (this.f10373a.compareAndSet(true, false)) {
            synchronized (C3237b.class) {
                this.f10377e.clear();
                this.f10378f.clear();
                this.f10376d.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13402a() {
        if (this.f10373a.compareAndSet(false, true)) {
            this.f10376d = new HashMap<>();
            this.f10377e = new HashMap<>();
            this.f10378f = new HashMap<>();
        }
    }

    C3237b(AbstractC13853c cVar) {
        this.f10375c = cVar;
    }

    /* renamed from: a */
    private CpuCacheItem m13542a(CpuCacheItem.CpuDataType cpuDataType, String str) {
        int i = C32381.f10379a[cpuDataType.ordinal()];
        if (i == 1) {
            return this.f10376d.get(str);
        }
        if (i == 2) {
            return this.f10378f.get(str);
        }
        if (i != 3) {
            return null;
        }
        return this.f10377e.get(str);
    }

    /* renamed from: a */
    private void m13543a(CpuCacheItem.CpuDataType cpuDataType, AbstractC13853c.C13854a aVar) {
        Iterator<Map.Entry<String, CpuCacheItem>> it;
        long currentTimeMillis = System.currentTimeMillis();
        int i = C32381.f10379a[cpuDataType.ordinal()];
        if (i == 1) {
            it = this.f10376d.entrySet().iterator();
        } else if (i == 2) {
            it = this.f10378f.entrySet().iterator();
        } else if (i != 3) {
            it = null;
        } else {
            it = this.f10377e.entrySet().iterator();
        }
        if (it != null) {
            while (it.hasNext()) {
                CpuCacheItem value = it.next().getValue();
                if (currentTimeMillis - value.mo13384f() > this.f10374b.mo13348c()) {
                    it.remove();
                    double a = value.mo13374a() / ((double) value.mo13385g());
                    double b = value.mo13377b();
                    double c = value.mo13379c() / ((double) value.mo13385g());
                    double d = value.mo13381d();
                    if (C3318a.m13915u()) {
                        C3350b.m13932a("APM-CPU", "cpu cache item: " + value);
                        C3350b.m13932a("APM-CPU", "assemble cpu data, type: " + cpuDataType + " rate: " + a + " maxRate: " + b + " speed: " + c + " maxSpeed: " + d);
                    }
                    m13544a(cpuDataType, value.mo13383e(), a, b, c, d, aVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13403a(double d, double d2) {
        CpuCacheItem.CpuDataType cpuDataType;
        if (this.f10373a.get()) {
            String str = C3331c.m13887a().mo13566b();
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-CPU", str);
            }
            synchronized (C3237b.class) {
                if (C3233a.m13533a().mo13390c()) {
                    cpuDataType = CpuCacheItem.CpuDataType.FRONT;
                } else {
                    cpuDataType = CpuCacheItem.CpuDataType.BACK;
                }
                CpuCacheItem a = m13541a(cpuDataType, m13542a(cpuDataType, str), d, d2);
                m13545a(cpuDataType, str, a);
                if (C3318a.m13915u()) {
                    C3350b.m13932a("APM-CPU", "after add cache data: " + a);
                }
                m13545a(CpuCacheItem.CpuDataType.MIX, str, m13541a(CpuCacheItem.CpuDataType.MIX, m13542a(CpuCacheItem.CpuDataType.MIX, str), d, d2));
            }
        }
    }

    /* renamed from: a */
    private void m13545a(CpuCacheItem.CpuDataType cpuDataType, String str, CpuCacheItem cpuCacheItem) {
        int i = C32381.f10379a[cpuDataType.ordinal()];
        if (i == 1) {
            this.f10376d.put(str, cpuCacheItem);
        } else if (i == 2) {
            this.f10378f.put(str, cpuCacheItem);
        } else if (i == 3) {
            this.f10377e.put(str, cpuCacheItem);
        }
    }

    /* renamed from: a */
    private CpuCacheItem m13541a(CpuCacheItem.CpuDataType cpuDataType, CpuCacheItem cpuCacheItem, double d, double d2) {
        if (cpuCacheItem == null) {
            cpuCacheItem = new CpuCacheItem(cpuDataType, System.currentTimeMillis());
            cpuCacheItem.mo13375a(C3331c.m13887a().mo13566b());
        }
        if (d >= 0.0d || d2 >= 0.0d) {
            cpuCacheItem.mo13386h();
        }
        cpuCacheItem.mo13380c(d2);
        cpuCacheItem.mo13376a(d);
        cpuCacheItem.mo13378b(d);
        cpuCacheItem.mo13382d(d2);
        return cpuCacheItem;
    }

    /* renamed from: a */
    private void m13544a(CpuCacheItem.CpuDataType cpuDataType, String str, double d, double d2, double d3, double d4, AbstractC13853c.C13854a aVar) {
        C3242d dVar = new C3242d(cpuDataType, str, d, d2, d3, d4, aVar);
        try {
            dVar.mo13416a(this.f10375c.mo51105i());
        } catch (Throwable unused) {
        }
        C3324a.m13872a(dVar);
    }
}
