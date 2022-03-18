package com.larksuite.component.openplatform.core.plugin.op;

import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import java.util.HashMap;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.m */
public class C25409m extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "getExtConfigSync";
    }

    public C25409m() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        HashMap<String, Object> a = C25408l.m90921a(mo232455f());
        if (a != null) {
            return mo232448a(true, a, (String) null, (Throwable) null);
        }
        return mo232448a(false, (HashMap<String, Object>) null, (String) null, (Throwable) null);
    }

    public C25409m(String str) {
        super(str);
    }
}
