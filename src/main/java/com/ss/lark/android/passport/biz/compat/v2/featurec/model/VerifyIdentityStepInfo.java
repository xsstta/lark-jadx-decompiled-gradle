package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.base.network.model.RsaInfo;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.android.lark.passport.infra.entity.InputInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

public class VerifyIdentityStepInfo extends BaseStepInfo implements Serializable {
    @JSONField(name = "back_to_feed")
    public boolean backToFeed;
    @JSONField(name = "default_verify_item")
    public String defaultVerifyItem;
    @JSONField(name = "verify_forget_code")
    public VerifyIdentifyBean forgetVerifyCode;
    @JSONField(name = "from_recover_account")
    public boolean fromRecoverAccount;
    @JSONField(name = "recover_account")
    public Map<String, Object> recoverAccountBean;
    @JSONField(name = "scope")
    public String scope;
    public String type;
    @JSONField(name = "verify_code")
    public VerifyIdentifyBean verifyCode;
    @JSONField(name = "verify_code_spare")
    public VerifyIdentifyBean verifyCodeSpare;
    @JSONField(name = "verify_otp")
    public VerifyIdentifyBean verifyOtp;
    @JSONField(name = "verify_pwd")
    public VerifyIdentifyBean verifyPwd;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FlowType {
    }

    public static class VerifyIdentifyBean implements Serializable {
        @JSONField(name = "code_button")
        public ButtonInfo code_button;
        @JSONField(name = "contact")
        public String contact = "";
        @JSONField(name = "flow_type")
        public String flowType;
        @JSONField(name = "forget_pwd_button")
        public ButtonInfo forget_pwd_button;
        @JSONField(name = "input_box")
        public InputInfo input_box;
        @JSONField(name = "next_button")
        public ButtonInfo next_button;
        @JSONField(name = "otp_button")
        public ButtonInfo otp_button;
        @JSONField(name = "pwd_button")
        public ButtonInfo pwd_button;
        @JSONField(name = "retrieve_button")
        public ButtonInfo retrieveButton;
        @JSONField(name = "rsa_info")
        public RsaInfo rsaInfo;
        @JSONField(name = "scope")
        public String scope;
        @JSONField(name = "spare_code_button")
        public ButtonInfo spare_code_button;
        @JSONField(name = "subtitle")
        public String subTitle;
        @JSONField(name = "title")
        public String title;
        @JSONField(name = "verify_code_tip")
        public String verifyCodeTip = "";

        public static class RetrieveInfo implements Serializable {
            @JSONField(name = "action")
            public int action;
        }
    }
}
