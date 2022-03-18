package com.bytedance.ee.larkbrand.p650e;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.p648c.C12980b;
import com.bytedance.ee.larkbrand.p648c.View$OnClickListenerC12976a;
import com.tt.frontendapiinterface.IBaseRender;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.component.nativeview.AbstractC65886f;
import com.tt.miniapp.view.webcore.C67231a;
import com.tt.miniapp.view.webcore.C67257d;
import com.tt.option.ext.C67616b;

/* renamed from: com.bytedance.ee.larkbrand.e.d */
public class C12996d extends C67616b {
    @Override // com.tt.option.ext.C67616b, com.tt.option.ext.AbstractC67624i
    public AbstractC65886f getNativeComponentView(String str, int i, int i2, C67231a aVar, C67257d dVar, IBaseRender iBaseRender) {
        if ("coverImage".equals(str)) {
            return new View$OnClickListenerC12976a(aVar, i, i2, iBaseRender);
        }
        if (!"map".equals(str)) {
            return null;
        }
        AppBrandLogger.m52830i("MapView", "-------addcomponentview---", Integer.valueOf(i), Integer.valueOf(i2));
        return new C12980b(aVar, i, i2, (RenderViewManager.IRender) iBaseRender);
    }
}
