package com.bytedance.ee.bear.middleground.permission.collaborator.invite.existmember;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.util.io.NonProguard;

public class Member implements NonProguard {
    @JSONField(name = "member_id")
    private String memberId;
    @JSONField(name = "member_type")
    private int memberType;

    public Member() {
    }

    public String getMemberId() {
        return this.memberId;
    }

    public int getMemberType() {
        return this.memberType;
    }

    public String toString() {
        return "Member{memberType=" + this.memberType + ", memberId='" + this.memberId + '\'' + '}';
    }

    public void setMemberId(String str) {
        this.memberId = str;
    }

    public void setMemberType(int i) {
        this.memberType = i;
    }

    public Member(int i, String str) {
        this.memberType = i;
        this.memberId = str;
    }
}
