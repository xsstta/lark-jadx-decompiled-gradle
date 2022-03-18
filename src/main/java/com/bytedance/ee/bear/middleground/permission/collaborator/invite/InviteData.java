package com.bytedance.ee.bear.middleground.permission.collaborator.invite;

import com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity;
import com.bytedance.ee.util.io.NonProguard;
import java.util.List;

public class InviteData implements NonProguard {
    public List<NotNotifyUserEntity> addFailedUsers;
    public List<NotNotifyUserEntity> blockUsers;
    public List<NotNotifyUserEntity> blockedUsers;
    public int limitNum;
    public List<NotNotifyUserEntity> limitUsers;
    public String linkToken;
    public List<NotNotifyUserEntity> notNotifyUsers;
    public String notificationId;
    public List<NotNotifyUserEntity> phoneLimitUsers;
    public List<NotNotifyUserEntity> privacyUsers;
    public String spaceId;

    public String toString() {
        return "InviteData{spaceId='" + this.spaceId + '\'' + ", linkToken='" + this.linkToken + '\'' + '}';
    }
}
