package com.bytedance.ee.bear.drive.report;

import android.os.Looper;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.util.p718t.C13748k;

/* renamed from: com.bytedance.ee.bear.drive.report.g */
public class C7136g<DATA> {

    /* renamed from: a */
    private AbstractC1178x<DATA> f19226a;

    /* renamed from: a */
    public void mo28017a(AbstractC1178x<DATA> xVar) {
        this.f19226a = xVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m28724b(Object obj) {
        AbstractC1178x<DATA> xVar = this.f19226a;
        if (xVar != null) {
            xVar.onChanged(obj);
        }
    }

    /* renamed from: a */
    public void mo28018a(DATA data) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            AbstractC1178x<DATA> xVar = this.f19226a;
            if (xVar != null) {
                xVar.onChanged(data);
                return;
            }
            return;
        }
        C13748k.m55732a(new Runnable(data) {
            /* class com.bytedance.ee.bear.drive.report.$$Lambda$g$j68hoxi0h7naBxN2E2s75FFus */
            public final /* synthetic */ Object f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7136g.this.m28724b(this.f$1);
            }
        });
    }
}
