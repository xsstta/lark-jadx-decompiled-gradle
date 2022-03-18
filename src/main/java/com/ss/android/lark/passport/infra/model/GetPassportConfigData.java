package com.ss.android.lark.passport.infra.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.util.C49193h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetPassportConfigData implements Serializable {
    public ConfigBean feishu;
    public ConfigBean lark;

    public static class ConfigBean implements Serializable {
        @JSONField(name = "black_country_list")
        public List<String> blackCountryList = new ArrayList();
        @JSONField(name = "client_biz_config_list")
        public ClientBizConfigData clientBizConfigList;
        @JSONField(name = "client_config_list")
        public ClientConfigData clientConfigList;
        @JSONField(name = "default_host_domain")
        public String defaultHostDomain;
        @JSONField(name = "default_region_code")
        public String defaultRegionCode;
        @JSONField(name = "default_register_region_code")
        public String defaultRegisterRegionCode;
        @JSONField(name = "email_regex")
        public String emailRegex;
        @JSONField(name = "enable_captcha_id")
        public boolean enableCaptchaId;
        @JSONField(name = "enable_sec_captcha_id")
        public boolean enableCaptchaToken = true;
        @JSONField(name = "enable_email_register")
        public boolean enableEmailRegister;
        @JSONField(name = "enable_login_join_type")
        public boolean enableLoginJoinType;
        @JSONField(name = "enable_mobile_register")
        public boolean enableMobileRegister;
        @JSONField(name = "enable_region_code_change")
        public boolean enableRegionCodeChange;
        @JSONField(name = "enable_register_join_type")
        public boolean enableRegisterJoinType;
        @JSONField(name = "host_domains")
        public List<String> hostDomains = new ArrayList();
        @JSONField(name = "idp_switch")
        public IdpSwitchData idpSwitchData;
        @JSONField(name = "sso_help_url")
        public Map<String, String> ssoHelpUrlMap = new HashMap();
        @JSONField(name = "top_country_list")
        public List<String> topCountryList = new ArrayList();

        public static ArrayList<String> getFeishuDomain() {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("feishu.cn");
            return arrayList;
        }

        public static ArrayList<String> getLarkDomain() {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("larksuite.com");
            return arrayList;
        }

        public List<String> getJoinTeamHostWhitelist() {
            ClientBizConfigData clientBizConfigData = this.clientBizConfigList;
            if (clientBizConfigData == null || C49193h.m193948a(clientBizConfigData.joinTeamHostWhitelist)) {
                return new ArrayList();
            }
            return this.clientBizConfigList.joinTeamHostWhitelist;
        }

        public OneKeyAuthConfigData getOneKeyAuthData() {
            ClientBizConfigData clientBizConfigData = this.clientBizConfigList;
            if (clientBizConfigData == null || clientBizConfigData.oneKeyAuth == null) {
                return new OneKeyAuthConfigData();
            }
            return this.clientBizConfigList.oneKeyAuth;
        }

        public ConfigBean() {
        }

        public void copyNullableParams(ArrayList<String> arrayList) {
            List<String> list = this.hostDomains;
            if (list == null || list.isEmpty()) {
                this.hostDomains = arrayList;
            }
        }

        public ConfigBean(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str3, ArrayList<String> arrayList, String str4, IdpSwitchData idpSwitchData2, ClientConfigData clientConfigData, ClientBizConfigData clientBizConfigData) {
            this.defaultRegionCode = str;
            this.defaultRegisterRegionCode = str2;
            this.enableLoginJoinType = z;
            this.enableRegisterJoinType = z2;
            this.enableRegionCodeChange = z3;
            this.enableMobileRegister = z4;
            this.enableEmailRegister = z5;
            this.emailRegex = str3;
            this.enableCaptchaId = false;
            this.enableCaptchaToken = true;
            this.hostDomains = arrayList;
            this.defaultHostDomain = str4;
            this.idpSwitchData = idpSwitchData2;
            this.clientConfigList = clientConfigData;
            this.clientBizConfigList = clientBizConfigData;
        }
    }
}
