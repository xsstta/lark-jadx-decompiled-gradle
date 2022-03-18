package com.bytedance.common.wschannel.channel.impl.ok;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.channel.impl.ok.WsOkClient;
import com.bytedance.common.wschannel.log.WsChannelLog;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.UnsupportedEncodingException;
import okhttp3.Response;
import okio.ByteString;
import org.json.JSONObject;

class WsStatusChangedListener implements WsOkClient.WsStatusListener {
    private final Context mContext;
    private final IWsChannelClient mWsChannelClient;
    private final WsOkClient mWsClient;

    @Override // com.bytedance.common.wschannel.channel.impl.ok.WsOkClient.WsStatusListener
    public void onConnecting(String str) {
        if (this.mWsChannelClient != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ShareHitPoint.f121869d, 1);
                jSONObject.put("state", 1);
                jSONObject.put("url", str);
                jSONObject.put("channel_type", 2);
                this.mWsChannelClient.onConnection(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.impl.ok.WsOkClient.WsStatusListener
    public void onMessage(String str) {
        Logger.m15167d("WsChannelSdk_ok", "onMessage():" + str);
        IWsChannelClient iWsChannelClient = this.mWsChannelClient;
        if (iWsChannelClient != null) {
            try {
                iWsChannelClient.onMessage(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.impl.ok.WsOkClient.WsStatusListener
    public void onMessage(ByteString byteString) {
        Logger.m15167d("WsChannelSdk_ok", "onMessage() : " + byteString.toString());
        IWsChannelClient iWsChannelClient = this.mWsChannelClient;
        if (iWsChannelClient != null) {
            iWsChannelClient.onMessage(byteString.toByteArray());
        }
    }

    @Override // com.bytedance.common.wschannel.channel.impl.ok.WsOkClient.WsStatusListener
    public void onOpen(Response response) {
        Logger.m15167d("WsChannelSdk_ok", "onOpen(): " + response.toString());
        if (this.mWsChannelClient != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ShareHitPoint.f121869d, 1);
                jSONObject.put("state", 4);
                jSONObject.put("url", response.request().url().toString());
                jSONObject.put("channel_type", 2);
                this.mWsChannelClient.onConnection(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    WsStatusChangedListener(Context context, WsOkClient wsOkClient, IWsChannelClient iWsChannelClient) {
        this.mWsClient = wsOkClient;
        this.mWsChannelClient = iWsChannelClient;
        this.mContext = context;
    }

    @Override // com.bytedance.common.wschannel.channel.impl.ok.WsOkClient.WsStatusListener
    public void onClosed(String str, int i, String str2) {
        Logger.m15167d("WsChannelSdk_ok", "onClosed() : " + str2);
        if (this.mWsChannelClient != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ShareHitPoint.f121869d, 0);
                jSONObject.put("state", 3);
                jSONObject.put("url", str);
                jSONObject.put("channel_type", 2);
                this.mWsChannelClient.onConnection(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.impl.ok.WsOkClient.WsStatusListener
    public void onFailure(String str, int i, String str2) {
        Logger.m15167d("WsChannelSdk_ok", "onFailure() : " + str2);
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putInt("error_code", i);
        bundle.putString("error_msg", str2);
        bundle.putString("method", "onFailure");
        WsChannelLog.onEventV3Bundle(this.mContext, "WsChannelSdk_ok", bundle);
        if (this.mWsChannelClient != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ShareHitPoint.f121869d, 0);
                jSONObject.put("state", 2);
                jSONObject.put("url", str);
                jSONObject.put("channel_type", 2);
                jSONObject.put("error", str2);
                jSONObject.put("error_code", i);
                this.mWsChannelClient.onConnection(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
