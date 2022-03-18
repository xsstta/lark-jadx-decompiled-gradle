package com.bytedance.ee.larkwebview.base;

import android.content.Context;
import com.larksuite.framework.apiplugin.core.AbstractC25922a;

/* renamed from: com.bytedance.ee.larkwebview.base.e */
public class C13406e extends AbstractC25922a {

    /* renamed from: a */
    private Context f35338a;

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b, com.larksuite.framework.apiplugin.core.AbstractC25922a
    public void ah_() {
        this.f35338a = null;
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b
    /* renamed from: b */
    public Context mo49749b() {
        return this.f35338a;
    }

    public C13406e(Context context) {
        this.f35338a = context;
    }
}
