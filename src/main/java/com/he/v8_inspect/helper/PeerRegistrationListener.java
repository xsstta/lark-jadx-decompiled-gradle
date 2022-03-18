package com.he.v8_inspect.helper;

import com.he.v8_inspect.jsonrpc.protocol.JsonRpcPeer;

public interface PeerRegistrationListener {
    void onPeerRegistered(JsonRpcPeer jsonRpcPeer);

    void onPeerUnregistered(JsonRpcPeer jsonRpcPeer);
}
