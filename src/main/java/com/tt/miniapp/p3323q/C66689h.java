package com.tt.miniapp.p3323q;

import android.os.Debug;
import android.text.TextUtils;
import androidx.core.util.C0844e;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.tt.miniapp.debug.PerformanceService;
import com.tt.miniapp.entity.C66012c;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapphost.AbstractC67538f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.util.DebugUtil;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.q.h */
public class C66689h extends AbstractC66676a {

    /* renamed from: c */
    private IAppContext f168349c;

    /* renamed from: com.tt.miniapp.q.h$a */
    public static class C66690a {

        /* renamed from: a */
        public int f168350a = -1;

        /* renamed from: b */
        public AtomicBoolean f168351b = new AtomicBoolean(true);

        /* renamed from: c */
        public AtomicInteger f168352c = new AtomicInteger(1);

        /* renamed from: d */
        public AbstractC66691b f168353d;
    }

    /* renamed from: com.tt.miniapp.q.h$b */
    public interface AbstractC66691b {
        /* renamed from: a */
        void mo231458a(String str);
    }

    /* renamed from: e */
    private String m260466e() {
        return m260468g(m260447a(false)).toString();
    }

    /* renamed from: d */
    private void m260462d() {
        C67485a a = C67485a.m262488a(this.f168349c);
        if (a != null) {
            PerformanceService.C65982a aVar = a.mo234280a().f170181h;
            synchronized (aVar.f166546c) {
                aVar.f166546c.clear();
            }
            synchronized (aVar.f166548e) {
                aVar.f166548e.clear();
            }
            synchronized (aVar.f166549f) {
                aVar.f166549f.clear();
            }
            synchronized (aVar.f166550g) {
                aVar.f166550g.clear();
            }
        }
    }

    /* renamed from: c */
    private boolean m260460c() {
        long j;
        C66690a e = m260465e(this.f168349c);
        if (e.f168351b.get() && ((long) e.f168352c.incrementAndGet()) < 3) {
            return false;
        }
        if (DebugUtil.debug()) {
            j = 6;
        } else {
            j = 12;
        }
        if (!e.f168351b.get() && ((long) e.f168352c.incrementAndGet()) < j) {
            return false;
        }
        e.f168352c.set(1);
        e.f168351b.set(false);
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.p3323q.AbstractC66676a
    /* renamed from: b */
    public void mo232429b() {
        C67485a a;
        if (!this.f168349c.isDestroyed() && !this.f168349c.isDestroying() && (a = C67485a.m262488a(this.f168349c)) != null) {
            if (!a.mo234280a().f170181h.f166545b) {
                AppBrandLogger.m52829e("tma_MonitorInfoPackTask", "isReportPerformance not support");
            } else if (m260460c()) {
                C66012c a2 = m260447a(false);
                C66012c a3 = m260447a(true);
                m260462d();
                if (a2.f166642e > 0 || a2.f166643f > 0 || a2.f166644g > 0) {
                    m260469h(a2);
                }
                if (a3.f166642e > 0 || a3.f166643f > 0 || a3.f166644g > 0) {
                    m260469h(a3);
                }
            }
        }
    }

    @Override // com.tt.miniapp.p3323q.AbstractC66676a
    /* renamed from: a */
    public void mo232428a() {
        super.mo232428a();
        if (m260465e(this.f168349c).f168353d != null) {
            m260465e(this.f168349c).f168353d.mo231458a(m260466e());
        }
    }

    public C66689h(IAppContext iAppContext) {
        super(10000);
        this.f168349c = iAppContext;
    }

    /* renamed from: a */
    public static void m260449a(IAppContext iAppContext) {
        m260465e(iAppContext).f168353d = null;
    }

    /* renamed from: e */
    private int m260464e(C66012c cVar) {
        if (cVar.f166639b) {
            return 24;
        }
        return 54;
    }

    /* renamed from: f */
    private int m260467f(C66012c cVar) {
        if (cVar.f166639b) {
            return 80;
        }
        return 55;
    }

    /* renamed from: e */
    private static C66690a m260465e(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234280a().f170182i;
    }

    /* renamed from: a */
    private int m260446a(List<Integer> list) {
        if (list == null || list.size() <= 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            Integer num = list.get(i3);
            if (num != null && num.intValue() > 0) {
                i++;
                i2 += num.intValue();
            }
        }
        if (i > 0) {
            return Math.round((float) (i2 / i));
        }
        return 0;
    }

    /* renamed from: b */
    public static int m260454b(IAppContext iAppContext) {
        C67485a a = C67485a.m262488a(iAppContext);
        if (a == null) {
            return 0;
        }
        PerformanceService.C65982a aVar = a.mo234280a().f170181h;
        if (aVar.f166548e.size() > 0) {
            return aVar.f166548e.getLast().f3318b.intValue();
        }
        return 0;
    }

    /* renamed from: c */
    public static int m260457c(IAppContext iAppContext) {
        C67485a a = C67485a.m262488a(iAppContext);
        if (a == null) {
            return 0;
        }
        PerformanceService.C65982a aVar = a.mo234280a().f170181h;
        if (aVar.f166547d.size() > 0) {
            return aVar.f166547d.getLast().f3318b.intValue();
        }
        return 0;
    }

    /* renamed from: d */
    public static int m260461d(IAppContext iAppContext) {
        C67485a a = C67485a.m262488a(iAppContext);
        if (a == null) {
            return 0;
        }
        PerformanceService.C65982a aVar = a.mo234280a().f170181h;
        if (aVar.f166549f.size() > 0) {
            return aVar.f166549f.getLast().f3318b.getTotalPss();
        }
        return 0;
    }

    /* renamed from: a */
    private void m260450a(C66012c cVar) {
        C67485a a = C67485a.m262488a(this.f168349c);
        if (a != null) {
            PerformanceService.C65982a aVar = a.mo234280a().f170181h;
            synchronized (aVar.f166550g) {
                List<Integer> list = aVar.f166550g.get(0);
                if (list != null && list.size() > 0) {
                    cVar.f166663z = m260446a(list);
                }
            }
        }
    }

    /* renamed from: b */
    private void m260455b(C66012c cVar) {
        C67485a a = C67485a.m262488a(this.f168349c);
        if (a != null) {
            PerformanceService.C65982a aVar = a.mo234280a().f170181h;
            synchronized (aVar.f166550g) {
                List<Integer> list = aVar.f166550g.get(1);
                if (list != null && list.size() > 0) {
                    cVar.f166634A = m260446a(list);
                }
            }
        }
    }

    /* renamed from: c */
    private void m260458c(C66012c cVar) {
        C67485a a = C67485a.m262488a(this.f168349c);
        if (a != null) {
            PerformanceService.C65982a aVar = a.mo234280a().f170181h;
            synchronized (aVar.f166550g) {
                List<Integer> list = aVar.f166550g.get(2);
                if (list != null && list.size() > 0) {
                    cVar.f166635B = m260446a(list);
                }
            }
        }
    }

    /* renamed from: h */
    private void m260469h(C66012c cVar) {
        JSONObject g = m260468g(cVar);
        AppBrandLogger.m52828d("tma_MonitorInfoPackTask", g.toString());
        C66020b.m258530a("mp_performance_report", this.f168349c).mo231091a(g).mo231092a();
        AppBrandLogger.m52828d("tma_MonitorInfoPackTask", "avgCpuFront: " + g.optInt("avg_cpu_front", -1));
    }

    /* renamed from: d */
    private void m260463d(C66012c cVar) {
        C67485a a = C67485a.m262488a(this.f168349c);
        if (a != null) {
            PerformanceService.C65982a aVar = a.mo234280a().f170181h;
            synchronized (aVar.f166550g) {
                List<Integer> list = aVar.f166550g.get(3);
                if (list != null && list.size() > 0) {
                    cVar.f166636C = m260446a(list);
                }
            }
        }
    }

    /* renamed from: g */
    private JSONObject m260468g(C66012c cVar) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            int i = 0;
            if (TextUtils.isEmpty(cVar.f166638a)) {
                AppBrandLogger.m52829e("tma_MonitorInfoPackTask", "TextUtils.isEmpty(entity.appID)");
                return jSONObject;
            }
            jSONObject.put("app_id", cVar.f166638a);
            if (cVar.f166639b) {
                str = "micro_game";
            } else {
                str = "micro_app";
            }
            jSONObject.put("_param_for_special", str);
            jSONObject.put("js_version", cVar.f166640c);
            if (cVar.f166637D > 0) {
                jSONObject.put("avg_router_time", cVar.f166637D);
            }
            if (cVar.f166642e > 0) {
                jSONObject.put("avg_cpu_ratio", cVar.f166645h);
            }
            if (cVar.f166646i >= 0) {
                jSONObject.put("secondary_cpu_rate", cVar.f166646i);
                jSONObject.put("avg_cpu_front", cVar.f166658u);
                jSONObject.put("cpu_threshold_times", (double) cVar.f166659v);
            }
            if (cVar.f166643f > 0) {
                jSONObject.put("min_fps", cVar.f166657t);
                jSONObject.put("avg_fps", cVar.f166656s);
                jSONObject.put("fps_threshold", (double) cVar.f166661x);
            }
            if (cVar.f166644g > 0) {
                jSONObject.put("max_memory_allocation", cVar.f166647j);
                jSONObject.put("avg_memory_ratio", cVar.f166655r);
                if (cVar.f166641d) {
                    i = 1;
                }
                jSONObject.put("is_background", i);
                jSONObject.put("max_dalvik_pss", cVar.f166649l);
                jSONObject.put("avg_dalvik_pss", cVar.f166648k);
                jSONObject.put("max_native_pss", cVar.f166651n);
                jSONObject.put("avg_native_pss", cVar.f166650m);
                jSONObject.put("max_total_pss", cVar.f166653p);
                jSONObject.put("avg_total_pss", cVar.f166652o);
                jSONObject.put("avg_other_pss", cVar.f166660w);
            }
            if (!m260465e(this.f168349c).f168351b.get()) {
                if (cVar.f166663z > 0) {
                    jSONObject.put("avg_game_fps", cVar.f166663z);
                }
                if (cVar.f166634A > 0) {
                    jSONObject.put("avg_draw_call", cVar.f166634A);
                }
                if (cVar.f166636C > 0) {
                    jSONObject.put("avg_tri", cVar.f166636C);
                }
                if (cVar.f166635B > 0) {
                    jSONObject.put("avg_vert", cVar.f166635B);
                }
            }
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private C66012c m260447a(boolean z) {
        float f;
        LinkedList<C0844e<Boolean, Debug.MemoryInfo>> linkedList;
        Throwable th;
        LinkedList<C0844e<Boolean, Debug.MemoryInfo>> linkedList2;
        C66012c cVar;
        PerformanceService.C65982a aVar;
        boolean z2;
        C66012c cVar2 = new C66012c();
        cVar2.f166641d = z;
        AbstractC67538f a = C67432a.m262319a(this.f168349c);
        if (a == null) {
            return cVar2;
        }
        AppInfoEntity appInfo = a.getAppInfo();
        int i = 0;
        if (appInfo != null) {
            cVar2.f166638a = appInfo.appId;
            if (appInfo.type == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            cVar2.f166639b = z2;
            cVar2.f166640c = C66399c.m259608a().mo231922b(AppbrandContext.getInst().getApplicationContext(), this.f168349c);
        }
        C67485a a2 = C67485a.m262488a(this.f168349c);
        if (a2 == null) {
            return cVar2;
        }
        PerformanceService.C65982a aVar2 = a2.mo234280a().f170181h;
        synchronized (aVar2.f166546c) {
            int size = aVar2.f166546c.size();
            f = BitmapDescriptorFactory.HUE_RED;
            if (size > 0) {
                int i2 = 0;
                float f2 = BitmapDescriptorFactory.HUE_RED;
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    C0844e<Boolean, Integer> eVar = aVar2.f166546c.get(i4);
                    if (eVar != null) {
                        if (eVar.f3317a.booleanValue() == z) {
                            int intValue = eVar.f3318b.intValue();
                            i3 = Math.max(i3, intValue);
                            f2 += (float) intValue;
                            i2++;
                        }
                    }
                }
                if (i2 > 0) {
                    cVar2.f166645h = Math.round(f2 / ((float) i2));
                    cVar2.f166642e = i2;
                }
            }
        }
        synchronized (aVar2.f166547d) {
            int size2 = aVar2.f166547d.size();
            if (size2 > 0) {
                int i5 = 0;
                float f3 = BitmapDescriptorFactory.HUE_RED;
                int i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < size2; i8++) {
                    C0844e<Boolean, Integer> eVar2 = aVar2.f166547d.get(i8);
                    if (eVar2 != null) {
                        if (eVar2.f3317a.booleanValue() == z) {
                            int intValue2 = eVar2.f3318b.intValue();
                            if (intValue2 > m260467f(cVar2)) {
                                i6++;
                            }
                            i7 = Math.max(i7, intValue2);
                            f3 += (float) intValue2;
                            i5++;
                        }
                    }
                }
                if (i5 > 0) {
                    cVar2.f166658u = Math.round(f3 / ((float) i5));
                    cVar2.f166662y = i5;
                    cVar2.f166659v = (float) ((i6 * 100) / i5);
                }
            }
        }
        cVar2.f166646i = m260465e(this.f168349c).f168350a;
        synchronized (aVar2.f166548e) {
            int size3 = aVar2.f166548e.size();
            if (size3 > 0) {
                int i9 = Integer.MAX_VALUE;
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < size3; i12++) {
                    C0844e<Boolean, Integer> eVar3 = aVar2.f166548e.get(i12);
                    if (eVar3 != null) {
                        if (eVar3.f3317a.booleanValue() == z) {
                            int intValue3 = eVar3.f3318b.intValue();
                            i9 = Math.min(i9, intValue3);
                            f += (float) intValue3;
                            i10++;
                            if (intValue3 < m260464e(cVar2)) {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > 0) {
                    cVar2.f166656s = Math.round(f / ((float) i10));
                    cVar2.f166657t = i9;
                    cVar2.f166643f = i10;
                    cVar2.f166661x = (float) ((i11 * 100) / i10);
                }
            }
        }
        LinkedList<C0844e<Boolean, Debug.MemoryInfo>> linkedList3 = aVar2.f166549f;
        synchronized (linkedList3) {
            try {
                int size4 = aVar2.f166549f.size();
                if (size4 > 0) {
                    long j = 0;
                    long j2 = 0;
                    int i13 = 0;
                    long j3 = 0;
                    long j4 = 0;
                    long j5 = 0;
                    long j6 = 0;
                    long j7 = 0;
                    while (i < size4) {
                        try {
                            C0844e<Boolean, Debug.MemoryInfo> eVar4 = aVar2.f166549f.get(i);
                            if (eVar4 != null) {
                                aVar = aVar2;
                                if (eVar4.f3317a.booleanValue() == z) {
                                    S s = eVar4.f3318b;
                                    if (s != null) {
                                        linkedList = linkedList3;
                                        j4 = Math.max(j4, (long) ((Debug.MemoryInfo) s).dalvikPss);
                                        j2 = Math.max(j2, (long) ((Debug.MemoryInfo) s).nativePss);
                                        j = Math.max(j, (long) s.getTotalPss());
                                        j3 += (long) ((Debug.MemoryInfo) s).dalvikPss;
                                        j5 += (long) ((Debug.MemoryInfo) s).nativePss;
                                        j6 += (long) s.getTotalPss();
                                        j7 += (long) ((Debug.MemoryInfo) s).otherPss;
                                        i13++;
                                        i++;
                                        size4 = size4;
                                        aVar2 = aVar;
                                        linkedList3 = linkedList;
                                    }
                                }
                            } else {
                                aVar = aVar2;
                            }
                            linkedList = linkedList3;
                            i++;
                            size4 = size4;
                            aVar2 = aVar;
                            linkedList3 = linkedList;
                        } catch (Throwable th2) {
                            th = th2;
                            while (true) {
                                break;
                            }
                            throw th;
                        }
                    }
                    linkedList2 = linkedList3;
                    if (i13 > 0) {
                        long j8 = (long) i13;
                        cVar = cVar2;
                        cVar.f166648k = j3 / j8;
                        cVar.f166649l = j4;
                        cVar.f166650m = j5 / j8;
                        cVar.f166651n = j2;
                        cVar.f166652o = j6 / j8;
                        cVar.f166653p = j;
                        cVar.f166660w = j7 / j8;
                        cVar.f166644g = i13;
                    } else {
                        cVar = cVar2;
                    }
                } else {
                    cVar = cVar2;
                    linkedList2 = linkedList3;
                }
                m260450a(cVar);
                m260455b(cVar);
                m260458c(cVar);
                m260463d(cVar);
                if (C66681e.m260431c() > 0) {
                    cVar.f166647j = C66681e.m260431c();
                    if (cVar.f166647j > 0 && cVar.f166644g > 0) {
                        float f4 = (float) cVar.f166647j;
                        cVar.f166654q = Math.round((((float) cVar.f166653p) / f4) * 100.0f);
                        cVar.f166655r = Math.round((((float) cVar.f166652o) / f4) * 100.0f);
                    }
                }
                cVar.f166637D = C66692i.m260475b(this.f168349c);
                return cVar;
            } catch (Throwable th3) {
                th = th3;
                linkedList = linkedList3;
                while (true) {
                    break;
                }
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m260448a(int i, IAppContext iAppContext) {
        synchronized (C66689h.class) {
            m260465e(iAppContext).f168350a = i;
        }
    }

    /* renamed from: a */
    public static void m260451a(AbstractC66691b bVar, IAppContext iAppContext) {
        m260465e(iAppContext).f168353d = bVar;
    }

    /* renamed from: a */
    public static void m260452a(boolean z, int i, IAppContext iAppContext) {
        C67485a a = C67485a.m262488a(iAppContext);
        if (a != null) {
            PerformanceService.C65982a aVar = a.mo234280a().f170181h;
            synchronized (aVar.f166546c) {
                aVar.f166546c.offer(new C0844e<>(Boolean.valueOf(z), Integer.valueOf(i)));
                if (aVar.f166546c.size() > 30) {
                    aVar.f166546c.pollFirst();
                }
            }
        }
    }

    /* renamed from: b */
    public static void m260456b(boolean z, int i, IAppContext iAppContext) {
        C67485a a = C67485a.m262488a(iAppContext);
        if (a != null) {
            PerformanceService.C65982a aVar = a.mo234280a().f170181h;
            synchronized (aVar.f166548e) {
                aVar.f166548e.offer(new C0844e<>(Boolean.valueOf(z), Integer.valueOf(i)));
                if (aVar.f166548e.size() > 30) {
                    aVar.f166548e.pollFirst();
                }
            }
        }
    }

    /* renamed from: c */
    public static void m260459c(boolean z, int i, IAppContext iAppContext) {
        C67485a a = C67485a.m262488a(iAppContext);
        if (a != null) {
            PerformanceService.C65982a aVar = a.mo234280a().f170181h;
            synchronized (aVar.f166547d) {
                aVar.f166547d.offer(new C0844e<>(Boolean.valueOf(z), Integer.valueOf(i)));
                if (aVar.f166547d.size() > 30) {
                    aVar.f166547d.pollFirst();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m260453a(boolean z, Debug.MemoryInfo memoryInfo, IAppContext iAppContext) {
        C67485a a = C67485a.m262488a(iAppContext);
        if (a != null) {
            PerformanceService.C65982a aVar = a.mo234280a().f170181h;
            synchronized (aVar.f166549f) {
                aVar.f166549f.offer(new C0844e<>(Boolean.valueOf(z), memoryInfo));
                if (aVar.f166549f.size() > 30) {
                    aVar.f166549f.pollFirst();
                }
            }
        }
    }
}
