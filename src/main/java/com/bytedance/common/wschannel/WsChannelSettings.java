package com.bytedance.common.wschannel;

import android.content.Context;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;

public class WsChannelSettings {
    private static WsChannelSettings mInstance;
    private final Context mContext;
    private final WsChannelMultiProcessSharedProvider.MultiProcessShared multiProcessShared;

    public long getRetryDelay() {
        return this.multiProcessShared.getLong("key_retry_send_msg_delay", 0);
    }

    public long getSocketReadLimitSize() {
        return this.multiProcessShared.getLong("key_io_limit_size", 10485760);
    }

    public String getWsApp() {
        return this.multiProcessShared.getString("ws_apps", "");
    }

    public boolean isEnable() {
        return this.multiProcessShared.getBoolean("frontier_enabled", true);
    }

    public boolean isOkChannelEnable() {
        return this.multiProcessShared.getBoolean("key_ok_impl_enable", true);
    }

    public boolean isReportAppStateEnable() {
        return this.multiProcessShared.getBoolean("enableAppStateChangeReport", false);
    }

    private WsChannelSettings(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.multiProcessShared = WsChannelMultiProcessSharedProvider.getMultiprocessShared(applicationContext);
    }

    public void setEnable(boolean z) {
        this.multiProcessShared.edit().putBoolean("frontier_enabled", z).commit();
    }

    public void setOKChannelEnable(boolean z) {
        this.multiProcessShared.edit().putBoolean("key_ok_impl_enable", z).commit();
    }

    public void setReportAppStateEnable(boolean z) {
        this.multiProcessShared.edit().putBoolean("enableAppStateChangeReport", z).apply();
    }

    public void setRetrySendMsgDelay(long j) {
        this.multiProcessShared.edit().putLong("key_retry_send_msg_delay", j).commit();
    }

    public void setWsApp(String str) {
        this.multiProcessShared.edit().putString("ws_apps", str).commit();
    }

    public static WsChannelSettings inst(Context context) {
        if (mInstance == null) {
            synchronized (WsChannelSettings.class) {
                if (mInstance == null) {
                    mInstance = new WsChannelSettings(context);
                }
            }
        }
        return mInstance;
    }

    public void setSocketReadLimitSize(long j) {
        if (j > 0) {
            this.multiProcessShared.edit().putLong("key_io_limit_size", j).commit();
        }
    }
}
