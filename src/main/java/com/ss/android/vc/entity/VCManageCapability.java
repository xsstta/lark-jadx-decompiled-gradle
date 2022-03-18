package com.ss.android.vc.entity;

import java.io.Serializable;

public class VCManageCapability implements Serializable {
    public boolean mForceGetSharePermission;
    public boolean mForceMuteMicrophone;
    public boolean mOnlyPresenterCanAnnotate;
    public boolean mSharePermission;
    public boolean mVCLobby;

    public boolean isForceGetSharePermission() {
        return this.mForceGetSharePermission;
    }

    public boolean isForceMuteMicrophone() {
        return this.mForceMuteMicrophone;
    }

    public boolean isOnlyPresenterCanAnnotate() {
        return this.mOnlyPresenterCanAnnotate;
    }

    public boolean isSharePermission() {
        return this.mSharePermission;
    }

    public boolean isVCLobby() {
        return this.mVCLobby;
    }

    public String toString() {
        return "VCManageCapability{mVCLobby=" + this.mVCLobby + ", mForceMuteMicrophone=" + this.mForceMuteMicrophone + ", mSharePermission=" + this.mSharePermission + ", mForceGetSharePermission=" + this.mForceGetSharePermission + ", mOnlyPresenterCanAnnotate=" + this.mOnlyPresenterCanAnnotate + '}';
    }
}
