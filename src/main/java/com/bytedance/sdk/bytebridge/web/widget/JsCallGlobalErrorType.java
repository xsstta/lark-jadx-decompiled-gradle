package com.bytedance.sdk.bytebridge.web.widget;

import com.bytedance.sdk.bytebridge.base.error.BridgeErrorType;
import com.bytedance.sdk.bytebridge.base.result.BridgeResultCode;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/sdk/bytebridge/web/widget/JsCallGlobalErrorType;", "", "Lcom/bytedance/sdk/bytebridge/base/error/BridgeErrorType;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "", "getMessage", "JAVASCRIPT_INTERFACE_CALL", "JAVASCRIPT_INTERFACE_CALL_SYNC", "JAVASCRIPT_INTERFACE_INVOKE_METHOD", "web_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum JsCallGlobalErrorType implements BridgeErrorType {
    JAVASCRIPT_INTERFACE_CALL("js_interface_call_error"),
    JAVASCRIPT_INTERFACE_CALL_SYNC("js_interface_call_sync_error"),
    JAVASCRIPT_INTERFACE_INVOKE_METHOD("js_interface_invoke_error");
    
    private final String value;

    public String getMessage() {
        return this.value;
    }

    public int getCode() {
        return BridgeResultCode.ERROR.getValue();
    }

    private JsCallGlobalErrorType(String str) {
        this.value = str;
    }
}
