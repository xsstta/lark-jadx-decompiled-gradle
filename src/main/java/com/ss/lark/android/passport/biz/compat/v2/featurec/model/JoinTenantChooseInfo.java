package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.android.lark.passport.infra.entity.MenuInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import com.ss.lark.android.passport.biz.entity.RegisterItem;
import java.io.Serializable;
import java.util.List;

public class JoinTenantChooseInfo extends BaseStepInfo implements Serializable {
    @JSONField(name = "dispatch_list")
    public List<MenuInfo> dispatchList;
    @JSONField(name = "flow_type")
    public String flowType;
    @JSONField(name = "register_button")
    public ButtonInfo registerButton;
    @JSONField(name = "register_item")
    public RegisterItem registerItem;
    @JSONField(name = "subtitle")
    public String subTitle;
    public String title;
}
