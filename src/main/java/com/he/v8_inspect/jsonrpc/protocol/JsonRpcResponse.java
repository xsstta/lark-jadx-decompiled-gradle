package com.he.v8_inspect.jsonrpc.protocol;

import com.he.v8_inspect.json.JsonProperty;
import org.json.JSONObject;

public class JsonRpcResponse {
    @JsonProperty
    public JSONObject error;
    @JsonProperty(required = true)
    public long id;
    @JsonProperty
    public JSONObject result;
}
