package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import java.io.Serializable;

public class JoinQrCodeInfo extends BaseStepInfo implements Serializable {
    @JSONField(name = "flow_type")
    public String flowType;
    @JSONField(name = "subtitle")
    public String subTitle;
}
