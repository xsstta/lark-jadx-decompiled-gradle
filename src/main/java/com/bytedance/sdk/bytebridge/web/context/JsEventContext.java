package com.bytedance.sdk.bytebridge.web.context;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/sdk/bytebridge/web/context/JsEventContext;", "Lcom/bytedance/sdk/bytebridge/web/context/JsContext;", "originInfo", "Lcom/bytedance/sdk/bytebridge/web/conduct/JsEventOriginInfo;", "iWebView", "Lcom/bytedance/sdk/bytebridge/web/context/IWebView;", "iJsLoadUrlResult", "Lcom/bytedance/sdk/bytebridge/web/conduct/IJsLoadUrlResult;", "(Lcom/bytedance/sdk/bytebridge/web/conduct/JsEventOriginInfo;Lcom/bytedance/sdk/bytebridge/web/context/IWebView;Lcom/bytedance/sdk/bytebridge/web/conduct/IJsLoadUrlResult;)V", "event", "", "actualSendEvent", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lorg/json/JSONObject;", "isNativeWebView", "", "authEvent", "getCallbackHandler", "web_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.web.c.d */
public final class JsEventContext extends JsContext {

    /* renamed from: b */
    private final String f50644b;

    @Override // com.bytedance.sdk.bytebridge.web.context.JsContext
    /* renamed from: k */
    public String mo69874k() {
        return this.f50644b;
    }
}
