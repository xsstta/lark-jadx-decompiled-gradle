package com.he.v8_inspect.jsonrpc.protocol;

import com.he.v8_inspect.json.JsonProperty;
import com.he.v8_inspect.json.JsonValue;
import javax.annotation.Nullable;
import org.json.JSONObject;

public class JsonRpcError {
    @JsonProperty(required = true)
    public ErrorCode code;
    @JsonProperty
    public JSONObject data;
    @JsonProperty(required = true)
    public String message;

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

    public JsonRpcError(ErrorCode errorCode, String str, @Nullable JSONObject jSONObject) {
        this.code = errorCode;
        this.message = str;
        this.data = jSONObject;
    }
}
