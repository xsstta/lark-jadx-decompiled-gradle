package org.chromium.wschannel;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ttnet.org.chromium.net.CronetEngine;
import com.ttnet.org.chromium.net.TTWebsocketConnection;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.CronetClient;
import org.json.JSONException;
import org.json.JSONObject;

public class MySelfChannelImpl implements WeakHandler.IHandler, IWsChannelClient {
    private static String WSCHANNEL_ACTION_BACK;
    private static String WSCHANNEL_ACTION_FORE;
    private static CronetEngine mCronetEngine;
    private static volatile int sChannelID = -1;
    private static volatile AtomicInteger sFirstConnection = new AtomicInteger(0);
    private static String sPackageName;
    private C70016a mCallback = new C70016a();
    private Context mContext;
    private TTWebsocketConnection mWebsocketConnection;
    private IWsChannelClient mWsChannelClient;
    private boolean sharedConnection = true;

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
        return 6;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onNetworkStateChanged(int i) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void destroy() {
        TTWebsocketConnection tTWebsocketConnection = this.mWebsocketConnection;
        if (tTWebsocketConnection != null) {
            tTWebsocketConnection.stopConnection();
            this.mWebsocketConnection.destroyConnection();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean isConnected() {
        TTWebsocketConnection tTWebsocketConnection = this.mWebsocketConnection;
        if (tTWebsocketConnection == null) {
            return false;
        }
        return tTWebsocketConnection.isConnected();
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void stopConnection() {
        TTWebsocketConnection tTWebsocketConnection = this.mWebsocketConnection;
        if (tTWebsocketConnection != null) {
            tTWebsocketConnection.stopConnection();
            this.mWebsocketConnection.destroyConnection();
        }
    }

    private Map<String, String> getClientKeyHeaders() {
        try {
            return (Map) Class.forName("com.bytedance.ttnet.clientkey.ClientKeyManager").getMethod("getClientKeyHeaders", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static void loadCronetKernel() throws Exception {
        Object newInstance = Class.forName("com.bytedance.ttnet.TTNetInit").newInstance();
        Reflect.on(newInstance).call("getInitCompletedLatch");
        Reflect.on(newInstance).call("preInitCronetKernel");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.chromium.wschannel.MySelfChannelImpl$a */
    public class C70016a extends TTWebsocketConnection.Callback {
        C70016a() {
        }

        @Override // com.ttnet.org.chromium.net.TTWebsocketConnection.Callback
        public void onMessageReceived(TTWebsocketConnection tTWebsocketConnection, ByteBuffer byteBuffer, int i) throws Exception {
            byte[] bArr = new byte[byteBuffer.capacity()];
            try {
                byteBuffer.get(bArr);
                MySelfChannelImpl.this.onMessage(bArr);
            } catch (Throwable unused) {
            }
        }

        @Override // com.ttnet.org.chromium.net.TTWebsocketConnection.Callback
        public void onConnectionStateChanged(TTWebsocketConnection tTWebsocketConnection, int i, String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ShareHitPoint.f121869d, 1);
                jSONObject.put("state", MySelfChannelImpl.this.cronetToWsStateAdapter(i));
                jSONObject.put("url", str);
                MySelfChannelImpl.this.onConnection(jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // com.ttnet.org.chromium.net.TTWebsocketConnection.Callback
        public void onConnectionError(TTWebsocketConnection tTWebsocketConnection, int i, String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ShareHitPoint.f121869d, 0);
                jSONObject.put("state", MySelfChannelImpl.this.cronetToWsStateAdapter(i));
                jSONObject.put("url", str);
                jSONObject.put("error", str2);
                MySelfChannelImpl.this.onConnection(jSONObject);
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

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onMessage(byte[] bArr) {
        IWsChannelClient iWsChannelClient = this.mWsChannelClient;
        if (iWsChannelClient != null) {
            iWsChannelClient.onMessage(bArr);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        Logger.m15167d("MySelfChannelImpl", "handleMsg data:" + message.toString());
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onConnection(JSONObject jSONObject) {
        if (this.mWsChannelClient != null) {
            try {
                jSONObject.put("channel_type", 1);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.mWsChannelClient.onConnection(jSONObject);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onAppStateChanged(int i) {
        Intent intent = new Intent();
        if (i == 1) {
            intent.setAction(WSCHANNEL_ACTION_FORE);
            if (!TextUtils.isEmpty(sPackageName)) {
                intent.setPackage(sPackageName);
            }
            this.mContext.sendBroadcast(intent);
        } else if (i == 2) {
            intent.setAction(WSCHANNEL_ACTION_BACK);
            if (!TextUtils.isEmpty(sPackageName)) {
                intent.setPackage(sPackageName);
            }
            this.mContext.sendBroadcast(intent);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean sendMessage(byte[] bArr) {
        Logger.m15167d("MySelfChannelImpl", "sendMessage data:" + bArr);
        if (this.mWebsocketConnection == null) {
            return false;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        this.mWebsocketConnection.asyncSendBinary(allocateDirect);
        return true;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onParameterChange(Map<String, Object> map, List<String> list) {
        TTWebsocketConnection tTWebsocketConnection = this.mWebsocketConnection;
        if (tTWebsocketConnection != null) {
            tTWebsocketConnection.stopConnection();
            this.mWebsocketConnection.destroyConnection();
        }
        openConnection(map, list);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void init(Context context, IWsChannelClient iWsChannelClient) {
        Logger.m15167d("MySelfChannelImpl", "MySelfChannelImpl init");
        if (sFirstConnection.incrementAndGet() > 1) {
            this.sharedConnection = false;
        }
        this.mContext = context;
        sPackageName = context.getPackageName();
        this.mWsChannelClient = iWsChannelClient;
        try {
            loadCronetKernel();
        } catch (Throwable th) {
            th.printStackTrace();
            Logger.m15167d("MySelfChannelImpl", "TTNet init failed, cronet engine is null.");
        }
        mCronetEngine = CronetClient.getCronetEngine();
        WSCHANNEL_ACTION_BACK = this.mContext.getPackageName() + ".wschannel.APP_BACKGROUND";
        WSCHANNEL_ACTION_FORE = this.mContext.getPackageName() + ".wschannel.APP_FOREGROUND";
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void openConnection(Map<String, Object> map, List<String> list) {
        int i;
        if (list == null || list.size() <= 0) {
            throw new IllegalArgumentException("urls size <= 0 !!!");
        }
        Logger.m15167d("MySelfChannelImpl", "openConnection url:" + list.get(0));
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("configMap is empty !!!");
        }
        Object obj = map.get("channel_id");
        if (obj == null) {
            i = -1;
        } else {
            i = ((Integer) obj).intValue();
        }
        if (sChannelID == -1 && i > 0 && sFirstConnection.get() == 1) {
            sChannelID = i;
        }
        TTWebsocketConnection.Builder newWebsocketConnectionBuilder = mCronetEngine.newWebsocketConnectionBuilder(this.mCallback, Executors.newSingleThreadExecutor());
        try {
            newWebsocketConnectionBuilder.setUrlList(list);
            newWebsocketConnectionBuilder.setAppKey(String.valueOf(map.get("app_key")));
            newWebsocketConnectionBuilder.setFpid(((Integer) map.get("fpid")).intValue());
            newWebsocketConnectionBuilder.setAppVersion(((Integer) map.get("app_version")).intValue());
            newWebsocketConnectionBuilder.setAppId(((Integer) map.get("aid")).intValue());
            newWebsocketConnectionBuilder.setDeviceId(Long.parseLong((String) map.get("device_id")));
            newWebsocketConnectionBuilder.setInstallId(Long.parseLong((String) map.get("iid")));
            if (i > 0 && i == sChannelID) {
                this.sharedConnection = true;
            }
            newWebsocketConnectionBuilder.setSharedConnection(this.sharedConnection);
            if (map.containsKey("sid")) {
                newWebsocketConnectionBuilder.setSessionId((String) map.get("sid"));
            }
            String str = (String) map.get("extra");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split(ContainerUtils.FIELD_DELIMITER);
                for (String str2 : split) {
                    if (!TextUtils.isEmpty(str2)) {
                        String[] split2 = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                        if (split2.length == 2) {
                            hashMap.put(split2[0], split2[1]);
                        }
                    }
                }
            }
            newWebsocketConnectionBuilder.setCustomizedParams(hashMap);
            try {
                HashMap hashMap2 = new HashMap();
                Map<String, String> clientKeyHeaders = getClientKeyHeaders();
                Logger.m15167d("MySelfChannelImpl", "Client key: " + clientKeyHeaders);
                if (clientKeyHeaders != null && !clientKeyHeaders.isEmpty()) {
                    hashMap2.putAll(clientKeyHeaders);
                }
                Map map2 = (Map) map.get("custom_headers");
                if (map2 != null && !map2.isEmpty()) {
                    hashMap2.putAll(map2);
                }
                if (!hashMap2.isEmpty()) {
                    newWebsocketConnectionBuilder.setCustomizedHeaders(hashMap2);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            TTWebsocketConnection build = newWebsocketConnectionBuilder.build();
            this.mWebsocketConnection = build;
            build.startConnection();
        } catch (Throwable th2) {
            th2.printStackTrace();
            throw new IllegalArgumentException("configMap contain err params !!!");
        }
    }
}
