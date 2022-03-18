package com.ss.lark.android.passport.biz.feature.accountandsecurity.service.entity;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class ContactPointBean implements Serializable {
    @JSONField(name = "authentication_channel")
    public String authenticationChannel;
    @JSONField(name = "bind_cp")
    public boolean bindCp;
    public String contact;
    @JSONField(name = "country_code")
    public String countryCode;
    @JSONField(name = "cp_id")
    public String cpId;
    @JSONField(name = "credential_id")
    private String credentialId;
    @JSONField(name = "credential_name")
    public String credentialName;
    @JSONField(name = "can_delete")
    public boolean delete;
    @JSONField(name = "delete_need_verify")
    private boolean deleteNeedVerify;
    @JSONField(name = "display_name")
    public String displayName;
    @JSONField(name = "icon_url")
    public String iconUrl;
    @JSONField(name = "is_tenant_cp")
    public boolean isTenantCp;
    public String mobile;
    @JSONField(name = "can_modify")
    public boolean modify;
    @JSONField(name = "tenant_id")
    public String tenantId;
    @JSONField(name = "tenant_name")
    public String tenantName;
    public int type;
    @JSONField(name = "verified")
    private boolean verified;

    public String getAuthenticationChannel() {
        return this.authenticationChannel;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCpId() {
        return this.cpId;
    }

    public String getCredentialId() {
        return this.credentialId;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public String getTenantName() {
        return this.tenantName;
    }

    public int getType() {
        return this.type;
    }

    public boolean isBindCp() {
        return this.bindCp;
    }

    public boolean isCanDelete() {
        return this.delete;
    }

    public boolean isCanModify() {
        return this.modify;
    }

    public boolean isDelete() {
        return this.delete;
    }

    public boolean isDeleteNeedVerify() {
        return this.deleteNeedVerify;
    }

    public boolean isModify() {
        return this.modify;
    }

    public boolean isTenantCp() {
        return this.isTenantCp;
    }

    public boolean isVerified() {
        return this.verified;
    }

    public String getContact() {
        String str = this.contact;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getCredentialName() {
        String str = this.credentialName;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getDisplayName() {
        String str = this.displayName;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getMobile() {
        String str = this.mobile;
        if (str == null) {
            return "";
        }
        return str;
    }

    public void setAuthenticationChannel(String str) {
        this.authenticationChannel = str;
    }

    public void setContact(String str) {
        this.contact = str;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setCpId(String str) {
        this.cpId = str;
    }

    public void setCredentialId(String str) {
        this.credentialId = str;
    }

    public void setDelete(boolean z) {
        this.delete = z;
    }

    public void setDeleteNeedVerify(boolean z) {
        this.deleteNeedVerify = z;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public void setModify(boolean z) {
        this.modify = z;
    }

    public void setTenantCp(boolean z) {
        this.isTenantCp = z;
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }

    public void setTenantName(String str) {
        this.tenantName = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setVerified(boolean z) {
        this.verified = z;
    }
}
