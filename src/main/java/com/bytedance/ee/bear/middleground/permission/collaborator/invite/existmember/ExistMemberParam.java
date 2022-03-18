package com.bytedance.ee.bear.middleground.permission.collaborator.invite.existmember;

import com.bytedance.ee.util.io.NonProguard;
import java.util.List;

public class ExistMemberParam implements NonProguard {
    private List<Member> members;
    private String token;
    private int type;

    public ExistMemberParam() {
    }

    public List<Member> getMembers() {
        return this.members;
    }

    public String getToken() {
        return this.token;
    }

    public int getType() {
        return this.type;
    }

    public void setMembers(List<Member> list) {
        this.members = list;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public ExistMemberParam(int i, String str, List<Member> list) {
        this.type = i;
        this.token = str;
        this.members = list;
    }
}
