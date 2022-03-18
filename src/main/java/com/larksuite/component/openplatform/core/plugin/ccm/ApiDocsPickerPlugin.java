package com.larksuite.component.openplatform.core.plugin.ccm;

import android.app.Activity;
import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.suite.R;
import com.ss.android.lark.optrace.api.ILogger;

public class ApiDocsPickerPlugin extends OPPlugin {
    private AbstractC25897h<ApiDocsPickerResponse> mInvokeCallback;
    private ILogger mLogger;

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    private static class ApiDocsPickerRequest extends C25920a {
        @JSONField(name = "maxNum")
        public int maxNum;
        @JSONField(name = "pickerConfirm")
        public String pickerConfirm;
        @JSONField(name = "pickerTitle")
        public String pickerTitle;

        private ApiDocsPickerRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApiDocsPickerResponse extends C25921b {
        @JSONField(name = "fileList")
        public JSONArray fileList;

        private ApiDocsPickerResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private void callbackOk(JSONArray jSONArray) {
        if (this.mInvokeCallback != null) {
            ApiDocsPickerResponse apiDocsPickerResponse = new ApiDocsPickerResponse();
            if (jSONArray != null) {
                apiDocsPickerResponse.fileList = jSONArray;
            }
            this.mInvokeCallback.callback(apiDocsPickerResponse);
        }
    }

    @LKPluginFunction(async = true, eventName = {"docsPicker"})
    public void docsPickerAsync(LKEvent lKEvent, ApiDocsPickerRequest apiDocsPickerRequest, AbstractC25897h<ApiDocsPickerResponse> hVar) {
        int i;
        ApiDocsPickerResponse apiDocsPickerResponse = new ApiDocsPickerResponse();
        this.mInvokeCallback = hVar;
        ILogger b = lKEvent.mo92134c().mo92190b();
        this.mLogger = b;
        if (b != null) {
            b.mo92224i("ApiDocsPickerPlugin", "invoke api");
        }
        Activity f = getApiDependency().mo235051f();
        if (f == null) {
            fillFailedResponse(apiDocsPickerResponse, C25906a.f64080j, "current activity is null");
            hVar.callback(apiDocsPickerResponse);
            ILogger aVar = this.mLogger;
            if (aVar != null) {
                aVar.mo92223e("ApiDocsPickerPlugin", "current activity is null");
                return;
            }
            return;
        }
        String str = apiDocsPickerRequest.pickerTitle;
        if (str == null) {
            str = f.getString(R.string.lark_brand_select_doc_title);
        }
        String str2 = apiDocsPickerRequest.pickerConfirm;
        if (str2 == null) {
            str2 = f.getString(R.string.lark_brand_select_doc_confirm);
        }
        int i2 = apiDocsPickerRequest.maxNum;
        if (i2 <= 0) {
            i = 10;
        } else {
            i = i2;
        }
        ILogger aVar2 = this.mLogger;
        if (aVar2 != null) {
            aVar2.mo92224i("ApiDocsPickerPlugin", "invoke startDocSelectActivity");
        }
        getApiDependency().mo235040b(f, 30002, i, str, str2);
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        ILogger aVar = this.mLogger;
        if (aVar != null) {
            aVar.mo92224i("ApiDocsPickerPlugin", "handleActivityResult, reqCode" + i + " resultCode" + i2);
        }
        ApiDocsPickerResponse apiDocsPickerResponse = new ApiDocsPickerResponse();
        if (i == 30002) {
            if (i2 == 0) {
                fillFailedResponse(apiDocsPickerResponse, C25906a.f64073c, "user cancel");
                AbstractC25897h<ApiDocsPickerResponse> hVar = this.mInvokeCallback;
                if (hVar != null) {
                    hVar.callback(apiDocsPickerResponse);
                }
                return true;
            } else if (intent == null) {
                C25906a aVar2 = C25906a.f64080j;
                fillFailedResponse(apiDocsPickerResponse, aVar2, "resultCode:" + i2 + " data is null");
                AbstractC25897h<ApiDocsPickerResponse> hVar2 = this.mInvokeCallback;
                if (hVar2 != null) {
                    hVar2.callback(apiDocsPickerResponse);
                }
                return true;
            } else if (i2 == -1) {
                try {
                    callbackOk(JSON.parseArray(intent.getStringExtra("extra_selected_data")));
                } catch (JSONException e) {
                    ILogger aVar3 = this.mLogger;
                    if (aVar3 != null) {
                        aVar3.mo92223e("ApiDocsPickerPlugin", e);
                    }
                    fillFailedResponse(apiDocsPickerResponse, C25906a.f64080j, e.getMessage());
                    AbstractC25897h<ApiDocsPickerResponse> hVar3 = this.mInvokeCallback;
                    if (hVar3 != null) {
                        hVar3.callback(apiDocsPickerResponse);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
