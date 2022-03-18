package com.ss.android.lark.profile.func.profile_setting;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingFinishResult;", "Ljava/io/Serializable;", "isDeleted", "", "isBlocked", "(ZZ)V", "()Z", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ProfileSettingFinishResult implements Serializable {
    private final boolean isBlocked;
    private final boolean isDeleted;

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public ProfileSettingFinishResult(boolean z, boolean z2) {
        this.isDeleted = z;
        this.isBlocked = z2;
    }
}
