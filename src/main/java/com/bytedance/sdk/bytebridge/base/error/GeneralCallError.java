package com.bytedance.sdk.bytebridge.base.error;

import com.bytedance.sdk.bytebridge.base.result.BridgeResultCode;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/error/GeneralCallError;", "", "Lcom/bytedance/sdk/bytebridge/base/error/BridgeErrorType;", "value", "", "errorCode", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getCode", "getMessage", "PARAMS_INCOMPATIBLE", "AUTH_FILED", "BRIDGE_NOT_FOUND", "SYNC_CALL_ASYNC", "METHOD_RETURN_NULL", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum GeneralCallError implements BridgeErrorType {
    PARAMS_INCOMPATIBLE("params incompatible", BridgeResultCode.PARAMS_ERROR.getValue()),
    AUTH_FILED("auth filed, or no privilege", BridgeResultCode.NO_PRIVILEGE.getValue()),
    BRIDGE_NOT_FOUND("can not find this bridge", BridgeResultCode.NOT_FOUND.getValue()),
    SYNC_CALL_ASYNC("The method does not support synchronous calls", BridgeResultCode.NOT_FOUND.getValue()),
    METHOD_RETURN_NULL("method return null", BridgeResultCode.ERROR.getValue());
    
    private final int errorCode;
    private final String value;

    public int getCode() {
        return this.errorCode;
    }

    public String getMessage() {
        return this.value;
    }

    private GeneralCallError(String str, int i) {
        this.value = str;
        this.errorCode = i;
    }
}
