package com.bytedance.ee.webapp.api;

import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public abstract class OPBaseNetApiPlugin extends OPPlugin implements AbstractC13761a {
    public AbstractC13761a mIBaseNetApiCallback = this;

    /* access modifiers changed from: protected */
    public abstract Map<String, String> addHeaders();

    /* access modifiers changed from: protected */
    public abstract String buildRequestBody();

    /* access modifiers changed from: protected */
    public abstract String getHost();

    /* access modifiers changed from: protected */
    public abstract String getPath();

    /* access modifiers changed from: protected */
    public SendHttpRequest.Method getRequestMethodType() {
        return SendHttpRequest.Method.POST;
    }

    /* access modifiers changed from: protected */
    public void doHttpRequest() {
        SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, buildRequest(), new UIGetDataCallback(new IGetDataCallback<SendHttpResponse>() {
            /* class com.bytedance.ee.webapp.api.OPBaseNetApiPlugin.C137601 */

            /* renamed from: a */
            public void onSuccess(SendHttpResponse sendHttpResponse) {
                if (OPBaseNetApiPlugin.this.mIBaseNetApiCallback != null) {
                    OPBaseNetApiPlugin.this.mIBaseNetApiCallback.onSuccess(sendHttpResponse);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (OPBaseNetApiPlugin.this.mIBaseNetApiCallback != null) {
                    OPBaseNetApiPlugin.this.mIBaseNetApiCallback.onError(errorResult);
                }
            }
        }), $$Lambda$OPBaseNetApiPlugin$AwSupkowhiGCdbSNJJthttrY070.INSTANCE);
    }

    private SendHttpRequest.C15253a buildRequest() {
        SendHttpRequest.C15253a aVar = new SendHttpRequest.C15253a();
        aVar.mo55526a(getRequestMethodType()).mo55529a(getCommonHeaders());
        aVar.mo55533c(buildRequestBody());
        aVar.mo55528a(buildUrl());
        return aVar;
    }

    private String buildUrl() {
        URL url;
        try {
            url = new URL("https", getHost(), getPath());
        } catch (MalformedURLException e) {
            Log.m165384e("OPBaseNetApiPlugin", "buildUrl", e);
            url = null;
        }
        if (url == null) {
            return "";
        }
        return url.toString();
    }

    private Map<String, String> getCommonHeaders() {
        HashMap hashMap = new HashMap();
        hashMap.put("Cookie", "session=" + LarkExtensionManager.getInstance().getExtension().mo49565b());
        if (addHeaders() != null) {
            hashMap.putAll(addHeaders());
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public boolean isRequestSucceeded(SendHttpResponse sendHttpResponse) {
        if (sendHttpResponse.http_status_code.intValue() == 200) {
            return true;
        }
        return false;
    }
}
