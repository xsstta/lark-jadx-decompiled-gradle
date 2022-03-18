package com.he.v8_inspect.helper;

import com.he.v8_inspect.jsonrpc.DisconnectReceiver;
import com.he.v8_inspect.jsonrpc.PendingRequestCallback;
import com.he.v8_inspect.jsonrpc.protocol.JsonRpcPeer;
import com.he.v8_inspect.utils.Util;
import com.ss.android.lark.log.Log;
import java.nio.channels.NotYetConnectedException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ChromePeerManager {
    private PeerRegistrationListener mListener;
    private final Map<JsonRpcPeer, DisconnectReceiver> mReceivingPeers = new HashMap();
    private JsonRpcPeer[] mReceivingPeersSnapshot;

    private class UnregisterOnDisconnect implements DisconnectReceiver {
        private final JsonRpcPeer mPeer;

        @Override // com.he.v8_inspect.jsonrpc.DisconnectReceiver
        public void onDisconnect() {
            ChromePeerManager.this.removePeer(this.mPeer);
        }

        public UnregisterOnDisconnect(JsonRpcPeer jsonRpcPeer) {
            this.mPeer = jsonRpcPeer;
        }
    }

    public synchronized boolean hasRegisteredPeers() {
        return !this.mReceivingPeers.isEmpty();
    }

    private synchronized JsonRpcPeer[] getReceivingPeersSnapshot() {
        if (this.mReceivingPeersSnapshot == null) {
            this.mReceivingPeersSnapshot = (JsonRpcPeer[]) this.mReceivingPeers.keySet().toArray(new JsonRpcPeer[this.mReceivingPeers.size()]);
        }
        return this.mReceivingPeersSnapshot;
    }

    public synchronized void setListener(PeerRegistrationListener peerRegistrationListener) {
        this.mListener = peerRegistrationListener;
    }

    public synchronized void removePeer(JsonRpcPeer jsonRpcPeer) {
        if (this.mReceivingPeers.remove(jsonRpcPeer) != null) {
            this.mReceivingPeersSnapshot = null;
            PeerRegistrationListener peerRegistrationListener = this.mListener;
            if (peerRegistrationListener != null) {
                peerRegistrationListener.onPeerUnregistered(jsonRpcPeer);
            }
        }
    }

    public synchronized boolean addPeer(JsonRpcPeer jsonRpcPeer) {
        if (this.mReceivingPeers.containsKey(jsonRpcPeer)) {
            return false;
        }
        UnregisterOnDisconnect unregisterOnDisconnect = new UnregisterOnDisconnect(jsonRpcPeer);
        jsonRpcPeer.registerDisconnectReceiver(unregisterOnDisconnect);
        this.mReceivingPeers.put(jsonRpcPeer, unregisterOnDisconnect);
        this.mReceivingPeersSnapshot = null;
        PeerRegistrationListener peerRegistrationListener = this.mListener;
        if (peerRegistrationListener != null) {
            peerRegistrationListener.onPeerRegistered(jsonRpcPeer);
        }
        return true;
    }

    public void sendNotificationToPeers(String str, Object obj) {
        sendMessageToPeers(str, obj, null);
    }

    public void invokeMethodOnPeers(String str, Object obj, PendingRequestCallback pendingRequestCallback) {
        Util.throwIfNull(pendingRequestCallback);
        sendMessageToPeers(str, obj, pendingRequestCallback);
    }

    private void sendMessageToPeers(String str, Object obj, @Nullable PendingRequestCallback pendingRequestCallback) {
        for (JsonRpcPeer jsonRpcPeer : getReceivingPeersSnapshot()) {
            try {
                jsonRpcPeer.invokeMethod(str, obj, pendingRequestCallback);
            } catch (NotYetConnectedException e) {
                Log.m165384e("ChromePeerManager", "Error delivering data to Chrome", e);
            }
        }
    }
}
