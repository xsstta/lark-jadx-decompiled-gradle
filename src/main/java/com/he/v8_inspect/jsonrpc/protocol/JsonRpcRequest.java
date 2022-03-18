package com.he.v8_inspect.jsonrpc.protocol;

import com.he.v8_inspect.json.JsonProperty;
import org.json.JSONObject;

public class JsonRpcRequest {
    @JsonProperty
    public Long id;
    @JsonProperty(required = true)
    public String method;
    @JsonProperty
    public JSONObject params;

    public JsonRpcRequest() {
    }

    public JsonRpcRequest(Long l, String str, JSONObject jSONObject) {
        this.id = l;
        this.method = str;
        this.params = jSONObject;
    }
}
