package com.ss.lark.android.passport.biz.compat.verify_code;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.base.network.model.RsaInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.MagicLinkStepInfo;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

public class VerifyIdentityStepInfo implements Serializable {
    @JSONField(name = "contact_type")
    public int contactType;
    @JSONField(name = "enable_change")
    public int enableChange;
    @JSONField(name = "forget_verify_code")
    public VerifyIdentifyBean forgetVerifyCode;
    public Next next;
    @JSONField(name = "recover_account")
    public Map<String, Object> recoverAccountBean;
    public String type;
    @JSONField(name = "verify_code")
    public VerifyIdentifyBean verifyCode;
    @JSONField(name = "verify_pwd")
    public VerifyIdentifyBean verifyPwd;

    public static class Next implements Serializable {
        @JSONField(name = "magic_link")
        public MagicLinkStepInfo magicLinkStepInfo;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SourceType {
    }

    public static class VerifyIdentifyBean implements Serializable {
        @JSONField(name = "contact")
        public String contact = "";
        @JSONField(name = "contact_type")
        public int contactType;
        @JSONField(name = "rsa_info")
        public RsaInfo rsaInfo;
        @JSONField(name = "scope")
        public String scope;
        @JSONField(name = "show_recover_account")
        public boolean showRecoverAccount;
        @JSONField(name = "source_type")
        public int sourceType;
        @JSONField(name = "subtitle")
        public String subTitle;
        @JSONField(name = "title")
        public String title;
        @JSONField(name = "verify_code_tip")
        public String verifyCodeTip = "";

        public boolean sourceTypeCantUse() {
            int i = this.sourceType;
            if (i == 1 || i == 2 || i == 3) {
                return false;
            }
            return true;
        }
    }

    public boolean isEnableMagicLink() {
        if ((this.enableChange & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean isEnableResetPwd() {
        if ((this.enableChange & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean isEnableVerifyCode() {
        if ((this.enableChange & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean isEnableVerifyPwd() {
        if ((this.enableChange & 1) != 0) {
            return true;
        }
        return false;
    }
}
