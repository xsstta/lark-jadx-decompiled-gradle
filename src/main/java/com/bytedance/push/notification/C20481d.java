package com.bytedance.push.notification;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.push.ThreadPlus;
import com.bytedance.push.p888i.AbstractC20436a;

/* renamed from: com.bytedance.push.notification.d */
public class C20481d {

    /* renamed from: a */
    public final AbstractC20436a f49971a;

    /* renamed from: b */
    public Handler f49972b;

    public C20481d(AbstractC20436a aVar) {
        this.f49971a = aVar;
    }

    /* renamed from: a */
    public void mo68972a(final String str, final String str2, final AbstractC20503k kVar) {
        if (this.f49972b == null) {
            this.f49972b = new Handler(Looper.getMainLooper());
        }
        ThreadPlus.submitRunnable(new Runnable() {
            /* class com.bytedance.push.notification.C20481d.RunnableC204821 */

            public void run() {
                final boolean a = C20481d.this.f49971a.mo68898a(str, str2);
                if (kVar != null) {
                    C20481d.this.f49972b.post(new Runnable() {
                        /* class com.bytedance.push.notification.C20481d.RunnableC204821.RunnableC204831 */

                        public void run() {
                            if (a) {
                                kVar.mo68989a(str2);
                            } else {
                                kVar.mo68988a();
                            }
                        }
                    });
                }
            }
        });
    }
}
