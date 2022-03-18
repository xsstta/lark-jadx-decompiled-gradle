package com.bytedance.apm6.cpu.exception.p171a;

import com.bytedance.apm6.cpu.exception.AbstractC3245a;
import com.bytedance.apm6.cpu.exception.C3258b;
import com.bytedance.apm6.cpu.exception.C3259c;
import com.bytedance.apm6.cpu.exception.C3262d;
import com.bytedance.apm6.cpu.exception.C3263e;
import com.bytedance.apm6.cpu.exception.C3267i;
import com.bytedance.apm6.cpu.exception.StateType;
import com.bytedance.apm6.cpu.p169a.C3229c;
import com.bytedance.apm6.p183g.C3324a;
import com.bytedance.apm6.util.C3356f;
import com.bytedance.apm6.util.timetask.AbstractRunnableC3362a;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.apm6.util.timetask.C3363b;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.apm6.cpu.exception.a.h */
class C3255h extends AbstractC3245a {

    /* renamed from: b */
    private List<Double> f10426b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private List<C3267i> f10427c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private List<C3267i> f10428d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private AbstractRunnableC3362a f10429e = new AbstractRunnableC3362a(0, 1000) {
        /* class com.bytedance.apm6.cpu.exception.p171a.C3255h.C32561 */

        public void run() {
            C3255h.this.mo13430c();
        }
    };

    /* renamed from: f */
    private C3229c f10430f;

    /* renamed from: g */
    private long f10431g;

    /* renamed from: h */
    private boolean f10432h;

    /* renamed from: d */
    private long m13601d() {
        return 5000;
    }

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g
    /* renamed from: b */
    public StateType mo13426b() {
        return StateType.THREAD_DETECT;
    }

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g, com.bytedance.apm6.cpu.exception.AbstractC3245a
    /* renamed from: a */
    public void mo13417a() {
        super.mo13417a();
        m13605h();
    }

    /* renamed from: g */
    private boolean m13604g() {
        double a = C3263e.m13635a();
        this.f10426b.add(Double.valueOf(a));
        return C3258b.m13614a(this.f10430f, a, this.f10432h);
    }

    /* renamed from: h */
    private void m13605h() {
        this.f10426b.clear();
        this.f10428d.clear();
        this.f10427c.clear();
        this.f10431g = 0;
        C3363b.m13999a(AsyncTaskManagerType.IO).mo13586b(this.f10429e);
    }

    /* renamed from: c */
    public void mo13430c() {
        if (C3258b.m13613a()) {
            m13605h();
            this.f10404a.mo13444c();
            return;
        }
        boolean g = m13604g();
        if (System.currentTimeMillis() - this.f10431g >= m13601d()) {
            m13603f();
        } else if (!g) {
            mo13419a("not over process threshold");
            this.f10427c.clear();
        } else {
            m13602e();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f0, code lost:
        if (r7.mo13463f() != android.os.Process.myPid()) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f8, code lost:
        if (r13.f10430f.mo13363d() != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fb, code lost:
        r5 = r5.getStackTrace();
        r6 = r5.length;
        r8 = 0;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0103, code lost:
        if (r8 >= r6) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0105, code lost:
        r11 = r5[r8];
        r9 = r9 + 1;
        r0.append("\tat ");
        r0.append(r11.getClassName());
        r0.append(".");
        r0.append(r11.getMethodName());
        r0.append("(");
        r0.append(r11.getFileName());
        r0.append(":");
        r0.append(r11.getLineNumber());
        r0.append(")\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x013f, code lost:
        if (r9 <= 40) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0142, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0145, code lost:
        r7.mo13457b(r0.toString());
        r7.mo13453a(java.lang.String.format("%.2f", java.lang.Double.valueOf(r7.mo13461e() / r13.f10430f.mo13365f())));
        r13.f10428d.add(r7);
        r0.setLength(0);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13602e() {
        /*
        // Method dump skipped, instructions count: 439
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm6.cpu.exception.p171a.C3255h.m13602e():void");
    }

    /* renamed from: f */
    private void m13603f() {
        String str;
        String str2;
        if (this.f10426b.isEmpty() || this.f10428d.isEmpty()) {
            mo13419a("finish collect, but no exception thread is found");
            m13605h();
            this.f10404a.mo13444c();
            return;
        }
        double d = 0.0d;
        double d2 = 0.0d;
        for (Double d3 : this.f10426b) {
            double doubleValue = d3.doubleValue();
            if (d2 < doubleValue) {
                d2 = doubleValue;
            }
            d += doubleValue;
        }
        mo13419a("report exception data, exception thread size is: " + this.f10428d.size());
        double size = d / ((double) this.f10426b.size());
        LinkedList linkedList = new LinkedList();
        String[] split = C3258b.m13615b().split("#");
        int i = 0;
        if (this.f10432h) {
            if (!this.f10430f.mo13356b().isEmpty()) {
                int length = split.length;
                while (i < length) {
                    String str3 = split[i];
                    if (this.f10430f.mo13356b().containsKey(str3)) {
                        double doubleValue2 = this.f10430f.mo13356b().get(str3).doubleValue();
                        if (doubleValue2 >= 0.0d && size > doubleValue2) {
                            linkedList.add(str3);
                        }
                    }
                    i++;
                }
            }
        } else if (!this.f10430f.mo13360c().isEmpty()) {
            int length2 = split.length;
            while (i < length2) {
                String str4 = split[i];
                if (this.f10430f.mo13360c().containsKey(str4)) {
                    double doubleValue3 = this.f10430f.mo13360c().get(str4).doubleValue();
                    if (doubleValue3 >= 0.0d && size > doubleValue3) {
                        linkedList.add(str4);
                    }
                }
                i++;
            }
        }
        if (C3259c.m13617a().mo13436b() && (!linkedList.isEmpty() || ((this.f10432h && size > this.f10430f.mo13364e()) || (!this.f10432h && size > this.f10430f.mo13367h())))) {
            C3259c.m13617a().mo13434a(System.currentTimeMillis());
            C3259c.m13617a().mo13437c().mo13342a(size);
            if (!linkedList.isEmpty()) {
                str2 = C3356f.m13963a(linkedList.toArray(), "#");
                if (this.f10432h && size > this.f10430f.mo13364e()) {
                    str2 = str2 + "#" + "apm_max_background";
                } else if (!this.f10432h && size > this.f10430f.mo13367h()) {
                    str2 = str2 + "#" + "apm_max_foreground";
                }
            } else if (this.f10432h && size > this.f10430f.mo13364e()) {
                str = "apm_max_background";
                C3324a.m13872a(new C3248b(size, d2, this.f10428d, str, this.f10432h));
            } else if (this.f10432h || size <= this.f10430f.mo13367h()) {
                str2 = "";
            } else {
                str = "apm_max_foreground";
                C3324a.m13872a(new C3248b(size, d2, this.f10428d, str, this.f10432h));
            }
            str = str2;
            C3324a.m13872a(new C3248b(size, d2, this.f10428d, str, this.f10432h));
        }
        m13605h();
        this.f10404a.mo13447f();
    }

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g, com.bytedance.apm6.cpu.exception.AbstractC3245a
    /* renamed from: a */
    public void mo13420a(boolean z) {
        super.mo13420a(z);
        m13605h();
        this.f10404a.mo13443b();
    }

    public C3255h(C3262d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.apm6.cpu.exception.AbstractC3265g, com.bytedance.apm6.cpu.exception.AbstractC3245a
    /* renamed from: a */
    public void mo13418a(C3229c cVar, boolean z) {
        super.mo13418a(cVar, z);
        this.f10430f = cVar;
        this.f10431g = System.currentTimeMillis();
        this.f10432h = z;
        C3363b.m13999a(AsyncTaskManagerType.IO).mo13585a(this.f10429e);
    }
}
