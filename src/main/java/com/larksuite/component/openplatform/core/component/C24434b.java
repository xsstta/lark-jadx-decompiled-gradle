package com.larksuite.component.openplatform.core.component;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.api.p1100a.p1101a.AbstractC24363a;
import com.larksuite.component.openplatform.api.p1100a.p1102b.AbstractC24364a;
import com.larksuite.component.openplatform.core.block.C24417g;

/* renamed from: com.larksuite.component.openplatform.core.component.b */
public class C24434b extends AbstractC24428a {
    @Override // com.larksuite.component.openplatform.core.component.AbstractC24428a
    /* renamed from: h */
    public AbstractC24364a mo87219h() {
        if (mo87218g() instanceof AbstractC24364a) {
            return (AbstractC24364a) mo87218g();
        }
        return null;
    }

    @Override // com.larksuite.component.openplatform.core.component.AbstractC24428a, com.larksuite.component.openplatform.api.p1100a.AbstractC24362a
    /* renamed from: a */
    public void mo87116a(String str) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("OP_SDK_OPBlockitComponentImpl", "update data error : no data");
        } else if (mo87218g() == null) {
            AppBrandLogger.m52829e("OP_SDK_OPBlockitComponentImpl", "update data error : no render");
        } else {
            mo87218g().mo87119a(str);
        }
    }

    @Override // com.larksuite.component.openplatform.core.component.AbstractC24428a, com.larksuite.component.openplatform.api.p1100a.AbstractC24362a
    /* renamed from: a */
    public void mo87115a(AbstractC24363a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        new C24417g("op_block_load_package_start", this.f60284b).flush();
        this.f60284b.putExtra("LOAD_APP_FILE_START", Long.valueOf(System.currentTimeMillis()));
        super.mo87115a(aVar);
        new C24417g("op_block_load_package_result", this.f60284b).setDuration(System.currentTimeMillis() - currentTimeMillis).flush();
        new C24417g("mp_webview_load_start", this.f60284b).flush();
        new C24417g("mp_jscore_load_start", this.f60284b).flush();
    }

    public C24434b(C24436d dVar, IAppContext iAppContext) {
        super(dVar, iAppContext);
    }
}
