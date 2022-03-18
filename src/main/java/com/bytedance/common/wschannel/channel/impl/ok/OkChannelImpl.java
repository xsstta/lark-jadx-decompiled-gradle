package com.bytedance.common.wschannel.channel.impl.ok;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.common.wschannel.WsChannelSdk;
import com.bytedance.common.wschannel.WsChannelSettings;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.channel.impl.ok.WsOkClient;
import com.bytedance.common.wschannel.channel.impl.ok.policy.RetryTimesPolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class OkChannelImpl implements WeakHandler.IHandler, IWsChannelClient {
    private final int mChannelId;
    public Map<String, Object> mConfigMap = new HashMap();
    public Context mContext;
    private Handler mHandler;
    private boolean mHasInit;
    private ContentObserver mOkChannelEnableObserver = new ContentObserver(this.mHandler) {
        /* class com.bytedance.common.wschannel.channel.impl.ok.OkChannelImpl.C36401 */

        public void onChange(boolean z) {
            super.onChange(z);
            OkChannelImpl okChannelImpl = OkChannelImpl.this;
            if (okChannelImpl.okChannelEnable(okChannelImpl.mContext)) {
                OkChannelImpl okChannelImpl2 = OkChannelImpl.this;
                okChannelImpl2.openConnection(okChannelImpl2.mConfigMap, OkChannelImpl.this.mUrls);
                return;
            }
            OkChannelImpl.this.stopConnection();
        }
    };
    public List<String> mUrls;
    private WsOkClient mWsClient;

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean isConnected() {
        return this.mWsClient.isConnected();
    }

    private void unregisterObserver() {
        try {
            Context context = this.mContext;
            if (context != null) {
                context.getContentResolver().unregisterContentObserver(this.mOkChannelEnableObserver);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void stopConnection() {
        Log.d("WsChannelSdk_ok", "stopConnection(),channelId = " + this.mChannelId);
        this.mWsClient.stopConnect();
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void destroy() {
        Log.d("WsChannelSdk_ok", "destroy() , channelId = " + this.mChannelId);
        this.mWsClient.destroy();
        unregisterObserver();
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onConnection(JSONObject jSONObject) {
        Log.d("WsChannelSdk_ok", "onConnection()");
    }

    public boolean okChannelEnable(Context context) {
        return WsChannelSettings.inst(context).isOkChannelEnable();
    }

    private void observerSpChanged(Context context) {
        try {
            context.getContentResolver().registerContentObserver(WsChannelMultiProcessSharedProvider.getContentUri(context, "key_ok_impl_enable", "boolean"), true, this.mOkChannelEnableObserver);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onMessage(byte[] bArr) {
        Log.d("WsChannelSdk_ok", "onMessage(),channel = " + this.mChannelId);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onAppStateChanged(int i) {
        if (okChannelEnable(this.mContext)) {
            Log.d("WsChannelSdk_ok", "onAppStateChanged(), channelId = " + this.mChannelId);
            WsOkClient wsOkClient = this.mWsClient;
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            wsOkClient.onAppStateChanged(z);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onNetworkStateChanged(int i) {
        if (okChannelEnable(this.mContext)) {
            Log.d("WsChannelSdk_ok", "onNetworkStateChanged(), channelId = " + this.mChannelId);
            this.mWsClient.onNetworkStateChanged(i);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean sendMessage(byte[] bArr) {
        if (!okChannelEnable(this.mContext)) {
            return false;
        }
        Log.d("WsChannelSdk_ok", "sendMessage(),channelId = " + this.mChannelId);
        return this.mWsClient.sendMessage(bArr);
    }

    public OkChannelImpl(int i, Handler handler) {
        this.mChannelId = i;
        this.mHandler = handler;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void openConnection(Map<String, Object> map, List<String> list) {
        if (map != null) {
            this.mConfigMap.putAll(map);
        }
        this.mUrls = list;
        if (okChannelEnable(this.mContext)) {
            this.mWsClient.connect(map, list);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onParameterChange(Map<String, Object> map, List<String> list) {
        if (map != null) {
            this.mConfigMap.putAll(map);
        }
        this.mUrls = list;
        if (okChannelEnable(this.mContext)) {
            Log.d("WsChannelSdk_ok", "onParameterChange(),channelId = " + this.mChannelId);
            this.mWsClient.onParameterChange(map, list);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void init(Context context, IWsChannelClient iWsChannelClient) {
        if (!this.mHasInit) {
            this.mHasInit = true;
            Log.d("WsChannelSdk_ok", "init() , channelId = " + this.mChannelId);
            this.mContext = context.getApplicationContext();
            WsOkClient build = new WsOkClient.Builder(context).retryPolicy(new RetryTimesPolicy(context)).heartBeatPolicy(WsChannelSdk.getHeartBeatPolicy(this.mChannelId)).build();
            this.mWsClient = build;
            build.setWsStatusListener(new WsStatusChangedListener(this.mContext, build, iWsChannelClient));
            observerSpChanged(context);
        }
    }
}
