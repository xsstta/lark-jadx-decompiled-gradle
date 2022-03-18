package com.ss.lark.android.passport.biz.feature.account_center;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.lark.android.passport.biz.entity.UserItem;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class UserOperationCenterInfo extends BaseStepInfo implements Serializable {
    @JSONField(name = "create_tenant_step")
    public BaseStepData createTeam;
    @JSONField(name = "credential_binding_identities")
    public List<IdentityBindUserList> credentialBindingIdentities;
    @JSONField(name = "current_identity")
    public IdentityBindUserList currentIdentity;
    @JSONField(name = "join_tenant_step")
    public BaseStepData joinTeam;
    @JSONField(name = "login_step")
    public BaseStepData loginStep;
    @JSONField(name = "official_email_tenant_map")
    public Map<String, List<ResponseTenant>> officialEmailList;
    @JSONField(name = "personal_use_step")
    public BaseStepData personalStep;

    public static class IdentityBindUserList implements Serializable {
        @JSONField(name = "credential")
        public ResponseCredential credential;
        @JSONField(name = "user_list")
        public List<UserItem> userItemList;
    }

    public static class ResponseTenant implements Serializable {
        @JSONField(name = "icon_url")
        public String iconUrl;
        public String id;
        public String name;
    }

    public static class ResponseCredential implements Serializable {
        @JSONField(name = "country_code")
        public String countryCode;
        public String credential;
        @JSONField(name = "credential_id")
        public String credentialId;
        @JSONField(name = "credential_type")
        public int credentialType;

        public ResponseCredential() {
        }

        public ResponseCredential(ResponseCredential responseCredential) {
            this.countryCode = responseCredential.countryCode;
            this.credential = responseCredential.credential;
            this.credentialId = responseCredential.credentialId;
            this.credentialType = responseCredential.credentialType;
        }
    }
}
