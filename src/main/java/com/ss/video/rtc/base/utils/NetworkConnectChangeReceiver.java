package com.ss.video.rtc.base.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ss.video.rtc.base.utils.NetworkUtils;
import com.ss.video.rtc.engine.RtcEngineImpl.C65562RtcEngineImpl;
import com.ss.video.rtc.engine.utils.LogUtil;

public class NetworkConnectChangeReceiver extends BroadcastReceiver {
    private NetworkUtils.NetworkType sNetworkType = NetworkUtils.NetworkType.NONE;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.video.rtc.base.utils.NetworkConnectChangeReceiver$1 */
    public static /* synthetic */ class C655571 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$video$rtc$base$utils$NetworkUtils$NetworkType;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.video.rtc.base.utils.NetworkUtils$NetworkType[] r0 = com.ss.video.rtc.base.utils.NetworkUtils.NetworkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.video.rtc.base.utils.NetworkConnectChangeReceiver.C655571.$SwitchMap$com$ss$video$rtc$base$utils$NetworkUtils$NetworkType = r0
                com.ss.video.rtc.base.utils.NetworkUtils$NetworkType r1 = com.ss.video.rtc.base.utils.NetworkUtils.NetworkType.MOBILE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.video.rtc.base.utils.NetworkConnectChangeReceiver.C655571.$SwitchMap$com$ss$video$rtc$base$utils$NetworkUtils$NetworkType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.video.rtc.base.utils.NetworkUtils$NetworkType r1 = com.ss.video.rtc.base.utils.NetworkUtils.NetworkType.WIFI     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.video.rtc.base.utils.NetworkConnectChangeReceiver.C655571.$SwitchMap$com$ss$video$rtc$base$utils$NetworkUtils$NetworkType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.video.rtc.base.utils.NetworkUtils$NetworkType r1 = com.ss.video.rtc.base.utils.NetworkUtils.NetworkType.MOBILE_2G     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.video.rtc.base.utils.NetworkConnectChangeReceiver.C655571.$SwitchMap$com$ss$video$rtc$base$utils$NetworkUtils$NetworkType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.video.rtc.base.utils.NetworkUtils$NetworkType r1 = com.ss.video.rtc.base.utils.NetworkUtils.NetworkType.MOBILE_3G     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.video.rtc.base.utils.NetworkConnectChangeReceiver.C655571.$SwitchMap$com$ss$video$rtc$base$utils$NetworkUtils$NetworkType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.video.rtc.base.utils.NetworkUtils$NetworkType r1 = com.ss.video.rtc.base.utils.NetworkUtils.NetworkType.MOBILE_4G     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.video.rtc.base.utils.NetworkConnectChangeReceiver.C655571.$SwitchMap$com$ss$video$rtc$base$utils$NetworkUtils$NetworkType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.video.rtc.base.utils.NetworkUtils$NetworkType r1 = com.ss.video.rtc.base.utils.NetworkUtils.NetworkType.MOBILE_5G     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.video.rtc.base.utils.NetworkConnectChangeReceiver.C655571.<clinit>():void");
        }
    }

    private int getConstantNetworkType(NetworkUtils.NetworkType networkType) {
        if (!networkType.isAvailable()) {
            return 0;
        }
        return getType(networkType);
    }

    private int getType(NetworkUtils.NetworkType networkType) {
        switch (C655571.$SwitchMap$com$ss$video$rtc$base$utils$NetworkUtils$NetworkType[networkType.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return -1;
        }
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || "android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction()) || "android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
            NetworkUtils.NetworkType networkType = NetworkUtils.getNetworkType(context);
            LogUtil.m257129d("NetworkConnectChangeReceiver", "this: " + hashCode() + " before: " + this.sNetworkType + " now: " + networkType);
            if (this.sNetworkType == NetworkUtils.NetworkType.NONE || networkType != NetworkUtils.NetworkType.UNKNOWN) {
                if (this.sNetworkType != networkType) {
                    C65562RtcEngineImpl.SetNetworkType(getConstantNetworkType(networkType));
                }
                this.sNetworkType = networkType;
            }
        }
    }
}
