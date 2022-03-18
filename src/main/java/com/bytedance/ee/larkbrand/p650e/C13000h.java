package com.bytedance.ee.larkbrand.p650e;

import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.tt.option.p3385f.C67629a;

/* renamed from: com.bytedance.ee.larkbrand.e.h */
public class C13000h extends C67629a {
    @Override // com.tt.option.p3385f.AbstractC67630b, com.tt.option.p3385f.C67629a
    public String getTenantId() {
        return LarkExtensionManager.getInstance().getExtension().mo49569f();
    }

    @Override // com.tt.option.p3385f.AbstractC67630b, com.tt.option.p3385f.C67629a
    public String getUserId() {
        return LarkExtensionManager.getInstance().getExtension().mo49566c();
    }
}
