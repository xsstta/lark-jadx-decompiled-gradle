package com.bytedance.ee.falcon.inspector.jsonrpc.protocol;

import com.bytedance.ee.falcon.inspector.json.JsonProperty;
import com.bytedance.ee.falcon.inspector.json.JsonValue;
import org.json.JSONObject;

public class JsonRpcError {
    @JsonProperty(required = true)

    /* renamed from: a */
    public ErrorCode f33897a;
    @JsonProperty(required = true)

    /* renamed from: b */
    public String f33898b;
    @JsonProperty

    /* renamed from: c */
    public JSONObject f33899c;

    public enum ErrorCode {
        PARSER_ERROR(-32700),
        INVALID_REQUEST(-32600),
        METHOD_NOT_FOUND(-32601),
        INVALID_PARAMS(-32602),
        INTERNAL_ERROR(-32603);
        
        private final int mProtocolValue;

        @JsonValue
        public int getProtocolValue() {
            return this.mProtocolValue;
        }

        private ErrorCode(int i) {
            this.mProtocolValue = i;
        }
    }

    public JsonRpcError() {
    }

    public JsonRpcError(ErrorCode errorCode, String str, JSONObject jSONObject) {
        this.f33897a = errorCode;
        this.f33898b = str;
        this.f33899c = jSONObject;
    }
}
