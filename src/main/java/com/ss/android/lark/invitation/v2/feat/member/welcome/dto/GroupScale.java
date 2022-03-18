package com.ss.android.lark.invitation.v2.feat.member.welcome.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b;
import java.io.Serializable;
import java.util.List;

public class GroupScale implements C40516b.AbstractC40523b, Serializable {
    @JSONField(name = "code")
    private String code;
    @JSONField(name = "i18n")
    private String scale;

    @Override // com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.AbstractC40523b
    public List<C40516b.AbstractC40523b> getPickDatas() {
        return null;
    }

    public GroupScale() {
    }

    public String getCode() {
        return this.code;
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.AbstractC40523b
    public String getContent() {
        return this.scale;
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.AbstractC40523b
    public String getKey() {
        return this.code;
    }

    public String getScale() {
        return this.scale;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setScale(String str) {
        this.scale = str;
    }

    public GroupScale(String str, String str2) {
        this.scale = str;
        this.code = str2;
    }
}
