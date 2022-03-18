package com.ss.lark.android.passport.biz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import java.io.Serializable;
import java.util.List;

public class AuthTypeStepInfo implements Serializable {
    @JSONField(name = "auth_type_list")
    public List<ButtonInfo> authTypeList;
    @JSONField(name = "subtitle")
    public String subTitle;
    @JSONField(name = "target_tenant_icon")
    public String targetTenantIcon;
    public String title;

    public String getSubTitle() {
        return this.subTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public List<ButtonInfo> getTypeList() {
        return this.authTypeList;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTypeList(List<ButtonInfo> list) {
        this.authTypeList = list;
    }
}
