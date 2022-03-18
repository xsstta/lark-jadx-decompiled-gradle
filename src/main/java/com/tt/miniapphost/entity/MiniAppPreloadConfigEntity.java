package com.tt.miniapphost.entity;

import com.tt.miniapphost.appbase.listener.MiniAppPreloadStateListener;

public class MiniAppPreloadConfigEntity {
    private boolean mCancelPreloadWhenNotWifi = true;
    private MiniAppPreloadStateListener mPreloadStateListener;

    public MiniAppPreloadStateListener getPreloadStateListener() {
        return this.mPreloadStateListener;
    }

    public boolean isCancelPreloadWhenNotWifi() {
        return this.mCancelPreloadWhenNotWifi;
    }

    public void setCancelPreloadWhenNotWifi(boolean z) {
        this.mCancelPreloadWhenNotWifi = z;
    }

    public void setPreloadStateListener(MiniAppPreloadStateListener miniAppPreloadStateListener) {
        this.mPreloadStateListener = miniAppPreloadStateListener;
    }
}
