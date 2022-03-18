package com.he.v8_inspect.jsonrpc;

import com.he.v8_inspect.jsonrpc.protocol.JsonRpcPeer;
import com.he.v8_inspect.jsonrpc.protocol.JsonRpcResponse;

public interface PendingRequestCallback {
    void onResponse(JsonRpcPeer jsonRpcPeer, JsonRpcResponse jsonRpcResponse);
}
