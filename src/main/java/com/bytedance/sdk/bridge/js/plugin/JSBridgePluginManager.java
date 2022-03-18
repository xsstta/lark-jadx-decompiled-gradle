package com.bytedance.sdk.bridge.js.plugin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/bytedance/sdk/bridge/js/plugin/JSBridgePluginManager;", "", "()V", "jsWebViewClientPlugins", "", "Lcom/bytedance/sdk/bridge/js/plugin/WebViewClientPlugin;", "getJsWebViewClientPlugins", "()Ljava/util/List;", "setJsWebViewClientPlugins", "(Ljava/util/List;)V", "pluginEnable", "", "getPluginEnable", "()Z", "setPluginEnable", "(Z)V", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.js.b.b */
public final class JSBridgePluginManager {

    /* renamed from: a */
    public static final JSBridgePluginManager f50482a = new JSBridgePluginManager();

    /* renamed from: b */
    private static boolean f50483b;

    /* renamed from: c */
    private static List<WebViewClientPlugin> f50484c = new ArrayList();

    private JSBridgePluginManager() {
    }

    /* renamed from: a */
    public final boolean mo69624a() {
        return f50483b;
    }

    /* renamed from: b */
    public final List<WebViewClientPlugin> mo69625b() {
        return f50484c;
    }
}
