package com.ss.android.lark.mm.settings;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class MmFeatureSettingConfig implements Serializable {
    @JSONField(name = "mm_video_player_enable_hardware_decode")
    public boolean playerEnableHardwareDecode;

    public boolean isPlayerEnableHardwareDecode() {
        return this.playerEnableHardwareDecode;
    }

    /* renamed from: com.ss.android.lark.mm.settings.MmFeatureSettingConfig$a */
    public static class C47077a {

        /* renamed from: a */
        private static MmFeatureSettingConfig f118503a;

        /* renamed from: a */
        public static MmFeatureSettingConfig m186367a() {
            if (f118503a == null) {
                MmFeatureSettingConfig mmFeatureSettingConfig = new MmFeatureSettingConfig();
                f118503a = mmFeatureSettingConfig;
                mmFeatureSettingConfig.playerEnableHardwareDecode = false;
            }
            return f118503a;
        }
    }

    public void setPlayerEnableHardwareDecode(boolean z) {
        this.playerEnableHardwareDecode = z;
    }

    public static MmFeatureSettingConfig parse(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (MmFeatureSettingConfig) JSON.parseObject(str, MmFeatureSettingConfig.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
