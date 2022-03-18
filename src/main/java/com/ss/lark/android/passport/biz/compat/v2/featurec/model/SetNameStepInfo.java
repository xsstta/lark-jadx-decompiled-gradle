package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.android.lark.passport.infra.entity.InputInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import java.io.Serializable;

public class SetNameStepInfo extends BaseStepInfo implements Serializable {
    @JSONField(name = "flow_type")
    public String flowType;
    public String name;
    @JSONField(name = "name_input")
    public InputInfo nameInput;
    @JSONField(name = "next_button")
    public ButtonInfo nextButton;
    @JSONField(name = "opt_title")
    public String optTitle;
    public String placeholder;
    @JSONField(name = "show_opt_in")
    public boolean showOptIn;
    @JSONField(name = "subtitle")
    public String subTitle;
    @JSONField(name = "tenant_id")
    public String tenantId;
    public String title;
    public int type;
}
