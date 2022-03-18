package com.ss.android.lark.eetroublecapture;

import android.os.SystemClock;
import com.ss.android.lark.eetroublebase.Log;
import com.ss.android.lark.eetroublebase.p1826a.C36964b;
import com.ss.android.lark.eetroublebase.p1826a.C36966c;
import com.ss.android.lark.eetroublecapture.entity.CaptureInfo;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.eetroublecapture.g */
public class C36986g {

    /* renamed from: a */
    public C36991k f95083a;

    /* renamed from: b */
    public AbstractC36974c f95084b;

    public C36986g(AbstractC36974c cVar) {
        this.f95084b = cVar;
        this.f95083a = new C36991k(cVar);
    }

    /* renamed from: a */
    public void mo136499a(final String str, final int i) {
        C36966c.m145950a(new Runnable() {
            /* class com.ss.android.lark.eetroublecapture.C36986g.RunnableC369871 */

            public void run() {
                int i;
                if (C36986g.this.f95084b.mo136463a() != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    List<CaptureInfo> a = C36986g.this.f95083a.mo136504a();
                    if (a != null) {
                        i = a.size();
                    } else {
                        i = 0;
                    }
                    for (int i2 = 0; i2 < i; i2++) {
                        Log.m145903a(i, str, i2, C36964b.m145945a(a.get(i2)));
                    }
                    for (AbstractC36982d dVar : C36986g.this.f95083a.mo136505b()) {
                        dVar.mo109394h();
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    Log.m145905a("dumpCapture used time=" + (elapsedRealtime2 - elapsedRealtime));
                }
            }
        });
    }
}
