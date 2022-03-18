package com.ss.lark.android.passport.biz.account.migration.bean;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LegacyAccountSecurityConfig implements Serializable {
    @JSONField(name = "module_account_management")
    public ModuleConfig moduleAccountManagement;
    @JSONField(name = "module_device_management")
    public ModuleConfig moduleDeviceManagement;
    @JSONField(name = "module_bio_auth_login")
    public ModuleConfig moduleFaceLogIn;
    @JSONField(name = "module_bio_auth")
    public ModuleConfig moduleFaceRecognition;
    @JSONField(name = "module_modify_pwd")
    public ModuleConfig moduleModifyPwd;
    @JSONField(name = "module_security_verification")
    public ModuleConfig moduleSecurityVerification;
    @JSONField(name = "module_2fa")
    public ModuleConfig moduleTwoFa;

    public static class ModuleConfig implements Serializable {
        @JSONField(name = "module_info")
        public ModuleInfo moduleInfo;
        @JSONField(name = "switch_status")
        public int switchStatus;
    }

    public static class ModuleInfo implements Serializable {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SwitchStatusEnum {
    }

    public boolean showModule(String str) {
        ModuleConfig moduleConfig;
        if ("module_modify_pwd".equals(str)) {
            moduleConfig = this.moduleModifyPwd;
        } else if ("module_account_management".equals(str)) {
            moduleConfig = this.moduleAccountManagement;
        } else if ("module_security_verification".equals(str)) {
            moduleConfig = this.moduleSecurityVerification;
        } else if ("module_device_management".equals(str)) {
            moduleConfig = this.moduleDeviceManagement;
        } else if ("module_2fa".equals(str)) {
            moduleConfig = this.moduleTwoFa;
        } else if ("module_bio_auth".equals(str)) {
            moduleConfig = this.moduleFaceRecognition;
        } else if ("module_bio_auth_login".equals(str)) {
            moduleConfig = this.moduleFaceLogIn;
        } else {
            moduleConfig = null;
        }
        if (moduleConfig == null || moduleConfig.switchStatus == 1) {
            return true;
        }
        return false;
    }
}
