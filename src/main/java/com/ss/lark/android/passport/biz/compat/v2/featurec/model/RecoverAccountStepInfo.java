package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.android.lark.passport.infra.entity.InputInfo;
import java.io.Serializable;

public class RecoverAccountStepInfo extends BaseStepInfo implements Serializable {
    @JSONField(name = "appeal_url")
    private String appealUrl;
    @JSONField(name = "bottom_hint")
    private String bottomHint;
    @JSONField(name = "flow_type")
    private String flowType;
    @JSONField(name = "id_input")
    private InputInfo idInput;
    @JSONField(name = "name_input")
    private InputInfo nameInput;
    @JSONField(name = "policy_describe_prefix")
    private String policyDescribePrefix;
    @JSONField(name = "policy_domain")
    private String policyDomain;
    @JSONField(name = "policy_name")
    private String policyName;
    @JSONField(name = "public_key")
    private String publicKey;
    @JSONField(name = "rsa_token")
    private String rsaToken;
    @JSONField(name = "sub_tile")
    private String subTile;
    @JSONField(name = "title")
    private String title;

    public String getAppealUrl() {
        return this.appealUrl;
    }

    public String getBottomHint() {
        return this.bottomHint;
    }

    public String getFlowType() {
        return this.flowType;
    }

    public InputInfo getIdInput() {
        return this.idInput;
    }

    public InputInfo getNameInput() {
        return this.nameInput;
    }

    public String getPolicyDescribePrefix() {
        return this.policyDescribePrefix;
    }

    public String getPolicyDomain() {
        return this.policyDomain;
    }

    public String getPolicyName() {
        return this.policyName;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public String getRsaToken() {
        return this.rsaToken;
    }

    public String getSubTile() {
        return this.subTile;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAppealUrl(String str) {
        this.appealUrl = str;
    }

    public void setBottomHint(String str) {
        this.bottomHint = str;
    }

    public void setFlowType(String str) {
        this.flowType = str;
    }

    public void setIdInput(InputInfo inputInfo) {
        this.idInput = inputInfo;
    }

    public void setNameInput(InputInfo inputInfo) {
        this.nameInput = inputInfo;
    }

    public void setPolicyDescribePrefix(String str) {
        this.policyDescribePrefix = str;
    }

    public void setPolicyDomain(String str) {
        this.policyDomain = str;
    }

    public void setPolicyName(String str) {
        this.policyName = str;
    }

    public void setPublicKey(String str) {
        this.publicKey = str;
    }

    public void setRsaToken(String str) {
        this.rsaToken = str;
    }

    public void setSubTile(String str) {
        this.subTile = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
