package com.tt.miniapp.component.nativeview.p3270b;

import com.bytedance.lynx.webview.glue.TTWebViewPlugin;
import com.bytedance.lynx.webview.glue.TTWebViewPluginFactory;
import com.tt.miniapp.view.webcore.C67231a;

/* renamed from: com.tt.miniapp.component.nativeview.b.b */
public class C65852b implements TTWebViewPluginFactory {

    /* renamed from: a */
    private C67231a f166001a;

    @Override // com.bytedance.lynx.webview.glue.TTWebViewPluginFactory
    public String name() {
        return "mixrender";
    }

    public C65852b(C67231a aVar) {
        this.f166001a = aVar;
    }

    @Override // com.bytedance.lynx.webview.glue.TTWebViewPluginFactory
    public TTWebViewPlugin create(Object obj) {
        C65851a aVar = new C65851a(obj);
        aVar.mo230609a(this.f166001a);
        return aVar;
    }
}
