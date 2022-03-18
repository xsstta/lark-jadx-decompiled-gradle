package com.ss.android.lark.profile.dto;

import java.io.Serializable;

public class ProfileFinishResult implements Serializable {
    private static final long serialVersionUID = 3442091501736892805L;
    public boolean isBlocked;
    public boolean isFriend;
    public boolean isRequestUserApplied;
    public boolean isTargetUserApplied;
    public String userId;

    public ProfileFinishResult() {
    }

    public ProfileFinishResult(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.isBlocked = z;
        this.userId = str;
        this.isFriend = z2;
        this.isRequestUserApplied = z3;
        this.isTargetUserApplied = z4;
    }
}
