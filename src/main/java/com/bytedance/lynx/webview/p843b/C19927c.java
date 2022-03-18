package com.bytedance.lynx.webview.p843b;

import com.bytedance.lynx.webview.glue.TTWebViewSettings;
import com.bytedance.lynx.webview.glue.TextSelectedEventListener;
import com.bytedance.lynx.webview.util.AbstractC20047f;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.bytedance.lynx.webview.b.c */
public class C19927c extends TTWebViewSettings {

    /* renamed from: a */
    private static Map<String, Method> f48688a = AbstractC20047f.m73157a(TTWebViewSettings.class, "com.bytedance.webview.chromium.glue.TTWebViewSettings");

    /* renamed from: b */
    private Object f48689b;

    @Override // com.bytedance.lynx.webview.glue.sdk112.ITTWebViewSettingssdk112
    public void clearAllActionModeMenuItems() {
        Method method = f48688a.get("clearAllActionModeMenuItems");
        Object obj = this.f48689b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public C19927c(Object obj) {
        this.f48689b = obj;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ITTWebViewSettingssdk113
    public void setAcceptCookie(boolean z) {
        Method method = f48688a.get("setAcceptCookie");
        Object obj = this.f48689b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.ITTWebViewSettingssdk111
    public void setDisabledActionModeMenuItems(int i) {
        Method method = f48688a.get("setDisabledActionModeMenuItems");
        Object obj = this.f48689b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, Integer.valueOf(i));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk112.ITTWebViewSettingssdk112
    public void setIsNeedShowActionMode(boolean z) {
        Method method = f48688a.get("setIsNeedShowActionMode");
        Object obj = this.f48689b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.ITTWebViewSettingssdk111
    public void addActionModeMenuItem(String str, TextSelectedEventListener textSelectedEventListener) {
        addActionModeMenuItem(str, textSelectedEventListener, -1);
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.ITTWebViewSettingssdk111
    public void addActionModeMenuItem(String str, TextSelectedEventListener textSelectedEventListener, int i) {
        addActionModeMenuItem(str, (Object) textSelectedEventListener, i);
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.ITTWebViewSettingssdk111
    public void addActionModeMenuItem(String str, Object obj, int i) {
        Method method = f48688a.get("addActionModeMenuItem");
        Object obj2 = this.f48689b;
        if (obj2 != null && method != null) {
            try {
                method.invoke(obj2, str, obj, Integer.valueOf(i));
            } catch (Exception unused) {
            }
        }
    }
}
