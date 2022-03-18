package com.ss.android.lark.invitation.v2.feat.member.welcome.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class IndustryInfo implements C40516b.AbstractC40523b, Serializable {
    @JSONField(name = "children")
    private List<DetailInfo> detail;
    @JSONField(name = "i18n")
    private String industry;
    @JSONField(name = "code")
    private String industryCode;

    public IndustryInfo() {
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.AbstractC40523b
    public String getContent() {
        return this.industry;
    }

    public List<DetailInfo> getDetail() {
        return this.detail;
    }

    public String getIndustry() {
        return this.industry;
    }

    public String getIndustryCode() {
        return this.industryCode;
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.AbstractC40523b
    public String getKey() {
        return this.industryCode;
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.AbstractC40523b
    public List<C40516b.AbstractC40523b> getPickDatas() {
        if (this.detail == null) {
            return null;
        }
        return new ArrayList(this.detail);
    }

    public void setDetail(List<DetailInfo> list) {
        this.detail = list;
    }

    public void setIndustry(String str) {
        this.industry = str;
    }

    public void setIndustryCode(String str) {
        this.industryCode = str;
    }

    public IndustryInfo(String str, String str2, List<DetailInfo> list) {
        this.industry = str;
        this.industryCode = str2;
        this.detail = list;
    }
}
