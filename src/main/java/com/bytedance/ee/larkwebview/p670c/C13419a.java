package com.bytedance.ee.larkwebview.p670c;

import com.bytedance.lynx.webview.glue.TTWebViewPlugin;
import com.bytedance.lynx.webview.glue.TTWebViewPluginFactory;
import com.ss.android.lark.log.Log;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.larkwebview.c.a */
public class C13419a implements TTWebViewPluginFactory {

    /* renamed from: a */
    private ConcurrentHashMap<String, C13421c> f35373a = new ConcurrentHashMap<>();

    @Override // com.bytedance.lynx.webview.glue.TTWebViewPluginFactory
    public String name() {
        return "mixrender";
    }

    /* renamed from: a */
    public C13421c mo49804a(String str) {
        return this.f35373a.get(str);
    }

    @Override // com.bytedance.lynx.webview.glue.TTWebViewPluginFactory
    public TTWebViewPlugin create(Object obj) {
        C13421c cVar = new C13421c(obj);
        if (cVar.mo49808b() != null) {
            this.f35373a.put(cVar.mo49808b(), cVar);
        } else {
            Log.m165389i("PlatformPluginFactory", "create TTWebViewPlugin error, viewid is null");
        }
        return cVar;
    }
}
