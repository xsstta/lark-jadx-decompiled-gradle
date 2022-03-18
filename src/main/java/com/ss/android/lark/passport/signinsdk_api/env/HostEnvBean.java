package com.ss.android.lark.passport.signinsdk_api.env;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class HostEnvBean implements Serializable {
    @JSONField(name = "env_type")
    public int envType;
    @JSONField(name = "is_std_lark")
    public Boolean isStdLark;
    @JSONField(name = "passport_config_env")
    public Boolean passportConfigEnv;
    @JSONField(name = "user_unit")
    public String userUnit;

    public HostEnvBean() {
    }

    public HostEnvBean cloneMe() {
        return new HostEnvBean(this.userUnit, this.isStdLark, this.passportConfigEnv, this.envType);
    }

    public HostEnvBean(String str, Boolean bool, Boolean bool2, int i) {
        this.userUnit = str;
        this.isStdLark = bool;
        this.passportConfigEnv = bool2;
        this.envType = i;
    }
}
