package com.bytedance.apm.p142h;

import com.bytedance.apm.C2785b;
import com.bytedance.apm.p138d.AbstractC2914a;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm6.util.p195b.C3350b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.h.a */
public class C2942a {

    /* renamed from: b */
    private static volatile C2942a f9447b;

    /* renamed from: a */
    CopyOnWriteArraySet<AbstractC2914a> f9448a = new CopyOnWriteArraySet<>();

    private C2942a() {
    }

    /* renamed from: a */
    public static C2942a m12401a() {
        if (f9447b == null) {
            synchronized (C2942a.class) {
                if (f9447b == null) {
                    f9447b = new C2942a();
                }
            }
        }
        return f9447b;
    }

    /* renamed from: a */
    public void mo12641a(AbstractC2914a aVar) {
        if (aVar != null) {
            try {
                this.f9448a.add(aVar);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo12642a(final String str, final String str2, final JSONObject jSONObject) {
        if (C2785b.m11769j()) {
            C3350b.m13932a("LogObserver", "logObserverList:" + this.f9448a.size());
        }
        if (this.f9448a.size() != 0) {
            C3047b.m12756a().mo12890b(new Runnable() {
                /* class com.bytedance.apm.p142h.C2942a.RunnableC29431 */

                public void run() {
                    Iterator<AbstractC2914a> it = C2942a.this.f9448a.iterator();
                    while (it.hasNext()) {
                        it.next().mo12596a(str, str2, jSONObject);
                    }
                }
            });
        }
    }
}
