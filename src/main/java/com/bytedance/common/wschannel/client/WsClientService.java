package com.bytedance.common.wschannel.client;

import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.app.OnMessageReceiveListener;
import com.bytedance.common.wschannel.model.WsChannelMsg;

public class WsClientService extends AbsWsClientService {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.common.wschannel.client.AbsWsClientService
    public void onReceive(WsChannelMsg wsChannelMsg) {
        super.onReceive(wsChannelMsg);
        if (wsChannelMsg != null) {
            try {
                OnMessageReceiveListener listener = WsConstants.getListener(wsChannelMsg.getChannelId());
                if (listener != null) {
                    listener.onReceiveMsg(wsChannelMsg);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.common.wschannel.client.AbsWsClientService
    public void onSendResult(String str, boolean z) {
        super.onSendResult(str, z);
    }
}
