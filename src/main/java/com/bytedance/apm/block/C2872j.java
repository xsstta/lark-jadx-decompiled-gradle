package com.bytedance.apm.block;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.C3013j;
import com.bytedance.apm.PerfConfig;
import com.bytedance.apm.block.p136a.C2848f;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p126b.C2751d;
import com.bytedance.apm.p139e.C2930g;
import com.bytedance.apm.p143i.C2984e;
import com.bytedance.apm.p150l.C3023c;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.p153n.C3056d;
import com.bytedance.apm.trace.p155a.C3069b;
import com.bytedance.apm6.p184h.p185a.C3331c;
import com.bytedance.common.util.JellyBeanV16Compat;
import com.bytedance.common.utility.Logger;
import com.bytedance.monitor.collector.AbstractC20122a;
import com.bytedance.monitor.collector.C20134g;
import com.bytedance.monitor.collector.C20149i;
import com.bytedance.monitor.collector.C20152k;
import com.bytedance.monitor.collector.C20159m;
import com.bytedance.monitor.collector.C20163o;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import java.util.LinkedList;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.block.j */
public class C2872j {

    /* renamed from: k */
    private static long f9176k = 1000;

    /* renamed from: l */
    private static boolean f9177l;

    /* renamed from: m */
    private static boolean f9178m;

    /* renamed from: t */
    private static volatile C2872j f9179t;

    /* renamed from: a */
    public volatile boolean f9180a;

    /* renamed from: b */
    public long f9181b = 2500;

    /* renamed from: c */
    public long f9182c = 5000;

    /* renamed from: d */
    public boolean f9183d = true;

    /* renamed from: e */
    public final String f9184e = C2872j.class.getName();

    /* renamed from: f */
    public final StringBuilder f9185f = new StringBuilder(1200);

    /* renamed from: g */
    public C2864c f9186g;

    /* renamed from: h */
    public volatile boolean f9187h = false;

    /* renamed from: i */
    public LinkedList<C2751d> f9188i = new LinkedList<>();

    /* renamed from: j */
    private C3056d f9189j;

    /* renamed from: n */
    private boolean f9190n;

    /* renamed from: o */
    private final StringBuilder f9191o = new StringBuilder(1200);

    /* renamed from: p */
    private C2864c f9192p = null;

    /* renamed from: q */
    private volatile boolean f9193q = false;

    /* renamed from: r */
    private boolean f9194r = true;

    /* renamed from: s */
    private boolean f9195s = true;

    /* renamed from: u */
    private final Runnable f9196u = new Runnable() {
        /* class com.bytedance.apm.block.C2872j.RunnableC28731 */

        public void run() {
            if (C2872j.this.f9186g != null) {
                try {
                    C2872j.this.f9186g.mo12310b();
                    StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                    if (!stackTrace[0].getClassName().startsWith(C2872j.this.f9184e)) {
                        C2872j.this.f9186g.f9155n = System.currentTimeMillis();
                        C2872j.this.f9186g.f9157p = stackTrace;
                        if (C2785b.m11769j()) {
                            m12109a(stackTrace);
                        }
                        C2872j.this.f9185f.setLength(0);
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            StringBuilder sb = C2872j.this.f9185f;
                            sb.append("\tat " + stackTraceElement.getClassName());
                            sb.append(".");
                            sb.append(stackTraceElement.getMethodName());
                            sb.append("(");
                            sb.append(stackTraceElement.getFileName());
                            sb.append(":");
                            sb.append(stackTraceElement.getLineNumber());
                            sb.append(")\n");
                        }
                        C2872j.this.f9186g.f9159r = C2872j.this.f9185f.toString();
                    }
                } catch (Throwable th) {
                    C3013j.m12658a().mo12827a(th, "block_deal_exception");
                }
            }
        }

        /* renamed from: a */
        private void m12109a(StackTraceElement[] stackTraceElementArr) {
            if (stackTraceElementArr != null) {
                TimeoutException timeoutException = new TimeoutException("main thread task execute more than " + C2872j.this.f9181b + "ms");
                timeoutException.setStackTrace(stackTraceElementArr);
                Logger.m15171e("StackThread", "block detected", timeoutException);
            }
        }
    };

    /* renamed from: v */
    private final Runnable f9197v = new Runnable() {
        /* class com.bytedance.apm.block.C2872j.RunnableC28742 */

        public void run() {
            try {
                if (C2872j.this.f9186g != null) {
                    StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                    if (!stackTrace[0].getClassName().startsWith(C2872j.this.f9184e)) {
                        C2872j.this.f9186g.f9156o = System.currentTimeMillis();
                        C2872j.this.f9186g.f9158q = stackTrace;
                        C2872j.this.f9186g.f9163v = C2984e.m12539a().mo12726b();
                        C2872j.this.f9186g.f9164w = C2872j.this.mo12323c();
                        C2872j.this.f9186g.f9151j = true;
                    }
                }
            } catch (Throwable th) {
                C3013j.m12658a().mo12827a(th, "serious_block_deal_exception");
            }
        }
    };

    /* renamed from: a */
    public void mo12317a(String str) {
        try {
            if (this.f9189j.mo12904b()) {
                if (f9178m && this.f9190n) {
                    this.f9186g.f9149h = AbstractC20122a.f49109b;
                    if (this.f9186g.f9149h - this.f9186g.f9148g > this.f9181b) {
                        this.f9186g.f9152k = true;
                        this.f9186g.f9145d = false;
                        this.f9186g.f9144c = this.f9187h;
                        m12085a(this.f9186g.mo12308a());
                    }
                }
                if (this.f9192p != null && C2848f.m12008a().f9082b.mo12240b()) {
                    this.f9192p.f9146e = true;
                }
                C2864c cVar = this.f9186g;
                if (cVar == null) {
                    this.f9186g = new C2864c(AbstractC20122a.f49109b, str);
                } else {
                    cVar.mo12309a(AbstractC20122a.f49109b, str);
                }
                if (this.f9183d && this.f9194r) {
                    this.f9189j.mo12902a(this.f9196u, this.f9181b);
                    if (this.f9180a && this.f9195s) {
                        this.f9189j.mo12902a(this.f9197v, this.f9182c);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo12319a(boolean z, C2864c cVar, String str) throws JSONException {
        if (this.f9194r) {
            JSONObject c = m12092c(cVar);
            c.put("stack", cVar.f9159r);
            c.put("message", str);
            c.put("ignore_stack", this.f9186g.f9154m);
            c.put("event_type", "lag");
            c.put("filters", m12090b(z, cVar, str));
            C2751d dVar = new C2751d("block_monitor", c, cVar.f9148g);
            m12084a(dVar);
            C2741a.m11630c().mo11785a(dVar);
        }
    }

    /* renamed from: a */
    public void mo12316a(C2864c cVar, String str, boolean z) throws JSONException {
        if (this.f9195s) {
            JSONObject b = m12090b(cVar.f9145d, cVar, str);
            b.put("sbuuid", "empty");
            JSONObject c = m12092c(cVar);
            c.put("message", str);
            if (!(cVar.f9157p == null || cVar.f9158q == null)) {
                int length = cVar.f9157p.length;
                int length2 = cVar.f9158q.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i >= Math.min(length, length2)) {
                        break;
                    }
                    int i3 = (length - i) - 1;
                    int i4 = (length2 - i) - 1;
                    if (cVar.f9157p[i3].equals(cVar.f9158q[i4])) {
                        i2++;
                        i++;
                    } else if (m12088a(cVar.f9157p[i3], cVar.f9158q[i4])) {
                        i2++;
                    }
                }
                if (i2 == 0) {
                    b.put("serious_stack_coincide", "none");
                } else if (i2 == length && i2 == length2) {
                    b.put("serious_stack_coincide", "full");
                } else {
                    b.put("serious_stack_coincide", "part");
                    this.f9191o.setLength(0);
                    for (int i5 = 0; i5 <= length - i2; i5++) {
                        StringBuilder sb = this.f9191o;
                        sb.append("\tat ");
                        sb.append(cVar.f9157p[i5].getClassName());
                        sb.append(".");
                        sb.append(cVar.f9157p[i5].getMethodName());
                        sb.append("(");
                        sb.append(cVar.f9157p[i5].getFileName());
                        sb.append(":");
                        sb.append(cVar.f9157p[i5].getLineNumber());
                        sb.append(")\n");
                    }
                    c.put("stack1", this.f9191o.toString());
                    this.f9191o.setLength(0);
                    for (int i6 = 0; i6 <= length2 - i2; i6++) {
                        StringBuilder sb2 = this.f9191o;
                        sb2.append("\tat ");
                        sb2.append(cVar.f9158q[i6].getClassName());
                        sb2.append(".");
                        sb2.append(cVar.f9158q[i6].getMethodName());
                        sb2.append("(");
                        sb2.append(cVar.f9158q[i6].getFileName());
                        sb2.append(":");
                        sb2.append(cVar.f9158q[i6].getLineNumber());
                        sb2.append(")\n");
                    }
                    c.put("stack2", this.f9191o.toString());
                }
                this.f9191o.setLength(0);
                while (i2 > 0) {
                    StringBuilder sb3 = this.f9191o;
                    sb3.append("\tat ");
                    int i7 = length - i2;
                    sb3.append(cVar.f9157p[i7].getClassName());
                    sb3.append(".");
                    sb3.append(cVar.f9157p[i7].getMethodName());
                    sb3.append("(");
                    sb3.append(cVar.f9157p[i7].getFileName());
                    sb3.append(":");
                    sb3.append(cVar.f9157p[i7].getLineNumber());
                    sb3.append(")\n");
                    i2--;
                }
                c.put("stack", this.f9191o.length() == 0 ? cVar.f9159r : this.f9191o.toString());
                b.put("sbuuid", cVar.f9160s);
            }
            c.put("stack_cost", cVar.f9156o - cVar.f9155n);
            c.put("filters", b);
            c.put("event_type", "serious_lag");
            c.put("block_looper_info", cVar.f9162u);
            c.put("block_cpu_info", cVar.f9163v);
            c.put("block_memory_info", cVar.f9164w);
            c.put("custom", cVar.f9165x);
            c.put("block_error_info", z);
            C2751d dVar = new C2751d("serious_block_monitor", c, cVar.f9148g);
            m12084a(dVar);
            C2741a.m11630c().mo11785a(dVar);
        }
    }

    /* renamed from: a */
    public void mo12315a(C2864c cVar, String str) throws JSONException {
        if (PerfConfig.m11610a()) {
            JSONObject c = m12092c(cVar);
            JSONObject a = C3331c.m13887a().mo13563a(true);
            a.put("crash_section", C2785b.m11754c(cVar.f9150i));
            a.put("belong_frame", String.valueOf(cVar.f9145d));
            a.put("belong_dump", String.valueOf(cVar.f9144c));
            a.put("block_stack_type", "messageKey");
            c.put("filters", a);
            c.put("event_type", "lag");
            c.put("stack", "at " + str + ".*(a.java:-1)");
            C2751d dVar = new C2751d("block_monitor", c);
            dVar.mo11815e();
            C2741a.m11630c().mo11785a(dVar);
        }
    }

    /* renamed from: d */
    private void m12093d() {
        long j = this.f9182c;
        long j2 = this.f9181b;
        if (j < j2) {
            this.f9182c = j2 + 50;
        }
    }

    /* renamed from: a */
    static C2872j m12082a() {
        if (f9179t == null) {
            synchronized (C2872j.class) {
                if (f9179t == null) {
                    f9179t = new C2872j();
                }
            }
        }
        return f9179t;
    }

    /* renamed from: b */
    public void mo12320b() {
        this.f9189j = C2848f.m12008a().mo12250c();
    }

    private C2872j() {
    }

    /* renamed from: c */
    public JSONObject mo12323c() {
        try {
            JSONObject jSONObject = new JSONObject();
            Context a = C2785b.m11735a();
            if (a != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) a.getSystemService("activity")).getMemoryInfo(memoryInfo);
                jSONObject.put("availMem", memoryInfo.availMem);
                jSONObject.put("lowMemory", memoryInfo.lowMemory);
                jSONObject.put("threshold", memoryInfo.threshold);
                jSONObject.put("totalMem", JellyBeanV16Compat.getTotalMem(memoryInfo));
            }
            Runtime runtime = Runtime.getRuntime();
            jSONObject.put("max_memory", runtime.maxMemory());
            jSONObject.put("free_memory", runtime.freeMemory());
            jSONObject.put("total_memory", runtime.totalMemory());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo12318a(boolean z) {
        this.f9193q = z;
    }

    /* renamed from: c */
    public void mo12325c(boolean z) {
        this.f9194r = z;
    }

    /* renamed from: d */
    public void mo12326d(boolean z) {
        this.f9195s = z;
    }

    /* renamed from: e */
    public void mo12327e(boolean z) {
        this.f9183d = z;
    }

    /* renamed from: f */
    public void mo12328f(boolean z) {
        this.f9180a = z;
    }

    /* renamed from: a */
    public static void m12083a(long j) {
        if (j < 70) {
            j = 1000;
        }
        f9176k = j;
    }

    /* renamed from: b */
    private void m12091b(final C2864c cVar) {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.block.C2872j.RunnableC28753 */

            public void run() {
                if (cVar.f9149h - cVar.f9148g > C2872j.this.f9182c && C3023c.m12697e("serious_block_monitor")) {
                    C2872j.this.f9186g.f9165x = C20152k.m73538a().mo68285a(cVar.f9148g, cVar.f9149h);
                }
                boolean z = false;
                if (cVar.f9153l || cVar.f9159r == null || cVar.f9154m) {
                    cVar.f9159r = "Invalid Stack\n";
                }
                if (cVar.f9149h - cVar.f9148g > C2872j.this.f9182c && !cVar.f9151j && C2872j.this.f9183d) {
                    cVar.f9164w = C2872j.this.mo12323c();
                    cVar.f9163v = C2984e.m12539a().mo12726b();
                    cVar.f9151j = true;
                    z = true;
                }
                try {
                    String a = C20163o.m73581a(cVar.f9143b);
                    C2872j.this.mo12319a(cVar.f9145d, cVar, a);
                    if (cVar.f9151j && C2872j.this.f9180a && C2872j.this.f9183d) {
                        C2872j.this.mo12316a(cVar, a, z);
                    }
                    C2872j.this.mo12315a(cVar, a);
                } catch (Exception unused) {
                }
            }
        });
    }

    /* renamed from: c */
    public void mo12324c(long j) {
        if (j < this.f9181b) {
            j = 5000;
        }
        this.f9182c = j;
        m12093d();
    }

    /* renamed from: c */
    private JSONObject m12092c(C2864c cVar) {
        long j = cVar.f9149h - cVar.f9148g;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", cVar.f9150i);
            jSONObject.put("crash_time", cVar.f9150i);
            jSONObject.put("is_main_process", C2785b.m11761e());
            jSONObject.put("process_name", C2785b.m11756d());
            jSONObject.put("block_duration", j);
            jSONObject.put("last_scene", cVar.f9161t);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: d */
    private void m12094d(C2864c cVar) {
        String e = C3069b.m12810e();
        if (TextUtils.isEmpty(e)) {
            cVar.f9161t = ActivityLifeObserver.getInstance().getTopActivityClassName();
            return;
        }
        cVar.f9161t = e + "," + ActivityLifeObserver.getInstance().getTopActivityClassName();
    }

    /* renamed from: b */
    public void mo12321b(long j) {
        if (j < 70) {
            j = 2500;
        }
        this.f9181b = j;
        m12093d();
    }

    /* renamed from: a */
    private void m12084a(C2751d dVar) {
        while (this.f9188i.size() != 0) {
            if (dVar.mo11816f() - this.f9188i.getFirst().mo11816f() >= 0 && dVar.mo11816f() - this.f9188i.getFirst().mo11816f() <= 60000) {
                if (((long) this.f9188i.size()) <= 60) {
                    break;
                }
                this.f9188i.removeFirst();
            } else {
                this.f9188i.removeFirst();
            }
        }
        this.f9188i.addLast(dVar);
    }

    /* renamed from: a */
    private void m12085a(C2864c cVar) {
        boolean z;
        StackTraceElement[] stackTraceElementArr;
        if (cVar != null) {
            if (!cVar.f9142a) {
                cVar.mo12310b();
            }
            if (cVar.f9149h - cVar.f9148g >= this.f9182c) {
                z = true;
            } else {
                z = false;
            }
            cVar.f9151j = z;
            C20134g.C20143e m = C20152k.m73538a().mo68305m();
            if (m != null) {
                StackTraceElement[] a = m12089a(cVar.f9157p);
                if (cVar.f9151j) {
                    stackTraceElementArr = m12089a(cVar.f9158q);
                } else {
                    stackTraceElementArr = null;
                }
                m.mo68260a("uuid", a, stackTraceElementArr, null);
            }
            if (cVar.f9152k) {
                m12091b(cVar);
            } else {
                this.f9192p = cVar;
            }
        }
    }

    /* renamed from: b */
    public void mo12322b(boolean z) {
        Message a;
        try {
            if (this.f9189j.mo12904b()) {
                C2864c cVar = this.f9192p;
                if (cVar != null) {
                    if (z) {
                        cVar.f9147f = true;
                    }
                    m12091b(this.f9192p);
                    this.f9192p = null;
                }
                C2864c cVar2 = this.f9186g;
                if (cVar2 != null && cVar2.f9148g >= 0) {
                    if (this.f9186g.f9149h == -1) {
                        this.f9186g.f9149h = AbstractC20122a.f49109b;
                        if (this.f9183d) {
                            this.f9189j.mo12903b(this.f9196u);
                            this.f9189j.mo12903b(this.f9197v);
                        }
                        if (this.f9186g.f9149h - this.f9186g.f9148g > this.f9181b) {
                            m12094d(this.f9186g);
                            this.f9186g.f9150i = System.currentTimeMillis();
                            if (!this.f9183d) {
                                this.f9186g.f9154m = true;
                            }
                            this.f9186g.f9145d = z;
                            this.f9186g.f9144c = this.f9187h;
                            m12085a(this.f9186g.mo12308a());
                            if (this.f9186g.f9149h - this.f9186g.f9148g > this.f9182c && z && this.f9193q) {
                                C2870h.m12078a();
                            }
                        }
                        if (f9177l && this.f9186g.f9149h - this.f9186g.f9148g > f9176k) {
                            if (TextUtils.isEmpty(this.f9186g.f9161t)) {
                                m12094d(this.f9186g);
                            }
                            if (this.f9186g.f9150i == 0) {
                                this.f9186g.f9150i = System.currentTimeMillis();
                            }
                            m12086a(z, this.f9186g.mo12308a());
                        }
                        if (f9178m && (a = C20149i.m73521a(C20149i.m73522a())) != null) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            if (a.getTarget() != null && a.getWhen() < uptimeMillis) {
                                this.f9190n = true;
                                this.f9186g.mo12309a(uptimeMillis, null);
                                this.f9189j.mo12902a(this.f9196u, this.f9181b);
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private StackTraceElement[] m12089a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null) {
            return stackTraceElementArr;
        }
        return new StackTraceElement[]{new StackTraceElement("Invalid Stack\n", AbstractC60044a.f149675a, "a.java", 1)};
    }

    /* renamed from: a */
    private void m12086a(final boolean z, final C2864c cVar) {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.block.C2872j.RunnableC28764 */

            public void run() {
                JSONObject jSONObject = new JSONObject();
                String b = C20152k.m73538a().mo68292b(cVar.f9148g, cVar.f9149h);
                StringBuilder sb = new StringBuilder();
                long j = cVar.f9149h - cVar.f9148g;
                if (!TextUtils.isEmpty(b)) {
                    String a = C20159m.m73572a(b, sb, 1000, j);
                    if (C2785b.m11769j()) {
                        C2930g.m12387b("StackThread", "%s", b);
                    }
                    try {
                        jSONObject.put("stack", sb.toString());
                        jSONObject.put("stack_key", a);
                        jSONObject.put("scene", cVar.f9161t);
                        jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, j);
                        jSONObject.put("method_time", j);
                        jSONObject.put("monitor_type", "sampling");
                        jSONObject.put("message", C20163o.m73581a(cVar.f9143b));
                        jSONObject.put("event_type", "lag_drop_frame");
                        JSONObject a2 = C3331c.m13887a().mo13563a(true);
                        a2.put("crash_section", C2785b.m11754c(C2872j.this.f9186g.f9150i));
                        a2.put("belong_frame", String.valueOf(z));
                        a2.put("monitor_type", "sample");
                        jSONObject.put("filters", a2);
                        C2741a.m11630c().mo11785a(new C2751d("drop_frame_stack", jSONObject));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    static boolean m12087a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static boolean m12088a(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        if (stackTraceElement == stackTraceElement2) {
            return true;
        }
        if (stackTraceElement == null || stackTraceElement2 == null || !stackTraceElement.getClassName().equals(stackTraceElement2.getClassName()) || !m12087a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) || !m12087a(stackTraceElement.getFileName(), stackTraceElement2.getFileName())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private JSONObject m12090b(boolean z, C2864c cVar, String str) throws JSONException {
        JSONObject a = C3331c.m13887a().mo13563a(true);
        a.put("crash_section", C2785b.m11754c(cVar.f9150i));
        a.put("belong_frame", String.valueOf(z));
        a.put("belong_dump", String.valueOf(cVar.f9144c));
        a.put("block_input", String.valueOf(cVar.f9146e));
        a.put("block_frame", String.valueOf(cVar.f9147f));
        a.put("block_message", str);
        a.put("block_stack_type", "stack");
        a.put("buuid", cVar.f9160s);
        a.put("belong_poll_once", String.valueOf(cVar.f9152k));
        return a;
    }
}
