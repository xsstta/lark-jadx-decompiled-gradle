package com.larksuite.component.openplatform.core.plugin;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25913h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.component.nativeview.C65887g;
import com.tt.miniapphost.data.C67485a;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import org.json.JSONException;

public class OPTransferMessagePlugin extends OPPlugin {

    public static class Request extends C25920a {
        @JSONField(name = "channel")
        public String mChannel;
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        @LKRequiredParam
        public JSONObject mData;
        @JSONField(name = "from")
        @LKRequiredParam
        public String mFrom;
    }

    /* renamed from: com.larksuite.component.openplatform.core.plugin.OPTransferMessagePlugin$a */
    private enum EnumC24576a {
        WORKER("worker"),
        WEBVIEW("webview");
        
        public String mFrom;

        private EnumC24576a(String str) {
            this.mFrom = str;
        }
    }

    @LKPluginFunction(async = true, eventName = {"transferMessage"})
    public void transferMessageAsync(Request request, AbstractC25897h<C25921b> hVar, ILogger aVar) {
        C25921b bVar = new C25921b();
        if (EnumC24576a.WORKER.mFrom.equals(request.mFrom)) {
            View a = C67485a.m262488a(getAppContext()).mo234278H().mo87229a(request.mChannel);
            if (a == null) {
                aVar.mo92224i("OPTransferMessagePlugin", request.mChannel + " not found");
                C25913h hVar2 = C25913h.f64152E;
                fillFailedResponse(bVar, hVar2, request.mChannel + " channel not found");
                hVar.callback(bVar);
                return;
            } else if (a instanceof C65887g) {
                C65887g gVar = (C65887g) a;
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("channel", request.mChannel);
                    jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, new org.json.JSONObject(request.mData.toJSONString()));
                    gVar.getBridge().mo50162a(C67706e.C67708a.m263377a("onTransferMessage", jSONObject).mo235009a());
                } catch (JSONException e) {
                    aVar.mo92223e("OPTransferMessagePlugin", "JSONException", e);
                    fillFailedResponse(bVar, C25906a.f64080j, e.getMessage());
                }
            } else {
                aVar.mo92224i("OPTransferMessagePlugin", "channel:" + request.mChannel + " not implement component");
                C25913h hVar3 = C25913h.f64153F;
                fillFailedResponse(bVar, hVar3, "channel:" + request.mChannel + " not implement component");
            }
        } else if (EnumC24576a.WEBVIEW.mFrom.equals(request.mFrom)) {
            try {
                getApiDependency().mo235028a(C67706e.C67708a.m263377a("onTransferMessage", new org.json.JSONObject(request.mData.toJSONString())).mo235009a());
            } catch (JSONException e2) {
                aVar.mo92223e("OPTransferMessagePlugin", "JSONException", e2);
                fillFailedResponse(bVar, C25906a.f64080j, e2.getMessage());
            }
        } else {
            fillFailedResponse(bVar, C25906a.f64072b, "from is undefine");
            aVar.mo92223e("OPTransferMessagePlugin", "from is undefine:" + request.mFrom);
        }
        hVar.callback(bVar);
    }
}
