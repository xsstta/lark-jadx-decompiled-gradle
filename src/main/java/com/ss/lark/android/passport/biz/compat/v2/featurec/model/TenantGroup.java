package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.android.lark.passport.signinsdk_api.account.Tenant;
import java.io.Serializable;
import java.util.List;

public class TenantGroup extends BaseStepInfo implements Serializable {
    @JSONField(name = "subtitle")
    public String subTitle;
    public List<Tenant> tenants;
}
