package com.bytedance.ee.ref.gadget.p694a;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.passport.C25455d;
import com.tt.miniapp.business.api.base.CommonApiInvokeDispatcher;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65803f;
import com.tt.refer.common.base.AppType;

/* renamed from: com.bytedance.ee.ref.gadget.a.a */
public class C13570a extends CommonApiInvokeDispatcher {
    public C13570a(IAppContext iAppContext) {
        super(iAppContext, AppType.GadgetAPP);
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65796b, com.tt.miniapp.business.api.base.CommonApiInvokeDispatcher
    /* renamed from: a */
    public AbstractC65803f mo50368a(String str) {
        AbstractC65803f a = super.mo50368a(str);
        if (a != null) {
            return a;
        }
        str.hashCode();
        if (!str.equals("getEnvVariable")) {
            return null;
        }
        return new C25455d(str, this.f165830a);
    }
}
