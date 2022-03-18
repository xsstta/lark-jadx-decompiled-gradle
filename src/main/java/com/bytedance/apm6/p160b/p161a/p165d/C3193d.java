package com.bytedance.apm6.p160b.p161a.p165d;

import com.bytedance.apm.p129b.C2786a;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p160b.p161a.C3159a;
import com.bytedance.apm6.p160b.p161a.p164c.C3176a;
import com.bytedance.apm6.p160b.p161a.p165d.C3183a;
import com.bytedance.apm6.p160b.p161a.p165d.C3187b;
import com.bytedance.apm6.p160b.p161a.p166e.AbstractC3208d;
import com.bytedance.apm6.util.C3352c;
import com.bytedance.apm6.util.p195b.C3350b;
import com.bytedance.apm6.util.timetask.AbstractRunnableC3362a;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.apm6.util.timetask.C3363b;
import com.bytedance.common.utility.NetworkUtils;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.apm6.b.a.d.d */
public class C3193d implements AbstractC3208d {

    /* renamed from: a */
    public long f10228a;

    /* renamed from: b */
    public long f10229b;

    /* renamed from: c */
    public volatile boolean f10230c;

    /* renamed from: d */
    private LinkedHashMap<AbstractC3198f, ConcurrentLinkedQueue<C3196b>> f10231d;

    /* renamed from: e */
    private AbstractRunnableC3362a f10232e;

    /* renamed from: f */
    private long f10233f;

    /* renamed from: com.bytedance.apm6.b.a.d.d$a */
    private static class C3195a {

        /* renamed from: a */
        public static final C3193d f10235a = new C3193d();
    }

    /* renamed from: c */
    public void mo13269c() {
        this.f10230c = true;
    }

    /* renamed from: d */
    public void mo13270d() {
        this.f10230c = false;
    }

    @Override // com.bytedance.apm6.p160b.p161a.p166e.AbstractC3208d
    /* renamed from: g */
    public String mo13213g() {
        return "second_log_dir";
    }

    /* renamed from: a */
    public static C3193d m13346a() {
        return C3195a.f10235a;
    }

    /* renamed from: j */
    private void m13350j() {
        this.f10233f = 1;
        this.f10228a = 30000;
    }

    private C3193d() {
        this.f10231d = new LinkedHashMap<>();
        this.f10228a = 30000;
        this.f10229b = 0;
        this.f10233f = 1;
        this.f10230c = false;
    }

    /* renamed from: b */
    public void mo13268b() {
        this.f10232e = new AbstractRunnableC3362a(0, 30000) {
            /* class com.bytedance.apm6.p160b.p161a.p165d.C3193d.C31941 */

            public void run() {
                if (System.currentTimeMillis() - C3193d.this.f10229b >= C3193d.this.f10228a) {
                    try {
                        if (!C3193d.this.f10230c) {
                            C3193d.this.mo13271e();
                        }
                    } catch (Throwable th) {
                        C3350b.m13935b(C3159a.f10110a, "send", th);
                    }
                    C3193d.this.f10229b = System.currentTimeMillis();
                }
            }
        };
        C3363b.m13999a(AsyncTaskManagerType.IO).mo13585a(this.f10232e);
    }

    @Override // com.bytedance.apm6.p160b.p161a.p166e.AbstractC3208d
    /* renamed from: h */
    public long mo13214h() {
        File[] c = C3183a.m13303a().mo13239c();
        long j = 0;
        if (c == null) {
            return 0;
        }
        for (File file : c) {
            j += file.length();
        }
        return j;
    }

    /* renamed from: e */
    public void mo13271e() {
        if (NetworkUtils.isNetworkAvailable(C3318a.m13917w())) {
            if (C3190c.m13326a().mo13259e()) {
                if (C3318a.m13915u()) {
                    C3350b.m13932a(C3159a.f10110a, "trigger send.");
                }
                boolean f = m13348f();
                if (C3318a.m13827e()) {
                    f = m13349i();
                }
                if (f) {
                    m13350j();
                } else {
                    if (this.f10228a < 120000) {
                        long j = this.f10233f;
                        this.f10228a = (j + 1) * 30000;
                        this.f10233f = j + 1;
                    }
                    if (this.f10228a > 120000) {
                        this.f10228a = 120000;
                    }
                }
            }
            if (C3318a.m13915u() && !C3190c.m13326a().mo13259e()) {
                C3350b.m13932a(C3159a.f10110a, "report log disable");
            }
        }
    }

    /* renamed from: f */
    private boolean m13348f() {
        C3196b bVar;
        if (this.f10231d.isEmpty()) {
            return true;
        }
        boolean z = true;
        for (AbstractC3198f fVar : this.f10231d.keySet()) {
            ConcurrentLinkedQueue<C3196b> concurrentLinkedQueue = this.f10231d.get(fVar);
            if (concurrentLinkedQueue != null) {
                Object[] array = concurrentLinkedQueue.toArray();
                C3196b bVar2 = null;
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    bVar = (C3196b) array[i];
                    if (bVar.f10237b <= 0 || System.currentTimeMillis() - bVar.f10238c > 0) {
                        bVar2 = bVar;
                    } else {
                        i++;
                    }
                }
                bVar2 = bVar;
                if (bVar2 == null && concurrentLinkedQueue.size() > 0) {
                    bVar2 = concurrentLinkedQueue.peek();
                }
                if (bVar2 != null) {
                    if (C3318a.m13915u()) {
                        C3350b.m13932a(C3159a.f10110a, "sendMemory");
                    }
                    boolean a = C3197e.m13359a(fVar).mo13273a(bVar2.f10236a);
                    if (a) {
                        concurrentLinkedQueue.remove(bVar2);
                    } else {
                        bVar2.f10237b++;
                        bVar2.f10238c = C3190c.m13326a().mo13250a(bVar2.f10237b) + System.currentTimeMillis();
                    }
                    if (!a) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: i */
    private boolean m13349i() {
        int i;
        boolean z = true;
        for (AbstractC3198f fVar : C3202g.m13382a()) {
            File a = C3183a.m13303a().mo13233a(fVar.mo13274a());
            if (a != null && a.exists()) {
                if (C3197e.m13359a(fVar).mo13273a(C3352c.m13945a(a))) {
                    if (C3318a.m13915u()) {
                        C3350b.m13932a(C3159a.f10110a, "sendFile: success");
                    }
                    C3183a.m13303a().mo13234a(a);
                } else {
                    C3183a.C3186b b = C3183a.m13303a().mo13237b(a);
                    if (b != null) {
                        i = b.mo13242a() + 1;
                    } else {
                        i = 0;
                    }
                    long a2 = C3190c.m13326a().mo13250a(i) + System.currentTimeMillis();
                    C3183a.m13303a().mo13235a(a, i, a2);
                    if (C3318a.m13915u()) {
                        String str = C3159a.f10110a;
                        C3350b.m13932a(str, "sendfile error retry count:" + a.getName() + "  " + i + " nextRetryTime:" + a2);
                    }
                    z = false;
                }
            }
        }
        return z;
    }

    @Override // com.bytedance.apm6.p160b.p161a.p166e.AbstractC3208d
    /* renamed from: c */
    public void mo13209c(long j) {
        File[] c = C3183a.m13303a().mo13239c();
        if (c != null) {
            for (File file : c) {
                if (C3183a.m13305c(file) <= j) {
                    C3352c.m13947b(file);
                }
            }
        }
    }

    /* renamed from: a */
    private void m13347a(List<C3176a> list) {
        for (C3176a aVar : list) {
            try {
                if (aVar.mo13224e() != null) {
                    C3352c.m13947b(aVar.mo13224e());
                }
            } catch (Exception unused) {
                String str = C3159a.f10110a;
                C3350b.m13936c(str, "delete LogFile's source File failed. logFile=" + aVar.mo13224e());
            }
        }
    }

    /* renamed from: a */
    public void mo13267a(List<C3176a> list, int i) {
        int i2;
        boolean z;
        boolean z2;
        long j;
        long j2;
        ConcurrentLinkedQueue<C3196b> concurrentLinkedQueue;
        try {
            if (C3190c.m13326a().mo13262h()) {
                if (C3318a.m13915u()) {
                    C3350b.m13932a(C3159a.f10110a, "stop collect log");
                }
                long j3 = 0;
                long j4 = 0;
                for (C3176a aVar : list) {
                    j3 += (long) aVar.mo13221b();
                    j4 += (long) aVar.mo13222c();
                }
                C3187b.m13320a().mo13246a(j3, j4, System.currentTimeMillis(), C3187b.EnumC3189b.SERVER_DROP);
                m13347a(list);
                return;
            }
            Map<AbstractC3198f, byte[]> a = C3202g.m13383a(list, i);
            if (a == null) {
                m13347a(list);
                return;
            }
            boolean isNetworkAvailable = NetworkUtils.isNetworkAvailable(C3318a.m13917w());
            boolean z3 = false;
            for (AbstractC3198f fVar : a.keySet()) {
                byte[] bArr = a.get(fVar);
                if (bArr != null) {
                    if (!C3190c.m13326a().mo13259e() || !isNetworkAvailable) {
                        z = false;
                        i2 = 0;
                    } else {
                        if (C3318a.m13915u()) {
                            C2786a.m11787a(bArr);
                        }
                        z = C3197e.m13359a(fVar).mo13273a(bArr);
                        if (C3318a.m13915u()) {
                            if (z3) {
                                C2786a.m11788b(bArr);
                            } else {
                                C2786a.m11789c(bArr);
                            }
                        }
                        this.f10229b = System.currentTimeMillis();
                        z3 |= z;
                        i2 = 1;
                    }
                    if (C3318a.m13915u()) {
                        C3350b.m13932a(C3159a.f10110a, "sendDirect:isReportLogEnable " + C3190c.m13326a().mo13259e() + " :sendResult " + z);
                    }
                    if (!z) {
                        long a2 = C3190c.m13326a().mo13250a(i2);
                        long currentTimeMillis = System.currentTimeMillis() + a2;
                        if (C3318a.m13827e()) {
                            j = currentTimeMillis;
                            z2 = z3;
                            j2 = a2;
                            z = C3183a.m13303a().mo13236a(bArr, fVar.mo13274a(), i2, j);
                        } else {
                            z2 = z3;
                            j = currentTimeMillis;
                            j2 = a2;
                        }
                        if (C3318a.m13915u()) {
                            C3350b.m13932a(C3159a.f10110a, "saveFile:Result:" + z + ":isMaiProcess:" + C3318a.m13827e() + " :" + i2 + " " + j2);
                        }
                        if (!z) {
                            if (this.f10231d.containsKey(fVar)) {
                                concurrentLinkedQueue = this.f10231d.get(fVar);
                            } else {
                                concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                                concurrentLinkedQueue.add(new C3196b(bArr, i2, j));
                            }
                            if (concurrentLinkedQueue.size() > 10) {
                                concurrentLinkedQueue.poll();
                            }
                        }
                    } else {
                        z2 = z3;
                    }
                    z3 = z2;
                }
            }
            if (z3) {
                m13350j();
            }
            m13347a(list);
        } catch (Throwable th) {
            C3350b.m13935b(C3159a.f10110a, "sendLog", th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm6.b.a.d.d$b */
    public static final class C3196b {

        /* renamed from: a */
        byte[] f10236a;

        /* renamed from: b */
        int f10237b;

        /* renamed from: c */
        long f10238c;

        C3196b(byte[] bArr, int i, long j) {
            this.f10236a = bArr;
            this.f10237b = i;
            this.f10238c = j;
        }
    }
}
