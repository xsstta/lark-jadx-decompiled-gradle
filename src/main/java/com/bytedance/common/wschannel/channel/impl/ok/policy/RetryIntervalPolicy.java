package com.bytedance.common.wschannel.channel.impl.ok.policy;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.huawei.hms.framework.common.ContainerUtils;
import okhttp3.Response;

public class RetryIntervalPolicy implements RetryPolicy {
    private final Context mContext;
    private int mReconnectTimes;

    @Override // com.bytedance.common.wschannel.channel.impl.ok.policy.RetryPolicy
    public void reset() {
        this.mReconnectTimes = 0;
    }

    @Override // com.bytedance.common.wschannel.channel.impl.ok.policy.RetryPolicy
    public long getRandomInterval() {
        return (long) ((Math.random() * 4500.0d) + 500.0d);
    }

    public long getNextRetryInterval() {
        if (!isNetworkAvailable(this.mContext)) {
            return -1;
        }
        int i = this.mReconnectTimes + 1;
        this.mReconnectTimes = i;
        return (long) (((double) Math.min(((long) (1 << i)) * 5000, 120000L)) + (Math.random() * 10.0d * 1000.0d));
    }

    RetryIntervalPolicy(Context context) {
        this.mContext = context;
    }

    private static boolean isNetworkAvailable(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.common.wschannel.channel.impl.ok.policy.RetryPolicy
    public long getRetryIntervalWithResponse(Response response) {
        int code;
        String header;
        long nextRetryInterval = getNextRetryInterval();
        if (nextRetryInterval == -1) {
            return -1;
        }
        if (response != null) {
            try {
                if (!response.isSuccessful() && (((code = response.code()) == 414 || code == 511 || code == 512) && (header = response.header("Handshake-Options")) != null)) {
                    String[] split = header.split(";");
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            String[] split2 = str.split(ContainerUtils.KEY_VALUE_DELIMITER);
                            if ("reconnect-interval".equals(split2[0])) {
                                String str2 = split2[1];
                                Logger.m15167d("WsChannelSdk_ok", "override retry interval");
                                try {
                                    nextRetryInterval = Long.parseLong(str2) * 1000;
                                    Logger.m15167d("WsChannelSdk_ok", "read response hand shake option : reconnect-interval:" + nextRetryInterval + " ms");
                                    break;
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return nextRetryInterval;
    }
}
