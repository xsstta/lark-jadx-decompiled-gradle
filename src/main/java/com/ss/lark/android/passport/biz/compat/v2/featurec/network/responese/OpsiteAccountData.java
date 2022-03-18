package com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class OpsiteAccountData implements Serializable {
    @JSONField(name = "change_to_env")
    public String changeToConfigEnv;
    @JSONField(name = "change_to_unit")
    public String changeToUnit;
}
