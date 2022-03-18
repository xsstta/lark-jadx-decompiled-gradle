package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.TenantCreateStepInfo;
import java.io.Serializable;
import java.util.List;

public class TenantUpgradeStepInfo extends BaseStepInfo implements Serializable {
    @JSONField(name = "enable_fields")
    public int enableFields;
    @JSONField(name = "industry_type_list")
    public List<TenantCreateStepInfo.IndustryTypeList> industryTypeList;
    public String placeholder;
    @JSONField(name = "staff_size_list")
    public List<TenantCreateStepInfo.CommonList> staffSizeList;
    @JSONField(name = "subtitle")
    public String subTitle;
    @JSONField(name = "tenant_name")
    public String tenantName;
    public String title;

    public boolean isShowIndustryType() {
        if ((this.enableFields & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean isShowStaffSize() {
        if ((this.enableFields & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean isShowTenantName() {
        if ((this.enableFields & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isShowUserName() {
        if ((this.enableFields & 2) != 0) {
            return true;
        }
        return false;
    }
}
