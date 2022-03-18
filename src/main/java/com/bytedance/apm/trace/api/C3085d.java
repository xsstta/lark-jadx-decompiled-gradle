package com.bytedance.apm.trace.api;

import com.bytedance.apm.launch.C3024a;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.trace.model.AbstractC3103a;
import com.bytedance.apm.trace.model.C3104b;
import com.bytedance.apm.trace.model.cross.NativeSpan;
import com.bytedance.apm.trace.model.cross.TracingCrossManager;
import com.bytedance.tracing.p908a.p909a.C20712a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.apm.trace.api.d */
public class C3085d {

    /* renamed from: a */
    public AbstractC3103a f9915a;

    /* renamed from: b */
    private final String f9916b;

    /* renamed from: c */
    private final long f9917c = C20712a.m75502a();

    /* renamed from: d */
    private final TracingMode f9918d;

    /* renamed from: e */
    private final boolean f9919e;

    /* renamed from: f */
    private long f9920f;

    /* renamed from: g */
    private boolean f9921g;

    /* renamed from: h */
    private boolean f9922h;

    /* renamed from: i */
    private boolean f9923i;

    /* renamed from: c */
    public String mo12962c() {
        return this.f9916b;
    }

    /* renamed from: d */
    public long mo12963d() {
        return this.f9917c;
    }

    /* renamed from: e */
    public boolean mo12964e() {
        return this.f9919e;
    }

    /* renamed from: a */
    public synchronized void mo12958a() {
        if (!this.f9921g) {
            m12856a(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.apm.trace.api.d$2 */
    public static /* synthetic */ class C30872 {

        /* renamed from: a */
        static final /* synthetic */ int[] f9926a;

        static {
            int[] iArr = new int[TracingMode.values().length];
            f9926a = iArr;
            try {
                iArr[TracingMode.BATCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo12960b() {
        if (!this.f9922h) {
            if (this.f9921g) {
                final long currentTimeMillis = System.currentTimeMillis();
                C3047b.m12756a().mo12886a(new Runnable() {
                    /* class com.bytedance.apm.trace.api.C3085d.RunnableC30861 */

                    public void run() {
                        C3085d.this.f9915a.mo13001b(currentTimeMillis);
                        C3085d.this.f9915a = null;
                    }
                });
                this.f9922h = true;
                if (this.f9923i) {
                    TracingCrossManager.unRegisterCross(this.f9917c);
                }
            }
        }
    }

    /* renamed from: a */
    private AbstractC3103a m12855a(TracingMode tracingMode) {
        if (C30872.f9926a[tracingMode.ordinal()] != 1) {
            return null;
        }
        return new C3104b(this);
    }

    /* renamed from: a */
    private void m12856a(boolean z) {
        this.f9915a = m12855a(this.f9918d);
        long currentTimeMillis = System.currentTimeMillis();
        this.f9920f = currentTimeMillis;
        this.f9915a.mo12998a(currentTimeMillis);
        this.f9921g = true;
        if (z) {
            TracingCrossManager.registerCross(this.f9917c, this);
        }
    }

    /* renamed from: a */
    public synchronized AbstractC3082a mo12957a(String str) {
        if (!this.f9922h) {
            if (this.f9921g) {
                return this.f9915a.mo12995a(str);
            }
        }
        C3024a a = C3024a.m12698a();
        a.mo12839a(str + " is start after Trace finish or before Trace begin, it will be ignore!!!!");
        return null;
    }

    /* renamed from: b */
    public synchronized void mo12961b(String str, ArrayList<NativeSpan> arrayList) {
        if (!this.f9922h) {
            if (this.f9921g) {
                boolean z = true;
                Iterator<NativeSpan> it = arrayList.iterator();
                while (it.hasNext()) {
                    NativeSpan next = it.next();
                    if (next != null) {
                        AbstractC3084c parseToSpan = next.parseToSpan(this.f9915a);
                        if (z) {
                            parseToSpan.mo12953b(Long.parseLong(str));
                        }
                        parseToSpan.mo12956a(next.getStartTime(), next.getFinishTime());
                        z = false;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo12959a(String str, ArrayList<NativeSpan> arrayList) {
        if (!this.f9922h) {
            if (this.f9921g) {
                boolean z = true;
                Iterator<NativeSpan> it = arrayList.iterator();
                while (it.hasNext()) {
                    NativeSpan next = it.next();
                    if (next != null) {
                        AbstractC3084c parseToSpan = next.parseToSpan(this.f9915a);
                        if (z) {
                            parseToSpan.mo12950a(Long.parseLong(str));
                        }
                        parseToSpan.mo12956a(next.getStartTime(), next.getFinishTime());
                        z = false;
                    }
                }
            }
        }
    }

    public C3085d(String str, TracingMode tracingMode, boolean z) {
        this.f9916b = str;
        this.f9918d = tracingMode;
        this.f9919e = z;
    }
}
