package com.bytedance.ee.bear.middleground.permission.collaborator.invite.existmember;

import com.bytedance.ee.bear.contract.NetService;
import java.util.List;

public class ExistMemberResult extends NetService.Result {
    private List<Member> existMembers;

    public List<Member> getExistMembers() {
        return this.existMembers;
    }

    public void setExistMembers(List<Member> list) {
        this.existMembers = list;
    }
}
