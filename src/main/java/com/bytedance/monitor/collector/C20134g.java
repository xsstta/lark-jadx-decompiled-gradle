package com.bytedance.monitor.collector;

import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.apm.p139e.C2921a;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.p153n.C3056d;
import com.bytedance.monitor.collector.AbstractC20130d;
import com.bytedance.monitor.collector.p852a.C20125c;
import com.bytedance.monitor.collector.p852a.C20126d;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.monitor.collector.g */
public class C20134g extends AbsMonitor {

    /* renamed from: F */
    private static int[] f49135F = {600, LocationRequest.PRIORITY_INDOOR};

    /* renamed from: G */
    private static int[] f49136G = {LocationRequest.PRIORITY_HD_ACCURACY, 100};

    /* renamed from: f */
    public static int f49137f;

    /* renamed from: g */
    public static int f49138g;

    /* renamed from: o */
    public static volatile AbstractC20133f f49139o;

    /* renamed from: s */
    public static int f49140s;

    /* renamed from: t */
    public static boolean f49141t;

    /* renamed from: u */
    public static boolean f49142u;

    /* renamed from: v */
    public static boolean f49143v;

    /* renamed from: A */
    private long f49144A = -1;

    /* renamed from: B */
    private int f49145B = -1;

    /* renamed from: C */
    private long f49146C = -1;

    /* renamed from: D */
    private AbstractC20122a f49147D;

    /* renamed from: E */
    private volatile boolean f49148E;

    /* renamed from: h */
    AbstractC20141c f49149h;

    /* renamed from: i */
    public int f49150i;

    /* renamed from: j */
    public volatile int f49151j;

    /* renamed from: k */
    public C20144f f49152k;

    /* renamed from: l */
    public C20140b f49153l;

    /* renamed from: m */
    public String f49154m;

    /* renamed from: n */
    public String f49155n;

    /* renamed from: p */
    public boolean f49156p;

    /* renamed from: q */
    public final C3056d f49157q;

    /* renamed from: r */
    public volatile boolean f49158r;

    /* renamed from: w */
    public Runnable f49159w = new Runnable() {
        /* class com.bytedance.monitor.collector.C20134g.RunnableC201362 */

        /* renamed from: b */
        private long f49165b;

        /* renamed from: c */
        private long f49166c;

        /* renamed from: d */
        private int f49167d = -1;

        /* renamed from: e */
        private int f49168e;

        /* renamed from: f */
        private int f49169f;

        public void run() {
            long uptimeMillis = SystemClock.uptimeMillis();
            C20139a a = C20134g.this.f49153l.mo68256a();
            if (this.f49167d == C20134g.this.f49151j) {
                this.f49168e++;
            } else {
                this.f49168e = 0;
                this.f49169f = 0;
                this.f49166c = uptimeMillis;
            }
            this.f49167d = C20134g.this.f49151j;
            int i = this.f49168e;
            if (i > 0 && i - this.f49169f >= C20134g.f49140s && this.f49165b != 0 && uptimeMillis - this.f49166c >= ((long) C20134g.f49138g) && C20134g.this.f49158r) {
                if (C20134g.f49139o != null) {
                    a.f49181f = C20134g.this.mo68245d().mo68243a(Looper.getMainLooper().getThread());
                } else {
                    a.f49181f = C20163o.m73582a(Looper.getMainLooper().getThread().getStackTrace());
                }
                this.f49169f = this.f49168e;
            }
            a.f49179d = C20134g.this.f49158r;
            a.f49178c = (uptimeMillis - this.f49165b) - ((long) C20134g.f49137f);
            a.f49176a = uptimeMillis;
            long uptimeMillis2 = SystemClock.uptimeMillis();
            this.f49165b = uptimeMillis2;
            a.f49177b = uptimeMillis2 - uptimeMillis;
            a.f49180e = C20134g.this.f49151j;
            C20134g.this.f49157q.mo12902a(C20134g.this.f49159w, (long) C20134g.f49137f);
            C20134g.this.f49153l.mo68257a(a);
        }
    };

    /* renamed from: x */
    private int f49160x = 100;

    /* renamed from: y */
    private int f49161y = LocationRequest.PRIORITY_HD_ACCURACY;

    /* renamed from: z */
    private long f49162z = -1;

    /* renamed from: com.bytedance.monitor.collector.g$c */
    public interface AbstractC20141c {
        /* renamed from: a */
        void mo68251a(long[] jArr);
    }

    /* renamed from: com.bytedance.monitor.collector.g$d */
    public static class C20142d {

        /* renamed from: a */
        long f49186a;

        /* renamed from: b */
        long f49187b;

        /* renamed from: c */
        long f49188c;

        /* renamed from: d */
        long f49189d;

        /* renamed from: e */
        long f49190e;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.monitor.collector.AbsMonitor
    /* renamed from: b */
    public void mo68214b(int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.monitor.collector.g$a */
    public static class C20139a {

        /* renamed from: a */
        long f49176a;

        /* renamed from: b */
        long f49177b;

        /* renamed from: c */
        long f49178c;

        /* renamed from: d */
        boolean f49179d;

        /* renamed from: e */
        int f49180e;

        /* renamed from: f */
        String f49181f;

        private C20139a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo68255b() {
            this.f49176a = -1;
            this.f49177b = -1;
            this.f49178c = -1;
            this.f49180e = -1;
            this.f49181f = null;
        }

        /* renamed from: a */
        public JSONObject mo68254a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("startTime", this.f49176a);
                jSONObject.put("cost", this.f49177b);
                jSONObject.put("delay", this.f49178c);
                jSONObject.put("isMessage", String.valueOf(this.f49179d));
                jSONObject.put("seqNum", this.f49180e);
                jSONObject.put("stack", this.f49181f);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }
    }

    /* renamed from: d */
    public AbstractC20133f mo68245d() {
        return f49139o;
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.monitor.collector.AbsMonitor
    /* renamed from: a */
    public void mo68211a() {
        super.mo68211a();
        mo68246e();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.monitor.collector.g$b */
    public static class C20140b {

        /* renamed from: a */
        final int f49182a;

        /* renamed from: b */
        C20139a f49183b;

        /* renamed from: c */
        final List<C20139a> f49184c;

        /* renamed from: d */
        private int f49185d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C20139a mo68256a() {
            C20139a aVar = this.f49183b;
            if (aVar == null) {
                return new C20139a();
            }
            this.f49183b = null;
            return aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public JSONArray mo68258b() {
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            if (this.f49184c.size() == this.f49182a) {
                for (int i2 = this.f49185d - 1; i2 < this.f49184c.size(); i2++) {
                    jSONArray.put(this.f49184c.get(i2).mo68254a());
                }
                while (i < this.f49185d - 1) {
                    jSONArray.put(this.f49184c.get(i).mo68254a());
                    i++;
                }
            } else {
                while (i < this.f49184c.size()) {
                    jSONArray.put(this.f49184c.get(i).mo68254a());
                    i++;
                }
            }
            return jSONArray;
        }

        public C20140b(int i) {
            this.f49182a = i;
            this.f49184c = new ArrayList(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo68257a(C20139a aVar) {
            int size = this.f49184c.size();
            int i = this.f49182a;
            if (size < i) {
                this.f49184c.add(aVar);
                this.f49185d = this.f49184c.size();
                return;
            }
            int i2 = this.f49185d % i;
            this.f49185d = i2;
            C20139a aVar2 = this.f49184c.set(i2, aVar);
            aVar2.mo68255b();
            this.f49183b = aVar2;
            this.f49185d++;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.monitor.collector.AbsMonitor
    /* renamed from: c */
    public Pair<String, ?> mo68215c() {
        return new Pair<>(this.f49088a, mo68248g());
    }

    /* renamed from: h */
    public JSONArray mo68249h() {
        C20140b bVar = this.f49153l;
        if (bVar != null) {
            return bVar.mo68258b();
        }
        return null;
    }

    /* renamed from: com.bytedance.monitor.collector.g$e */
    public static class C20143e {

        /* renamed from: a */
        public long f49191a;

        /* renamed from: b */
        long f49192b;

        /* renamed from: c */
        long f49193c;

        /* renamed from: d */
        int f49194d;

        /* renamed from: e */
        int f49195e;

        /* renamed from: f */
        long f49196f;

        /* renamed from: g */
        long f49197g;

        /* renamed from: h */
        C20125c f49198h;

        /* renamed from: i */
        String f49199i;

        /* renamed from: j */
        public String f49200j;

        /* renamed from: k */
        StackTraceElement[] f49201k;

        /* renamed from: l */
        StackTraceElement[] f49202l;

        /* renamed from: m */
        String f49203m;

        /* renamed from: n */
        String f49204n;

        /* renamed from: o */
        C20142d f49205o;

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo68263d() {
            this.f49194d = -1;
            this.f49195e = -1;
            this.f49196f = -1;
            this.f49199i = null;
            this.f49201k = null;
            this.f49202l = null;
            this.f49203m = null;
            this.f49204n = null;
            this.f49205o = null;
            this.f49198h = null;
            this.f49200j = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo68262c() {
            int i;
            if (this.f49192b - this.f49193c > 17 || this.f49196f > 400 || (i = this.f49195e) > 300 || i < 20 || this.f49194d == 1 || this.f49197g < 20) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public JSONObject mo68259a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("msg", C20163o.m73581a(this.f49199i));
                jSONObject.put("cpuDuration", this.f49197g);
                jSONObject.put("duration", this.f49196f);
                jSONObject.put(ShareHitPoint.f121869d, this.f49194d);
                jSONObject.put("messageCount", this.f49195e);
                jSONObject.put("lastDuration", this.f49192b - this.f49193c);
                jSONObject.put("start", this.f49191a);
                jSONObject.put("end", this.f49192b);
                m73502a(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        /* renamed from: b */
        public String mo68261b() {
            return "msg:" + C20163o.m73581a(this.f49199i) + ",cpuDuration:" + this.f49197g + ",duration:" + this.f49196f + ",type:" + this.f49194d + ",messageCount:" + this.f49195e + ",lastDuration:" + (this.f49192b - this.f49193c) + ",start:" + this.f49191a + ",end:" + this.f49192b;
        }

        /* renamed from: a */
        private void m73502a(JSONObject jSONObject) throws JSONException {
            boolean z;
            StackTraceElement[] stackTraceElementArr = this.f49201k;
            if (stackTraceElementArr != null) {
                jSONObject.put("block_stack", C20163o.m73582a(stackTraceElementArr));
            }
            jSONObject.put("block_uuid", this.f49204n);
            StackTraceElement[] stackTraceElementArr2 = this.f49202l;
            if (stackTraceElementArr2 != null) {
                jSONObject.put("sblock_stack", C20163o.m73582a(stackTraceElementArr2));
            }
            jSONObject.put("sblock_uuid", this.f49204n);
            if (TextUtils.isEmpty(this.f49203m)) {
                jSONObject.put("evil_msg", this.f49203m);
            }
            if (this.f49205o != null) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("belong_frame", z);
            C20142d dVar = this.f49205o;
            if (dVar != null) {
                jSONObject.put("vsyncDelayTime", this.f49193c - (dVar.f49186a / 1000000));
                jSONObject.put("doFrameTime", (this.f49205o.f49187b / 1000000) - this.f49193c);
                jSONObject.put("inputHandlingTime", (this.f49205o.f49188c / 1000000) - (this.f49205o.f49187b / 1000000));
                jSONObject.put("animationsTime", (this.f49205o.f49189d / 1000000) - (this.f49205o.f49188c / 1000000));
                jSONObject.put("performTraversalsTime", (this.f49205o.f49190e / 1000000) - (this.f49205o.f49189d / 1000000));
                jSONObject.put("drawTime", this.f49192b - (this.f49205o.f49190e / 1000000));
            }
            C20125c cVar = this.f49198h;
            if (cVar != null) {
                jSONObject.put("service_name", cVar.f49119a);
                jSONObject.put("service_what", this.f49198h.f49120b);
                jSONObject.put("service_time", this.f49198h.f49121c);
                jSONObject.put("service_thread", this.f49198h.f49123e);
                jSONObject.put("service_token", this.f49198h.f49122d);
            }
        }

        /* renamed from: a */
        public void mo68260a(String str, StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2, String str2) {
            if (!TextUtils.isEmpty(str)) {
                this.f49204n = str;
            }
            if (stackTraceElementArr != null) {
                this.f49201k = stackTraceElementArr;
            }
            if (stackTraceElementArr2 != null) {
                this.f49202l = stackTraceElementArr2;
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f49203m = str2;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.monitor.collector.g$f */
    public static class C20144f {

        /* renamed from: a */
        int f49206a;

        /* renamed from: b */
        int f49207b;

        /* renamed from: c */
        C20143e f49208c;

        /* renamed from: d */
        List<C20143e> f49209d = new ArrayList();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C20143e mo68264a() {
            int i = this.f49207b;
            if (i <= 0) {
                return null;
            }
            return this.f49209d.get(i - 1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public List<C20143e> mo68267b() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            if (this.f49209d.size() == this.f49206a) {
                for (int i2 = this.f49207b - 1; i2 < this.f49209d.size(); i2++) {
                    arrayList.add(this.f49209d.get(i2));
                }
                while (i < this.f49207b - 1) {
                    arrayList.add(this.f49209d.get(i));
                    i++;
                }
            } else {
                while (i < this.f49209d.size()) {
                    arrayList.add(this.f49209d.get(i));
                    i++;
                }
            }
            return arrayList;
        }

        C20144f(int i) {
            this.f49206a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C20143e mo68265a(int i) {
            C20143e eVar = this.f49208c;
            if (eVar != null) {
                eVar.f49194d = i;
                C20143e eVar2 = this.f49208c;
                this.f49208c = null;
                return eVar2;
            }
            C20143e eVar3 = new C20143e();
            eVar3.f49194d = i;
            return eVar3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo68266a(C20143e eVar) {
            int size = this.f49209d.size();
            int i = this.f49206a;
            if (size < i) {
                this.f49209d.add(eVar);
                this.f49207b = this.f49209d.size();
            } else {
                int i2 = this.f49207b % i;
                this.f49207b = i2;
                C20143e eVar2 = this.f49209d.set(i2, eVar);
                eVar2.mo68263d();
                this.f49208c = eVar2;
                this.f49207b++;
            }
            if (C2921a.m12357a() && eVar.mo68262c()) {
                final String b = eVar.mo68261b();
                C3047b.m12756a().mo12886a(new Runnable() {
                    /* class com.bytedance.monitor.collector.C20134g.C20144f.RunnableC201451 */

                    public void run() {
                        C2921a.m12361d("block_looper_info", b);
                    }
                });
            }
        }
    }

    /* renamed from: k */
    private void m73480k() {
        int i = this.f49090c;
        if (i == 0 || i == 1) {
            this.f49160x = 100;
            this.f49161y = LocationRequest.PRIORITY_INDOOR;
        } else if (i == 2 || i == 3) {
            this.f49160x = LocationRequest.PRIORITY_INDOOR;
            this.f49161y = LocationRequest.PRIORITY_HD_ACCURACY;
        }
    }

    /* renamed from: f */
    public C20143e mo68247f() {
        C20144f fVar = this.f49152k;
        if (fVar != null && this.f49156p && fVar.mo68264a().f49194d == 8) {
            return this.f49152k.mo68264a();
        }
        return null;
    }

    /* renamed from: e */
    public void mo68246e() {
        if (!this.f49148E) {
            this.f49148E = true;
            m73480k();
            this.f49152k = new C20144f(this.f49160x);
            C201373 r0 = new AbstractC20122a() {
                /* class com.bytedance.monitor.collector.C20134g.C201373 */

                @Override // com.bytedance.monitor.collector.AbstractC20122a
                /* renamed from: a */
                public boolean mo12256a() {
                    return true;
                }

                @Override // com.bytedance.monitor.collector.AbstractC20122a
                /* renamed from: a */
                public void mo12255a(String str) {
                    C20134g.this.f49158r = true;
                    C20134g.this.f49155n = str;
                    super.mo12255a(str);
                    C20134g.this.mo68244a(true, AbstractC20122a.f49109b);
                }

                @Override // com.bytedance.monitor.collector.AbstractC20122a
                /* renamed from: b */
                public void mo12257b(String str) {
                    super.mo12257b(str);
                    C20134g.this.f49150i++;
                    C20134g.this.mo68244a(false, AbstractC20122a.f49109b);
                    C20134g gVar = C20134g.this;
                    gVar.f49154m = gVar.f49155n;
                    C20134g.this.f49155n = "no message running";
                    C20134g.this.f49158r = false;
                }
            };
            this.f49147D = r0;
            C20146h.m73517b(r0);
            C20149i.m73521a(C20149i.m73522a());
        }
    }

    /* renamed from: g */
    public JSONObject mo68248g() {
        long uptimeMillis = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        JSONArray i = mo68250i();
        JSONObject a = m73475a(uptimeMillis);
        JSONArray a2 = m73474a(100, uptimeMillis);
        try {
            jSONObject.put("history_message", i);
            jSONObject.put("current_message", a);
            jSONObject.put("pending_messages", a2);
            jSONObject.put("check_time_info", mo68249h());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: i */
    public JSONArray mo68250i() {
        JSONArray jSONArray = new JSONArray();
        try {
            List<C20143e> b = this.f49152k.mo68267b();
            if (b == null) {
                return jSONArray;
            }
            int i = 0;
            for (C20143e eVar : b) {
                if (eVar != null) {
                    i++;
                    jSONArray.put(eVar.mo68259a().put("id", i));
                }
            }
            return jSONArray;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: j */
    private void m73479j() {
        boolean z = f49143v;
        if (!z && f49142u) {
            int i = f49136G[1];
            f49137f = i;
            int i2 = f49135F[0];
            f49138g = i2;
            f49140s = i2 / i;
        } else if (!z && !f49142u) {
            int i3 = f49136G[0];
            f49137f = i3;
            int i4 = f49135F[0];
            f49138g = i4;
            f49140s = i4 / i3;
        } else if (z && f49142u) {
            int i5 = f49136G[1];
            f49137f = i5;
            int i6 = f49135F[1];
            f49138g = i6;
            f49140s = i6 / i5;
        } else if (z && !f49142u) {
            int i7 = f49136G[0];
            f49137f = i7;
            int i8 = f49135F[1];
            f49138g = i8;
            f49140s = i8 / i7;
        }
    }

    /* renamed from: a */
    private JSONObject m73475a(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", this.f49155n);
            jSONObject.put("currentMessageCost", j - this.f49144A);
            jSONObject.put("currentMessageCpu", C20157l.m73563c(this.f49145B) - this.f49146C);
            jSONObject.put("messageCount", this.f49150i);
            jSONObject.put("start", this.f49144A);
            jSONObject.put("end", j);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.monitor.collector.AbsMonitor
    /* renamed from: a */
    public Pair<String, ?> mo68210a(long j, long j2) {
        try {
            return new Pair<>(this.f49088a, mo68248g());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private JSONArray m73474a(int i, long j) {
        MessageQueue a = C20149i.m73522a();
        JSONArray jSONArray = new JSONArray();
        if (a == null) {
            return jSONArray;
        }
        try {
            synchronized (a) {
                Message a2 = C20149i.m73521a(a);
                if (a2 == null) {
                    return jSONArray;
                }
                int i2 = 0;
                int i3 = 0;
                while (a2 != null && i2 < i) {
                    i2++;
                    i3++;
                    JSONObject a3 = m73476a(a2, j);
                    try {
                        a3.put("id", i3);
                    } catch (JSONException unused) {
                    }
                    jSONArray.put(a3);
                    a2 = C20149i.m73520a(a2);
                }
                return jSONArray;
            }
        } catch (Throwable unused2) {
            return jSONArray;
        }
    }

    public C20134g(int i, boolean z) {
        super(i, "block_looper_info");
        C20126d.m73452a().mo68231b();
        this.f49149h = new AbstractC20141c() {
            /* class com.bytedance.monitor.collector.C20134g.C201351 */

            @Override // com.bytedance.monitor.collector.C20134g.AbstractC20141c
            /* renamed from: a */
            public void mo68251a(long[] jArr) {
                C20143e a;
                if (C20134g.this.f49156p && C20134g.this.f49152k != null && (a = C20134g.this.f49152k.mo68264a()) != null && a.f49194d == 8) {
                    C20142d dVar = new C20142d();
                    if (jArr != null) {
                        dVar.f49186a = jArr[1];
                        dVar.f49187b = jArr[5];
                        dVar.f49188c = jArr[6];
                        dVar.f49189d = jArr[7];
                        dVar.f49190e = jArr[8];
                    }
                    a.f49205o = dVar;
                }
            }
        };
        if (z || f49141t) {
            C3056d dVar = new C3056d("looper_monitor");
            this.f49157q = dVar;
            dVar.mo12899a();
            m73479j();
            this.f49153l = new C20140b(LocationRequest.PRIORITY_INDOOR);
            dVar.mo12902a(this.f49159w, (long) f49137f);
            return;
        }
        this.f49157q = null;
    }

    /* renamed from: a */
    private static JSONObject m73476a(Message message, long j) {
        JSONObject jSONObject = new JSONObject();
        if (message == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("when", message.getWhen() - j);
            if (message.getCallback() != null) {
                jSONObject.put("callback", String.valueOf(message.getCallback()));
            }
            jSONObject.put("what", message.what);
            if (message.getTarget() != null) {
                jSONObject.put("target", String.valueOf(message.getTarget()));
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            if (message.obj != null) {
                jSONObject.put("obj", message.obj);
            }
            jSONObject.put("start", message.getWhen());
            jSONObject.put("end", -1);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo68244a(final boolean z, final long j) {
        int i = this.f49151j + 1;
        this.f49151j = i;
        this.f49151j = i & 65535;
        this.f49156p = false;
        if (this.f49162z < 0) {
            this.f49162z = j;
        }
        if (this.f49144A < 0) {
            this.f49144A = j;
        }
        if (this.f49145B < 0) {
            this.f49145B = Process.myTid();
            this.f49146C = SystemClock.currentThreadTimeMillis();
        }
        C20125c c = C20126d.m73453c();
        C20126d.m73454d();
        int i2 = this.f49161y;
        if (j - this.f49162z > ((long) i2) || c != null) {
            long j2 = this.f49144A;
            if (j - j2 <= ((long) i2) && c == null) {
                m73477a(9, j, this.f49155n);
            } else if (z) {
                if (this.f49150i == 0) {
                    m73477a(1, j, "no message running");
                } else {
                    m73477a(9, j2, this.f49154m);
                    m73478a(1, j, "no message running", false, null);
                }
            } else if (this.f49150i == 0) {
                m73478a(8, j, this.f49155n, true, c);
            } else {
                m73478a(9, j2, this.f49154m, false, null);
                m73478a(8, j, this.f49155n, true, c);
            }
        }
        this.f49144A = j;
        final String str = this.f49155n;
        if (this.f49091d) {
            final long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            C20152k.m73538a().f49240b.mo12901a(new Runnable() {
                /* class com.bytedance.monitor.collector.C20134g.RunnableC201384 */

                public void run() {
                    AbstractC20130d.AbstractC20131a c = C20152k.m73538a().mo68294c();
                    if (c != null) {
                        if (z) {
                            String str = C20134g.this.f49088a;
                            c.mo68238a(str, j + "," + currentThreadTimeMillis + ",B|" + C20163o.m73581a(str));
                            return;
                        }
                        String str2 = C20134g.this.f49088a;
                        c.mo68238a(str2, j + "," + currentThreadTimeMillis + ",E");
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m73477a(int i, long j, String str) {
        m73478a(i, j, str, true, null);
    }

    /* renamed from: a */
    private void m73478a(int i, long j, String str, boolean z, C20125c cVar) {
        this.f49156p = true;
        C20143e a = this.f49152k.mo68265a(i);
        a.f49196f = j - this.f49162z;
        if (z) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            a.f49197g = currentThreadTimeMillis - this.f49146C;
            this.f49146C = currentThreadTimeMillis;
        } else {
            a.f49197g = -1;
        }
        a.f49195e = this.f49150i;
        a.f49199i = str;
        a.f49200j = this.f49154m;
        a.f49191a = this.f49162z;
        a.f49192b = j;
        a.f49193c = this.f49144A;
        if (cVar != null) {
            a.f49198h = cVar;
        }
        this.f49152k.mo68266a(a);
        this.f49150i = 0;
        this.f49162z = j;
    }
}
