package org.chromium.wschannel;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient;
import com.ttnet.org.chromium.net.CronetEngine;
import com.ttnet.org.chromium.net.TTWebsocketConnection;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import org.chromium.CronetClient;
import org.json.JSONObject;

public class WsClient implements IWsClient {
    private static CronetEngine mCronetEngine;
    private C70017a mCallback = new C70017a();
    public IMessageReceiveListener mListener;
    private TTWebsocketConnection mWebsocketConnection;

    public int cronetToWsStateAdapter(int i) {
        if (i == -1) {
            return 0;
        }
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i;
        }
        return 5;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public boolean isConnected() {
        TTWebsocketConnection tTWebsocketConnection = this.mWebsocketConnection;
        if (tTWebsocketConnection == null) {
            return false;
        }
        return tTWebsocketConnection.isConnected();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public void stopConnection() {
        TTWebsocketConnection tTWebsocketConnection = this.mWebsocketConnection;
        if (tTWebsocketConnection != null) {
            tTWebsocketConnection.stopConnection();
            this.mWebsocketConnection.destroyConnection();
        }
    }

    private CronetEngine getCronetEngine() {
        Logger.m15167d("WsClient", "Init cronet engine");
        try {
            loadCronetKernel();
        } catch (Throwable th) {
            th.printStackTrace();
            Logger.m15167d("WsClient", "TTNet init failed, cronet engine is null.");
        }
        return CronetClient.getCronetEngine();
    }

    private static void loadCronetKernel() throws Exception {
        Object newInstance = Class.forName("com.bytedance.ttnet.TTNetInit").newInstance();
        Reflect.on(newInstance).call("getInitCompletedLatch");
        Reflect.on(newInstance).call("preInitCronetKernel");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.chromium.wschannel.WsClient$a */
    public class C70017a extends TTWebsocketConnection.Callback {
        C70017a() {
        }

        @Override // com.ttnet.org.chromium.net.TTWebsocketConnection.Callback
        public void onFeedbackLog(TTWebsocketConnection tTWebsocketConnection, String str) {
            if (WsClient.this.mListener != null) {
                WsClient.this.mListener.onFeedBackLog(str);
            }
        }

        @Override // com.ttnet.org.chromium.net.TTWebsocketConnection.Callback
        public void onMessageReceived(TTWebsocketConnection tTWebsocketConnection, ByteBuffer byteBuffer, int i) {
            byte[] bArr = new byte[byteBuffer.capacity()];
            if (!(i == 1 || i == 2)) {
                i = 0;
            }
            try {
                byteBuffer.get(bArr);
                if (WsClient.this.mListener != null) {
                    WsClient.this.mListener.onMessage(bArr, i);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // com.ttnet.org.chromium.net.TTWebsocketConnection.Callback
        public void onConnectionStateChanged(TTWebsocketConnection tTWebsocketConnection, int i, String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("state", WsClient.this.cronetToWsStateAdapter(i));
                jSONObject.put("url", str);
                if (WsClient.this.mListener != null) {
                    WsClient.this.mListener.onConnection(i, str, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // com.ttnet.org.chromium.net.TTWebsocketConnection.Callback
        public void onConnectionError(TTWebsocketConnection tTWebsocketConnection, int i, String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                jSONObject.put("error", str2);
                if (WsClient.this.mListener != null) {
                    WsClient.this.mListener.onConnection(i, str, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // com.ttnet.org.chromium.net.TTWebsocketConnection.Callback
        public void onTrafficChanged(TTWebsocketConnection tTWebsocketConnection, String str, long j, long j2, boolean z) {
            try {
                C70018a.m268596a().mo246516a(str, j, j2, z);
            } catch (Throwable unused) {
            }
        }
    }

    public WsClient(IMessageReceiveListener iMessageReceiveListener) throws NullPointerException {
        if (mCronetEngine == null) {
            mCronetEngine = getCronetEngine();
        }
        this.mListener = iMessageReceiveListener;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public boolean sendMessage(byte[] bArr, int i) throws Exception {
        Logger.m15167d("WsClient", "sendMessage data:" + bArr);
        if (this.mWebsocketConnection == null) {
            return false;
        }
        if (i == 2) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
            allocateDirect.put(bArr);
            this.mWebsocketConnection.asyncSendBinary(allocateDirect);
        } else if (i == 1) {
            this.mWebsocketConnection.asyncSendText(new String(bArr, "UTF-8"));
        } else {
            throw new IllegalArgumentException("Unsupported message type: " + i);
        }
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public void onParameterChange(Map<String, String> map, Map<String, String> map2, List<String> list, boolean z, boolean z2) {
        TTWebsocketConnection tTWebsocketConnection = this.mWebsocketConnection;
        if (tTWebsocketConnection != null) {
            tTWebsocketConnection.stopConnection();
            this.mWebsocketConnection.destroyConnection();
        }
        openConnection(map, map2, list, z, z2);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public void openConnection(Map<String, String> map, Map<String, String> map2, List<String> list, boolean z, boolean z2) {
        if (list == null || list.size() <= 0) {
            throw new IllegalArgumentException("urls size <= 0 !!!");
        }
        Logger.m15167d("WsClient", "openConnection url:" + list.get(0));
        TTWebsocketConnection.Builder newWebsocketConnectionBuilder = mCronetEngine.newWebsocketConnectionBuilder(this.mCallback, Executors.newSingleThreadExecutor());
        newWebsocketConnectionBuilder.setUrlList(list);
        if (map != null && !map.isEmpty()) {
            newWebsocketConnectionBuilder.setCustomizedParams(map);
        }
        if (map2 != null && !map2.isEmpty()) {
            newWebsocketConnectionBuilder.setCustomizedHeaders(map2);
        }
        newWebsocketConnectionBuilder.setSharedConnection(z);
        newWebsocketConnectionBuilder.useFrontierProtocol(z2);
        TTWebsocketConnection build = newWebsocketConnectionBuilder.build();
        this.mWebsocketConnection = build;
        build.startConnection();
    }
}
