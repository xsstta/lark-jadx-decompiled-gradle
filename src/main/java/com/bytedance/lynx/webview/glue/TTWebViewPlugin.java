package com.bytedance.lynx.webview.glue;

import android.os.Bundle;
import com.bytedance.lynx.webview.p843b.C19926b;

public abstract class TTWebViewPlugin {

    /* renamed from: a */
    private C19926b f48714a;

    public abstract boolean execute(String str, Bundle bundle);

    public abstract Object get(String str);

    public TTWebViewPlugin(Object obj) {
        this.f48714a = new C19926b(obj);
    }

    public Object query(String str) {
        C19926b bVar = this.f48714a;
        if (bVar != null) {
            return bVar.query(str);
        }
        return null;
    }

    public boolean inform(String str, Object obj) {
        C19926b bVar = this.f48714a;
        if (bVar != null) {
            return bVar.inform(str, obj);
        }
        return false;
    }
}
