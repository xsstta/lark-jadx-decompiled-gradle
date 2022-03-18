package com.bytedance.common.wschannel.converter;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.io.IOException;

public interface MsgConverter {
    WsChannelMsg decode(byte[] bArr) throws IOException;

    byte[] encode(WsChannelMsg wsChannelMsg);
}
