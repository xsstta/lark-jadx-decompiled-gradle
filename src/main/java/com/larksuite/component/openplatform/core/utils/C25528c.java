package com.larksuite.component.openplatform.core.utils;

import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.ss.android.lark.log.Log;
import com.tt.frontendapiinterface.ApiCallResult;

/* renamed from: com.larksuite.component.openplatform.core.utils.c */
public class C25528c {
    /* renamed from: a */
    public static String m91124a(LKBasePluginResult lKBasePluginResult, String str) {
        int c = lKBasePluginResult.mo92267c();
        if (c != Integer.MIN_VALUE || lKBasePluginResult.toString().contains("fail")) {
            Log.m165379d("OPInvokePluginUtils", "convertPluginResult:" + lKBasePluginResult.toString());
            return ApiCallResult.Builder.createFail(str).responseData(lKBasePluginResult.mo92270e()).errorCode(c).build().toString();
        } else if (lKBasePluginResult.mo92270e() != null) {
            return ApiCallResult.Builder.createOk(str).responseData(lKBasePluginResult.mo92270e()).build().toString();
        } else {
            return CharacterUtils.empty();
        }
    }
}
