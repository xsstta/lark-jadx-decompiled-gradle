package com.ss.android.lark.integrator;

import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.appsetting.annotation.AppConfig;

@AppConfig(key = "emm_config")
public class EMMSettingConfig {

    /* renamed from: a */
    public String f100369a;

    /* renamed from: b */
    public String f100370b;

    /* renamed from: c */
    public String f100371c;

    EMMSettingConfig(JSONObject jSONObject) {
        this.f100369a = jSONObject.getString("emm_app_id");
        this.f100370b = jSONObject.getString("emm_domain");
        this.f100371c = jSONObject.getString("emm_org_code");
    }
}
