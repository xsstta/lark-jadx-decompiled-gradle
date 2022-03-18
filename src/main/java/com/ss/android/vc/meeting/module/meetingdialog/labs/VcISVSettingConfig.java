package com.ss.android.vc.meeting.module.meetingdialog.labs;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import java.io.Serializable;

public class VcISVSettingConfig implements Serializable {
    public String appId;
    public String appLink;
    public String appLinkOversea;

    public static VcISVSettingConfig parse(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (VcISVSettingConfig) JSON.parseObject(str, VcISVSettingConfig.class);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
