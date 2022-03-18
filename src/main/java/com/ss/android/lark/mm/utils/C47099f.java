package com.ss.android.lark.mm.utils;

import android.os.Looper;
import android.os.MessageQueue;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.utils.C47099f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.mm.utils.f */
public class C47099f {

    /* renamed from: a */
    public Map<Long, AbstractC47102b> f118616a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mm.utils.f$a */
    public static class C47101a {

        /* renamed from: a */
        static C47099f f118620a = new C47099f();
    }

    /* renamed from: com.ss.android.lark.mm.utils.f$b */
    public static abstract class AbstractC47102b {

        /* renamed from: a */
        private long f118621a = 5000;

        /* renamed from: b */
        private long f118622b = System.currentTimeMillis();

        /* renamed from: a */
        public abstract void mo164591a(boolean z, long j);

        /* renamed from: a */
        public long mo165487a() {
            return this.f118621a;
        }

        /* renamed from: b */
        public long mo165488b() {
            return this.f118622b;
        }
    }

    /* renamed from: a */
    public static C47099f m186541a() {
        return C47101a.f118620a;
    }

    private C47099f() {
        this.f118616a = new HashMap();
    }

    /* renamed from: a */
    public void mo165485a(AbstractC47102b bVar) {
        if (bVar != null) {
            C45859k.m181685a(new Runnable(bVar, System.currentTimeMillis()) {
                /* class com.ss.android.lark.mm.utils.$$Lambda$f$McdSkAcpWwWxuMDAndof24rtPZs */
                public final /* synthetic */ C47099f.AbstractC47102b f$1;
                public final /* synthetic */ long f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C47099f.this.m186543a((C47099f) this.f$1, (C47099f.AbstractC47102b) this.f$2);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m186542a(long j, long j2) {
        AbstractC47102b bVar = this.f118616a.get(Long.valueOf(j));
        if (bVar != null) {
            this.f118616a.remove(Long.valueOf(j));
            bVar.mo164591a(true, System.currentTimeMillis() - j2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m186543a(AbstractC47102b bVar, final long j) {
        final long b = bVar.mo165488b();
        this.f118616a.put(Long.valueOf(b), bVar);
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() {
            /* class com.ss.android.lark.mm.utils.C47099f.C471001 */

            public boolean queueIdle() {
                AbstractC47102b bVar = C47099f.this.f118616a.get(Long.valueOf(b));
                if (bVar != null) {
                    C47099f.this.f118616a.remove(Long.valueOf(b));
                    bVar.mo164591a(false, System.currentTimeMillis() - j);
                }
                return false;
            }
        });
        C45859k.m181686a(new Runnable(b, j) {
            /* class com.ss.android.lark.mm.utils.$$Lambda$f$ANqBRWB_1SjQt6oW64F9RQKCdA */
            public final /* synthetic */ long f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r4;
            }

            public final void run() {
                C47099f.this.m186542a((C47099f) this.f$1, this.f$2);
            }
        }, (long) ((int) bVar.mo165487a()));
    }
}
