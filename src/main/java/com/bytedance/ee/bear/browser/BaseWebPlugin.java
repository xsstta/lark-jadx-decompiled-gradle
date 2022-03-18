package com.bytedance.ee.bear.browser;

import android.webkit.ValueCallback;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.jsbridge.AbstractC7943b;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7948j;
import com.bytedance.ee.util.io.NonProguard;
import java.util.ArrayList;
import java.util.List;

public class BaseWebPlugin<T extends C4933k> extends BasePlugin<T> {
    private List<String> autoUnbinds;

    public AbstractC4931i getWeb() {
        return ((C4933k) getHost()).mo19448b();
    }

    public void execJS(String str) {
        execJS(str, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    public void loadUrl(String str) {
        AbstractC4931i web = getWeb();
        if (web != null) {
            web.mo19427a(str);
        }
    }

    /* access modifiers changed from: protected */
    public void unbindBridgeHandler(String str) {
        AbstractC4931i web = getWeb();
        if (web != null) {
            web.mo19441c(str);
        }
    }

    /* access modifiers changed from: protected */
    public void bindBridgeHandler(String str, AbstractC7943b bVar) {
        innerbindJSHandler(str, bVar, false);
    }

    /* access modifiers changed from: protected */
    public void bindBridgeHandlerAutoUnbind(String str, AbstractC7943b bVar) {
        innerbindJSHandler(str, bVar, true);
    }

    /* access modifiers changed from: protected */
    public void bindJSHandler(String str, AbstractC7948j jVar) {
        innerbindJSHandler(str, jVar, false);
    }

    /* access modifiers changed from: protected */
    public void bindJSHandlerAutoUnbind(String str, AbstractC7948j jVar) {
        innerbindJSHandler(str, jVar, true);
    }

    /* access modifiers changed from: protected */
    public void bindBridgeHandler(String str, AbstractC7945d dVar) {
        innerbindJSHandler(str, dVar, false);
    }

    /* access modifiers changed from: protected */
    public void bindBridgeHandlerAutoUnbind(String str, AbstractC7945d dVar) {
        innerbindJSHandler(str, dVar, true);
    }

    public void execJS(String str, JSONObject jSONObject) {
        execJS(str, jSONObject, (ValueCallback<String>) null);
    }

    public void onDetachFromUIContainer(T t, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4943e) t, nVar);
        List<String> list = this.autoUnbinds;
        if (list != null) {
            for (String str : list) {
                unbindBridgeHandler(str);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void execJS(String str, NonProguard nonProguard) {
        execJS(str, nonProguard, (ValueCallback<String>) null);
    }

    public void execJS(String str, JSONObject jSONObject, ValueCallback<String> valueCallback) {
        AbstractC4931i web = getWeb();
        if (web != null) {
            web.mo19429a(str, jSONObject, valueCallback);
        }
    }

    private void innerbindJSHandler(String str, Object obj, boolean z) {
        AbstractC4931i web = getWeb();
        if (web != null) {
            if (obj instanceof AbstractC7945d) {
                web.mo19431a(str, (AbstractC7945d) obj);
            } else if (obj instanceof AbstractC7943b) {
                web.mo19430a(str, (AbstractC7943b) obj);
            } else if (obj instanceof AbstractC7948j) {
                web.mo19432a(str, (AbstractC7948j) obj);
            }
        }
        if (z) {
            if (this.autoUnbinds == null) {
                this.autoUnbinds = new ArrayList();
            }
            if (!this.autoUnbinds.contains(str)) {
                this.autoUnbinds.add(str);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void execJS(String str, NonProguard nonProguard, ValueCallback<String> valueCallback) {
        AbstractC4931i web = getWeb();
        if (web != null) {
            web.mo19434a(str, nonProguard, valueCallback);
        }
    }
}
