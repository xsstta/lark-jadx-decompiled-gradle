package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import java.io.Serializable;
import java.util.List;

public class DispatchNextStepInfo extends BaseStepInfo implements Serializable {
    @JSONField(name = "dispatch_list")
    public List<DispatchItem> dispatchList;
    public Next next;
    @JSONField(name = "subtitle")
    public String subTitle;
    public String title;

    public static class DispatchItem implements Serializable {
        @JSONField(name = "button_alert_msg")
        public String buttonAlertMsg;
        @JSONField(name = "button_alert_text")
        public String buttonAlertText;
        @JSONField(name = "button_text")
        public String buttonText;
        public boolean enabled;
        @JSONField(name = "subtitle")
        public String subTitle;
        public String title;
        public int type;
    }

    public static class Next implements Serializable {
        @JSONField(name = "join_tenant")
        public JoinTenantChooseInfo joinTenant;
        @JSONField(name = "official_email")
        public OfficialEmailStepInfo officialEmailStepInfo;
        @JSONField(name = "tenant_create")
        public TenantCreateStepInfo tenantCreateStepInfo;
        @JSONField(name = "tenant_upgrade")
        public TenantUpgradeStepInfo tenantUpgradeStepInfo;
    }
}
