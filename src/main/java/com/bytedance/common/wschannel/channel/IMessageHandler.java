package com.bytedance.common.wschannel.channel;

import org.json.JSONObject;

public interface IMessageHandler {
    void onConnection(IWsChannelClient iWsChannelClient, int i, JSONObject jSONObject);

    void onMessage(int i, byte[] bArr);
}
