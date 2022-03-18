package com.bytedance.common.wschannel.channel.impl.ok.ws;

import okhttp3.WebSocket;
import okio.ByteString;

public interface CustomHeartBeatWebSocket extends WebSocket {
    void sendPing(ByteString byteString);
}
