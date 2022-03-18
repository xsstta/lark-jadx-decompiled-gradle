package com.bytedance.frameworks.baselib.network.http.cronet.websocket;

import org.json.JSONObject;

public interface IMessageReceiveListener {
    void onConnection(int i, String str, JSONObject jSONObject);

    void onFeedBackLog(String str);

    void onMessage(byte[] bArr, int i);
}
