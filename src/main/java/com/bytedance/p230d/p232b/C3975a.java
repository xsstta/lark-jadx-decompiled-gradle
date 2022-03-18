package com.bytedance.p230d.p232b;

import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.block.AbstractC2833a;
import com.bytedance.apm.block.AbstractC2865d;
import com.bytedance.apm.block.C2866e;
import com.bytedance.apm.block.C2869g;
import com.bytedance.apm.block.p136a.C2848f;
import com.bytedance.apm.block.p136a.C2854g;
import com.bytedance.apm.block.p136a.C2861h;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p126b.C2750c;
import com.bytedance.apm.p124a.p126b.C2751d;
import com.bytedance.apm.p139e.C2930g;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm6.util.C3359i;
import com.bytedance.monitor.collector.AbstractC20122a;
import com.bytedance.monitor.collector.AbstractC20130d;
import com.bytedance.monitor.collector.C20134g;
import com.bytedance.monitor.collector.C20152k;
import com.bytedance.monitor.collector.C20163o;
import com.bytedance.p230d.p231a.C3971a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.d.b.a */
public class C3975a extends AbstractC2833a implements AbstractC2865d {

    /* renamed from: a */
    public static boolean f12073a;

    /* renamed from: b */
    public static boolean f12074b;

    /* renamed from: c */
    private static C3975a f12075c;

    /* renamed from: d */
    private static AbstractC3981b f12076d;

    /* renamed from: k */
    private static long f12077k;

    /* renamed from: l */
    private static volatile boolean f12078l;

    /* renamed from: e */
    private volatile boolean f12079e;

    /* renamed from: f */
    private C2854g.C2860a f12080f;

    /* renamed from: g */
    private C2854g.C2860a f12081g;

    /* renamed from: h */
    private volatile String f12082h;

    /* renamed from: i */
    private long[] f12083i;

    /* renamed from: j */
    private boolean f12084j;

    /* renamed from: m */
    private volatile long f12085m;

    /* renamed from: n */
    private RunnableC3979a f12086n;

    /* renamed from: o */
    private boolean f12087o;

    /* renamed from: com.bytedance.d.b.a$a */
    private class RunnableC3979a implements Runnable {

        /* renamed from: a */
        public boolean f12093a;

        /* renamed from: b */
        public boolean f12094b;

        /* renamed from: c */
        long[] f12095c;

        /* renamed from: d */
        long[] f12096d;

        /* renamed from: e */
        long f12097e;

        /* renamed from: f */
        long f12098f;

        /* renamed from: g */
        long f12099g;

        /* renamed from: h */
        String f12100h;

        /* renamed from: i */
        boolean f12101i;

        /* renamed from: j */
        String f12102j;

        /* renamed from: k */
        String f12103k;

        /* renamed from: l */
        long f12104l;

        /* renamed from: m */
        C20134g.C20143e f12105m;

        public void run() {
            mo15654a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo15654a() {
            try {
                LinkedList linkedList = new LinkedList();
                long[] jArr = this.f12096d;
                if (jArr.length > 0) {
                    C3971a.m16570a(jArr, linkedList, true, this.f12099g);
                    C3971a.m16569a(linkedList, 30, new C3971a.AbstractC3973a() {
                        /* class com.bytedance.p230d.p232b.C3975a.RunnableC3979a.C39801 */

                        @Override // com.bytedance.p230d.p231a.C3971a.AbstractC3973a
                        /* renamed from: a */
                        public int mo15643a() {
                            return 60;
                        }

                        @Override // com.bytedance.p230d.p231a.C3971a.AbstractC3973a
                        /* renamed from: a */
                        public boolean mo15645a(long j, int i) {
                            return j < ((long) (i * 5));
                        }

                        @Override // com.bytedance.p230d.p231a.C3971a.AbstractC3973a
                        /* renamed from: a */
                        public void mo15644a(List<C2861h> list, int i) {
                            if (C2785b.m11769j()) {
                                C2930g.m12387b("EvilMethodTracer", "[fallback] size:%s targetSize:%s stack:%s", Integer.valueOf(i), 30, list);
                            }
                            ListIterator<C2861h> listIterator = list.listIterator(Math.min(i, 30));
                            while (listIterator.hasNext()) {
                                listIterator.next();
                                listIterator.remove();
                            }
                        }
                    });
                }
                if (linkedList.size() > 2) {
                    StringBuilder sb = new StringBuilder();
                    long max = Math.max(this.f12098f, C3971a.m16564a(linkedList, sb));
                    String a = C3971a.m16565a(linkedList, max);
                    JSONObject jSONObject = new JSONObject();
                    String sb2 = sb.toString();
                    C20134g.C20143e eVar = this.f12105m;
                    if (eVar != null) {
                        eVar.mo68260a(this.f12103k, null, null, sb2);
                    }
                    jSONObject.put("stack", sb2);
                    jSONObject.put("stack_key", a);
                    jSONObject.put("scene", this.f12100h);
                    jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, max);
                    jSONObject.put("cpu_cost", this.f12097e);
                    jSONObject.put("method_time", max);
                    C20152k a2 = C20152k.m73538a();
                    long j = this.f12099g;
                    JSONObject a3 = a2.mo68285a(j - this.f12098f, j);
                    C2854g a4 = C2854g.m12031a();
                    long j2 = this.f12099g;
                    a3.put("evil_method", a4.mo12263a(j2 - this.f12098f, j2));
                    jSONObject.put("custom", a3);
                    jSONObject.put("message", C20163o.m73581a(this.f12102j));
                    jSONObject.put("timestamp", this.f12099g);
                    jSONObject.put("event_type", "lag_drop_frame");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("crash_section", C2785b.m11754c(this.f12104l));
                    jSONObject2.put("block_frame", String.valueOf(this.f12094b));
                    jSONObject2.put("block_input", String.valueOf(this.f12093a));
                    jSONObject2.put("trace_type", "message");
                    jSONObject.put("filters", jSONObject2);
                    C2741a.m11630c().mo11785a(new C2751d("drop_frame_stack", jSONObject));
                    C3975a.m16583b("evil_method_end");
                }
            } catch (Exception unused) {
                C3975a.m16583b("evil_method_analyse_exception");
            }
        }

        RunnableC3979a(boolean z, String str, long[] jArr, long[] jArr2, long j, long j2, long j3, String str2, long j4, String str3, C20134g.C20143e eVar) {
            this.f12101i = z;
            this.f12100h = str;
            this.f12098f = j2;
            this.f12097e = j;
            this.f12096d = jArr;
            this.f12095c = jArr2;
            this.f12099g = j3;
            this.f12102j = str2;
            this.f12104l = j4;
            this.f12103k = str3;
            this.f12105m = eVar;
        }
    }

    public C3975a() {
        this(false);
    }

    /* renamed from: c */
    public void mo15650c() {
        if (!f12078l) {
            C2866e.m12067a(this);
            f12078l = true;
        }
    }

    /* renamed from: b */
    public synchronized void mo15648b() {
        if (!this.f12087o) {
            if (f12074b && f12073a) {
                C2848f.m12008a().mo12243a(this);
            }
            this.f12087o = true;
        }
    }

    /* renamed from: a */
    public static void m16581a(AbstractC3981b bVar) {
        f12076d = bVar;
    }

    /* renamed from: b */
    public void mo15649b(boolean z) {
        this.f12084j = z;
    }

    /* renamed from: a */
    public static void m16582a(boolean z) {
        f12074b = z;
    }

    public C3975a(boolean z) {
        this(false, false);
    }

    /* renamed from: a */
    public static void m16580a(long j) {
        if (j < 70) {
            j = 1000;
        }
        f12077k = j;
    }

    /* renamed from: b */
    public static void m16583b(final String str) {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.p230d.p232b.C3975a.RunnableC39783 */

            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("evil_method_section", str);
                    C2741a.m11630c().mo11785a(new C2750c("evil_method_tracing", 0, null, jSONObject, null, null));
                } catch (JSONException unused) {
                }
            }
        });
    }

    @Override // com.bytedance.apm.block.AbstractC2833a
    /* renamed from: a */
    public void mo12214a(String str) {
        super.mo12214a(str);
        C2854g.m12032a(1048574, AbstractC20122a.f49109b);
        if (AbstractC20122a.f49109b - this.f12085m > 300) {
            this.f12081g = this.f12080f;
            this.f12085m = AbstractC20122a.f49109b;
            this.f12080f = C2854g.m12030a("EvilMethodTracer#dispatchBegin", 0);
            if (this.f12079e && this.f12081g != null) {
                try {
                    final long[] a = C2854g.m12031a().mo12266a(this.f12081g);
                    final long j = AbstractC20122a.f49109b;
                    C20152k.m73538a().mo68300h().mo12901a(new Runnable() {
                        /* class com.bytedance.p230d.p232b.C3975a.RunnableC39772 */

                        public void run() {
                            LinkedList linkedList = new LinkedList();
                            C3971a.m16570a(a, linkedList, true, AbstractC20122a.f49109b);
                            C3971a.m16571b(linkedList, 5);
                            AbstractC20130d.AbstractC20131a c = C20152k.m73538a().mo68294c();
                            if (c != null && linkedList.size() > 2) {
                                c.mo68238a("method_tracer", "in," + j);
                                Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    c.mo68238a("method_tracer", ((C2861h) it.next()).toString());
                                }
                            }
                        }
                    });
                } catch (Throwable unused) {
                }
            }
        }
        this.f12082h = str;
    }

    public C3975a(boolean z, boolean z2) {
        this.f12083i = new long[3];
        this.f12084j = z;
        if (!z2) {
            mo15650c();
        }
        if (f12075c == null) {
            f12075c = this;
        }
    }

    @Override // com.bytedance.apm.block.AbstractC2865d
    /* renamed from: a */
    public void mo12311a(boolean z, long j) {
        m16580a(j);
        f12074b = z;
        if (!z) {
            C3359i.m13990a(new Runnable() {
                /* class com.bytedance.p230d.p232b.C3975a.RunnableC39761 */

                public void run() {
                    C2848f.m12008a().mo12249b(C3975a.this);
                }
            });
            C2854g.m12031a().mo12269c();
        }
    }

    @Override // com.bytedance.apm.block.AbstractC2833a
    /* renamed from: a */
    public void mo12213a(long j, long j2, long j3, long j4, boolean z) {
        String str;
        super.mo12213a(j, j2, j3, j4, z);
        C2854g.m12033b(1048574, AbstractC20122a.f49109b);
        RunnableC3979a aVar = this.f12086n;
        if (aVar != null) {
            aVar.f12094b = z;
            this.f12086n.f12093a = C2848f.m12008a().f9082b.mo12240b();
            C3047b.m12756a().mo12886a(this.f12086n);
            this.f12086n = null;
        }
        if (C2854g.m12031a().mo12270d()) {
            long j5 = j3 - j;
            if (j5 >= f12077k) {
                AbstractC3981b bVar = f12076d;
                if (bVar != null) {
                    bVar.mo12802a(j5, z);
                }
                m16583b("evil_method_begin");
                long[] a = C2854g.m12031a().mo12266a(this.f12080f);
                if (a == null || a.length == 0) {
                    m16583b("evil_method_data_null");
                    return;
                }
                long[] jArr = new long[3];
                System.arraycopy(this.f12083i, 0, jArr, 0, 3);
                String a2 = C2869g.m12075a();
                if (TextUtils.isEmpty(a2)) {
                    str = ActivityLifeObserver.getInstance().getTopActivityClassName();
                } else {
                    str = a2 + "," + ActivityLifeObserver.getInstance().getTopActivityClassName();
                }
                this.f12086n = new RunnableC3979a(ActivityLifeObserver.getInstance().isForeground(), str, a, jArr, j4 - j2, j5, j3, this.f12082h, System.currentTimeMillis(), "uuid", C20152k.m73538a().mo68305m());
            }
        }
    }
}
