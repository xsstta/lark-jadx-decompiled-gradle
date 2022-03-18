package com.bytedance.lynx.webview.p843b;

import com.bytedance.lynx.webview.glue.ITTWebViewPluginInvoker;
import com.bytedance.lynx.webview.util.AbstractC20047f;
import com.huawei.hms.actions.SearchIntents;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.bytedance.lynx.webview.b.b */
public class C19926b implements ITTWebViewPluginInvoker {

    /* renamed from: a */
    private static String f48685a = "com.bytedance.webview.chromium.plugin.TTWebPluginInvoker";

    /* renamed from: b */
    private static Map<String, Method> f48686b = AbstractC20047f.m73157a(C19926b.class, "com.bytedance.webview.chromium.plugin.TTWebPluginInvoker");

    /* renamed from: c */
    private Object f48687c;

    public C19926b(Object obj) {
        this.f48687c = obj;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk112.ITTWebViewPluginInvokerSdk112
    public Object query(String str) {
        Method method = f48686b.get(SearchIntents.EXTRA_QUERY);
        Object obj = this.f48687c;
        if (obj == null || method == null) {
            return null;
        }
        try {
            return method.invoke(obj, str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk112.ITTWebViewPluginInvokerSdk112
    public boolean inform(String str, Object obj) {
        Method method = f48686b.get("inform");
        Object obj2 = this.f48687c;
        if (!(obj2 == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj2, str, obj)).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
