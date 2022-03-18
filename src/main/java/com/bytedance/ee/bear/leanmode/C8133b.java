package com.bytedance.ee.bear.leanmode;

import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.contract.leanmode.CCMConfig;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.leanmode.b */
public class C8133b implements AbstractC5197b {
    @Override // com.bytedance.ee.bear.contract.leanmode.AbstractC5197b
    /* renamed from: b */
    public CCMConfig mo20801b() {
        CCMConfig b = C8132a.m32450a().mo31331b();
        if (b != null) {
            return b;
        }
        C13479a.m54764b("LeanModeManager", "getCCMConfig()... liveData is empty");
        return new CCMConfig();
    }

    @Override // com.bytedance.ee.bear.contract.leanmode.AbstractC5197b
    /* renamed from: a */
    public void mo20800a() {
        C10917c cVar = new C10917c(new C10929e());
        cVar.mo41508c(ak.class).mo238020d(new Function(cVar) {
            /* class com.bytedance.ee.bear.leanmode.$$Lambda$b$SHGa0MYZZ9JsWSen2JogstIWz8Q */
            public final /* synthetic */ C10917c f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8133b.this.m32466a(this.f$1, (ak) obj);
            }
        }).mo238001b($$Lambda$b$d7ISvIG7s3TCSmusjPVlI2ji4eY.INSTANCE, $$Lambda$b$iM3YkAk_3vAuhvijN9GyT47IByg.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ String m32466a(C10917c cVar, ak akVar) throws Exception {
        akVar.addProcessStartCallback(new LeanModeManager$1(this, cVar));
        return "";
    }
}
