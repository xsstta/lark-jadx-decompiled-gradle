package com.larksuite.component.openplatform.core.plugin.infra.network;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.ac.C65727a;
import com.tt.miniapphost.entity.C67522b;
import com.tt.option.ext.AbstractC67619e;
import okio.ByteString;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.network.e */
public class C24933e extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "operateSocketTask";
    }

    public C24933e() {
    }

    /* renamed from: b */
    private void m90170b() {
        boolean z;
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            z = C65727a.m257684a(getAppContext()).mo230333a(jSONObject.optInt("socketTaskId"), jSONObject.optInt("code"), jSONObject.optString("reason"));
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "ApiOperateSocketTask", e.getStackTrace());
            z = false;
        }
        callbackDefaultMsg(z);
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            String optString = new JSONObject(this.mArgs).optString("operationType");
            if (TextUtils.equals(optString, "send")) {
                m90169a();
            } else if (TextUtils.equals("close", optString)) {
                m90170b();
            } else {
                callbackIllegalParam("operationType");
            }
        } catch (Exception e) {
            callbackDefaultMsg(false);
            AppBrandLogger.stacktrace(6, "ApiOperateSocketTask", e.getStackTrace());
        }
    }

    /* renamed from: a */
    private void m90169a() {
        boolean z;
        try {
            C67522b bVar = new C67522b();
            JSONObject jSONObject = new JSONObject(this.mArgs);
            int optInt = jSONObject.optInt("socketTaskId");
            boolean has = jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            boolean has2 = jSONObject.has("__nativeBuffers__");
            if (has) {
                z = C65727a.m257684a(getAppContext()).mo230335a(optInt, jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE), bVar);
            } else if (has2) {
                z = C65727a.m257684a(getAppContext()).mo230336a(optInt, m90168a(jSONObject.optJSONArray("__nativeBuffers__")), bVar);
            } else {
                bVar.mo234467a(paramIllegalMsg(Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
                z = false;
            }
            if (z) {
                callbackDefaultMsg(true);
            } else {
                doCallbackByApiHandler(makeMsgByResult(false, null, bVar.mo234468a(), bVar.mo234470b()).toString());
            }
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "ApiOperateSocketTask", e.getStackTrace());
            callbackFail(e);
        }
    }

    /* renamed from: a */
    private ByteString m90168a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (TextUtils.equals(jSONObject.getString("key"), Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                    return ByteString.decodeBase64(jSONObject.optString("base64"));
                }
            }
            return null;
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "ApiOperateSocketTask", e.getStackTrace());
            return null;
        }
    }

    public C24933e(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
