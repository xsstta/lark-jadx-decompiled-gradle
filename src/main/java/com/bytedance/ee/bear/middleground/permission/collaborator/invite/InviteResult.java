package com.bytedance.ee.bear.middleground.permission.collaborator.invite;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity;
import java.util.ArrayList;
import java.util.List;

public class InviteResult extends NetService.Result {
    String code;
    InviteData data;
    String msg;

    @Override // com.bytedance.ee.bear.contract.NetService.Result
    public InviteData getData() {
        return this.data;
    }

    public String getLinkToken() {
        InviteData inviteData = this.data;
        if (inviteData == null || inviteData.linkToken == null) {
            return "";
        }
        return this.data.linkToken;
    }

    public List<NotNotifyUserEntity> getNotNotifyUsers() {
        InviteData inviteData = this.data;
        if (inviteData == null || inviteData.notNotifyUsers == null) {
            return new ArrayList();
        }
        return this.data.notNotifyUsers;
    }

    public String getNotificationId() {
        InviteData inviteData = this.data;
        if (inviteData == null || inviteData.notificationId == null) {
            return "";
        }
        return this.data.notificationId;
    }

    public String getSpaceId() {
        InviteData inviteData = this.data;
        if (inviteData == null || inviteData.spaceId == null) {
            return "";
        }
        return this.data.spaceId;
    }

    public String toString() {
        return "InviteResult{msg='" + this.msg + '\'' + ", code='" + this.code + '\'' + '}';
    }
}
