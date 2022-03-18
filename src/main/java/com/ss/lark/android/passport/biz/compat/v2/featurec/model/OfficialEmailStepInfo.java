package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import java.io.Serializable;

public class OfficialEmailStepInfo extends BaseStepInfo implements Serializable {
    public Next next;
    @JSONField(name = "not_join_button")
    public ButtonInfo notJoinButton;
    @JSONField(name = "subtitle")
    public String subTitle;
    @JSONField(name = "tenant_button")
    public ButtonInfo tenantButton;
    @JSONField(name = "tenant_list")
    public TenantGroup tenantGroup;
    public String title;

    public static class Next implements Serializable {
        @JSONField(name = "dispatch_next")
        public DispatchNextStepInfo dispatchNext;
        @JSONField(name = "join_tenant")
        public JoinTenantChooseInfo joinTenantChooseInfo;
    }
}
