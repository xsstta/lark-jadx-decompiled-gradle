package com.bytedance.common.wschannel.server;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.common.wschannel.WsChannelSdk;
import com.bytedance.common.wschannel.WsChannelSettings;
import com.bytedance.common.wschannel.server.NetworkUtils;

public class WsChannelReceiver extends BroadcastReceiver {
    public static boolean sFrontierEnabled;
    private boolean mIsFirstTimeReceiveNetChangedAction = true;
    private NetworkUtils.NetworkType mOnCreateNetworkType = NetworkUtils.getNetworkType(WsChannelSdk.getContext());

    public void loadFrontierEnabled(Context context) {
        try {
            boolean isEnable = WsChannelSettings.inst(context).isEnable();
            if (isEnable != sFrontierEnabled) {
                sFrontierEnabled = isEnable;
            }
        } catch (Throwable unused) {
        }
    }

    public void onReceive(final Context context, Intent intent) {
        if (context != null && intent != null && !TextUtils.isEmpty(intent.getAction()) && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (this.mIsFirstTimeReceiveNetChangedAction) {
                this.mIsFirstTimeReceiveNetChangedAction = false;
                if (NetworkUtils.getNetworkType(WsChannelSdk.getContext()) == this.mOnCreateNetworkType) {
                    return;
                }
            }
            ThreadPlus.submitRunnable(new Runnable() {
                /* class com.bytedance.common.wschannel.server.WsChannelReceiver.RunnableC36811 */

                public void run() {
                    WsChannelReceiver.this.loadFrontierEnabled(context);
                    if (WsChannelReceiver.sFrontierEnabled) {
                        try {
                            if (Logger.debug()) {
                                Logger.m15167d("WsChannelReceiver", "ConnectivityReceiver");
                            }
                            int networkState = NetworkUtils.getNetworkState(context);
                            Message obtain = Message.obtain();
                            obtain.what = 3;
                            obtain.arg1 = networkState;
                            ChannelManager.inst(context.getApplicationContext()).handleMsg(obtain);
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }
}
