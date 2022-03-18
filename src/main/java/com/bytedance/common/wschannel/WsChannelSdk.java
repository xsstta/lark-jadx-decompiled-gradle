package com.bytedance.common.wschannel;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.wschannel.LifeCycleMonitor;
import com.bytedance.common.wschannel.app.OnMessageReceiveListener;
import com.bytedance.common.wschannel.client.WsChannelClientSdk;
import com.bytedance.common.wschannel.heartbeat.BaseHeartBeatPolicy;
import com.bytedance.common.wschannel.heartbeat.model.IHeartBeatMeta;
import com.bytedance.common.wschannel.heartbeat.monitor.HeartBeatMonitor;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.monitor.IWsSdkMonitor;
import com.bytedance.common.wschannel.server.WsChannelReceiver;
import com.bytedance.common.wschannel.utils.Utils;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.message.AppProvider;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import me.ele.lancet.base.annotations.Skip;

public class WsChannelSdk {
    private static AppStateListener mAppStateChangedListener = new AppStateListener();
    private static Map<Integer, ChannelInfo> mRegisterMap = new ConcurrentHashMap();
    public static Application sApplication;
    private static boolean sCalculateAppState;
    public static DelayParam sDelayParams;
    private static Map<Integer, BaseHeartBeatPolicy> sHeartbeatPolicy = new ConcurrentHashMap();
    private static volatile boolean sInit;
    public static boolean sIsCurrentBackground;
    private static final Object sLock = new Object();
    private static String sProcessName;

    /* access modifiers changed from: private */
    public static class AppStateListener implements LifeCycleMonitor.AppStateListener {
        private AppStateListener() {
        }

        @Override // com.bytedance.common.wschannel.LifeCycleMonitor.AppStateListener
        public void onEnterToBackground() {
            WsChannelSdk.sIsCurrentBackground = true;
            if (WsChannelSdk.sDelayParams == null || WsChannelSdk.sDelayParams.finishDelay) {
                WsChannelClientSdk.onEnterToBackground(WsChannelSdk.sApplication);
            }
        }

        @Override // com.bytedance.common.wschannel.LifeCycleMonitor.AppStateListener
        public void onEnterToForeground() {
            WsChannelSdk.sIsCurrentBackground = false;
            if (WsChannelSdk.sDelayParams == null || WsChannelSdk.sDelayParams.finishDelay) {
                WsChannelClientSdk.onEnterToForeground(WsChannelSdk.sApplication);
            }
        }
    }

    private WsChannelSdk() {
    }

    public static Context getContext() {
        return sApplication;
    }

    /* access modifiers changed from: private */
    public static class DelayParam {
        public boolean finishDelay;
        public Map<Integer, ChannelInfo> mDelayMap;

        private DelayParam() {
            this.mDelayMap = new ConcurrentHashMap();
        }
    }

    private static void checkInit() {
        if (!sInit) {
            throw new IllegalStateException("please init first");
        }
    }

    public static void enterToBackground() {
        if (sInit && !sCalculateAppState) {
            mAppStateChangedListener.onEnterToBackground();
        }
    }

    public static void enterToForeground() {
        if (sInit && !sCalculateAppState) {
            mAppStateChangedListener.onEnterToForeground();
        }
    }

    private static void registerNetChangeReceiver() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            INVOKEVIRTUAL_com_bytedance_common_wschannel_WsChannelSdk_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(sApplication, new WsChannelReceiver(), intentFilter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void finishDelay() {
        checkInit();
        synchronized (sLock) {
            DelayParam delayParam = sDelayParams;
            if (delayParam != null) {
                if (!delayParam.finishDelay) {
                    sDelayParams.finishDelay = true;
                    if (!sDelayParams.mDelayMap.isEmpty()) {
                        for (ChannelInfo channelInfo : sDelayParams.mDelayMap.values()) {
                            registerChannel(channelInfo);
                        }
                        sDelayParams.mDelayMap.clear();
                    } else {
                        WsChannelClientSdk.tryStartPushProcess(sApplication, true, true);
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        /* class com.bytedance.common.wschannel.WsChannelSdk.RunnableC36391 */

                        public void run() {
                            if (WsChannelSdk.sIsCurrentBackground) {
                                WsChannelClientSdk.onEnterToBackground(WsChannelSdk.sApplication);
                            } else {
                                WsChannelClientSdk.onEnterToForeground(WsChannelSdk.sApplication);
                            }
                        }
                    }, 2000);
                }
            }
        }
    }

    public static void setMonitorInPush(IWsSdkMonitor iWsSdkMonitor) {
        HeartBeatMonitor.getInstance().setHeartBeatMonitor(iWsSdkMonitor);
    }

    public static <T extends IHeartBeatMeta> BaseHeartBeatPolicy<T> getHeartBeatPolicy(int i) {
        return sHeartbeatPolicy.get(Integer.valueOf(i));
    }

    public static boolean isEnable(Context context) {
        return WsChannelSettings.inst(context).isEnable();
    }

    public static boolean isOkChannelEnable(Context context) {
        return WsChannelSettings.inst(context).isOkChannelEnable();
    }

    private static void doRealRegisterOrParametersChangedMethod(ChannelInfo channelInfo) {
        mRegisterMap.put(Integer.valueOf(channelInfo.channelId), channelInfo);
        WsChannelClientSdk.registerApp(sApplication, createParameterMap(channelInfo));
    }

    public static boolean isWsConnected(int i) {
        DelayParam delayParam = sDelayParams;
        if (delayParam == null || delayParam.finishDelay) {
            Application application = sApplication;
            WsChannelClientSdk.tryStartPushProcess(application, Utils.isMainProcess(application, sProcessName));
        }
        return WsConstants.isWsChannelConnected(i);
    }

    public static void onParametersChanged(ChannelInfo channelInfo) {
        checkInit();
        synchronized (sLock) {
            DelayParam delayParam = sDelayParams;
            if (delayParam != null) {
                if (!delayParam.finishDelay) {
                    sDelayParams.mDelayMap.put(Integer.valueOf(channelInfo.channelId), channelInfo);
                }
            }
            SsWsApp createParameterMap = createParameterMap(channelInfo);
            mRegisterMap.put(Integer.valueOf(channelInfo.channelId), channelInfo);
            WsChannelClientSdk.onParameterChange(sApplication, createParameterMap);
        }
    }

    public static void registerChannel(ChannelInfo channelInfo) {
        checkInit();
        synchronized (sLock) {
            DelayParam delayParam = sDelayParams;
            if (delayParam != null) {
                if (!delayParam.finishDelay) {
                    sDelayParams.mDelayMap.put(Integer.valueOf(channelInfo.channelId), channelInfo);
                }
            }
            doRealRegisterOrParametersChangedMethod(channelInfo);
        }
    }

    public static void unregisterChannel(int i) {
        checkInit();
        WsConstants.remove(i);
        mRegisterMap.remove(Integer.valueOf(i));
        synchronized (sLock) {
            DelayParam delayParam = sDelayParams;
            if (delayParam != null && !delayParam.finishDelay) {
                sDelayParams.mDelayMap.remove(Integer.valueOf(i));
            }
        }
        finishDelay();
        WsChannelClientSdk.unRegisterApp(sApplication, i);
    }

    public static void sendPayload(WsChannelMsg wsChannelMsg) {
        checkInit();
        if (wsChannelMsg == null) {
            throw new IllegalArgumentException("WsChannelMsg can't be null");
        } else if (wsChannelMsg.getChannelId() <= 0) {
            throw new IllegalArgumentException("illegal channelId");
        } else if (wsChannelMsg.getService() <= 0) {
            throw new IllegalArgumentException("illegal service");
        } else if (wsChannelMsg.getMethod() <= 0) {
            throw new IllegalArgumentException("illegal method");
        } else if (wsChannelMsg.getPayload() != null) {
            DelayParam delayParam = sDelayParams;
            if (delayParam != null && !delayParam.finishDelay) {
                finishDelay();
            }
            WsChannelClientSdk.inst().sendPayload(sApplication, wsChannelMsg);
        } else {
            throw new IllegalArgumentException("illegal payload");
        }
    }

    private static SsWsApp createParameterMap(ChannelInfo channelInfo) {
        Map<String, String> map = channelInfo.extra;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                arrayList.add(entry.getKey() + ContainerUtils.KEY_VALUE_DELIMITER + entry.getValue());
            }
        }
        int i = channelInfo.aid;
        if (i > 0) {
            String str = channelInfo.deviceId;
            if (!StringUtils.isEmpty(str)) {
                String str2 = channelInfo.installId;
                if (!StringUtils.isEmpty(str2)) {
                    int i2 = channelInfo.fpid;
                    if (i2 > 0) {
                        String str3 = channelInfo.appKey;
                        if (!StringUtils.isEmpty(str3)) {
                            int i3 = channelInfo.updateVersionCode;
                            if (i3 > 0) {
                                int i4 = channelInfo.channelId;
                                if (i4 > 0) {
                                    return new SsWsApp.SsWsAppBuilder().setAppId(i).setDeviceId(str).setInstallId(str2).setFPID(i2).setAppKey(str3).setConnectUrls(channelInfo.urls).setAppVersion(i3).setPlatform(0).setChannelId(i4).setExtra(TextUtils.join(ContainerUtils.FIELD_DELIMITER, arrayList.toArray())).build();
                                }
                                throw new IllegalArgumentException("channelId <= 0 ,please set channelId first");
                            }
                            throw new IllegalArgumentException("appVersion <= 0 ,please set appVersion first");
                        }
                        throw new IllegalArgumentException("appKey is empty,please set appKey first");
                    }
                    throw new IllegalArgumentException("fpid <= 0 ,please set fpid first");
                }
                throw new IllegalArgumentException("installId is empty ,please set installId first");
            }
            throw new IllegalArgumentException("deviceId is empty ,please set deviceId first");
        }
        throw new IllegalArgumentException("aid == 0 ,please set aid first");
    }

    public static void init(Application application, OnMessageReceiveListener onMessageReceiveListener) {
        doInit(application, onMessageReceiveListener, false, true);
    }

    public static void initWithoutLifeCycle(Application application, OnMessageReceiveListener onMessageReceiveListener) {
        doInit(application, onMessageReceiveListener, false, false);
    }

    public static void setEnableReportAppState(Context context, boolean z) {
        WsChannelSettings.inst(context).setReportAppStateEnable(z);
    }

    public static void setOkChannelEnable(Context context, boolean z) {
        WsChannelSettings.inst(context).setOKChannelEnable(z);
    }

    public static void setRetrySendMsgDelayTimeMillis(Context context, long j) {
        WsChannelSettings.inst(context).setRetrySendMsgDelay(j);
    }

    public static void setSocketLimit(Context context, long j) {
        WsChannelSettings.inst(context).setSocketReadLimitSize(j);
    }

    public static void onToutiaoWsChannelParametersChanged(ChannelInfo channelInfo, String str) {
        channelInfo.extra.put("sid", str);
        onParametersChanged(channelInfo);
    }

    public static void registerToutianChannel(ChannelInfo channelInfo, String str) {
        channelInfo.extra.put("sid", str);
        registerChannel(channelInfo);
    }

    public static <T extends IHeartBeatMeta> void setHeartBeatPolicy(int i, BaseHeartBeatPolicy<T> baseHeartBeatPolicy) {
        sHeartbeatPolicy.put(Integer.valueOf(i), baseHeartBeatPolicy);
    }

    public static void setEnable(Context context, boolean z) {
        boolean isEnable = WsChannelSettings.inst(context).isEnable();
        WsChannelSettings.inst(context).setEnable(z);
        if (!isEnable && z) {
            for (ChannelInfo channelInfo : mRegisterMap.values()) {
                registerChannel(channelInfo);
            }
        }
    }

    public static void init(Application application, OnMessageReceiveListener onMessageReceiveListener, boolean z) {
        doInit(application, onMessageReceiveListener, z, true);
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_bytedance_common_wschannel_WsChannelSdk_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Application application, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return application.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    private static void doInit(Application application, OnMessageReceiveListener onMessageReceiveListener, boolean z, boolean z2) {
        if (!sInit) {
            sInit = true;
            sApplication = application;
            sCalculateAppState = z2;
            sProcessName = Utils.getCurProcessName(application);
            try {
                AppProvider.initApp(application);
            } catch (Throwable unused) {
                Log.d("WsChannel", "没有AppProvider，忽略");
            }
            boolean isMainProcess = Utils.isMainProcess(application, sProcessName);
            if (z && isMainProcess) {
                DelayParam delayParam = new DelayParam();
                sDelayParams = delayParam;
                delayParam.finishDelay = false;
            }
            if (isMainProcess) {
                if (z2) {
                    LifeCycleMonitor lifeCycleMonitor = new LifeCycleMonitor();
                    lifeCycleMonitor.setAppStateChangedListener(mAppStateChangedListener);
                    application.registerActivityLifecycleCallbacks(lifeCycleMonitor);
                }
                WsConstants.setOnMessageReceiveListener(onMessageReceiveListener);
            } else if (Utils.isMessageProcess(sProcessName)) {
                registerNetChangeReceiver();
            }
            if (sDelayParams == null) {
                WsChannelClientSdk.tryStartPushProcess(sApplication, isMainProcess, true);
            }
        }
    }
}
