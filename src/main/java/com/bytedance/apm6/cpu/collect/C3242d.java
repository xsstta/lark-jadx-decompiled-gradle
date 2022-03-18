package com.bytedance.apm6.cpu.collect;

import android.util.Log;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.util.C3130n;
import com.bytedance.apm6.cpu.collect.CpuCacheItem;
import com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.p725f.p726a.p727a.AbstractC13853c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.cpu.collect.d */
public class C3242d extends AbstractC3329a {

    /* renamed from: g */
    private CpuCacheItem.CpuDataType f10390g;

    /* renamed from: h */
    private AbstractC13853c.C13854a f10391h;

    /* renamed from: i */
    private String f10392i;

    /* renamed from: j */
    private double f10393j = -1.0d;

    /* renamed from: k */
    private double f10394k = -1.0d;

    /* renamed from: l */
    private double f10395l = -1.0d;

    /* renamed from: m */
    private double f10396m = -1.0d;

    /* renamed from: n */
    private boolean f10397n = true;

    /* renamed from: o */
    private boolean f10398o = true;

    /* renamed from: p */
    private List<C3130n<String, Double>> f10399p;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a
    /* renamed from: a */
    public String mo13323a() {
        return "cpu";
    }

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: h */
    public boolean mo13106h() {
        return true;
    }

    /* renamed from: com.bytedance.apm6.cpu.collect.d$1 */
    static /* synthetic */ class C32431 {

        /* renamed from: a */
        static final /* synthetic */ int[] f10400a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.apm6.cpu.collect.CpuCacheItem$CpuDataType[] r0 = com.bytedance.apm6.cpu.collect.CpuCacheItem.CpuDataType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.apm6.cpu.collect.C3242d.C32431.f10400a = r0
                com.bytedance.apm6.cpu.collect.CpuCacheItem$CpuDataType r1 = com.bytedance.apm6.cpu.collect.CpuCacheItem.CpuDataType.MIX     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.apm6.cpu.collect.C3242d.C32431.f10400a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.apm6.cpu.collect.CpuCacheItem$CpuDataType r1 = com.bytedance.apm6.cpu.collect.CpuCacheItem.CpuDataType.BACK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.apm6.cpu.collect.C3242d.C32431.f10400a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.apm6.cpu.collect.CpuCacheItem$CpuDataType r1 = com.bytedance.apm6.cpu.collect.CpuCacheItem.CpuDataType.FRONT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm6.cpu.collect.C3242d.C32431.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a
    /* renamed from: c */
    public JSONObject mo13325c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("process_name", C2785b.m11756d());
            jSONObject.put("is_main_process", C2785b.m11761e());
            jSONObject.put("scene", this.f10392i);
            int i = C32431.f10400a[this.f10390g.ordinal()];
            if (i == 1) {
                jSONObject.put("data_type", "mix");
            } else if (i == 2) {
                jSONObject.put("data_type", "back");
            } else if (i == 3) {
                jSONObject.put("data_type", "front");
            }
            return jSONObject;
        } catch (Throwable th) {
            Log.e("APM-CPU", "error: " + th.getLocalizedMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a
    /* renamed from: d */
    public JSONObject mo13326d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_auto_sample", this.f10397n);
            if (this.f10391h != null) {
                jSONObject.put("network_type", NetworkUtils.getNetworkTypeFast(C2785b.m11735a()));
                jSONObject.put("battery_level", this.f10391h.f36223c);
                jSONObject.put("cpu_hardware", this.f10391h.f36221a);
                jSONObject.put("is_charging", this.f10391h.f36222b);
                jSONObject.put("power_save_mode", this.f10391h.f36225e);
                jSONObject.put("thermal_status", this.f10391h.f36224d);
                jSONObject.put("battery_thermal", (double) this.f10391h.f36226f);
                jSONObject.put("is_normal_sample_state", this.f10398o);
            }
            return jSONObject;
        } catch (Throwable th) {
            Log.e("APM-CPU", "error: " + th.getLocalizedMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm6.p184h.p185a.p186a.AbstractC3329a
    /* renamed from: b */
    public JSONObject mo13324b() {
        try {
            JSONObject jSONObject = new JSONObject();
            double d = this.f10393j;
            if (d > -1.0d && this.f10394k > -1.0d) {
                jSONObject.put("app_usage_rate", d);
                jSONObject.put("app_max_usage_rate", this.f10394k);
            }
            double d2 = this.f10395l;
            if (d2 > -1.0d && this.f10396m > -1.0d) {
                jSONObject.put("app_stat_speed", d2);
                jSONObject.put("app_max_stat_speed", this.f10396m);
            }
            List<C3130n<String, Double>> list = this.f10399p;
            if (list != null && !list.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                for (C3130n<String, Double> nVar : this.f10399p) {
                    if (!(nVar == null || nVar.f10052a == null || nVar.f10052a.isEmpty() || nVar.f10053b == null)) {
                        if (nVar.f10053b.doubleValue() >= 0.0d) {
                            jSONObject2.put(nVar.f10052a, nVar.f10053b);
                        }
                    }
                }
                jSONObject.put("thread_cpu_usage", jSONObject2);
            }
            return jSONObject;
        } catch (Throwable th) {
            Log.e("APM-CPU", "error: " + th.getLocalizedMessage());
            return null;
        }
    }

    /* renamed from: a */
    public void mo13416a(boolean z) {
        this.f10398o = z;
    }

    public C3242d(CpuCacheItem.CpuDataType cpuDataType, String str, List<C3130n<String, Double>> list, AbstractC13853c.C13854a aVar) {
        this.f10399p = new ArrayList(list);
        this.f10390g = cpuDataType;
        this.f10392i = str;
        this.f10391h = aVar;
    }

    public C3242d(CpuCacheItem.CpuDataType cpuDataType, String str, double d, double d2, double d3, double d4, AbstractC13853c.C13854a aVar) {
        this.f10390g = cpuDataType;
        this.f10392i = str;
        this.f10393j = d;
        this.f10394k = d2;
        this.f10395l = d3;
        this.f10396m = d4;
        this.f10391h = aVar;
    }
}
