package com.ss.android.lark.security.api;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.android.lark.passport.infra.entity.InputInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;

public class VerifySecurityPwdStep extends BaseStepInfo {
    @JSONField(name = "flow_type")
    private String flowType;
    @JSONField(name = "forget_sec_pwd_button")
    private ButtonInfo forgetSecPwdButton;
    @JSONField(name = "input_box")
    private InputInfo inputBox;
    @JSONField(name = "next_button")
    private ButtonInfo nextButton;
    @JSONField(name = "subtitle")
    private String subtitle;
    @JSONField(name = "title")
    private String title;
    @JSONField(name = "use_package_domain")
    private boolean usePackageDomain;

    public String getFlowType() {
        return this.flowType;
    }

    public ButtonInfo getForgetSecPwdButton() {
        return this.forgetSecPwdButton;
    }

    public InputInfo getInputBox() {
        return this.inputBox;
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

    public boolean isUsePackageDomain() {
        return this.usePackageDomain;
    }

    public void setFlowType(String str) {
        this.flowType = str;
    }

    public void setForgetSecPwdButton(ButtonInfo buttonInfo) {
        this.forgetSecPwdButton = buttonInfo;
    }

    public void setInputBox(InputInfo inputInfo) {
        this.inputBox = inputInfo;
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

    public void setUsePackageDomain(boolean z) {
        this.usePackageDomain = z;
    }
}
