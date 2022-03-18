package com.bytedance.ee.webapp.config;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.bridge.JsCallBack;
import com.bytedance.ee.larkwebview.bridge.Status;
import com.bytedance.lark.webview.container.impl.p837c.AbstractC19871a;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.openapi.jsapi.entity.GetSDKInfoParams;
import java.util.Iterator;

/* renamed from: com.bytedance.ee.webapp.config.g */
public class C13781g extends AbstractC19871a<GetSDKInfoParams> {

    /* renamed from: a */
    private LarkWebView f36019a;

    public C13781g(LarkWebView larkWebView) {
        this.f36019a = larkWebView;
    }

    /* renamed from: a */
    private void m55835a(JSONObject jSONObject, GetSDKInfoParams getSDKInfoParams, JsCallBack gVar) {
        boolean z;
        String url = this.f36019a.getUrl();
        Iterator<Object> it = jSONObject.getJSONArray("domainList").iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Object next = it.next();
            if (next instanceof String) {
                String str = (String) next;
                if (url != null && url.contains(str)) {
                    z = true;
                    break;
                }
            }
        }
        if (TextUtils.equals(getSDKInfoParams.getParam(), "{\"build\":\"cdn\"}")) {
            z = false;
        } else if (TextUtils.equals(getSDKInfoParams.getParam(), "{\"build\":\"npm\"}")) {
            z = true;
        }
        if (z) {
            jSONObject.getJSONArray("apiInfoList").addAll(jSONObject.getJSONArray("urlConditionApiList"));
        }
        jSONObject.remove("domainList");
        jSONObject.remove("urlConditionApiList");
        AppBrandLogger.m52828d("SDKConfigHandler", "jssdk config callback: " + jSONObject.toJSONString());
        gVar.mo49778a(Status.SUCCESS, jSONObject.toJSONString());
    }

    /* renamed from: a */
    public void mo30815a(GetSDKInfoParams getSDKInfoParams, JsCallBack gVar, String str, LarkWebView larkWebView) {
        JSONObject b = C13778e.m55825a().mo50800b();
        if (b == null || b.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) == null) {
            gVar.mo49778a(Status.FAILURE, "config is null");
        } else {
            m55835a((JSONObject) b.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE), getSDKInfoParams, gVar);
        }
    }
}
