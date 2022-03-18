package com.he.v8_inspect.protocol;

import com.he.v8_inspect.json.JsonProperty;
import com.he.v8_inspect.jsonrpc.JsonRpcResult;

public class SimpleBooleanResult implements JsonRpcResult {
    @JsonProperty(required = true)
    public boolean result;

    public SimpleBooleanResult() {
    }

    public SimpleBooleanResult(boolean z) {
        this.result = z;
    }
}
