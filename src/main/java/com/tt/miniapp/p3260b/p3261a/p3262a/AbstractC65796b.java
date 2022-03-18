package com.tt.miniapp.p3260b.p3261a.p3262a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.refer.p3400a.p3401a.p3402a.C67700a;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;

/* renamed from: com.tt.miniapp.b.a.a.b */
public abstract class AbstractC65796b {

    /* renamed from: a */
    protected IAppContext f165830a;

    /* renamed from: b */
    private AbstractC65804g f165831b;

    /* renamed from: a */
    public abstract AbstractC65803f mo50368a(String str);

    /* renamed from: b */
    public abstract AbstractC65803f mo230479b(String str);

    public AbstractC65796b(IAppContext iAppContext) {
        this.f165830a = iAppContext;
    }

    /* renamed from: a */
    public C67700a mo230478a(C67701b bVar) {
        AbstractC65803f fVar;
        AbstractC65804g gVar;
        String b = bVar.mo234986b();
        if (((AbstractC67724a) this.f165830a.findServiceByInterface(AbstractC67724a.class)).mo50456b("microapp.api.move")) {
            fVar = mo230479b(b);
        } else {
            fVar = null;
        }
        if (fVar == null) {
            fVar = mo50368a(b);
        }
        if (fVar == null && (gVar = this.f165831b) != null) {
            fVar = gVar.mo230502a(b);
        }
        if (fVar != null) {
            return fVar.mo230470b(bVar);
        }
        AppBrandLogger.m52830i("AbsApiInvokeDispatcher", "no new Handler:" + b);
        return C67700a.f170530a;
    }
}
