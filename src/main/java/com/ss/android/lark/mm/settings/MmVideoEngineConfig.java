package com.ss.android.lark.mm.settings;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class MmVideoEngineConfig implements Serializable {
    @JSONField(name = "player_prefer_cache_max_seconds")
    public int cacheMaxSeconds;
    @JSONField(name = "player_prefer_nearest_sample")
    public int enableNearestSample;
    @JSONField(name = "player_prefer_nearest_max_pos_offset")
    public int nearestMaxPosOffset;

    public int getCacheMaxSeconds() {
        return this.cacheMaxSeconds;
    }

    public int getEnableNearestSample() {
        return this.enableNearestSample;
    }

    public int getNearestMaxPosOffset() {
        return this.nearestMaxPosOffset;
    }

    /* renamed from: com.ss.android.lark.mm.settings.MmVideoEngineConfig$a */
    public static class C47081a {

        /* renamed from: a */
        private static MmVideoEngineConfig f118513a;

        /* renamed from: a */
        public static MmVideoEngineConfig m186379a() {
            if (f118513a == null) {
                MmVideoEngineConfig mmVideoEngineConfig = new MmVideoEngineConfig();
                f118513a = mmVideoEngineConfig;
                mmVideoEngineConfig.enableNearestSample = 1;
                f118513a.nearestMaxPosOffset = 104857600;
                f118513a.cacheMaxSeconds = 360;
            }
            return f118513a;
        }
    }

    public void setCacheMaxSeconds(int i) {
        this.cacheMaxSeconds = i;
    }

    public void setEnableNearestSample(int i) {
        this.enableNearestSample = i;
    }

    public void setNearestMaxPosOffset(int i) {
        this.nearestMaxPosOffset = i;
    }

    public static MmVideoEngineConfig parse(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (MmVideoEngineConfig) JSON.parseObject(str, MmVideoEngineConfig.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
