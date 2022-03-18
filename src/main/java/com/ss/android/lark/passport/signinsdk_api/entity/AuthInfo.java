package com.ss.android.lark.passport.signinsdk_api.entity;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;

public class AuthInfo implements Serializable {
    @JSONField(name = "app_icon")
    public String appIcon;
    @JSONField(name = "app_name")
    public String appName;
    public String button;
    public List<ButtonInfo> buttonList;
    @JSONField(name = "identity_title")
    public String identityTitle;
    @JSONField(name = "permission_scopes")
    public List<PermissionScope> permissionScopes;
    @JSONField(name = "scope_title")
    public String scopeTitle;
    @JSONField(name = "subtitle")
    public String subTitle;
}
