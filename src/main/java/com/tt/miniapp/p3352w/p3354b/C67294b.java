package com.tt.miniapp.p3352w.p3354b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.process.C66615b;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.util.C67866g;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.w.b.b */
public class C67294b implements C66615b.AbstractC66618a, AbstractC67297c {

    /* renamed from: a */
    public ConcurrentHashMap<String, C67296a> f169839a = new ConcurrentHashMap<>();

    @Override // com.tt.miniapp.process.C66615b.AbstractC66618a
    /* renamed from: a */
    public void mo232064a() {
    }

    public C67294b() {
        for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : C66645a.m260337a().mo232359b()) {
            if (iAppSandboxEnvProcessor != null) {
                iAppSandboxEnvProcessor.registerHostProcessLifeListener(this);
            }
        }
    }

    /* renamed from: com.tt.miniapp.w.b.b$a */
    private static class C67296a extends Vector<AbstractC67293a> {
        String miniAppId;

        public C67296a(String str) {
            this.miniAppId = str;
        }
    }

    @Override // com.tt.miniapp.process.C66615b.AbstractC66618a
    /* renamed from: a */
    public void mo232065a(boolean z) {
        if (z) {
            final AbstractC67433a k = C67448a.m262353a().mo234192k();
            if (k == null) {
                k = C67448a.m262353a().mo234190i();
            }
            C67866g.m264032c(new Runnable() {
                /* class com.tt.miniapp.p3352w.p3354b.C67294b.RunnableC672951 */

                public void run() {
                    AbstractC67433a aVar;
                    if (C67294b.this.f169839a.size() > 0 && (aVar = k) != null) {
                        String str = AppbrandApplicationImpl.getInst(aVar).getAppInfo().appId;
                        C66615b.m260248a().mo232248c();
                        C66612a.m260221a(k);
                        for (String str2 : C67294b.this.f169839a.keySet()) {
                            C66612a.m260239d(str, str2);
                        }
                    }
                }
            });
        }
    }

    @Override // com.tt.miniapp.p3352w.p3354b.AbstractC67297c
    /* renamed from: a */
    public void mo233960a(String str, String str2, AbstractC67293a aVar) {
        String a = C67300f.m262171a(str2);
        C67296a aVar2 = this.f169839a.get(a);
        if (aVar2 == null) {
            aVar2 = new C67296a(str);
            this.f169839a.put(a, aVar2);
            if (ProcessUtil.isMiniappProcess()) {
                C66612a.m260239d(str, a);
            }
        }
        aVar2.add(aVar);
    }

    @Override // com.tt.miniapp.p3352w.p3354b.AbstractC67297c
    /* renamed from: b */
    public void mo233962b(String str, String str2, AbstractC67293a aVar) {
        String a = C67300f.m262171a(str2);
        C67296a aVar2 = this.f169839a.get(a);
        if (aVar2 != null) {
            aVar2.remove(aVar);
            if (aVar2.size() == 0) {
                this.f169839a.remove(a);
                if (ProcessUtil.isMiniappProcess()) {
                    C66612a.m260241e(str, a);
                }
            }
        }
    }

    @Override // com.tt.miniapp.p3352w.p3354b.AbstractC67297c
    /* renamed from: a */
    public void mo233961a(String str, String str2, JSONObject jSONObject) {
        String a = C67300f.m262171a(str2);
        C67296a aVar = this.f169839a.get(a);
        if (aVar == null) {
            return;
        }
        if (!aVar.miniAppId.equals(str)) {
            AppBrandLogger.m52829e("HostEventMiniAppService", "error match miniAppId with event ", a, aVar.miniAppId, str);
            return;
        }
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            AbstractC67293a aVar2 = (AbstractC67293a) it.next();
            if (aVar2 != null) {
                aVar2.mo88461a(a, jSONObject);
            }
        }
    }
}
