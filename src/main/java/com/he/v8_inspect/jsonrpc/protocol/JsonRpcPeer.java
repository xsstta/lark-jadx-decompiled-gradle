package com.he.v8_inspect.jsonrpc.protocol;

import android.database.Observable;
import com.he.v8_inspect.json.ObjectMapper;
import com.he.v8_inspect.jsonrpc.DisconnectReceiver;
import com.he.v8_inspect.jsonrpc.PendingRequest;
import com.he.v8_inspect.jsonrpc.PendingRequestCallback;
import com.he.v8_inspect.server.websocket.SimpleSession;
import com.he.v8_inspect.utils.Util;
import java.nio.channels.NotYetConnectedException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONObject;

public class JsonRpcPeer {
    private final DisconnectObservable mDisconnectObservable = new DisconnectObservable();
    private long mNextRequestId;
    private final ObjectMapper mObjectMapper;
    private final SimpleSession mPeer;
    private final Map<Long, PendingRequest> mPendingRequests = new HashMap();

    /* access modifiers changed from: private */
    public static class DisconnectObservable extends Observable<DisconnectReceiver> {
        private DisconnectObservable() {
        }

        public void onDisconnect() {
            int size = this.mObservers.size();
            for (int i = 0; i < size; i++) {
                ((DisconnectReceiver) this.mObservers.get(i)).onDisconnect();
            }
        }
    }

    public SimpleSession getWebSocket() {
        return this.mPeer;
    }

    public void invokeDisconnectReceivers() {
        this.mDisconnectObservable.onDisconnect();
    }

    public void registerDisconnectReceiver(DisconnectReceiver disconnectReceiver) {
        this.mDisconnectObservable.registerObserver(disconnectReceiver);
    }

    public void unregisterDisconnectReceiver(DisconnectReceiver disconnectReceiver) {
        this.mDisconnectObservable.unregisterObserver(disconnectReceiver);
    }

    private synchronized long preparePendingRequest(PendingRequestCallback pendingRequestCallback) {
        long j;
        j = this.mNextRequestId;
        this.mNextRequestId = 1 + j;
        this.mPendingRequests.put(Long.valueOf(j), new PendingRequest(j, pendingRequestCallback));
        return j;
    }

    public synchronized PendingRequest getAndRemovePendingRequest(long j) {
        return this.mPendingRequests.remove(Long.valueOf(j));
    }

    public JsonRpcPeer(ObjectMapper objectMapper, SimpleSession simpleSession) {
        this.mObjectMapper = objectMapper;
        this.mPeer = (SimpleSession) Util.throwIfNull(simpleSession);
    }

    public void invokeMethod(String str, Object obj, @Nullable PendingRequestCallback pendingRequestCallback) throws NotYetConnectedException {
        Long l;
        Util.throwIfNull(str);
        if (pendingRequestCallback != null) {
            l = Long.valueOf(preparePendingRequest(pendingRequestCallback));
        } else {
            l = null;
        }
        this.mPeer.sendText(((JSONObject) this.mObjectMapper.convertValue(new JsonRpcRequest(l, str, (JSONObject) this.mObjectMapper.convertValue(obj, JSONObject.class)), JSONObject.class)).toString());
    }
}
