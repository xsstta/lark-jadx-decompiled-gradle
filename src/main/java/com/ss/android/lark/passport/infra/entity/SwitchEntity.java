package com.ss.android.lark.passport.infra.entity;

import com.ss.android.lark.passport.infra.service.IUserService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import java.io.Serializable;

public class SwitchEntity implements Serializable {
    private String customLoadingText;
    private boolean isSwitchAnimationNeed;
    private NextValidInfo nextValidInfo;
    private int switchReason;
    private User targetUser;
    private String targetUserId;

    public String getCustomLoadingText() {
        return this.customLoadingText;
    }

    public NextValidInfo getNextValidInfo() {
        return this.nextValidInfo;
    }

    public int getSwitchReason() {
        return this.switchReason;
    }

    public User getTargetUser() {
        return this.targetUser;
    }

    public String getTargetUserId() {
        return this.targetUserId;
    }

    public boolean isSwitchAnimationNeed() {
        return this.isSwitchAnimationNeed;
    }

    public void setTargetUser(User user) {
        this.targetUser = user;
    }

    public void setTargetUserId(String str) {
        this.targetUserId = str;
    }

    public SwitchEntity(User user, int i, boolean z) {
        this(user, i, z, (String) null);
    }

    public SwitchEntity(String str, int i, boolean z) {
        this(str, i, z, (String) null);
    }

    public SwitchEntity(User user, int i, boolean z, String str) {
        String str2;
        this.targetUser = user;
        if (user == null) {
            str2 = "";
        } else {
            str2 = user.userId;
        }
        this.targetUserId = str2;
        this.switchReason = i;
        this.isSwitchAnimationNeed = z;
        this.customLoadingText = str;
    }

    public SwitchEntity(String str, int i, boolean z, String str2) {
        this(str, i, z, str2, new NextValidInfo(0, false));
    }

    public SwitchEntity(String str, int i, boolean z, String str2, NextValidInfo nextValidInfo2) {
        IUserService a = ServiceFinder.m193745a(str);
        if (a != null) {
            this.targetUser = a.mo171597e();
        }
        this.targetUserId = str;
        this.switchReason = i;
        this.isSwitchAnimationNeed = z;
        this.customLoadingText = str2;
        this.nextValidInfo = nextValidInfo2;
    }
}
