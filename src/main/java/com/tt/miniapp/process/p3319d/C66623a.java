package com.tt.miniapp.process.p3319d;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.tt.miniapp.process.p3318c.C66621a;
import com.tt.miniapp.process.p3321f.C66627a;
import com.tt.miniapp.process.p3322g.AbstractC66642a;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.process.data.C67575a;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.miniapphost.process.p3376b.C67566c;
import com.tt.miniapphost.process.p3377c.AbstractC67569a;
import com.tt.miniapphost.process.p3379e.C67577a;
import com.tt.refer.common.util.C67866g;

/* renamed from: com.tt.miniapp.process.d.a */
public class C66623a implements AbstractC67569a {

    /* renamed from: a */
    private AbstractC66642a f168201a;

    @Override // com.tt.miniapphost.process.p3377c.AbstractC67569a
    /* renamed from: a */
    public void mo232260a(AbstractC66642a aVar) {
        this.f168201a = aVar;
    }

    @Override // com.tt.miniapphost.process.p3377c.AbstractC67569a
    /* renamed from: b */
    public CrossProcessDataEntity mo232264b(CrossProcessCallEntity crossProcessCallEntity) {
        try {
            if (TextUtils.equals(crossProcessCallEntity.mo234726b(), "hostProcess")) {
                return C66627a.m260276a(crossProcessCallEntity);
            }
            return null;
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("ProcessCallControl", crossProcessCallEntity.toString(), e);
            return null;
        }
    }

    @Override // com.tt.miniapphost.process.p3377c.AbstractC67569a
    /* renamed from: a */
    public CrossProcessDataEntity mo232259a(CrossProcessCallEntity crossProcessCallEntity) {
        String b = crossProcessCallEntity.mo234726b();
        try {
            if (!TextUtils.equals(b, "hostProcess")) {
                return null;
            }
            if (TextUtils.equals(b, crossProcessCallEntity.mo234725a())) {
                return mo232264b(crossProcessCallEntity);
            }
            return C66621a.m260262a(crossProcessCallEntity, this.f168201a);
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("ProcessCallControl", crossProcessCallEntity.toString(), e);
            return null;
        }
    }

    @Override // com.tt.miniapphost.process.p3377c.AbstractC67569a
    /* renamed from: a */
    public void mo232262a(final CrossProcessCallEntity crossProcessCallEntity, final AbstractC67565b bVar) {
        C67866g.m264026a(new Action() {
            /* class com.tt.miniapp.process.p3319d.C66623a.C666241 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                String b = crossProcessCallEntity.mo234726b();
                try {
                    if (!TextUtils.equals(b, "hostProcess")) {
                        C66621a.m260264b(crossProcessCallEntity, bVar);
                    } else if (TextUtils.equals(b, crossProcessCallEntity.mo234725a())) {
                        int i = 0;
                        AbstractC67565b bVar = bVar;
                        if (bVar != null) {
                            bVar.mo234708a(crossProcessCallEntity.mo234726b());
                            C67566c.m262973a().mo232256a(bVar);
                            i = bVar.mo234709b();
                        }
                        C66623a.this.mo232261a(crossProcessCallEntity, i);
                    } else {
                        C66621a.m260263a(crossProcessCallEntity, bVar);
                    }
                } catch (Exception e) {
                    AppBrandLogger.eWithThrowable("ProcessCallControl", crossProcessCallEntity.toString(), e);
                }
            }
        }, C67554l.m262725b(), false);
    }

    @Override // com.tt.miniapphost.process.p3377c.AbstractC67569a
    /* renamed from: a */
    public void mo232261a(CrossProcessCallEntity crossProcessCallEntity, int i) {
        String b = crossProcessCallEntity.mo234726b();
        try {
            C67575a.C67576a aVar = new C67575a.C67576a(crossProcessCallEntity.mo234725a(), i);
            if (TextUtils.equals(b, "hostProcess")) {
                C66627a.m260277a(crossProcessCallEntity, new C67577a(aVar));
            } else {
                C66627a.m260278b(crossProcessCallEntity, new C67577a(aVar));
            }
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("ProcessCallControl", crossProcessCallEntity.toString(), e);
        }
    }

    @Override // com.tt.miniapphost.process.p3377c.AbstractC67569a
    /* renamed from: a */
    public void mo232263a(C67575a.C67576a aVar, CrossProcessDataEntity crossProcessDataEntity, boolean z) {
        CrossProcessCallEntity crossProcessCallEntity;
        String a = aVar.mo234764a();
        CrossProcessDataEntity b = CrossProcessDataEntity.C67574a.m263013a().mo234760a("callbackId", (Object) Integer.valueOf(aVar.mo234765b())).mo234760a("finishCallBack", (Object) Boolean.valueOf(z)).mo234763b();
        if (TextUtils.equals(a, "hostProcess")) {
            crossProcessCallEntity = new CrossProcessCallEntity(a, "hostProcess_callback", crossProcessDataEntity, b);
        } else {
            crossProcessCallEntity = new CrossProcessCallEntity(a, "miniAppProcess_callback", crossProcessDataEntity, b);
        }
        mo232262a(crossProcessCallEntity, (AbstractC67565b) null);
    }
}
