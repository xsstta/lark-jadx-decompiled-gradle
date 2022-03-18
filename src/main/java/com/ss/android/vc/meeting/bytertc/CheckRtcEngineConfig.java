package com.ss.android.vc.meeting.bytertc;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.net.service.VCSettingsService;
import java.io.Serializable;
import java.util.List;

public class CheckRtcEngineConfig implements Serializable {
    @JSONField(name = "black_list")
    private List<String> blackList;

    public List<String> getBlackList() {
        return this.blackList;
    }

    public void updateConfig() {
        String settings = VCSettingsService.getSettings("vc_check_rtc_engine");
        if (!TextUtils.isEmpty(settings)) {
            CheckRtcEngineConfig checkRtcEngineConfig = null;
            try {
                checkRtcEngineConfig = (CheckRtcEngineConfig) JSON.parseObject(settings, CheckRtcEngineConfig.class);
            } catch (Exception e) {
                C60700b.m235846a("CheckRtcEngineConfig", "parseObject", e);
            }
            if (checkRtcEngineConfig != null) {
                this.blackList = checkRtcEngineConfig.blackList;
            }
            C60700b.m235851b("CheckRtcEngineConfig", "updateConfig", String.format("blackList = %s ,config = %s", this.blackList, settings));
        }
    }

    public void setBlackList(List<String> list) {
        this.blackList = list;
    }
}
