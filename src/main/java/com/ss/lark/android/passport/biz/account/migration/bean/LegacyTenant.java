package com.ss.lark.android.passport.biz.account.migration.bean;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class LegacyTenant implements Serializable {
    @JSONField(name = "icon_url")
    public String iconUrl;
    public String name;
    public int status;
    @JSONField(name = "suite_full_domain")
    public String suiteFullDomain;
    public int tag;
    @JSONField(name = "tenant_domain")
    public String tenantDomain;
    @JSONField(name = "tenant_id")
    public String tenantId;
    @JSONField(name = "tip")
    public String tenantTip;
    @JSONField(name = "unit_league")
    public String unitLeague;
}
