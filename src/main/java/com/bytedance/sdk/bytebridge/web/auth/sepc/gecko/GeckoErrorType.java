package com.bytedance.sdk.bytebridge.web.auth.sepc.gecko;

import com.bytedance.sdk.bytebridge.base.error.BridgeErrorType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/bytedance/sdk/bytebridge/web/auth/sepc/gecko/GeckoErrorType;", "", "Lcom/bytedance/sdk/bytebridge/base/error/BridgeErrorType;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "", "getMessage", "GECKO_AUTH_RUNTIME_EXCEPTION", "GECKO_AUTH_MISSING_INFO", "GECKO_AUTH_FOUND_LOCAL_FILE_URL", "GECKO_PARSE_RESPONSE_RUNTIME_EXCEPTION", "GECKO_FETCH_AUTH_RULE_RUNTIME_EXCEPTION", "web_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum GeckoErrorType implements BridgeErrorType {
    GECKO_AUTH_RUNTIME_EXCEPTION("gecko auth runtime exception"),
    GECKO_AUTH_MISSING_INFO("gecko auth missing info"),
    GECKO_AUTH_FOUND_LOCAL_FILE_URL("gecko auth found local file url"),
    GECKO_PARSE_RESPONSE_RUNTIME_EXCEPTION("gecko parse response runtime exception"),
    GECKO_FETCH_AUTH_RULE_RUNTIME_EXCEPTION("gecko fetch authRules runtime exception");
    
    private final String value;

    public int getCode() {
        return -4;
    }

    public String getMessage() {
        return this.value;
    }

    private GeckoErrorType(String str) {
        this.value = str;
    }
}
