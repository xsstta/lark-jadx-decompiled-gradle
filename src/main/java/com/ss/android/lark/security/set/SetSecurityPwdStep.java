package com.ss.android.lark.security.set;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;

public class SetSecurityPwdStep extends BaseStepInfo {
    @JSONField(name = "confirm_sub_title")
    private String confirmSubTitle;
    @JSONField(name = "confirm_title")
    private String confirmTitle;
    @JSONField(name = "flow_type")
    private String flowType;
    @JSONField(name = "next_button")
    private ButtonInfo nextButton;
    @JSONField(name = "subtitle")
    private String subtitle;
    @JSONField(name = "title")
    private String title;

    public String getConfirmSubTitle() {
        return this.confirmSubTitle;
    }

    public String getConfirmTitle() {
        return this.confirmTitle;
    }

    public String getFlowType() {
        return this.flowType;
    }

    public ButtonInfo getNextButton() {
        return this.nextButton;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public String getTitle() {
        return this.title;
    }

    public void setConfirmSubTitle(String str) {
        this.confirmSubTitle = str;
    }

    public void setConfirmTitle(String str) {
        this.confirmTitle = str;
    }

    public void setFlowType(String str) {
        this.flowType = str;
    }

    public void setNextButton(ButtonInfo buttonInfo) {
        this.nextButton = buttonInfo;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
