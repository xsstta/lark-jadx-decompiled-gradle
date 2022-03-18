package com.ss.android.lark.mm.settings;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class MmTTDNSServerHostConfig implements Serializable {
    @JSONField(name = "backupParseType")
    public int backupParseType;
    @JSONField(name = "mainParseType")
    public int mainParseType;
    @JSONField(name = "maxCacheSize")
    public int maxCacheSize;
    @JSONField(name = "singleLimitSize")
    public int singleLimitSize;
    @JSONField(name = "switchTime")
    public int switchTime;
    @JSONField(name = "useCache")
    public int useCache;

    public int getBackupParseType() {
        return this.backupParseType;
    }

    public int getMainParseType() {
        return this.mainParseType;
    }

    public int getMaxCacheSize() {
        return this.maxCacheSize;
    }

    public int getSingleLimitSize() {
        return this.singleLimitSize;
    }

    public int getSwitchTime() {
        return this.switchTime;
    }

    public int getUseCache() {
        return this.useCache;
    }

    /* renamed from: com.ss.android.lark.mm.settings.MmTTDNSServerHostConfig$a */
    public static class C47080a {

        /* renamed from: a */
        private static MmTTDNSServerHostConfig f118512a;

        /* renamed from: a */
        public static MmTTDNSServerHostConfig m186378a() {
            if (f118512a == null) {
                MmTTDNSServerHostConfig mmTTDNSServerHostConfig = new MmTTDNSServerHostConfig();
                f118512a = mmTTDNSServerHostConfig;
                mmTTDNSServerHostConfig.mainParseType = 0;
                f118512a.backupParseType = 2;
                f118512a.switchTime = 1;
                f118512a.useCache = 1;
                f118512a.maxCacheSize = 314572800;
                f118512a.singleLimitSize = 20971520;
            }
            return f118512a;
        }
    }

    public void setBackupParseType(int i) {
        this.backupParseType = i;
    }

    public void setMainParseType(int i) {
        this.mainParseType = i;
    }

    public void setMaxCacheSize(int i) {
        this.maxCacheSize = i;
    }

    public void setSingleLimitSize(int i) {
        this.singleLimitSize = i;
    }

    public void setSwitchTime(int i) {
        this.switchTime = i;
    }

    public void setUseCache(int i) {
        this.useCache = i;
    }

    public static MmTTDNSServerHostConfig parse(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (MmTTDNSServerHostConfig) JSON.parseObject(str, MmTTDNSServerHostConfig.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
