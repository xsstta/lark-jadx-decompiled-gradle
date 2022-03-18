package com.ss.android.lark.passport.signinsdk_api.account;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class Tenant implements Serializable {
    @JSONField(name = "icon_url")
    public String iconUrl;
    public String name;
    @JSONField(name = "tenant_full_domain")
    public String suiteFullDomain;
    @JSONField(name = "tenant_tag")
    public int tag;
    @JSONField(name = "tenant_domain")
    public String tenantDomain;
    @JSONField(alternateNames = {"id"}, name = "tenant_id")
    public String tenantId;
}
