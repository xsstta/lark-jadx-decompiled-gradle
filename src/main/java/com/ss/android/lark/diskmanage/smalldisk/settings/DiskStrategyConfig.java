package com.ss.android.lark.diskmanage.smalldisk.settings;

import com.alibaba.fastjson.JSON;
import com.ss.android.lark.diskmanage.NonProguard;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.diskmanage.smalldisk.C36832a;
import com.ss.android.lark.log.Log;
import org.json.JSONObject;

public class DiskStrategyConfig implements NonProguard {
    private float cleanThresholdFactor = 0.7f;
    private float diskCacheFactor = 0.7f;
    private long diskThreshold;
    private boolean strategySwitch;
    private float timeoutFactor = 0.5f;

    public float getCleanThresholdFactor() {
        return this.cleanThresholdFactor;
    }

    public float getDiskCacheFactor() {
        return this.diskCacheFactor;
    }

    public long getDiskThreshold() {
        return this.diskThreshold;
    }

    public boolean getStrategySwitch() {
        return this.strategySwitch;
    }

    public float getTimeoutFactor() {
        return this.timeoutFactor;
    }

    public String toString() {
        return "DiskStrategyConfig{strategySwitch=" + this.strategySwitch + ", diskThreshold=" + this.diskThreshold + ", cleanThresholdFactor=" + this.cleanThresholdFactor + ", diskCacheFactor=" + this.diskCacheFactor + ", timeoutFactor=" + this.timeoutFactor + '}';
    }

    public void setCleanThresholdFactor(float f) {
        this.cleanThresholdFactor = f;
    }

    public void setDiskCacheFactor(float f) {
        this.diskCacheFactor = f;
    }

    public void setDiskThreshold(long j) {
        this.diskThreshold = j;
    }

    public void setStrategySwitch(boolean z) {
        this.strategySwitch = z;
    }

    public void setTimeoutFactor(float f) {
        this.timeoutFactor = f;
    }

    public static DiskStrategyConfig parse(String str) {
        boolean z;
        C36808a.AbstractC36811b b = C36808a.m145209b();
        try {
            DiskStrategyConfig diskStrategyConfig = (DiskStrategyConfig) JSON.parseObject(new JSONObject(str).getString("DiskStrategyConfig"), DiskStrategyConfig.class);
            if (diskStrategyConfig.strategySwitch) {
                z = C36832a.m145309a(diskStrategyConfig.diskThreshold);
            } else {
                z = false;
            }
            b.mo102815b("small_disk_on", z);
            b.mo102813b("disk_factor", diskStrategyConfig.diskCacheFactor);
            b.mo102813b("disk_clean_factor", diskStrategyConfig.cleanThresholdFactor);
            b.mo102813b("disk_timeout_factor", diskStrategyConfig.timeoutFactor);
            Log.m165389i("DiskStrategyConfig", "inSmallDiskMode =" + z + ", diskCacheFactor = " + diskStrategyConfig.diskCacheFactor + ", cleanThresholdFactor = " + diskStrategyConfig.cleanThresholdFactor + ", timeoutFactor = " + diskStrategyConfig.timeoutFactor);
            return diskStrategyConfig;
        } catch (Exception e) {
            Log.m165384e("DiskStrategyConfig", "parse fail. ", e);
            if (b != null) {
                b.mo102815b("small_disk_on", false);
            }
            return new DiskStrategyConfig();
        }
    }
}
