package com.bytedance.push.p890k;

import com.bytedance.common.push.ThreadPlus;
import com.bytedance.push.interfaze.AbstractC20439b;
import com.bytedance.push.interfaze.AbstractC20452o;
import com.bytedance.push.log.ILogger;
import com.bytedance.push.p889j.RunnableC20462b;
import com.ss.android.ug.bus.C60443c;
import com.ss.android.ug.bus.p3039a.p3040a.C60439a;
import com.ss.android.ug.bus.p3039a.p3040a.C60440b;
import com.ss.android.ug.bus.p3039a.p3040a.C60441c;

/* renamed from: com.bytedance.push.k.b */
public final class C20468b {

    /* renamed from: a */
    private final AbstractC20452o f49953a;

    /* renamed from: b */
    private final AbstractC20439b f49954b;

    /* renamed from: a */
    public void mo68941a() {
        this.f49954b.mo68910c(new C60443c.AbstractC60445a<C60441c>() {
            /* class com.bytedance.push.p890k.C20468b.C204691 */

            public void onCall(C60441c cVar) {
                C20468b.this.mo68944b(cVar.f151024a);
            }
        });
        this.f49954b.mo68907a(new C60443c.AbstractC60445a<C60439a>() {
            /* class com.bytedance.push.p890k.C20468b.C204702 */

            public void onCall(C60439a aVar) {
                C20468b.this.mo68942a(aVar.f151023a);
            }
        });
        this.f49954b.mo68909b(new C60443c.AbstractC60445a<C60440b>() {
            /* class com.bytedance.push.p890k.C20468b.C204713 */

            public void onCall(C60440b bVar) {
                C20468b.this.mo68943b();
            }
        });
    }

    /* renamed from: b */
    public void mo68943b() {
        this.f49953a.getLogger().mo68949d("UidSync", "onLogout");
        m74488c("passport_logout");
    }

    /* renamed from: c */
    private void m74488c(String str) {
        ThreadPlus.submitRunnable(new RunnableC20462b(this.f49953a, str));
    }

    /* renamed from: a */
    public void mo68942a(String str) {
        ILogger logger = this.f49953a.getLogger();
        logger.mo68949d("UidSync", "onLogin " + str);
        m74488c("passport_login");
    }

    /* renamed from: b */
    public void mo68944b(String str) {
        ILogger logger = this.f49953a.getLogger();
        logger.mo68949d("UidSync", "onAccountSwitch  " + str);
        m74488c("passport_switch");
    }

    public C20468b(AbstractC20452o oVar, AbstractC20439b bVar) {
        this.f49953a = oVar;
        this.f49954b = bVar;
    }
}
