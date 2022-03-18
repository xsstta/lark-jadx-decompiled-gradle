package com.bytedance.common.wschannel.client;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.app.OnMessageReceiveListener;
import com.bytedance.common.wschannel.event.ConnectEvent;
import com.bytedance.common.wschannel.event.ConnectionState;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.ss.android.message.C59438c;
import java.util.ArrayList;

public class AbsWsClientService extends Service implements WeakHandler.IHandler {
    private Handler mHandler = new WeakHandler(this);
    private Messenger mMessenger;

    /* access modifiers changed from: protected */
    public void onReceive(WsChannelMsg wsChannelMsg) {
    }

    /* access modifiers changed from: protected */
    public void onSendResult(String str, boolean z) {
    }

    public void onCreate() {
        super.onCreate();
        this.mMessenger = new Messenger(this.mHandler);
    }

    public void onDestroy() {
        super.onDestroy();
        if (Logger.debug()) {
            Logger.m15167d("AbsWsClientService", "onDestroy");
        }
    }

    public IBinder onBind(Intent intent) {
        return this.mMessenger.getBinder();
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message != null) {
            try {
                if (message.what == 10123) {
                    final Intent intent = (Intent) message.getData().getParcelable("DATA_INTENT");
                    Logger.m15167d("AbsWsClientService", "handleMsg = " + intent);
                    if (intent != null) {
                        C59438c.m230748a().mo202703a(new Runnable() {
                            /* class com.bytedance.common.wschannel.client.AbsWsClientService.RunnableC36582 */

                            public void run() {
                                AbsWsClientService.this.handleIntent(intent);
                            }
                        });
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void handleWsChannelMsg(Message message) {
        if (message != null) {
            try {
                message.getData().setClassLoader(WsChannelMsg.class.getClassLoader());
                if (message.what == 40) {
                    Parcelable parcelable = message.getData().getParcelable("payload");
                    if (parcelable instanceof WsChannelMsg) {
                        WsChannelMsg wsChannelMsg = (WsChannelMsg) parcelable;
                        if (Logger.debug()) {
                            Logger.m15167d("AbsWsClientService", "get wsChannelMsg = " + wsChannelMsg.toString());
                        }
                        onReceive(wsChannelMsg);
                    }
                } else if (message.what == 41) {
                    String string = message.getData().getString("payload_md5");
                    boolean z = message.getData().getBoolean("send_result");
                    if (Logger.debug()) {
                        Logger.m15167d("AbsWsClientService", "get payloadMd5 = " + string + " sendResult = " + z);
                    }
                    onSendResult(string, z);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void handleIntent(Intent intent) {
        if (intent != null) {
            try {
                String action = intent.getAction();
                if ("com.bytedance.article.wschannel.receive.connection".equals(action)) {
                    intent.setExtrasClassLoader(SocketState.class.getClassLoader());
                    SocketState socketState = (SocketState) intent.getParcelableExtra("connection");
                    try {
                        ConnectionState syncConnectState = syncConnectState(socketState.getChannelId(), socketState.getConnectionState());
                        OnMessageReceiveListener listener = WsConstants.getListener(socketState.getChannelId());
                        if (listener != null) {
                            listener.onReceiveConnectEvent(new ConnectEvent(syncConnectState, socketState.getChannelType(), socketState.getChannelId()), socketState.toJson());
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                } else if ("com.bytedance.article.wschannel.syncconnectstate".equals(action)) {
                    Logger.m15167d("AbsWsClientService", "sync socket state");
                    intent.setExtrasClassLoader(SocketState.class.getClassLoader());
                    ArrayList<SocketState> parcelableArrayListExtra = intent.getParcelableArrayListExtra("connection");
                    if (parcelableArrayListExtra != null) {
                        for (SocketState socketState2 : parcelableArrayListExtra) {
                            if (socketState2 != null) {
                                syncConnectState(socketState2.getChannelId(), socketState2.getConnectionState());
                            }
                        }
                    }
                } else {
                    intent.setExtrasClassLoader(WsChannelMsg.class.getClassLoader());
                    if ("com.bytedance.article.wschannel.receive.payload".equals(action)) {
                        Message message = new Message();
                        message.what = 40;
                        message.getData().putParcelable("payload", (WsChannelMsg) intent.getParcelableExtra("payload"));
                        handleWsChannelMsg(message);
                    } else if ("com.bytedance.article.wschannel.send.payload".equals(action)) {
                        String stringExtra = intent.getStringExtra("payload_md5");
                        boolean booleanExtra = intent.getBooleanExtra("send_result", true);
                        Message message2 = new Message();
                        message2.what = 41;
                        message2.getData().putString("payload_md5", stringExtra);
                        message2.getData().putBoolean("send_result", booleanExtra);
                        handleWsChannelMsg(message2);
                    }
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            if (Logger.debug()) {
                int intExtra = intent.getIntExtra("msg_count", -1);
                Logger.m15167d("AbsWsClientService", "count = " + intExtra);
            }
        }
    }

    private ConnectionState syncConnectState(int i, int i2) {
        ConnectionState connectionState = ConnectionState.CONNECTION_UNKNOWN;
        if (i2 == 0) {
            connectionState = ConnectionState.CONNECTION_UNKNOWN;
        } else if (i2 == 1) {
            connectionState = ConnectionState.CONNECTING;
        } else if (i2 == 2) {
            connectionState = ConnectionState.CONNECT_FAILED;
        } else if (i2 == 3) {
            connectionState = ConnectionState.CONNECT_CLOSED;
        } else if (i2 == 4) {
            connectionState = ConnectionState.CONNECTED;
        }
        if (Logger.debug()) {
            Logger.m15167d("AbsWsClientService", "state = " + i2 + " connectionState = " + connectionState);
        }
        WsConstants.setConnectionState(i, connectionState);
        return connectionState;
    }

    public int onStartCommand(final Intent intent, int i, int i2) {
        String str;
        if (Logger.debug()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onStartCommand intent = ");
            if (intent != null) {
                str = intent.toString();
            } else {
                str = "null";
            }
            sb.append(str);
            Logger.m15167d("AbsWsClientService", sb.toString());
        }
        C59438c.m230748a().mo202703a(new Runnable() {
            /* class com.bytedance.common.wschannel.client.AbsWsClientService.RunnableC36571 */

            public void run() {
                AbsWsClientService.this.handleIntent(intent);
            }
        });
        return 2;
    }
}
