package com.larksuite.component.openplatform.core.plugin.passport;

import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25913h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import org.json.JSONException;
import org.json.JSONObject;

public class ApiStartPasswordVerifyPlugin extends OPPlugin {
    private AbstractC25897h<ApiStartPasswordVerifyResponse> mInvokeCallback;
    private ILogger mLogger;

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    private static class ApiStartPasswordVerifyRequest extends C25920a {
        private ApiStartPasswordVerifyRequest() {
        }
    }

    private static class ApiStartPasswordVerifyResponse extends C25921b {
        @JSONField(name = "token")
        public String token;

        private ApiStartPasswordVerifyResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        ILogger aVar = this.mLogger;
        if (aVar != null) {
            aVar.mo92224i("ApiStartPasswordVerifyPlugin", "handleActivityResult, reqCode" + i + " resultCode" + i2);
        }
        ApiStartPasswordVerifyResponse apiStartPasswordVerifyResponse = new ApiStartPasswordVerifyResponse();
        if (i == 30004) {
            if (intent == null) {
                fillFailedResponse(apiStartPasswordVerifyResponse, C25906a.f64080j, "intent is null");
                AbstractC25897h<ApiStartPasswordVerifyResponse> hVar = this.mInvokeCallback;
                if (hVar != null) {
                    hVar.callback(apiStartPasswordVerifyResponse);
                }
                ILogger aVar2 = this.mLogger;
                if (aVar2 != null) {
                    aVar2.mo92223e("ApiStartPasswordVerifyPlugin", "intent is null");
                }
                return true;
            } else if (i2 == -1) {
                String stringExtra = intent.getStringExtra("password_verify_data");
                if (TextUtils.isEmpty(stringExtra)) {
                    fillFailedResponse(apiStartPasswordVerifyResponse, C25906a.f64080j, "data extra is null");
                    AbstractC25897h<ApiStartPasswordVerifyResponse> hVar2 = this.mInvokeCallback;
                    if (hVar2 != null) {
                        hVar2.callback(apiStartPasswordVerifyResponse);
                    }
                    ILogger aVar3 = this.mLogger;
                    if (aVar3 != null) {
                        aVar3.mo92223e("ApiStartPasswordVerifyPlugin", "data extra is null");
                    }
                    return true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject(stringExtra);
                    int optInt = jSONObject2.optInt("errorCode");
                    String optString = jSONObject2.optString("token");
                    jSONObject.put("token", optString);
                    if (optInt != 0 || TextUtils.isEmpty(optString)) {
                        if (optInt == 1) {
                            fillFailedResponse(apiStartPasswordVerifyResponse, C25913h.f64171a, jSONObject2.optString("errorMessage"));
                        } else if (optInt == 2) {
                            fillFailedResponse(apiStartPasswordVerifyResponse, C25913h.f64172b, jSONObject2.optString("errorMessage"));
                        } else if (optInt != 3) {
                            fillFailedResponse(apiStartPasswordVerifyResponse, C25906a.f64080j, jSONObject2.optString("errorMessage"));
                        } else {
                            fillFailedResponse(apiStartPasswordVerifyResponse, C25913h.f64173c, jSONObject2.optString("errorMessage"));
                        }
                        AbstractC25897h<ApiStartPasswordVerifyResponse> hVar3 = this.mInvokeCallback;
                        if (hVar3 != null) {
                            hVar3.callback(apiStartPasswordVerifyResponse);
                        }
                        return true;
                    }
                    apiStartPasswordVerifyResponse.token = optString;
                    AbstractC25897h<ApiStartPasswordVerifyResponse> hVar4 = this.mInvokeCallback;
                    if (hVar4 != null) {
                        hVar4.callback(apiStartPasswordVerifyResponse);
                    }
                    return true;
                } catch (JSONException e) {
                    ILogger aVar4 = this.mLogger;
                    if (aVar4 != null) {
                        aVar4.mo92223e("ApiStartPasswordVerifyPlugin", e);
                    }
                    fillFailedResponse(apiStartPasswordVerifyResponse, C25906a.f64080j, e.getMessage());
                    AbstractC25897h<ApiStartPasswordVerifyResponse> hVar5 = this.mInvokeCallback;
                    if (hVar5 != null) {
                        hVar5.callback(apiStartPasswordVerifyResponse);
                    }
                }
            }
        }
        return false;
    }

    @LKPluginFunction(async = true, eventName = {"startPasswordVerify"})
    public void startPasswordVerifyAsync(LKEvent lKEvent, ApiStartPasswordVerifyRequest apiStartPasswordVerifyRequest, AbstractC25905b bVar, AbstractC25897h<ApiStartPasswordVerifyResponse> hVar) {
        ApiStartPasswordVerifyResponse apiStartPasswordVerifyResponse = new ApiStartPasswordVerifyResponse();
        this.mInvokeCallback = hVar;
        ILogger b = lKEvent.mo92134c().mo92190b();
        this.mLogger = b;
        if (b != null) {
            b.mo92224i("ApiStartPasswordVerifyPlugin", "invoke api");
        }
        if (getApiDependency().mo235051f() == null) {
            ILogger aVar = this.mLogger;
            if (aVar != null) {
                aVar.mo92224i("ApiStartPasswordVerifyPlugin", "activity is null");
            }
            fillFailedResponse(apiStartPasswordVerifyResponse, C25906a.f64080j, "activity is null");
            this.mInvokeCallback.callback(apiStartPasswordVerifyResponse);
        } else if (!((AbstractC67724a) getAppContext().findServiceByInterface(AbstractC67724a.class)).mo50455b(getAppContext())) {
            ILogger aVar2 = this.mLogger;
            if (aVar2 != null) {
                aVar2.mo92223e("ApiStartPasswordVerifyPlugin", " start activity fail ");
            }
            fillFailedResponse(apiStartPasswordVerifyResponse, C25906a.f64080j, "start activity fail");
            this.mInvokeCallback.callback(apiStartPasswordVerifyResponse);
        }
    }
}
