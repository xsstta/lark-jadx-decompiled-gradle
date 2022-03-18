package com.bytedance.ee.bear.integrator.p407c;

import android.app.Application;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.C2734a;
import com.bytedance.ee.bear.document.offline.base.C5909f;
import com.bytedance.ee.bear.service.AbstractC10928d;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.base.C10916c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.db.C13636b;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p701d.C13629i;

/* renamed from: com.bytedance.ee.bear.integrator.c.a */
public class C7917a {

    /* renamed from: a */
    private C10929e f21303a;

    /* renamed from: b */
    private C5909f f21304b = new C5909f();

    /* renamed from: a */
    private void m31650a(Application application, boolean z, String str) {
        C13479a.m54764b("FacadeInit", str);
        if (!z && !TextUtils.isEmpty(str)) {
            C13479a.m54755a(application, "", false, str, 4);
        }
        if (!z) {
            C2734a.m11611a().mo11776a(application);
        }
        C13615c.f35773a = application;
        C13636b.m55347a();
    }

    /* renamed from: a */
    public void mo30745a(Application application, AbstractC10928d dVar, boolean z, String str) {
        m31650a(application, z, str);
        long uptimeMillis = SystemClock.uptimeMillis();
        C10916c.m45407a(C13629i.m55303b(application));
        C10929e.m45434a(application, dVar, $$Lambda$EwkSTMvNZ8Y744aP6K50Z6D_0aw.INSTANCE);
        C13479a.m54772d("FacadeInit", "init: service init time = " + (SystemClock.uptimeMillis() - uptimeMillis));
        C10929e eVar = new C10929e();
        this.f21303a = eVar;
        this.f21304b.mo23876a(application, eVar);
    }
}
