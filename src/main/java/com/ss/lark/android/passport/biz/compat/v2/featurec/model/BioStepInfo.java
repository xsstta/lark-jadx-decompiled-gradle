package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import java.io.Serializable;

public class BioStepInfo extends BaseStepInfo implements Serializable {
    @JSONField(name = "code")
    public String idCode;
    @JSONField(name = "agree_doc")
    public String mAgreeDoc;
    @JSONField(name = "flow_type")
    public String mFlowType;
    @JSONField(name = "next_button")
    public ButtonInfo mNextButton;
    @JSONField(name = "subtitle")
    public String mSubTitle;
    @JSONField(name = "switch_button")
    public ButtonInfo mSwitchButton;
    @JSONField(name = "title")
    public String mTitle;
    @JSONField(name = "name")
    public String name;
}
