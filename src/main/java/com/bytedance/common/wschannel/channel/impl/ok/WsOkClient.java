package com.bytedance.common.wschannel.channel.impl.ok;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsChannelSettings;
import com.bytedance.common.wschannel.channel.impl.ok.policy.RetryPolicy;
import com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket;
import com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatWebSocket;
import com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketListener;
import com.bytedance.common.wschannel.heartbeat.BaseHeartBeatPolicy;
import com.bytedance.common.wschannel.heartbeat.CompensateHeartBeatManager;
import com.bytedance.common.wschannel.heartbeat.HeartBeatReactListener;
import com.bytedance.common.wschannel.heartbeat.model.AppState;
import com.bytedance.common.wschannel.heartbeat.normal.NormalHeartBeatMeta;
import com.bytedance.common.wschannel.heartbeat.normal.NormalHeartBeatPolicy;
import com.bytedance.common.wschannel.server.NetworkUtils;
import com.bytedance.common.wschannel.utils.Utils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.Closeable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okio.ByteString;

/* access modifiers changed from: package-private */
public class WsOkClient implements WeakHandler.IHandler {
    public boolean isManualClose;
    public CompensateHeartBeatManager mCompensateHeartBeatManager;
    private final Config mConfig;
    private Map<String, Object> mConfigMap;
    private final Context mContext;
    public CustomHeartBeatRealWebSocket mCurrentSocket;
    private int mCurrentStatus;
    public Handler mHandler;
    public BaseHeartBeatPolicy mHeartBeatPolicy;
    private WebSocketListener mListener;
    private OkHttpClient mOkHttpClient;
    public boolean mPendingConnectAfterClosed;
    public WsPolicy mPolicy;
    private Request mRequest;
    public WsStatusListener mWsStatusListener;

    /* access modifiers changed from: package-private */
    public interface WsStatusListener {
        void onClosed(String str, int i, String str2);

        void onConnecting(String str);

        void onFailure(String str, int i, String str2);

        void onMessage(String str);

        void onMessage(ByteString byteString);

        void onOpen(Response response);
    }

    public String getErrorReason(int i) {
        return i == 0 ? "成功" : i == 404 ? "uri不存在" : i == 409 ? "fpid没有注册" : i == 410 ? "非法的设备id" : i == 411 ? "appid还没有注册" : i == 412 ? "websocket子协议不支持" : i == 413 ? "该设备已经建立连接" : i == 414 ? "服务器不能接受更多连接，可重试" : i == 415 ? "设备被限时禁止连接" : i == 416 ? "参数不正确" : i == 417 ? "鉴权失败" : i == 510 ? "服务器内部错误" : i == 511 ? "服务器忙，可稍后重试" : i == 512 ? "服务器正在关机" : i == 513 ? "auth服务异常" : i == 514 ? "auth服务返回失败" : "";
    }

    /* access modifiers changed from: package-private */
    public synchronized int getCurrentStatus() {
        return this.mCurrentStatus;
    }

    public void resetPolicy() {
        WsPolicy wsPolicy = this.mPolicy;
        if (wsPolicy != null) {
            wsPolicy.reset();
        }
    }

    private void ensureWebSocketClosed() {
        CustomHeartBeatRealWebSocket customHeartBeatRealWebSocket = this.mCurrentSocket;
        if (customHeartBeatRealWebSocket != null) {
            customHeartBeatRealWebSocket.closeQuietly(1000, "normal close");
        }
    }

    public void cancelReconnect() {
        resetPolicy();
        this.mHandler.removeMessages(1);
    }

    /* access modifiers changed from: package-private */
    public boolean isConnected() {
        if (getCurrentStatus() == 4) {
            return true;
        }
        return false;
    }

    public void reactOnSendPing() {
        this.mHandler.post(new Runnable() {
            /* class com.bytedance.common.wschannel.channel.impl.ok.WsOkClient.RunnableC36466 */

            public void run() {
                try {
                    if (WsOkClient.this.mCurrentSocket != null) {
                        Logger.m15167d("WsChannelSdk_ok", "发送ping");
                        WsOkClient.this.mCurrentSocket.sendPing(ByteString.EMPTY);
                    }
                } catch (Throwable th) {
                    WsOkClient.this.mHeartBeatPolicy.onPingSendSuccess();
                    throw th;
                }
                WsOkClient.this.mHeartBeatPolicy.onPingSendSuccess();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void stopConnect() {
        runOnHandlerThread(new Runnable() {
            /* class com.bytedance.common.wschannel.channel.impl.ok.WsOkClient.RunnableC36433 */

            public void run() {
                WsOkClient.this.isManualClose = true;
                WsOkClient.this.stopConnectInternal();
            }
        });
    }

    public static final class Builder {
        private Context mContext;
        private BaseHeartBeatPolicy mHeartBeatPolicy;
        private OkHttpClient mOkHttpClient;
        private RetryPolicy mRetryPolicy;
        private List<String> wsUrls;

        public WsOkClient build() {
            return new WsOkClient(new Config(this.mContext, this.wsUrls, this.mOkHttpClient, this.mRetryPolicy, this.mHeartBeatPolicy));
        }

        /* access modifiers changed from: package-private */
        public Builder retryPolicy(RetryPolicy retryPolicy) {
            this.mRetryPolicy = retryPolicy;
            return this;
        }

        Builder(Context context) {
            this.mContext = context;
        }

        /* access modifiers changed from: package-private */
        public Builder heartBeatPolicy(BaseHeartBeatPolicy baseHeartBeatPolicy) {
            if (baseHeartBeatPolicy != null) {
                this.mHeartBeatPolicy = baseHeartBeatPolicy;
            }
            return this;
        }
    }

    public void stopConnectInternal() {
        this.mHandler.removeMessages(2);
        this.mHandler.removeMessages(1);
        this.mHandler.removeMessages(3);
        this.mHandler.removeMessages(5);
        cancelReconnect();
        disconnect();
    }

    private int networkType() {
        NetworkUtils.NetworkType networkType = NetworkUtils.getNetworkType(this.mContext);
        if (networkType == null || networkType == NetworkUtils.NetworkType.NONE) {
            return 0;
        }
        if (networkType == NetworkUtils.NetworkType.WIFI) {
            return 1;
        }
        if (networkType == NetworkUtils.NetworkType.MOBILE_2G) {
            return 2;
        }
        if (networkType == NetworkUtils.NetworkType.MOBILE_3G) {
            return 3;
        }
        return 4;
    }

    /* access modifiers changed from: package-private */
    public void destroy() {
        this.mHandler.removeMessages(2);
        this.mHandler.removeMessages(1);
        this.mHandler.removeMessages(3);
        this.mHandler.removeMessages(5);
        runOnHandlerThread(new Runnable() {
            /* class com.bytedance.common.wschannel.channel.impl.ok.WsOkClient.RunnableC36455 */

            public void run() {
                WsOkClient.this.stopConnect();
            }
        });
    }

    public void reactOnHeartBeatTimeout() {
        WsStatusListener wsStatusListener;
        Request request = this.mRequest;
        if (!(request == null || (wsStatusListener = this.mWsStatusListener) == null)) {
            wsStatusListener.onFailure(request.url().toString(), 3, "心跳超时");
        }
        Pair<String, Long> retryUrlAndInterval = this.mPolicy.getRetryUrlAndInterval(null);
        stopConnectInternal();
        ensureWebSocketClosed();
        tryReconnect(0, (String) retryUrlAndInterval.first, true);
    }

    /* access modifiers changed from: package-private */
    public static final class Config {
        public Context mContext;
        public BaseHeartBeatPolicy mHeartBeatPolicy;
        public OkHttpClient mOkHttpClient;
        public RetryPolicy mRetryPolicy;
        public List<String> wsUrls;

        public String toString() {
            return "Config{mHeartBeatPolicy=" + this.mHeartBeatPolicy + ", mContext=" + this.mContext + ", wsUrls=" + this.wsUrls + ", mOkHttpClient=" + this.mOkHttpClient + ", mRetryPolicy=" + this.mRetryPolicy + '}';
        }

        Config(Context context, List<String> list, OkHttpClient okHttpClient, RetryPolicy retryPolicy, BaseHeartBeatPolicy baseHeartBeatPolicy) {
            this.mContext = context;
            this.wsUrls = list;
            this.mOkHttpClient = okHttpClient;
            this.mRetryPolicy = retryPolicy;
            this.mHeartBeatPolicy = baseHeartBeatPolicy;
        }
    }

    private boolean disconnect() {
        int currentStatus = getCurrentStatus();
        if (currentStatus == 3 || currentStatus == 2 || currentStatus == 5) {
            return true;
        }
        this.mHeartBeatPolicy.onDisconnected();
        CustomHeartBeatRealWebSocket customHeartBeatRealWebSocket = this.mCurrentSocket;
        if (customHeartBeatRealWebSocket == null) {
            return true;
        }
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(6, customHeartBeatRealWebSocket), 1000);
        if (currentStatus == 4) {
            this.mCurrentSocket.close(1000, "normal close");
            setStatus(6);
            return false;
        }
        this.mCurrentSocket.cancel();
        setStatus(3);
        if (currentStatus != 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void setWsStatusListener(WsStatusListener wsStatusListener) {
        this.mWsStatusListener = wsStatusListener;
    }

    private class WsListener extends WebSocketListener {
        public boolean canRetry(int i) {
            return i <= 0 || i == 414 || i == 511 || i == 512 || i == 513;
        }

        private WsListener() {
        }

        @Override // com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketListener
        public void onMessage(CustomHeartBeatWebSocket customHeartBeatWebSocket, final String str) {
            WsOkClient.this.runOnHandlerThread(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.impl.ok.WsOkClient.WsListener.RunnableC36503 */

                public void run() {
                    Logger.m15167d("WsChannelSdk_ok", "----------onMessage--------");
                    if (WsOkClient.this.mWsStatusListener != null) {
                        WsOkClient.this.mWsStatusListener.onMessage(str);
                    }
                }
            });
        }

        @Override // com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketListener
        public void onOpen(final CustomHeartBeatWebSocket customHeartBeatWebSocket, final Response response) {
            WsOkClient.this.runOnHandlerThread(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.impl.ok.WsOkClient.WsListener.RunnableC36481 */

                public void run() {
                    Logger.m15167d("WsChannelSdk_ok", "----------onOpen--------");
                    if (WsOkClient.this.mCurrentSocket == customHeartBeatWebSocket) {
                        WsOkClient.this.setStatus(4);
                        WsOkClient.this.cancelReconnect();
                        WsOkClient.this.mHeartBeatPolicy.onConnected(response);
                        if (WsOkClient.this.mWsStatusListener != null) {
                            WsOkClient.this.mWsStatusListener.onOpen(response);
                        }
                    }
                }
            });
        }

        @Override // com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketListener
        public void onPong(final CustomHeartBeatWebSocket customHeartBeatWebSocket, ByteString byteString) {
            WsOkClient.this.runOnHandlerThread(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.impl.ok.WsOkClient.WsListener.RunnableC36547 */

                public void run() {
                    if (customHeartBeatWebSocket == WsOkClient.this.mCurrentSocket) {
                        if (WsOkClient.this.mCompensateHeartBeatManager.isWaitingPong()) {
                            WsOkClient.this.mCompensateHeartBeatManager.onReceivePong();
                        } else {
                            WsOkClient.this.mHeartBeatPolicy.onReceivePong();
                        }
                    }
                }
            });
        }

        @Override // com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketListener
        public void onMessage(CustomHeartBeatWebSocket customHeartBeatWebSocket, final ByteString byteString) {
            WsOkClient.this.runOnHandlerThread(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.impl.ok.WsOkClient.WsListener.RunnableC36492 */

                public void run() {
                    Logger.m15167d("WsChannelSdk_ok", "----------onMessage--------");
                    if (WsOkClient.this.mWsStatusListener != null) {
                        WsOkClient.this.mWsStatusListener.onMessage(byteString);
                    }
                }
            });
        }

        @Override // com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketListener
        public void onClosing(CustomHeartBeatWebSocket customHeartBeatWebSocket, int i, String str) {
            super.onClosing(customHeartBeatWebSocket, i, str);
            WsOkClient.this.runOnHandlerThread(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.impl.ok.WsOkClient.WsListener.RunnableC36514 */

                public void run() {
                    Logger.m15167d("WsChannelSdk_ok", "----------onClosing--------");
                    WsOkClient.this.setStatus(6);
                }
            });
        }

        @Override // com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketListener
        public void onClosed(final CustomHeartBeatWebSocket customHeartBeatWebSocket, final int i, final String str) {
            final String safeGetUrl = WsOkClient.this.safeGetUrl(customHeartBeatWebSocket);
            WsOkClient.this.runOnHandlerThread(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.impl.ok.WsOkClient.WsListener.RunnableC36525 */

                public void run() {
                    Logger.m15167d("WsChannelSdk_ok", "----------onClosed--------");
                    if (WsOkClient.this.mCurrentSocket == customHeartBeatWebSocket) {
                        WsOkClient.this.setStatus(3);
                        WsOkClient.this.mCurrentSocket = null;
                        WsOkClient.this.mHeartBeatPolicy.onDisconnected();
                        if (WsOkClient.this.mWsStatusListener != null) {
                            WsOkClient.this.mWsStatusListener.onClosed(safeGetUrl, i, str);
                        }
                        if (WsOkClient.this.mPendingConnectAfterClosed) {
                            WsOkClient.this.mPendingConnectAfterClosed = false;
                            WsOkClient.this.tryConnect(WsOkClient.this.mPolicy.getUrl());
                        } else if (!WsOkClient.this.isManualClose) {
                            Pair<String, Long> retryUrlAndInterval = WsOkClient.this.mPolicy.getRetryUrlAndInterval(null);
                            WsOkClient.this.tryReconnect(((Long) retryUrlAndInterval.second).longValue(), (String) retryUrlAndInterval.first, true);
                        }
                    }
                }
            });
        }

        @Override // com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketListener
        public void onFailure(final CustomHeartBeatWebSocket customHeartBeatWebSocket, Throwable th, Response response) {
            final String str;
            String str2;
            final String safeGetUrl = WsOkClient.this.safeGetUrl(customHeartBeatWebSocket);
            final int errorCode = WsOkClient.this.getErrorCode(response);
            String errorReason = WsOkClient.this.getErrorReason(errorCode);
            if (StringUtils.isEmpty(errorReason)) {
                if (StringUtils.isEmpty(th.getMessage())) {
                    str2 = Log.getStackTraceString(th);
                } else {
                    str2 = th.getMessage();
                }
                str = str2;
            } else {
                str = errorReason;
            }
            final Pair<String, Long> retryUrlAndInterval = WsOkClient.this.mPolicy.getRetryUrlAndInterval(response);
            WsOkClient.this.safeClose(response);
            WsOkClient.this.runOnHandlerThread(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.impl.ok.WsOkClient.WsListener.RunnableC36536 */

                public void run() {
                    Logger.m15167d("WsChannelSdk_ok", "----------onFailure--------");
                    if (WsOkClient.this.mWsStatusListener != null) {
                        WsOkClient.this.mWsStatusListener.onFailure(safeGetUrl, errorCode, str);
                    }
                    if (WsOkClient.this.mPendingConnectAfterClosed) {
                        WsOkClient.this.mPendingConnectAfterClosed = false;
                        WsOkClient.this.tryConnect(WsOkClient.this.mPolicy.getUrl());
                    } else if (WsOkClient.this.mCurrentSocket != customHeartBeatWebSocket) {
                        Logger.m15167d("WsChannelSdk_ok", "socket已过期");
                    } else if (WsListener.this.canRetry(errorCode)) {
                        WsOkClient.this.mHeartBeatPolicy.onDisconnected();
                        WsOkClient.this.tryReconnect(((Long) retryUrlAndInterval.second).longValue(), (String) retryUrlAndInterval.first, false);
                    } else {
                        WsOkClient.this.setStatus(2);
                        WsOkClient.this.resetPolicy();
                    }
                }
            });
        }
    }

    private boolean isNetworkConnected(Context context) {
        return NetworkUtils.isNetworkAvailable(context);
    }

    private boolean sendMessage(ByteString byteString) {
        return send(byteString);
    }

    public void runOnHandlerThread(Runnable runnable) {
        this.mHandler.post(runnable);
    }

    public void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public int getErrorCode(Response response) {
        if (response == null) {
            return -1;
        }
        try {
            return Integer.parseInt(response.header("Handshake-Status"));
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    public void onAppStateChanged(boolean z) {
        this.mHandler.obtainMessage(5, Boolean.valueOf(z)).sendToTarget();
    }

    /* access modifiers changed from: package-private */
    public void onNetworkStateChanged(int i) {
        this.mHandler.obtainMessage(3, Integer.valueOf(i)).sendToTarget();
    }

    /* access modifiers changed from: package-private */
    public boolean sendMessage(byte[] bArr) {
        return sendMessage(ByteString.of(bArr));
    }

    /* access modifiers changed from: package-private */
    public void setConfigMap(Map<String, Object> map) {
        if (map != null) {
            map.remove("channel_id");
            this.mConfigMap.putAll(map);
        }
    }

    public String safeGetUrl(WebSocket webSocket) {
        Request request;
        HttpUrl url;
        if (webSocket == null || (request = webSocket.request()) == null || (url = request.url()) == null) {
            return "";
        }
        return url.toString();
    }

    private boolean send(Object obj) {
        Logger.m15167d("WsChannelSdk_ok", "send msg : " + obj);
        if (this.mCurrentSocket != null && isConnected()) {
            if (obj instanceof String) {
                return this.mCurrentSocket.send((String) obj);
            }
            if (obj instanceof ByteString) {
                return this.mCurrentSocket.send((ByteString) obj);
            }
        }
        return false;
    }

    public void tryConnect(String str) {
        if (!isNetworkConnected(this.mContext)) {
            notifyFailedAndReset(str, 1, "网络错误", true);
            return;
        }
        int currentStatus = getCurrentStatus();
        if (currentStatus != 4 && currentStatus != 1) {
            try {
                initAndConnect(str);
            } catch (Throwable th) {
                th.printStackTrace();
                if (this.mWsStatusListener != null) {
                    this.mWsStatusListener.onFailure(str, 4, Log.getStackTraceString(th));
                }
            }
        }
    }

    private WsOkClient(Config config) {
        this.mCurrentStatus = 3;
        this.mConfigMap = new ConcurrentHashMap();
        this.mHandler = new WeakHandler(Looper.myLooper(), this);
        this.mListener = new WsListener();
        this.mConfig = config;
        this.mContext = config.mContext;
        this.mOkHttpClient = config.mOkHttpClient;
        BaseHeartBeatPolicy baseHeartBeatPolicy = config.mHeartBeatPolicy;
        this.mHeartBeatPolicy = baseHeartBeatPolicy;
        if (baseHeartBeatPolicy == null) {
            this.mHeartBeatPolicy = new NormalHeartBeatPolicy(new NormalHeartBeatMeta().provideDefaultMeta());
        }
        this.mHeartBeatPolicy.init(new HeartBeatReactListener() {
            /* class com.bytedance.common.wschannel.channel.impl.ok.WsOkClient.C36411 */

            @Override // com.bytedance.common.wschannel.heartbeat.HeartBeatReactListener
            public void onHeartBeatTimeout() {
                WsOkClient.this.reactOnHeartBeatTimeout();
            }

            @Override // com.bytedance.common.wschannel.heartbeat.HeartBeatReactListener
            public void onSendPing() {
                WsOkClient.this.reactOnSendPing();
            }
        }, this.mHandler);
        this.mCompensateHeartBeatManager = new CompensateHeartBeatManager(new CompensateHeartBeatManager.OnHeartBeatTimeoutListener() {
            /* class com.bytedance.common.wschannel.channel.impl.ok.WsOkClient.C36422 */

            @Override // com.bytedance.common.wschannel.heartbeat.CompensateHeartBeatManager.OnHeartBeatTimeoutListener
            public void onTimeout() {
                WsOkClient.this.reactOnHeartBeatTimeout();
            }
        }, this.mHandler);
    }

    public synchronized void setStatus(int i) {
        this.mCurrentStatus = i;
        String str = "";
        if (i == 1) {
            str = "连接中";
        } else if (i == 2) {
            str = "连接失败";
        } else if (i == 3) {
            str = "连接关闭";
        } else if (i == 4) {
            str = "已连接";
        } else if (i == 5) {
            str = "重试中";
        } else if (i == 6) {
            str = "半关闭状态";
        }
        Logger.m15167d("WsChannelSdk_ok", "目前状态:" + str);
    }

    private void initAndConnect(String str) {
        if (this.mOkHttpClient == null) {
            this.mOkHttpClient = new OkHttpClient.Builder().protocols(Collections.singletonList(Protocol.HTTP_1_1)).build();
        }
        String createUrl = createUrl(str, this.mConfigMap);
        if (StringUtils.isEmpty(createUrl)) {
            Logger.m15170e("WsChannelSdk_ok", "url is empty,cancel connect");
            return;
        }
        ensureWebSocketClosed();
        Logger.m15167d("WsChannelSdk_ok", "尝试打开长连接:" + createUrl);
        Request request = this.mRequest;
        if (request == null || !createUrl.equals(request.url().toString())) {
            this.mRequest = new Request.Builder().addHeader("Sec-Websocket-Protocol", "pbbp").url(createUrl).build();
        }
        setStatus(1);
        CustomHeartBeatRealWebSocket create = CustomHeartBeatRealWebSocket.create(this.mRequest, WsChannelSettings.inst(this.mContext).getSocketReadLimitSize(), this.mListener);
        this.mCurrentSocket = create;
        create.connect(this.mOkHttpClient);
        this.mCompensateHeartBeatManager.setWebSocket(this.mCurrentSocket);
        WsStatusListener wsStatusListener = this.mWsStatusListener;
        if (wsStatusListener != null) {
            wsStatusListener.onConnecting(createUrl);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        AppState appState;
        if (message != null) {
            int i = message.what;
            if (i == 1) {
                if (!isConnected()) {
                    this.mHandler.removeMessages(1);
                    this.mHandler.removeMessages(2);
                    tryConnect((String) message.obj);
                }
            } else if (i == 2) {
                try {
                    this.mHandler.removeMessages(2);
                    this.mHandler.removeMessages(1);
                    this.mConfig.wsUrls = (List) message.obj;
                    this.isManualClose = false;
                    this.mPolicy = new WsPolicy(this.mConfig.wsUrls, this.mConfig.mRetryPolicy);
                    cancelReconnect();
                    tryConnect(this.mPolicy.getUrl());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } else if (i == 3) {
                this.mHandler.removeMessages(2);
                this.mHandler.removeMessages(1);
                if (!isConnected()) {
                    cancelReconnect();
                    if (!isNetworkConnected(this.mContext)) {
                        Logger.m15167d("WsChannelSdk_ok", "网络变化，但网络不通，不尝试重连");
                    } else if (disconnect()) {
                        WsPolicy wsPolicy = this.mPolicy;
                        if (wsPolicy != null) {
                            tryConnect(wsPolicy.getUrl());
                        }
                    } else {
                        this.mPendingConnectAfterClosed = true;
                    }
                }
            } else if (i == 5) {
                if (((Boolean) message.obj).booleanValue()) {
                    appState = AppState.STATE_FOREGROUND;
                } else {
                    appState = AppState.STATE_BACKGROUND;
                }
                this.mCompensateHeartBeatManager.updateCurrentAppState(appState);
                this.mHeartBeatPolicy.onAppStateUpdate(appState);
            } else if (i == 7) {
                try {
                    this.mHandler.removeMessages(2);
                    this.mHandler.removeMessages(1);
                    this.mConfig.wsUrls = (List) message.obj;
                    this.isManualClose = false;
                    this.mPolicy = new WsPolicy(this.mConfig.wsUrls, this.mConfig.mRetryPolicy);
                    cancelReconnect();
                    if (disconnect()) {
                        tryConnect(this.mPolicy.getUrl());
                    } else {
                        this.mPendingConnectAfterClosed = true;
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void connect(final Map<String, Object> map, final List<String> list) {
        if (list.isEmpty()) {
            Logger.m15170e("WsChannelSdk_ok", "error : no target ws url ,return");
        } else {
            runOnHandlerThread(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.impl.ok.WsOkClient.RunnableC36444 */

                public void run() {
                    int currentStatus = WsOkClient.this.getCurrentStatus();
                    if (currentStatus == 4 || currentStatus == 1 || currentStatus == 5) {
                        Log.d("WsChannelSdk_ok", "cancel connect :,current state = " + currentStatus);
                        return;
                    }
                    WsOkClient.this.setConfigMap(map);
                    WsOkClient wsOkClient = WsOkClient.this;
                    wsOkClient.handleMsg(wsOkClient.mHandler.obtainMessage(2, list));
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void onParameterChange(final Map<String, Object> map, final List<String> list) {
        if (list.isEmpty()) {
            Logger.m15170e("WsChannelSdk_ok", "error : no target ws url ,return");
        } else {
            runOnHandlerThread(new Runnable() {
                /* class com.bytedance.common.wschannel.channel.impl.ok.WsOkClient.RunnableC36477 */

                public void run() {
                    WsOkClient.this.setConfigMap(map);
                    WsOkClient wsOkClient = WsOkClient.this;
                    wsOkClient.handleMsg(wsOkClient.mHandler.obtainMessage(7, list));
                }
            });
        }
    }

    private String createUrl(String str, Map<String, Object> map) {
        String str2;
        if (TextUtils.isEmpty(str) || map == null) {
            return "";
        }
        String lowerCase = Utils.md5(String.valueOf(map.get("fpid")) + String.valueOf(map.get("app_key")) + String.valueOf(map.get("device_id")) + "f8a69f1719916z").toLowerCase();
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry != null && !TextUtils.isEmpty(entry.getKey())) {
                if (entry.getValue() == null) {
                    str2 = "";
                } else {
                    str2 = entry.getValue().toString();
                }
                String key = entry.getKey();
                if (!StringUtils.equal("app_key", key) && !StringUtils.equal(key, "extra")) {
                    if (StringUtils.equal("app_version", key)) {
                        buildUpon.appendQueryParameter("version_code", str2);
                    } else {
                        buildUpon.appendQueryParameter(key, str2);
                    }
                }
            }
        }
        String str3 = (String) map.get("extra");
        if (!StringUtils.isEmpty(str3)) {
            String[] split = str3.split(ContainerUtils.FIELD_DELIMITER);
            for (String str4 : split) {
                if (!TextUtils.isEmpty(str4)) {
                    String[] split2 = str4.split(ContainerUtils.KEY_VALUE_DELIMITER);
                    if (split2.length == 2) {
                        buildUpon.appendQueryParameter(split2[0], split2[1]);
                    }
                }
            }
        }
        buildUpon.appendQueryParameter("access_key", lowerCase);
        buildUpon.appendQueryParameter("ne", String.valueOf(networkType()));
        return buildUpon.build().toString();
    }

    public void tryReconnect(long j, String str, boolean z) {
        this.mHandler.removeMessages(1);
        if (!isNetworkConnected(this.mContext)) {
            notifyFailedAndReset(str, 1, "网络错误", z);
            Logger.m15167d("WsChannelSdk_ok", "网路不连通，取消重试");
        } else if (this.isManualClose) {
            Logger.m15167d("WsChannelSdk_ok", "手动关闭");
        } else {
            if (j == -1 || StringUtils.isEmpty(str)) {
                Logger.m15167d("WsChannelSdk_ok", "retry finished ---> interval: " + j + " , url :" + str);
                Logger.m15167d("WsChannelSdk_ok", "这一轮重试结束，等待下一轮重试");
                Bundle bundle = new Bundle();
                bundle.putString("method", "tryReconnect");
                bundle.putLong("interval", j);
                notifyFailedAndReset(str, 2, "重试失败", z);
                str = this.mPolicy.getUrl();
            } else {
                setStatus(5);
            }
            Logger.m15167d("WsChannelSdk_ok", "下一次重试时间: " + Utils.getTimeFormat(System.currentTimeMillis() + j));
            Message message = new Message();
            message.what = 1;
            message.obj = str;
            this.mHandler.sendMessageDelayed(message, j);
        }
    }

    private void notifyFailedAndReset(String str, int i, String str2, boolean z) {
        setStatus(2);
        resetPolicy();
        WsStatusListener wsStatusListener = this.mWsStatusListener;
        if (wsStatusListener != null && z) {
            wsStatusListener.onFailure(str, i, str2);
        }
    }
}
