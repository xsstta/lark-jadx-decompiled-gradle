package com.ss.lark.android.passport.biz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.base.network.model.RsaInfo;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.android.lark.passport.infra.entity.InputInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import java.io.Serializable;

public class PwdSetPwdStepInfo extends BaseStepInfo implements Serializable {
    @JSONField(name = "confirm_pwd")
    public InputInfo confirmPwdConfig;
    @JSONField(name = "disable_back")
    public boolean disableBack;
    @JSONField(name = "flow_type")
    public String flowType;
    @JSONField(name = "format_err_text")
    public String formatErrorText;
    @JSONField(name = "from_recover_account")
    public boolean fromRecoverAccount;
    @JSONField(name = "next_button")
    public ButtonInfo nextButtonConfig;
    @JSONField(name = "pwd")
    public InputInfo pwdConfig;
    @JSONField(name = "reg_exp")
    public String regExp;
    @JSONField(name = "rsa_info")
    public RsaInfo rsaInfo;
    @JSONField(name = "skip_button")
    public ButtonInfo skipButtonConfig;
    @JSONField(name = "subtitle")
    public String subTitle;
    @JSONField(name = "title")
    public String title;
}
