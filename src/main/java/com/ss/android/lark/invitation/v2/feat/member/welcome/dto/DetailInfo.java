package com.ss.android.lark.invitation.v2.feat.member.welcome.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b;
import java.io.Serializable;
import java.util.List;

public class DetailInfo implements C40516b.AbstractC40523b, Serializable {
    @JSONField(name = "code")
    private String detailCode;
    @JSONField(name = "i18n")
    private String detailInfo;

    @Override // com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.AbstractC40523b
    public List<C40516b.AbstractC40523b> getPickDatas() {
        return null;
    }

    public DetailInfo() {
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.AbstractC40523b
    public String getContent() {
        return this.detailInfo;
    }

    public String getDetailCode() {
        return this.detailCode;
    }

    public String getDetailInfo() {
        return this.detailInfo;
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.AbstractC40523b
    public String getKey() {
        return this.detailCode;
    }

    public void setDetailCode(String str) {
        this.detailCode = str;
    }

    public void setDetailInfo(String str) {
        this.detailInfo = str;
    }

    public DetailInfo(String str, String str2) {
        this.detailInfo = str;
        this.detailCode = str2;
    }
}
