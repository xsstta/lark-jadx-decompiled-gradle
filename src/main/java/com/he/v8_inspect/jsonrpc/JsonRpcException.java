package com.he.v8_inspect.jsonrpc;

import com.he.v8_inspect.jsonrpc.protocol.JsonRpcError;
import com.he.v8_inspect.utils.Util;

public class JsonRpcException extends Exception {
    private final JsonRpcError mErrorMessage;

    public JsonRpcError getErrorMessage() {
        return this.mErrorMessage;
    }

    public JsonRpcException(JsonRpcError jsonRpcError) {
        super(jsonRpcError.code + ": " + jsonRpcError.message);
        this.mErrorMessage = (JsonRpcError) Util.throwIfNull(jsonRpcError);
    }
}
