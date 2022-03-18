package com.bytedance.ttnet.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.common.utility.NetworkUtils;
import java.util.List;
import org.json.JSONObject;

public class ImageStrategyController {
    private static final Object mLock = new Object();
    private static volatile ImageStrategyController sIns;
    private static volatile SharedPreferences sSP;
    private volatile long mBlackInterval;
    private volatile Context mContext;
    private volatile int mFailedTimes;
    private volatile int mLimitImageNumber;
    private volatile int mSwitch;

    public List<String> getUrlListForUrl(String str) {
        return null;
    }

    public static ImageStrategyController getInstance() {
        return sIns;
    }

    public int getFailedTimes() {
        return this.mFailedTimes;
    }

    public long getHostInBlackInterval() {
        return this.mBlackInterval;
    }

    public int getLimitImageNumbers() {
        return this.mLimitImageNumber;
    }

    public int getSwitch() {
        return this.mSwitch;
    }

    public NetworkUtils.NetworkType getNetWorkType() {
        return NetworkUtils.getNetworkType(this.mContext);
    }

    private SharedPreferences getSP() {
        if (sSP == null) {
            sSP = this.mContext.getSharedPreferences("image_opt_table", 0);
        }
        return sSP;
    }

    private void initConfig() {
        try {
            SharedPreferences sp = getSP();
            this.mSwitch = sp.getInt("image_opt_switch", 0);
            this.mBlackInterval = sp.getLong("image_opt_black_interval", 0);
            this.mFailedTimes = sp.getInt("image_opt_failed_times", 0);
            this.mLimitImageNumber = sp.getInt("image_opt_limit_count", 0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private ImageStrategyController(Context context) {
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
        initConfig();
    }

    public static ImageStrategyController Init(Context context) {
        if (sIns == null) {
            synchronized (mLock) {
                if (sIns == null) {
                    sIns = new ImageStrategyController(context);
                }
            }
        }
        return sIns;
    }

    public void updateConfig(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.length() > 0) {
                    int optInt = jSONObject.optInt("image_opt_switch", 0);
                    long optLong = jSONObject.optLong("image_opt_black_interval", 0);
                    int optInt2 = jSONObject.optInt("image_opt_failed_times", 0);
                    int optInt3 = jSONObject.optInt("image_opt_limit_count", 0);
                    SharedPreferences.Editor edit = getSP().edit();
                    if (optInt != this.mSwitch) {
                        edit.putInt("image_opt_switch", optInt);
                    }
                    if (optLong != this.mBlackInterval) {
                        edit.putLong("image_opt_black_interval", optLong);
                    }
                    if (optInt2 != this.mFailedTimes) {
                        edit.putInt("image_opt_failed_times", optInt2);
                    }
                    if (optInt3 != this.mLimitImageNumber) {
                        edit.putInt("image_opt_limit_count", optInt3);
                    }
                    edit.apply();
                    this.mSwitch = optInt;
                    this.mBlackInterval = optLong;
                    this.mFailedTimes = optInt2;
                    this.mLimitImageNumber = optInt3;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
