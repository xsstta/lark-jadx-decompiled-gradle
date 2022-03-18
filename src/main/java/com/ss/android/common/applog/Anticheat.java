package com.ss.android.common.applog;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;

public class Anticheat implements IAnticheat {
    private static Anticheat inst;
    public IClient iClient;
    private boolean inUpdateProgress;
    private boolean isInit = false;
    private String mEstr;
    private Handler mHandler;
    private int mRetryDelay = HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
    private int mUpdateduration;

    private Anticheat() {
    }

    private void checkInit() {
        if (!this.isInit) {
            throw new IllegalStateException("init() method should be called first.");
        }
    }

    public static Anticheat inst() {
        if (inst == null) {
            synchronized (Anticheat.class) {
                if (inst == null) {
                    inst = new Anticheat();
                }
            }
        }
        return inst;
    }

    private void updateEstrWithDelay(int i) {
        this.mHandler.postDelayed(new Runnable() {
            /* class com.ss.android.common.applog.Anticheat.RunnableC284471 */

            public void run() {
                Anticheat.this.updateEstrFromAPI();
            }
        }, (long) i);
    }

    public void init(IClient iClient2) {
        if (!this.isInit) {
            this.isInit = true;
            updateEstr(iClient2.readEstrFromSharedPreference());
            this.iClient = iClient2;
            this.mHandler = new Handler(Looper.getMainLooper());
            updateEstrWithDelay(0);
        }
    }

    @Override // com.ss.android.common.applog.IAnticheat
    public void onUpdateEstrFromApiFail(Exception exc) {
        this.mHandler.postDelayed(new Runnable() {
            /* class com.ss.android.common.applog.Anticheat.RunnableC284482 */

            public void run() {
                Anticheat.this.iClient.getEstrFromAPI();
            }
        }, (long) this.mRetryDelay);
        int i = this.mRetryDelay;
        if (i <= 32000) {
            this.mRetryDelay = i * 2;
        }
    }

    @Override // com.ss.android.common.applog.IAnticheat
    public void onUpdateEstrFromApiSuccess(EstrBean estrBean) {
        String estr = estrBean.getEstr();
        this.mUpdateduration = estrBean.getNext_heartbeat() * 1000;
        if (!TextUtils.equals(this.mEstr, estr)) {
            this.iClient.writeEstrToSharedPreference(estr);
            updateEstr(estr);
        }
        this.inUpdateProgress = false;
        this.mRetryDelay = HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
        updateEstrWithDelay(this.mUpdateduration);
    }

    @Override // com.ss.android.common.applog.IAnticheat
    public void updateEstr(String str) {
        checkInit();
        if (!TextUtils.isEmpty(str) && str.length() > 8) {
            try {
                UserInfo.initUser(str);
            } catch (Throwable unused) {
            }
            this.mEstr = str;
        }
    }

    public void updateEstrFromAPI() {
        if (!this.inUpdateProgress) {
            this.inUpdateProgress = true;
            this.iClient.getEstrFromAPI();
        }
    }
}
