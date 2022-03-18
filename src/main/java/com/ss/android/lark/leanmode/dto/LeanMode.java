package com.ss.android.lark.leanmode.dto;

import com.ss.android.lark.log.Log;
import java.io.Serializable;

public class LeanMode implements Serializable, Cloneable {
    private boolean mHasAuthority;
    private boolean mIsAllDevicesInLeanMode;
    private boolean mIsDeviceInLeanMode;
    private boolean mIsOtherCloseableDevicesInLeanMode;
    private boolean mIsOtherDevicesInLeanMode;
    private String mUpdateTime;

    public String getUpdateTime() {
        return this.mUpdateTime;
    }

    public boolean hasAuthority() {
        return this.mHasAuthority;
    }

    public boolean isAllDevicesInLeanMode() {
        return this.mIsAllDevicesInLeanMode;
    }

    public boolean isDeviceInLeanMode() {
        return this.mIsDeviceInLeanMode;
    }

    public boolean isOtherCloseableDevicesInLeanMode() {
        return this.mIsOtherCloseableDevicesInLeanMode;
    }

    public boolean isOtherDevicesInLeanMode() {
        return this.mIsOtherDevicesInLeanMode;
    }

    public long getLongUpdateTime() {
        try {
            return Long.parseLong(this.mUpdateTime);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // java.lang.Object
    public LeanMode clone() {
        try {
            return (LeanMode) super.clone();
        } catch (CloneNotSupportedException e) {
            Log.m165383e("TAG", "failed to clone LeanMode. e:" + e);
            return null;
        }
    }

    public String toString() {
        return "mHasAuthority:" + this.mHasAuthority + ", mIsAllDevicesInLeanMode:" + this.mIsAllDevicesInLeanMode + ", mIsDeviceInLeanMode:" + this.mIsDeviceInLeanMode + ", mIsOtherCloseableDevicesInLeanMode:" + this.mIsOtherCloseableDevicesInLeanMode + ", mIsOtherDevicesInLeanMode:" + this.mIsOtherDevicesInLeanMode + ", mUpdateTime:" + this.mUpdateTime;
    }

    public void setAllDevicesInLeanMode(boolean z) {
        this.mIsAllDevicesInLeanMode = z;
    }

    public void setAuthority(boolean z) {
        this.mHasAuthority = z;
    }

    public void setDeviceInLeanMode(boolean z) {
        this.mIsDeviceInLeanMode = z;
    }

    public void setOtherCloseableDevicesInLeanMode(boolean z) {
        this.mIsOtherCloseableDevicesInLeanMode = z;
    }

    public void setOtherDevicesInLeanMode(boolean z) {
        this.mIsOtherDevicesInLeanMode = z;
    }

    public void setUpdateTime(String str) {
        this.mUpdateTime = str;
    }

    public boolean isSameMode(LeanMode leanMode) {
        if (leanMode != null && this.mIsDeviceInLeanMode == leanMode.isDeviceInLeanMode()) {
            return true;
        }
        return false;
    }

    public LeanMode getUpdatedLeanMode(LeanMode leanMode) {
        if (leanMode == null) {
            return this;
        }
        if (leanMode.getLongUpdateTime() != 0 && !leanMode.greaterThan(this)) {
            return this;
        }
        return leanMode;
    }

    public boolean greaterThan(LeanMode leanMode) {
        if (leanMode != null && getLongUpdateTime() - leanMode.getLongUpdateTime() < 0) {
            return false;
        }
        return true;
    }
}
