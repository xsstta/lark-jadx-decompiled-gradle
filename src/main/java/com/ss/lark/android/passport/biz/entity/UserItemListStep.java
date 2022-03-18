package com.ss.lark.android.passport.biz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import java.io.Serializable;
import java.util.List;

public class UserItemListStep extends BaseStepInfo implements Serializable {
    @JSONField(name = "flow_type")
    public String flowType;
    @JSONField(name = "group_list")
    public List<UserItemGroup> groupList;
    @JSONField(name = "join_button")
    public ButtonInfo joinButton;
    @JSONField(name = "register_button")
    public ButtonInfo registerButton;
    @JSONField(name = "register_item")
    public RegisterItem registerItem;
    public String title;
}
