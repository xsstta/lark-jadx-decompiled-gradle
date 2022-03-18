package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import java.io.Serializable;
import java.util.List;

public class SetUserInfoStepInfo extends BaseStepInfo implements Serializable {
    @JSONField(name = "credential_input_list")
    public List<CredentialInputItem> mCredentialInputList;
    @JSONField(name = "flow_type")
    public String mFlowType;
    @JSONField(name = "name_input")
    public Input mNameInput;
    @JSONField(name = "next_button")
    public ButtonInfo mNextButton;
    @JSONField(name = "privacy_policy")
    public String mPrivacyPolicy;
    @JSONField(name = ShareHitPoint.f121868c)
    public int mSource;
    @JSONField(name = "subtitle")
    public String mSubTitle;
    @JSONField(name = "tenant_unit_domain")
    public String mTenantUnitDomain;
    @JSONField(name = "title")
    public String mTitle;
    @JSONField(name = "unit")
    public String mUnit;

    public static class CredentialInputItem implements Serializable {
        @JSONField(name = "credential_input")
        public Input mCredentialInput;
        @JSONField(name = "credential_type")
        public int mCredentialType;
        @JSONField(name = "tab_name")
        public String mTabName;
    }

    public static class Input implements Serializable {
        @JSONField(name = "placeholder")
        public String mPlaceholder;
    }
}
