package com.bytedance.ee.falcon.openplugin.p606b;

import com.bytedance.ee.falcon.openplugin.entity.FalconApiCallResult;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.ss.android.lark.log.Log;

/* renamed from: com.bytedance.ee.falcon.openplugin.b.b */
public class C12711b {

    /* renamed from: a */
    public static String f34032a = "";

    /* renamed from: a */
    public static String m52620a(LKBasePluginResult lKBasePluginResult, String str) {
        int c = lKBasePluginResult.mo92267c();
        if (c != Integer.MIN_VALUE || lKBasePluginResult.toString().contains("fail")) {
            Log.m165379d("OPInvokePluginUtils", "convertPluginResult:" + lKBasePluginResult.toString());
            return FalconApiCallResult.C12713a.m52626b(str).mo48141a(lKBasePluginResult.mo92270e()).mo48140a(c).mo48142a().toString();
        } else if (lKBasePluginResult.mo92270e() != null) {
            return FalconApiCallResult.C12713a.m52623a(str).mo48141a(lKBasePluginResult.mo92270e()).mo48142a().toString();
        } else {
            return f34032a;
        }
    }
}
