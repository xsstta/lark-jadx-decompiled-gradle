package com.bytedance.apm;

import android.util.Log;
import com.bytedance.monitor.util.thread.AbstractC20190c;
import com.bytedance.monitor.util.thread.C20188b;
import java.util.HashSet;

/* renamed from: com.bytedance.apm.j */
public class C3013j {

    /* renamed from: a */
    public AbstractC3015a f9724a;

    /* renamed from: b */
    private HashSet<String> f9725b;

    /* renamed from: com.bytedance.apm.j$a */
    public interface AbstractC3015a {
        /* renamed from: a */
        void mo12807a(String str);

        /* renamed from: a */
        void mo12808a(Throwable th, String str);

        /* renamed from: b */
        void mo12809b(Throwable th, String str);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.j$b */
    public static class C3016b {

        /* renamed from: a */
        public static final C3013j f9727a = new C3013j();
    }

    /* renamed from: a */
    public static C3013j m12658a() {
        return C3016b.f9727a;
    }

    private C3013j() {
        this.f9725b = new HashSet<>();
    }

    /* renamed from: b */
    private void m12659b() {
        C20188b.m73688a().mo68321a(new AbstractC20190c.AbstractC20191a() {
            /* class com.bytedance.apm.C3013j.C30141 */

            @Override // com.bytedance.monitor.util.thread.AbstractC20190c.AbstractC20191a
            /* renamed from: a */
            public void mo12829a(Throwable th, String str) {
                if (C3013j.this.f9724a != null) {
                    C3013j.this.f9724a.mo12809b(th, str);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo12825a(AbstractC3015a aVar) {
        this.f9724a = aVar;
        m12659b();
    }

    /* renamed from: a */
    public void mo12826a(String str) {
        if (this.f9724a != null && !this.f9725b.contains(str)) {
            this.f9725b.add(str);
            AbstractC3015a aVar = this.f9724a;
            aVar.mo12807a("apm_" + str);
        }
        if (C2785b.m11769j()) {
            Log.e("apm_", "ensureNotReachHere", new RuntimeException(str));
            System.exit(1);
        }
    }

    /* renamed from: b */
    public void mo12828b(Throwable th, String str) {
        try {
            AbstractC3015a aVar = this.f9724a;
            if (aVar != null) {
                aVar.mo12809b(th, str);
            }
        } catch (Throwable unused) {
        }
        if (C2785b.m11769j() || C2785b.m11771l()) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public void mo12827a(Throwable th, String str) {
        if (this.f9724a != null && !this.f9725b.contains(str)) {
            this.f9725b.add(str);
            AbstractC3015a aVar = this.f9724a;
            aVar.mo12808a(th, "apm_" + str);
        }
        if (C2785b.m11769j()) {
            th.printStackTrace();
        }
    }
}
