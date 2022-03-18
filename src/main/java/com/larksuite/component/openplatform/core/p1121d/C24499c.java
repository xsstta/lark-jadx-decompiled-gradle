package com.larksuite.component.openplatform.core.p1121d;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.api.p1100a.p1101a.AbstractC24363a;
import com.larksuite.component.openplatform.api.p1100a.p1102b.AbstractC24364a;
import com.larksuite.component.openplatform.api.p1105d.AbstractC24375d;
import com.larksuite.component.openplatform.core.component.render.C24438a;
import com.larksuite.component.openplatform.core.component.render.C24441b;
import com.larksuite.component.openplatform.core.component.worker.C24451a;
import com.larksuite.component.openplatform.core.component.worker.C24453b;
import com.larksuite.component.openplatform.core.component.worker.p1117b.C24454a;

/* renamed from: com.larksuite.component.openplatform.core.d.c */
public class C24499c implements AbstractC24375d {
    @Override // com.larksuite.component.openplatform.api.p1105d.AbstractC24375d
    /* renamed from: a */
    public AbstractC24363a mo87141a(IAppContext iAppContext, Bundle bundle) {
        String string = bundle.getString("renderType");
        if (TextUtils.equals(string, "card")) {
            return new C24441b(iAppContext.getApplicationContext(), iAppContext);
        }
        if (TextUtils.equals(string, "blockit")) {
            return new C24438a(iAppContext.getApplicationContext(), iAppContext);
        }
        return null;
    }

    @Override // com.larksuite.component.openplatform.api.p1105d.AbstractC24375d
    /* renamed from: b */
    public AbstractC24364a mo87142b(IAppContext iAppContext, Bundle bundle) {
        String string = bundle.getString("workerType");
        if (TextUtils.equals(string, "card")) {
            return new C24453b(iAppContext.getApplicationContext(), iAppContext);
        }
        if (TextUtils.equals(string, "blockit")) {
            return new C24451a(iAppContext.getApplicationContext(), iAppContext);
        }
        if (TextUtils.equals(string, "gadget")) {
            return new C24454a(iAppContext.getCurrentActivity(), iAppContext);
        }
        return null;
    }
}
