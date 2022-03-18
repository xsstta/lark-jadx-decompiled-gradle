package com.bytedance.common.wschannel.app;

import com.bytedance.common.wschannel.event.ConnectEvent;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import org.json.JSONObject;

public interface OnMessageReceiveListener {
    void onReceiveConnectEvent(ConnectEvent connectEvent, JSONObject jSONObject);

    void onReceiveMsg(WsChannelMsg wsChannelMsg);
}
