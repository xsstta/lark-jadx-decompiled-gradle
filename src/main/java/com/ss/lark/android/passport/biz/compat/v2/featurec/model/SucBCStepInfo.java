package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import java.io.Serializable;

public class SucBCStepInfo extends BaseStepInfo implements Serializable {
    @JSONField(name = "user_env")
    public String configEnv;
    @JSONField(name = "contact_type")
    public int contactType;
    @JSONField(name = "enable_c2b_create")
    public boolean enableC2bCreate;
    @JSONField(name = "subtitle")
    public String subTitle;
    @JSONField(name = "title")
    public String title;
    @JSONField(name = "user_id")
    public String userId;
    @JSONField(name = "user_unit")
    public String userUnit;
}
