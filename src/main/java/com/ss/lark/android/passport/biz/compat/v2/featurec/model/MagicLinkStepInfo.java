package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import java.io.Serializable;

public class MagicLinkStepInfo extends BaseStepInfo implements Serializable {
    public String contact;
    @JSONField(name = "flow_type")
    public String flowType;
    @JSONField(name = "source_type")
    public int sourceType;
    public String subtitle;
    public String tip;
    public String title;
}
