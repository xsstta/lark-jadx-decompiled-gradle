package com.facebook.react;

import android.util.Log;
import com.facebook.react.bridge.BridgeUtil;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.facebook.react.n */
public class C21263n {
    /* renamed from: a */
    public static CatalystInstance m77062a(AbstractC21145j jVar) {
        C21130g h = jVar.mo71858h();
        if (h == null) {
            Log.e("ScriptLoadUtil", "manager is null!!");
            return null;
        }
        ReactContext i = h.mo71832i();
        if (i != null) {
            return i.getCatalystInstance();
        }
        Log.e("ScriptLoadUtil", "context is null!!");
        return null;
    }

    /* renamed from: a */
    public static void m77063a(String str, CatalystInstance catalystInstance, String str2, boolean z) {
        BridgeUtil.loadScriptFromFile(str, catalystInstance, str2, z);
    }
}
