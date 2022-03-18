package com.bytedance.ee.bear.middleground.permission.collaborator;

import com.bytedance.ee.bear.contract.NetService;
import java.util.List;

public class NotNotifyUserResult extends NetService.Result {
    private List<NotNotifyUserEntity> notNotifyUsers;

    public List<NotNotifyUserEntity> getNotNotifyUsers() {
        return this.notNotifyUsers;
    }

    public void setNotNotifyUsers(List<NotNotifyUserEntity> list) {
        this.notNotifyUsers = list;
    }
}
