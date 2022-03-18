package com.ss.android.lark.passport.signinsdk_api.entity;

import java.io.Serializable;

public class Tenant implements Serializable {
    private static final long serialVersionUID = -92609727225209513L;
    private String address;
    private String contactEmail;
    private String contactMobile;
    private String contactName;
    private String domain;
    private String iconUrl;
    private String id;
    private String name;
    private String postCode;
    private String remark;
    private String suiteFullDomain;
    private String telephone;
    private String unitLeague;

    public String getAddress() {
        return this.address;
    }

    public String getContactEmail() {
        return this.contactEmail;
    }

    public String getContactMobile() {
        return this.contactMobile;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getDomain() {
        return this.domain;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPostCode() {
        return this.postCode;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public String getUnitLeague() {
        return this.unitLeague;
    }

    public String getSuiteFullDomain() {
        String str = this.suiteFullDomain;
        if (str == null) {
            return "";
        }
        return str;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setContactEmail(String str) {
        this.contactEmail = str;
    }

    public void setContactMobile(String str) {
        this.contactMobile = str;
    }

    public void setContactName(String str) {
        this.contactName = str;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPostCode(String str) {
        this.postCode = str;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    public void setSuiteFullDomain(String str) {
        this.suiteFullDomain = str;
    }

    public void setTelephone(String str) {
        this.telephone = str;
    }

    public void setUnitLeague(String str) {
        this.unitLeague = str;
    }
}
