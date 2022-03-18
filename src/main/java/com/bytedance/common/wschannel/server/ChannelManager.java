package com.bytedance.common.wschannel.server;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsChannelSettings;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.channel.WsChannelClient;
import com.bytedance.common.wschannel.converter.MsgConverterFactory;
import com.bytedance.common.wschannel.log.WsChannelLog;
import com.bytedance.common.wschannel.model.IntegerParcelable;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelEnableObserver;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class ChannelManager implements WeakHandler.IHandler, WsChannelEnableObserver.OnWsChannelEnableChangedObserver {
    private static ChannelManager sInstance;
    public final WsChannelSaver mChannelSaver;
    private Map<Integer, SocketState> mChannelState = new ConcurrentHashMap();
    public final Context mContext;
    private AtomicLong mCounter = new AtomicLong(0);
    public final HandlerThread mHandlerThread;
    private boolean mIsForeground = false;
    private final Object mLock = new Object();
    private final WsChannelMsgHandler mMessageHandler;
    public final WeakHandler mThreadHandler;
    private Map<Integer, IWsApp> mWsAppMap = new ConcurrentHashMap();
    private Map<Integer, IWsChannelClient> mWsChannelClientMap = new ConcurrentHashMap();
    public WsChannelEnableObserver mWsChannelEnableObserver;

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    private boolean isForeground() {
        return this.mIsForeground;
    }

    private boolean isEnable() {
        return this.mWsChannelEnableObserver.isEnable();
    }

    public void stopAllSocket() {
        try {
            synchronized (this.mLock) {
                for (Map.Entry<Integer, IWsChannelClient> entry : this.mWsChannelClientMap.entrySet()) {
                    IWsChannelClient value = entry.getValue();
                    if (value != null) {
                        value.destroy();
                    }
                }
                this.mWsChannelClientMap.clear();
            }
            this.mWsAppMap.clear();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public byte[] createStateChangedMsg() {
        String str;
        WsChannelMsg.Builder payloadType = WsChannelMsg.Builder.create(Integer.MAX_VALUE).setMethod(4).setService(ConnectionResult.NETWORK_ERROR).setLogId(1008601).setPayload(new byte[0]).setPayloadEncoding("pb").setPayloadType("pb");
        if (isForeground()) {
            str = "0";
        } else {
            str = "1";
        }
        return MsgConverterFactory.getConverter().encode(payloadType.addMsgHeader("IsBackground", str).build());
    }

    public void runOnHandlerThread(Runnable runnable) {
        this.mThreadHandler.post(runnable);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        final Message obtain = Message.obtain(message);
        runOnHandlerThread(new Runnable() {
            /* class com.bytedance.common.wschannel.server.ChannelManager.RunnableC36742 */

            public void run() {
                ChannelManager.this.doHandleMsg(obtain);
            }
        });
    }

    @Override // com.bytedance.common.wschannel.server.WsChannelEnableObserver.OnWsChannelEnableChangedObserver
    public void onWsChannelEnableChange(boolean z) {
        if (z) {
            tryConnectIfEnable(this.mChannelSaver.loadWsChannels());
        } else {
            stopAllSocket();
        }
    }

    public static ChannelManager inst(Context context) {
        if (sInstance == null) {
            synchronized (ChannelManager.class) {
                if (sInstance == null) {
                    sInstance = new ChannelManager(context);
                }
            }
        }
        return sInstance;
    }

    private void onNullParamLog(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("param_name", str);
        WsChannelLog.onEventV3Bundle(this.mContext, "wschannel_param_null", bundle);
    }

    private void sendAppStateChangeEvent(Collection<IWsChannelClient> collection) {
        if (WsChannelSettings.inst(this.mContext).isReportAppStateEnable()) {
            byte[] createStateChangedMsg = createStateChangedMsg();
            for (IWsChannelClient iWsChannelClient : collection) {
                try {
                    iWsChannelClient.sendMessage(createStateChangedMsg);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void tryConnectIfEnable(Map<Integer, IWsApp> map) {
        if (this.mWsChannelEnableObserver.isEnable() && map != null) {
            for (IWsApp iWsApp : map.values()) {
                if (iWsApp != null) {
                    doRegisterChannel(iWsApp);
                }
            }
        }
    }

    private ChannelManager(Context context) {
        HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("wschannel");
        this.mHandlerThread = new_android_os_HandlerThread_by_knot;
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        new_android_os_HandlerThread_by_knot.start();
        this.mThreadHandler = new WeakHandler(new_android_os_HandlerThread_by_knot.getLooper(), this);
        this.mChannelSaver = new WsChannelSaver(applicationContext);
        this.mMessageHandler = new WsChannelMsgHandler(applicationContext, this.mChannelState, this.mWsAppMap);
        runOnHandlerThread(new Runnable() {
            /* class com.bytedance.common.wschannel.server.ChannelManager.RunnableC36731 */

            public void run() {
                ChannelManager channelManager = ChannelManager.this;
                channelManager.mWsChannelEnableObserver = new WsChannelEnableObserver(channelManager.mContext, ChannelManager.this.mThreadHandler, ChannelManager.this);
                ChannelManager channelManager2 = ChannelManager.this;
                channelManager2.tryConnectIfEnable(channelManager2.mChannelSaver.loadWsChannels());
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        r0 = getConfigMap(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r0 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        r1.onParameterChange(r0, r6.getConnectUrls());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        throw new java.lang.IllegalArgumentException("configMap is empty !!!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void doOnParamChange(com.bytedance.common.wschannel.app.IWsApp r6) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.ChannelManager.doOnParamChange(com.bytedance.common.wschannel.app.IWsApp):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r3 == null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void doRegisterChannel(com.bytedance.common.wschannel.app.IWsApp r8) {
        /*
            r7 = this;
            int r0 = com.bytedance.common.wschannel.server.WsChannelService.getClientKey(r8)
            boolean r1 = r7.isEnable()
            if (r1 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.Class<com.bytedance.common.wschannel.server.WsChannelService> r1 = com.bytedance.common.wschannel.server.WsChannelService.class
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.app.IWsApp> r2 = r7.mWsAppMap     // Catch:{ all -> 0x0055 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0055 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0055 }
            com.bytedance.common.wschannel.app.IWsApp r2 = (com.bytedance.common.wschannel.app.IWsApp) r2     // Catch:{ all -> 0x0055 }
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.channel.IWsChannelClient> r3 = r7.mWsChannelClientMap     // Catch:{ all -> 0x0055 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0055 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0055 }
            com.bytedance.common.wschannel.channel.IWsChannelClient r3 = (com.bytedance.common.wschannel.channel.IWsChannelClient) r3     // Catch:{ all -> 0x0055 }
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0035
            boolean r6 = r8.equals(r2)     // Catch:{ all -> 0x0055 }
            if (r6 == 0) goto L_0x0035
            if (r3 != 0) goto L_0x0033
        L_0x0032:
            r4 = 1
        L_0x0033:
            r5 = 0
            goto L_0x0048
        L_0x0035:
            if (r2 != 0) goto L_0x0048
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.app.IWsApp> r2 = r7.mWsAppMap     // Catch:{ all -> 0x0055 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0055 }
            r2.put(r0, r8)     // Catch:{ all -> 0x0055 }
            com.bytedance.common.wschannel.server.WsChannelSaver r0 = r7.mChannelSaver     // Catch:{ all -> 0x0055 }
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.app.IWsApp> r2 = r7.mWsAppMap     // Catch:{ all -> 0x0055 }
            r0.saveWsChannels(r2)     // Catch:{ all -> 0x0055 }
            goto L_0x0032
        L_0x0048:
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            if (r4 == 0) goto L_0x004f
            r7.tryOpenConnection(r8)
            goto L_0x0054
        L_0x004f:
            if (r5 == 0) goto L_0x0054
            r7.doOnParamChange(r8)
        L_0x0054:
            return
        L_0x0055:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.ChannelManager.doRegisterChannel(com.bytedance.common.wschannel.app.IWsApp):void");
    }

    private Map<String, Object> getConfigMap(IWsApp iWsApp) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("app_key", iWsApp.getAppKey());
        hashMap.put("fpid", Integer.valueOf(iWsApp.getFPID()));
        hashMap.put("sdk_version", 2);
        hashMap.put("platform", 0);
        hashMap.put("app_version", Integer.valueOf(iWsApp.getAppVersion()));
        hashMap.put("aid", Integer.valueOf(iWsApp.getAppId()));
        hashMap.put("device_id", iWsApp.getDeviceId());
        hashMap.put("iid", iWsApp.getInstallId());
        hashMap.put("channel_id", Integer.valueOf(iWsApp.getChannelId()));
        String extra = iWsApp.getExtra();
        if (extra == null) {
            onNullParamLog("extra");
            extra = "";
        }
        if (WsChannelSettings.inst(this.mContext).isReportAppStateEnable()) {
            String[] split = extra.split(ContainerUtils.FIELD_DELIMITER);
            StringBuilder sb = new StringBuilder();
            sb.append("is_background=");
            if (isForeground()) {
                str = "0";
            } else {
                str = "1";
            }
            sb.append(str);
            String sb2 = sb.toString();
            if (split.length <= 0 || TextUtils.isEmpty(split[0])) {
                extra = sb2;
            } else {
                extra = extra + ContainerUtils.FIELD_DELIMITER + sb2;
            }
        }
        hashMap.put("extra", extra);
        if (iWsApp.getDeviceId() == null) {
            onNullParamLog("device_id");
        }
        if (iWsApp.getInstallId() == null) {
            onNullParamLog("install_id");
        }
        if (StringUtils.isEmpty(iWsApp.getAppKey())) {
            onNullParamLog("app_key");
        }
        return hashMap;
    }

    private void tryOpenConnection(IWsApp iWsApp) {
        IWsChannelClient iWsChannelClient;
        if (Logger.debug()) {
            Logger.m15167d("WsChannelService", "tryOpenConnection");
        }
        synchronized (this.mLock) {
            iWsChannelClient = this.mWsChannelClientMap.get(Integer.valueOf(iWsApp.getChannelId()));
            if (iWsChannelClient == null) {
                iWsChannelClient = WsChannelClient.newInstance(iWsApp.getChannelId(), this.mMessageHandler, this.mThreadHandler);
                iWsChannelClient.init(this.mContext, iWsChannelClient);
                this.mWsChannelClientMap.put(Integer.valueOf(iWsApp.getChannelId()), iWsChannelClient);
            }
        }
        if (iWsChannelClient.isConnected()) {
            SocketState socketState = this.mChannelState.get(Integer.valueOf(iWsApp.getChannelId()));
            Logger.m15167d("WsChannelService", "state = " + socketState);
            if (socketState != null) {
                try {
                    this.mMessageHandler.onConnection(socketState);
                } catch (Throwable unused) {
                }
            }
        } else {
            try {
                if (Logger.debug()) {
                    Logger.m15167d("WsChannelService", "尝试打开长连接,channelId = " + iWsApp.getChannelId());
                }
                Map<String, Object> configMap = getConfigMap(iWsApp);
                if (configMap != null) {
                    iWsChannelClient.openConnection(configMap, iWsApp.getConnectUrls());
                    return;
                }
                throw new IllegalArgumentException("configMap is empty !!!");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void doHandleMsg(Message message) {
        boolean z;
        IWsChannelClient remove;
        try {
            int i = message.what;
            if (i == 0) {
                message.getData().setClassLoader(SsWsApp.class.getClassLoader());
                Parcelable parcelable = message.getData().getParcelable("ws_app");
                if (parcelable instanceof IWsApp) {
                    doRegisterChannel((IWsApp) parcelable);
                    return;
                }
                return;
            }
            boolean z2 = true;
            if (i == 1) {
                message.getData().setClassLoader(SsWsApp.class.getClassLoader());
                Parcelable parcelable2 = message.getData().getParcelable("ws_app");
                if (parcelable2 instanceof IntegerParcelable) {
                    int data = ((IntegerParcelable) parcelable2).getData();
                    synchronized (WsChannelService.class) {
                        this.mWsAppMap.remove(Integer.valueOf(data));
                        this.mChannelSaver.saveWsChannels(this.mWsAppMap);
                    }
                    synchronized (this.mLock) {
                        remove = this.mWsChannelClientMap.remove(Integer.valueOf(data));
                    }
                    if (remove != null) {
                        if (Logger.debug()) {
                            Logger.m15167d("WsChannelService", "stopConnection,channelId = " + data);
                        }
                        remove.destroy();
                    }
                    this.mChannelState.remove(Integer.valueOf(data));
                    this.mThreadHandler.sendMessageDelayed(this.mThreadHandler.obtainMessage(8, remove), 1000);
                    return;
                }
                return;
            }
            boolean z3 = false;
            if (i == 2) {
                int i2 = message.arg1;
                if (Logger.debug()) {
                    Logger.m15167d("WsChannelService", "appState = " + i2);
                }
                if (i2 != 1) {
                    z2 = false;
                }
                this.mIsForeground = z2;
                this.mMessageHandler.tryResendMsg();
                if (isEnable()) {
                    sendAppStateChangeEvent(this.mWsChannelClientMap.values());
                    for (IWsChannelClient iWsChannelClient : this.mWsChannelClientMap.values()) {
                        if (iWsChannelClient != null) {
                            iWsChannelClient.onAppStateChanged(i2);
                        }
                    }
                }
            } else if (i == 3) {
                int i3 = message.arg1;
                if (Logger.debug()) {
                    Logger.m15167d("WsChannelService", "networkState = " + i3);
                }
                this.mMessageHandler.tryResendMsg();
                if (isEnable()) {
                    for (IWsChannelClient iWsChannelClient2 : this.mWsChannelClientMap.values()) {
                        if (iWsChannelClient2 != null) {
                            iWsChannelClient2.onNetworkStateChanged(i3);
                        }
                    }
                }
            } else if (i == 4) {
                message.getData().setClassLoader(SsWsApp.class.getClassLoader());
                Parcelable parcelable3 = message.getData().getParcelable("ws_app");
                if (parcelable3 instanceof IWsApp) {
                    doOnParamChange((IWsApp) parcelable3);
                }
            } else if (i == 5 || i == 10) {
                if (i == 10) {
                    z = true;
                } else {
                    z = false;
                }
                message.getData().setClassLoader(WsChannelMsg.class.getClassLoader());
                Parcelable parcelable4 = message.getData().getParcelable("payload");
                if (parcelable4 instanceof WsChannelMsg) {
                    WsChannelMsg wsChannelMsg = (WsChannelMsg) parcelable4;
                    if (wsChannelMsg.getSeqId() <= 0) {
                        wsChannelMsg.setSeqId(this.mCounter.incrementAndGet());
                    }
                    IWsChannelClient iWsChannelClient3 = this.mWsChannelClientMap.get(Integer.valueOf(wsChannelMsg.getChannelId()));
                    if (z) {
                        Logger.m15167d("WsChannelService", "retry send msg");
                    }
                    if (iWsChannelClient3 != null && !(z3 = iWsChannelClient3.sendMessage(MsgConverterFactory.getConverter().encode(wsChannelMsg))) && !z) {
                        long retryDelay = WsChannelSettings.inst(this.mContext).getRetryDelay();
                        if (retryDelay > 0) {
                            Message obtain = Message.obtain(message);
                            obtain.what = 10;
                            this.mThreadHandler.sendMessageDelayed(obtain, retryDelay);
                        }
                    }
                    if (Logger.debug()) {
                        Logger.m15167d("WsChannelService", "send payload success = " + z3);
                    }
                    ComponentName replayToComponentName = wsChannelMsg.getReplayToComponentName();
                    if (replayToComponentName != null) {
                        try {
                            byte[] payload = wsChannelMsg.getPayload();
                            if (payload == null) {
                                payload = new byte[1];
                            }
                            Intent intent = new Intent();
                            intent.setAction("com.bytedance.article.wschannel.send.payload");
                            intent.setComponent(replayToComponentName);
                            intent.putExtra("send_result", z3);
                            intent.putExtra("payload_md5", DigestUtils.md5Hex(payload));
                            if (Logger.debug()) {
                                Logger.m15167d("WsChannelService", "send result = " + z3 + " payloadMd5 = " + intent.getStringExtra("payload_md5"));
                            }
                            this.mContext.startService(intent);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            } else if (i == 9) {
                this.mMessageHandler.syncSocketState();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
