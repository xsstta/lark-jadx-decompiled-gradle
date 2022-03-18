package com.bytedance.common.wschannel.server;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsChannelSettings;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IMessageHandler;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.client.WsClientService;
import com.bytedance.common.wschannel.converter.MsgConverterFactory;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.common.wschannel.utils.Utils;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

class WsChannelMsgHandler implements IMessageHandler {
    public static AtomicBoolean mDispatcherAlive = new AtomicBoolean(true);
    private final Map<Integer, SocketState> mChannelState;
    public final Context mContext;
    private ExecutorService mExecutorService = Executors.newSingleThreadExecutor();
    private Runnable mMessageDispatcher = createMessageDispatcher();
    private Future<?> mMessageDispatcherFeature = null;
    public BlockingQueue<WsChannelService.Msg> mMessageQueue = new LinkedBlockingQueue();
    private final ClientMsgSender mMessageSender;
    private final Map<Integer, IWsApp> mWsApps;

    private Runnable createMessageDispatcher() {
        return new Runnable() {
            /* class com.bytedance.common.wschannel.server.WsChannelMsgHandler.RunnableC36802 */

            public void run() {
                try {
                    Thread.currentThread().setName("MessageDispatcher");
                    while (true) {
                        Thread.currentThread();
                        if (Thread.interrupted()) {
                            break;
                        }
                        WsChannelMsgHandler.mDispatcherAlive.getAndSet(true);
                        try {
                            WsChannelMsgHandler.this.handleMessage(WsChannelMsgHandler.this.mMessageQueue.take());
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                WsChannelMsgHandler.mDispatcherAlive.getAndSet(false);
            }
        };
    }

    /* access modifiers changed from: package-private */
    public void tryResendMsg() {
        this.mMessageSender.tryResendMsg();
    }

    private void startMessageDispatcher() {
        if (this.mMessageDispatcher == null) {
            this.mMessageDispatcher = createMessageDispatcher();
        }
        try {
            this.mMessageDispatcherFeature = this.mExecutorService.submit(this.mMessageDispatcher);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void syncSocketState() {
        try {
            Intent intent = new Intent();
            intent.setAction("com.bytedance.article.wschannel.syncconnectstate");
            intent.setComponent(new ComponentName(this.mContext, WsClientService.class));
            intent.putParcelableArrayListExtra("connection", new ArrayList<>(this.mChannelState.values()));
            startOrBindService(intent);
            Logger.m15167d("WsChannelSdk", "try sync socket state to main process");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void startOrBindService(Intent intent) {
        this.mMessageSender.sendMsg(intent);
    }

    private void trySyncCurrentState(final IWsChannelClient iWsChannelClient) {
        if (WsChannelSettings.inst(this.mContext).isReportAppStateEnable()) {
            ChannelManager.inst(this.mContext).runOnHandlerThread(new Runnable() {
                /* class com.bytedance.common.wschannel.server.WsChannelMsgHandler.RunnableC36791 */

                public void run() {
                    iWsChannelClient.sendMessage(ChannelManager.inst(WsChannelMsgHandler.this.mContext).createStateChangedMsg());
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void onConnection(SocketState socketState) {
        if (socketState != null) {
            this.mChannelState.put(Integer.valueOf(socketState.getChannelId()), socketState);
            try {
                Intent intent = new Intent();
                intent.setAction("com.bytedance.article.wschannel.receive.connection");
                intent.setComponent(new ComponentName(this.mContext, WsClientService.class));
                intent.putExtra("connection", socketState);
                startOrBindService(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void handleMessage(WsChannelService.Msg msg) {
        if (msg != null && msg.data != null) {
            try {
                byte[] bArr = msg.data;
                if (Logger.debug()) {
                    Logger.m15167d("WsChannelService", "data = " + Utils.byte2HexStr(bArr) + " data.length = " + bArr.length);
                }
                WsChannelMsg decode = MsgConverterFactory.getConverter().decode(bArr);
                if (decode != WsChannelMsg.EMPTY) {
                    decode.setChannelId(msg.channelId);
                    decode.setReplayToComponentName(new ComponentName(this.mContext, WsChannelService.class));
                    if (Logger.debug()) {
                        Logger.m15167d("WsChannelService", "version =  seqId = " + decode.getSeqId() + " logId = " + decode.getLogId() + " wsChannelMsg = " + decode.toString());
                    }
                    Map<Integer, IWsApp> map = this.mWsApps;
                    if (map != null && map.size() > 0) {
                        for (Map.Entry<Integer, IWsApp> entry : this.mWsApps.entrySet()) {
                            IWsApp value = entry.getValue();
                            if (value != null && value.getChannelId() == decode.getChannelId()) {
                                try {
                                    Intent intent = new Intent();
                                    intent.setAction("com.bytedance.article.wschannel.receive.payload");
                                    intent.setComponent(new ComponentName(this.mContext, WsClientService.class));
                                    intent.putExtra("payload", decode);
                                    startOrBindService(intent);
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                if (th2 instanceof ProtocolException) {
                    Logger.m15170e("WsChannelSdk", "不支持的消息协议，忽略此消息");
                } else {
                    th2.printStackTrace();
                }
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IMessageHandler
    public void onMessage(int i, byte[] bArr) {
        if (bArr != null) {
            try {
                WsChannelService.Msg msg = new WsChannelService.Msg();
                msg.channelId = i;
                msg.data = bArr;
                this.mMessageQueue.offer(msg);
                mDispatcherAlive.getAndSet(true);
                startMessageDispatcher();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IMessageHandler
    public void onConnection(IWsChannelClient iWsChannelClient, int i, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("channel_id", i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            onConnection(SocketState.fromJson(jSONObject));
            trySyncCurrentState(iWsChannelClient);
        }
    }

    WsChannelMsgHandler(Context context, Map<Integer, SocketState> map, Map<Integer, IWsApp> map2) {
        this.mContext = context;
        this.mChannelState = map;
        this.mWsApps = map2;
        this.mMessageSender = new ClientMsgSender(context, WsClientService.class);
        startMessageDispatcher();
    }
}
