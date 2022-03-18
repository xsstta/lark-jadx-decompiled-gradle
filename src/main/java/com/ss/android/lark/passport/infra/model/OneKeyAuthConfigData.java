package com.ss.android.lark.passport.infra.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class OneKeyAuthConfigData implements Serializable {
    public static boolean DEFAULT_ONEKEY_SECURITY_SCAN = true;
    @JSONField(name = "enable_onekey_login")
    public boolean enableOnekeyLogin = true;
    @JSONField(name = "enable_onekey_security_scan")
    public boolean enableOnekeySecurityScan = DEFAULT_ONEKEY_SECURITY_SCAN;
    @JSONField(name = "enable_update_onekey_setting")
    public boolean enableUpdateOnekeySetting = false;
    @JSONField(name = "policy_urls")
    public PolicyUrls policyUrls = new PolicyUrls("https://wap.cmpassport.com/resources/html/contract.html", "https://e.189.cn/sdk/agreement/detail.do?hidetop=true", "https://opencloud.wostore.cn/authz/resource/html/disclaimer.html?fromsdk=true");
    @JSONField(name = "sdk_config")
    public Config sdkConfig = new Config();

    public static class PolicyUrls implements Serializable {
        public String mobile;
        public String telecom;
        public String unicom;

        public PolicyUrls() {
        }

        public String toString() {
            return "PolicyUrls{mobile='" + this.mobile + '\'' + ", telecom='" + this.telecom + '\'' + ", unicom='" + this.unicom + '\'' + '}';
        }

        public String getPolicyUrlByNetType(String str) {
            if (str.equals("unicom")) {
                return this.unicom;
            }
            if (str.equals("telecom")) {
                return this.telecom;
            }
            return this.mobile;
        }

        public PolicyUrls(String str, String str2, String str3) {
            this.mobile = str;
            this.telecom = str2;
            this.unicom = str3;
        }
    }

    public static class Config implements Serializable {
        @JSONField(name = "onekey_login_config")
        public AuthConfig authConfig = new AuthConfig();

        public static class AuthConfig implements Serializable {
            @JSONField(name = "cm_config")
            public OpConfig cmConfig = new OpConfig();
            @JSONField(name = "ct_config")
            public OpConfig ctConfig = new OpConfig();
            @JSONField(name = "cu_config")
            public OpConfig cuConfig = new OpConfig();

            public String toString() {
                return "AuthConfig{cmConfig=" + this.cmConfig + ", cuConfig=" + this.cuConfig + ", ctConfig=" + this.ctConfig + '}';
            }
        }

        public static class OpConfig implements Serializable {
            @JSONField(name = "is_enable")
            public int isEnable = 1;
            @JSONField(name = "need_data")
            public int needData = 1;
            @JSONField(name = "timeout_sec")
            public int timeoutSec = 3;

            public String toString() {
                return "OpConfig{isEnable=" + this.isEnable + ", needData=" + this.needData + ", timeoutSec=" + this.timeoutSec + '}';
            }
        }

        public String toString() {
            return "Config{sdkConfig='" + this.authConfig.toString() + '\'' + '}';
        }
    }

    public OneKeyAuthConfigData() {
    }

    public String toString() {
        return "OneKeyAuthConfigData{sdkConfig=" + this.sdkConfig.toString() + ", policyUrls=" + this.policyUrls.toString() + ", enableOnekeyLogin=" + this.enableOnekeyLogin + ", enableUpdateOnekeySetting=" + this.enableUpdateOnekeySetting + ", enableOnekeySecurityScan=" + this.enableOnekeySecurityScan + '}';
    }

    public OneKeyAuthConfigData(Config config, PolicyUrls policyUrls2) {
        this.sdkConfig = config;
        this.policyUrls = policyUrls2;
    }
}
