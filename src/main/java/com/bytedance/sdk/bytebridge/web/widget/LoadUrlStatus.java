package com.bytedance.sdk.bytebridge.web.widget;

import com.bytedance.sdk.bytebridge.base.error.BridgeErrorType;
import com.bytedance.sdk.bytebridge.base.result.BridgeResultCode;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/bytedance/sdk/bytebridge/web/widget/LoadUrlStatus;", "", "Lcom/bytedance/sdk/bytebridge/base/error/BridgeErrorType;", "value", "", "errorCode", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getCode", "getMessage", "SUCCESS", "SEND_CALLBACK_MSG_ERROR", "RESULT_NULL", "I_WEBVIEW_EVENT_AUTH_ERROR", "WEBVIEW_EVENT_AUTH_ERROR", "LOAD_URL_ERROR", "WEBVIEW_EVALUATE_JAVASCRIPT_VALUE_CALLBACK", "web_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum LoadUrlStatus implements BridgeErrorType {
    SUCCESS("run success", BridgeResultCode.SUCCESS.getValue()),
    SEND_CALLBACK_MSG_ERROR("sendCallbackMsg error", BridgeResultCode.ERROR.getValue()),
    RESULT_NULL("sendJsMessage o == null", BridgeResultCode.ERROR.getValue()),
    I_WEBVIEW_EVENT_AUTH_ERROR("iWebView event auth error", BridgeResultCode.ERROR.getValue()),
    WEBVIEW_EVENT_AUTH_ERROR("webView event auth error", BridgeResultCode.ERROR.getValue()),
    LOAD_URL_ERROR("load url error", BridgeResultCode.ERROR.getValue()),
    WEBVIEW_EVALUATE_JAVASCRIPT_VALUE_CALLBACK("webview evaluate javascript value call back", BridgeResultCode.ERROR.getValue());
    
    private final int errorCode;
    private final String value;

    public int getCode() {
        return this.errorCode;
    }

    public String getMessage() {
        return this.value;
    }

    private LoadUrlStatus(String str, int i) {
        this.value = str;
        this.errorCode = i;
    }
}
