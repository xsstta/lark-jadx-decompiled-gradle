package com.he.v8_inspect;

import com.he.v8_inspect.json.ObjectMapper;
import com.he.v8_inspect.jsonrpc.JsonRpcException;
import com.he.v8_inspect.jsonrpc.protocol.JsonRpcPeer;
import com.he.v8_inspect.jsonrpc.protocol.JsonRpcRequest;
import com.he.v8_inspect.jsonrpc.protocol.JsonRpcResponse;
import com.he.v8_inspect.protocol.module.Network;
import com.he.v8_inspect.server.http.ExactPathMatcher;
import com.he.v8_inspect.server.websocket.SimpleSession;
import com.he.v8_inspect.server.websocket.WebSocketHandler;
import com.he.v8_inspect.utils.MessageHandlingException;
import com.he.v8_inspect.utils.Util;
import com.ss.android.lark.log.Log;
import com.tt.miniapphost.AppbrandContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class Inspector implements IInspectorSession {
    private final ExactPathMatcher mExactPathMatcher;
    private final InspectTarget mInspectTarget;
    private final MethodDispatcher mMethodDispatcher;
    private final ObjectMapper mObjectMapper;
    private final Map<SimpleSession, JsonRpcPeer> mPeers = Collections.synchronizedMap(new HashMap());
    private volatile SimpleSession mSession;
    private long mVm;
    private final WebSocketHandler mWebSocketHandler;

    private native void createInspectorClient(long j);

    private native void dispatchProtocolMessage(long j, String str);

    private native void onCloseSession(long j);

    private native void onOpenSession(long j);

    private native void transferInspectorClient(long j, long j2);

    public ExactPathMatcher getExactPathMatcher() {
        return this.mExactPathMatcher;
    }

    public InspectTarget getInspectTarget() {
        return this.mInspectTarget;
    }

    public long getVm() {
        return this.mVm;
    }

    public WebSocketHandler getWebSocketHandler() {
        return this.mWebSocketHandler;
    }

    public void updateDisplayName(String str) {
        this.mInspectTarget.setDisplayName(str);
    }

    public void sendResponse(String str) {
        if (this.mSession != null) {
            this.mSession.sendText(str);
        }
    }

    @Override // com.he.v8_inspect.IInspectorSession
    public void onClose(SimpleSession simpleSession) {
        this.mSession = null;
        onCloseSession(this.mVm);
        JsonRpcPeer remove = this.mPeers.remove(simpleSession);
        if (remove != null) {
            remove.invokeDisconnectReceivers();
        }
    }

    @Override // com.he.v8_inspect.IInspectorSession
    public void onOpen(SimpleSession simpleSession) {
        this.mSession = simpleSession;
        this.mPeers.put(simpleSession, new JsonRpcPeer(this.mObjectMapper, simpleSession));
        onOpenSession(this.mVm);
    }

    private static String stringToUnicode(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt > 255) {
                sb.append("\\u");
                sb.append(Integer.toHexString(charAt));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    Inspector(long j) {
        ObjectMapper objectMapper = new ObjectMapper();
        this.mObjectMapper = objectMapper;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Network(AppbrandContext.getInst().getApplicationContext()));
        this.mMethodDispatcher = new MethodDispatcher(objectMapper, arrayList);
        this.mVm = j;
        InspectTarget inspectTarget = new InspectTarget("Preload MiniApp", "/inspector/" + this.mVm);
        this.mInspectTarget = inspectTarget;
        this.mExactPathMatcher = new ExactPathMatcher(inspectTarget.getInspectorPath());
        this.mWebSocketHandler = new WebSocketHandler(new ChromeDevtoolsServer(this));
        createInspectorClient(this.mVm);
    }

    public void transferInspector(long j, long j2) {
        this.mVm = j2;
        transferInspectorClient(j, j2);
    }

    private boolean handleRemoteMessage(JsonRpcPeer jsonRpcPeer, String str) throws IOException, MessageHandlingException, JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("method")) {
            return handleRemoteRequest(jsonRpcPeer, jSONObject);
        }
        if (jSONObject.has("result")) {
            Log.m165379d("Inspector", "not implement");
            return false;
        }
        throw new MessageHandlingException("Improper JSON-RPC message: " + str);
    }

    @Override // com.he.v8_inspect.IInspectorSession
    public void onProtocolMessage(SimpleSession simpleSession, String str) {
        boolean z;
        try {
            JsonRpcPeer jsonRpcPeer = this.mPeers.get(simpleSession);
            Util.throwIfNull(jsonRpcPeer);
            z = handleRemoteMessage(jsonRpcPeer, str);
        } catch (Throwable th) {
            Log.m165384e("Inspector", "Throwable", th);
            z = false;
        }
        if (!z) {
            dispatchProtocolMessage(this.mVm, stringToUnicode(str));
        }
    }

    private boolean handleRemoteRequest(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        String str;
        JsonRpcRequest jsonRpcRequest = (JsonRpcRequest) this.mObjectMapper.convertValue(jSONObject, JsonRpcRequest.class);
        try {
            JSONObject dispatch = this.mMethodDispatcher.dispatch(jsonRpcPeer, jsonRpcRequest.method, jsonRpcRequest.params);
            Log.m165379d("Inspector", "handleRemoteRequest :" + dispatch.toString());
            if (jsonRpcRequest.id == null) {
                return true;
            }
            JsonRpcResponse jsonRpcResponse = new JsonRpcResponse();
            jsonRpcResponse.id = jsonRpcRequest.id.longValue();
            jsonRpcResponse.result = dispatch;
            try {
                str = ((JSONObject) this.mObjectMapper.convertValue(jsonRpcResponse, JSONObject.class)).toString();
            } catch (OutOfMemoryError e) {
                jsonRpcResponse.result = null;
                jsonRpcResponse.error = (JSONObject) this.mObjectMapper.convertValue(e.getMessage(), JSONObject.class);
                str = ((JSONObject) this.mObjectMapper.convertValue(jsonRpcResponse, JSONObject.class)).toString();
            }
            jsonRpcPeer.getWebSocket().sendText(str);
            return true;
        } catch (JsonRpcException unused) {
            return false;
        }
    }

    private void closeSafely(SimpleSession simpleSession, int i, String str) {
        simpleSession.close(i, str);
    }
}
