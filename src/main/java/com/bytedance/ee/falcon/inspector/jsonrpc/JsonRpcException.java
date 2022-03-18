package com.bytedance.ee.falcon.inspector.jsonrpc;

import com.bytedance.ee.falcon.inspector.jsonrpc.protocol.JsonRpcError;
import com.bytedance.ee.falcon.inspector.utils.C12701b;

public class JsonRpcException extends Exception {
    private final JsonRpcError mErrorMessage;

    public JsonRpcError getErrorMessage() {
        return this.mErrorMessage;
    }

    public JsonRpcException(JsonRpcError jsonRpcError) {
        super(jsonRpcError.f33897a + ": " + jsonRpcError.f33898b);
        this.mErrorMessage = (JsonRpcError) C12701b.m52567a(jsonRpcError);
    }
}
